package com.withings.measurements.ui;

import com.withings.features.FeatureFlag;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.measurement.model.MeasurementsVertical;
import com.withings.measurements.ui.t1;
import com.withings.user.core.models.User;
import com.withings.wiscale2.C1987R;
import gz.j0;
import iz.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import wv.b;
/* compiled from: MeasurementsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/measurements/ui/MeasurementsViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MeasurementsViewModel extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final kn.e f41945a;

    /* renamed from: b  reason: collision with root package name */
    private final rt.a f41946b;

    /* renamed from: c  reason: collision with root package name */
    private final xv.e f41947c;

    /* renamed from: d  reason: collision with root package name */
    private final iz.c f41948d;

    /* renamed from: e  reason: collision with root package name */
    private final r70.c f41949e;

    /* renamed from: f  reason: collision with root package name */
    private final lz.m f41950f;

    /* renamed from: g  reason: collision with root package name */
    private final t00.d f41951g;

    /* renamed from: h  reason: collision with root package name */
    private final oz.g f41952h;

    /* renamed from: i  reason: collision with root package name */
    private final oz.h f41953i;

    /* renamed from: j  reason: collision with root package name */
    private final oz.i f41954j;

    /* renamed from: k  reason: collision with root package name */
    private final MutableStateFlow<n2> f41955k;

    /* renamed from: l  reason: collision with root package name */
    private final StateFlow<n2> f41956l;

    /* renamed from: m  reason: collision with root package name */
    private final StateFlow<User> f41957m;

    /* renamed from: n  reason: collision with root package name */
    private final StateFlow<Boolean> f41958n;

    /* renamed from: o  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f41959o;

    /* renamed from: p  reason: collision with root package name */
    private final StateFlow<Boolean> f41960p;

    /* renamed from: q  reason: collision with root package name */
    private final MutableSharedFlow<nm0.y> f41961q;

    /* renamed from: r  reason: collision with root package name */
    private final SharedFlow<nm0.y> f41962r;

    /* renamed from: s  reason: collision with root package name */
    private final SharedFlow<pt.e> f41963s;

    /* renamed from: t  reason: collision with root package name */
    private final SharedFlow<EnumMap<MeasurementsVertical, List<gz.j0>>> f41964t;

    /* renamed from: u  reason: collision with root package name */
    private final SharedFlow f41965u;

    /* renamed from: v  reason: collision with root package name */
    private final Flow<Map<fn0.d<? extends j0.a>, List<kw.d>>> f41966v;

    /* renamed from: w  reason: collision with root package name */
    private final Flow<List<t1>> f41967w;

    /* renamed from: x  reason: collision with root package name */
    private final SharedFlow<lz.a> f41968x;

    /* renamed from: y  reason: collision with root package name */
    private final Flow<List<User>> f41969y;

    /* renamed from: z  reason: collision with root package name */
    private final StateFlow<wv.b> f41970z;

    /* compiled from: MeasurementsViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.MeasurementsViewModel$carouselContent$1", f = "MeasurementsViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.r<EnumMap<MeasurementsVertical, List<? extends gz.j0>>, pt.e, n20.h, qm0.d<? super lz.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ EnumMap f41971a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ pt.e f41972b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ n20.h f41973c;

        a(qm0.d<? super a> dVar) {
            super(4, dVar);
        }

        @Override // ym0.r
        public final Object invoke(EnumMap<MeasurementsVertical, List<? extends gz.j0>> enumMap, pt.e eVar, n20.h hVar, qm0.d<? super lz.a> dVar) {
            a aVar = new a(dVar);
            aVar.f41971a = enumMap;
            aVar.f41972b = eVar;
            aVar.f41973c = hVar;
            return aVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            MeasurementsViewModel measurementsViewModel;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            EnumMap enumMap = this.f41971a;
            pt.e eVar = this.f41972b;
            n20.h hVar = this.f41973c;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : enumMap.entrySet()) {
                List list = (List) entry.getValue();
                kotlin.jvm.internal.u.g(list);
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((gz.j0) it.next()) instanceof j0.a) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                measurementsViewModel = MeasurementsViewModel.this;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it2.next();
                String a11 = measurementsViewModel.f41950f.a(fz.c.a(entry2, eVar, !ay.b.q(hVar)));
                Object key = entry2.getKey();
                kotlin.jvm.internal.u.i(key, "<get-key>(...)");
                arrayList.add(lz.l.a((MeasurementsVertical) key, true, a11));
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry3 : enumMap.entrySet()) {
                List list3 = (List) entry3.getValue();
                kotlin.jvm.internal.u.g(list3);
                List<gz.j0> list4 = list3;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    for (gz.j0 j0Var : list4) {
                        if (j0Var instanceof j0.a) {
                            break;
                        }
                    }
                }
                linkedHashMap2.put(entry3.getKey(), entry3.getValue());
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
            for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                String a12 = measurementsViewModel.f41950f.a(fz.c.a(entry4, eVar, true));
                Object key2 = entry4.getKey();
                kotlin.jvm.internal.u.i(key2, "<get-key>(...)");
                arrayList2.add(lz.l.a((MeasurementsVertical) key2, false, a12));
            }
            return new lz.a(arrayList, arrayList2);
        }
    }

    /* compiled from: MeasurementsViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.MeasurementsViewModel$healthScoreComponentUiState$1", f = "MeasurementsViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.q<n20.h, pt.e, qm0.d<? super wv.b>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ n20.h f41975a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ pt.e f41976b;

        b(qm0.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // ym0.q
        public final Object invoke(n20.h hVar, pt.e eVar, qm0.d<? super wv.b> dVar) {
            b bVar = new b(dVar);
            bVar.f41975a = hVar;
            bVar.f41976b = eVar;
            return bVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            n20.h hVar = this.f41975a;
            pt.e eVar = this.f41976b;
            if (!ay.b.q(hVar)) {
                return b.e.f106137a;
            }
            MeasurementsViewModel.this.f41947c.getClass();
            if (eVar == null) {
                return b.d.f106136a;
            }
            double f11 = eVar.a().f();
            pt.d a11 = eVar.a();
            om0.c cVar = new om0.c();
            pt.b b10 = a11.b();
            if (b10 != null) {
                Integer num = (Integer) cVar.put(MeasurementsVertical.f41862a, Integer.valueOf(an0.a.a(b10.b())));
            }
            pt.c d11 = a11.d();
            if (d11 != null) {
                Integer num2 = (Integer) cVar.put(MeasurementsVertical.f41863b, Integer.valueOf(an0.a.a(d11.c())));
            }
            pt.f g11 = a11.g();
            if (g11 != null) {
                Integer num3 = (Integer) cVar.put(MeasurementsVertical.f41864c, Integer.valueOf(an0.a.a(g11.h())));
            }
            pt.g i12 = a11.i();
            if (i12 != null) {
                cVar.put(MeasurementsVertical.f41867f, Integer.valueOf(an0.a.a(i12.a())));
            }
            om0.c l5 = cVar.l();
            Interval interval = new Interval(eVar.a().e().withDayOfWeek(1).toDateTimeAtStartOfDay(), eVar.a().e().withDayOfWeek(7).toDateTimeAtStartOfDay());
            String str = interval.getStart().toString("d") + " - " + interval.getEnd().toString("d MMM YYYY");
            kotlin.jvm.internal.u.i(str, "toString(...)");
            pt.d b11 = eVar.b();
            if (b11 != null) {
                int a12 = an0.a.a(f11 - b11.f());
                if (a12 > 0) {
                    i11 = C1987R.drawable.his_trend_up;
                } else if (a12 < 0) {
                    i11 = C1987R.drawable.his_trend_down;
                } else {
                    i11 = C1987R.drawable.his_trend_stable;
                }
                return new b.a(an0.a.a(f11), str, l5, i11, a12);
            }
            return new b.C1830b(an0.a.a(f11), str, l5);
        }
    }

    /* compiled from: MeasurementsViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.MeasurementsViewModel$items$1", f = "MeasurementsViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.q<EnumMap<MeasurementsVertical, List<? extends gz.j0>>, Map<fn0.d<? extends j0.a>, ? extends List<? extends kw.d>>, qm0.d<? super List<? extends t1>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ EnumMap f41978a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Map f41979b;

        /* compiled from: Comparisons.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return pm0.a.b(((a.b) t12).b().c(), ((a.b) t11).b().c());
            }
        }

        c(qm0.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // ym0.q
        public final Object invoke(EnumMap<MeasurementsVertical, List<? extends gz.j0>> enumMap, Map<fn0.d<? extends j0.a>, ? extends List<? extends kw.d>> map, qm0.d<? super List<? extends t1>> dVar) {
            c cVar = new c(dVar);
            cVar.f41978a = enumMap;
            cVar.f41979b = map;
            return cVar.invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Comparator] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            MeasurementHeader measurementHeader;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            EnumMap enumMap = this.f41978a;
            Map<fn0.d<? extends j0.a>, ? extends List<kw.d>> map = this.f41979b;
            DateTime now = DateTime.now();
            ArrayList arrayList = new ArrayList(enumMap.size());
            for (Map.Entry entry : enumMap.entrySet()) {
                MeasurementsVertical measurementsVertical = (MeasurementsVertical) entry.getKey();
                List list = (List) entry.getValue();
                kotlin.jvm.internal.u.g(list);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof j0.a) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(kotlin.collections.x.y(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    oz.h hVar = MeasurementsViewModel.this.f41953i;
                    kotlin.jvm.internal.u.g(measurementsVertical);
                    arrayList3.add(hVar.a((j0.a) it.next(), map, measurementsVertical));
                }
                arrayList.add(arrayList3);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj3 : kotlin.collections.x.D0(kotlin.collections.x.L(arrayList), new Object())) {
                DateTime c11 = ((a.b) obj3).b().c();
                DateTime minusDays = now.minusDays(7);
                kotlin.jvm.internal.u.i(minusDays, "minusDays(...)");
                if (androidx.activity.b0.o(c11, minusDays)) {
                    measurementHeader = MeasurementHeader.f41939a;
                } else {
                    DateTime minusDays2 = now.minusDays(30);
                    kotlin.jvm.internal.u.i(minusDays2, "minusDays(...)");
                    if (androidx.activity.b0.o(c11, minusDays2)) {
                        measurementHeader = MeasurementHeader.f41940b;
                    } else {
                        DateTime minusMonths = now.minusMonths(12);
                        kotlin.jvm.internal.u.i(minusMonths, "minusMonths(...)");
                        if (androidx.activity.b0.o(c11, minusMonths)) {
                            measurementHeader = MeasurementHeader.f41941c;
                        } else {
                            measurementHeader = MeasurementHeader.f41942d;
                        }
                    }
                }
                Object obj4 = linkedHashMap.get(measurementHeader);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap.put(measurementHeader, obj4);
                }
                ((List) obj4).add(obj3);
            }
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                List V = kotlin.collections.x.V(new t1.a((MeasurementHeader) entry2.getKey()));
                List<a.b> list2 = (List) entry2.getValue();
                ArrayList arrayList5 = new ArrayList(kotlin.collections.x.y(list2, 10));
                for (a.b bVar : list2) {
                    arrayList5.add(new t1.b(bVar));
                }
                kotlin.collections.x.n(kotlin.collections.x.l0(arrayList5, V), arrayList4);
            }
            return arrayList4;
        }
    }

    /* compiled from: MeasurementsViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.MeasurementsViewModel$items$2", f = "MeasurementsViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_VO2MAX_HR_MAX}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super List<? extends t1>>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f41981a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f41982b;

        d() {
            throw null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, qm0.d<nm0.y>, com.withings.measurements.ui.MeasurementsViewModel$d] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            ?? iVar = new kotlin.coroutines.jvm.internal.i(2, dVar);
            iVar.f41982b = obj;
            return iVar;
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super List<? extends t1>> flowCollector, qm0.d<? super nm0.y> dVar) {
            return ((d) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f41981a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                t1.a aVar = new t1.a(MeasurementHeader.f41943e);
                a.C1105a c1105a = a.C1105a.f73365a;
                List W = kotlin.collections.x.W(aVar, new t1.b(c1105a), new t1.b(c1105a), new t1.b(c1105a));
                this.f41981a = 1;
                if (((FlowCollector) this.f41982b).emit(W, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: MeasurementsViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.MeasurementsViewModel$refresh$1", f = "MeasurementsViewModel.kt", l = {228}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f41983a;

        e(qm0.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new e(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f41983a;
            MeasurementsViewModel measurementsViewModel = MeasurementsViewModel.this;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                measurementsViewModel.f41959o.setValue(Boolean.TRUE);
                t00.d dVar = measurementsViewModel.f41951g;
                Long l5 = new Long(((n2) measurementsViewModel.f41955k.getValue()).a().getId());
                this.f41983a = 1;
                qm0.i iVar = new qm0.i(rm0.a.b(this));
                dVar.c("syncForMeasurementRefresh", l5, new t00.e(iVar));
                if (iVar.a() == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            measurementsViewModel.f41959o.setValue(Boolean.FALSE);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: MeasurementsViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.MeasurementsViewModel$selectUser$1", f = "MeasurementsViewModel.kt", l = {93, 94}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        User f41985a;

        /* renamed from: b  reason: collision with root package name */
        User f41986b;

        /* renamed from: c  reason: collision with root package name */
        MutableStateFlow f41987c;

        /* renamed from: d  reason: collision with root package name */
        int f41988d;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f41990f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j5, qm0.d<? super f> dVar) {
            super(2, dVar);
            this.f41990f = j5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new f(this.f41990f, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((f) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r9.f41988d
                r2 = 2
                com.withings.measurements.ui.MeasurementsViewModel r3 = com.withings.measurements.ui.MeasurementsViewModel.this
                r4 = 1
                if (r1 == 0) goto L24
                if (r1 == r4) goto L20
                if (r1 != r2) goto L18
                kotlinx.coroutines.flow.MutableStateFlow r0 = r9.f41987c
                com.withings.user.core.models.User r1 = r9.f41986b
                com.withings.user.core.models.User r2 = r9.f41985a
                nm0.l.b(r10)
                goto L6b
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                nm0.l.b(r10)
                goto L4c
            L24:
                nm0.l.b(r10)
                kotlinx.coroutines.flow.MutableStateFlow r10 = com.withings.measurements.ui.MeasurementsViewModel.A0(r3)
                java.lang.Object r10 = r10.getValue()
                com.withings.measurements.ui.n2 r10 = (com.withings.measurements.ui.n2) r10
                com.withings.user.core.models.User r10 = r10.a()
                long r5 = r10.getId()
                long r7 = r9.f41990f
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 == 0) goto L83
                r70.c r10 = com.withings.measurements.ui.MeasurementsViewModel.t0(r3)
                r9.f41988d = r4
                java.lang.Object r10 = r70.d.b(r10, r7, r9)
                if (r10 != r0) goto L4c
                return r0
            L4c:
                r1 = r10
                com.withings.user.core.models.User r1 = (com.withings.user.core.models.User) r1
                if (r1 == 0) goto L83
                kotlinx.coroutines.flow.MutableStateFlow r10 = com.withings.measurements.ui.MeasurementsViewModel.A0(r3)
                r70.c r3 = com.withings.measurements.ui.MeasurementsViewModel.t0(r3)
                r9.f41985a = r1
                r9.f41986b = r1
                r9.f41987c = r10
                r9.f41988d = r2
                java.lang.Object r2 = r70.d.d(r3, r9)
                if (r2 != r0) goto L68
                return r0
            L68:
                r0 = r10
                r10 = r2
                r2 = r1
            L6b:
                com.withings.user.core.models.User r10 = (com.withings.user.core.models.User) r10
                long r5 = r10.getId()
                long r2 = r2.getId()
                int r10 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r10 != 0) goto L7a
                goto L7b
            L7a:
                r4 = 0
            L7b:
                com.withings.measurements.ui.n2 r10 = new com.withings.measurements.ui.n2
                r10.<init>(r1, r4)
                r0.setValue(r10)
            L83:
                nm0.y r10 = nm0.y.f85009a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.measurements.ui.MeasurementsViewModel.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Merge.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.MeasurementsViewModel$special$$inlined$flatMapLatest$1", f = "MeasurementsViewModel.kt", l = {193}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.i implements ym0.q<FlowCollector<? super pt.e>, n2, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f41991a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ FlowCollector f41992b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f41993c;

        public g(qm0.d dVar) {
            super(3, dVar);
        }

        @Override // ym0.q
        public final Object invoke(FlowCollector<? super pt.e> flowCollector, n2 n2Var, qm0.d<? super nm0.y> dVar) {
            g gVar = new g(dVar);
            gVar.f41992b = flowCollector;
            gVar.f41993c = n2Var;
            return gVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f41991a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                FlowCollector flowCollector = this.f41992b;
                Flow<pt.e> a11 = MeasurementsViewModel.this.f41946b.a(((n2) this.f41993c).a().getId());
                this.f41991a = 1;
                if (FlowKt.emitAll(flowCollector, a11, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Merge.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.MeasurementsViewModel$special$$inlined$flatMapLatest$2", f = "MeasurementsViewModel.kt", l = {193}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.i implements ym0.q<FlowCollector<? super EnumMap<MeasurementsVertical, List<? extends gz.j0>>>, n2, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f41995a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ FlowCollector f41996b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f41997c;

        public h(qm0.d dVar) {
            super(3, dVar);
        }

        @Override // ym0.q
        public final Object invoke(FlowCollector<? super EnumMap<MeasurementsVertical, List<? extends gz.j0>>> flowCollector, n2 n2Var, qm0.d<? super nm0.y> dVar) {
            h hVar = new h(dVar);
            hVar.f41996b = flowCollector;
            hVar.f41997c = n2Var;
            return hVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f41995a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                FlowCollector flowCollector = this.f41996b;
                Flow<EnumMap<MeasurementsVertical, List<gz.j0>>> d11 = MeasurementsViewModel.this.f41948d.d(((n2) this.f41997c).a());
                this.f41995a = 1;
                if (FlowKt.emitAll(flowCollector, d11, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Merge.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.MeasurementsViewModel$special$$inlined$flatMapLatest$3", f = "MeasurementsViewModel.kt", l = {193}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.i implements ym0.q<FlowCollector<? super Map<fn0.d<? extends j0.a>, ? extends List<? extends kw.d>>>, n2, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f41999a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ FlowCollector f42000b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f42001c;

        public i(qm0.d dVar) {
            super(3, dVar);
        }

        @Override // ym0.q
        public final Object invoke(FlowCollector<? super Map<fn0.d<? extends j0.a>, ? extends List<? extends kw.d>>> flowCollector, n2 n2Var, qm0.d<? super nm0.y> dVar) {
            i iVar = new i(dVar);
            iVar.f42000b = flowCollector;
            iVar.f42001c = n2Var;
            return iVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f41999a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                FlowCollector flowCollector = this.f42000b;
                oz.g gVar = MeasurementsViewModel.this.f41952h;
                long id2 = ((n2) this.f42001c).a().getId();
                gVar.getClass();
                int i12 = wr.b.f106035c;
                Flow transformLatest = FlowKt.transformLatest(wr.b.d(FeatureFlag.f39121o), new oz.d(id2, gVar, null));
                this.f41999a = 1;
                if (FlowKt.emitAll(flowCollector, transformLatest, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class j implements Flow<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f42003a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MeasurementsViewModel f42004b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f42005a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ MeasurementsViewModel f42006b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.MeasurementsViewModel$special$$inlined$map$1$2", f = "MeasurementsViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.measurements.ui.MeasurementsViewModel$j$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0557a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f42007a;

                /* renamed from: b  reason: collision with root package name */
                int f42008b;

                public C0557a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f42007a = obj;
                    this.f42008b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, MeasurementsViewModel measurementsViewModel) {
                this.f42005a = flowCollector;
                this.f42006b = measurementsViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, qm0.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.withings.measurements.ui.MeasurementsViewModel.j.a.C0557a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.withings.measurements.ui.MeasurementsViewModel$j$a$a r0 = (com.withings.measurements.ui.MeasurementsViewModel.j.a.C0557a) r0
                    int r1 = r0.f42008b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f42008b = r1
                    goto L18
                L13:
                    com.withings.measurements.ui.MeasurementsViewModel$j$a$a r0 = new com.withings.measurements.ui.MeasurementsViewModel$j$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f42007a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f42008b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r8)
                    goto L88
                L27:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L2f:
                    nm0.l.b(r8)
                    com.withings.measurements.ui.n2 r7 = (com.withings.measurements.ui.n2) r7
                    com.withings.measurements.ui.MeasurementsViewModel r8 = r6.f42006b
                    kn.e r8 = com.withings.measurements.ui.MeasurementsViewModel.f0(r8)
                    com.withings.user.core.models.User r7 = r7.a()
                    long r4 = r7.getId()
                    java.util.List r7 = r8.i(r4)
                    java.lang.String r8 = "getByUserId(...)"
                    kotlin.jvm.internal.u.i(r7, r8)
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    boolean r8 = r7 instanceof java.util.Collection
                    r2 = 0
                    if (r8 == 0) goto L5c
                    r8 = r7
                    java.util.Collection r8 = (java.util.Collection) r8
                    boolean r8 = r8.isEmpty()
                    if (r8 == 0) goto L5c
                    goto L79
                L5c:
                    java.util.Iterator r7 = r7.iterator()
                L60:
                    boolean r8 = r7.hasNext()
                    if (r8 == 0) goto L79
                    java.lang.Object r8 = r7.next()
                    com.withings.device.Device r8 = (com.withings.device.Device) r8
                    com.withings.device.DeviceModel r8 = r8.getModel()
                    int r8 = r8.b()
                    r4 = 60
                    if (r8 != r4) goto L60
                    r2 = r3
                L79:
                    java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
                    r0.f42008b = r3
                    kotlinx.coroutines.flow.FlowCollector r8 = r6.f42005a
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L88
                    return r1
                L88:
                    nm0.y r7 = nm0.y.f85009a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.measurements.ui.MeasurementsViewModel.j.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public j(StateFlow stateFlow, MeasurementsViewModel measurementsViewModel) {
            this.f42003a = stateFlow;
            this.f42004b = measurementsViewModel;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super Boolean> flowCollector, qm0.d dVar) {
            Object collect = this.f42003a.collect(new a(flowCollector, this.f42004b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Type inference failed for: r10v9, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    @Inject
    public MeasurementsViewModel(n20.b bVar, kn.e deviceManager, rt.a aVar, xv.e eVar, iz.c measurementItemsByVerticalRepository, r70.c userRepository, lz.m mVar, t00.d networkSyncManager, oz.g gVar, oz.h hVar, oz.i iVar) {
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        kotlin.jvm.internal.u.j(measurementItemsByVerticalRepository, "measurementItemsByVerticalRepository");
        kotlin.jvm.internal.u.j(userRepository, "userRepository");
        kotlin.jvm.internal.u.j(networkSyncManager, "networkSyncManager");
        this.f41945a = deviceManager;
        this.f41946b = aVar;
        this.f41947c = eVar;
        this.f41948d = measurementItemsByVerticalRepository;
        this.f41949e = userRepository;
        this.f41950f = mVar;
        this.f41951g = networkSyncManager;
        this.f41952h = gVar;
        this.f41953i = hVar;
        this.f41954j = iVar;
        MutableStateFlow<n2> MutableStateFlow = StateFlowKt.MutableStateFlow(new n2(userRepository.a(androidx.lifecycle.h1.a(this)).getValue(), true));
        this.f41955k = MutableStateFlow;
        StateFlow<n2> asStateFlow = FlowKt.asStateFlow(MutableStateFlow);
        this.f41956l = asStateFlow;
        this.f41957m = userRepository.a(androidx.lifecycle.h1.a(this));
        j jVar = new j(asStateFlow, this);
        CoroutineScope a11 = androidx.lifecycle.h1.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharingStarted lazily = companion.getLazily();
        Boolean bool = Boolean.FALSE;
        this.f41958n = FlowKt.stateIn(jVar, a11, lazily, bool);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.f41959o = MutableStateFlow2;
        this.f41960p = FlowKt.asStateFlow(MutableStateFlow2);
        MutableSharedFlow<nm0.y> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.f41961q = MutableSharedFlow$default;
        this.f41962r = FlowKt.asSharedFlow(MutableSharedFlow$default);
        SharedFlow<pt.e> shareIn = FlowKt.shareIn(FlowKt.transformLatest(asStateFlow, new g(null)), androidx.lifecycle.h1.a(this), companion.getEagerly(), 1);
        this.f41963s = shareIn;
        SharedFlow<EnumMap<MeasurementsVertical, List<gz.j0>>> shareIn2 = FlowKt.shareIn(FlowKt.transformLatest(MutableStateFlow, new h(null)), androidx.lifecycle.h1.a(this), companion.getLazily(), 1);
        this.f41964t = shareIn2;
        SharedFlow shareIn3 = FlowKt.shareIn(bVar.a(), androidx.lifecycle.h1.a(this), companion.getEagerly(), 1);
        this.f41965u = shareIn3;
        Flow<Map<fn0.d<? extends j0.a>, List<kw.d>>> transformLatest = FlowKt.transformLatest(asStateFlow, new i(null));
        this.f41966v = transformLatest;
        this.f41967w = FlowKt.onStart(FlowKt.combine(shareIn2, transformLatest, new c(null)), new kotlin.coroutines.jvm.internal.i(2, null));
        this.f41968x = FlowKt.shareIn(FlowKt.combine(shareIn2, shareIn, shareIn3, new a(null)), androidx.lifecycle.h1.a(this), companion.getEagerly(), 1);
        this.f41969y = userRepository.e(User.Type.NORMAL);
        this.f41970z = FlowKt.stateIn(FlowKt.combine(shareIn3, shareIn, new b(null)), androidx.lifecycle.h1.a(this), companion.getEagerly(), b.c.f106135a);
    }

    public final SharedFlow<lz.a> B0() {
        return this.f41968x;
    }

    public final StateFlow<Boolean> F0() {
        return this.f41958n;
    }

    public final StateFlow<wv.b> G0() {
        return this.f41970z;
    }

    public final Flow<List<t1>> K0() {
        return this.f41967w;
    }

    public final StateFlow<User> M0() {
        return this.f41957m;
    }

    public final SharedFlow<nm0.y> O0() {
        return this.f41962r;
    }

    public final StateFlow<n2> R0() {
        return this.f41956l;
    }

    public final SharedFlow T0() {
        return this.f41965u;
    }

    public final Flow<List<User>> U0() {
        return this.f41969y;
    }

    public final StateFlow<Boolean> V0() {
        return this.f41960p;
    }

    public final void W0() {
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new e(null), 2, null);
    }

    public final void X0(long j5) {
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), null, null, new f(j5, null), 3, null);
    }
}
