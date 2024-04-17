package com.withings.healthscore.ui.exploredata;

import androidx.lifecycle.h1;
import com.withings.graph.GraphPeriod;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import nm0.y;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import ym0.q;
/* compiled from: HealthScoreExploreDataActivity.kt */
/* loaded from: classes3.dex */
final /* synthetic */ class d extends s implements q<GraphPeriod, DateTime, Interval, y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d(HealthScoreExploreDataViewModel healthScoreExploreDataViewModel) {
        super(3, healthScoreExploreDataViewModel, HealthScoreExploreDataViewModel.class, "onAfterViewportChanged", "onAfterViewportChanged(Lcom/withings/graph/GraphPeriod;Lorg/joda/time/DateTime;Lorg/joda/time/Interval;)V", 0);
    }

    @Override // ym0.q
    public final /* bridge */ /* synthetic */ y invoke(GraphPeriod graphPeriod, DateTime dateTime, Interval interval) {
        m(graphPeriod, dateTime, interval);
        return y.f85009a;
    }

    public final void m(GraphPeriod p02, DateTime p12, Interval p22) {
        u.j(p02, "p0");
        u.j(p12, "p1");
        u.j(p22, "p2");
        HealthScoreExploreDataViewModel healthScoreExploreDataViewModel = (HealthScoreExploreDataViewModel) this.receiver;
        healthScoreExploreDataViewModel.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(healthScoreExploreDataViewModel), null, null, new i(p02, healthScoreExploreDataViewModel, p22, null), 3, null);
    }
}
