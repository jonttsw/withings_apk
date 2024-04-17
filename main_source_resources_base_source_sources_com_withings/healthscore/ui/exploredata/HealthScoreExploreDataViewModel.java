package com.withings.healthscore.ui.exploredata;

import android.app.Application;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v0;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.common.compose.component.m4;
import com.withings.graph.GraphPeriod;
import com.withings.measurement.model.MeasurementsVertical;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.ReadableInstant;
import ym0.p;
import ym0.q;
/* compiled from: HealthScoreExploreDataViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/healthscore/ui/exploredata/HealthScoreExploreDataViewModel;", "Landroidx/lifecycle/b;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class HealthScoreExploreDataViewModel extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final MeasurementsVertical f40523a;

    /* renamed from: b  reason: collision with root package name */
    private final long f40524b;

    /* renamed from: c  reason: collision with root package name */
    private final h f40525c;

    /* renamed from: d  reason: collision with root package name */
    private final at.a f40526d;

    /* renamed from: e  reason: collision with root package name */
    private final MutableStateFlow<Interval> f40527e;

    /* renamed from: f  reason: collision with root package name */
    private final SharedFlow<wv.c> f40528f;

    /* renamed from: g  reason: collision with root package name */
    private final Flow<m4> f40529g;

    /* renamed from: h  reason: collision with root package name */
    private final e f40530h;

    /* compiled from: HealthScoreExploreDataViewModel.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ sm0.a<MeasurementsVertical> f40531a = sm0.b.a(MeasurementsVertical.values());
    }

    /* compiled from: HealthScoreExploreDataViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel$healthScoreGraphDataFlow$1", f = "HealthScoreExploreDataViewModel.kt", l = {51, 51}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements p<FlowCollector<? super wv.c>, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40532a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f40533b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ xv.b f40534c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ HealthScoreExploreDataViewModel f40535d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xv.b bVar, HealthScoreExploreDataViewModel healthScoreExploreDataViewModel, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f40534c = bVar;
            this.f40535d = healthScoreExploreDataViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(this.f40534c, this.f40535d, dVar);
            bVar.f40533b = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super wv.c> flowCollector, qm0.d<? super y> dVar) {
            return ((b) create(flowCollector, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f40532a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        l.b(obj);
                        return y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flowCollector = (FlowCollector) this.f40533b;
                l.b(obj);
            } else {
                l.b(obj);
                flowCollector = (FlowCollector) this.f40533b;
                HealthScoreExploreDataViewModel healthScoreExploreDataViewModel = this.f40535d;
                long j5 = healthScoreExploreDataViewModel.f40524b;
                MeasurementsVertical q02 = healthScoreExploreDataViewModel.q0();
                this.f40533b = flowCollector;
                this.f40532a = 1;
                obj = this.f40534c.a(j5, q02, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            this.f40533b = null;
            this.f40532a = 2;
            if (flowCollector.emit(obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return y.f85009a;
        }
    }

    /* compiled from: HealthScoreExploreDataViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel$healthScoreStatusHeaderState$2", f = "HealthScoreExploreDataViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements q<List<? extends nm0.j<? extends DateTime, ? extends Integer>>, Interval, qm0.d<? super m4>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ List f40536a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Interval f40537b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n60.a f40538c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ HealthScoreExploreDataViewModel f40539d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n60.a aVar, HealthScoreExploreDataViewModel healthScoreExploreDataViewModel, qm0.d<? super c> dVar) {
            super(3, dVar);
            this.f40538c = aVar;
            this.f40539d = healthScoreExploreDataViewModel;
        }

        @Override // ym0.q
        public final Object invoke(List<? extends nm0.j<? extends DateTime, ? extends Integer>> list, Interval interval, qm0.d<? super m4> dVar) {
            c cVar = new c(this.f40538c, this.f40539d, dVar);
            cVar.f40536a = list;
            cVar.f40537b = interval;
            return cVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object next;
            Object next2;
            Integer num;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            List healthScores = this.f40536a;
            Interval interval = this.f40537b;
            if (interval != null) {
                this.f40538c.getClass();
                u.j(healthScores, "healthScores");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : healthScores) {
                    if (interval.contains((ReadableInstant) ((nm0.j) obj2).c())) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                m4 m4Var = null;
                if (!it.hasNext()) {
                    next = null;
                } else {
                    next = it.next();
                    if (it.hasNext()) {
                        DateTime dateTime = (DateTime) ((nm0.j) next).c();
                        do {
                            Object next3 = it.next();
                            DateTime dateTime2 = (DateTime) ((nm0.j) next3).c();
                            if (dateTime.compareTo(dateTime2) > 0) {
                                next = next3;
                                dateTime = dateTime2;
                            }
                        } while (it.hasNext());
                    }
                }
                nm0.j jVar = (nm0.j) next;
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    next2 = null;
                } else {
                    next2 = it2.next();
                    if (it2.hasNext()) {
                        DateTime dateTime3 = (DateTime) ((nm0.j) next2).c();
                        do {
                            Object next4 = it2.next();
                            DateTime dateTime4 = (DateTime) ((nm0.j) next4).c();
                            if (dateTime3.compareTo(dateTime4) < 0) {
                                next2 = next4;
                                dateTime3 = dateTime4;
                            }
                        } while (it2.hasNext());
                    }
                }
                nm0.j jVar2 = (nm0.j) next2;
                if (jVar != null && jVar2 != null) {
                    num = Integer.valueOf(((Number) jVar2.d()).intValue() - ((Number) jVar.d()).intValue());
                } else {
                    num = null;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    String quantityString = this.f40539d.getApplication().getResources().getQuantityString(C1987R.plurals.healthVertical_numberOfPoints, intValue, new Integer(intValue));
                    u.i(quantityString, "getQuantityString(...)");
                    m4Var = new m4(androidx.health.connect.client.units.d.n(quantityString, intValue), null, null, null, 14);
                }
                if (m4Var != null) {
                    return m4Var;
                }
            }
            return new m4("--", null, null, null, 14);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes3.dex */
    public static final class d implements Flow<List<? extends nm0.j<? extends DateTime, ? extends Integer>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f40540a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes3.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f40541a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel$special$$inlined$map$1$2", f = "HealthScoreExploreDataViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0542a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f40542a;

                /* renamed from: b  reason: collision with root package name */
                int f40543b;

                public C0542a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f40542a = obj;
                    this.f40543b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f40541a = flowCollector;
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
                    boolean r0 = r6 instanceof com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel.d.a.C0542a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel$d$a$a r0 = (com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel.d.a.C0542a) r0
                    int r1 = r0.f40543b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f40543b = r1
                    goto L18
                L13:
                    com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel$d$a$a r0 = new com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f40542a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f40543b
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
                    wv.c r5 = (wv.c) r5
                    java.util.List r5 = r5.b()
                    r0.f40543b = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f40541a
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel.d.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public d(SharedFlow sharedFlow) {
            this.f40540a = sharedFlow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super List<? extends nm0.j<? extends DateTime, ? extends Integer>>> flowCollector, qm0.d dVar) {
            Object collect = this.f40540a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes3.dex */
    public static final class e implements Flow<g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f40545a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HealthScoreExploreDataViewModel f40546b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes3.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f40547a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ HealthScoreExploreDataViewModel f40548b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel$special$$inlined$map$2$2", f = "HealthScoreExploreDataViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0543a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f40549a;

                /* renamed from: b  reason: collision with root package name */
                int f40550b;

                public C0543a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f40549a = obj;
                    this.f40550b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, HealthScoreExploreDataViewModel healthScoreExploreDataViewModel) {
                this.f40547a = flowCollector;
                this.f40548b = healthScoreExploreDataViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, qm0.d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel.e.a.C0543a
                    if (r0 == 0) goto L13
                    r0 = r9
                    com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel$e$a$a r0 = (com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel.e.a.C0543a) r0
                    int r1 = r0.f40550b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f40550b = r1
                    goto L18
                L13:
                    com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel$e$a$a r0 = new com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel$e$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f40549a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f40550b
                    r3 = 1
                    if (r2 == 0) goto L30
                    if (r2 != r3) goto L28
                    nm0.l.b(r9)
                    goto La1
                L28:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L30:
                    nm0.l.b(r9)
                    wv.c r8 = (wv.c) r8
                    org.joda.time.Interval r9 = r8.a()
                    java.util.List r8 = r8.b()
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r4 = 10
                    int r4 = kotlin.collections.x.y(r8, r4)
                    r2.<init>(r4)
                    java.util.Iterator r8 = r8.iterator()
                L4e:
                    boolean r4 = r8.hasNext()
                    if (r4 == 0) goto L77
                    java.lang.Object r4 = r8.next()
                    nm0.j r4 = (nm0.j) r4
                    java.lang.Object r5 = r4.c()
                    java.lang.Object r4 = r4.d()
                    java.lang.Number r4 = (java.lang.Number) r4
                    int r4 = r4.intValue()
                    float r4 = (float) r4
                    java.lang.Float r6 = new java.lang.Float
                    r6.<init>(r4)
                    nm0.j r4 = new nm0.j
                    r4.<init>(r5, r6)
                    r2.add(r4)
                    goto L4e
                L77:
                    com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel r8 = r7.f40548b
                    at.a r4 = r8.j0()
                    android.app.Application r8 = r8.getApplication()
                    android.content.res.Resources r8 = r8.getResources()
                    r5 = 2132022975(0x7f1416bf, float:1.9684385E38)
                    java.lang.String r8 = r8.getString(r5)
                    java.lang.String r5 = "getString(...)"
                    kotlin.jvm.internal.u.i(r8, r5)
                    com.withings.healthscore.ui.exploredata.g r5 = new com.withings.healthscore.ui.exploredata.g
                    r5.<init>(r9, r2, r4, r8)
                    r0.f40550b = r3
                    kotlinx.coroutines.flow.FlowCollector r8 = r7.f40547a
                    java.lang.Object r8 = r8.emit(r5, r0)
                    if (r8 != r1) goto La1
                    return r1
                La1:
                    nm0.y r8 = nm0.y.f85009a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.healthscore.ui.exploredata.HealthScoreExploreDataViewModel.e.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public e(SharedFlow sharedFlow, HealthScoreExploreDataViewModel healthScoreExploreDataViewModel) {
            this.f40545a = sharedFlow;
            this.f40546b = healthScoreExploreDataViewModel;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super g> flowCollector, qm0.d dVar) {
            Object collect = this.f40545a.collect(new a(flowCollector, this.f40546b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public HealthScoreExploreDataViewModel(u0 savedStateHandle, xv.b bVar, n60.a aVar, Application application) {
        super(application);
        MeasurementsVertical measurementsVertical;
        ParcelableSnapshotMutableState f11;
        u.j(savedStateHandle, "savedStateHandle");
        Integer num = (Integer) savedStateHandle.c("measurement_vertical");
        if (num != null) {
            measurementsVertical = (MeasurementsVertical) a.f40531a.get(num.intValue());
        } else {
            measurementsVertical = null;
        }
        this.f40523a = measurementsVertical;
        Object c11 = savedStateHandle.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID);
        if (c11 != null) {
            this.f40524b = ((Number) c11).longValue();
            f11 = l0.f(null, v0.f8878a);
            this.f40525c = new h(getApplication(), f11);
            GraphPeriod graphPeriod = GraphPeriod.f39505e;
            DateTime now = DateTime.now();
            u.i(now, "now(...)");
            this.f40526d = new at.a(graphPeriod, now);
            MutableStateFlow<Interval> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
            this.f40527e = MutableStateFlow;
            SharedFlow<wv.c> shareIn = FlowKt.shareIn(FlowKt.flow(new b(bVar, this, null)), h1.a(this), SharingStarted.Companion.getEagerly(), 1);
            this.f40528f = shareIn;
            this.f40529g = FlowKt.combine(new d(shareIn), MutableStateFlow, new c(aVar, this, null));
            this.f40530h = new e(shareIn, this);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final h g0() {
        return this.f40525c;
    }

    public final MutableStateFlow<Interval> i0() {
        return this.f40527e;
    }

    public final at.a j0() {
        return this.f40526d;
    }

    public final SharedFlow<wv.c> k0() {
        return this.f40528f;
    }

    public final e m0() {
        return this.f40530h;
    }

    public final Flow<m4> p0() {
        return this.f40529g;
    }

    public final MeasurementsVertical q0() {
        return this.f40523a;
    }
}
