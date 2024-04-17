package com.withings.authentication.mfa;

import androidx.lifecycle.g1;
import com.withings.account.core.repositories.AccountSessionRepository;
import javax.inject.Inject;
import kotlin.Metadata;
/* compiled from: TwoFactorMultiAccountViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/authentication/mfa/TwoFactorMultiAccountViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class TwoFactorMultiAccountViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final AccountSessionRepository f31603a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TwoFactorMultiAccountViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.TwoFactorMultiAccountViewModel", f = "TwoFactorMultiAccountViewModel.kt", l = {14}, m = "isMultiAccount")
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f31604a;

        /* renamed from: c  reason: collision with root package name */
        int f31606c;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31604a = obj;
            this.f31606c |= Integer.MIN_VALUE;
            return TwoFactorMultiAccountViewModel.this.f0(this);
        }
    }

    @Inject
    public TwoFactorMultiAccountViewModel(AccountSessionRepository accountSessionRepository) {
        kotlin.jvm.internal.u.j(accountSessionRepository, "accountSessionRepository");
        this.f31603a = accountSessionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f0(qm0.d<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.withings.authentication.mfa.TwoFactorMultiAccountViewModel.a
            if (r0 == 0) goto L13
            r0 = r5
            com.withings.authentication.mfa.TwoFactorMultiAccountViewModel$a r0 = (com.withings.authentication.mfa.TwoFactorMultiAccountViewModel.a) r0
            int r1 = r0.f31606c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31606c = r1
            goto L18
        L13:
            com.withings.authentication.mfa.TwoFactorMultiAccountViewModel$a r0 = new com.withings.authentication.mfa.TwoFactorMultiAccountViewModel$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f31604a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f31606c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            nm0.l.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            nm0.l.b(r5)
            r0.f31606c = r3
            com.withings.account.core.repositories.AccountSessionRepository r5 = r4.f31603a
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            if (r5 <= r3) goto L46
            goto L47
        L46:
            r3 = 0
        L47:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.mfa.TwoFactorMultiAccountViewModel.f0(qm0.d):java.lang.Object");
    }
}
