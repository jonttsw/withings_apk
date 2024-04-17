package com.withings.library.authentication.sensitiveaction.impl;

import com.withings.library.authentication.api.account.AccountApi;
import com.withings.library.authentication.api.error.NetworkExceptionChecker;
import com.withings.library.authentication.di.KoinKt;
import com.withings.library.authentication.sensitiveaction.factory.NeedCode2FASensitiveActionFactory;
import com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.jivesoftware.smack.packet.Session;
import pq0.a;
import v9.e;
/* compiled from: NeedPhoneNumberSensitiveActionStateImpl.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/impl/NeedPhoneNumberSensitiveActionStateImpl;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "Lpq0/a;", "", "phoneNumber", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState$OutputState;", "registerPhoneNumber", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/login/Session;", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi$delegate", "Lnm0/g;", "getAccountApi", "()Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi", "Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker$delegate", "getNetworkExceptionChecker", "()Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedCode2FASensitiveActionFactory;", "needCode2FASensitiveActionFactory$delegate", "getNeedCode2FASensitiveActionFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/NeedCode2FASensitiveActionFactory;", "needCode2FASensitiveActionFactory", "Lv9/e;", "log$delegate", "getLog", "()Lv9/e;", "log", "<init>", "(Lcom/withings/library/authentication/login/Session;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedPhoneNumberSensitiveActionStateImpl implements NeedPhoneNumberSensitiveActionState, a {
    private final g accountApi$delegate;
    private final g log$delegate;
    private final g needCode2FASensitiveActionFactory$delegate;
    private final g networkExceptionChecker$delegate;
    private final com.withings.library.authentication.login.Session session;

    public NeedPhoneNumberSensitiveActionStateImpl(com.withings.library.authentication.login.Session session) {
        u.j(session, "session");
        this.session = session;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.accountApi$delegate = h.a(lazyThreadSafetyMode, new NeedPhoneNumberSensitiveActionStateImpl$special$$inlined$inject$default$1(this, null, null));
        this.networkExceptionChecker$delegate = h.a(lazyThreadSafetyMode, new NeedPhoneNumberSensitiveActionStateImpl$special$$inlined$inject$default$2(this, null, null));
        this.needCode2FASensitiveActionFactory$delegate = h.a(lazyThreadSafetyMode, new NeedPhoneNumberSensitiveActionStateImpl$special$$inlined$inject$default$3(this, null, null));
        this.log$delegate = KoinKt.injectLogger(this, "NeedPhoneNumberSensitiveActionState");
    }

    private final AccountApi getAccountApi() {
        return (AccountApi) this.accountApi$delegate.getValue();
    }

    private final e getLog() {
        return (e) this.log$delegate.getValue();
    }

    private final NeedCode2FASensitiveActionFactory getNeedCode2FASensitiveActionFactory() {
        return (NeedCode2FASensitiveActionFactory) this.needCode2FASensitiveActionFactory$delegate.getValue();
    }

    private final NetworkExceptionChecker getNetworkExceptionChecker() {
        return (NetworkExceptionChecker) this.networkExceptionChecker$delegate.getValue();
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    @Override // com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object registerPhoneNumber(java.lang.String r7, qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState.OutputState> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.withings.library.authentication.sensitiveaction.impl.NeedPhoneNumberSensitiveActionStateImpl$registerPhoneNumber$1
            if (r0 == 0) goto L13
            r0 = r8
            com.withings.library.authentication.sensitiveaction.impl.NeedPhoneNumberSensitiveActionStateImpl$registerPhoneNumber$1 r0 = (com.withings.library.authentication.sensitiveaction.impl.NeedPhoneNumberSensitiveActionStateImpl$registerPhoneNumber$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.sensitiveaction.impl.NeedPhoneNumberSensitiveActionStateImpl$registerPhoneNumber$1 r0 = new com.withings.library.authentication.sensitiveaction.impl.NeedPhoneNumberSensitiveActionStateImpl$registerPhoneNumber$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            java.lang.String r3 = "Exception during registering phone number process"
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 != r4) goto L36
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r0.L$0
            com.withings.library.authentication.sensitiveaction.impl.NeedPhoneNumberSensitiveActionStateImpl r0 = (com.withings.library.authentication.sensitiveaction.impl.NeedPhoneNumberSensitiveActionStateImpl) r0
            nm0.l.b(r8)     // Catch: java.lang.Exception -> L31 com.withings.library.authentication.api.error.WrongStatusException -> L33
            goto L5f
        L31:
            r7 = move-exception
            goto L7a
        L33:
            r7 = move-exception
            goto La1
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            nm0.l.b(r8)
            com.withings.library.authentication.api.account.AccountApi r8 = r6.getAccountApi()     // Catch: java.lang.Exception -> L74 com.withings.library.authentication.api.error.WrongStatusException -> L77
            com.withings.library.authentication.login.Session r2 = r6.session     // Catch: java.lang.Exception -> L74 com.withings.library.authentication.api.error.WrongStatusException -> L77
            java.lang.String r2 = r2.getSessionId()     // Catch: java.lang.Exception -> L74 com.withings.library.authentication.api.error.WrongStatusException -> L77
            com.withings.library.authentication.login.Session r5 = r6.session     // Catch: java.lang.Exception -> L74 com.withings.library.authentication.api.error.WrongStatusException -> L77
            com.withings.library.authentication.login.Server r5 = r5.getServer()     // Catch: java.lang.Exception -> L74 com.withings.library.authentication.api.error.WrongStatusException -> L77
            r0.L$0 = r6     // Catch: java.lang.Exception -> L74 com.withings.library.authentication.api.error.WrongStatusException -> L77
            r0.L$1 = r7     // Catch: java.lang.Exception -> L74 com.withings.library.authentication.api.error.WrongStatusException -> L77
            r0.label = r4     // Catch: java.lang.Exception -> L74 com.withings.library.authentication.api.error.WrongStatusException -> L77
            java.lang.Object r8 = r8.setupPhoneAndRequestConfirmationCode(r2, r7, r5, r0)     // Catch: java.lang.Exception -> L74 com.withings.library.authentication.api.error.WrongStatusException -> L77
            if (r8 != r1) goto L5e
            return r1
        L5e:
            r0 = r6
        L5f:
            com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState$OutputState$SuccessNeedCode2FA r8 = new com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState$OutputState$SuccessNeedCode2FA     // Catch: java.lang.Exception -> L31 com.withings.library.authentication.api.error.WrongStatusException -> L33
            com.withings.library.authentication.sensitiveaction.factory.NeedCode2FASensitiveActionFactory r1 = r0.getNeedCode2FASensitiveActionFactory()     // Catch: java.lang.Exception -> L31 com.withings.library.authentication.api.error.WrongStatusException -> L33
            com.withings.library.authentication.login.Session r2 = r0.session     // Catch: java.lang.Exception -> L31 com.withings.library.authentication.api.error.WrongStatusException -> L33
            com.withings.library.authentication.sensitiveaction.state.Sequence$Creation r4 = new com.withings.library.authentication.sensitiveaction.state.Sequence$Creation     // Catch: java.lang.Exception -> L31 com.withings.library.authentication.api.error.WrongStatusException -> L33
            r4.<init>(r0)     // Catch: java.lang.Exception -> L31 com.withings.library.authentication.api.error.WrongStatusException -> L33
            com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction r7 = r1.build(r7, r2, r4)     // Catch: java.lang.Exception -> L31 com.withings.library.authentication.api.error.WrongStatusException -> L33
            r8.<init>(r7)     // Catch: java.lang.Exception -> L31 com.withings.library.authentication.api.error.WrongStatusException -> L33
            goto Lb1
        L74:
            r7 = move-exception
            r0 = r6
            goto L7a
        L77:
            r7 = move-exception
            r0 = r6
            goto La1
        L7a:
            com.withings.library.authentication.api.error.NetworkExceptionChecker r8 = r0.getNetworkExceptionChecker()
            boolean r8 = r8.isNetworkException(r7)
            if (r8 == 0) goto L94
            v9.e r7 = r0.getLog()
            java.lang.String r8 = "Network error detected during registering phone number process"
            r7.a(r8)
            com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState$OutputState$NetworkError r7 = new com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState$OutputState$NetworkError
            r7.<init>(r0)
        L92:
            r8 = r7
            goto Lb1
        L94:
            v9.e r8 = r0.getLog()
            r8.b(r3, r7)
            com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState$OutputState$GenericError r7 = new com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState$OutputState$GenericError
            r7.<init>(r0)
            goto L92
        La1:
            v9.e r8 = r0.getLog()
            r8.b(r3, r7)
            com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState$OutputState$WithingsError r8 = new com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState$OutputState$WithingsError
            int r7 = r7.getStatus()
            r8.<init>(r0, r7)
        Lb1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedPhoneNumberSensitiveActionStateImpl.registerPhoneNumber(java.lang.String, qm0.d):java.lang.Object");
    }
}
