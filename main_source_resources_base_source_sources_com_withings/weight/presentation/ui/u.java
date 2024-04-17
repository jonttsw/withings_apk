package com.withings.weight.presentation.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import com.withings.graph.GraphView;
import com.withings.graph.TimeGraphView;
import com.withings.graph.selection.SelectionMode;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.List;
import l70.t;
import org.joda.time.DateTime;
import org.joda.time.Interval;
/* compiled from: ExploreDataWeightGraphModifier.kt */
/* loaded from: classes4.dex */
public final class u implements xs.c {

    /* renamed from: b  reason: collision with root package name */
    private final l70.u f47300b;

    /* renamed from: c  reason: collision with root package name */
    private final Interval f47301c;

    /* renamed from: d  reason: collision with root package name */
    private final List<ky.a> f47302d;

    /* renamed from: e  reason: collision with root package name */
    private final at.a f47303e;

    public u(l70.u weightUnit, Interval maxViewportInterval, List<ky.a> weightMeasures, at.a dataVizViewportState) {
        kotlin.jvm.internal.u.j(weightUnit, "weightUnit");
        kotlin.jvm.internal.u.j(maxViewportInterval, "maxViewportInterval");
        kotlin.jvm.internal.u.j(weightMeasures, "weightMeasures");
        kotlin.jvm.internal.u.j(dataVizViewportState, "dataVizViewportState");
        this.f47300b = weightUnit;
        this.f47301c = maxViewportInterval;
        this.f47302d = weightMeasures;
        this.f47303e = dataVizViewportState;
    }

    public static String d(u this$0, float f11, float f12) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        l70.u uVar = this$0.f47300b;
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
            String str = "getContext(...)";
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            String i11 = this.f47300b.i(context);
            int color = androidx.core.content.a.getColor(timeGraphView.getContext(), C1987R.color.datavizGridlineDefault);
            com.withings.details.height.b bVar = new com.withings.details.height.b(this, 1);
            Interval interval = this.f47301c;
            DateTime minusMonths = interval.getStart().minusMonths(1);
            kotlin.jvm.internal.u.i(minusMonths, "minusMonths(...)");
            DateTime plusMonths = interval.getEnd().plusMonths(1);
            kotlin.jvm.internal.u.i(plusMonths, "plusMonths(...)");
            List<ky.a> list = this.f47302d;
            ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
            for (ky.a aVar : list) {
                arrayList.add(new nm0.j(aVar.b(), Float.valueOf((float) aVar.f())));
                str = str;
            }
            Context context2 = timeGraphView.getContext();
            kotlin.jvm.internal.u.i(context2, str);
            xs.d.a(i11, 8.0f, 0.0f, color, bVar, new vs.d(minusMonths, plusMonths, arrayList, this.f47300b, context2, this.f47303e), 24).a(graph);
            timeGraphView.setRequestParentDisallowInterceptTouchEvent(true);
            timeGraphView.k0(interval.getStart().minusMonths(1), 0.0f, interval.getEnd().plusMonths(1), 700.0f);
            timeGraphView.C0 = interval.getStart();
            timeGraphView.D0 = interval.getEnd();
            timeGraphView.setIgnoreInvisibleGraphsToAdjustVerticalBounds(true);
            timeGraphView.setTouchEnabled(true);
            timeGraphView.setDoubleTapToZoomEnabled(false);
            timeGraphView.setScaleGestureEnabled(true);
            timeGraphView.setScrollYEnabled(false);
            timeGraphView.setSelectionMode(SelectionMode.f39997a);
            timeGraphView.setVerticalBoundsAutoAdjustmentEnabled(true);
            timeGraphView.setGraphTagsToAdjustVerticalBounds(kotlin.collections.x.W("TAG_MAIN_GRAPH", "normalityZoneGraph"));
            timeGraphView.setGesturesMode(1);
            return;
        }
        throw new IllegalArgumentException("The graph should be a TimeGraphView".toString());
    }
}
