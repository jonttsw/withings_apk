package com.withings.library.authentication.updateaccount;

import com.withings.library.authentication.api.account.AccountApi;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import nm0.g;
import nm0.h;
import pq0.a;
/* compiled from: UpdateAccountServiceImpl.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/withings/library/authentication/updateaccount/UpdateAccountServiceImpl;", "Lcom/withings/library/authentication/updateaccount/UpdateAccountService;", "Lpq0/a;", "", "sessionId", "", "accountId", "Lcom/withings/library/authentication/login/Server;", "server", "Lcom/withings/library/authentication/api/account/AccountContext;", "getAccountContext", "(Ljava/lang/String;JLcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/updateaccount/AccountContextRequest;", "accountContextRequest", "Lnm0/y;", "updateAccountContext", "(Lcom/withings/library/authentication/updateaccount/AccountContextRequest;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi$delegate", "Lnm0/g;", "getAccountApi", "()Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi", "<init>", "()V", "Companion", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class UpdateAccountServiceImpl implements UpdateAccountService, a {
    public static final int APPLITYPE = 20;
    public static final Companion Companion = new Companion(null);
    private final g accountApi$delegate = h.a(LazyThreadSafetyMode.f76136a, new UpdateAccountServiceImpl$special$$inlined$inject$default$1(this, null, null));

    /* compiled from: UpdateAccountServiceImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/library/authentication/updateaccount/UpdateAccountServiceImpl$Companion;", "", "()V", "APPLITYPE", "", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    private final AccountApi getAccountApi() {
        return (AccountApi) this.accountApi$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    @Override // com.withings.library.authentication.updateaccount.UpdateAccountService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getAccountContext(java.lang.String r9, long r10, com.withings.library.authentication.login.Server r12, qm0.d<? super com.withings.library.authentication.api.account.AccountContext> r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof com.withings.library.authentication.updateaccount.UpdateAccountServiceImpl$getAccountContext$1
            if (r0 == 0) goto L14
            r0 = r13
            com.withings.library.authentication.updateaccount.UpdateAccountServiceImpl$getAccountContext$1 r0 = (com.withings.library.authentication.updateaccount.UpdateAccountServiceImpl$getAccountContext$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.withings.library.authentication.updateaccount.UpdateAccountServiceImpl$getAccountContext$1 r0 = new com.withings.library.authentication.updateaccount.UpdateAccountServiceImpl$getAccountContext$1
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r9 = r7.L$1
            kotlinx.serialization.json.Json r9 = (kotlinx.serialization.json.Json) r9
            java.lang.Object r10 = r7.L$0
            kotlinx.serialization.json.Json r10 = (kotlinx.serialization.json.Json) r10
            nm0.l.b(r13)
            goto L5c
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            nm0.l.b(r13)
            com.withings.library.authentication.updateaccount.UpdateAccountServiceImpl$getAccountContext$jsonParser$1 r13 = com.withings.library.authentication.updateaccount.UpdateAccountServiceImpl$getAccountContext$jsonParser$1.INSTANCE
            r1 = 0
            kotlinx.serialization.json.Json r13 = kotlinx.serialization.json.JsonKt.Json$default(r1, r13, r2, r1)
            com.withings.library.authentication.api.account.AccountApi r1 = r8.getAccountApi()
            r7.L$0 = r13
            r7.L$1 = r13
            r7.label = r2
            r3 = 20
            r2 = r9
            r4 = r10
            r6 = r12
            java.lang.Object r9 = r1.getAccountContext(r2, r3, r4, r6, r7)
            if (r9 != r0) goto L59
            return r0
        L59:
            r10 = r13
            r13 = r9
            r9 = r10
        L5c:
            com.withings.library.authentication.api.account.AccountContextResponse r13 = (com.withings.library.authentication.api.account.AccountContextResponse) r13
            java.util.List r11 = r13.getAccount()
            java.lang.Object r11 = kotlin.collections.x.I(r11)
            com.withings.library.authentication.api.account.AccountResponse r11 = (com.withings.library.authentication.api.account.AccountResponse) r11
            java.lang.String r11 = r11.getContext()
            kotlinx.serialization.json.JsonElement r9 = r9.parseToJsonElement(r11)
            r10.getSerializersModule()
            com.withings.library.authentication.api.account.AccountContext$Companion r11 = com.withings.library.authentication.api.account.AccountContext.Companion
            kotlinx.serialization.KSerializer r11 = r11.serializer()
            java.lang.Object r9 = r10.decodeFromJsonElement(r11, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.updateaccount.UpdateAccountServiceImpl.getAccountContext(java.lang.String, long, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095 A[RETURN] */
    @Override // com.withings.library.authentication.updateaccount.UpdateAccountService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateAccountContext(com.withings.library.authentication.updateaccount.AccountContextRequest r13, qm0.d<? super nm0.y> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.withings.library.authentication.updateaccount.UpdateAccountServiceImpl$updateAccountContext$1
            if (r0 == 0) goto L14
            r0 = r14
            com.withings.library.authentication.updateaccount.UpdateAccountServiceImpl$updateAccountContext$1 r0 = (com.withings.library.authentication.updateaccount.UpdateAccountServiceImpl$updateAccountContext$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.withings.library.authentication.updateaccount.UpdateAccountServiceImpl$updateAccountContext$1 r0 = new com.withings.library.authentication.updateaccount.UpdateAccountServiceImpl$updateAccountContext$1
            r0.<init>(r12, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r7.label
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L4a
            if (r1 == r2) goto L35
            if (r1 != r8) goto L2d
            nm0.l.b(r14)
            goto L96
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            int r13 = r7.I$0
            java.lang.Object r1 = r7.L$2
            com.withings.library.authentication.api.account.AccountApi r1 = (com.withings.library.authentication.api.account.AccountApi) r1
            java.lang.Object r2 = r7.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r7.L$0
            com.withings.library.authentication.updateaccount.AccountContextRequest r3 = (com.withings.library.authentication.updateaccount.AccountContextRequest) r3
            nm0.l.b(r14)
            r11 = r3
            r3 = r13
            r13 = r11
            goto L76
        L4a:
            nm0.l.b(r14)
            long r3 = r13.getAccountId()
            java.lang.String r14 = r13.getSessionId()
            com.withings.library.authentication.api.account.AccountApi r9 = r12.getAccountApi()
            int r10 = (int) r3
            com.withings.library.authentication.login.Server r5 = r13.getServer()
            r7.L$0 = r13
            r7.L$1 = r14
            r7.L$2 = r9
            r7.I$0 = r10
            r7.label = r2
            r1 = r12
            r2 = r14
            r6 = r7
            java.lang.Object r1 = r1.getAccountContext(r2, r3, r5, r6)
            if (r1 != r0) goto L72
            return r0
        L72:
            r2 = r14
            r14 = r1
            r1 = r9
            r3 = r10
        L76:
            com.withings.library.authentication.api.account.AccountContext r14 = (com.withings.library.authentication.api.account.AccountContext) r14
            com.withings.library.authentication.api.account.AccountContext r4 = r13.getAccountContext()
            java.lang.String r4 = com.withings.library.authentication.api.account.AccountContextKt.updateContextFromAccountContext(r14, r4)
            com.withings.library.authentication.login.Server r6 = r13.getServer()
            r13 = 0
            r7.L$0 = r13
            r7.L$1 = r13
            r7.L$2 = r13
            r7.label = r8
            r5 = 20
            java.lang.Object r13 = r1.updateAccountContext(r2, r3, r4, r5, r6, r7)
            if (r13 != r0) goto L96
            return r0
        L96:
            nm0.y r13 = nm0.y.f85009a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.updateaccount.UpdateAccountServiceImpl.updateAccountContext(com.withings.library.authentication.updateaccount.AccountContextRequest, qm0.d):java.lang.Object");
    }
}
