package com.withings.wiscale2.vascularage;

import com.withings.graph.GraphPeriod;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.periodsbar.Period;
import com.withings.pwv.core.PwvCategory;
import com.withings.user.core.models.User;
import com.withings.wiscale2.vascularage.a;
import com.withings.wiscale2.vascularage.c;
import com.withings.wiscale2.vascularage.i;
import java.util.List;
import kotlin.KotlinNothingValueException;
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
import z70.a;
/* compiled from: VascularAgeViewModel.kt */
/* loaded from: classes5.dex */
public final class r0 extends androidx.lifecycle.g1 {
    private final SharedFlow<nm0.j<b90.a, b90.a>> A;
    private final SharedFlow<DateTime> B;
    private final GraphPeriod F;
    private final SharedFlow<Integer> G;
    private final StateFlow<List<GraphPeriod>> M;
    private final SharedFlow<List<LearnMoreEntryTranslations>> P;
    private final SharedFlow<d> Q;
    private final Flow<w> R;
    private final Flow<h> S;
    private final StateFlow<i> T;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f62440a;

    /* renamed from: b  reason: collision with root package name */
    private final r70.c f62441b;

    /* renamed from: c  reason: collision with root package name */
    private final iy.e f62442c;

    /* renamed from: d  reason: collision with root package name */
    private final v90.g f62443d;

    /* renamed from: e  reason: collision with root package name */
    private final ml.b f62444e;

    /* renamed from: f  reason: collision with root package name */
    private final ks.t f62445f;

    /* renamed from: g  reason: collision with root package name */
    private final a80.c f62446g;

    /* renamed from: h  reason: collision with root package name */
    private final e40.a f62447h;

    /* renamed from: i  reason: collision with root package name */
    private final LearnMoreManager f62448i;

    /* renamed from: j  reason: collision with root package name */
    private final e40.b f62449j;

    /* renamed from: k  reason: collision with root package name */
    private final MutableSharedFlow<c> f62450k;

    /* renamed from: l  reason: collision with root package name */
    private final SharedFlow<c> f62451l;

    /* renamed from: m  reason: collision with root package name */
    private final Flow<User> f62452m;

    /* renamed from: n  reason: collision with root package name */
    private final SharedFlow<User> f62453n;

    /* renamed from: o  reason: collision with root package name */
    private final at.a f62454o;

    /* renamed from: p  reason: collision with root package name */
    private final MutableSharedFlow<Interval> f62455p;

    /* renamed from: q  reason: collision with root package name */
    private final d1 f62456q;

    /* renamed from: r  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f62457r;

    /* renamed from: s  reason: collision with root package name */
    private final SharedFlow<Boolean> f62458s;

    /* renamed from: t  reason: collision with root package name */
    private final SharedFlow<List<ky.a>> f62459t;

    /* renamed from: u  reason: collision with root package name */
    private final SharedFlow<List<ky.a>> f62460u;

    /* renamed from: v  reason: collision with root package name */
    private final StateFlow<z70.c> f62461v;

    /* renamed from: w  reason: collision with root package name */
    private final StateFlow<Integer> f62462w;

    /* renamed from: x  reason: collision with root package name */
    private final StateFlow<Double> f62463x;

    /* renamed from: y  reason: collision with root package name */
    private final StateFlow<e40.d> f62464y;

    /* renamed from: z  reason: collision with root package name */
    private final SharedFlow<nm0.j<b90.a, b90.a>> f62465z;

    /* compiled from: VascularAgeViewModel.kt */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final DateTime f62466a;

        /* renamed from: b  reason: collision with root package name */
        private final float f62467b;

        public a(float f11, DateTime x11) {
            kotlin.jvm.internal.u.j(x11, "x");
            this.f62466a = x11;
            this.f62467b = f11;
        }

        public final DateTime a() {
            return this.f62466a;
        }

        public final float b() {
            return this.f62467b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (kotlin.jvm.internal.u.e(this.f62466a, aVar.f62466a) && Float.compare(this.f62467b, aVar.f62467b) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.f62467b) + (this.f62466a.hashCode() * 31);
        }

        public final String toString() {
            return "GraphicCircleDatum(x=" + this.f62466a + ", y=" + this.f62467b + ")";
        }
    }

    /* compiled from: VascularAgeViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeViewModel$reduce$1", f = "VascularAgeViewModel.kt", l = {111}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f62468a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: VascularAgeViewModel.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeViewModel$reduce$1$1", f = "VascularAgeViewModel.kt", l = {109}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<Interval, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f62470a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f62471b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ r0 f62472c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r0 r0Var, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f62472c = r0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                a aVar = new a(this.f62472c, dVar);
                aVar.f62471b = obj;
                return aVar;
            }

            @Override // ym0.p
            public final Object invoke(Interval interval, qm0.d<? super nm0.y> dVar) {
                return ((a) create(interval, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f62470a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    MutableSharedFlow mutableSharedFlow = this.f62472c.f62455p;
                    this.f62470a = 1;
                    if (mutableSharedFlow.emit((Interval) this.f62471b, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: VascularAgeViewModel.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeViewModel$reduce$1$2", f = "VascularAgeViewModel.kt", l = {110}, m = "invokeSuspend")
        /* renamed from: com.withings.wiscale2.vascularage.r0$b$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0794b extends kotlin.coroutines.jvm.internal.i implements ym0.p<User, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f62473a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f62474b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ r0 f62475c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0794b(r0 r0Var, qm0.d<? super C0794b> dVar) {
                super(2, dVar);
                this.f62475c = r0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                C0794b c0794b = new C0794b(this.f62475c, dVar);
                c0794b.f62474b = obj;
                return c0794b;
            }

            @Override // ym0.p
            public final Object invoke(User user, qm0.d<? super nm0.y> dVar) {
                return ((C0794b) create(user, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f62473a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    if (((User) this.f62474b) == null) {
                        MutableSharedFlow mutableSharedFlow = this.f62475c.f62450k;
                        c.a aVar = c.a.f62254a;
                        this.f62473a = 1;
                        if (mutableSharedFlow.emit(aVar, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: VascularAgeViewModel.kt */
        /* loaded from: classes5.dex */
        public static final class c<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r0 f62476a;

            c(r0 r0Var) {
                this.f62476a = r0Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, qm0.d dVar) {
                DateTime dateTime = (DateTime) obj;
                r0 r0Var = this.f62476a;
                at.a aVar = r0Var.f62454o;
                GraphPeriod graphPeriod = r0Var.F;
                if (dateTime == null) {
                    dateTime = DateTime.now();
                }
                kotlin.jvm.internal.u.g(dateTime);
                at.a.h(aVar, graphPeriod, dateTime);
                return nm0.y.f85009a;
            }
        }

        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            return CoroutineSingletons.f76214a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f62468a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                r0 r0Var = r0.this;
                FlowKt.onEach(r0Var.f62456q, new a(r0Var, null));
                FlowKt.onEach(r0Var.f62452m, new C0794b(r0Var, null));
                SharedFlow sharedFlow = r0Var.B;
                c cVar = new c(r0Var);
                this.f62468a = 1;
                if (sharedFlow.collect(cVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r4v4, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r6v14, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    public r0(Long l5, boolean z5, r70.c userRepository, iy.e measuresGroupRepositoryV2, v90.g gVar, ml.b bVar, ks.t tVar, a80.c cVar, e40.a aVar, n20.f fVar, LearnMoreManager learnMoreManager, e40.b bVar2) {
        Period period = Period.f43723h;
        kotlin.jvm.internal.u.j(userRepository, "userRepository");
        kotlin.jvm.internal.u.j(measuresGroupRepositoryV2, "measuresGroupRepositoryV2");
        this.f62440a = z5;
        this.f62441b = userRepository;
        this.f62442c = measuresGroupRepositoryV2;
        this.f62443d = gVar;
        this.f62444e = bVar;
        this.f62445f = tVar;
        this.f62446g = cVar;
        this.f62447h = aVar;
        this.f62448i = learnMoreManager;
        this.f62449j = bVar2;
        MutableSharedFlow<c> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f62450k = MutableSharedFlow$default;
        this.f62451l = FlowKt.asSharedFlow(MutableSharedFlow$default);
        Flow<User> f11 = (l5 == null || (f11 = userRepository.g(l5.longValue())) == null) ? userRepository.f() : f11;
        this.f62452m = f11;
        Flow filterNotNull = FlowKt.filterNotNull(f11);
        CoroutineScope a11 = androidx.lifecycle.h1.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharedFlow<User> shareIn = FlowKt.shareIn(filterNotNull, a11, companion.getEagerly(), 1);
        this.f62453n = shareIn;
        GraphPeriod graphPeriod = GraphPeriod.f39504d;
        DateTime now = DateTime.now();
        kotlin.jvm.internal.u.i(now, "now(...)");
        this.f62454o = new at.a(graphPeriod, now);
        MutableSharedFlow<Interval> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(2, 0, null, 6, null);
        this.f62455p = MutableSharedFlow$default2;
        d1 d1Var = new d1(shareIn, this);
        this.f62456q = d1Var;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.f62457r = MutableStateFlow;
        SharedFlow<Boolean> shareIn2 = FlowKt.shareIn(fVar.a(), androidx.lifecycle.h1.a(this), companion.getLazily(), 1);
        this.f62458s = shareIn2;
        SharedFlow<List<ky.a>> shareIn3 = FlowKt.shareIn(FlowKt.combine(shareIn, shareIn2, new a1(this, null)), androidx.lifecycle.h1.a(this), companion.getLazily(), 1);
        this.f62459t = shareIn3;
        SharedFlow<List<ky.a>> shareIn4 = FlowKt.shareIn(new e1(shareIn, this), androidx.lifecycle.h1.a(this), companion.getLazily(), 1);
        this.f62460u = shareIn4;
        StateFlow<z70.c> stateIn = FlowKt.stateIn(FlowKt.combine(shareIn4, MutableSharedFlow$default2, shareIn, new k1(this, null)), androidx.lifecycle.h1.a(this), companion.getLazily(), new z70.c(0, 0, 0, a.b.f110146a));
        this.f62461v = stateIn;
        StateFlow<Integer> stateIn2 = FlowKt.stateIn(FlowKt.combine(shareIn4, MutableSharedFlow$default2, new kotlin.coroutines.jvm.internal.i(3, null)), androidx.lifecycle.h1.a(this), companion.getLazily(), null);
        this.f62462w = stateIn2;
        this.f62463x = FlowKt.stateIn(FlowKt.combine(MutableSharedFlow$default2, shareIn3, new kotlin.coroutines.jvm.internal.i(3, null)), androidx.lifecycle.h1.a(this), companion.getLazily(), null);
        this.f62464y = FlowKt.stateIn(FlowKt.combine(shareIn3, MutableSharedFlow$default2, shareIn, new b1(this, null)), androidx.lifecycle.h1.a(this), companion.getLazily(), new e40.d(PwvCategory.f43841b));
        this.f62465z = FlowKt.shareIn(FlowKt.combine(shareIn, d1Var, new z0(this, null)), androidx.lifecycle.h1.a(this), companion.getEagerly(), 1);
        SharedFlow<nm0.j<b90.a, b90.a>> shareIn5 = FlowKt.shareIn(FlowKt.combine(d1Var, shareIn, new kotlin.coroutines.jvm.internal.i(3, null)), androidx.lifecycle.h1.a(this), companion.getEagerly(), 1);
        this.A = shareIn5;
        this.B = FlowKt.shareIn(new f1(shareIn, this), androidx.lifecycle.h1.a(this), companion.getEagerly(), 1);
        this.F = h20.a.c(period);
        SharedFlow<Integer> shareIn6 = FlowKt.shareIn(FlowKt.combine(shareIn4, shareIn, new w0(this, null)), androidx.lifecycle.h1.a(this), companion.getLazily(), 1);
        this.G = shareIn6;
        StateFlow<List<GraphPeriod>> stateIn3 = FlowKt.stateIn(new g1(FlowKt.filterNotNull(d1Var), this), androidx.lifecycle.h1.a(this), companion.getLazily(), kotlin.collections.i0.f76187a);
        this.M = stateIn3;
        SharedFlow<List<LearnMoreEntryTranslations>> shareIn7 = FlowKt.shareIn(FlowKt.flowOn(FlowKt.flow(new v0(this, null)), Dispatchers.getIO()), androidx.lifecycle.h1.a(this), companion.getEagerly(), 1);
        this.P = shareIn7;
        SharedFlow<d> shareIn8 = FlowKt.shareIn(FlowKt.combine(d1Var, stateIn3, MutableStateFlow, shareIn, new u0(this, null)), androidx.lifecycle.h1.a(this), companion.getEagerly(), 1);
        this.Q = shareIn8;
        Flow<w> combine = FlowKt.combine(stateIn, shareIn4, shareIn5, stateIn2, shareIn, new j1(this, null));
        this.R = combine;
        Flow<h> transformLatest = FlowKt.transformLatest(shareIn2, new c1(this, null));
        this.S = transformLatest;
        this.T = FlowKt.stateIn(FlowKt.combine(shareIn8, shareIn7, shareIn6, combine, transformLatest, new h1(null)), androidx.lifecycle.h1.a(this), companion.getEagerly(), i.a.f62319a);
    }

    public final SharedFlow<c> U0() {
        return this.f62451l;
    }

    public final StateFlow<i> V0() {
        return this.T;
    }

    public final void W0(com.withings.wiscale2.vascularage.a action) {
        kotlin.jvm.internal.u.j(action, "action");
        if (kotlin.jvm.internal.u.e(action, a.b.f62240a)) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), null, null, new i1(this, null), 3, null);
        } else if (action instanceof a.c) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), null, null, new x0(this, ((a.c) action).a(), null), 3, null);
        } else if (kotlin.jvm.internal.u.e(action, a.C0789a.f62239a)) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), null, null, new b(null), 3, null);
        }
    }
}
