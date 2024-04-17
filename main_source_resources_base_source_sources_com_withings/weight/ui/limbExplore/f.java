package com.withings.weight.ui.limbExplore;
/* compiled from: SegmentalLimbExploreActivity.kt */
/* loaded from: classes4.dex */
final class f extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SegmentalLimbExploreActivity f47688a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SegmentalLimbExploreActivity segmentalLimbExploreActivity) {
        super(2);
        this.f47688a = segmentalLimbExploreActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            SegmentalLimbExploreActivity segmentalLimbExploreActivity = this.f47688a;
            ks.p.c((ws.b) h6.b.c(SegmentalLimbExploreActivity.D3(segmentalLimbExploreActivity).t0(), aVar2).getValue(), new d(segmentalLimbExploreActivity), new e(segmentalLimbExploreActivity), null, aVar2, 8, 8);
        }
        return nm0.y.f85009a;
    }
}
