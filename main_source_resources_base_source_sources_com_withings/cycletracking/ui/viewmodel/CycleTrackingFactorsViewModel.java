package com.withings.cycletracking.ui.viewmodel;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.cycletracking.ui.viewmodel.h;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: CycleTrackingFactorsViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/cycletracking/ui/viewmodel/CycleTrackingFactorsViewModel;", "Landroidx/lifecycle/g1;", "Event", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CycleTrackingFactorsViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final xw.b f35763a;

    /* renamed from: b  reason: collision with root package name */
    private final xm.a f35764b;

    /* renamed from: c  reason: collision with root package name */
    private final fn.a f35765c;

    /* renamed from: d  reason: collision with root package name */
    private final long f35766d;

    /* renamed from: e  reason: collision with root package name */
    private final Flow<List<fr.a>> f35767e;

    /* renamed from: f  reason: collision with root package name */
    private final Flow<fr.a> f35768f;

    /* renamed from: g  reason: collision with root package name */
    private final MutableSharedFlow<Event> f35769g;

    /* renamed from: h  reason: collision with root package name */
    private final SharedFlow<Event> f35770h;

    /* renamed from: i  reason: collision with root package name */
    private final Flow<List<hk.k<fr.a>>> f35771i;

    /* renamed from: j  reason: collision with root package name */
    private final StateFlow<Object> f35772j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CycleTrackingFactorsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/cycletracking/ui/viewmodel/CycleTrackingFactorsViewModel$Event;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class Event {

        /* renamed from: a  reason: collision with root package name */
        public static final Event f35773a;

        /* renamed from: b  reason: collision with root package name */
        public static final Event f35774b;

        /* renamed from: c  reason: collision with root package name */
        public static final Event f35775c;

        /* renamed from: d  reason: collision with root package name */
        public static final Event f35776d;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ Event[] f35777e;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.cycletracking.ui.viewmodel.CycleTrackingFactorsViewModel$Event] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.cycletracking.ui.viewmodel.CycleTrackingFactorsViewModel$Event] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.cycletracking.ui.viewmodel.CycleTrackingFactorsViewModel$Event] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.cycletracking.ui.viewmodel.CycleTrackingFactorsViewModel$Event] */
        static {
            ?? r02 = new Enum("OpenFactorOnBoarding", 0);
            f35773a = r02;
            ?? r12 = new Enum("Completed", 1);
            f35774b = r12;
            ?? r22 = new Enum("Finish", 2);
            f35775c = r22;
            ?? r32 = new Enum("Back", 3);
            f35776d = r32;
            Event[] eventArr = {r02, r12, r22, r32};
            f35777e = eventArr;
            sm0.b.a(eventArr);
        }

        private Event() {
            throw null;
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) f35777e.clone();
        }
    }

    /* compiled from: CycleTrackingFactorsViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingFactorsViewModel$checkHasFactors$1", f = "CycleTrackingFactorsViewModel.kt", l = {51}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35778a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CycleTrackingFactorsViewModel.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingFactorsViewModel$checkHasFactors$1$1", f = "CycleTrackingFactorsViewModel.kt", l = {53}, m = "invokeSuspend")
        /* renamed from: com.withings.cycletracking.ui.viewmodel.CycleTrackingFactorsViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0474a extends kotlin.coroutines.jvm.internal.i implements ym0.p<List<? extends fr.a>, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f35780a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f35781b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ CycleTrackingFactorsViewModel f35782c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0474a(CycleTrackingFactorsViewModel cycleTrackingFactorsViewModel, qm0.d<? super C0474a> dVar) {
                super(2, dVar);
                this.f35782c = cycleTrackingFactorsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                C0474a c0474a = new C0474a(this.f35782c, dVar);
                c0474a.f35781b = obj;
                return c0474a;
            }

            @Override // ym0.p
            public final Object invoke(List<? extends fr.a> list, qm0.d<? super nm0.y> dVar) {
                return ((C0474a) create(list, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f35780a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : (List) this.f35781b) {
                        if (((fr.a) obj2).f() != 10) {
                            arrayList.add(obj2);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        MutableSharedFlow mutableSharedFlow = this.f35782c.f35769g;
                        Event event = Event.f35773a;
                        this.f35780a = 1;
                        if (mutableSharedFlow.emit(event, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return nm0.y.f85009a;
            }
        }

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f35778a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                CycleTrackingFactorsViewModel cycleTrackingFactorsViewModel = CycleTrackingFactorsViewModel.this;
                Flow flow = cycleTrackingFactorsViewModel.f35767e;
                C0474a c0474a = new C0474a(cycleTrackingFactorsViewModel, null);
                this.f35778a = 1;
                if (FlowKt.collectLatest(flow, c0474a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: CycleTrackingFactorsViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingFactorsViewModel$onBackClick$1", f = "CycleTrackingFactorsViewModel.kt", l = {77, 77}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        MutableSharedFlow f35783a;

        /* renamed from: b  reason: collision with root package name */
        int f35784b;

        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            MutableSharedFlow mutableSharedFlow;
            Event event;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f35784b;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableSharedFlow = this.f35783a;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                CycleTrackingFactorsViewModel cycleTrackingFactorsViewModel = CycleTrackingFactorsViewModel.this;
                mutableSharedFlow = cycleTrackingFactorsViewModel.f35769g;
                Flow flow = cycleTrackingFactorsViewModel.f35767e;
                this.f35783a = mutableSharedFlow;
                this.f35784b = 1;
                obj = FlowKt.firstOrNull(flow, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            List list = (List) obj;
            if (list != null && list.isEmpty()) {
                event = Event.f35775c;
            } else {
                event = Event.f35776d;
            }
            this.f35783a = null;
            this.f35784b = 2;
            if (mutableSharedFlow.emit(event, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: CycleTrackingFactorsViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingFactorsViewModel$onDeleteFactor$1", f = "CycleTrackingFactorsViewModel.kt", l = {83, 84}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35786a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ fr.a f35788c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(fr.a aVar, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f35788c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f35788c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f35786a;
            CycleTrackingFactorsViewModel cycleTrackingFactorsViewModel = CycleTrackingFactorsViewModel.this;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                xm.a aVar = cycleTrackingFactorsViewModel.f35764b;
                long q02 = cycleTrackingFactorsViewModel.q0();
                this.f35786a = 1;
                if (aVar.b(q02, this.f35788c, "deleteFromListSwipe", this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            MutableSharedFlow mutableSharedFlow = cycleTrackingFactorsViewModel.f35769g;
            Event event = Event.f35774b;
            this.f35786a = 2;
            if (mutableSharedFlow.emit(event, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    @Inject
    public CycleTrackingFactorsViewModel(u0 savedStateHandle, gr.a factorRepository, xw.b dispatchers, um.a aVar, fn.a aVar2) {
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.u.j(factorRepository, "factorRepository");
        kotlin.jvm.internal.u.j(dispatchers, "dispatchers");
        this.f35763a = dispatchers;
        this.f35764b = aVar;
        this.f35765c = aVar2;
        Long l5 = (Long) savedStateHandle.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID);
        if (l5 != null) {
            long longValue = l5.longValue();
            this.f35766d = longValue;
            gr.b notDeleted = factorRepository.getNotDeleted(longValue);
            this.f35767e = notDeleted;
            um.b e11 = aVar.e(longValue);
            MutableSharedFlow<Event> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
            this.f35769g = MutableSharedFlow$default;
            this.f35770h = FlowKt.asSharedFlow(MutableSharedFlow$default);
            Flow<List<hk.k<fr.a>>> combine = FlowKt.combine(notDeleted, e11, new g(this, null));
            this.f35771i = combine;
            this.f35772j = FlowKt.stateIn(FlowKt.flowOn(new gn.c(combine), Dispatchers.getIO()), h1.a(this), SharingStarted.Companion.getEagerly(), h.b.f35899a);
            return;
        }
        throw new Exception("user id shouldn't be null");
    }

    public final void k0() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), this.f35763a.a(), null, new a(null), 2, null);
    }

    public final SharedFlow<Event> m0() {
        return this.f35770h;
    }

    public final StateFlow<Object> p0() {
        return this.f35772j;
    }

    public final long q0() {
        return this.f35766d;
    }

    public final void r0() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), this.f35763a.a(), null, new b(null), 2, null);
    }

    public final void t0(fr.a factor) {
        kotlin.jvm.internal.u.j(factor, "factor");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), this.f35763a.a(), null, new c(factor, null), 2, null);
    }
}
