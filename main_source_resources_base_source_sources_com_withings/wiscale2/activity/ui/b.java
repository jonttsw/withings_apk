package com.withings.wiscale2.activity.ui;

import com.withings.core.data.aggregate.ActivityAggregate;
import com.withings.vasistas.model.Vasistas;
import ea0.r;
import ea0.s;
import ea0.t;
import java.util.List;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import s0.i0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VasistasInfoActivity.kt */
/* loaded from: classes4.dex */
public final class b extends w implements ym0.l<i0, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<Vasistas> f48618a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ActivityAggregate f48619b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ VasistasInfoActivity f48620c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List<Vasistas> list, ActivityAggregate activityAggregate, VasistasInfoActivity vasistasInfoActivity) {
        super(1);
        this.f48618a = list;
        this.f48619b = activityAggregate;
        this.f48620c = vasistasInfoActivity;
    }

    @Override // ym0.l
    public final y invoke(i0 i0Var) {
        i0 LazyColumn = i0Var;
        u.j(LazyColumn, "$this$LazyColumn");
        ActivityAggregate activityAggregate = this.f48619b;
        VasistasInfoActivity vasistasInfoActivity = this.f48620c;
        i0.g(LazyColumn, null, new s1.a(true, 1377690572, new a(activityAggregate, vasistasInfoActivity)), 3);
        i0.g(LazyColumn, null, ea0.l.f64988a, 3);
        List<Vasistas> list = this.f48618a;
        LazyColumn.c(list.size(), null, new s(r.f65003a, list), new s1.a(true, -632812321, new t(list, vasistasInfoActivity)));
        return y.f85009a;
    }
}
