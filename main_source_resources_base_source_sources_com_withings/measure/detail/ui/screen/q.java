package com.withings.measure.detail.ui.screen;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e1;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.withings.library.measure.Measure;
import com.withings.library.measure.MeasuresGroup;
import com.withings.periodsbar.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.x;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: MeasureDetailViewModel.kt */
/* loaded from: classes4.dex */
public final class q extends w implements zx.u {

    /* renamed from: d  reason: collision with root package name */
    private final k0<Boolean> f41773d;

    /* renamed from: e  reason: collision with root package name */
    private final k0<Boolean> f41774e;

    /* renamed from: f  reason: collision with root package name */
    private final j0 f41775f;

    /* renamed from: g  reason: collision with root package name */
    private final j0 f41776g;

    /* renamed from: h  reason: collision with root package name */
    private final xw.f f41777h;

    /* renamed from: i  reason: collision with root package name */
    private final xw.p<DateTime, List<MeasuresGroup>, nm0.j<DateTime, List<MeasuresGroup>>> f41778i;

    /* renamed from: j  reason: collision with root package name */
    private final xw.f f41779j;

    /* renamed from: k  reason: collision with root package name */
    private final j0 f41780k;

    /* compiled from: MeasureDetailViewModel.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<MeasuresGroup, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f41781a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final DateTime invoke(MeasuresGroup measuresGroup) {
            Date date;
            MeasuresGroup measuresGroup2 = measuresGroup;
            if (measuresGroup2 != null && (date = measuresGroup2.getDate()) != null) {
                return new DateTime(date);
            }
            return DateTime.now();
        }
    }

    /* compiled from: MeasureDetailViewModel.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<List<MeasuresGroup>, MeasuresGroup> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f41782a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j5) {
            super(1);
            this.f41782a = j5;
        }

        @Override // ym0.l
        public final MeasuresGroup invoke(List<MeasuresGroup> list) {
            Object obj;
            List<MeasuresGroup> groups = list;
            kotlin.jvm.internal.u.j(groups, "groups");
            Iterator<T> it = groups.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((MeasuresGroup) obj).getId() == this.f41782a) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            MeasuresGroup measuresGroup = (MeasuresGroup) obj;
            if (measuresGroup == null) {
                return (MeasuresGroup) x.U(groups);
            }
            return measuresGroup;
        }
    }

    /* compiled from: MeasureDetailViewModel.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<List<MeasuresGroup>, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f41783a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final DateTime invoke(List<MeasuresGroup> list) {
            DateTime dateTime;
            List<MeasuresGroup> groups = list;
            kotlin.jvm.internal.u.j(groups, "groups");
            MeasuresGroup measuresGroup = (MeasuresGroup) x.K(groups);
            if (measuresGroup != null) {
                Date date = measuresGroup.getDate();
                if (date != null) {
                    dateTime = new DateTime(date);
                } else {
                    dateTime = null;
                }
                if (dateTime != null) {
                    return dateTime;
                }
            }
            return DateTime.now();
        }
    }

    /* compiled from: MeasureDetailViewModel.kt */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.l<Boolean, LiveData<List<MeasuresGroup>>> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<List<MeasuresGroup>> invoke(Boolean bool) {
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new u(q.this, null), 2);
        }
    }

    /* compiled from: MeasureDetailViewModel.kt */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.l<DateTime, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f41785a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final DateTime invoke(DateTime dateTime) {
            return dateTime;
        }
    }

    /* compiled from: MeasureDetailViewModel.kt */
    /* loaded from: classes4.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.l<nm0.j<DateTime, DateTime>, Integer> {
        f() {
            super(1);
        }

        @Override // ym0.l
        public final Integer invoke(nm0.j<DateTime, DateTime> jVar) {
            ym0.l tVar;
            int i11;
            int i12;
            Double d11;
            nm0.j<DateTime, DateTime> jVar2 = jVar;
            DateTime a11 = jVar2.a();
            DateTime b10 = jVar2.b();
            q qVar = q.this;
            List list = (List) qVar.f41775f.getValue();
            Integer num = null;
            if (list == null) {
                return null;
            }
            kotlin.jvm.internal.u.g(b10);
            kotlin.jvm.internal.u.g(a11);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                long millis = b10.withTimeAtStartOfDay().getMillis();
                long millis2 = hn.a.m(b10).getMillis();
                long time = ((MeasuresGroup) obj).getDate().getTime();
                if (millis <= time && time <= millis2) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Measure measureForType = ((MeasuresGroup) it.next()).getMeasureForType(qVar.f0().getMeasureType());
                if (measureForType != null) {
                    d11 = Double.valueOf(measureForType.f95794y);
                } else {
                    d11 = null;
                }
                if (d11 != null) {
                    arrayList2.add(d11);
                }
            }
            Double invoke = qVar.f0().I0().invoke(arrayList2);
            if (kotlin.jvm.internal.u.e(b10, a11)) {
                tVar = new s(a11);
            } else {
                tVar = new t(b10, qVar, invoke);
            }
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (((Boolean) tVar.invoke((MeasuresGroup) listIterator.previous())).booleanValue()) {
                        i11 = listIterator.nextIndex();
                        break;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i11);
            if (i11 != -1) {
                num = valueOf;
            }
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 0;
            }
            return Integer.valueOf(i12);
        }
    }

    /* compiled from: MeasureDetailViewModel.kt */
    /* loaded from: classes4.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.l<nm0.j<Period, Integer>, Integer> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<DateTime, Integer> f41788b;

        /* compiled from: MeasureDetailViewModel.kt */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f41789a;

            static {
                int[] iArr = new int[Period.values().length];
                try {
                    Period.a aVar = Period.f43718c;
                    iArr[4] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f41789a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(ym0.l<? super DateTime, Integer> lVar) {
            super(1);
            this.f41788b = lVar;
        }

        @Override // ym0.l
        public final Integer invoke(nm0.j<Period, Integer> jVar) {
            nm0.j<Period, Integer> jVar2 = jVar;
            Period a11 = jVar2.a();
            Integer b10 = jVar2.b();
            int i11 = 0;
            if (a11 != null && a.f41789a[a11.ordinal()] == 1) {
                DateTime dateTime = (DateTime) q.this.f41777h.getValue();
                if (dateTime != null) {
                    i11 = this.f41788b.invoke(dateTime).intValue();
                }
            } else if (b10 != null) {
                i11 = b10.intValue();
            }
            return Integer.valueOf(i11);
        }
    }

    /* compiled from: MeasureDetailViewModel.kt */
    /* loaded from: classes4.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.l<nm0.j<DateTime, List<MeasuresGroup>>, Period> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Period f41790a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Period period) {
            super(1);
            this.f41790a = period;
        }

        @Override // ym0.l
        public final Period invoke(nm0.j<DateTime, List<MeasuresGroup>> jVar) {
            return this.f41790a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(long j5, cy.a aVar, MeasureDetailScreen<Double> measureDetailScreen, long j11, Period entryPointPeriod, ym0.l<? super DateTime, Integer> lVar) {
        super(j5, aVar, measureDetailScreen);
        kotlin.jvm.internal.u.j(measureDetailScreen, "measureDetailScreen");
        kotlin.jvm.internal.u.j(entryPointPeriod, "entryPointPeriod");
        Boolean bool = Boolean.TRUE;
        this.f41773d = xw.d.b(bool);
        k0<Boolean> b10 = xw.d.b(bool);
        this.f41774e = b10;
        j0 c11 = e1.c(b10, new d());
        this.f41775f = c11;
        j0 b11 = e1.b(c11, c.f41783a);
        this.f41776g = b11;
        j0 b12 = e1.b(e1.b(c11, new b(j11)), a.f41781a);
        xw.f f11 = xw.d.f(e1.b(b12, e.f41785a));
        this.f41777h = f11;
        j0 b13 = e1.b(xw.a.d(new nm0.j(b12, f11)), new f());
        xw.p<DateTime, List<MeasuresGroup>, nm0.j<DateTime, List<MeasuresGroup>>> d11 = xw.a.d(new nm0.j(b11, c11));
        this.f41778i = d11;
        xw.f f12 = xw.d.f(e1.b(d11, new h(entryPointPeriod)));
        this.f41779j = f12;
        this.f41780k = e1.b(xw.a.d(new nm0.j(f12, b13)), new g(lVar));
        aVar.a(this);
    }

    @Override // zx.u
    public final void a0(long j5, MeasuresGroup measuresGroup) {
        if (j5 == i0()) {
            this.f41774e.postValue(Boolean.TRUE);
        }
    }

    @Override // zx.u
    public final void l(long j5, MeasuresGroup measuresGroup) {
        if (j5 == i0()) {
            this.f41774e.postValue(Boolean.TRUE);
        }
    }

    public final xw.p<DateTime, List<MeasuresGroup>, nm0.j<DateTime, List<MeasuresGroup>>> m0() {
        return this.f41778i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g1
    public final void onCleared() {
        g0().b(this);
    }

    public final j0 p0() {
        return this.f41776g;
    }

    public final k0<Boolean> q0() {
        return this.f41773d;
    }

    public final j0 r0() {
        return this.f41780k;
    }

    public final xw.f t0() {
        return this.f41779j;
    }

    public final void y0(DateTime newDate) {
        kotlin.jvm.internal.u.j(newDate, "newDate");
        this.f41777h.postValue(newDate);
        Period period = Period.f43720e;
        if (!f0().getPeriodList().contains(period)) {
            period = null;
        }
        if (period == null) {
            period = Period.f43721f;
        }
        z0(period);
    }

    @Override // zx.u
    public final void z(long j5, MeasuresGroup measuresGroup, boolean z5) {
        if (j5 == i0()) {
            this.f41774e.postValue(Boolean.TRUE);
        }
    }

    public final void z0(Period period) {
        kotlin.jvm.internal.u.j(period, "period");
        this.f41779j.postValue(period);
    }
}
