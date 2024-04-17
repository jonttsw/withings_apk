package com.withings.tutorials.ui.screens.modes.pregnancy;

import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PregnancyModeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel$1", f = "PregnancyModeViewModel.kt", l = {121, 123, 125, 126, 127}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class m1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f45990a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PregnancyModeViewModel f45991b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(PregnancyModeViewModel pregnancyModeViewModel, qm0.d<? super m1> dVar) {
        super(2, dVar);
        this.f45991b = pregnancyModeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new m1(this.f45991b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((m1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r12.f45990a
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel r7 = r12.f45991b
            if (r1 == 0) goto L2d
            if (r1 == r6) goto L29
            if (r1 == r5) goto L25
            if (r1 == r4) goto L20
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            goto L20
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            nm0.l.b(r13)
            goto Lb1
        L25:
            nm0.l.b(r13)
            goto L60
        L29:
            nm0.l.b(r13)
            goto L4e
        L2d:
            nm0.l.b(r13)
            long r8 = com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel.t0(r7)
            r10 = -1
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 != 0) goto L4e
            kotlinx.coroutines.flow.MutableStateFlow r13 = com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel.y0(r7)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "No user available for pregnancy"
            r1.<init>(r8)
            r12.f45990a = r6
            java.lang.Object r13 = r13.emit(r1, r12)
            if (r13 != r0) goto L4e
            return r0
        L4e:
            u60.b r13 = com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel.k0(r7)
            com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel.t0(r7)
            r12.f45990a = r5
            r1 = 48
            java.util.ArrayList r13 = r13.a(r1)
            if (r13 != r0) goto L60
            return r0
        L60:
            java.util.List r13 = (java.util.List) r13
            boolean r1 = r13.isEmpty()
            if (r1 == 0) goto L7d
            boolean r1 = com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel.B0(r7)
            if (r1 == 0) goto L7d
            kotlinx.coroutines.flow.MutableStateFlow r13 = com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel.A0(r7)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r12.f45990a = r4
            java.lang.Object r13 = r13.emit(r1, r12)
            if (r13 != r0) goto Lb1
            return r0
        L7d:
            boolean r1 = r13.isEmpty()
            if (r1 == 0) goto L97
            kotlinx.coroutines.flow.MutableStateFlow r13 = com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel.y0(r7)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "No installed device found currently available for pregnancy"
            r1.<init>(r2)
            r12.f45990a = r3
            java.lang.Object r13 = r13.emit(r1, r12)
            if (r13 != r0) goto Lb1
            return r0
        L97:
            kotlinx.coroutines.flow.MutableStateFlow r1 = com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel.j0(r7)
            java.lang.Long r3 = com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel.i0(r7)
            if (r3 != 0) goto La8
            java.lang.Object r13 = kotlin.collections.x.K(r13)
            r3 = r13
            java.lang.Long r3 = (java.lang.Long) r3
        La8:
            r12.f45990a = r2
            java.lang.Object r13 = r1.emit(r3, r12)
            if (r13 != r0) goto Lb1
            return r0
        Lb1:
            nm0.y r13 = nm0.y.f85009a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.screens.modes.pregnancy.m1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
