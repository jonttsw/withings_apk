package com.withings.measurements.ui;

import com.withings.features.FeatureFlag;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.measurement.model.MeasurementsVertical;
import com.withings.user.core.models.User;
import gz.j0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import qz.m0;
import wv.f;
import wv.g;
/* compiled from: HealthVerticalViewModel.kt */
/* loaded from: classes4.dex */
public abstract class o1 extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final StateFlow f42084a;

    /* renamed from: b  reason: collision with root package name */
    private final MutableStateFlow<Integer> f42085b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedFlow<List<pt.d>> f42086c;

    /* renamed from: d  reason: collision with root package name */
    private final SharedFlow f42087d;

    /* renamed from: e  reason: collision with root package name */
    private final Flow<List<fz.a>> f42088e;

    /* renamed from: f  reason: collision with root package name */
    private final Flow<wv.g> f42089f;

    /* renamed from: g  reason: collision with root package name */
    private final Flow<n20.h> f42090g;

    /* renamed from: h  reason: collision with root package name */
    private final StateFlow<qz.m0> f42091h;

    /* compiled from: HealthVerticalViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.HealthVerticalViewModel$criteriaList$1", f = "HealthVerticalViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.r<List<? extends pt.d>, Integer, List<? extends gz.j0>, qm0.d<? super Flow<? extends List<? extends fz.a>>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ List f42092a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ int f42093b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ List f42094c;

        a(qm0.d<? super a> dVar) {
            super(4, dVar);
        }

        @Override // ym0.r
        public final Object invoke(List<? extends pt.d> list, Integer num, List<? extends gz.j0> list2, qm0.d<? super Flow<? extends List<? extends fz.a>>> dVar) {
            int intValue = num.intValue();
            a aVar = new a(dVar);
            aVar.f42092a = list;
            aVar.f42093b = intValue;
            aVar.f42094c = list2;
            return aVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            List list = this.f42092a;
            int i11 = this.f42093b;
            List list2 = this.f42094c;
            pt.d dVar = (pt.d) kotlin.collections.x.N(i11 - 1, list);
            pt.d dVar2 = (pt.d) list.get(i11);
            if (dVar != null && dVar2 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof j0.c) {
                        arrayList.add(obj2);
                    }
                }
                return o1.this.g0(dVar, dVar2, arrayList);
            }
            return FlowKt.flowOf(kotlin.collections.i0.f76187a);
        }
    }

    /* compiled from: HealthVerticalViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.HealthVerticalViewModel$healthVerticalUiStateFlow$1", f = "HealthVerticalViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.t<wv.f, wv.g, List<? extends gz.j0>, Map<fn0.d<? extends j0.a>, ? extends List<? extends kw.d>>, n20.h, qm0.d<? super m0.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ wv.f f42096a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ wv.g f42097b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ List f42098c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Map f42099d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ n20.h f42100e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ MeasurementsVertical f42101f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ oz.h f42102g;

        /* compiled from: Comparisons.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return pm0.a.b(((j0.a) t12).c(), ((j0.a) t11).c());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MeasurementsVertical measurementsVertical, oz.h hVar, qm0.d<? super b> dVar) {
            super(6, dVar);
            this.f42101f = measurementsVertical;
            this.f42102g = hVar;
        }

        @Override // ym0.t
        public final Object c(wv.f fVar, wv.g gVar, List<? extends gz.j0> list, Map<fn0.d<? extends j0.a>, ? extends List<? extends kw.d>> map, n20.h hVar, qm0.d<? super m0.a> dVar) {
            b bVar = new b(this.f42101f, this.f42102g, dVar);
            bVar.f42096a = fVar;
            bVar.f42097b = gVar;
            bVar.f42098c = list;
            bVar.f42099d = map;
            bVar.f42100e = hVar;
            return bVar.invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Comparator] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            MeasurementsVertical measurementsVertical;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            wv.f fVar = this.f42096a;
            wv.g gVar = this.f42097b;
            Map<fn0.d<? extends j0.a>, ? extends List<kw.d>> map = this.f42099d;
            n20.h hVar = this.f42100e;
            List list = this.f42098c;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof j0.a) {
                    arrayList.add(obj2);
                }
            }
            List D0 = kotlin.collections.x.D0(arrayList, new Object());
            ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(D0, 10));
            Iterator it = D0.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                measurementsVertical = this.f42101f;
                if (!hasNext) {
                    break;
                }
                arrayList2.add(this.f42102g.a((j0.a) it.next(), map, measurementsVertical));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof j0.c) {
                    arrayList3.add(obj3);
                }
            }
            if (!arrayList2.isEmpty()) {
                return new m0.a.C1569a(this.f42101f, hVar, fVar, gVar, arrayList3, arrayList2);
            }
            return new m0.a.b(measurementsVertical, hVar, new f.d(measurementsVertical), new g.b(measurementsVertical), arrayList3);
        }
    }

    /* compiled from: HealthVerticalViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.HealthVerticalViewModel$onIndexChanged$1", f = "HealthVerticalViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_VIRUS_SARS_COV_2}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f42103a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f42105c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f42105c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f42105c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f42103a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                MutableStateFlow mutableStateFlow = o1.this.f42085b;
                Integer num = new Integer(this.f42105c);
                this.f42103a = 1;
                if (mutableStateFlow.emit(num, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class d implements Flow<wv.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f42106a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MeasurementsVertical f42107b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f42108a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ MeasurementsVertical f42109b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.HealthVerticalViewModel$special$$inlined$mapNotNull$1$2", f = "HealthVerticalViewModel.kt", l = {225}, m = "emit")
            /* renamed from: com.withings.measurements.ui.o1$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0558a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f42110a;

                /* renamed from: b  reason: collision with root package name */
                int f42111b;

                public C0558a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f42110a = obj;
                    this.f42111b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, MeasurementsVertical measurementsVertical) {
                this.f42108a = flowCollector;
                this.f42109b = measurementsVertical;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
            /* JADX WARN: Type inference failed for: r8v13, types: [wv.f$b] */
            /* JADX WARN: Type inference failed for: r8v7, types: [wv.f$a] */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, qm0.d r9) {
                /*
                    Method dump skipped, instructions count: 341
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.measurements.ui.o1.d.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public d(Flow flow, MeasurementsVertical measurementsVertical) {
            this.f42106a = flow;
            this.f42107b = measurementsVertical;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super wv.f> flowCollector, qm0.d dVar) {
            Object collect = this.f42106a.collect(new a(flowCollector, this.f42107b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: HealthVerticalViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.HealthVerticalViewModel$subHealthScoreFlowV2$1", f = "HealthVerticalViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.r<List<? extends pt.d>, Integer, List<? extends fz.a>, qm0.d<? super g.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ List f42113a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ int f42114b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ List f42115c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ MeasurementsVertical f42116d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(MeasurementsVertical measurementsVertical, qm0.d<? super e> dVar) {
            super(4, dVar);
            this.f42116d = measurementsVertical;
        }

        @Override // ym0.r
        public final Object invoke(List<? extends pt.d> list, Integer num, List<? extends fz.a> list2, qm0.d<? super g.a> dVar) {
            int intValue = num.intValue();
            e eVar = new e(this.f42116d, dVar);
            eVar.f42113a = list;
            eVar.f42114b = intValue;
            eVar.f42115c = list2;
            return eVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pt.g i11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            List list = this.f42113a;
            int i12 = this.f42114b;
            List list2 = this.f42115c;
            kotlin.jvm.internal.u.j(list, "<this>");
            MeasurementsVertical measurementsVertical = this.f42116d;
            kotlin.jvm.internal.u.j(measurementsVertical, "measurementsVertical");
            List<pt.d> list3 = list;
            ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list3, 10));
            for (pt.d dVar : list3) {
                Integer num = null;
                if (dVar != null) {
                    int ordinal = measurementsVertical.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal == 5 && (i11 = dVar.i()) != null) {
                                    num = Integer.valueOf((int) i11.a());
                                }
                            } else {
                                pt.f g11 = dVar.g();
                                if (g11 != null) {
                                    num = Integer.valueOf((int) g11.h());
                                }
                            }
                        } else {
                            pt.c d11 = dVar.d();
                            if (d11 != null) {
                                num = Integer.valueOf((int) d11.c());
                            }
                        }
                    } else {
                        pt.b b10 = dVar.b();
                        if (b10 != null) {
                            num = Integer.valueOf((int) b10.b());
                        }
                    }
                }
                arrayList.add(num);
            }
            return new g.a(measurementsVertical, arrayList, i12, kotlin.collections.x.G(list2));
        }
    }

    public o1(iz.c measurementItemsByVerticalRepository, rt.a aVar, rt.c cVar, androidx.lifecycle.u0 savedStateHandle, MeasurementsVertical measurementsVertical, n20.b bVar, oz.g gVar, oz.h hVar) {
        kotlin.jvm.internal.u.j(measurementItemsByVerticalRepository, "measurementItemsByVerticalRepository");
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
        Object c11 = savedStateHandle.c(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        kotlin.jvm.internal.u.g(c11);
        User user = (User) c11;
        d dVar = new d(aVar.a(user.getId()), measurementsVertical);
        CoroutineScope a11 = androidx.lifecycle.h1.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        StateFlow stateIn = FlowKt.stateIn(dVar, a11, companion.getEagerly(), new f.a(measurementsVertical));
        this.f42084a = stateIn;
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(2);
        this.f42085b = MutableStateFlow;
        SharedFlow<List<pt.d>> shareIn = FlowKt.shareIn(cVar.b(user.getId()), androidx.lifecycle.h1.a(this), companion.getLazily(), 1);
        this.f42086c = shareIn;
        SharedFlow shareIn2 = FlowKt.shareIn(measurementItemsByVerticalRepository.e(measurementsVertical, user), androidx.lifecycle.h1.a(this), companion.getLazily(), 1);
        this.f42087d = shareIn2;
        Flow<List<fz.a>> a12 = w70.b.a(shareIn, MutableStateFlow, shareIn2, new a(null));
        this.f42088e = a12;
        Flow<wv.g> combine = FlowKt.combine(shareIn, MutableStateFlow, a12, new e(measurementsVertical, null));
        this.f42089f = combine;
        Flow<n20.h> a13 = bVar.a();
        this.f42090g = a13;
        long id2 = user.getId();
        int i11 = wr.b.f106035c;
        this.f42091h = FlowKt.stateIn(FlowKt.combine(stateIn, combine, shareIn2, FlowKt.transformLatest(wr.b.d(FeatureFlag.f39121o), new oz.d(id2, gVar, null)), a13, new b(measurementsVertical, hVar, null)), androidx.lifecycle.h1.a(this), companion.getEagerly(), new m0.b(!kotlin.jvm.internal.u.e((Boolean) savedStateHandle.c("has_data"), Boolean.FALSE)));
    }

    public abstract Flow g0(pt.d dVar, pt.d dVar2, ArrayList arrayList);

    public final StateFlow<qz.m0> i0() {
        return this.f42091h;
    }

    public final void j0(int i11) {
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new c(i11, null), 2, null);
    }
}
