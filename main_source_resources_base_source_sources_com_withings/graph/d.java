package com.withings.graph;

import ah.o;
import com.withings.graph.decorator.Decorator;
import com.withings.graph.filters.Filter;
import java.util.List;
import k1.r0;
import kotlin.jvm.internal.w;
import nm0.y;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import ym0.p;
import ym0.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GraphViewCompose.kt */
/* loaded from: classes3.dex */
public final class d extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ys.c f39654a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f39655b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ at.a f39656c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f39657d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ List<ts.d> f39658e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Filter f39659f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ List<String> f39660g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ List<Decorator> f39661h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ xs.c f39662i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ boolean f39663j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ ym0.l<rs.e, y> f39664k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ q<GraphPeriod, DateTime, Interval, y> f39665l;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ q<GraphPeriod, DateTime, Interval, y> f39666m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ r0<Boolean> f39667n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ int f39668o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ int f39669p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ int f39670q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i11, int i12, int i13, r0 r0Var, androidx.compose.ui.e eVar, Filter filter, xs.c cVar, ys.c cVar2, at.a aVar, List list, List list2, List list3, ym0.l lVar, q qVar, q qVar2, boolean z5, boolean z11) {
        super(2);
        this.f39654a = cVar2;
        this.f39655b = eVar;
        this.f39656c = aVar;
        this.f39657d = z5;
        this.f39658e = list;
        this.f39659f = filter;
        this.f39660g = list2;
        this.f39661h = list3;
        this.f39662i = cVar;
        this.f39663j = z11;
        this.f39664k = lVar;
        this.f39665l = qVar;
        this.f39666m = qVar2;
        this.f39667n = r0Var;
        this.f39668o = i11;
        this.f39669p = i12;
        this.f39670q = i13;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = o.g(this.f39668o | 1);
        int g12 = o.g(this.f39669p);
        boolean z5 = this.f39657d;
        boolean z11 = this.f39663j;
        a.b(g11, g12, this.f39670q, aVar, this.f39667n, this.f39655b, this.f39659f, this.f39662i, this.f39654a, this.f39656c, this.f39658e, this.f39660g, this.f39661h, this.f39664k, this.f39665l, this.f39666m, z5, z11);
        return y.f85009a;
    }
}
