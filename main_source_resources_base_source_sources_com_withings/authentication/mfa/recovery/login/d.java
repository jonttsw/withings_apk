package com.withings.authentication.mfa.recovery.login;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import nm0.y;
import th.r;
import ym0.p;
/* compiled from: LoginRecoveryCodeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.recovery.login.LoginRecoveryCodeViewModel$getAndGenerateRecoveryCode$1", f = "LoginRecoveryCodeViewModel.kt", l = {64, 74}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31822a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LoginRecoveryCodeViewModel f31823b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoginRecoveryCodeViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LoginRecoveryCodeViewModel f31824a;

        a(LoginRecoveryCodeViewModel loginRecoveryCodeViewModel) {
            this.f31824a = loginRecoveryCodeViewModel;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            this.f31824a.q0().setValue((r.a) obj);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LoginRecoveryCodeViewModel loginRecoveryCodeViewModel, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f31823b = loginRecoveryCodeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new d(this.f31823b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r5.f31822a
            r2 = 2
            r3 = 1
            com.withings.authentication.mfa.recovery.login.LoginRecoveryCodeViewModel r4 = r5.f31823b
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            nm0.l.b(r6)
            goto L86
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            nm0.l.b(r6)
            goto L3c
        L1f:
            nm0.l.b(r6)
            com.withings.features.FeatureFlag r6 = com.withings.features.FeatureFlag.f39120n0
            boolean r6 = wr.b.c(r6)
            if (r6 == 0) goto L70
            cg.h r6 = new cg.h
            com.withings.library.authentication.setup2fa.Setup2FAService r1 = com.withings.authentication.mfa.recovery.login.LoginRecoveryCodeViewModel.p0(r4)
            r6.<init>(r1)
            r5.f31822a = r3
            java.lang.Object r6 = r6.a(r5)
            if (r6 != r0) goto L3c
            return r0
        L3c:
            cg.h$a r6 = (cg.h.a) r6
            cg.h$a$a r0 = cg.h.a.C0312a.f22724a
            boolean r0 = kotlin.jvm.internal.u.e(r6, r0)
            if (r0 == 0) goto L47
            goto L4f
        L47:
            cg.h$a$b r0 = cg.h.a.b.f22725a
            boolean r0 = kotlin.jvm.internal.u.e(r6, r0)
            if (r0 == 0) goto L59
        L4f:
            kotlinx.coroutines.flow.MutableStateFlow r6 = r4.q0()
            th.r$a$b r0 = th.r.a.b.f99921a
            r6.setValue(r0)
            goto L86
        L59:
            boolean r0 = r6 instanceof cg.h.a.c
            if (r0 == 0) goto L86
            kotlinx.coroutines.flow.MutableStateFlow r0 = r4.q0()
            th.r$a$d r1 = new th.r$a$d
            cg.h$a$c r6 = (cg.h.a.c) r6
            java.lang.String r6 = r6.a()
            r1.<init>(r6)
            r0.setValue(r1)
            goto L86
        L70:
            th.r r6 = com.withings.authentication.mfa.recovery.login.LoginRecoveryCodeViewModel.k0(r4)
            kotlinx.coroutines.flow.Flow r6 = r6.b()
            com.withings.authentication.mfa.recovery.login.d$a r1 = new com.withings.authentication.mfa.recovery.login.d$a
            r1.<init>(r4)
            r5.f31822a = r2
            java.lang.Object r6 = r6.collect(r1, r5)
            if (r6 != r0) goto L86
            return r0
        L86:
            nm0.y r6 = nm0.y.f85009a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.mfa.recovery.login.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
