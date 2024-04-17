package com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel;

import android.content.Context;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.withings.wiscale2.C1987R;
import dp0.j;
import ek.a;
import hx.k;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.l;
import nm0.y;
import pm.n;
import qk.a6;
import qk.e5;
import qk.i6;
import qk.p5;
import qk.r4;
import qk.u4;
import qk.x5;
import ym0.p;
import ym0.q;
/* compiled from: AddSymptomsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/manualLogging/ui/feature/addNote/cycle/viewmodel/AddSymptomsViewModel;", "Lcom/withings/manualLogging/ui/feature/addNote/cycle/viewmodel/CycleSymptomsViewModel;", "manual-logging-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AddSymptomsViewModel extends CycleSymptomsViewModel {

    /* renamed from: e  reason: collision with root package name */
    private final MutableStateFlow<Integer> f41303e;

    /* renamed from: f  reason: collision with root package name */
    private final StateFlow<Integer> f41304f;

    /* renamed from: g  reason: collision with root package name */
    private final StateFlow<Map<String, List<fx.f>>> f41305g;

    /* renamed from: h  reason: collision with root package name */
    private final StateFlow<List<sx.a>> f41306h;

    /* renamed from: i  reason: collision with root package name */
    private final StateFlow<List<ek.a>> f41307i;

    /* compiled from: AddSymptomsViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.AddSymptomsViewModel$filters$1", f = "AddSymptomsViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends i implements q<Map<String, ? extends List<? extends fx.f>>, Integer, qm0.d<? super List<? extends a.b>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Map f41308a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ int f41309b;

        a(qm0.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // ym0.q
        public final Object invoke(Map<String, ? extends List<? extends fx.f>> map, Integer num, qm0.d<? super List<? extends a.b>> dVar) {
            int intValue = num.intValue();
            a aVar = new a(dVar);
            aVar.f41308a = map;
            aVar.f41309b = intValue;
            return aVar.invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z5;
            Integer g02;
            Integer valueOf;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            int i11 = this.f41309b;
            om0.b bVar = new om0.b();
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f41308a.keySet().iterator();
            while (true) {
                boolean z11 = false;
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                qk.a aVar = 0;
                if (str != null && (g02 = j.g0(str)) != null) {
                    int intValue = g02.intValue();
                    AddSymptomsViewModel.this.getClass();
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue != 3) {
                                if (intValue != 4) {
                                    if (intValue != 5) {
                                        if (intValue != 7) {
                                            if (intValue != 17) {
                                                valueOf = null;
                                            } else {
                                                valueOf = Integer.valueOf((int) C1987R.string.cycleTracking_cycleLogs_symptoms_body_subcategory);
                                            }
                                        } else {
                                            valueOf = Integer.valueOf((int) C1987R.string.cycleTracking_cycleLogs_symptoms_hands_subcategory);
                                        }
                                    } else {
                                        valueOf = Integer.valueOf((int) C1987R.string.cycleTracking_cycleLogs_symptoms_abdominal_subcategory);
                                    }
                                } else {
                                    valueOf = Integer.valueOf((int) C1987R.string.cycleTracking_cycleLogs_symptoms_breast_subcategory);
                                }
                            } else {
                                valueOf = Integer.valueOf((int) C1987R.string.cycleTracking_cycleLogs_symptoms_back_subcategory);
                            }
                        } else {
                            valueOf = Integer.valueOf((int) C1987R.string.cycleTracking_cycleLogs_symptoms_face_subcategory);
                        }
                    } else {
                        valueOf = Integer.valueOf((int) C1987R.string.cycleTracking_cycleLogs_symptoms_sleep_subcategory);
                    }
                    if (valueOf != null) {
                        int intValue2 = valueOf.intValue();
                        if (i11 == intValue) {
                            z11 = true;
                        }
                        if (intValue != 1) {
                            if (intValue != 2) {
                                if (intValue != 3) {
                                    if (intValue != 4) {
                                        if (intValue != 5) {
                                            if (intValue != 7) {
                                                if (intValue == 17) {
                                                    aVar = a6.f92842a;
                                                }
                                            } else {
                                                aVar = x5.f93196a;
                                            }
                                        } else {
                                            aVar = r4.f93105a;
                                        }
                                    } else {
                                        aVar = e5.f92905a;
                                    }
                                } else {
                                    aVar = u4.f93150a;
                                }
                            } else {
                                aVar = p5.f93076a;
                            }
                        } else {
                            aVar = i6.f92970a;
                        }
                        aVar = new a.b(intValue, z11, intValue2, null, aVar, 8);
                    }
                }
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            if (!arrayList.isEmpty()) {
                if (i11 == -1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                bVar.add(new a.b(-1, z5, C1987R.string._ALL_, null, null, 24));
            }
            bVar.addAll(arrayList);
            return bVar.t();
        }
    }

    /* compiled from: AddSymptomsViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.AddSymptomsViewModel$groupedSymptomsBySubcategory$1", f = "AddSymptomsViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends i implements p<List<? extends fx.f>, qm0.d<? super SortedMap<String, List<? extends fx.f>>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f41311a;

        /* compiled from: Comparisons.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                Integer num;
                Integer g02;
                String str = (String) t11;
                Integer num2 = -1;
                if (str == null || (num = j.g0(str)) == null) {
                    num = num2;
                }
                String str2 = (String) t12;
                if (str2 != null && (g02 = j.g0(str2)) != null) {
                    num2 = g02;
                }
                return pm0.a.b(num, num2);
            }
        }

        b() {
            throw null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.AddSymptomsViewModel$b, kotlin.coroutines.jvm.internal.i, qm0.d<nm0.y>] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            ?? iVar = new i(2, dVar);
            iVar.f41311a = obj;
            return iVar;
        }

        @Override // ym0.p
        public final Object invoke(List<? extends fx.f> list, qm0.d<? super SortedMap<String, List<? extends fx.f>>> dVar) {
            return ((b) create(list, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Comparator] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : (List) this.f41311a) {
                String l5 = ((fx.f) obj2).l();
                Object obj3 = linkedHashMap.get(l5);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap.put(l5, obj3);
                }
                ((List) obj3).add(obj2);
            }
            return s0.t(linkedHashMap, new Object());
        }
    }

    /* compiled from: AddSymptomsViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.AddSymptomsViewModel$onFilterClicked$1", f = "AddSymptomsViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f41313b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f41313b = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f41313b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            MutableStateFlow mutableStateFlow = AddSymptomsViewModel.this.f41303e;
            do {
                value = mutableStateFlow.getValue();
                ((Number) value).intValue();
            } while (!mutableStateFlow.compareAndSet(value, new Integer(this.f41313b)));
            return y.f85009a;
        }
    }

    /* compiled from: AddSymptomsViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.AddSymptomsViewModel$symptomsOptions$1", f = "AddSymptomsViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class d extends i implements q<Map<String, ? extends List<? extends fx.f>>, Integer, qm0.d<? super List<? extends sx.a>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Map f41314a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ int f41315b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f41316c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AddSymptomsViewModel.kt */
        /* loaded from: classes4.dex */
        public static final class a extends w implements ym0.l<List<? extends fx.f>, List<? extends sx.a>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f41317a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Context f41318b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i11, Context context) {
                super(1);
                this.f41317a = i11;
                this.f41318b = context;
            }

            @Override // ym0.l
            public final List<? extends sx.a> invoke(List<? extends fx.f> list) {
                Integer g02;
                List<? extends fx.f> symptoms = list;
                u.j(symptoms, "symptoms");
                ArrayList arrayList = new ArrayList();
                for (Object obj : symptoms) {
                    String l5 = ((fx.f) obj).l();
                    if (l5 != null && (g02 = j.g0(l5)) != null) {
                        int intValue = g02.intValue();
                        int i11 = this.f41317a;
                        if (i11 == -1 || intValue == i11) {
                            arrayList.add(obj);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(x.y(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    fx.f fVar = (fx.f) it.next();
                    arrayList2.add(new sx.a(fVar.c(), (int) fVar.g(), n.a(this.f41318b, fVar.k(), fVar.j()), fVar.l()));
                }
                return arrayList2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, qm0.d<? super d> dVar) {
            super(3, dVar);
            this.f41316c = context;
        }

        @Override // ym0.q
        public final Object invoke(Map<String, ? extends List<? extends fx.f>> map, Integer num, qm0.d<? super List<? extends sx.a>> dVar) {
            int intValue = num.intValue();
            d dVar2 = new d(this.f41316c, dVar);
            dVar2.f41314a = map;
            dVar2.f41315b = intValue;
            return dVar2.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            return cp0.n.A(cp0.n.n(cp0.n.t(x.t(this.f41314a.values()), new a(this.f41315b, this.f41316c))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    @Inject
    public AddSymptomsViewModel(Context context, u0 savedStateHandle, k kVar) {
        super(savedStateHandle, kVar);
        Map map;
        u.j(savedStateHandle, "savedStateHandle");
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(-1);
        this.f41303e = MutableStateFlow;
        StateFlow<Integer> asStateFlow = FlowKt.asStateFlow(MutableStateFlow);
        this.f41304f = asStateFlow;
        Flow flowOn = FlowKt.flowOn(FlowKt.mapLatest(j0(), new i(2, null)), Dispatchers.getIO());
        map = j0.f76190a;
        CoroutineScope a11 = h1.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        StateFlow<Map<String, List<fx.f>>> stateIn = FlowKt.stateIn(flowOn, a11, companion.getEagerly(), map);
        this.f41305g = stateIn;
        Flow flowOn2 = FlowKt.flowOn(FlowKt.combine(stateIn, asStateFlow, new d(context, null)), Dispatchers.getIO());
        i0 i0Var = i0.f76187a;
        this.f41306h = FlowKt.stateIn(flowOn2, h1.a(this), companion.getEagerly(), i0Var);
        this.f41307i = FlowKt.stateIn(FlowKt.flowOn(FlowKt.combine(stateIn, asStateFlow, new a(null)), Dispatchers.getIO()), h1.a(this), companion.getEagerly(), i0Var);
    }

    public final StateFlow<List<ek.a>> m0() {
        return this.f41307i;
    }

    public final StateFlow<List<sx.a>> p0() {
        return this.f41306h;
    }

    public final void q0(int i11) {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new c(i11, null), 2, null);
    }
}
