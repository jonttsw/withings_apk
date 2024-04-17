package com.withings.library.authentication.login.state.impl;

import com.withings.library.authentication.api.account.AccountApi;
import com.withings.library.authentication.api.constant.ApiConstantProvider;
import com.withings.library.authentication.api.error.NetworkExceptionChecker;
import com.withings.library.authentication.api.session.SessionApi;
import com.withings.library.authentication.di.KoinKt;
import com.withings.library.authentication.host.app.ApplicationInformationProvider;
import com.withings.library.authentication.host.device.DeviceInformationProvider;
import com.withings.library.authentication.login.state.NeedCode2FA;
import com.withings.library.authentication.login.state.Sequence;
import com.withings.library.authentication.login.state.factory.LoggedInFactory;
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
/* compiled from: NeedCode2FAImpl.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\bF\u0010GJ#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\tJ\u0013\u0010\u0010\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u001f\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u001f\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\u001f\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\u001f\u001a\u0004\bC\u0010D\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006H"}, d2 = {"Lcom/withings/library/authentication/login/state/impl/NeedCode2FAImpl;", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "Lpq0/a;", "", "confirmationCode", "", "rememberDevice", "Lcom/withings/library/authentication/login/state/NeedCode2FA$CodeOutputState;", "injectCode", "(Ljava/lang/String;ZLqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/login/state/NeedCode2FA$SMSOutputState;", "resendSMS", "(Lqm0/d;)Ljava/lang/Object;", "recoveryCode", "injectRecoveryCode", "Lcom/withings/library/authentication/login/state/NeedCode2FA$ChangePhoneOutputState;", "changePhoneNumber", "Lcom/withings/library/authentication/login/state/Sequence;", "sequence", "Lcom/withings/library/authentication/login/state/Sequence;", "Lcom/withings/library/authentication/login/Session;", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "getSession", "()Lcom/withings/library/authentication/login/Session;", "phoneNumber", "Ljava/lang/String;", "getPhoneNumber", "()Ljava/lang/String;", "Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi$delegate", "Lnm0/g;", "getAccountApi", "()Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi", "Lcom/withings/library/authentication/api/session/SessionApi;", "sessionApi$delegate", "getSessionApi", "()Lcom/withings/library/authentication/api/session/SessionApi;", "sessionApi", "Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider$delegate", "getDeviceInformationProvider", "()Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider", "Lcom/withings/library/authentication/host/app/ApplicationInformationProvider;", "applicationInformationProvider$delegate", "getApplicationInformationProvider", "()Lcom/withings/library/authentication/host/app/ApplicationInformationProvider;", "applicationInformationProvider", "Lcom/withings/library/authentication/api/constant/ApiConstantProvider;", "apiConstantProvider$delegate", "getApiConstantProvider", "()Lcom/withings/library/authentication/api/constant/ApiConstantProvider;", "apiConstantProvider", "Lv9/e;", "log$delegate", "getLog", "()Lv9/e;", "log", "Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker$delegate", "getNetworkExceptionChecker", "()Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker", "Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory$delegate", "getLoggedInFactory", "()Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory", "<init>", "(Lcom/withings/library/authentication/login/state/Sequence;Lcom/withings/library/authentication/login/Session;Ljava/lang/String;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedCode2FAImpl implements NeedCode2FA, a {
    private final g accountApi$delegate;
    private final g apiConstantProvider$delegate;
    private final g applicationInformationProvider$delegate;
    private final g deviceInformationProvider$delegate;
    private final g log$delegate;
    private final g loggedInFactory$delegate;
    private final g networkExceptionChecker$delegate;
    private final String phoneNumber;
    private final Sequence sequence;
    private final com.withings.library.authentication.login.Session session;
    private final g sessionApi$delegate;

    public NeedCode2FAImpl(Sequence sequence, com.withings.library.authentication.login.Session session, String phoneNumber) {
        u.j(sequence, "sequence");
        u.j(session, "session");
        u.j(phoneNumber, "phoneNumber");
        this.sequence = sequence;
        this.session = session;
        this.phoneNumber = phoneNumber;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.accountApi$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FAImpl$special$$inlined$inject$default$1(this, null, null));
        this.sessionApi$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FAImpl$special$$inlined$inject$default$2(this, null, null));
        this.deviceInformationProvider$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FAImpl$special$$inlined$inject$default$3(this, null, null));
        this.applicationInformationProvider$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FAImpl$special$$inlined$inject$default$4(this, null, null));
        this.apiConstantProvider$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FAImpl$special$$inlined$inject$default$5(this, null, null));
        this.log$delegate = KoinKt.injectLogger(this, "NeedCode2FA");
        this.networkExceptionChecker$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FAImpl$special$$inlined$inject$default$6(this, null, null));
        this.loggedInFactory$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FAImpl$special$$inlined$inject$default$7(this, null, null));
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

    private final LoggedInFactory getLoggedInFactory() {
        return (LoggedInFactory) this.loggedInFactory$delegate.getValue();
    }

    private final NetworkExceptionChecker getNetworkExceptionChecker() {
        return (NetworkExceptionChecker) this.networkExceptionChecker$delegate.getValue();
    }

    private final SessionApi getSessionApi() {
        return (SessionApi) this.sessionApi$delegate.getValue();
    }

    @Override // com.withings.library.authentication.login.state.NeedCode2FA
    public Object changePhoneNumber(d<? super NeedCode2FA.ChangePhoneOutputState> dVar) {
        Sequence sequence = this.sequence;
        if (sequence instanceof Sequence.Creation) {
            return new NeedCode2FA.ChangePhoneOutputState.Success(((Sequence.Creation) sequence).getNeedPhoneNumber2FA());
        }
        if (sequence instanceof Sequence.Verification) {
            getLog().a("Can't change phone number during 2FA verification process");
            return new NeedCode2FA.ChangePhoneOutputState.ErrorNot2FACreationProcess(this);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    @Override // com.withings.library.authentication.login.state.NeedCode2FA
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override // com.withings.library.authentication.login.state.NeedCode2FA
    public com.withings.library.authentication.login.Session getSession() {
        return this.session;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0169 A[Catch: Exception -> 0x0037, WrongStatusException -> 0x003a, UnauthorizedException -> 0x01e0, TryCatch #3 {UnauthorizedException -> 0x01e0, WrongStatusException -> 0x003a, Exception -> 0x0037, blocks: (B:14:0x0032, B:45:0x0161, B:47:0x0169, B:48:0x019c, B:23:0x0049, B:32:0x00b8), top: B:61:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019c A[Catch: Exception -> 0x0037, WrongStatusException -> 0x003a, UnauthorizedException -> 0x01e0, TRY_LEAVE, TryCatch #3 {UnauthorizedException -> 0x01e0, WrongStatusException -> 0x003a, Exception -> 0x0037, blocks: (B:14:0x0032, B:45:0x0161, B:47:0x0169, B:48:0x019c, B:23:0x0049, B:32:0x00b8), top: B:61:0x0028 }] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // com.withings.library.authentication.login.state.NeedCode2FA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectCode(java.lang.String r29, boolean r30, qm0.d<? super com.withings.library.authentication.login.state.NeedCode2FA.CodeOutputState> r31) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.NeedCode2FAImpl.injectCode(java.lang.String, boolean, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0 A[Catch: Exception -> 0x0034, WrongStatusException -> 0x0037, UnauthorizedException -> 0x0129, TryCatch #3 {UnauthorizedException -> 0x0129, WrongStatusException -> 0x0037, Exception -> 0x0034, blocks: (B:13:0x002f, B:26:0x00a8, B:28:0x00b0, B:29:0x00e3), top: B:46:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3 A[Catch: Exception -> 0x0034, WrongStatusException -> 0x0037, UnauthorizedException -> 0x0129, TRY_LEAVE, TryCatch #3 {UnauthorizedException -> 0x0129, WrongStatusException -> 0x0037, Exception -> 0x0034, blocks: (B:13:0x002f, B:26:0x00a8, B:28:0x00b0, B:29:0x00e3), top: B:46:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a  */
    @Override // com.withings.library.authentication.login.state.NeedCode2FA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectRecoveryCode(java.lang.String r29, boolean r30, qm0.d<? super com.withings.library.authentication.login.state.NeedCode2FA.CodeOutputState> r31) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.NeedCode2FAImpl.injectRecoveryCode(java.lang.String, boolean, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    @Override // com.withings.library.authentication.login.state.NeedCode2FA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object resendSMS(qm0.d<? super com.withings.library.authentication.login.state.NeedCode2FA.SMSOutputState> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.withings.library.authentication.login.state.impl.NeedCode2FAImpl$resendSMS$1
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.library.authentication.login.state.impl.NeedCode2FAImpl$resendSMS$1 r0 = (com.withings.library.authentication.login.state.impl.NeedCode2FAImpl$resendSMS$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.login.state.impl.NeedCode2FAImpl$resendSMS$1 r0 = new com.withings.library.authentication.login.state.impl.NeedCode2FAImpl$resendSMS$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r0 = r0.L$0
            com.withings.library.authentication.login.state.impl.NeedCode2FAImpl r0 = (com.withings.library.authentication.login.state.impl.NeedCode2FAImpl) r0
        L2a:
            nm0.l.b(r7)     // Catch: java.lang.Exception -> L2f com.withings.library.authentication.api.error.WrongStatusException -> L32
            goto L9c
        L2f:
            r7 = move-exception
            goto La2
        L32:
            r7 = move-exception
            goto Lca
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3d:
            java.lang.Object r0 = r0.L$0
            com.withings.library.authentication.login.state.impl.NeedCode2FAImpl r0 = (com.withings.library.authentication.login.state.impl.NeedCode2FAImpl) r0
            goto L2a
        L42:
            nm0.l.b(r7)
            com.withings.library.authentication.login.state.Sequence r7 = r6.sequence     // Catch: java.lang.Exception -> L6e com.withings.library.authentication.api.error.WrongStatusException -> L71
            boolean r2 = r7 instanceof com.withings.library.authentication.login.state.Sequence.Creation     // Catch: java.lang.Exception -> L6e com.withings.library.authentication.api.error.WrongStatusException -> L71
            if (r2 == 0) goto L74
            com.withings.library.authentication.api.account.AccountApi r7 = r6.getAccountApi()     // Catch: java.lang.Exception -> L6e com.withings.library.authentication.api.error.WrongStatusException -> L71
            com.withings.library.authentication.login.Session r2 = r6.getSession()     // Catch: java.lang.Exception -> L6e com.withings.library.authentication.api.error.WrongStatusException -> L71
            java.lang.String r2 = r2.getSessionId()     // Catch: java.lang.Exception -> L6e com.withings.library.authentication.api.error.WrongStatusException -> L71
            java.lang.String r3 = r6.getPhoneNumber()     // Catch: java.lang.Exception -> L6e com.withings.library.authentication.api.error.WrongStatusException -> L71
            com.withings.library.authentication.login.Session r5 = r6.getSession()     // Catch: java.lang.Exception -> L6e com.withings.library.authentication.api.error.WrongStatusException -> L71
            com.withings.library.authentication.login.Server r5 = r5.getServer()     // Catch: java.lang.Exception -> L6e com.withings.library.authentication.api.error.WrongStatusException -> L71
            r0.L$0 = r6     // Catch: java.lang.Exception -> L6e com.withings.library.authentication.api.error.WrongStatusException -> L71
            r0.label = r4     // Catch: java.lang.Exception -> L6e com.withings.library.authentication.api.error.WrongStatusException -> L71
            java.lang.Object r7 = r7.setupPhoneAndRequestConfirmationCode(r2, r3, r5, r0)     // Catch: java.lang.Exception -> L6e com.withings.library.authentication.api.error.WrongStatusException -> L71
            if (r7 != r1) goto L9b
            return r1
        L6e:
            r7 = move-exception
            r0 = r6
            goto La2
        L71:
            r7 = move-exception
            r0 = r6
            goto Lca
        L74:
            com.withings.library.authentication.login.state.Sequence$Verification r2 = com.withings.library.authentication.login.state.Sequence.Verification.INSTANCE     // Catch: java.lang.Exception -> L6e com.withings.library.authentication.api.error.WrongStatusException -> L71
            boolean r7 = kotlin.jvm.internal.u.e(r7, r2)     // Catch: java.lang.Exception -> L6e com.withings.library.authentication.api.error.WrongStatusException -> L71
            if (r7 == 0) goto L9b
            com.withings.library.authentication.api.account.AccountApi r7 = r6.getAccountApi()     // Catch: java.lang.Exception -> L6e com.withings.library.authentication.api.error.WrongStatusException -> L71
            com.withings.library.authentication.login.Session r2 = r6.getSession()     // Catch: java.lang.Exception -> L6e com.withings.library.authentication.api.error.WrongStatusException -> L71
            java.lang.String r2 = r2.getSessionId()     // Catch: java.lang.Exception -> L6e com.withings.library.authentication.api.error.WrongStatusException -> L71
            com.withings.library.authentication.login.Session r4 = r6.getSession()     // Catch: java.lang.Exception -> L6e com.withings.library.authentication.api.error.WrongStatusException -> L71
            com.withings.library.authentication.login.Server r4 = r4.getServer()     // Catch: java.lang.Exception -> L6e com.withings.library.authentication.api.error.WrongStatusException -> L71
            r0.L$0 = r6     // Catch: java.lang.Exception -> L6e com.withings.library.authentication.api.error.WrongStatusException -> L71
            r0.label = r3     // Catch: java.lang.Exception -> L6e com.withings.library.authentication.api.error.WrongStatusException -> L71
            java.lang.Object r7 = r7.requestConfirmationCode(r2, r4, r0)     // Catch: java.lang.Exception -> L6e com.withings.library.authentication.api.error.WrongStatusException -> L71
            if (r7 != r1) goto L9b
            return r1
        L9b:
            r0 = r6
        L9c:
            com.withings.library.authentication.login.state.NeedCode2FA$SMSOutputState$SuccessNeedCode2FA r7 = new com.withings.library.authentication.login.state.NeedCode2FA$SMSOutputState$SuccessNeedCode2FA     // Catch: java.lang.Exception -> L2f com.withings.library.authentication.api.error.WrongStatusException -> L32
            r7.<init>(r0)     // Catch: java.lang.Exception -> L2f com.withings.library.authentication.api.error.WrongStatusException -> L32
            goto Ldd
        La2:
            com.withings.library.authentication.api.error.NetworkExceptionChecker r1 = r0.getNetworkExceptionChecker()
            boolean r7 = r1.isNetworkException(r7)
            if (r7 == 0) goto Lbb
            v9.e r7 = r0.getLog()
            java.lang.String r1 = "Network error detected during resend code process"
            r7.a(r1)
            com.withings.library.authentication.login.state.NeedCode2FA$SMSOutputState$NetworkError r7 = new com.withings.library.authentication.login.state.NeedCode2FA$SMSOutputState$NetworkError
            r7.<init>(r0)
            goto Ldd
        Lbb:
            v9.e r7 = r0.getLog()
            java.lang.String r1 = "Error during resend code process"
            r7.a(r1)
            com.withings.library.authentication.login.state.NeedCode2FA$SMSOutputState$GenericError r7 = new com.withings.library.authentication.login.state.NeedCode2FA$SMSOutputState$GenericError
            r7.<init>(r0)
            goto Ldd
        Lca:
            v9.e r1 = r0.getLog()
            java.lang.String r2 = "Exception during resend code process"
            r1.b(r2, r7)
            com.withings.library.authentication.login.state.NeedCode2FA$SMSOutputState$WithingsError r1 = new com.withings.library.authentication.login.state.NeedCode2FA$SMSOutputState$WithingsError
            int r7 = r7.getStatus()
            r1.<init>(r0, r7)
            r7 = r1
        Ldd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.NeedCode2FAImpl.resendSMS(qm0.d):java.lang.Object");
    }
}
