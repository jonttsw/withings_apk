package com.withings.wiscale2.settings;

import java.util.List;
/* compiled from: TracesLogsActivity.kt */
/* loaded from: classes5.dex */
final class q5 extends kotlin.jvm.internal.w implements ym0.l<s0.i0, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.o1<List<String>> f60270a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q5(k1.o1<? extends List<String>> o1Var) {
        super(1);
        this.f60270a = o1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(s0.i0 i0Var) {
        s0.i0 LazyColumn = i0Var;
        kotlin.jvm.internal.u.j(LazyColumn, "$this$LazyColumn");
        int i11 = TracesLogsActivity.f59781e;
        List<String> value = this.f60270a.getValue();
        LazyColumn.c(value.size(), null, new o5(n5.f60212a, value), new s1.a(true, -632812321, new p5(value)));
        return nm0.y.f85009a;
    }
}
