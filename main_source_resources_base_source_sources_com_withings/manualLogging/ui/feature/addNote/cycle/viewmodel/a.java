package com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel;

import androidx.compose.material.w7;
import com.withings.library.authentication.api.ConstantsWs;
import fy.l;
import hx.j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import nm0.y;
import org.joda.time.DateTime;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleDataStorageViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.CycleDataStorageViewModel$1", f = "CycleDataStorageViewModel.kt", l = {101, 124}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class a extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    CycleDataStorageViewModel f41352a;

    /* renamed from: b  reason: collision with root package name */
    int f41353b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CycleDataStorageViewModel f41354c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ j f41355d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleDataStorageViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.CycleDataStorageViewModel$1$7", f = "CycleDataStorageViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_FAT_FREE_MASS_SEGMENT, 186}, m = "invokeSuspend")
    /* renamed from: com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0553a extends i implements p<List<? extends fx.e>, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f41356a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f41357b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CycleDataStorageViewModel f41358c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<Long> f41359d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<Long> f41360e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List<Long> f41361f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0553a(CycleDataStorageViewModel cycleDataStorageViewModel, List<Long> list, List<Long> list2, List<Long> list3, qm0.d<? super C0553a> dVar) {
            super(2, dVar);
            this.f41358c = cycleDataStorageViewModel;
            this.f41359d = list;
            this.f41360e = list2;
            this.f41361f = list3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            C0553a c0553a = new C0553a(this.f41358c, this.f41359d, this.f41360e, this.f41361f, dVar);
            c0553a.f41357b = obj;
            return c0553a;
        }

        @Override // ym0.p
        public final Object invoke(List<? extends fx.e> list, qm0.d<? super y> dVar) {
            return ((C0553a) create(list, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Type inference failed for: r0v17, types: [T, gx.d] */
        /* JADX WARN: Type inference failed for: r2v0, types: [T, gx.d] */
        /* JADX WARN: Type inference failed for: r3v11, types: [T, gx.d] */
        /* JADX WARN: Type inference failed for: r3v14, types: [T, gx.d] */
        /* JADX WARN: Type inference failed for: r3v17, types: [T, gx.d] */
        /* JADX WARN: Type inference failed for: r3v19, types: [T, gx.d] */
        /* JADX WARN: Type inference failed for: r3v21, types: [T, gx.d] */
        /* JADX WARN: Type inference failed for: r3v23, types: [T, gx.d] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p0 p0Var;
            l lVar;
            DateTime dateTime;
            Object c11;
            fx.f fVar;
            List list;
            List list2;
            List list3;
            MutableStateFlow mutableStateFlow;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f41356a;
            CycleDataStorageViewModel cycleDataStorageViewModel = this.f41358c;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
                p0Var = (p0) this.f41357b;
                c11 = obj;
            } else {
                nm0.l.b(obj);
                List<fx.e> list4 = (List) this.f41357b;
                p0Var = new p0();
                p0Var.f76257a = new gx.d(null, 31);
                if (list4 != null) {
                    for (fx.e eVar : list4) {
                        Iterator<fx.d> it = eVar.iterator();
                        while (it.hasNext()) {
                            fx.d next = it.next();
                            if (next instanceof fx.f) {
                                fVar = (fx.f) next;
                            } else {
                                fVar = null;
                            }
                            if (fVar != null) {
                                long g11 = fVar.g();
                                list = cycleDataStorageViewModel.f41336r;
                                if (list != null) {
                                    if (!list.contains(new Long(g11))) {
                                        list2 = cycleDataStorageViewModel.f41337s;
                                        if (list2 != null) {
                                            if (!list2.contains(new Long(g11))) {
                                                list3 = cycleDataStorageViewModel.f41338t;
                                                if (list3 != null) {
                                                    if (list3.contains(new Long(g11))) {
                                                        p0Var.f76257a = gx.d.a((gx.d) p0Var.f76257a, null, false, new Integer((int) fVar.g()), null, null, 27);
                                                    } else {
                                                        if (this.f41359d.contains(new Long(g11))) {
                                                            gx.d dVar = (gx.d) p0Var.f76257a;
                                                            p0Var.f76257a = gx.d.a(dVar, null, false, null, gx.f.a(dVar.e(), new Long(fVar.g()), null, null, 6), null, 23);
                                                        } else {
                                                            if (this.f41360e.contains(new Long(g11))) {
                                                                gx.d dVar2 = (gx.d) p0Var.f76257a;
                                                                p0Var.f76257a = gx.d.a(dVar2, null, false, null, gx.f.a(dVar2.e(), null, null, new Long(fVar.g()), 3), null, 23);
                                                            } else {
                                                                if (this.f41361f.contains(new Long(g11))) {
                                                                    gx.d dVar3 = (gx.d) p0Var.f76257a;
                                                                    p0Var.f76257a = gx.d.a(dVar3, null, false, null, gx.f.a(dVar3.e(), null, new Long(fVar.g()), null, 5), null, 23);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    u.s("symptomsMoodAndFeelingsIds");
                                                    throw null;
                                                }
                                            } else {
                                                p0Var.f76257a = gx.d.a((gx.d) p0Var.f76257a, new Integer((int) fVar.g()), false, null, null, null, 30);
                                            }
                                        } else {
                                            u.s("symptomsCervicalMucusIds");
                                            throw null;
                                        }
                                    } else {
                                        gx.d dVar4 = (gx.d) p0Var.f76257a;
                                        p0Var.f76257a = gx.d.a(dVar4, null, false, null, null, x.B(x.l0(x.V(new Long(fVar.g())), dVar4.f())), 15);
                                    }
                                } else {
                                    u.s("symptomsSymptomIds");
                                    throw null;
                                }
                            }
                        }
                    }
                }
                lVar = cycleDataStorageViewModel.f41320b;
                long i12 = cycleDataStorageViewModel.i1();
                Long l5 = new Long(cycleDataStorageViewModel.f41329k.getMillis());
                dateTime = cycleDataStorageViewModel.f41330l;
                Long l6 = new Long(dateTime.getMillis());
                int[] iArr = {ConstantsWs.MEASURE_TYPE_MENSTRUATION_FLOW};
                this.f41357b = p0Var;
                this.f41356a = 1;
                c11 = l.c(lVar, i12, l5, l6, false, iArr, this, 24);
                if (c11 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            if (((ky.d) x.K((List) c11)) != null) {
                p0Var.f76257a = gx.d.a((gx.d) p0Var.f76257a, null, true, null, null, null, 29);
            }
            mutableStateFlow = cycleDataStorageViewModel.f41333o;
            T t11 = p0Var.f76257a;
            this.f41357b = null;
            this.f41356a = 2;
            if (mutableStateFlow.emit(t11, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CycleDataStorageViewModel cycleDataStorageViewModel, j jVar, qm0.d<? super a> dVar) {
        super(2, dVar);
        this.f41354c = cycleDataStorageViewModel;
        this.f41355d = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new a(this.f41354c, this.f41355d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Serializable a11;
        CycleDataStorageViewModel cycleDataStorageViewModel;
        List list;
        List list2;
        List list3;
        List list4;
        StateFlow stateFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f41353b;
        CycleDataStorageViewModel cycleDataStorageViewModel2 = this.f41354c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CycleDataStorageViewModel cycleDataStorageViewModel3 = this.f41352a;
            nm0.l.b(obj);
            cycleDataStorageViewModel = cycleDataStorageViewModel3;
            a11 = obj;
        } else {
            nm0.l.b(obj);
            long i12 = cycleDataStorageViewModel2.i1();
            this.f41352a = cycleDataStorageViewModel2;
            this.f41353b = 1;
            a11 = this.f41355d.a(i12, this);
            if (a11 == coroutineSingletons) {
                return coroutineSingletons;
            }
            cycleDataStorageViewModel = cycleDataStorageViewModel2;
        }
        cycleDataStorageViewModel.f41335q = (List) a11;
        list = cycleDataStorageViewModel2.f41335q;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (u.e(((fx.f) obj2).d(), "2")) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (u.e(((fx.f) next).l(), "15")) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(x.y(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                w7.k(((fx.f) it2.next()).g(), arrayList3);
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                if (u.e(((fx.f) next2).l(), "9")) {
                    arrayList4.add(next2);
                }
            }
            ArrayList arrayList5 = new ArrayList(x.y(arrayList4, 10));
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                w7.k(((fx.f) it4.next()).g(), arrayList5);
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                Object next3 = it5.next();
                if (u.e(((fx.f) next3).l(), "18")) {
                    arrayList6.add(next3);
                }
            }
            ArrayList arrayList7 = new ArrayList(x.y(arrayList6, 10));
            Iterator it6 = arrayList6.iterator();
            while (it6.hasNext()) {
                w7.k(((fx.f) it6.next()).g(), arrayList7);
            }
            list2 = cycleDataStorageViewModel2.f41335q;
            if (list2 != null) {
                ArrayList arrayList8 = new ArrayList();
                for (Object obj3 : list2) {
                    if (u.e(((fx.f) obj3).d(), "3")) {
                        arrayList8.add(obj3);
                    }
                }
                ArrayList arrayList9 = new ArrayList(x.y(arrayList8, 10));
                Iterator it7 = arrayList8.iterator();
                while (it7.hasNext()) {
                    w7.k(((fx.f) it7.next()).g(), arrayList9);
                }
                cycleDataStorageViewModel2.f41336r = arrayList9;
                list3 = cycleDataStorageViewModel2.f41335q;
                if (list3 != null) {
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj4 : list3) {
                        if (u.e(((fx.f) obj4).d(), "4")) {
                            arrayList10.add(obj4);
                        }
                    }
                    ArrayList arrayList11 = new ArrayList(x.y(arrayList10, 10));
                    Iterator it8 = arrayList10.iterator();
                    while (it8.hasNext()) {
                        w7.k(((fx.f) it8.next()).g(), arrayList11);
                    }
                    cycleDataStorageViewModel2.f41337s = arrayList11;
                    list4 = cycleDataStorageViewModel2.f41335q;
                    if (list4 != null) {
                        ArrayList arrayList12 = new ArrayList();
                        for (Object obj5 : list4) {
                            if (u.e(((fx.f) obj5).d(), "1")) {
                                arrayList12.add(obj5);
                            }
                        }
                        ArrayList arrayList13 = new ArrayList(x.y(arrayList12, 10));
                        Iterator it9 = arrayList12.iterator();
                        while (it9.hasNext()) {
                            w7.k(((fx.f) it9.next()).g(), arrayList13);
                        }
                        cycleDataStorageViewModel2.f41338t = arrayList13;
                        stateFlow = cycleDataStorageViewModel2.f41339u;
                        C0553a c0553a = new C0553a(this.f41354c, arrayList3, arrayList5, arrayList7, null);
                        this.f41352a = null;
                        this.f41353b = 2;
                        if (FlowKt.collectLatest(stateFlow, c0553a, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return y.f85009a;
                    }
                    u.s("allSymptoms");
                    throw null;
                }
                u.s("allSymptoms");
                throw null;
            }
            u.s("allSymptoms");
            throw null;
        }
        u.s("allSymptoms");
        throw null;
    }
}
