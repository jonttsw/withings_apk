package com.withings.wiscale2.vascularage;

import com.withings.user.core.models.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Interval;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VascularAgeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeViewModel$pwvRange$1", f = "VascularAgeViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class b1 extends kotlin.coroutines.jvm.internal.i implements ym0.r<List<? extends ky.a>, Interval, User, qm0.d<? super e40.d>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ List f62250a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Interval f62251b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ User f62252c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r0 f62253d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(r0 r0Var, qm0.d<? super b1> dVar) {
        super(4, dVar);
        this.f62253d = r0Var;
    }

    @Override // ym0.r
    public final Object invoke(List<? extends ky.a> list, Interval interval, User user, qm0.d<? super e40.d> dVar) {
        b1 b1Var = new b1(this.f62253d, dVar);
        b1Var.f62250a = list;
        b1Var.f62251b = interval;
        b1Var.f62252c = user;
        return b1Var.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ks.t tVar;
        Object obj2;
        float f11;
        e40.a aVar;
        List list;
        ky.a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        Interval interval = this.f62251b;
        User user = this.f62252c;
        r0 r0Var = this.f62253d;
        tVar = r0Var.f62445f;
        List<ky.a> list2 = this.f62250a;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list2, 10));
        for (ky.a aVar3 : list2) {
            arrayList.add(new nm0.j(aVar3.b(), aVar3));
        }
        Duration duration = interval.toDuration();
        kotlin.jvm.internal.u.i(duration, "toDuration(...)");
        ArrayList a11 = tVar.a(arrayList, duration);
        DateTime start = interval.getStart();
        DateTime end = interval.getEnd();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = a11.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.u.g(start);
            kotlin.jvm.internal.u.g(end);
            if (hn.a.c((DateTime) ((nm0.j) next).a(), start, end)) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            obj2 = null;
        } else {
            Object next2 = it2.next();
            if (!it2.hasNext()) {
                obj2 = next2;
            } else {
                DateTime dateTime = (DateTime) ((nm0.j) next2).c();
                do {
                    Object next3 = it2.next();
                    DateTime dateTime2 = (DateTime) ((nm0.j) next3).c();
                    if (dateTime.compareTo(dateTime2) < 0) {
                        next2 = next3;
                        dateTime = dateTime2;
                    }
                } while (it2.hasNext());
                obj2 = next2;
            }
        }
        nm0.j jVar = (nm0.j) obj2;
        if (jVar != null && (list = (List) jVar.d()) != null && (aVar2 = (ky.a) kotlin.collections.x.U(list)) != null) {
            f11 = (float) aVar2.f();
        } else {
            f11 = 0.0f;
        }
        aVar = r0Var.f62447h;
        kotlin.jvm.internal.u.g(start);
        return aVar.b(f11, s70.a.b(user, start));
    }
}
