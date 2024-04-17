package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.wiscale2.track.data.Track;
/* compiled from: SleepDayViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepDayViewModel$mood$1$1", f = "SleepDayViewModel.kt", l = {76, 76}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class l1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<fx.g>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f61139a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f61140b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Track f61141c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ hx.e f61142d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(Track track, hx.e eVar, qm0.d<? super l1> dVar) {
        super(2, dVar);
        this.f61141c = track;
        this.f61142d = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        l1 l1Var = new l1(this.f61141c, this.f61142d, dVar);
        l1Var.f61140b = obj;
        return l1Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<fx.g> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((l1) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r7.f61139a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 == r4) goto L19
            if (r1 != r3) goto L11
            nm0.l.b(r8)
            goto L51
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            java.lang.Object r1 = r7.f61140b
            androidx.lifecycle.h0 r1 = (androidx.lifecycle.h0) r1
            nm0.l.b(r8)
            goto L42
        L21:
            nm0.l.b(r8)
            java.lang.Object r8 = r7.f61140b
            r1 = r8
            androidx.lifecycle.h0 r1 = (androidx.lifecycle.h0) r1
            com.withings.wiscale2.track.data.Track r8 = r7.f61141c
            if (r8 == 0) goto L45
            long r5 = r8.getUserId()
            java.lang.Long r8 = r8.getId()
            r7.f61140b = r1
            r7.f61139a = r4
            hx.e r4 = r7.f61142d
            fx.g r8 = r4.a(r5, r8)
            if (r8 != r0) goto L42
            return r0
        L42:
            fx.g r8 = (fx.g) r8
            goto L46
        L45:
            r8 = r2
        L46:
            r7.f61140b = r2
            r7.f61139a = r3
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L51
            return r0
        L51:
            nm0.y r8 = nm0.y.f85009a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.sleep.ui.sleepscore.l1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
