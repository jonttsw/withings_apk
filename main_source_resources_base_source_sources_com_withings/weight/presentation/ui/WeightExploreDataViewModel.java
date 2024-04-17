package com.withings.weight.presentation.ui;

import android.app.Application;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.lifecycle.h1;
import com.withings.common.compose.component.m4;
import com.withings.graph.GraphPeriod;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlowKt;
import org.joda.time.DateTime;
import org.joda.time.Interval;
/* compiled from: WeightExploreDataViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/weight/presentation/ui/WeightExploreDataViewModel;", "Landroidx/lifecycle/b;", "weight-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WeightExploreDataViewModel extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final g90.b f47170a;

    /* renamed from: b  reason: collision with root package name */
    private final v90.g f47171b;

    /* renamed from: c  reason: collision with root package name */
    private final n90.h f47172c;

    /* renamed from: d  reason: collision with root package name */
    private final ah.c0 f47173d;

    /* renamed from: e  reason: collision with root package name */
    private final User f47174e;

    /* renamed from: f  reason: collision with root package name */
    private final l70.u f47175f;

    /* renamed from: g  reason: collision with root package name */
    private final k90.b f47176g;

    /* renamed from: h  reason: collision with root package name */
    private final at.a f47177h;

    /* renamed from: i  reason: collision with root package name */
    private final SharedFlow<Interval> f47178i;

    /* renamed from: j  reason: collision with root package name */
    private final SharedFlow<f90.e> f47179j;

    /* renamed from: k  reason: collision with root package name */
    private final MutableStateFlow<Interval> f47180k;

    /* renamed from: l  reason: collision with root package name */
    private final SharedFlow<m4> f47181l;

    /* renamed from: m  reason: collision with root package name */
    private final SharedFlow<u> f47182m;

    /* compiled from: WeightExploreDataViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.ui.WeightExploreDataViewModel$graphMaxViewportBounds$1", f = "WeightExploreDataViewModel.kt", l = {57, 58}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super Interval>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f47183a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f47184b;

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f47184b = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super Interval> flowCollector, qm0.d<? super nm0.y> dVar) {
            return ((a) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f47183a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flowCollector = (FlowCollector) this.f47184b;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                flowCollector = (FlowCollector) this.f47184b;
                WeightExploreDataViewModel weightExploreDataViewModel = WeightExploreDataViewModel.this;
                v90.g gVar = weightExploreDataViewModel.f47171b;
                long q11 = weightExploreDataViewModel.f47174e.q();
                this.f47184b = flowCollector;
                this.f47183a = 1;
                obj = gVar.b(q11, 1, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            this.f47184b = null;
            this.f47183a = 2;
            if (flowCollector.emit((Interval) obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WeightExploreDataViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.ui.WeightExploreDataViewModel$graphModifierFlow$1", f = "WeightExploreDataViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.q<Interval, f90.e, qm0.d<? super u>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Interval f47186a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ f90.e f47187b;

        b(qm0.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // ym0.q
        public final Object invoke(Interval interval, f90.e eVar, qm0.d<? super u> dVar) {
            b bVar = new b(dVar);
            bVar.f47186a = interval;
            bVar.f47187b = eVar;
            return bVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            Interval interval = this.f47186a;
            f90.e eVar = this.f47187b;
            WeightExploreDataViewModel weightExploreDataViewModel = WeightExploreDataViewModel.this;
            return new u(weightExploreDataViewModel.f47175f, interval, eVar.f(), weightExploreDataViewModel.t0());
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class c implements Flow<List<? extends ky.a>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f47189a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f47190a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.ui.WeightExploreDataViewModel$special$$inlined$map$1$2", f = "WeightExploreDataViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.weight.presentation.ui.WeightExploreDataViewModel$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0642a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f47191a;

                /* renamed from: b  reason: collision with root package name */
                int f47192b;

                public C0642a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f47191a = obj;
                    this.f47192b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f47190a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, qm0.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.withings.weight.presentation.ui.WeightExploreDataViewModel.c.a.C0642a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.weight.presentation.ui.WeightExploreDataViewModel$c$a$a r0 = (com.withings.weight.presentation.ui.WeightExploreDataViewModel.c.a.C0642a) r0
                    int r1 = r0.f47192b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f47192b = r1
                    goto L18
                L13:
                    com.withings.weight.presentation.ui.WeightExploreDataViewModel$c$a$a r0 = new com.withings.weight.presentation.ui.WeightExploreDataViewModel$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f47191a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f47192b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L43
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    f90.e r5 = (f90.e) r5
                    java.util.List r5 = r5.f()
                    r0.f47192b = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f47190a
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.weight.presentation.ui.WeightExploreDataViewModel.c.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public c(SharedFlow sharedFlow) {
            this.f47189a = sharedFlow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super List<? extends ky.a>> flowCollector, qm0.d dVar) {
            Object collect = this.f47189a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WeightExploreDataViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.ui.WeightExploreDataViewModel$weightGraphData$1", f = "WeightExploreDataViewModel.kt", l = {62, 62}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super f90.e>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f47194a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f47195b;

        d(qm0.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f47195b = obj;
            return dVar2;
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super f90.e> flowCollector, qm0.d<? super nm0.y> dVar) {
            return ((d) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f47194a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flowCollector = (FlowCollector) this.f47195b;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                flowCollector = (FlowCollector) this.f47195b;
                WeightExploreDataViewModel weightExploreDataViewModel = WeightExploreDataViewModel.this;
                g90.b bVar = weightExploreDataViewModel.f47170a;
                User user = weightExploreDataViewModel.f47174e;
                this.f47195b = flowCollector;
                this.f47194a = 1;
                obj = bVar.f(user, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            this.f47195b = null;
            this.f47194a = 2;
            if (flowCollector.emit(obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WeightExploreDataViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.ui.WeightExploreDataViewModel$weightStatusHeaderState$2", f = "WeightExploreDataViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.q<List<? extends ky.a>, Interval, qm0.d<? super m4>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ List f47197a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Interval f47198b;

        e(qm0.d<? super e> dVar) {
            super(3, dVar);
        }

        @Override // ym0.q
        public final Object invoke(List<? extends ky.a> list, Interval interval, qm0.d<? super m4> dVar) {
            e eVar = new e(dVar);
            eVar.f47197a = list;
            eVar.f47198b = interval;
            return eVar.invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object obj3;
            float f11;
            Object obj4;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            List list = this.f47197a;
            Interval interval = this.f47198b;
            ky.a aVar = null;
            if (interval == null) {
                return null;
            }
            DateTime start = interval.getStart();
            DateTime end = interval.getEnd();
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    DateTime b10 = ((ky.a) obj2).b();
                    kotlin.jvm.internal.u.g(start);
                    kotlin.jvm.internal.u.g(end);
                    if (hn.a.c(b10, start, end)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            ky.a aVar2 = (ky.a) obj2;
            if (aVar2 == null) {
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj4 = listIterator.previous();
                        if (((ky.a) obj4).b().isBefore(start)) {
                            break;
                        }
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                aVar2 = (ky.a) obj4;
            }
            ListIterator listIterator2 = list.listIterator(list.size());
            while (true) {
                if (listIterator2.hasPrevious()) {
                    obj3 = listIterator2.previous();
                    DateTime b11 = ((ky.a) obj3).b();
                    kotlin.jvm.internal.u.g(start);
                    kotlin.jvm.internal.u.g(end);
                    if (hn.a.c(b11, start, end)) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            ky.a aVar3 = (ky.a) obj3;
            if (aVar3 == null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((ky.a) next).b().isAfter(end)) {
                        aVar = next;
                        break;
                    }
                }
                aVar3 = aVar;
            }
            WeightExploreDataViewModel weightExploreDataViewModel = WeightExploreDataViewModel.this;
            if (aVar2 != null && aVar3 != null) {
                ah.c0 c0Var = weightExploreDataViewModel.f47173d;
                Float f12 = new Float((float) aVar2.f());
                Float f13 = new Float((float) aVar3.f());
                c0Var.getClass();
                f11 = ah.c0.b(f12, f13);
            } else {
                f11 = 0.0f;
            }
            return weightExploreDataViewModel.f47172c.d(weightExploreDataViewModel.f47175f, f11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public WeightExploreDataViewModel(androidx.lifecycle.u0 savedStateHandle, m70.i userManager, jm.a aVar, Application application, g90.b bVar, v90.g gVar, n90.h hVar, ah.c0 c0Var) {
        super(application);
        ParcelableSnapshotMutableState f11;
        GraphPeriod graphPeriod;
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        this.f47170a = bVar;
        this.f47171b = gVar;
        this.f47172c = hVar;
        this.f47173d = c0Var;
        User user = (User) savedStateHandle.c(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        if (user == null) {
            user = userManager.e();
            kotlin.jvm.internal.u.i(user, "getMainUser(...)");
        }
        this.f47174e = user;
        l70.u g11 = aVar.g(1);
        this.f47175f = g11;
        f11 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
        this.f47176g = new k90.b(f11, g11, getApplication());
        Integer num = (Integer) savedStateHandle.c("period");
        if (num != null) {
            int intValue = num.intValue();
            GraphPeriod.f39501a.getClass();
            graphPeriod = GraphPeriod.a.a(intValue);
        } else {
            graphPeriod = GraphPeriod.f39504d;
        }
        DateTime dateTime = (DateTime) savedStateHandle.c("date");
        dateTime = dateTime == null ? DateTime.now() : dateTime;
        kotlin.jvm.internal.u.g(dateTime);
        this.f47177h = new at.a(graphPeriod, dateTime);
        Flow flow = FlowKt.flow(new a(null));
        CoroutineScope a11 = h1.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharedFlow<Interval> shareIn = FlowKt.shareIn(flow, a11, companion.getEagerly(), 1);
        this.f47178i = shareIn;
        SharedFlow<f90.e> shareIn2 = FlowKt.shareIn(FlowKt.flow(new d(null)), h1.a(this), companion.getEagerly(), 1);
        this.f47179j = shareIn2;
        MutableStateFlow<Interval> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f47180k = MutableStateFlow;
        this.f47181l = FlowKt.shareIn(FlowKt.combine(new c(shareIn2), MutableStateFlow, new e(null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.f47182m = FlowKt.shareIn(FlowKt.combine(shareIn, shareIn2, new b(null)), h1.a(this), companion.getEagerly(), 1);
    }

    public final SharedFlow<m4> A0() {
        return this.f47181l;
    }

    public final k90.b q0() {
        return this.f47176g;
    }

    public final MutableStateFlow<Interval> r0() {
        return this.f47180k;
    }

    public final at.a t0() {
        return this.f47177h;
    }

    public final SharedFlow<u> y0() {
        return this.f47182m;
    }

    public final SharedFlow<f90.e> z0() {
        return this.f47179j;
    }
}
