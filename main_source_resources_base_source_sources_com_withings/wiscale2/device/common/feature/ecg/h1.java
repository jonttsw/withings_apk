package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class h1 extends kotlin.jvm.internal.w implements ym0.l<s0.i0, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ rq.e f51389a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51390b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51391c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(rq.e eVar, EcgActivationActivity ecgActivationActivity, ym0.a<nm0.y> aVar) {
        super(1);
        this.f51389a = eVar;
        this.f51390b = ecgActivationActivity;
        this.f51391c = aVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(s0.i0 i0Var) {
        s0.i0 LazyColumn = i0Var;
        kotlin.jvm.internal.u.j(LazyColumn, "$this$LazyColumn");
        rq.e eVar = this.f51389a;
        s0.i0.g(LazyColumn, null, new s1.a(true, -558254474, new e1(eVar)), 3);
        s0.i0.g(LazyColumn, null, new s1.a(true, 1967247903, new g1(eVar, this.f51390b, this.f51391c)), 3);
        return nm0.y.f85009a;
    }
}
