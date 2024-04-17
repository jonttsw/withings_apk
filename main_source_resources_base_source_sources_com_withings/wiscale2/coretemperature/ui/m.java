package com.withings.wiscale2.coretemperature.ui;

import com.withings.graph.GraphView;
import com.withings.graph.TimeGraphView;
import com.withings.graph.selection.SelectionMode;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import org.joda.time.Interval;
/* compiled from: ExploreCoreTemperatureGraphModifier.kt */
/* loaded from: classes4.dex */
public final class m implements xs.c {

    /* renamed from: b  reason: collision with root package name */
    private final Interval f50462b;

    public m(Interval interval) {
        u.j(interval, "interval");
        this.f50462b = interval;
    }

    @Override // xs.c
    public final void a(GraphView graph) {
        u.j(graph, "graph");
        TimeGraphView timeGraphView = (TimeGraphView) graph;
        timeGraphView.setRequestParentDisallowInterceptTouchEvent(true);
        Interval interval = this.f50462b;
        timeGraphView.k0(interval.getStart().toDateTime().minusMonths(1), 0.0f, interval.getEnd().plusMonths(1), 700.0f);
        timeGraphView.C0 = interval.getStart().toDateTime();
        timeGraphView.D0 = interval.getEnd().toDateTime();
        timeGraphView.setIgnoreInvisibleGraphsToAdjustVerticalBounds(true);
        timeGraphView.setTouchEnabled(true);
        timeGraphView.setDoubleTapToZoomEnabled(false);
        timeGraphView.setScaleGestureEnabled(true);
        timeGraphView.setScrollYEnabled(false);
        timeGraphView.setSelectionMode(SelectionMode.f39997a);
        timeGraphView.setVerticalBoundsAutoAdjustmentEnabled(true);
        timeGraphView.setGraphTagsToAdjustVerticalBounds(x.V("TAG_MAIN_GRAPH"));
        timeGraphView.setGesturesMode(1);
    }
}
