package com.withings.weight.presentation.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import com.withings.graph.GraphView;
import com.withings.graph.TimeGraphView;
import com.withings.graph.axis.a;
import com.withings.wiscale2.C1987R;
import l70.t;
import org.joda.time.Interval;
/* compiled from: WeightGraphModifier.kt */
/* loaded from: classes4.dex */
public final class z0 implements xs.c {

    /* renamed from: b  reason: collision with root package name */
    private final l70.u f47321b;

    /* renamed from: c  reason: collision with root package name */
    private final Interval f47322c;

    public z0(l70.u weightUnit, Interval maxViewportInterval) {
        kotlin.jvm.internal.u.j(weightUnit, "weightUnit");
        kotlin.jvm.internal.u.j(maxViewportInterval, "maxViewportInterval");
        this.f47321b = weightUnit;
        this.f47322c = maxViewportInterval;
    }

    public static String d(z0 this$0, float f11, float f12) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        l70.u uVar = this$0.f47321b;
        if (uVar instanceof l70.t) {
            int i11 = l70.t.f78812e;
            l70.y a11 = t.a.a(f11);
            int a12 = an0.a.a(a11.f78869b);
            return a11.f78868a + ":" + a12;
        }
        return xs.f.a().c(ay.a.d(uVar, f11), f12);
    }

    @Override // xs.c
    @SuppressLint({"ClickableViewAccessibility"})
    public final void a(GraphView graph) {
        kotlin.jvm.internal.u.j(graph, "graph");
        if (graph instanceof TimeGraphView) {
            TimeGraphView timeGraphView = (TimeGraphView) graph;
            Context context = timeGraphView.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            xs.d.b(this.f47321b.i(context), null, 6.0f, 0, 2.0f, false, androidx.core.content.a.getColor(timeGraphView.getContext(), C1987R.color.datavizGridlineDefault), new a.b() { // from class: com.withings.weight.presentation.ui.y0
                @Override // com.withings.graph.axis.a.b
                public final String c(float f11, float f12) {
                    return z0.d(z0.this, f11, f12);
                }
            }, 104).a(graph);
            timeGraphView.setRequestParentDisallowInterceptTouchEvent(true);
            Interval interval = this.f47322c;
            timeGraphView.k0(interval.getStart(), 0.0f, interval.getEnd(), 700.0f);
            timeGraphView.C0 = interval.getStart();
            timeGraphView.D0 = interval.getEnd();
            timeGraphView.setIgnoreInvisibleGraphsToAdjustVerticalBounds(true);
            timeGraphView.setTouchEnabled(true);
            timeGraphView.setDoubleTapToZoomEnabled(false);
            timeGraphView.setScaleGestureEnabled(true);
            timeGraphView.setScrollYEnabled(false);
            timeGraphView.setVerticalBoundsAutoAdjustmentEnabled(true);
            timeGraphView.setGraphTagsToAdjustVerticalBounds(kotlin.collections.x.W("TAG_MAIN_GRAPH", "normalityZoneGraph"));
            return;
        }
        throw new IllegalArgumentException("The graph should be a TimeGraphView".toString());
    }
}
