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
public final class l extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f39948a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ at.a f39949b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f39950c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List<ts.d> f39951d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Filter f39952e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ List<String> f39953f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ List<Decorator> f39954g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ xs.c f39955h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ ys.c f39956i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ boolean f39957j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ ym0.l<rs.e, y> f39958k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ q<GraphPeriod, DateTime, Interval, y> f39959l;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ q<GraphPeriod, DateTime, Interval, y> f39960m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ r0<Boolean> f39961n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ int f39962o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ int f39963p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ int f39964q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i11, int i12, int i13, r0 r0Var, androidx.compose.ui.e eVar, Filter filter, xs.c cVar, ys.c cVar2, at.a aVar, List list, List list2, List list3, ym0.l lVar, q qVar, q qVar2, boolean z5, boolean z11) {
        super(2);
        this.f39948a = eVar;
        this.f39949b = aVar;
        this.f39950c = z5;
        this.f39951d = list;
        this.f39952e = filter;
        this.f39953f = list2;
        this.f39954g = list3;
        this.f39955h = cVar;
        this.f39956i = cVar2;
        this.f39957j = z11;
        this.f39958k = lVar;
        this.f39959l = qVar;
        this.f39960m = qVar2;
        this.f39961n = r0Var;
        this.f39962o = i11;
        this.f39963p = i12;
        this.f39964q = i13;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = o.g(this.f39962o | 1);
        int g12 = o.g(this.f39963p);
        boolean z5 = this.f39950c;
        boolean z11 = this.f39957j;
        a.c(g11, g12, this.f39964q, aVar, this.f39961n, this.f39948a, this.f39952e, this.f39955h, this.f39956i, this.f39949b, this.f39951d, this.f39953f, this.f39954g, this.f39958k, this.f39959l, this.f39960m, z5, z11);
        return y.f85009a;
    }
}
