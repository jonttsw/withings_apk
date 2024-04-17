package com.withings.healthscore.ui.exploredata;

import android.annotation.SuppressLint;
import android.content.Context;
import com.withings.graph.GraphView;
import com.withings.graph.TimeGraphView;
import com.withings.graph.selection.SelectionMode;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Interval;
/* compiled from: HealthScoreExploreDataGraphModifier.kt */
/* loaded from: classes3.dex */
public final class g implements xs.c {

    /* renamed from: b  reason: collision with root package name */
    private final Interval f40571b;

    /* renamed from: c  reason: collision with root package name */
    private final List<nm0.j<DateTime, Float>> f40572c;

    /* renamed from: d  reason: collision with root package name */
    private final at.a f40573d;

    /* renamed from: e  reason: collision with root package name */
    private final String f40574e;

    public g(Interval maxViewportInterval, ArrayList arrayList, at.a dataVizViewportState, String str) {
        u.j(maxViewportInterval, "maxViewportInterval");
        u.j(dataVizViewportState, "dataVizViewportState");
        this.f40571b = maxViewportInterval;
        this.f40572c = arrayList;
        this.f40573d = dataVizViewportState;
        this.f40574e = str;
    }

    @Override // xs.c
    @SuppressLint({"ClickableViewAccessibility"})
    public final void a(GraphView graph) {
        u.j(graph, "graph");
        if (graph instanceof TimeGraphView) {
            TimeGraphView timeGraphView = (TimeGraphView) graph;
            int color = androidx.core.content.a.getColor(timeGraphView.getContext(), C1987R.color.datavizGridlineDefault);
            com.withings.authentication.mfa.resolve.components.h a11 = xs.f.a();
            Interval interval = this.f40571b;
            DateTime minusMonths = interval.getStart().minusMonths(1);
            u.i(minusMonths, "minusMonths(...)");
            DateTime plusMonths = interval.getEnd().plusMonths(2);
            u.i(plusMonths, "plusMonths(...)");
            Context context = timeGraphView.getContext();
            u.i(context, "getContext(...)");
            xs.d.a(this.f40574e, 5.0f, 0.0f, color, a11, new vs.d(minusMonths, plusMonths, this.f40572c, null, context, this.f40573d), 24).a(graph);
            om0.b bVar = new om0.b();
            bVar.add(92);
            if (interval.toDuration().isLongerThan(Duration.standardDays(365L))) {
                bVar.add(365);
                bVar.add(-1);
            }
            timeGraphView.setZoomGranularities(x.P0(bVar.t()));
            timeGraphView.setRequestParentDisallowInterceptTouchEvent(true);
            timeGraphView.k0(interval.getStart().minusMonths(1), 0.0f, interval.getEnd().plusMonths(1), 100.0f);
            timeGraphView.setVerticalBoundsAutoAdjustmentEnabled(false);
            timeGraphView.D(bt.a.i(interval.getStart().minusMonths(1)), 0.0f, bt.a.i(interval.getEnd().plusMonths(1)), 100.0f);
            timeGraphView.C0 = interval.getStart();
            timeGraphView.D0 = interval.getEnd();
            timeGraphView.setIgnoreInvisibleGraphsToAdjustVerticalBounds(true);
            timeGraphView.setTouchEnabled(true);
            timeGraphView.setDoubleTapToZoomEnabled(false);
            timeGraphView.setScaleGestureEnabled(true);
            timeGraphView.setScrollYEnabled(false);
            timeGraphView.setSelectionMode(SelectionMode.f39997a);
            timeGraphView.setGraphTagsToAdjustVerticalBounds(x.V("TAG_MAIN_GRAPH"));
            timeGraphView.setGesturesMode(1);
            return;
        }
        throw new IllegalArgumentException("The graph should be a TimeGraphView".toString());
    }
}
