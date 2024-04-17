package com.withings.authentication.mfa;

import com.withings.account.network.ws.AccountRemoteRepository;
/* compiled from: ResolveMultiFactorActivity.kt */
/* loaded from: classes3.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final AccountRemoteRepository f31612a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResolveMultiFactorActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.HasValidAuthFactor", f = "ResolveMultiFactorActivity.kt", l = {186}, m = "execute")
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f31613a;

        /* renamed from: c  reason: collision with root package name */
        int f31615c;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31613a = obj;
            this.f31615c |= Integer.MIN_VALUE;
            return b.this.a(this);
        }
    }

    public b(AccountRemoteRepository accountRemoteRepository) {
        kotlin.jvm.internal.u.j(accountRemoteRepository, "accountRemoteRepository");
        this.f31612a = accountRemoteRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(qm0.d<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.withings.authentication.mfa.b.a
            if (r0 == 0) goto L13
            r0 = r5
            com.withings.authentication.mfa.b$a r0 = (com.withings.authentication.mfa.b.a) r0
            int r1 = r0.f31615c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31615c = r1
            goto L18
        L13:
            com.withings.authentication.mfa.b$a r0 = new com.withings.authentication.mfa.b$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f31613a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f31615c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            nm0.l.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            nm0.l.b(r5)
            com.withings.account.network.ws.AccountRemoteRepository r5 = r4.f31612a
            java.lang.String r2 = "get_authentication_factors"
            com.withings.account.network.ws.AccountRemoteRepository r5 = r5.withSyncContext(r2)
            r0.f31615c = r3
            java.lang.Object r5 = r5.getAuthentication(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            com.withings.account.models.TwoFactorAuthentication$Response r5 = (com.withings.account.models.TwoFactorAuthentication.Response) r5
            java.util.List r5 = r5.getAuthentications()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r0 = r5 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L5b
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
        L59:
            r3 = r1
            goto L7b
        L5b:
            java.util.Iterator r5 = r5.iterator()
        L5f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r5.next()
            com.withings.account.models.TwoFactorAuthentication r0 = (com.withings.account.models.TwoFactorAuthentication) r0
            boolean r2 = r0 instanceof com.withings.account.models.TwoFactorAuthentication.Totp
            if (r2 != 0) goto L7b
            boolean r2 = r0 instanceof com.withings.account.models.TwoFactorAuthentication.Whatsapp
            if (r2 != 0) goto L7b
            boolean r2 = r0 instanceof com.withings.account.models.TwoFactorAuthentication.Phone
            if (r2 != 0) goto L7b
            boolean r0 = r0 instanceof com.withings.account.models.TwoFactorAuthentication.Call
            if (r0 == 0) goto L5f
        L7b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.mfa.b.a(qm0.d):java.lang.Object");
    }
}
