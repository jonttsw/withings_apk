package com.withings.weight.presentation.ui;

import com.withings.graph.GraphPeriod;
import com.withings.user.User;
import com.withings.weight.presentation.viewmodel.WeightViewModel;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m90.f;
import org.joda.time.Interval;
/* compiled from: WeightActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.ui.WeightActivity$getUiStateFlow$screenStateFlow$1", f = "WeightActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class f0 extends kotlin.coroutines.jvm.internal.i implements ym0.q<List<? extends GraphPeriod>, Interval, qm0.d<? super f.b.c>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ List f47240a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Interval f47241b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ WeightActivity f47242c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(WeightActivity weightActivity, qm0.d<? super f0> dVar) {
        super(3, dVar);
        this.f47242c = weightActivity;
    }

    @Override // ym0.q
    public final Object invoke(List<? extends GraphPeriod> list, Interval interval, qm0.d<? super f.b.c> dVar) {
        f0 f0Var = new f0(this.f47242c, dVar);
        f0Var.f47240a = list;
        f0Var.f47241b = interval;
        return f0Var.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WeightViewModel D3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        List list = this.f47240a;
        Interval interval = this.f47241b;
        WeightActivity weightActivity = this.f47242c;
        User z32 = WeightActivity.z3(weightActivity);
        D3 = weightActivity.D3();
        return new f.b.c(z32, WeightActivity.C3(weightActivity), list, interval, D3.a1());
    }
}
