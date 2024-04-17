package com.withings.weight.presentation.ui;

import com.withings.common.compose.component.m4;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m90.f;
import org.joda.time.Interval;
/* compiled from: WeightActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.ui.WeightActivity$getUiStateFlow$graphStateFlow$1", f = "WeightActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class d0 extends kotlin.coroutines.jvm.internal.i implements ym0.s<List<? extends ts.d>, nm0.j<? extends m4, ? extends m4>, List<? extends ws.c>, Interval, qm0.d<? super f.b.a>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ List f47221a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ nm0.j f47222b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ List f47223c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Interval f47224d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ WeightActivity f47225e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(WeightActivity weightActivity, qm0.d<? super d0> dVar) {
        super(5, dVar);
        this.f47225e = weightActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        List list = this.f47221a;
        nm0.j jVar = this.f47222b;
        return new f.b.a(list, (m4) jVar.a(), (m4) jVar.b(), this.f47223c, new z0(WeightActivity.C3(this.f47225e), this.f47224d));
    }

    @Override // ym0.s
    public final Object k(List<? extends ts.d> list, nm0.j<? extends m4, ? extends m4> jVar, List<? extends ws.c> list2, Interval interval, qm0.d<? super f.b.a> dVar) {
        d0 d0Var = new d0(this.f47225e, dVar);
        d0Var.f47221a = list;
        d0Var.f47222b = jVar;
        d0Var.f47223c = list2;
        d0Var.f47224d = interval;
        return d0Var.invokeSuspend(nm0.y.f85009a);
    }
}
