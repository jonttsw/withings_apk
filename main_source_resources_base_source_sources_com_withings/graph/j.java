package com.withings.graph;

import android.content.Context;
import com.withings.graph.filters.Filter;
import java.util.List;
import k1.r0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import ym0.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GraphViewCompose.kt */
/* loaded from: classes3.dex */
public final class j extends w implements ym0.l<Context, TimeGraphView> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ xs.c f39932a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ at.a f39933b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Filter f39934c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List<String> f39935d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ q<GraphPeriod, DateTime, Interval, y> f39936e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f39937f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ q<GraphPeriod, DateTime, Interval, y> f39938g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ r0<Boolean> f39939h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(xs.c cVar, at.a aVar, Filter filter, List<String> list, q<? super GraphPeriod, ? super DateTime, ? super Interval, y> qVar, boolean z5, q<? super GraphPeriod, ? super DateTime, ? super Interval, y> qVar2, r0<Boolean> r0Var) {
        super(1);
        this.f39932a = cVar;
        this.f39933b = aVar;
        this.f39934c = filter;
        this.f39935d = list;
        this.f39936e = qVar;
        this.f39937f = z5;
        this.f39938g = qVar2;
        this.f39939h = r0Var;
    }

    @Override // ym0.l
    public final TimeGraphView invoke(Context context) {
        Context context2 = context;
        u.j(context2, "context");
        TimeGraphView timeGraphView = new TimeGraphView(context2, null);
        timeGraphView.setModifier(this.f39932a);
        at.a aVar = this.f39933b;
        timeGraphView.j0(aVar.c(), aVar.d().b());
        timeGraphView.C(this.f39934c, this.f39935d);
        q<GraphPeriod, DateTime, Interval, y> qVar = this.f39936e;
        boolean z5 = this.f39937f;
        if (qVar != null) {
            timeGraphView.f(new i(aVar, timeGraphView, z5, qVar));
        }
        timeGraphView.f(new h(aVar, timeGraphView, z5, this.f39938g));
        timeGraphView.setOnScrubbingListener(new g(this.f39939h));
        return timeGraphView;
    }
}
