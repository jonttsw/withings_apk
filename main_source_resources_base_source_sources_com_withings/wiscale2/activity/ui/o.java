package com.withings.wiscale2.activity.ui;

import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.ui.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import lj0.h0;
import nm0.y;
import org.joda.time.DateTime;
import ym0.p;
/* compiled from: VasistasInfoActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.ui.VasistasInfoViewModel$loadData$1", f = "VasistasInfoActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class o extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Integer f48651a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Vasistas.Category f48652b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p0<List<Vasistas>> f48653c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ n f48654d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Integer num, Vasistas.Category category, p0<List<Vasistas>> p0Var, n nVar, qm0.d<? super o> dVar) {
        super(2, dVar);
        this.f48651a = num;
        this.f48652b = category;
        this.f48653c = p0Var;
        this.f48654d = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new o(this.f48651a, this.f48652b, this.f48653c, this.f48654d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((o) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Type inference failed for: r9v10, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List, T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        h0 h0Var;
        long j5;
        DateTime dateTime;
        ActivityAggregateManager activityAggregateManager;
        long j11;
        DateTime dateTime2;
        h0 h0Var2;
        long j12;
        DateTime dateTime3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        Vasistas.Category category = this.f48652b;
        p0<List<Vasistas>> p0Var = this.f48653c;
        n nVar = this.f48654d;
        Integer num = this.f48651a;
        if (num == null || num.intValue() != C1987R.id.all_vasistas || category != null) {
            h0Var = nVar.f48644a;
            j5 = nVar.f48646c;
            dateTime = nVar.f48647d;
            ?? t11 = h0Var.t(dateTime, j5, category);
            u.i(t11, "getVasistasForDay(...)");
            p0Var.f76257a = t11;
        } else {
            sm0.a<VasistasCategoryId> d11 = VasistasCategoryId.d();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((kotlin.collections.c) d11).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((VasistasCategoryId) next).b() != null) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(x.y(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                h0Var2 = nVar.f48644a;
                j12 = nVar.f48646c;
                Vasistas.Category b10 = ((VasistasCategoryId) it2.next()).b();
                dateTime3 = nVar.f48647d;
                arrayList2.add(h0Var2.t(dateTime3, j12, b10));
            }
            p0Var.f76257a = x.L(arrayList2);
        }
        activityAggregateManager = nVar.f48645b;
        j11 = nVar.f48646c;
        dateTime2 = nVar.f48647d;
        nVar.k0().postValue(new n.a(activityAggregateManager.getAggregateForDay(j11, dateTime2), p0Var.f76257a));
        return y.f85009a;
    }
}
