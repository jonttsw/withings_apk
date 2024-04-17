package com.withings.weight.ui.limbExplore;

import androidx.lifecycle.h1;
import com.withings.graph.GraphPeriod;
import com.withings.weight.core.model.LimbModel;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.joda.time.DateTime;
import org.joda.time.Interval;
/* compiled from: SegmentalLimbExploreActivity.kt */
/* loaded from: classes4.dex */
final class e extends kotlin.jvm.internal.w implements ym0.q<GraphPeriod, DateTime, Interval, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SegmentalLimbExploreActivity f47686a;

    /* compiled from: SegmentalLimbExploreActivity.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ sm0.a<LimbModel> f47687a = sm0.b.a(LimbModel.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SegmentalLimbExploreActivity segmentalLimbExploreActivity) {
        super(3);
        this.f47686a = segmentalLimbExploreActivity;
    }

    @Override // ym0.q
    public final nm0.y invoke(GraphPeriod graphPeriod, DateTime dateTime, Interval interval) {
        GraphPeriod graphPeriod2 = graphPeriod;
        DateTime date = dateTime;
        Interval interval2 = interval;
        kotlin.jvm.internal.u.j(graphPeriod2, "graphPeriod");
        kotlin.jvm.internal.u.j(date, "date");
        kotlin.jvm.internal.u.j(interval2, "interval");
        sm0.a<LimbModel> aVar = a.f47687a;
        SegmentalLimbExploreActivity segmentalLimbExploreActivity = this.f47686a;
        p90.a.b((LimbModel) aVar.get(SegmentalLimbExploreActivity.A3(segmentalLimbExploreActivity)), graphPeriod2.a(), date);
        a0 D3 = SegmentalLimbExploreActivity.D3(segmentalLimbExploreActivity);
        D3.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(D3), null, null, new u(graphPeriod2, D3, interval2, null), 3, null);
        return nm0.y.f85009a;
    }
}
