package com.withings.wiscale2.vascularage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.DateTime;
import org.joda.time.Interval;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VascularAgeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeViewModel$averageVascularAgeDisplayed$1", f = "VascularAgeViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class t0 extends kotlin.coroutines.jvm.internal.i implements ym0.q<List<? extends ky.a>, Interval, qm0.d<? super Integer>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ List f62481a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Interval f62482b;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.wiscale2.vascularage.t0] */
    @Override // ym0.q
    public final Object invoke(List<? extends ky.a> list, Interval interval, qm0.d<? super Integer> dVar) {
        ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar);
        iVar.f62481a = list;
        iVar.f62482b = interval;
        return iVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        Interval interval = this.f62482b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this.f62481a) {
            DateTime b10 = ((ky.a) obj2).b();
            DateTime start = interval.getStart();
            kotlin.jvm.internal.u.i(start, "getStart(...)");
            DateTime end = interval.getEnd();
            kotlin.jvm.internal.u.i(end, "getEnd(...)");
            if (hn.a.c(b10, start, end)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new Double(((ky.a) it.next()).f()));
        }
        return new Integer((int) kotlin.collections.x.u(arrayList2));
    }
}
