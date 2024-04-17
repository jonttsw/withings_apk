package com.withings.library.authentication.recovery;

import com.withings.library.authentication.api.account.AccountApi;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import nm0.g;
import nm0.h;
import org.jivesoftware.smack.packet.Session;
import pq0.a;
/* compiled from: RecoveryCodeServiceImpl.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/withings/library/authentication/recovery/RecoveryCodeServiceImpl;", "Lcom/withings/library/authentication/recovery/RecoveryCodeService;", "Lpq0/a;", "Lcom/withings/library/authentication/login/Session;", Session.ELEMENT, "", "getRecoveryCode", "(Lcom/withings/library/authentication/login/Session;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi$delegate", "Lnm0/g;", "getAccountApi", "()Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi", "<init>", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RecoveryCodeServiceImpl implements RecoveryCodeService, a {
    private final g accountApi$delegate = h.a(LazyThreadSafetyMode.f76136a, new RecoveryCodeServiceImpl$special$$inlined$inject$default$1(this, null, null));

    private final AccountApi getAccountApi() {
        return (AccountApi) this.accountApi$delegate.getValue();
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    @Override // com.withings.library.authentication.recovery.RecoveryCodeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getRecoveryCode(com.withings.library.authentication.login.Session r7, qm0.d<? super java.lang.String> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.withings.library.authentication.recovery.RecoveryCodeServiceImpl$getRecoveryCode$1
            if (r0 == 0) goto L13
            r0 = r8
            com.withings.library.authentication.recovery.RecoveryCodeServiceImpl$getRecoveryCode$1 r0 = (com.withings.library.authentication.recovery.RecoveryCodeServiceImpl$getRecoveryCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.recovery.RecoveryCodeServiceImpl$getRecoveryCode$1 r0 = new com.withings.library.authentication.recovery.RecoveryCodeServiceImpl$getRecoveryCode$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r8)
            goto L89
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.L$1
            com.withings.library.authentication.login.Session r7 = (com.withings.library.authentication.login.Session) r7
            java.lang.Object r2 = r0.L$0
            com.withings.library.authentication.recovery.RecoveryCodeServiceImpl r2 = (com.withings.library.authentication.recovery.RecoveryCodeServiceImpl) r2
            nm0.l.b(r8)
            goto L5b
        L3e:
            nm0.l.b(r8)
            com.withings.library.authentication.api.account.AccountApi r8 = r6.getAccountApi()
            java.lang.String r2 = r7.getSessionId()
            com.withings.library.authentication.login.Server r5 = r7.getServer()
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r8.getRecoveryCode(r2, r5, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            r2 = r6
        L5b:
            com.withings.library.authentication.api.account.RecoveryCodeResponse r8 = (com.withings.library.authentication.api.account.RecoveryCodeResponse) r8
            java.util.List r8 = r8.getCodes()
            java.lang.Object r8 = kotlin.collections.x.K(r8)
            com.withings.library.authentication.api.account.Code r8 = (com.withings.library.authentication.api.account.Code) r8
            if (r8 == 0) goto L6f
            java.lang.String r8 = r8.getCode()
            if (r8 != 0) goto L9b
        L6f:
            com.withings.library.authentication.api.account.AccountApi r8 = r2.getAccountApi()
            java.lang.String r2 = r7.getSessionId()
            com.withings.library.authentication.login.Server r7 = r7.getServer()
            r4 = 0
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r8 = r8.generateRecoveryCode(r2, r7, r0)
            if (r8 != r1) goto L89
            return r1
        L89:
            com.withings.library.authentication.api.account.RecoveryCodeResponse r8 = (com.withings.library.authentication.api.account.RecoveryCodeResponse) r8
            java.util.List r7 = r8.getCodes()
            java.lang.Object r7 = kotlin.collections.x.K(r7)
            com.withings.library.authentication.api.account.Code r7 = (com.withings.library.authentication.api.account.Code) r7
            if (r7 == 0) goto L9c
            java.lang.String r8 = r7.getCode()
        L9b:
            return r8
        L9c:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "Can't get a valid recovery code"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.recovery.RecoveryCodeServiceImpl.getRecoveryCode(com.withings.library.authentication.login.Session, qm0.d):java.lang.Object");
    }
}
