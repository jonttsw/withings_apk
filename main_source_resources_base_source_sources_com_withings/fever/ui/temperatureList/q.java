package com.withings.fever.ui.temperatureList;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.fever.ui.temperatureList.o;
import com.withings.user.core.models.User;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import nm0.y;
import org.joda.time.DateTime;
/* compiled from: TemperatureListViewModel.kt */
/* loaded from: classes3.dex */
public final class q extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final r70.c f39445a;

    /* renamed from: b  reason: collision with root package name */
    private final iy.e f39446b;

    /* renamed from: c  reason: collision with root package name */
    private final g20.a f39447c;

    /* renamed from: d  reason: collision with root package name */
    private final fy.a f39448d;

    /* renamed from: e  reason: collision with root package name */
    private final ky.c f39449e;

    /* renamed from: f  reason: collision with root package name */
    private final Flow<User> f39450f;

    /* renamed from: g  reason: collision with root package name */
    private final SharedFlow<List<nm0.j<DateTime, List<ky.d>>>> f39451g;

    /* renamed from: h  reason: collision with root package name */
    private final StateFlow<o> f39452h;

    /* compiled from: Merge.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.fever.ui.temperatureList.TemperatureListViewModel$special$$inlined$flatMapLatest$1", f = "TemperatureListViewModel.kt", l = {193}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.q<FlowCollector<? super List<? extends nm0.j<? extends DateTime, ? extends List<? extends ky.d>>>>, User, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f39453a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ FlowCollector f39454b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f39455c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q f39456d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qm0.d dVar, q qVar) {
            super(3, dVar);
            this.f39456d = qVar;
        }

        @Override // ym0.q
        public final Object invoke(FlowCollector<? super List<? extends nm0.j<? extends DateTime, ? extends List<? extends ky.d>>>> flowCollector, User user, qm0.d<? super y> dVar) {
            a aVar = new a(dVar, this.f39456d);
            aVar.f39454b = flowCollector;
            aVar.f39455c = user;
            return aVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f39453a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                FlowCollector flowCollector = this.f39454b;
                q qVar = this.f39456d;
                d dVar = new d(iy.a.c(qVar.f39446b, qVar.f39449e, ((User) this.f39455c).getId(), 71, null, null, null, true, false, null, 1400), qVar);
                this.f39453a = 1;
                if (FlowKt.emitAll(flowCollector, dVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes3.dex */
    public static final class b implements Flow<o.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f39457a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes3.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f39458a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.fever.ui.temperatureList.TemperatureListViewModel$special$$inlined$map$1$2", f = "TemperatureListViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.fever.ui.temperatureList.q$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0515a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f39459a;

                /* renamed from: b  reason: collision with root package name */
                int f39460b;

                public C0515a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f39459a = obj;
                    this.f39460b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f39458a = flowCollector;
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
                    boolean r0 = r6 instanceof com.withings.fever.ui.temperatureList.q.b.a.C0515a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.fever.ui.temperatureList.q$b$a$a r0 = (com.withings.fever.ui.temperatureList.q.b.a.C0515a) r0
                    int r1 = r0.f39460b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f39460b = r1
                    goto L18
                L13:
                    com.withings.fever.ui.temperatureList.q$b$a$a r0 = new com.withings.fever.ui.temperatureList.q$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f39459a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f39460b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L44
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    java.util.List r5 = (java.util.List) r5
                    com.withings.fever.ui.temperatureList.o$b r6 = new com.withings.fever.ui.temperatureList.o$b
                    r6.<init>(r5)
                    r0.f39460b = r3
                    kotlinx.coroutines.flow.FlowCollector r5 = r4.f39458a
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L44
                    return r1
                L44:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.fever.ui.temperatureList.q.b.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public b(SharedFlow sharedFlow) {
            this.f39457a = sharedFlow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super o.b> flowCollector, qm0.d dVar) {
            Object collect = this.f39457a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TemperatureListViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class c extends w implements ym0.l<ky.d, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f39462a = new w(1);

        @Override // ym0.l
        public final DateTime invoke(ky.d dVar) {
            ky.d it = dVar;
            u.j(it, "it");
            return it.c();
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes3.dex */
    public static final class d implements Flow<List<? extends nm0.j<? extends DateTime, ? extends List<? extends ky.d>>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f39463a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f39464b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes3.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f39465a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ q f39466b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.fever.ui.temperatureList.TemperatureListViewModel$temperatureListFlow$lambda$6$$inlined$map$1$2", f = "TemperatureListViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.fever.ui.temperatureList.q$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0516a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f39467a;

                /* renamed from: b  reason: collision with root package name */
                int f39468b;

                public C0516a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f39467a = obj;
                    this.f39468b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, q qVar) {
                this.f39465a = flowCollector;
                this.f39466b = qVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Comparator] */
            /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.Comparator] */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, qm0.d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.withings.fever.ui.temperatureList.q.d.a.C0516a
                    if (r0 == 0) goto L13
                    r0 = r9
                    com.withings.fever.ui.temperatureList.q$d$a$a r0 = (com.withings.fever.ui.temperatureList.q.d.a.C0516a) r0
                    int r1 = r0.f39468b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f39468b = r1
                    goto L18
                L13:
                    com.withings.fever.ui.temperatureList.q$d$a$a r0 = new com.withings.fever.ui.temperatureList.q$d$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f39467a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f39468b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r9)
                    goto L9c
                L27:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L2f:
                    nm0.l.b(r9)
                    java.util.List r8 = (java.util.List) r8
                    com.withings.fever.ui.temperatureList.q r9 = r7.f39466b
                    g20.a r9 = com.withings.fever.ui.temperatureList.q.f0(r9)
                    com.withings.periodsbar.Period r2 = com.withings.periodsbar.Period.f43723h
                    r9.getClass()
                    com.withings.fever.ui.temperatureList.q$c r9 = com.withings.fever.ui.temperatureList.q.c.f39462a
                    java.util.Map r8 = g20.a.a(r2, r8, r9)
                    java.util.Set r8 = r8.entrySet()
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    com.withings.fever.ui.temperatureList.q$e r9 = new com.withings.fever.ui.temperatureList.q$e
                    r9.<init>()
                    java.util.List r8 = kotlin.collections.x.D0(r8, r9)
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    java.util.ArrayList r9 = new java.util.ArrayList
                    r2 = 10
                    int r2 = kotlin.collections.x.y(r8, r2)
                    r9.<init>(r2)
                    java.util.Iterator r8 = r8.iterator()
                L65:
                    boolean r2 = r8.hasNext()
                    if (r2 == 0) goto L91
                    java.lang.Object r2 = r8.next()
                    java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                    java.lang.Object r4 = r2.getKey()
                    org.joda.time.DateTime r4 = (org.joda.time.DateTime) r4
                    java.lang.Object r2 = r2.getValue()
                    java.util.List r2 = (java.util.List) r2
                    nm0.j r5 = new nm0.j
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    com.withings.fever.ui.temperatureList.q$f r6 = new com.withings.fever.ui.temperatureList.q$f
                    r6.<init>()
                    java.util.List r2 = kotlin.collections.x.D0(r2, r6)
                    r5.<init>(r4, r2)
                    r9.add(r5)
                    goto L65
                L91:
                    r0.f39468b = r3
                    kotlinx.coroutines.flow.FlowCollector r8 = r7.f39465a
                    java.lang.Object r8 = r8.emit(r9, r0)
                    if (r8 != r1) goto L9c
                    return r1
                L9c:
                    nm0.y r8 = nm0.y.f85009a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.fever.ui.temperatureList.q.d.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public d(Flow flow, q qVar) {
            this.f39463a = flow;
            this.f39464b = qVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super List<? extends nm0.j<? extends DateTime, ? extends List<? extends ky.d>>>> flowCollector, qm0.d dVar) {
            Object collect = this.f39463a.collect(new a(flowCollector, this.f39464b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes3.dex */
    public static final class e<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return pm0.a.b((DateTime) ((Map.Entry) t12).getKey(), (DateTime) ((Map.Entry) t11).getKey());
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes3.dex */
    public static final class f<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return pm0.a.b(((ky.d) t12).c(), ((ky.d) t11).c());
        }
    }

    public q(Long l5, r70.c userRepository, iy.e getMeasureGroupV2, g20.a aVar, fy.a aVar2, ky.c measureListenerManagerInterface) {
        u.j(userRepository, "userRepository");
        u.j(getMeasureGroupV2, "getMeasureGroupV2");
        u.j(measureListenerManagerInterface, "measureListenerManagerInterface");
        this.f39445a = userRepository;
        this.f39446b = getMeasureGroupV2;
        this.f39447c = aVar;
        this.f39448d = aVar2;
        this.f39449e = measureListenerManagerInterface;
        Flow<User> flowOf = (l5 == null || (flowOf = userRepository.g(l5.longValue())) == null) ? FlowKt.flowOf(null) : flowOf;
        this.f39450f = flowOf;
        Flow transformLatest = FlowKt.transformLatest(FlowKt.filterNotNull(flowOf), new a(null, this));
        CoroutineScope a11 = h1.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharedFlow<List<nm0.j<DateTime, List<ky.d>>>> shareIn = FlowKt.shareIn(transformLatest, a11, companion.getLazily(), 1);
        this.f39451g = shareIn;
        this.f39452h = FlowKt.stateIn(new b(shareIn), h1.a(this), companion.getLazily(), o.a.f39441a);
    }

    public final StateFlow<o> k0() {
        return this.f39452h;
    }
}
