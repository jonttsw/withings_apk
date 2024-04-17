package com.withings.weight.ui;

import k1.o1;
import k1.r0;
/* compiled from: SegmentalBodyCompositionActivity.kt */
/* loaded from: classes4.dex */
final class o extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SegmentalBodyCompositionActivity f47764a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o1<u90.i> f47765b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f47766c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(SegmentalBodyCompositionActivity segmentalBodyCompositionActivity, r0 r0Var, r8.n nVar) {
        super(1);
        this.f47764a = segmentalBodyCompositionActivity;
        this.f47765b = r0Var;
        this.f47766c = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        r8.m NavHost = mVar;
        kotlin.jvm.internal.u.j(NavHost, "$this$NavHost");
        SegmentalBodyCompositionDestination segmentalBodyCompositionDestination = SegmentalBodyCompositionDestination.f47604c;
        r8.m mVar2 = new r8.m(NavHost.f(), segmentalBodyCompositionDestination.d(), SegmentalBodyCompositionDestination.f47605d.d());
        SegmentalBodyCompositionActivity segmentalBodyCompositionActivity = this.f47764a;
        o1<u90.i> o1Var = this.f47765b;
        r8.n nVar = this.f47766c;
        m0.t.f(mVar2, segmentalBodyCompositionDestination, new s1.a(true, 1940301605, new j(segmentalBodyCompositionActivity, o1Var, nVar)));
        m0.t.f(mVar2, SegmentalBodyCompositionDestination.f47606e, new s1.a(true, -1578188466, new n(segmentalBodyCompositionActivity, nVar)));
        NavHost.e(mVar2);
        return nm0.y.f85009a;
    }
}
