package com.withings.wiscale2.vo2max.view;
/* compiled from: Vo2MaxComparison.kt */
/* loaded from: classes5.dex */
final class p extends kotlin.jvm.internal.w implements ym0.l<d, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Vo2MaxComparisonView f62796a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Vo2MaxComparisonView vo2MaxComparisonView) {
        super(1);
        this.f62796a = vo2MaxComparisonView;
    }

    @Override // ym0.l
    public final nm0.y invoke(d dVar) {
        d comparisonData = dVar;
        kotlin.jvm.internal.u.j(comparisonData, "comparisonData");
        Vo2MaxComparisonView.g(this.f62796a, comparisonData);
        return nm0.y.f85009a;
    }
}
