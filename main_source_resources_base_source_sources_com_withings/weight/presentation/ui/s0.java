package com.withings.weight.presentation.ui;

import com.withings.common.compose.component.m4;
import com.withings.common.compose.component.t1;
import com.withings.graph.filters.Filter;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.Interval;
import ws.b;
/* compiled from: WeightExploreDataActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.ui.WeightExploreDataActivity$initFlows$1", f = "WeightExploreDataActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class s0 extends kotlin.coroutines.jvm.internal.i implements ym0.s<List<? extends ts.d>, u, m4, Interval, qm0.d<? super b.C1829b>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ List f47293a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ u f47294b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ m4 f47295c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Interval f47296d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ WeightExploreDataActivity f47297e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ t1 f47298f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(WeightExploreDataActivity weightExploreDataActivity, t1 t1Var, qm0.d<? super s0> dVar) {
        super(5, dVar);
        this.f47297e = weightExploreDataActivity;
        this.f47298f = t1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        List list2 = this.f47293a;
        u uVar = this.f47294b;
        m4 m4Var = this.f47295c;
        Interval interval = this.f47296d;
        if (m4Var != null) {
            list = kotlin.collections.x.V(new nm0.j(this.f47298f, m4Var));
        } else {
            list = null;
        }
        List list3 = list;
        WeightExploreDataActivity weightExploreDataActivity = this.f47297e;
        at.a t02 = WeightExploreDataActivity.z3(weightExploreDataActivity).t0();
        Filter filter = Filter.f39917a;
        return new b.C1829b(interval, list3, t02, uVar, WeightExploreDataActivity.z3(weightExploreDataActivity).q0(), list2);
    }

    @Override // ym0.s
    public final Object k(List<? extends ts.d> list, u uVar, m4 m4Var, Interval interval, qm0.d<? super b.C1829b> dVar) {
        s0 s0Var = new s0(this.f47297e, this.f47298f, dVar);
        s0Var.f47293a = list;
        s0Var.f47294b = uVar;
        s0Var.f47295c = m4Var;
        s0Var.f47296d = interval;
        return s0Var.invokeSuspend(nm0.y.f85009a);
    }
}
