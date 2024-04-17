package com.withings.library.authentication.setup2fa.state.impl;

import com.withings.library.authentication.api.account.AccountApi;
import com.withings.library.authentication.api.error.NetworkExceptionChecker;
import com.withings.library.authentication.di.KoinKt;
import com.withings.library.authentication.setup2fa.state.Registered2FASetup;
import com.withings.library.authentication.setup2fa.state.factory.NeedPhoneNumber2FASetupFactory;
import com.withings.library.authentication.setup2fa.state.factory.Unregistered2FASetupFactory;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.jivesoftware.smack.packet.Session;
import pq0.a;
import qm0.d;
import v9.e;
/* compiled from: Registered2FASetupImpl.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b.\u0010/J\u0013\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u0013\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0005J\u0013\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0016\u001a\u0004\b+\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/impl/Registered2FASetupImpl;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "Lpq0/a;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$Remove2FAOutputState;", "remove2FA", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GetRecoveryCodeOutputState;", "getRecoveryCode", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$GenerateRecoveryCodeOutputState;", "generateRecoveryCode", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup$ChangePhoneOutputState;", "changePhoneNumber", "", "phoneNumber", "Ljava/lang/String;", "getPhoneNumber", "()Ljava/lang/String;", "Lcom/withings/library/authentication/login/Session;", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "Lcom/withings/library/authentication/setup2fa/state/factory/Unregistered2FASetupFactory;", "unregistered2FASetupFactory$delegate", "Lnm0/g;", "getUnregistered2FASetupFactory", "()Lcom/withings/library/authentication/setup2fa/state/factory/Unregistered2FASetupFactory;", "unregistered2FASetupFactory", "Lcom/withings/library/authentication/setup2fa/state/factory/NeedPhoneNumber2FASetupFactory;", "needPhoneNumber2FASetupFactory$delegate", "getNeedPhoneNumber2FASetupFactory", "()Lcom/withings/library/authentication/setup2fa/state/factory/NeedPhoneNumber2FASetupFactory;", "needPhoneNumber2FASetupFactory", "Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi$delegate", "getAccountApi", "()Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi", "Lv9/e;", "log$delegate", "getLog", "()Lv9/e;", "log", "Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker$delegate", "getNetworkExceptionChecker", "()Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker", "<init>", "(Ljava/lang/String;Lcom/withings/library/authentication/login/Session;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Registered2FASetupImpl implements Registered2FASetup, a {
    private final g accountApi$delegate;
    private final g log$delegate;
    private final g needPhoneNumber2FASetupFactory$delegate;
    private final g networkExceptionChecker$delegate;
    private final String phoneNumber;
    private final com.withings.library.authentication.login.Session session;
    private final g unregistered2FASetupFactory$delegate;

    public Registered2FASetupImpl(String phoneNumber, com.withings.library.authentication.login.Session session) {
        u.j(phoneNumber, "phoneNumber");
        u.j(session, "session");
        this.phoneNumber = phoneNumber;
        this.session = session;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.unregistered2FASetupFactory$delegate = h.a(lazyThreadSafetyMode, new Registered2FASetupImpl$special$$inlined$inject$default$1(this, null, null));
        this.needPhoneNumber2FASetupFactory$delegate = h.a(lazyThreadSafetyMode, new Registered2FASetupImpl$special$$inlined$inject$default$2(this, null, null));
        this.accountApi$delegate = h.a(lazyThreadSafetyMode, new Registered2FASetupImpl$special$$inlined$inject$default$3(this, null, null));
        this.log$delegate = KoinKt.injectLogger(this, "Registered2FASetup");
        this.networkExceptionChecker$delegate = h.a(lazyThreadSafetyMode, new Registered2FASetupImpl$special$$inlined$inject$default$4(this, null, null));
    }

    private final AccountApi getAccountApi() {
        return (AccountApi) this.accountApi$delegate.getValue();
    }

    private final e getLog() {
        return (e) this.log$delegate.getValue();
    }

    private final NeedPhoneNumber2FASetupFactory getNeedPhoneNumber2FASetupFactory() {
        return (NeedPhoneNumber2FASetupFactory) this.needPhoneNumber2FASetupFactory$delegate.getValue();
    }

    private final NetworkExceptionChecker getNetworkExceptionChecker() {
        return (NetworkExceptionChecker) this.networkExceptionChecker$delegate.getValue();
    }

    private final Unregistered2FASetupFactory getUnregistered2FASetupFactory() {
        return (Unregistered2FASetupFactory) this.unregistered2FASetupFactory$delegate.getValue();
    }

    @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup
    public Object changePhoneNumber(d<? super Registered2FASetup.ChangePhoneOutputState> dVar) {
        return new Registered2FASetup.ChangePhoneOutputState.Success(getNeedPhoneNumber2FASetupFactory().build(this.session));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object generateRecoveryCode(qm0.d<? super com.withings.library.authentication.setup2fa.state.Registered2FASetup.GenerateRecoveryCodeOutputState> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl$generateRecoveryCode$1
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl$generateRecoveryCode$1 r0 = (com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl$generateRecoveryCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl$generateRecoveryCode$1 r0 = new com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl$generateRecoveryCode$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            java.lang.String r3 = "Exception during generate recovery code process"
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r0 = r0.L$0
            com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl r0 = (com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl) r0
            nm0.l.b(r7)     // Catch: java.lang.Exception -> L2d com.withings.library.authentication.api.error.WrongStatusException -> L2f com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Laf
            goto L59
        L2d:
            r7 = move-exception
            goto L77
        L2f:
            r7 = move-exception
            goto L9e
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3a:
            nm0.l.b(r7)
            com.withings.library.authentication.api.account.AccountApi r7 = r6.getAccountApi()     // Catch: java.lang.Exception -> L6f com.withings.library.authentication.api.error.WrongStatusException -> L72 com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L75
            com.withings.library.authentication.login.Session r2 = r6.session     // Catch: java.lang.Exception -> L6f com.withings.library.authentication.api.error.WrongStatusException -> L72 com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L75
            java.lang.String r2 = r2.getSessionId()     // Catch: java.lang.Exception -> L6f com.withings.library.authentication.api.error.WrongStatusException -> L72 com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L75
            com.withings.library.authentication.login.Session r5 = r6.session     // Catch: java.lang.Exception -> L6f com.withings.library.authentication.api.error.WrongStatusException -> L72 com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L75
            com.withings.library.authentication.login.Server r5 = r5.getServer()     // Catch: java.lang.Exception -> L6f com.withings.library.authentication.api.error.WrongStatusException -> L72 com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L75
            r0.L$0 = r6     // Catch: java.lang.Exception -> L6f com.withings.library.authentication.api.error.WrongStatusException -> L72 com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L75
            r0.label = r4     // Catch: java.lang.Exception -> L6f com.withings.library.authentication.api.error.WrongStatusException -> L72 com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L75
            java.lang.Object r7 = r7.generateRecoveryCode(r2, r5, r0)     // Catch: java.lang.Exception -> L6f com.withings.library.authentication.api.error.WrongStatusException -> L72 com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L75
            if (r7 != r1) goto L58
            return r1
        L58:
            r0 = r6
        L59:
            com.withings.library.authentication.api.account.RecoveryCodeResponse r7 = (com.withings.library.authentication.api.account.RecoveryCodeResponse) r7     // Catch: java.lang.Exception -> L2d com.withings.library.authentication.api.error.WrongStatusException -> L2f com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Laf
            java.util.List r7 = r7.getCodes()     // Catch: java.lang.Exception -> L2d com.withings.library.authentication.api.error.WrongStatusException -> L2f com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Laf
            java.lang.Object r7 = kotlin.collections.x.I(r7)     // Catch: java.lang.Exception -> L2d com.withings.library.authentication.api.error.WrongStatusException -> L2f com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Laf
            com.withings.library.authentication.api.account.Code r7 = (com.withings.library.authentication.api.account.Code) r7     // Catch: java.lang.Exception -> L2d com.withings.library.authentication.api.error.WrongStatusException -> L2f com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Laf
            java.lang.String r7 = r7.getCode()     // Catch: java.lang.Exception -> L2d com.withings.library.authentication.api.error.WrongStatusException -> L2f com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Laf
            com.withings.library.authentication.setup2fa.state.Registered2FASetup$GenerateRecoveryCodeOutputState$Success r1 = new com.withings.library.authentication.setup2fa.state.Registered2FASetup$GenerateRecoveryCodeOutputState$Success     // Catch: java.lang.Exception -> L2d com.withings.library.authentication.api.error.WrongStatusException -> L2f com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Laf
            r1.<init>(r0, r7)     // Catch: java.lang.Exception -> L2d com.withings.library.authentication.api.error.WrongStatusException -> L2f com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Laf
            goto Lbd
        L6f:
            r7 = move-exception
            r0 = r6
            goto L77
        L72:
            r7 = move-exception
            r0 = r6
            goto L9e
        L75:
            r0 = r6
            goto Laf
        L77:
            com.withings.library.authentication.api.error.NetworkExceptionChecker r1 = r0.getNetworkExceptionChecker()
            boolean r1 = r1.isNetworkException(r7)
            if (r1 == 0) goto L91
            v9.e r7 = r0.getLog()
            java.lang.String r1 = "Network error during generate recovery code process"
            r7.a(r1)
            com.withings.library.authentication.setup2fa.state.Registered2FASetup$GenerateRecoveryCodeOutputState$NetworkError r7 = new com.withings.library.authentication.setup2fa.state.Registered2FASetup$GenerateRecoveryCodeOutputState$NetworkError
            r7.<init>(r0)
        L8f:
            r1 = r7
            goto Lbd
        L91:
            v9.e r1 = r0.getLog()
            r1.b(r3, r7)
            com.withings.library.authentication.setup2fa.state.Registered2FASetup$GenerateRecoveryCodeOutputState$GenericError r7 = new com.withings.library.authentication.setup2fa.state.Registered2FASetup$GenerateRecoveryCodeOutputState$GenericError
            r7.<init>(r0)
            goto L8f
        L9e:
            v9.e r1 = r0.getLog()
            r1.b(r3, r7)
            com.withings.library.authentication.setup2fa.state.Registered2FASetup$GenerateRecoveryCodeOutputState$WithingsError r1 = new com.withings.library.authentication.setup2fa.state.Registered2FASetup$GenerateRecoveryCodeOutputState$WithingsError
            int r7 = r7.getStatus()
            r1.<init>(r0, r7)
            goto Lbd
        Laf:
            v9.e r7 = r0.getLog()
            java.lang.String r1 = "Auth timeout detected during generate recovery code process"
            r7.a(r1)
            com.withings.library.authentication.setup2fa.state.Registered2FASetup$GenerateRecoveryCodeOutputState$SensitiveActionNeeded r1 = new com.withings.library.authentication.setup2fa.state.Registered2FASetup$GenerateRecoveryCodeOutputState$SensitiveActionNeeded
            r1.<init>(r0)
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl.generateRecoveryCode(qm0.d):java.lang.Object");
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[Catch: Exception -> 0x002b, WrongStatusException -> 0x002d, AuthTimeoutException -> 0x00bd, TryCatch #4 {AuthTimeoutException -> 0x00bd, WrongStatusException -> 0x002d, Exception -> 0x002b, blocks: (B:12:0x0027, B:25:0x0057, B:27:0x0065, B:30:0x006d, B:31:0x0073), top: B:47:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d A[Catch: Exception -> 0x002b, WrongStatusException -> 0x002d, AuthTimeoutException -> 0x00bd, TryCatch #4 {AuthTimeoutException -> 0x00bd, WrongStatusException -> 0x002d, Exception -> 0x002b, blocks: (B:12:0x0027, B:25:0x0057, B:27:0x0065, B:30:0x006d, B:31:0x0073), top: B:47:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[Catch: Exception -> 0x002b, WrongStatusException -> 0x002d, AuthTimeoutException -> 0x00bd, TRY_LEAVE, TryCatch #4 {AuthTimeoutException -> 0x00bd, WrongStatusException -> 0x002d, Exception -> 0x002b, blocks: (B:12:0x0027, B:25:0x0057, B:27:0x0065, B:30:0x006d, B:31:0x0073), top: B:47:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getRecoveryCode(qm0.d<? super com.withings.library.authentication.setup2fa.state.Registered2FASetup.GetRecoveryCodeOutputState> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl$getRecoveryCode$1
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl$getRecoveryCode$1 r0 = (com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl$getRecoveryCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl$getRecoveryCode$1 r0 = new com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl$getRecoveryCode$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.L$0
            com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl r0 = (com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl) r0
            nm0.l.b(r6)     // Catch: java.lang.Exception -> L2b com.withings.library.authentication.api.error.WrongStatusException -> L2d com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Lbd
            goto L57
        L2b:
            r6 = move-exception
            goto L81
        L2d:
            r6 = move-exception
            goto Laa
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            nm0.l.b(r6)
            com.withings.library.authentication.api.account.AccountApi r6 = r5.getAccountApi()     // Catch: java.lang.Exception -> L79 com.withings.library.authentication.api.error.WrongStatusException -> L7c com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L7f
            com.withings.library.authentication.login.Session r2 = r5.session     // Catch: java.lang.Exception -> L79 com.withings.library.authentication.api.error.WrongStatusException -> L7c com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L7f
            java.lang.String r2 = r2.getSessionId()     // Catch: java.lang.Exception -> L79 com.withings.library.authentication.api.error.WrongStatusException -> L7c com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L7f
            com.withings.library.authentication.login.Session r4 = r5.session     // Catch: java.lang.Exception -> L79 com.withings.library.authentication.api.error.WrongStatusException -> L7c com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L7f
            com.withings.library.authentication.login.Server r4 = r4.getServer()     // Catch: java.lang.Exception -> L79 com.withings.library.authentication.api.error.WrongStatusException -> L7c com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L7f
            r0.L$0 = r5     // Catch: java.lang.Exception -> L79 com.withings.library.authentication.api.error.WrongStatusException -> L7c com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L7f
            r0.label = r3     // Catch: java.lang.Exception -> L79 com.withings.library.authentication.api.error.WrongStatusException -> L7c com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L7f
            java.lang.Object r6 = r6.getRecoveryCode(r2, r4, r0)     // Catch: java.lang.Exception -> L79 com.withings.library.authentication.api.error.WrongStatusException -> L7c com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L7f
            if (r6 != r1) goto L56
            return r1
        L56:
            r0 = r5
        L57:
            com.withings.library.authentication.api.account.RecoveryCodeResponse r6 = (com.withings.library.authentication.api.account.RecoveryCodeResponse) r6     // Catch: java.lang.Exception -> L2b com.withings.library.authentication.api.error.WrongStatusException -> L2d com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Lbd
            java.util.List r6 = r6.getCodes()     // Catch: java.lang.Exception -> L2b com.withings.library.authentication.api.error.WrongStatusException -> L2d com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Lbd
            java.lang.Object r6 = kotlin.collections.x.K(r6)     // Catch: java.lang.Exception -> L2b com.withings.library.authentication.api.error.WrongStatusException -> L2d com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Lbd
            com.withings.library.authentication.api.account.Code r6 = (com.withings.library.authentication.api.account.Code) r6     // Catch: java.lang.Exception -> L2b com.withings.library.authentication.api.error.WrongStatusException -> L2d com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Lbd
            if (r6 == 0) goto L6a
            java.lang.String r6 = r6.getCode()     // Catch: java.lang.Exception -> L2b com.withings.library.authentication.api.error.WrongStatusException -> L2d com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Lbd
            goto L6b
        L6a:
            r6 = 0
        L6b:
            if (r6 == 0) goto L73
            com.withings.library.authentication.setup2fa.state.Registered2FASetup$GetRecoveryCodeOutputState$SuccessCodeFound r1 = new com.withings.library.authentication.setup2fa.state.Registered2FASetup$GetRecoveryCodeOutputState$SuccessCodeFound     // Catch: java.lang.Exception -> L2b com.withings.library.authentication.api.error.WrongStatusException -> L2d com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Lbd
            r1.<init>(r0, r6)     // Catch: java.lang.Exception -> L2b com.withings.library.authentication.api.error.WrongStatusException -> L2d com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Lbd
            goto Lcb
        L73:
            com.withings.library.authentication.setup2fa.state.Registered2FASetup$GetRecoveryCodeOutputState$SuccessNoCodeFound r1 = new com.withings.library.authentication.setup2fa.state.Registered2FASetup$GetRecoveryCodeOutputState$SuccessNoCodeFound     // Catch: java.lang.Exception -> L2b com.withings.library.authentication.api.error.WrongStatusException -> L2d com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Lbd
            r1.<init>(r0)     // Catch: java.lang.Exception -> L2b com.withings.library.authentication.api.error.WrongStatusException -> L2d com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Lbd
            goto Lcb
        L79:
            r6 = move-exception
            r0 = r5
            goto L81
        L7c:
            r6 = move-exception
            r0 = r5
            goto Laa
        L7f:
            r0 = r5
            goto Lbd
        L81:
            com.withings.library.authentication.api.error.NetworkExceptionChecker r1 = r0.getNetworkExceptionChecker()
            boolean r1 = r1.isNetworkException(r6)
            if (r1 == 0) goto L9b
            v9.e r6 = r0.getLog()
            java.lang.String r1 = "Network error during get recovery process"
            r6.a(r1)
            com.withings.library.authentication.setup2fa.state.Registered2FASetup$GetRecoveryCodeOutputState$NetworkError r6 = new com.withings.library.authentication.setup2fa.state.Registered2FASetup$GetRecoveryCodeOutputState$NetworkError
            r6.<init>(r0)
        L99:
            r1 = r6
            goto Lcb
        L9b:
            v9.e r1 = r0.getLog()
            java.lang.String r2 = "Exception during get recovery process"
            r1.b(r2, r6)
            com.withings.library.authentication.setup2fa.state.Registered2FASetup$GetRecoveryCodeOutputState$GenericError r6 = new com.withings.library.authentication.setup2fa.state.Registered2FASetup$GetRecoveryCodeOutputState$GenericError
            r6.<init>(r0)
            goto L99
        Laa:
            v9.e r1 = r0.getLog()
            java.lang.String r2 = "Exception during get recovery code process"
            r1.b(r2, r6)
            com.withings.library.authentication.setup2fa.state.Registered2FASetup$GetRecoveryCodeOutputState$WithingsError r1 = new com.withings.library.authentication.setup2fa.state.Registered2FASetup$GetRecoveryCodeOutputState$WithingsError
            int r6 = r6.getStatus()
            r1.<init>(r0, r6)
            goto Lcb
        Lbd:
            v9.e r6 = r0.getLog()
            java.lang.String r1 = "Auth timeout detected during get recovery code process"
            r6.a(r1)
            com.withings.library.authentication.setup2fa.state.Registered2FASetup$GetRecoveryCodeOutputState$SensitiveActionNeeded r1 = new com.withings.library.authentication.setup2fa.state.Registered2FASetup$GetRecoveryCodeOutputState$SensitiveActionNeeded
            r1.<init>(r0)
        Lcb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl.getRecoveryCode(qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    @Override // com.withings.library.authentication.setup2fa.state.Registered2FASetup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object remove2FA(qm0.d<? super com.withings.library.authentication.setup2fa.state.Registered2FASetup.Remove2FAOutputState> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl$remove2FA$1
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl$remove2FA$1 r0 = (com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl$remove2FA$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl$remove2FA$1 r0 = new com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl$remove2FA$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            java.lang.String r3 = "Exception during remove 2FA process"
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r0 = r0.L$0
            com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl r0 = (com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl) r0
            nm0.l.b(r7)     // Catch: java.lang.Exception -> L2d com.withings.library.authentication.api.error.WrongStatusException -> L2f com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> La8
            goto L58
        L2d:
            r7 = move-exception
            goto L70
        L2f:
            r7 = move-exception
            goto L96
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L39:
            nm0.l.b(r7)
            com.withings.library.authentication.api.account.AccountApi r7 = r6.getAccountApi()     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L6e
            com.withings.library.authentication.login.Session r2 = r6.session     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L6e
            java.lang.String r2 = r2.getSessionId()     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L6e
            com.withings.library.authentication.login.Session r5 = r6.session     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L6e
            com.withings.library.authentication.login.Server r5 = r5.getServer()     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L6e
            r0.L$0 = r6     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L6e
            r0.label = r4     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L6e
            java.lang.Object r7 = r7.deletePhoneForSession(r2, r5, r0)     // Catch: java.lang.Exception -> L68 com.withings.library.authentication.api.error.WrongStatusException -> L6b com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L6e
            if (r7 != r1) goto L57
            return r1
        L57:
            r0 = r6
        L58:
            com.withings.library.authentication.setup2fa.state.Registered2FASetup$Remove2FAOutputState$SuccessUnregister2FA r7 = new com.withings.library.authentication.setup2fa.state.Registered2FASetup$Remove2FAOutputState$SuccessUnregister2FA     // Catch: java.lang.Exception -> L2d com.withings.library.authentication.api.error.WrongStatusException -> L2f com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> La8
            com.withings.library.authentication.setup2fa.state.factory.Unregistered2FASetupFactory r1 = r0.getUnregistered2FASetupFactory()     // Catch: java.lang.Exception -> L2d com.withings.library.authentication.api.error.WrongStatusException -> L2f com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> La8
            com.withings.library.authentication.login.Session r2 = r0.session     // Catch: java.lang.Exception -> L2d com.withings.library.authentication.api.error.WrongStatusException -> L2f com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> La8
            com.withings.library.authentication.setup2fa.state.Unregistered2FASetup r1 = r1.build(r2)     // Catch: java.lang.Exception -> L2d com.withings.library.authentication.api.error.WrongStatusException -> L2f com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> La8
            r7.<init>(r1)     // Catch: java.lang.Exception -> L2d com.withings.library.authentication.api.error.WrongStatusException -> L2f com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> La8
            return r7
        L68:
            r7 = move-exception
            r0 = r6
            goto L70
        L6b:
            r7 = move-exception
            r0 = r6
            goto L96
        L6e:
            r0 = r6
            goto La8
        L70:
            com.withings.library.authentication.api.error.NetworkExceptionChecker r1 = r0.getNetworkExceptionChecker()
            boolean r1 = r1.isNetworkException(r7)
            if (r1 == 0) goto L89
            v9.e r7 = r0.getLog()
            java.lang.String r1 = "Network error during remove 2FA process"
            r7.a(r1)
            com.withings.library.authentication.setup2fa.state.Registered2FASetup$Remove2FAOutputState$NetworkError r7 = new com.withings.library.authentication.setup2fa.state.Registered2FASetup$Remove2FAOutputState$NetworkError
            r7.<init>(r0)
            goto Lb6
        L89:
            v9.e r1 = r0.getLog()
            r1.b(r3, r7)
            com.withings.library.authentication.setup2fa.state.Registered2FASetup$Remove2FAOutputState$GenericError r7 = new com.withings.library.authentication.setup2fa.state.Registered2FASetup$Remove2FAOutputState$GenericError
            r7.<init>(r0)
            goto Lb6
        L96:
            v9.e r1 = r0.getLog()
            r1.b(r3, r7)
            com.withings.library.authentication.setup2fa.state.Registered2FASetup$Remove2FAOutputState$WithingsError r1 = new com.withings.library.authentication.setup2fa.state.Registered2FASetup$Remove2FAOutputState$WithingsError
            int r7 = r7.getStatus()
            r1.<init>(r0, r7)
            r7 = r1
            goto Lb6
        La8:
            v9.e r7 = r0.getLog()
            java.lang.String r1 = "Auth timeout detected during remove 2FA process"
            r7.a(r1)
            com.withings.library.authentication.setup2fa.state.Registered2FASetup$Remove2FAOutputState$SensitiveActionNeeded r7 = new com.withings.library.authentication.setup2fa.state.Registered2FASetup$Remove2FAOutputState$SensitiveActionNeeded
            r7.<init>(r0)
        Lb6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl.remove2FA(qm0.d):java.lang.Object");
    }
}
