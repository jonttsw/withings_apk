package com.withings.cycletracking.ui;
/* compiled from: CycleTrackingActivity.kt */
/* loaded from: classes3.dex */
final class o0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f35713a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CycleTrackingActivity f35714b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f35715c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r8.n nVar, CycleTrackingActivity cycleTrackingActivity, ym0.a<nm0.y> aVar) {
        super(2);
        this.f35713a = nVar;
        this.f35714b = cycleTrackingActivity;
        this.f35715c = aVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r8.n nVar = this.f35713a;
            n0 n0Var = new n0(nVar, this.f35714b, this.f35715c);
            androidx.navigation.compose.s.b(nVar, "Dataviz", null, null, null, v.f35756a, w.f35976a, x.f35984a, y.f36088a, n0Var, aVar2, 115015736, 28);
        }
        return nm0.y.f85009a;
    }
}
