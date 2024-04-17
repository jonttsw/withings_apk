package com.withings.wiscale2.vascularage;

import com.withings.user.core.models.User;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Interval;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VascularAgeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeViewModel$vascularAgeRange$1", f = "VascularAgeViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class k1 extends kotlin.coroutines.jvm.internal.i implements ym0.r<List<? extends ky.a>, Interval, User, qm0.d<? super z70.c>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ List f62414a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Interval f62415b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ User f62416c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r0 f62417d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(r0 r0Var, qm0.d<? super k1> dVar) {
        super(4, dVar);
        this.f62417d = r0Var;
    }

    @Override // ym0.r
    public final Object invoke(List<? extends ky.a> list, Interval interval, User user, qm0.d<? super z70.c> dVar) {
        k1 k1Var = new k1(this.f62417d, dVar);
        k1Var.f62414a = list;
        k1Var.f62415b = interval;
        k1Var.f62416c = user;
        return k1Var.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ks.t tVar;
        Object obj2;
        Number num;
        a80.c cVar;
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        Interval interval = this.f62415b;
        User user = this.f62416c;
        r0 r0Var = this.f62417d;
        tVar = r0Var.f62445f;
        List<ky.a> list2 = this.f62414a;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list2, 10));
        for (ky.a aVar : list2) {
            arrayList.add(new nm0.j(aVar.b(), aVar));
        }
        Duration duration = interval.toDuration();
        kotlin.jvm.internal.u.i(duration, "toDuration(...)");
        ArrayList a11 = tVar.a(arrayList, duration);
        DateTime start = interval.getStart();
        DateTime end = interval.getEnd();
        ListIterator listIterator = a11.listIterator(a11.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj2 = listIterator.previous();
                kotlin.jvm.internal.u.g(start);
                kotlin.jvm.internal.u.g(end);
                if (hn.a.c((DateTime) ((nm0.j) obj2).a(), start, end)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        nm0.j jVar = (nm0.j) obj2;
        if (jVar != null && (list = (List) jVar.d()) != null) {
            List<ky.a> list3 = list;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(list3, 10));
            for (ky.a aVar2 : list3) {
                arrayList2.add(new Double(aVar2.f()));
            }
            num = new Float((float) kotlin.collections.x.u(arrayList2));
        } else {
            num = new Integer(0);
        }
        cVar = r0Var.f62446g;
        kotlin.jvm.internal.u.g(start);
        int b10 = s70.a.b(user, start);
        cVar.getClass();
        for (z70.c cVar2 : a80.c.b(b10)) {
            if (cVar2.a(num)) {
                return cVar2;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
