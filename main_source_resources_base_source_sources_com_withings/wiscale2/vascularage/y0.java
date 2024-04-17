package com.withings.wiscale2.vascularage;

import com.withings.wiscale2.vascularage.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: VascularAgeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeViewModel$pwvData$1$1", f = "VascularAgeViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class y0 extends kotlin.coroutines.jvm.internal.i implements ym0.s<e40.d, List<? extends ky.a>, nm0.j<? extends b90.a, ? extends b90.a>, Double, qm0.d<? super h>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ e40.d f62557a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ List f62558b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ nm0.j f62559c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Double f62560d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ r0 f62561e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(r0 r0Var, qm0.d<? super y0> dVar) {
        super(5, dVar);
        this.f62561e = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        e40.d dVar = this.f62557a;
        nm0.j jVar = this.f62559c;
        Double d11 = this.f62560d;
        List list = this.f62558b;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            r0 r0Var = this.f62561e;
            if (!hasNext) {
                z5 = r0Var.f62440a;
                return new h(arrayList, dVar, jVar, z5, d11);
            }
            ky.a aVar = (ky.a) it.next();
            r0Var.getClass();
            arrayList.add(new r0.a((float) aVar.f(), aVar.b()));
        }
    }

    @Override // ym0.s
    public final Object k(e40.d dVar, List<? extends ky.a> list, nm0.j<? extends b90.a, ? extends b90.a> jVar, Double d11, qm0.d<? super h> dVar2) {
        y0 y0Var = new y0(this.f62561e, dVar2);
        y0Var.f62557a = dVar;
        y0Var.f62558b = list;
        y0Var.f62559c = jVar;
        y0Var.f62560d = d11;
        return y0Var.invokeSuspend(nm0.y.f85009a);
    }
}
