package com.withings.weight.ui;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.core.models.User;
import com.withings.weight.android.model.BodyCompositionBundle;
import com.withings.weight.android.model.SegmentalBodyCompositionMeasureType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import u90.i;
/* compiled from: SegmentalBodyCompositionViewModel.kt */
/* loaded from: classes4.dex */
public final class v extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final r70.c f47830a;

    /* renamed from: b  reason: collision with root package name */
    private final d90.a f47831b;

    /* renamed from: c  reason: collision with root package name */
    private final v80.f f47832c;

    /* renamed from: d  reason: collision with root package name */
    private final v80.b f47833d;

    /* renamed from: e  reason: collision with root package name */
    private final jm.a f47834e;

    /* renamed from: f  reason: collision with root package name */
    private final com.withings.weight.ui.usecase.a f47835f;

    /* renamed from: g  reason: collision with root package name */
    private final iy.e f47836g;

    /* renamed from: h  reason: collision with root package name */
    private final ky.c f47837h;

    /* renamed from: i  reason: collision with root package name */
    private final long f47838i;

    /* renamed from: j  reason: collision with root package name */
    private final Long f47839j;

    /* renamed from: k  reason: collision with root package name */
    private final SharedFlow<User> f47840k;

    /* renamed from: l  reason: collision with root package name */
    private final SharedFlow<r90.b> f47841l;

    /* renamed from: m  reason: collision with root package name */
    private final SharedFlow<List<ky.d>> f47842m;

    /* renamed from: n  reason: collision with root package name */
    private final SharedFlow<List<com.withings.weight.ui.a>> f47843n;

    /* renamed from: o  reason: collision with root package name */
    private final MutableSharedFlow<z80.b> f47844o;

    /* renamed from: p  reason: collision with root package name */
    private final SharedFlow f47845p;

    /* renamed from: q  reason: collision with root package name */
    private final MutableSharedFlow<Integer> f47846q;

    /* renamed from: r  reason: collision with root package name */
    private final StateFlow<u90.i> f47847r;

    /* compiled from: SegmentalBodyCompositionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.ui.SegmentalBodyCompositionViewModel$1", f = "SegmentalBodyCompositionViewModel.kt", l = {124, 128, ConstantsWs.MEASURE_TYPE_BREATHING_EVENT_PROBABILITY, ConstantsWs.MEASURE_TYPE_BREATHING_EVENT_PROBABILITY}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        MutableSharedFlow f47848a;

        /* renamed from: b  reason: collision with root package name */
        int f47849b;

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

        /* JADX WARN: Removed duplicated region for block: B:32:0x00a5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b0 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r12.f47849b
                r2 = 0
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                com.withings.weight.ui.v r7 = com.withings.weight.ui.v.this
                if (r1 == 0) goto L31
                if (r1 == r6) goto L2d
                if (r1 == r5) goto L29
                if (r1 == r4) goto L22
                if (r1 != r3) goto L1a
                nm0.l.b(r13)
                goto Lb1
            L1a:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L22:
                kotlinx.coroutines.flow.MutableSharedFlow r1 = r12.f47848a
                nm0.l.b(r13)
                goto La6
            L29:
                nm0.l.b(r13)
                goto L8a
            L2d:
                nm0.l.b(r13)
                goto L41
            L31:
                nm0.l.b(r13)
                kotlinx.coroutines.flow.SharedFlow r13 = com.withings.weight.ui.v.f0(r7)
                r12.f47849b = r6
                java.lang.Object r13 = kotlinx.coroutines.flow.FlowKt.first(r13, r12)
                if (r13 != r0) goto L41
                return r0
            L41:
                java.util.List r13 = (java.util.List) r13
                java.lang.Long r1 = com.withings.weight.ui.v.m0(r7)
                if (r1 == 0) goto L74
                long r8 = r1.longValue()
                int r1 = r13.size()
                java.util.ListIterator r13 = r13.listIterator(r1)
            L55:
                boolean r1 = r13.hasPrevious()
                if (r1 == 0) goto L72
                java.lang.Object r1 = r13.previous()
                com.withings.weight.ui.a r1 = (com.withings.weight.ui.a) r1
                ky.d r1 = r1.c()
                long r10 = r1.d()
                int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r1 != 0) goto L55
                int r13 = r13.nextIndex()
                goto L78
            L72:
                r13 = -1
                goto L78
            L74:
                int r13 = kotlin.collections.x.M(r13)
            L78:
                kotlinx.coroutines.flow.MutableSharedFlow r1 = com.withings.weight.ui.v.t0(r7)
                java.lang.Integer r6 = new java.lang.Integer
                r6.<init>(r13)
                r12.f47849b = r5
                java.lang.Object r13 = r1.emit(r6, r12)
                if (r13 != r0) goto L8a
                return r0
            L8a:
                kotlinx.coroutines.flow.MutableSharedFlow r1 = com.withings.weight.ui.v.r0(r7)
                long r5 = com.withings.weight.ui.v.z0(r7)
                r12.f47848a = r1
                r12.f47849b = r4
                kotlinx.coroutines.CoroutineDispatcher r13 = kotlinx.coroutines.Dispatchers.getIO()
                com.withings.weight.ui.w r4 = new com.withings.weight.ui.w
                r4.<init>(r7, r5, r2)
                java.lang.Object r13 = kotlinx.coroutines.BuildersKt.withContext(r13, r4, r12)
                if (r13 != r0) goto La6
                return r0
            La6:
                r12.f47848a = r2
                r12.f47849b = r3
                java.lang.Object r13 = r1.emit(r13, r12)
                if (r13 != r0) goto Lb1
                return r0
            Lb1:
                nm0.y r13 = nm0.y.f85009a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.weight.ui.v.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SegmentalBodyCompositionViewModel.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ sm0.a<SegmentalBodyCompositionMeasureType> f47851a = sm0.b.a(SegmentalBodyCompositionMeasureType.values());
    }

    /* compiled from: SegmentalBodyCompositionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.ui.SegmentalBodyCompositionViewModel$bodyCompositionList$1", f = "SegmentalBodyCompositionViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.q<r90.b, List<? extends ky.d>, qm0.d<? super List<? extends com.withings.weight.ui.a>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ r90.b f47852a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ List f47853b;

        c(qm0.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // ym0.q
        public final Object invoke(r90.b bVar, List<? extends ky.d> list, qm0.d<? super List<? extends com.withings.weight.ui.a>> dVar) {
            c cVar = new c(dVar);
            cVar.f47852a = bVar;
            cVar.f47853b = list;
            return cVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.withings.weight.ui.a aVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            r90.b bVar = this.f47852a;
            ArrayList arrayList = new ArrayList();
            for (ky.d dVar : this.f47853b) {
                v vVar = v.this;
                vVar.f47833d.getClass();
                BodyCompositionBundle a11 = v80.b.a(dVar);
                if (a11 != null) {
                    aVar = new com.withings.weight.ui.a(dVar, a11, vVar.f47835f.b(a11, bVar));
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: SegmentalBodyCompositionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.ui.SegmentalBodyCompositionViewModel$screenState$1", f = "SegmentalBodyCompositionViewModel.kt", l = {118}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.t<r90.b, List<? extends com.withings.weight.ui.a>, Integer, z80.b, Interval, qm0.d<? super i.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Interval f47855a;

        /* renamed from: b  reason: collision with root package name */
        DateTime f47856b;

        /* renamed from: c  reason: collision with root package name */
        long f47857c;

        /* renamed from: d  reason: collision with root package name */
        int f47858d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f47859e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f47860f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ int f47861g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f47862h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f47863i;

        d(qm0.d<? super d> dVar) {
            super(6, dVar);
        }

        @Override // ym0.t
        public final Object c(r90.b bVar, List<? extends com.withings.weight.ui.a> list, Integer num, z80.b bVar2, Interval interval, qm0.d<? super i.a> dVar) {
            int intValue = num.intValue();
            d dVar2 = new d(dVar);
            dVar2.f47859e = bVar;
            dVar2.f47860f = list;
            dVar2.f47861g = intValue;
            dVar2.f47862h = bVar2;
            dVar2.f47863i = interval;
            return dVar2.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            r90.b bVar;
            DateTime dateTime;
            long j5;
            Interval interval;
            z80.b bVar2;
            v90.b bVar3;
            BodyCompositionBundle bodyCompositionBundle;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f47858d;
            if (i11 != 0) {
                if (i11 == 1) {
                    long j11 = this.f47857c;
                    DateTime dateTime2 = this.f47856b;
                    Interval interval2 = this.f47855a;
                    bVar = (r90.b) this.f47862h;
                    BodyCompositionBundle bodyCompositionBundle2 = (BodyCompositionBundle) this.f47860f;
                    z80.b bVar4 = (z80.b) this.f47859e;
                    nm0.l.b(obj);
                    dateTime = dateTime2;
                    j5 = j11;
                    interval = interval2;
                    bVar2 = bVar4;
                    bVar3 = (v90.b) this.f47863i;
                    bodyCompositionBundle = bodyCompositionBundle2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                bVar = (r90.b) this.f47859e;
                int i12 = this.f47861g;
                z80.b bVar5 = (z80.b) this.f47862h;
                Interval interval3 = (Interval) this.f47863i;
                com.withings.weight.ui.a aVar = (com.withings.weight.ui.a) ((List) this.f47860f).get(i12);
                v vVar = v.this;
                long j12 = vVar.f47838i;
                BodyCompositionBundle a11 = aVar.a();
                v90.b b10 = aVar.b();
                DateTime c11 = aVar.c().c();
                SharedFlow sharedFlow = vVar.f47840k;
                this.f47859e = bVar5;
                this.f47860f = a11;
                this.f47862h = bVar;
                this.f47863i = b10;
                this.f47855a = interval3;
                this.f47856b = c11;
                this.f47857c = j12;
                this.f47858d = 1;
                Object first = FlowKt.first(sharedFlow, this);
                if (first == coroutineSingletons) {
                    return coroutineSingletons;
                }
                dateTime = c11;
                obj = first;
                j5 = j12;
                interval = interval3;
                bVar2 = bVar5;
                bVar3 = b10;
                bodyCompositionBundle = a11;
            }
            return new i.a(j5, bVar2, bodyCompositionBundle, bVar, bVar3, interval, dateTime, ((User) obj).getBodyComp().getInPercent());
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class e implements Flow<r90.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f47865a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f47866b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f47867a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v f47868b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.ui.SegmentalBodyCompositionViewModel$special$$inlined$map$1$2", f = "SegmentalBodyCompositionViewModel.kt", l = {225, 229, 223}, m = "emit")
            /* renamed from: com.withings.weight.ui.v$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0660a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f47869a;

                /* renamed from: b  reason: collision with root package name */
                int f47870b;

                /* renamed from: c  reason: collision with root package name */
                a f47871c;

                /* renamed from: e  reason: collision with root package name */
                FlowCollector f47873e;

                /* renamed from: f  reason: collision with root package name */
                User f47874f;

                public C0660a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f47869a = obj;
                    this.f47870b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, v vVar) {
                this.f47867a = flowCollector;
                this.f47868b = vVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0182 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:43:0x0186  */
            /* JADX WARN: Type inference failed for: r1v9, types: [v80.f] */
            /* JADX WARN: Type inference failed for: r9v2 */
            /* JADX WARN: Type inference failed for: r9v3, types: [int] */
            /* JADX WARN: Type inference failed for: r9v4 */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r38, qm0.d r39) {
                /*
                    Method dump skipped, instructions count: 402
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.weight.ui.v.e.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public e(SharedFlow sharedFlow, v vVar) {
            this.f47865a = sharedFlow;
            this.f47866b = vVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super r90.b> flowCollector, qm0.d dVar) {
            Object collect = this.f47865a.collect(new a(flowCollector, this.f47866b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class f implements Flow<Interval> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f47875a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f47876a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.ui.SegmentalBodyCompositionViewModel$special$$inlined$map$2$2", f = "SegmentalBodyCompositionViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.weight.ui.v$f$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0661a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f47877a;

                /* renamed from: b  reason: collision with root package name */
                int f47878b;

                public C0661a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f47877a = obj;
                    this.f47878b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f47876a = flowCollector;
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
                    boolean r0 = r6 instanceof com.withings.weight.ui.v.f.a.C0661a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.weight.ui.v$f$a$a r0 = (com.withings.weight.ui.v.f.a.C0661a) r0
                    int r1 = r0.f47878b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f47878b = r1
                    goto L18
                L13:
                    com.withings.weight.ui.v$f$a$a r0 = new com.withings.weight.ui.v$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f47877a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f47878b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L60
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    java.util.List r5 = (java.util.List) r5
                    org.joda.time.Interval r6 = new org.joda.time.Interval
                    java.lang.Object r2 = kotlin.collections.x.I(r5)
                    com.withings.weight.ui.a r2 = (com.withings.weight.ui.a) r2
                    ky.d r2 = r2.c()
                    org.joda.time.DateTime r2 = r2.c()
                    java.lang.Object r5 = kotlin.collections.x.T(r5)
                    com.withings.weight.ui.a r5 = (com.withings.weight.ui.a) r5
                    ky.d r5 = r5.c()
                    org.joda.time.DateTime r5 = r5.c()
                    r6.<init>(r2, r5)
                    r0.f47878b = r3
                    kotlinx.coroutines.flow.FlowCollector r5 = r4.f47876a
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L60
                    return r1
                L60:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.weight.ui.v.f.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public f(SharedFlow sharedFlow) {
            this.f47875a = sharedFlow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super Interval> flowCollector, qm0.d dVar) {
            Object collect = this.f47875a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    public v(r70.c userRepository, d90.a aVar, v80.f fVar, v80.b bVar, jm.a aVar2, com.withings.weight.ui.usecase.a aVar3, iy.e measuresGroupRepositoryV2, ky.c measureListenerManagerInterface, long j5, Long l5) {
        kotlin.jvm.internal.u.j(userRepository, "userRepository");
        kotlin.jvm.internal.u.j(measuresGroupRepositoryV2, "measuresGroupRepositoryV2");
        kotlin.jvm.internal.u.j(measureListenerManagerInterface, "measureListenerManagerInterface");
        this.f47830a = userRepository;
        this.f47831b = aVar;
        this.f47832c = fVar;
        this.f47833d = bVar;
        this.f47834e = aVar2;
        this.f47835f = aVar3;
        this.f47836g = measuresGroupRepositoryV2;
        this.f47837h = measureListenerManagerInterface;
        this.f47838i = j5;
        this.f47839j = l5;
        Flow filterNotNull = FlowKt.filterNotNull(userRepository.g(j5));
        CoroutineScope a11 = h1.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharedFlow<User> shareIn = FlowKt.shareIn(filterNotNull, a11, companion.getLazily(), 1);
        this.f47840k = shareIn;
        this.f47841l = FlowKt.shareIn(new e(shareIn, this), h1.a(this), companion.getLazily(), 1);
        sm0.a<SegmentalBodyCompositionMeasureType> aVar4 = b.f47851a;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(aVar4, 10));
        Iterator it = ((kotlin.collections.c) aVar4).iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((SegmentalBodyCompositionMeasureType) it.next()).getWsIdentifier()));
        }
        Flow d11 = iy.a.d(measuresGroupRepositoryV2, measureListenerManagerInterface, j5, kotlin.collections.x.P0(arrayList), null, null, true, null, 1912);
        CoroutineScope a12 = h1.a(this);
        SharingStarted.Companion companion2 = SharingStarted.Companion;
        SharedFlow<List<ky.d>> shareIn2 = FlowKt.shareIn(d11, a12, companion2.getLazily(), 1);
        this.f47842m = shareIn2;
        SharedFlow<List<com.withings.weight.ui.a>> shareIn3 = FlowKt.shareIn(FlowKt.combine(this.f47841l, shareIn2, new c(null)), h1.a(this), companion2.getLazily(), 1);
        this.f47843n = shareIn3;
        MutableSharedFlow<z80.b> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f47844o = MutableSharedFlow$default;
        SharedFlow shareIn4 = FlowKt.shareIn(new f(shareIn3), h1.a(this), companion2.getLazily(), 1);
        this.f47845p = shareIn4;
        MutableSharedFlow<Integer> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f47846q = MutableSharedFlow$default2;
        this.f47847r = FlowKt.stateIn(FlowKt.combine(this.f47841l, shareIn3, MutableSharedFlow$default2, MutableSharedFlow$default, shareIn4, new d(null)), h1.a(this), companion2.getLazily(), i.b.f101632a);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    public final StateFlow<u90.i> A0() {
        return this.f47847r;
    }
}
