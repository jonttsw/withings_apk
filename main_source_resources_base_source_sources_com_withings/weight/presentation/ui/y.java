package com.withings.weight.presentation.ui;

import com.withings.graph.GraphView;
import com.withings.graph.TimeGraphView;
import org.joda.time.Interval;
/* compiled from: SecondaryGraphModifier.kt */
/* loaded from: classes4.dex */
public final class y implements xs.c {

    /* renamed from: b  reason: collision with root package name */
    private final Interval f47313b;

    /* renamed from: c  reason: collision with root package name */
    private final en0.k f47314c;

    public y(Interval maxViewportInterval, en0.k kVar) {
        kotlin.jvm.internal.u.j(maxViewportInterval, "maxViewportInterval");
        this.f47313b = maxViewportInterval;
        this.f47314c = kVar;
    }

    @Override // xs.c
    public final void a(GraphView graph) {
        kotlin.jvm.internal.u.j(graph, "graph");
        if (graph instanceof TimeGraphView) {
            TimeGraphView timeGraphView = (TimeGraphView) graph;
            Interval interval = this.f47313b;
            timeGraphView.C0 = interval.getStart();
            timeGraphView.D0 = interval.getEnd();
            timeGraphView.setVerticalBoundsAutoAdjustmentEnabled(true);
            timeGraphView.setIgnoreInvisibleGraphsToAdjustVerticalBounds(true);
            timeGraphView.setGraphTagsToAdjustVerticalBounds(kotlin.collections.x.W("TAG_MAIN_GRAPH", "normalityZoneGraph"));
            timeGraphView.setTouchEnabled(true);
            timeGraphView.setDoubleTapToZoomEnabled(false);
            timeGraphView.setScaleGestureEnabled(false);
            timeGraphView.setScrollYEnabled(false);
            timeGraphView.setScrollXEnabled(false);
            en0.k kVar = this.f47314c;
            if (kVar != null) {
                timeGraphView.k0(timeGraphView.C0, kVar.l(), timeGraphView.D0, kVar.n());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The graph should be a TimeGraphView".toString());
    }
}
