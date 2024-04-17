package com.withings.wiscale2.user.ui.profile;

import com.withings.library.authentication.api.ConstantsWs;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.user.ui.profile.EditProfileViewModel$updateAccountUnits$1", f = "EditProfileViewModel.kt", l = {ConstantsWs.WS_STATUS_TOOBIG, ConstantsWs.WS_STATUS_WRONGFW, ConstantsWs.WS_STATUS_USERUPDATEERROR}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class t0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    l70.v f62072a;

    /* renamed from: b  reason: collision with root package name */
    int f62073b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ s0 f62074c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f62075d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f62076e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(s0 s0Var, int i11, int i12, qm0.d<? super t0> dVar) {
        super(2, dVar);
        this.f62074c = s0Var;
        this.f62075d = i11;
        this.f62076e = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new t0(this.f62074c, this.f62075d, this.f62076e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((t0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r12.f62073b
            r2 = 3
            r3 = 2
            r4 = 1
            com.withings.wiscale2.user.ui.profile.s0 r5 = r12.f62074c
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            nm0.l.b(r13)
            goto L81
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            l70.v r1 = r12.f62072a
            nm0.l.b(r13)
            goto L5d
        L23:
            nm0.l.b(r13)
            goto L37
        L27:
            nm0.l.b(r13)
            kotlinx.coroutines.flow.Flow r13 = com.withings.wiscale2.user.ui.profile.s0.y0(r5)
            r12.f62073b = r4
            java.lang.Object r13 = kotlinx.coroutines.flow.FlowKt.first(r13, r12)
            if (r13 != r0) goto L37
            return r0
        L37:
            r1 = r13
            l70.v r1 = (l70.v) r1
            int r13 = r1.c()
            int r4 = r12.f62075d
            if (r13 == r4) goto L5d
            l70.w r13 = com.withings.wiscale2.user.ui.profile.s0.z0(r5)
            r9 = 0
            r10 = 0
            int r7 = r12.f62075d
            r8 = 0
            r11 = 14
            r6 = r1
            l70.v r4 = l70.v.a(r6, r7, r8, r9, r10, r11)
            r12.f62072a = r1
            r12.f62073b = r3
            java.lang.Object r13 = r13.b(r4, r12)
            if (r13 != r0) goto L5d
            return r0
        L5d:
            r6 = r1
            int r13 = r6.e()
            int r1 = r12.f62076e
            if (r13 == r1) goto L81
            l70.w r13 = com.withings.wiscale2.user.ui.profile.s0.z0(r5)
            r9 = 0
            r10 = 0
            r7 = 0
            int r8 = r12.f62076e
            r11 = 13
            l70.v r1 = l70.v.a(r6, r7, r8, r9, r10, r11)
            r3 = 0
            r12.f62072a = r3
            r12.f62073b = r2
            java.lang.Object r13 = r13.b(r1, r12)
            if (r13 != r0) goto L81
            return r0
        L81:
            nm0.y r13 = nm0.y.f85009a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.user.ui.profile.t0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
