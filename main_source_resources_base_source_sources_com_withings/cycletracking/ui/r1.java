package com.withings.cycletracking.ui;
/* compiled from: CycleTrackingFactorsScreen.kt */
/* loaded from: classes3.dex */
final class r1 extends kotlin.jvm.internal.w implements ym0.l<fr.a, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<fr.a> f35742a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(k1.r0<fr.a> r0Var) {
        super(1);
        this.f35742a = r0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(fr.a aVar) {
        fr.a factor = aVar;
        kotlin.jvm.internal.u.j(factor, "factor");
        this.f35742a.setValue(factor);
        return nm0.y.f85009a;
    }
}
