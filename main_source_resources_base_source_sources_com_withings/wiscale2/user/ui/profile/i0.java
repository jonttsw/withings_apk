package com.withings.wiscale2.user.ui.profile;

import aa0.a;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: EditProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.user.ui.profile.EditProfileViewModel$deleteUser$1", f = "EditProfileViewModel.kt", l = {209, 210, 213}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class i0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    s0 f61963a;

    /* renamed from: b  reason: collision with root package name */
    int f61964b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ s0 f61965c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileViewModel.kt */
    /* loaded from: classes5.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s0 f61966a;

        a(s0 s0Var) {
            this.f61966a = s0Var;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            this.f61966a.T0().setValue((a.AbstractC0006a) obj);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(s0 s0Var, qm0.d<? super i0> dVar) {
        super(2, dVar);
        this.f61965c = s0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new i0(this.f61965c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((i0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r7.f61964b
            com.withings.wiscale2.user.ui.profile.s0 r2 = r7.f61965c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            nm0.l.b(r8)
            goto L61
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            com.withings.wiscale2.user.ui.profile.s0 r2 = r7.f61963a
            nm0.l.b(r8)
            goto L4e
        L23:
            nm0.l.b(r8)
            goto L37
        L27:
            nm0.l.b(r8)
            kotlinx.coroutines.flow.SharedFlow r8 = r2.c1()
            r7.f61964b = r5
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.first(r8, r7)
            if (r8 != r0) goto L37
            return r0
        L37:
            com.withings.user.core.models.User r8 = (com.withings.user.core.models.User) r8
            if (r8 == 0) goto L61
            aa0.a r1 = com.withings.wiscale2.user.ui.profile.s0.k0(r2)
            long r5 = r8.getId()
            r7.f61963a = r2
            r7.f61964b = r4
            kotlinx.coroutines.flow.Flow r8 = r1.f(r5)
            if (r8 != r0) goto L4e
            return r0
        L4e:
            kotlinx.coroutines.flow.Flow r8 = (kotlinx.coroutines.flow.Flow) r8
            com.withings.wiscale2.user.ui.profile.i0$a r1 = new com.withings.wiscale2.user.ui.profile.i0$a
            r1.<init>(r2)
            r2 = 0
            r7.f61963a = r2
            r7.f61964b = r3
            java.lang.Object r8 = r8.collect(r1, r7)
            if (r8 != r0) goto L61
            return r0
        L61:
            nm0.y r8 = nm0.y.f85009a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.user.ui.profile.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
