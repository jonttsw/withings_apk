package com.withings.cycletracking.ui;

import java.util.List;
/* compiled from: CycleTrackingHistoryScreen.kt */
/* loaded from: classes3.dex */
final class c2 extends kotlin.jvm.internal.w implements ym0.l<s0.i0, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<wm.f> f35517a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f35518b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(List<wm.f> list, ym0.a<nm0.y> aVar) {
        super(1);
        this.f35517a = list;
        this.f35518b = aVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(s0.i0 i0Var) {
        s0.i0 LazyColumn = i0Var;
        kotlin.jvm.internal.u.j(LazyColumn, "$this$LazyColumn");
        s0.i0.f(LazyColumn, null, new s1.a(true, 1163790371, new y1(this.f35518b)), 3);
        List<wm.f> list = this.f35517a;
        if (!list.isEmpty()) {
            LazyColumn.c(list.size(), null, new a2(z1.f36096a, list), new s1.a(true, -632812321, new b2(list)));
        } else {
            s0.i0.g(LazyColumn, null, b.f35500c, 3);
        }
        s0.i0.g(LazyColumn, null, b.f35501d, 3);
        return nm0.y.f85009a;
    }
}
