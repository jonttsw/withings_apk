package com.withings.graph;

import com.withings.graph.GraphPeriod;
import com.withings.graph.GraphView;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import ym0.q;
/* compiled from: OnViewportChangeListener.kt */
/* loaded from: classes3.dex */
public final class i implements GraphView.h {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ at.a f39928a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TimeGraphView f39929b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f39930c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ q f39931d;

    public i(at.a aVar, TimeGraphView timeGraphView, boolean z5, q qVar) {
        this.f39928a = aVar;
        this.f39929b = timeGraphView;
        this.f39930c = z5;
        this.f39931d = qVar;
    }

    @Override // com.withings.graph.GraphView.h
    public final void a(GraphView graphView) {
        TimeGraphView timeGraphView;
        if (graphView instanceof TimeGraphView) {
            timeGraphView = (TimeGraphView) graphView;
        } else {
            timeGraphView = null;
        }
        if (timeGraphView != null) {
            GraphPeriod.a aVar = GraphPeriod.f39501a;
            TimeGraphView timeGraphView2 = (TimeGraphView) graphView;
            int currentZoomGranularity = timeGraphView2.getCurrentZoomGranularity();
            aVar.getClass();
            GraphPeriod a11 = GraphPeriod.a.a(currentZoomGranularity);
            DateTime e11 = bt.a.e(timeGraphView2.f39511c.centerX());
            Interval interval = new Interval(bt.a.e(timeGraphView2.f39511c.left), bt.a.e(timeGraphView2.f39511c.right));
            at.a aVar2 = this.f39928a;
            if (!u.e(aVar2.c(), e11) || aVar2.d() != a11) {
                DateTime c11 = aVar2.c();
                GraphPeriod d11 = aVar2.d();
                DateTime e12 = bt.a.e(timeGraphView2.f39511c.left);
                DateTime e13 = bt.a.e(timeGraphView2.f39511c.right);
                TimeGraphView timeGraphView3 = this.f39929b;
                x70.b.l(timeGraphView3, "Viewport was " + c11 + ", " + d11 + " | Current is " + e12 + ", " + e13, new Object[0]);
                if (this.f39930c) {
                    if (a11 != aVar2.d()) {
                        e11 = aVar2.c();
                    }
                    u.g(e11);
                    aVar2.i(a11, e11);
                }
                DateTime c12 = aVar2.c();
                GraphPeriod d12 = aVar2.d();
                x70.b.l(timeGraphView3, "Now viewport is " + c12 + ", " + d12 + " ", new Object[0]);
                this.f39931d.invoke(aVar2.d(), aVar2.c(), interval);
            }
        }
    }

    @Override // com.withings.graph.GraphView.h
    public final void b(GraphView graphView) {
    }
}
