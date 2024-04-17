package com.withings.library.authentication.setup2fa.state.impl;

import com.withings.library.authentication.api.account.AccountApi;
import com.withings.library.authentication.api.constant.ApiConstantProvider;
import com.withings.library.authentication.api.error.NetworkExceptionChecker;
import com.withings.library.authentication.di.KoinKt;
import com.withings.library.authentication.host.app.ApplicationInformationProvider;
import com.withings.library.authentication.host.device.DeviceInformationProvider;
import com.withings.library.authentication.login.state.update.LoggedInUpdaterService;
import com.withings.library.authentication.setup2fa.state.NeedCode2FASetup;
import com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup;
import com.withings.library.authentication.setup2fa.state.factory.Registered2FASetupFactory;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.jivesoftware.smack.packet.Session;
import pq0.a;
import qm0.d;
import v9.e;
/* compiled from: NeedCode2FASetupImpl.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\bB\u0010CJ#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001b\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u001b\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u001b\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\u001b\u001a\u0004\b?\u0010@\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006D"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/impl/NeedCode2FASetupImpl;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", "Lpq0/a;", "", "confirmationCode", "", "rememberDevice", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$CodeOutputState;", "injectCode", "(Ljava/lang/String;ZLqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$SMSOutputState;", "resendSMS", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup$ChangePhoneOutputState;", "changePhoneNumber", "Lcom/withings/library/authentication/login/Session;", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "previousNeedPhoneNumber2FASetup", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "phoneNumber", "Ljava/lang/String;", "getPhoneNumber", "()Ljava/lang/String;", "Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi$delegate", "Lnm0/g;", "getAccountApi", "()Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi", "Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider$delegate", "getDeviceInformationProvider", "()Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider", "Lcom/withings/library/authentication/host/app/ApplicationInformationProvider;", "applicationInformationProvider$delegate", "getApplicationInformationProvider", "()Lcom/withings/library/authentication/host/app/ApplicationInformationProvider;", "applicationInformationProvider", "Lcom/withings/library/authentication/api/constant/ApiConstantProvider;", "apiConstantProvider$delegate", "getApiConstantProvider", "()Lcom/withings/library/authentication/api/constant/ApiConstantProvider;", "apiConstantProvider", "Lv9/e;", "log$delegate", "getLog", "()Lv9/e;", "log", "Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker$delegate", "getNetworkExceptionChecker", "()Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker", "Lcom/withings/library/authentication/setup2fa/state/factory/Registered2FASetupFactory;", "registered2FASetupFactory$delegate", "getRegistered2FASetupFactory", "()Lcom/withings/library/authentication/setup2fa/state/factory/Registered2FASetupFactory;", "registered2FASetupFactory", "Lcom/withings/library/authentication/login/state/update/LoggedInUpdaterService;", "loggedInUpdaterService$delegate", "getLoggedInUpdaterService", "()Lcom/withings/library/authentication/login/state/update/LoggedInUpdaterService;", "loggedInUpdaterService", "<init>", "(Lcom/withings/library/authentication/login/Session;Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;Ljava/lang/String;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedCode2FASetupImpl implements NeedCode2FASetup, a {
    private final g accountApi$delegate;
    private final g apiConstantProvider$delegate;
    private final g applicationInformationProvider$delegate;
    private final g deviceInformationProvider$delegate;
    private final g log$delegate;
    private final g loggedInUpdaterService$delegate;
    private final g networkExceptionChecker$delegate;
    private final String phoneNumber;
    private final NeedPhoneNumber2FASetup previousNeedPhoneNumber2FASetup;
    private final g registered2FASetupFactory$delegate;
    private final com.withings.library.authentication.login.Session session;

    public NeedCode2FASetupImpl(com.withings.library.authentication.login.Session session, NeedPhoneNumber2FASetup previousNeedPhoneNumber2FASetup, String phoneNumber) {
        u.j(session, "session");
        u.j(previousNeedPhoneNumber2FASetup, "previousNeedPhoneNumber2FASetup");
        u.j(phoneNumber, "phoneNumber");
        this.session = session;
        this.previousNeedPhoneNumber2FASetup = previousNeedPhoneNumber2FASetup;
        this.phoneNumber = phoneNumber;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.accountApi$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FASetupImpl$special$$inlined$inject$default$1(this, null, null));
        this.deviceInformationProvider$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FASetupImpl$special$$inlined$inject$default$2(this, null, null));
        this.applicationInformationProvider$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FASetupImpl$special$$inlined$inject$default$3(this, null, null));
        this.apiConstantProvider$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FASetupImpl$special$$inlined$inject$default$4(this, null, null));
        this.log$delegate = KoinKt.injectLogger(this, "NeedCode2FA");
        this.networkExceptionChecker$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FASetupImpl$special$$inlined$inject$default$5(this, null, null));
        this.registered2FASetupFactory$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FASetupImpl$special$$inlined$inject$default$6(this, null, null));
        this.loggedInUpdaterService$delegate = h.a(lazyThreadSafetyMode, new NeedCode2FASetupImpl$special$$inlined$inject$default$7(this, null, null));
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

    private final Registered2FASetupFactory getRegistered2FASetupFactory() {
        return (Registered2FASetupFactory) this.registered2FASetupFactory$delegate.getValue();
    }

    @Override // com.withings.library.authentication.setup2fa.state.NeedCode2FASetup
    public Object changePhoneNumber(d<? super NeedCode2FASetup.ChangePhoneOutputState> dVar) {
        return new NeedCode2FASetup.ChangePhoneOutputState.Success(this.previousNeedPhoneNumber2FASetup);
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    @Override // com.withings.library.authentication.setup2fa.state.NeedCode2FASetup
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0124  */
    @Override // com.withings.library.authentication.setup2fa.state.NeedCode2FASetup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectCode(java.lang.String r31, boolean r32, qm0.d<? super com.withings.library.authentication.setup2fa.state.NeedCode2FASetup.CodeOutputState> r33) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.setup2fa.state.impl.NeedCode2FASetupImpl.injectCode(java.lang.String, boolean, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    @Override // com.withings.library.authentication.setup2fa.state.NeedCode2FASetup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object resendSMS(qm0.d<? super com.withings.library.authentication.setup2fa.state.NeedCode2FASetup.SMSOutputState> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.withings.library.authentication.setup2fa.state.impl.NeedCode2FASetupImpl$resendSMS$1
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.library.authentication.setup2fa.state.impl.NeedCode2FASetupImpl$resendSMS$1 r0 = (com.withings.library.authentication.setup2fa.state.impl.NeedCode2FASetupImpl$resendSMS$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.setup2fa.state.impl.NeedCode2FASetupImpl$resendSMS$1 r0 = new com.withings.library.authentication.setup2fa.state.impl.NeedCode2FASetupImpl$resendSMS$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            java.lang.String r3 = "Exception during resend code process"
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r0 = r0.L$0
            com.withings.library.authentication.setup2fa.state.impl.NeedCode2FASetupImpl r0 = (com.withings.library.authentication.setup2fa.state.impl.NeedCode2FASetupImpl) r0
            nm0.l.b(r7)     // Catch: java.lang.Exception -> L2d com.withings.library.authentication.api.error.WrongStatusException -> L2f
            goto L58
        L2d:
            r7 = move-exception
            goto L64
        L2f:
            r7 = move-exception
            goto L8a
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L39:
            nm0.l.b(r7)
            com.withings.library.authentication.api.account.AccountApi r7 = r6.getAccountApi()     // Catch: java.lang.Exception -> L5e com.withings.library.authentication.api.error.WrongStatusException -> L61
            com.withings.library.authentication.login.Session r2 = r6.session     // Catch: java.lang.Exception -> L5e com.withings.library.authentication.api.error.WrongStatusException -> L61
            java.lang.String r2 = r2.getSessionId()     // Catch: java.lang.Exception -> L5e com.withings.library.authentication.api.error.WrongStatusException -> L61
            com.withings.library.authentication.login.Session r5 = r6.session     // Catch: java.lang.Exception -> L5e com.withings.library.authentication.api.error.WrongStatusException -> L61
            com.withings.library.authentication.login.Server r5 = r5.getServer()     // Catch: java.lang.Exception -> L5e com.withings.library.authentication.api.error.WrongStatusException -> L61
            r0.L$0 = r6     // Catch: java.lang.Exception -> L5e com.withings.library.authentication.api.error.WrongStatusException -> L61
            r0.label = r4     // Catch: java.lang.Exception -> L5e com.withings.library.authentication.api.error.WrongStatusException -> L61
            java.lang.Object r7 = r7.requestConfirmationCode(r2, r5, r0)     // Catch: java.lang.Exception -> L5e com.withings.library.authentication.api.error.WrongStatusException -> L61
            if (r7 != r1) goto L57
            return r1
        L57:
            r0 = r6
        L58:
            com.withings.library.authentication.setup2fa.state.NeedCode2FASetup$SMSOutputState$SuccessNeedCode2FA r7 = new com.withings.library.authentication.setup2fa.state.NeedCode2FASetup$SMSOutputState$SuccessNeedCode2FA     // Catch: java.lang.Exception -> L2d com.withings.library.authentication.api.error.WrongStatusException -> L2f
            r7.<init>(r0)     // Catch: java.lang.Exception -> L2d com.withings.library.authentication.api.error.WrongStatusException -> L2f
            goto L9b
        L5e:
            r7 = move-exception
            r0 = r6
            goto L64
        L61:
            r7 = move-exception
            r0 = r6
            goto L8a
        L64:
            com.withings.library.authentication.api.error.NetworkExceptionChecker r1 = r0.getNetworkExceptionChecker()
            boolean r1 = r1.isNetworkException(r7)
            if (r1 == 0) goto L7d
            v9.e r7 = r0.getLog()
            java.lang.String r1 = "Network error during resend code process"
            r7.a(r1)
            com.withings.library.authentication.setup2fa.state.NeedCode2FASetup$SMSOutputState$NetworkError r7 = new com.withings.library.authentication.setup2fa.state.NeedCode2FASetup$SMSOutputState$NetworkError
            r7.<init>(r0)
            goto L9b
        L7d:
            v9.e r1 = r0.getLog()
            r1.b(r3, r7)
            com.withings.library.authentication.setup2fa.state.NeedCode2FASetup$SMSOutputState$GenericError r7 = new com.withings.library.authentication.setup2fa.state.NeedCode2FASetup$SMSOutputState$GenericError
            r7.<init>(r0)
            goto L9b
        L8a:
            v9.e r1 = r0.getLog()
            r1.b(r3, r7)
            com.withings.library.authentication.setup2fa.state.NeedCode2FASetup$SMSOutputState$WithingsError r1 = new com.withings.library.authentication.setup2fa.state.NeedCode2FASetup$SMSOutputState$WithingsError
            int r7 = r7.getStatus()
            r1.<init>(r0, r7)
            r7 = r1
        L9b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.setup2fa.state.impl.NeedCode2FASetupImpl.resendSMS(qm0.d):java.lang.Object");
    }
}
