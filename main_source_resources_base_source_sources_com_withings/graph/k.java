package com.withings.graph;

import com.withings.graph.decorator.Decorator;
import com.withings.graph.filters.Filter;
import java.util.ArrayList;
import java.util.List;
import k1.r0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GraphViewCompose.kt */
/* loaded from: classes3.dex */
public final class k extends w implements ym0.l<TimeGraphView, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ys.c f39940a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ xs.c f39941b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Filter f39942c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List<String> f39943d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ List<ts.d> f39944e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ List<Decorator> f39945f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ at.a f39946g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ r0<Filter> f39947h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(ys.c cVar, xs.c cVar2, Filter filter, List<String> list, List<? extends ts.d> list2, List<? extends Decorator> list3, at.a aVar, r0<Filter> r0Var) {
        super(1);
        this.f39940a = cVar;
        this.f39941b = cVar2;
        this.f39942c = filter;
        this.f39943d = list;
        this.f39944e = list2;
        this.f39945f = list3;
        this.f39946g = aVar;
        this.f39947h = r0Var;
    }

    @Override // ym0.l
    public final y invoke(TimeGraphView timeGraphView) {
        TimeGraphView timeGraphView2 = timeGraphView;
        u.j(timeGraphView2, "timeGraphView");
        timeGraphView2.B = this.f39940a;
        xs.c cVar = timeGraphView2.f39525n0;
        xs.c cVar2 = this.f39941b;
        if (cVar2 != cVar) {
            timeGraphView2.setModifier(cVar2);
        }
        r0<Filter> r0Var = this.f39947h;
        Filter value = r0Var.getValue();
        Filter filter = this.f39942c;
        if (value != filter) {
            timeGraphView2.C(filter, this.f39943d);
            r0Var.setValue(filter);
        }
        ArrayList arrayList = timeGraphView2.f39518j;
        List<ts.d> list = this.f39944e;
        if (!arrayList.containsAll(list)) {
            timeGraphView2.i();
            arrayList.addAll(list);
        }
        ArrayList arrayList2 = timeGraphView2.f39517i;
        List<Decorator> list2 = this.f39945f;
        if (!arrayList2.containsAll(list2)) {
            timeGraphView2.h();
            arrayList2.addAll(list2);
        }
        DateTime e11 = bt.a.e(timeGraphView2.f39511c.centerX());
        at.a aVar = this.f39946g;
        if (!u.e(e11, aVar.c()) || timeGraphView2.getCurrentZoomGranularity() != aVar.d().b()) {
            timeGraphView2.o0(aVar.c(), aVar.d().b());
        }
        timeGraphView2.invalidate();
        return y.f85009a;
    }
}
