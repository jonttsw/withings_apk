package com.withings.weight.presentation.ui;

import com.withings.graph.GraphView;
import com.withings.graph.TimeGraphView;
import com.withings.graph.selection.SelectionMode;
import com.withings.weight.presentation.entities.BodyCompGraphTags;
import org.joda.time.Interval;
/* compiled from: BodyCompGraphModifier.kt */
/* loaded from: classes4.dex */
public final class a implements xs.c {

    /* renamed from: b  reason: collision with root package name */
    private final Interval f47200b;

    public a(Interval maxViewportInterval) {
        kotlin.jvm.internal.u.j(maxViewportInterval, "maxViewportInterval");
        this.f47200b = maxViewportInterval;
    }

    @Override // xs.c
    public final void a(GraphView graph) {
        kotlin.jvm.internal.u.j(graph, "graph");
        if (graph instanceof TimeGraphView) {
            TimeGraphView timeGraphView = (TimeGraphView) graph;
            Interval interval = this.f47200b;
            timeGraphView.C0 = interval.getStart();
            timeGraphView.D0 = interval.getEnd();
            timeGraphView.setTouchEnabled(true);
            timeGraphView.setDoubleTapToZoomEnabled(false);
            timeGraphView.setScaleGestureEnabled(true);
            timeGraphView.setScrollYEnabled(false);
            timeGraphView.setSelectionMode(SelectionMode.f39998b);
            timeGraphView.setVerticalBoundsAutoAdjustmentEnabled(true);
            timeGraphView.setGraphTagsToAdjustVerticalBounds(BodyCompGraphTags.a());
            timeGraphView.setIgnoreInvisibleGraphsToAdjustVerticalBounds(true);
            timeGraphView.setRequestParentDisallowInterceptTouchEvent(true);
            return;
        }
        throw new IllegalArgumentException("The graph should be a TimeGraphView".toString());
    }
}
