package com.withings.library.authentication.login.state.impl;

import com.withings.library.authentication.api.account.AccountApi;
import com.withings.library.authentication.api.error.NetworkExceptionChecker;
import com.withings.library.authentication.di.KoinKt;
import com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation;
import com.withings.library.authentication.login.state.factory.NeedCode2FAFactory;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.jivesoftware.smack.packet.Session;
import pq0.a;
import v9.e;
/* compiled from: NeedPhoneNumber2FACreationImpl.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lcom/withings/library/authentication/login/state/impl/NeedPhoneNumber2FACreationImpl;", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "Lpq0/a;", "", "phoneNumber", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation$OutputState;", "registerPhoneNumber", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/login/Session;", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "getSession", "()Lcom/withings/library/authentication/login/Session;", "Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi$delegate", "Lnm0/g;", "getAccountApi", "()Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi", "Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker$delegate", "getNetworkExceptionChecker", "()Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker", "Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "needCode2FAFactory$delegate", "getNeedCode2FAFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "needCode2FAFactory", "Lv9/e;", "log$delegate", "getLog", "()Lv9/e;", "log", "<init>", "(Lcom/withings/library/authentication/login/Session;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedPhoneNumber2FACreationImpl implements NeedPhoneNumber2FACreation, a {
    private final g accountApi$delegate;
    private final g log$delegate;
    private final g needCode2FAFactory$delegate;
    private final g networkExceptionChecker$delegate;
    private final com.withings.library.authentication.login.Session session;

    public NeedPhoneNumber2FACreationImpl(com.withings.library.authentication.login.Session session) {
        u.j(session, "session");
        this.session = session;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.accountApi$delegate = h.a(lazyThreadSafetyMode, new NeedPhoneNumber2FACreationImpl$special$$inlined$inject$default$1(this, null, null));
        this.networkExceptionChecker$delegate = h.a(lazyThreadSafetyMode, new NeedPhoneNumber2FACreationImpl$special$$inlined$inject$default$2(this, null, null));
        this.needCode2FAFactory$delegate = h.a(lazyThreadSafetyMode, new NeedPhoneNumber2FACreationImpl$special$$inlined$inject$default$3(this, null, null));
        this.log$delegate = KoinKt.injectLogger(this, "NeedPhoneNumber2FACreation");
    }

    private final AccountApi getAccountApi() {
        return (AccountApi) this.accountApi$delegate.getValue();
    }

    private final e getLog() {
        return (e) this.log$delegate.getValue();
    }

    private final NeedCode2FAFactory getNeedCode2FAFactory() {
        return (NeedCode2FAFactory) this.needCode2FAFactory$delegate.getValue();
    }

    private final NetworkExceptionChecker getNetworkExceptionChecker() {
        return (NetworkExceptionChecker) this.networkExceptionChecker$delegate.getValue();
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    @Override // com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation
    public com.withings.library.authentication.login.Session getSession() {
        return this.session;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    @Override // com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object registerPhoneNumber(java.lang.String r7, qm0.d<? super com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation.OutputState> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.withings.library.authentication.login.state.impl.NeedPhoneNumber2FACreationImpl$registerPhoneNumber$1
            if (r0 == 0) goto L13
            r0 = r8
            com.withings.library.authentication.login.state.impl.NeedPhoneNumber2FACreationImpl$registerPhoneNumber$1 r0 = (com.withings.library.authentication.login.state.impl.NeedPhoneNumber2FACreationImpl$registerPhoneNumber$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.login.state.impl.NeedPhoneNumber2FACreationImpl$registerPhoneNumber$1 r0 = new com.withings.library.authentication.login.state.impl.NeedPhoneNumber2FACreationImpl$registerPhoneNumber$1
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
            com.withings.library.authentication.login.state.impl.NeedPhoneNumber2FACreationImpl r0 = (com.withings.library.authentication.login.state.impl.NeedPhoneNumber2FACreationImpl) r0
            nm0.l.b(r8)     // Catch: java.lang.Exception -> L31 com.withings.library.authentication.api.error.WrongStatusException -> L33
            goto L63
        L31:
            r7 = move-exception
            goto L80
        L33:
            r7 = move-exception
            goto La7
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            nm0.l.b(r8)
            com.withings.library.authentication.api.account.AccountApi r8 = r6.getAccountApi()     // Catch: java.lang.Exception -> L7a com.withings.library.authentication.api.error.WrongStatusException -> L7d
            com.withings.library.authentication.login.Session r2 = r6.getSession()     // Catch: java.lang.Exception -> L7a com.withings.library.authentication.api.error.WrongStatusException -> L7d
            java.lang.String r2 = r2.getSessionId()     // Catch: java.lang.Exception -> L7a com.withings.library.authentication.api.error.WrongStatusException -> L7d
            com.withings.library.authentication.login.Session r5 = r6.getSession()     // Catch: java.lang.Exception -> L7a com.withings.library.authentication.api.error.WrongStatusException -> L7d
            com.withings.library.authentication.login.Server r5 = r5.getServer()     // Catch: java.lang.Exception -> L7a com.withings.library.authentication.api.error.WrongStatusException -> L7d
            r0.L$0 = r6     // Catch: java.lang.Exception -> L7a com.withings.library.authentication.api.error.WrongStatusException -> L7d
            r0.L$1 = r7     // Catch: java.lang.Exception -> L7a com.withings.library.authentication.api.error.WrongStatusException -> L7d
            r0.label = r4     // Catch: java.lang.Exception -> L7a com.withings.library.authentication.api.error.WrongStatusException -> L7d
            java.lang.Object r8 = r8.setupPhoneAndRequestConfirmationCode(r2, r7, r5, r0)     // Catch: java.lang.Exception -> L7a com.withings.library.authentication.api.error.WrongStatusException -> L7d
            if (r8 != r1) goto L62
            return r1
        L62:
            r0 = r6
        L63:
            com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation$OutputState$SuccessNeedCode2FA r8 = new com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation$OutputState$SuccessNeedCode2FA     // Catch: java.lang.Exception -> L31 com.withings.library.authentication.api.error.WrongStatusException -> L33
            com.withings.library.authentication.login.state.factory.NeedCode2FAFactory r1 = r0.getNeedCode2FAFactory()     // Catch: java.lang.Exception -> L31 com.withings.library.authentication.api.error.WrongStatusException -> L33
            com.withings.library.authentication.login.state.Sequence$Creation r2 = new com.withings.library.authentication.login.state.Sequence$Creation     // Catch: java.lang.Exception -> L31 com.withings.library.authentication.api.error.WrongStatusException -> L33
            r2.<init>(r0)     // Catch: java.lang.Exception -> L31 com.withings.library.authentication.api.error.WrongStatusException -> L33
            com.withings.library.authentication.login.Session r4 = r0.getSession()     // Catch: java.lang.Exception -> L31 com.withings.library.authentication.api.error.WrongStatusException -> L33
            com.withings.library.authentication.login.state.NeedCode2FA r7 = r1.buildNeedCode2FA(r2, r4, r7)     // Catch: java.lang.Exception -> L31 com.withings.library.authentication.api.error.WrongStatusException -> L33
            r8.<init>(r7)     // Catch: java.lang.Exception -> L31 com.withings.library.authentication.api.error.WrongStatusException -> L33
            goto Lb7
        L7a:
            r7 = move-exception
            r0 = r6
            goto L80
        L7d:
            r7 = move-exception
            r0 = r6
            goto La7
        L80:
            com.withings.library.authentication.api.error.NetworkExceptionChecker r8 = r0.getNetworkExceptionChecker()
            boolean r8 = r8.isNetworkException(r7)
            if (r8 == 0) goto L9a
            v9.e r7 = r0.getLog()
            java.lang.String r8 = "Network error detected during registering phone number process"
            r7.a(r8)
            com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation$OutputState$NetworkError r7 = new com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation$OutputState$NetworkError
            r7.<init>(r0)
        L98:
            r8 = r7
            goto Lb7
        L9a:
            v9.e r8 = r0.getLog()
            r8.b(r3, r7)
            com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation$OutputState$GenericError r7 = new com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation$OutputState$GenericError
            r7.<init>(r0)
            goto L98
        La7:
            v9.e r8 = r0.getLog()
            r8.b(r3, r7)
            com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation$OutputState$WithingsError r8 = new com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation$OutputState$WithingsError
            int r7 = r7.getStatus()
            r8.<init>(r0, r7)
        Lb7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.NeedPhoneNumber2FACreationImpl.registerPhoneNumber(java.lang.String, qm0.d):java.lang.Object");
    }
}
