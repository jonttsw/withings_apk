package com.withings.library.authentication.sensitiveaction.impl;

import com.withings.library.authentication.api.account.AccountApi;
import com.withings.library.authentication.api.constant.ApiConstantProvider;
import com.withings.library.authentication.api.error.NetworkExceptionChecker;
import com.withings.library.authentication.api.session.SessionApi;
import com.withings.library.authentication.di.KoinKt;
import com.withings.library.authentication.host.app.ApplicationInformationProvider;
import com.withings.library.authentication.host.device.DeviceInformationProvider;
import com.withings.library.authentication.login.state.update.LoggedInUpdaterService;
import com.withings.library.authentication.sensitiveaction.factory.VerifiedSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction;
import com.withings.library.authentication.sensitiveaction.state.Sequence;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.jivesoftware.smack.packet.Session;
import pq0.a;
import qm0.d;
import v9.e;
/* compiled from: NeedCode2FASensitiveActionImpl.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\bK\u0010LJ\u0013\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0005J\u0013\u0010\u0010\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0005J#\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\fR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u001f\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u001f\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\u001f\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\u001f\u001a\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\u001f\u001a\u0004\bH\u0010I\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006M"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/impl/NeedCode2FASensitiveActionImpl;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction;", "Lpq0/a;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState$SuccessVerified;", "manageSuccessfulVerification", "(Lqm0/d;)Ljava/lang/Object;", "", "confirmationCode", "", "rememberDevice", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$CodeOutputState;", "injectCode", "(Ljava/lang/String;ZLqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$SMSOutputState;", "resendSMS", "Lcom/withings/library/authentication/sensitiveaction/state/NeedCode2FASensitiveAction$ChangePhoneOutputState;", "changePhoneNumber", "recoveryCode", "injectRecoveryCode", "Lcom/withings/library/authentication/sensitiveaction/state/Sequence;", "sequence", "Lcom/withings/library/authentication/sensitiveaction/state/Sequence;", "Lcom/withings/library/authentication/login/Session;", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "phoneNumber", "Ljava/lang/String;", "getPhoneNumber", "()Ljava/lang/String;", "Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi$delegate", "Lnm0/g;", "getAccountApi", "()Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi", "Lcom/withings/library/authentication/api/session/SessionApi;", "sessionApi$delegate", "getSessionApi", "()Lcom/withings/library/authentication/api/session/SessionApi;", "sessionApi", "Lcom/withings/library/authentication/sensitiveaction/factory/VerifiedSensitiveActionStateFactory;", "verifiedSensitiveActionStateFactory$delegate", "getVerifiedSensitiveActionStateFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/VerifiedSensitiveActionStateFactory;", "verifiedSensitiveActionStateFactory", "Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider$delegate", "getDeviceInformationProvider", "()Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider", "Lcom/withings/library/authentication/host/app/ApplicationInformationProvider;", "applicationInformationProvider$delegate", "getApplicationInformationProvider", "()Lcom/withings/library/authentication/host/app/ApplicationInformationProvider;", "applicationInformationProvider", "Lcom/withings/library/authentication/api/constant/ApiConstantProvider;", "apiConstantProvider$delegate", "getApiConstantProvider", "()Lcom/withings/library/authentication/api/constant/ApiConstantProvider;", "apiConstantProvider", "Lv9/e;", "log$delegate", "getLog", "()Lv9/e;", "log", "Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker$delegate", "getNetworkExceptionChecker", "()Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker", "Lcom/withings/library/authentication/login/state/update/LoggedInUpdaterService;", "loggedInUpdaterService$delegate", "getLoggedInUpdaterService", "()Lcom/withings/library/authentication/login/state/update/LoggedInUpdaterService;", "loggedInUpdaterService", "<init>", "(Lcom/withings/library/authentication/sensitiveaction/state/Sequence;Lcom/withings/library/authentication/login/Session;Ljava/lang/String;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedCode2FASensitiveActionImpl implements NeedCode2FASensitiveAction, a {
    private final g accountApi$delegate;
    private final g apiConstantProvider$delegate;
    private final g applicationInformationProvider$delegate;
    private final g deviceInformationProvider$delegate;
    private final g log$delegate;
    private final g loggedInUpdaterService$delegate;
    private final g networkExceptionChecker$delegate;
    private final String phoneNumber;
    private final Sequence sequence;
    private final com.withings.library.authentication.login.Session session;
    private final g sessionApi$delegate;
    private final g verifiedSensitiveActionStateFactory$delegate;

    public NeedCode2FASensitiveActionImpl(Sequence sequence, com.withings.library.authentication.login.Session session, String phoneNumber) {
        u.j(sequence, "sequence");
        u.j(session, "session");
        u.j(phoneNumber, "phoneNumber");
        this.sequence = sequence;
        this.session = session;
        this.phoneNumber = phoneNumber;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.accountApi$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FASensitiveActionImpl$special$$inlined$inject$default$1(this, null, null));
        this.sessionApi$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FASensitiveActionImpl$special$$inlined$inject$default$2(this, null, null));
        this.verifiedSensitiveActionStateFactory$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FASensitiveActionImpl$special$$inlined$inject$default$3(this, null, null));
        this.deviceInformationProvider$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FASensitiveActionImpl$special$$inlined$inject$default$4(this, null, null));
        this.applicationInformationProvider$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FASensitiveActionImpl$special$$inlined$inject$default$5(this, null, null));
        this.apiConstantProvider$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FASensitiveActionImpl$special$$inlined$inject$default$6(this, null, null));
        this.log$delegate = KoinKt.injectLogger(this, "NeedCode2FA");
        this.networkExceptionChecker$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FASensitiveActionImpl$special$$inlined$inject$default$7(this, null, null));
        this.loggedInUpdaterService$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FASensitiveActionImpl$special$$inlined$inject$default$8(this, null, null));
    }

    private final AccountApi getAccountApi() {
        return (AccountApi) this.accountApi$delegate.getValue();
    }

    private final ApiConstantProvider getApiConstantProvider() {
        return (ApiConstantProvider) this.apiConstantProvider$delegate.getValue();
    }

    private final ApplicationInformationProvider getApplicationInformationProvider() {
        return (ApplicationInformationProvider) this.applicationInformationProvider$delegate.getValue();
    }

    private final DeviceInformationProvider getDeviceInformationProvider() {
        return (DeviceInformationProvider) this.deviceInformationProvider$delegate.getValue();
    }

    private final e getLog() {
        return (e) this.log$delegate.getValue();
    }

    private final LoggedInUpdaterService getLoggedInUpdaterService() {
        return (LoggedInUpdaterService) this.loggedInUpdaterService$delegate.getValue();
    }

    private final NetworkExceptionChecker getNetworkExceptionChecker() {
        return (NetworkExceptionChecker) this.networkExceptionChecker$delegate.getValue();
    }

    private final SessionApi getSessionApi() {
        return (SessionApi) this.sessionApi$delegate.getValue();
    }

    private final VerifiedSensitiveActionStateFactory getVerifiedSensitiveActionStateFactory() {
        return (VerifiedSensitiveActionStateFactory) this.verifiedSensitiveActionStateFactory$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object manageSuccessfulVerification(qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.CodeOutputState.SuccessVerified> r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            boolean r2 = r1 instanceof com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl$manageSuccessfulVerification$1
            if (r2 == 0) goto L17
            r2 = r1
            com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl$manageSuccessfulVerification$1 r2 = (com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl$manageSuccessfulVerification$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl$manageSuccessfulVerification$1 r2 = new com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl$manageSuccessfulVerification$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L3b
            if (r4 != r5) goto L33
            java.lang.Object r3 = r2.L$1
            com.withings.library.authentication.login.Session r3 = (com.withings.library.authentication.login.Session) r3
            java.lang.Object r2 = r2.L$0
            com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl r2 = (com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl) r2
            nm0.l.b(r1)
            goto L6c
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            nm0.l.b(r1)
            com.withings.library.authentication.login.Session r6 = r0.session
            r20 = 2031(0x7ef, float:2.846E-42)
            r21 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            com.withings.library.authentication.login.Session r1 = com.withings.library.authentication.login.Session.copy$default(r6, r7, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21)
            com.withings.library.authentication.login.state.update.LoggedInUpdaterService r4 = r22.getLoggedInUpdaterService()
            r2.L$0 = r0
            r2.L$1 = r1
            r2.label = r5
            java.lang.Object r2 = r4.updateLoggedInWithSession(r1, r2)
            if (r2 != r3) goto L6a
            return r3
        L6a:
            r2 = r0
            r3 = r1
        L6c:
            com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction$CodeOutputState$SuccessVerified r1 = new com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction$CodeOutputState$SuccessVerified
            com.withings.library.authentication.sensitiveaction.factory.VerifiedSensitiveActionStateFactory r2 = r2.getVerifiedSensitiveActionStateFactory()
            com.withings.library.authentication.sensitiveaction.state.VerifiedSensitiveActionState r2 = r2.build(r3)
            r1.<init>(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl.manageSuccessfulVerification(qm0.d):java.lang.Object");
    }

    @Override // com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction
    public Object changePhoneNumber(d<? super NeedCode2FASensitiveAction.ChangePhoneOutputState> dVar) {
        Sequence sequence = this.sequence;
        if (sequence instanceof Sequence.Creation) {
            return new NeedCode2FASensitiveAction.ChangePhoneOutputState.Success(((Sequence.Creation) sequence).getNeedPhoneNumber());
        }
        if (sequence instanceof Sequence.Verification) {
            getLog().a("Can't change phone number during 2FA verification process");
            return new NeedCode2FASensitiveAction.ChangePhoneOutputState.ErrorNot2FACreationProcess(this);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    @Override // com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0161 A[Catch: Exception -> 0x0052, WrongStatusException -> 0x0056, UnauthorizedException -> 0x005a, TRY_LEAVE, TryCatch #4 {UnauthorizedException -> 0x005a, WrongStatusException -> 0x0056, Exception -> 0x0052, blocks: (B:24:0x004d, B:61:0x0159, B:63:0x0161, B:69:0x0170, B:35:0x006a, B:44:0x00d6), top: B:82:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0170 A[Catch: Exception -> 0x0052, WrongStatusException -> 0x0056, UnauthorizedException -> 0x005a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {UnauthorizedException -> 0x005a, WrongStatusException -> 0x0056, Exception -> 0x0052, blocks: (B:24:0x004d, B:61:0x0159, B:63:0x0161, B:69:0x0170, B:35:0x006a, B:44:0x00d6), top: B:82:0x0028 }] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [qm0.d, com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl$injectCode$1] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    @Override // com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectCode(java.lang.String r23, boolean r24, qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.CodeOutputState> r25) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl.injectCode(java.lang.String, boolean, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2 A[Catch: Exception -> 0x004c, WrongStatusException -> 0x0050, UnauthorizedException -> 0x0054, TRY_LEAVE, TryCatch #5 {UnauthorizedException -> 0x0054, WrongStatusException -> 0x0050, Exception -> 0x004c, blocks: (B:22:0x0047, B:34:0x00ba, B:36:0x00c2, B:42:0x00d1), top: B:59:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1 A[Catch: Exception -> 0x004c, WrongStatusException -> 0x0050, UnauthorizedException -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #5 {UnauthorizedException -> 0x0054, WrongStatusException -> 0x0050, Exception -> 0x004c, blocks: (B:22:0x0047, B:34:0x00ba, B:36:0x00c2, B:42:0x00d1), top: B:59:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    @Override // com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectRecoveryCode(java.lang.String r22, boolean r23, qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.CodeOutputState> r24) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl.injectRecoveryCode(java.lang.String, boolean, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    @Override // com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object resendSMS(qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction.SMSOutputState> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl$resendSMS$1
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl$resendSMS$1 r0 = (com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl$resendSMS$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl$resendSMS$1 r0 = new com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl$resendSMS$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r0 = r0.L$0
            com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl r0 = (com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl) r0
        L2a:
            nm0.l.b(r7)     // Catch: java.lang.Exception -> L2e com.withings.library.authentication.api.error.WrongStatusException -> L30
            goto L92
        L2e:
            r7 = move-exception
            goto L98
        L30:
            r7 = move-exception
            goto Lc0
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3b:
            java.lang.Object r0 = r0.L$0
            com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl r0 = (com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl) r0
            goto L2a
        L40:
            nm0.l.b(r7)
            com.withings.library.authentication.sensitiveaction.state.Sequence r7 = r6.sequence     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b
            boolean r2 = r7 instanceof com.withings.library.authentication.sensitiveaction.state.Sequence.Creation     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b
            if (r2 == 0) goto L6e
            com.withings.library.authentication.api.account.AccountApi r7 = r6.getAccountApi()     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b
            com.withings.library.authentication.login.Session r2 = r6.session     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b
            java.lang.String r2 = r2.getSessionId()     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b
            java.lang.String r3 = r6.getPhoneNumber()     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b
            com.withings.library.authentication.login.Session r5 = r6.session     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b
            com.withings.library.authentication.login.Server r5 = r5.getServer()     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b
            r0.L$0 = r6     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b
            r0.label = r4     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b
            java.lang.Object r7 = r7.setupPhoneAndRequestConfirmationCode(r2, r3, r5, r0)     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b
            if (r7 != r1) goto L91
            return r1
        L68:
            r7 = move-exception
            r0 = r6
            goto L98
        L6b:
            r7 = move-exception
            r0 = r6
            goto Lc0
        L6e:
            com.withings.library.authentication.sensitiveaction.state.Sequence$Verification r2 = com.withings.library.authentication.sensitiveaction.state.Sequence.Verification.INSTANCE     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b
            boolean r7 = kotlin.jvm.internal.u.e(r7, r2)     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b
            if (r7 == 0) goto L91
            com.withings.library.authentication.api.account.AccountApi r7 = r6.getAccountApi()     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b
            com.withings.library.authentication.login.Session r2 = r6.session     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b
            java.lang.String r2 = r2.getSessionId()     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b
            com.withings.library.authentication.login.Session r4 = r6.session     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b
            com.withings.library.authentication.login.Server r4 = r4.getServer()     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b
            r0.L$0 = r6     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b
            r0.label = r3     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b
            java.lang.Object r7 = r7.requestConfirmationCode(r2, r4, r0)     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b
            if (r7 != r1) goto L91
            return r1
        L91:
            r0 = r6
        L92:
            com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction$SMSOutputState$SuccessNeedCode2FA r7 = new com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction$SMSOutputState$SuccessNeedCode2FA     // Catch: java.lang.Exception -> L2e com.withings.library.authentication.api.error.WrongStatusException -> L30
            r7.<init>(r0)     // Catch: java.lang.Exception -> L2e com.withings.library.authentication.api.error.WrongStatusException -> L30
            goto Ld3
        L98:
            com.withings.library.authentication.api.error.NetworkExceptionChecker r1 = r0.getNetworkExceptionChecker()
            boolean r7 = r1.isNetworkException(r7)
            if (r7 == 0) goto Lb1
            v9.e r7 = r0.getLog()
            java.lang.String r1 = "Network error detected during resend code process"
            r7.a(r1)
            com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction$SMSOutputState$NetworkError r7 = new com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction$SMSOutputState$NetworkError
            r7.<init>(r0)
            goto Ld3
        Lb1:
            v9.e r7 = r0.getLog()
            java.lang.String r1 = "Error during resend code process"
            r7.a(r1)
            com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction$SMSOutputState$GenericError r7 = new com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction$SMSOutputState$GenericError
            r7.<init>(r0)
            goto Ld3
        Lc0:
            v9.e r1 = r0.getLog()
            java.lang.String r2 = "Exception during resend code process"
            r1.b(r2, r7)
            com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction$SMSOutputState$WithingsError r1 = new com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction$SMSOutputState$WithingsError
            int r7 = r7.getStatus()
            r1.<init>(r0, r7)
            r7 = r1
        Ld3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedCode2FASensitiveActionImpl.resendSMS(qm0.d):java.lang.Object");
    }
}
