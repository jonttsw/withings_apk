package com.withings.wiscale2.coretemperature.ui;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.graph.GraphPeriod;
import com.withings.vasistas.v2.model.CoreTemperatureVasistas;
import com.withings.vasistas.v2.repository.VasistasRepository;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import nm0.y;
import org.joda.time.DateTime;
import org.joda.time.Instant;
import org.joda.time.Interval;
/* compiled from: ExploreCoreTemperatureViewModel.kt */
/* loaded from: classes4.dex */
public final class n extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final MutableSharedFlow<Interval> f50463a;

    /* renamed from: b  reason: collision with root package name */
    private final at.a f50464b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedFlow<b> f50465c;

    /* compiled from: ExploreCoreTemperatureViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.coretemperature.ui.ExploreCoreTemperatureViewModel$1", f = "ExploreCoreTemperatureViewModel.kt", l = {56}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f50466a;

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f50466a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                MutableSharedFlow mutableSharedFlow = n.this.f50463a;
                Interval interval = new Interval(DateTime.now().minusDays(1), DateTime.now());
                this.f50466a = 1;
                if (mutableSharedFlow.emit(interval, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: ExploreCoreTemperatureViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Interval f50468a;

        /* renamed from: b  reason: collision with root package name */
        private final at.a f50469b;

        /* renamed from: c  reason: collision with root package name */
        private final List<nm0.j<Instant, Float>> f50470c;

        public b(Interval interval, at.a dataVizViewPortState, List<nm0.j<Instant, Float>> data) {
            u.j(interval, "interval");
            u.j(dataVizViewPortState, "dataVizViewPortState");
            u.j(data, "data");
            this.f50468a = interval;
            this.f50469b = dataVizViewPortState;
            this.f50470c = data;
        }

        public final List<nm0.j<Instant, Float>> a() {
            return this.f50470c;
        }

        public final at.a b() {
            return this.f50469b;
        }

        public final Interval c() {
            return this.f50468a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class c implements Flow<List<? extends nm0.j<? extends Instant, ? extends Float>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f50471a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f50472a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.coretemperature.ui.ExploreCoreTemperatureViewModel$special$$inlined$map$1$2", f = "ExploreCoreTemperatureViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.wiscale2.coretemperature.ui.n$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0685a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f50473a;

                /* renamed from: b  reason: collision with root package name */
                int f50474b;

                public C0685a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f50473a = obj;
                    this.f50474b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f50472a = flowCollector;
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
                    boolean r0 = r8 instanceof com.withings.wiscale2.coretemperature.ui.n.c.a.C0685a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.withings.wiscale2.coretemperature.ui.n$c$a$a r0 = (com.withings.wiscale2.coretemperature.ui.n.c.a.C0685a) r0
                    int r1 = r0.f50474b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f50474b = r1
                    goto L18
                L13:
                    com.withings.wiscale2.coretemperature.ui.n$c$a$a r0 = new com.withings.wiscale2.coretemperature.ui.n$c$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f50473a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f50474b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r8)
                    goto L76
                L27:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L2f:
                    nm0.l.b(r8)
                    java.util.List r7 = (java.util.List) r7
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r2 = 10
                    int r2 = kotlin.collections.x.y(r7, r2)
                    r8.<init>(r2)
                    java.util.Iterator r7 = r7.iterator()
                L45:
                    boolean r2 = r7.hasNext()
                    if (r2 == 0) goto L6b
                    java.lang.Object r2 = r7.next()
                    com.withings.vasistas.v2.model.CoreTemperatureVasistas r2 = (com.withings.vasistas.v2.model.CoreTemperatureVasistas) r2
                    org.joda.time.DateTime r4 = r2.getStartDate()
                    org.joda.time.Instant r4 = r4.toInstant()
                    float r2 = r2.getCoreTemperatureInCelsius()
                    java.lang.Float r5 = new java.lang.Float
                    r5.<init>(r2)
                    nm0.j r2 = new nm0.j
                    r2.<init>(r4, r5)
                    r8.add(r2)
                    goto L45
                L6b:
                    r0.f50474b = r3
                    kotlinx.coroutines.flow.FlowCollector r7 = r6.f50472a
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L76
                    return r1
                L76:
                    nm0.y r7 = nm0.y.f85009a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.coretemperature.ui.n.c.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public c(Flow flow) {
            this.f50471a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super List<? extends nm0.j<? extends Instant, ? extends Float>>> flowCollector, qm0.d dVar) {
            Object collect = this.f50471a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    /* compiled from: ExploreCoreTemperatureViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.coretemperature.ui.ExploreCoreTemperatureViewModel$uiState$1", f = "ExploreCoreTemperatureViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.q<Interval, List<? extends nm0.j<? extends Instant, ? extends Float>>, qm0.d<? super b>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Interval f50476a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ List f50477b;

        d(qm0.d<? super d> dVar) {
            super(3, dVar);
        }

        @Override // ym0.q
        public final Object invoke(Interval interval, List<? extends nm0.j<? extends Instant, ? extends Float>> list, qm0.d<? super b> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f50476a = interval;
            dVar2.f50477b = list;
            return dVar2.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            return new b(this.f50476a, n.this.f50464b, this.f50477b);
        }
    }

    public n(long j5, VasistasRepository vasistasRepository) {
        u.j(vasistasRepository, "vasistasRepository");
        MutableSharedFlow<Interval> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f50463a = MutableSharedFlow$default;
        GraphPeriod graphPeriod = GraphPeriod.f39502b;
        DateTime now = DateTime.now();
        u.i(now, "now(...)");
        this.f50464b = new at.a(graphPeriod, now);
        this.f50465c = FlowKt.shareIn(FlowKt.combine(w70.b.d(MutableSharedFlow$default), new c(vasistasRepository.get(CoreTemperatureVasistas.class, j5, null, null)), new d(null)), h1.a(this), SharingStarted.Companion.getEagerly(), 1);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new a(null), 3, null);
    }

    public final SharedFlow<b> i0() {
        return this.f50465c;
    }
}
