package com.withings.weight.presentation.ui;

import androidx.lifecycle.h1;
import com.withings.graph.GraphPeriod;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.joda.time.DateTime;
import org.joda.time.Interval;
/* compiled from: WeightExploreDataActivity.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class u0 extends kotlin.jvm.internal.s implements ym0.q<GraphPeriod, DateTime, Interval, nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(WeightExploreDataViewModel weightExploreDataViewModel) {
        super(3, weightExploreDataViewModel, WeightExploreDataViewModel.class, "onAfterViewportChanged", "onAfterViewportChanged(Lcom/withings/graph/GraphPeriod;Lorg/joda/time/DateTime;Lorg/joda/time/Interval;)V", 0);
    }

    @Override // ym0.q
    public final /* bridge */ /* synthetic */ nm0.y invoke(GraphPeriod graphPeriod, DateTime dateTime, Interval interval) {
        m(graphPeriod, dateTime, interval);
        return nm0.y.f85009a;
    }

    public final void m(GraphPeriod p02, DateTime p12, Interval p22) {
        kotlin.jvm.internal.u.j(p02, "p0");
        kotlin.jvm.internal.u.j(p12, "p1");
        kotlin.jvm.internal.u.j(p22, "p2");
        WeightExploreDataViewModel weightExploreDataViewModel = (WeightExploreDataViewModel) this.receiver;
        weightExploreDataViewModel.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(weightExploreDataViewModel), null, null, new x0(p02, weightExploreDataViewModel, p22, null), 3, null);
    }
}
