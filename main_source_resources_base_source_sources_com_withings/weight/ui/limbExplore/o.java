package com.withings.weight.ui.limbExplore;

import android.annotation.SuppressLint;
import android.content.Context;
import com.withings.graph.GraphView;
import com.withings.graph.TimeGraphView;
import com.withings.graph.axis.a;
import com.withings.graph.selection.SelectionMode;
import com.withings.weight.core.model.LimbModel;
import com.withings.wiscale2.C1987R;
import jm.a;
import kotlin.NoWhenBranchMatchedException;
import l70.t;
import org.joda.time.Interval;
/* compiled from: SegmentalLimbExploreGraphModifier.kt */
/* loaded from: classes4.dex */
public final class o implements xs.c {

    /* renamed from: b  reason: collision with root package name */
    private final l70.u f47699b;

    /* renamed from: c  reason: collision with root package name */
    private final Interval f47700c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f47701d;

    /* renamed from: e  reason: collision with root package name */
    private final LimbModel f47702e;

    public o(l70.u weightUnit, Interval maxViewportInterval, boolean z5, LimbModel kindOfLimb) {
        kotlin.jvm.internal.u.j(weightUnit, "weightUnit");
        kotlin.jvm.internal.u.j(maxViewportInterval, "maxViewportInterval");
        kotlin.jvm.internal.u.j(kindOfLimb, "kindOfLimb");
        this.f47699b = weightUnit;
        this.f47700c = maxViewportInterval;
        this.f47701d = z5;
        this.f47702e = kindOfLimb;
    }

    public static String d(o this$0, l70.u unit, float f11, float f12) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(unit, "$unit");
        if (this$0.f47701d) {
            return xs.f.a().c(f11, f12);
        }
        if (unit instanceof l70.t) {
            int i11 = l70.t.f78812e;
            l70.y a11 = t.a.a(f11);
            int a12 = an0.a.a(a11.f78869b);
            return a11.f78868a + ":" + a12;
        }
        return xs.f.a().c(ay.a.d(unit, f11), f12);
    }

    @Override // xs.c
    @SuppressLint({"ClickableViewAccessibility"})
    public final void a(GraphView graph) {
        String i11;
        float f11;
        kotlin.jvm.internal.u.j(graph, "graph");
        if (graph instanceof TimeGraphView) {
            TimeGraphView timeGraphView = (TimeGraphView) graph;
            Context context = timeGraphView.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            final l70.u g11 = a.d.a(context).g(1);
            boolean z5 = this.f47701d;
            if (z5) {
                i11 = "%";
            } else {
                Context context2 = timeGraphView.getContext();
                kotlin.jvm.internal.u.i(context2, "getContext(...)");
                i11 = this.f47699b.i(context2);
            }
            String str = i11;
            if (z5) {
                f11 = 20.0f;
            } else {
                int ordinal = this.f47702e.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            f11 = 4.0f;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        f11 = 6.0f;
                    }
                } else {
                    f11 = 1.0f;
                }
            }
            int color = androidx.core.content.a.getColor(timeGraphView.getContext(), C1987R.color.datavizGridlineDefault);
            xs.d.d(xs.d.h(xs.d.e(xs.d.f(xs.d.g(new xs.e(8), str, color, true, 5, 1.0f, new a.b() { // from class: com.withings.weight.ui.limbExplore.n
                @Override // com.withings.graph.axis.a.b
                public final String c(float f12, float f13) {
                    return o.d(o.this, g11, f12, f13);
                }
            }), true, color)), 1.0f, 5, f11), null).a(graph);
            timeGraphView.setRequestParentDisallowInterceptTouchEvent(true);
            Interval interval = this.f47700c;
            timeGraphView.C0 = interval.getStart();
            timeGraphView.D0 = interval.getEnd();
            timeGraphView.setIgnoreInvisibleGraphsToAdjustVerticalBounds(true);
            timeGraphView.setTouchEnabled(true);
            timeGraphView.setDoubleTapToZoomEnabled(false);
            timeGraphView.setScaleGestureEnabled(true);
            timeGraphView.setScrollYEnabled(false);
            timeGraphView.setSelectionMode(SelectionMode.f39998b);
            timeGraphView.setVerticalBoundsAutoAdjustmentEnabled(true);
            timeGraphView.setGraphTagsToAdjustVerticalBounds(BodyCompGraphTags.a());
            timeGraphView.setGesturesMode(1);
            return;
        }
        throw new IllegalArgumentException("The graph should be a TimeGraphView".toString());
    }
}
