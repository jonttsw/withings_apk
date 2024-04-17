package com.withings.wiscale2.heart.bloodpressure;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.withings.graph.TimeGraphView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.MeasuresGroup;
import com.withings.periodsbar.Period;
import com.withings.user.User;
import com.withings.views.graphs.GraphPopupView;
import com.withings.wiscale2.heart.HeartDetailActivity;
import com.withings.wiscale2.heart.HeartHistoryActivity;
import com.withings.wiscale2.heart.bloodpressure.BloodPressureMeasureListActivity;
import com.withings.wiscale2.heart.bloodpressure.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import lg0.a;
import org.joda.time.DateTime;
/* compiled from: BloodPressureHistoryDelegate.kt */
/* loaded from: classes5.dex */
public final class j implements HeartHistoryActivity.b {

    /* renamed from: a  reason: collision with root package name */
    private final User f57388a;

    /* renamed from: b  reason: collision with root package name */
    private DateTime f57389b;

    /* renamed from: c  reason: collision with root package name */
    private TimeGraphView f57390c;

    /* renamed from: d  reason: collision with root package name */
    private final GraphPopupView f57391d;

    /* renamed from: e  reason: collision with root package name */
    private final com.withings.wiscale2.heart.t f57392e;

    /* renamed from: f  reason: collision with root package name */
    private com.withings.wiscale2.heart.p f57393f;

    /* renamed from: g  reason: collision with root package name */
    private int f57394g;

    /* renamed from: h  reason: collision with root package name */
    private final fy.o f57395h;

    /* renamed from: i  reason: collision with root package name */
    private final CoroutineScope f57396i;

    /* renamed from: j  reason: collision with root package name */
    public lg0.a f57397j;

    /* compiled from: BloodPressureHistoryDelegate.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.bloodpressure.BloodPressureHistoryDelegate$loadData$1", f = "BloodPressureHistoryDelegate.kt", l = {45}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super List<? extends MeasuresGroup>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f57398a;

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<? extends MeasuresGroup>> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f57398a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                j jVar = j.this;
                fy.o oVar = jVar.f57395h;
                long q11 = jVar.e().q();
                this.f57398a = 1;
                obj = fy.o.a(oVar, q11, null, null, new int[]{10, 9}, null, false, this, ConstantsWs.WS_STATUS_WRONGMEASTYPE);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return hy.g.f((List) obj);
        }
    }

    /* compiled from: BloodPressureHistoryDelegate.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<rs.e, nm0.y> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(rs.e eVar) {
            rs.e datum = eVar;
            kotlin.jvm.internal.u.j(datum, "datum");
            j.c(j.this, datum);
            return nm0.y.f85009a;
        }
    }

    public j(User user, DateTime dateTime, TimeGraphView timeGraphView, GraphPopupView graphPopupView, com.withings.wiscale2.heart.t popupClickListener, com.withings.wiscale2.heart.p heartHistoryZoomListener, int i11, fy.o oVar, LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl) {
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(popupClickListener, "popupClickListener");
        kotlin.jvm.internal.u.j(heartHistoryZoomListener, "heartHistoryZoomListener");
        this.f57388a = user;
        this.f57389b = dateTime;
        this.f57390c = timeGraphView;
        this.f57391d = graphPopupView;
        this.f57392e = popupClickListener;
        this.f57393f = heartHistoryZoomListener;
        this.f57394g = i11;
        this.f57395h = oVar;
        this.f57396i = lifecycleCoroutineScopeImpl;
    }

    public static final void c(j jVar, rs.e eVar) {
        Period period;
        jVar.getClass();
        Object obj = eVar.f95625j;
        kotlin.jvm.internal.u.h(obj, "null cannot be cast to non-null type com.withings.wiscale2.heart.graph.BloodPressureGraphFactory.DataHolder");
        a.b bVar = (a.b) obj;
        boolean d11 = bVar.d();
        TimeGraphView timeGraphView = jVar.f57390c;
        com.withings.wiscale2.heart.t tVar = jVar.f57392e;
        User user = jVar.f57388a;
        if (d11) {
            DateTime e11 = bt.a.e(eVar.f95616a);
            if (jVar.f57394g == 365) {
                period = Period.f43723h;
            } else {
                period = Period.f43721f;
            }
            BloodPressureMeasureListActivity.b bVar2 = BloodPressureMeasureListActivity.f57302p;
            Context context = timeGraphView.getContext();
            bVar2.getClass();
            Intent a11 = BloodPressureMeasureListActivity.b.a(context, user, e11, period);
            timeGraphView.getContext();
            tVar.T1(a11);
            return;
        }
        Intent D3 = HeartDetailActivity.D3(timeGraphView.getContext(), bVar.b(), 0, user.q());
        kotlin.jvm.internal.u.g(D3);
        tVar.T1(D3);
    }

    private static DateTime d(ArrayList arrayList, DateTime dateTime) {
        Object obj;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (!it.hasNext()) {
                obj = next;
            } else {
                long abs = Math.abs(((DateTime) next).getMillis() - dateTime.getMillis());
                do {
                    Object next2 = it.next();
                    long abs2 = Math.abs(((DateTime) next2).getMillis() - dateTime.getMillis());
                    if (abs > abs2) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
                obj = next;
            }
        }
        return (DateTime) obj;
    }

    @Override // com.withings.wiscale2.heart.HeartHistoryActivity.b
    public final Fragment E1(DateTime day, int i11) {
        kotlin.jvm.internal.u.j(day, "day");
        k.a aVar = k.f57401w;
        int i12 = this.f57394g;
        aVar.getClass();
        User user = this.f57388a;
        kotlin.jvm.internal.u.j(user, "user");
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putParcelable(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user);
        bundle.putSerializable("extra_date", day);
        bundle.putInt("extra_granularity", i12);
        bundle.putInt("extra_current_scroll", i11);
        kVar.setArguments(bundle);
        return kVar;
    }

    @Override // com.withings.wiscale2.heart.HeartHistoryActivity.b
    public final void F(int i11) {
        Object obj;
        Object obj2;
        Object obj3;
        if (this.f57394g != i11) {
            this.f57394g = i11;
            lg0.a aVar = this.f57397j;
            if (aVar != null) {
                Iterator it = aVar.z().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((rs.h) obj).i()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                rs.h hVar = (rs.h) obj;
                if (hVar != null) {
                    this.f57389b = bt.a.e(hVar.f95616a);
                    hVar.o(false);
                    this.f57391d.a();
                } else {
                    TimeGraphView timeGraphView = this.f57390c;
                    List<ts.d> graphs = timeGraphView.getGraphs();
                    DateTime e11 = bt.a.e((timeGraphView.getCurrentViewport().left + timeGraphView.getCurrentViewport().right) / 2);
                    int i12 = this.f57394g;
                    if (i12 != 7 && i12 != 31) {
                        if (i12 == 365) {
                            kotlin.jvm.internal.u.g(graphs);
                            Iterator<T> it2 = graphs.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj3 = it2.next();
                                    if (kotlin.jvm.internal.u.e(((ts.d) obj3).g(), "mergedByMonth")) {
                                        break;
                                    }
                                } else {
                                    obj3 = null;
                                    break;
                                }
                            }
                            ts.d dVar = (ts.d) obj3;
                            if (dVar != null) {
                                List<rs.e> b10 = dVar.b().b();
                                kotlin.jvm.internal.u.i(b10, "getAllData(...)");
                                List<rs.e> list = b10;
                                ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
                                for (rs.e eVar : list) {
                                    arrayList.add(bt.a.e(eVar.f95616a));
                                }
                                kotlin.jvm.internal.u.g(e11);
                                e11 = d(arrayList, e11);
                            }
                            e11 = null;
                        }
                        this.f57389b = e11;
                    } else {
                        kotlin.jvm.internal.u.g(graphs);
                        Iterator<T> it3 = graphs.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj2 = it3.next();
                                if (kotlin.jvm.internal.u.e(((ts.d) obj2).g(), "mergedByDay")) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        ts.d dVar2 = (ts.d) obj2;
                        if (dVar2 != null) {
                            List<rs.e> b11 = dVar2.b().b();
                            kotlin.jvm.internal.u.i(b11, "getAllData(...)");
                            List<rs.e> list2 = b11;
                            ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(list2, 10));
                            for (rs.e eVar2 : list2) {
                                arrayList2.add(bt.a.e(eVar2.f95616a));
                            }
                            kotlin.jvm.internal.u.g(e11);
                            e11 = d(arrayList2, e11);
                            this.f57389b = e11;
                        }
                        e11 = null;
                        this.f57389b = e11;
                    }
                }
                DateTime dateTime = this.f57389b;
                if (dateTime == null) {
                    dateTime = DateTime.now();
                }
                lg0.a aVar2 = this.f57397j;
                if (aVar2 != null) {
                    kotlin.jvm.internal.u.g(dateTime);
                    aVar2.w(dateTime, i11);
                    return;
                }
                kotlin.jvm.internal.u.s("graphFactory");
                throw null;
            }
            kotlin.jvm.internal.u.s("graphFactory");
            throw null;
        }
    }

    @Override // com.withings.wiscale2.heart.HeartHistoryActivity.b
    public final void S0(DateTime dateTime) {
        this.f57389b = dateTime;
    }

    @Override // com.withings.wiscale2.heart.HeartHistoryActivity.b
    public final DateTime a() {
        return this.f57389b;
    }

    public final User e() {
        return this.f57388a;
    }

    @Override // py.a
    public final String getAnalyticsDetailsViewIdentifier() {
        return "blood_pressure";
    }

    @Override // com.withings.wiscale2.heart.HeartHistoryActivity.b
    public final List<MeasuresGroup> i() {
        Object runBlocking$default;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new a(null), 1, null);
        return (List) runBlocking$default;
    }

    @Override // com.withings.wiscale2.heart.HeartHistoryActivity.b
    public final void j(List<? extends MeasuresGroup> measuresGroups) {
        Float valueOf;
        float f11;
        Float valueOf2;
        Object now;
        kotlin.jvm.internal.u.j(measuresGroups, "measuresGroups");
        DateTime dateTime = this.f57389b;
        if (dateTime == null) {
            MeasuresGroup measuresGroup = (MeasuresGroup) kotlin.collections.x.U(measuresGroups);
            if (measuresGroup == null || (now = measuresGroup.getDate()) == null) {
                now = DateTime.now();
            }
            dateTime = new DateTime(now);
        }
        DateTime dateTime2 = dateTime;
        List<? extends MeasuresGroup> list = measuresGroups;
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            valueOf = null;
        } else {
            float f12 = (float) ((MeasuresGroup) it.next()).getMeasureForType(10).f95794y;
            while (it.hasNext()) {
                f12 = Math.max(f12, (float) ((MeasuresGroup) it.next()).getMeasureForType(10).f95794y);
            }
            valueOf = Float.valueOf(f12);
        }
        float f13 = 0.0f;
        if (valueOf != null) {
            f11 = valueOf.floatValue();
        } else {
            f11 = 0.0f;
        }
        Iterator<T> it2 = list.iterator();
        if (!it2.hasNext()) {
            valueOf2 = null;
        } else {
            float f14 = (float) ((MeasuresGroup) it2.next()).getMeasureForType(9).f95794y;
            while (it2.hasNext()) {
                f14 = Math.min(f14, (float) ((MeasuresGroup) it2.next()).getMeasureForType(9).f95794y);
            }
            valueOf2 = Float.valueOf(f14);
        }
        if (valueOf2 != null) {
            f13 = valueOf2.floatValue();
        }
        HeartHistoryActivity.f57022w.getClass();
        f80.a aVar = new f80.a(f13, f11, 0.0f, false, this.f57394g, HeartHistoryActivity.f57024y, 25820);
        TimeGraphView timeGraphView = this.f57390c;
        Context context = timeGraphView.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        lg0.a aVar2 = new lg0.a(context, this.f57388a, this.f57390c, aVar, measuresGroups, dateTime2, this.f57396i);
        aVar2.D(this.f57391d, new b());
        this.f57397j = aVar2;
        aVar2.k();
        lg0.a aVar3 = this.f57397j;
        if (aVar3 != null) {
            com.withings.wiscale2.heart.p zoomListener = this.f57393f;
            kotlin.jvm.internal.u.j(zoomListener, "zoomListener");
            aVar3.i().a0(new a.C1252a(zoomListener));
            timeGraphView.b0();
            ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
            for (MeasuresGroup measuresGroup2 : list) {
                arrayList.add(new DateTime(measuresGroup2.getDate()));
            }
            this.f57389b = d(arrayList, dateTime2);
            return;
        }
        kotlin.jvm.internal.u.s("graphFactory");
        throw null;
    }

    @Override // com.withings.wiscale2.heart.HeartHistoryActivity.b
    public final void x1(boolean z5) {
    }
}
