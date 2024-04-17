package com.withings.nervehealth.ui;

import com.withings.graph.decorator.Decorator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.Interval;
import p00.c;
/* compiled from: NerveHealthActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.NerveHealthActivity$initFlows$graphDataFlow$1", f = "NerveHealthActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class h extends kotlin.coroutines.jvm.internal.i implements ym0.s<Interval, xs.c, List<? extends ts.d>, List<? extends Decorator>, qm0.d<? super c.b.a>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Interval f42711a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ xs.c f42712b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ List f42713c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ List f42714d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ NerveHealthActivity f42715e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(NerveHealthActivity nerveHealthActivity, qm0.d<? super h> dVar) {
        super(5, dVar);
        this.f42715e = nerveHealthActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        NerveHealthViewModel K3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        K3 = this.f42715e.K3();
        return new c.b.a(this.f42711a, K3.c1(), this.f42712b, this.f42713c, this.f42714d);
    }

    @Override // ym0.s
    public final Object k(Interval interval, xs.c cVar, List<? extends ts.d> list, List<? extends Decorator> list2, qm0.d<? super c.b.a> dVar) {
        h hVar = new h(this.f42715e, dVar);
        hVar.f42711a = interval;
        hVar.f42712b = cVar;
        hVar.f42713c = list;
        hVar.f42714d = list2;
        return hVar.invokeSuspend(nm0.y.f85009a);
    }
}
