package com.withings.cycletracking.ui.viewmodel;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.cycletracking.ui.viewmodel.a;
import com.withings.cycletracking.ui.viewmodel.h;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.joda.time.LocalDate;
/* compiled from: CycleTrackingFactorEditionViewModel.kt */
/* loaded from: classes3.dex */
public final class c extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final long f35869a;

    /* renamed from: b  reason: collision with root package name */
    private final long f35870b;

    /* renamed from: c  reason: collision with root package name */
    private final xw.b f35871c;

    /* renamed from: d  reason: collision with root package name */
    private final gr.a f35872d;

    /* renamed from: e  reason: collision with root package name */
    private final xm.a f35873e;

    /* renamed from: f  reason: collision with root package name */
    private final Flow<List<fr.a>> f35874f;

    /* renamed from: g  reason: collision with root package name */
    private final gn.a f35875g;

    /* renamed from: h  reason: collision with root package name */
    private final MutableStateFlow<fr.a> f35876h;

    /* renamed from: i  reason: collision with root package name */
    private final MutableSharedFlow<com.withings.cycletracking.ui.viewmodel.a> f35877i;

    /* renamed from: j  reason: collision with root package name */
    private final SharedFlow<com.withings.cycletracking.ui.viewmodel.a> f35878j;

    /* renamed from: k  reason: collision with root package name */
    private final Flow<Integer> f35879k;

    /* renamed from: l  reason: collision with root package name */
    private final StateFlow<Object> f35880l;

    /* compiled from: CycleTrackingFactorEditionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingFactorEditionViewModel$onDeleteFactor$1", f = "CycleTrackingFactorEditionViewModel.kt", l = {106, 107}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35881a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ fr.a f35883c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(fr.a aVar, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f35883c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f35883c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f35881a;
            c cVar = c.this;
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
                xm.a aVar = cVar.f35873e;
                long y02 = cVar.y0();
                this.f35881a = 1;
                if (aVar.b(y02, this.f35883c, "deleteFromBottomSheet", this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            MutableSharedFlow mutableSharedFlow = cVar.f35877i;
            a.C0475a c0475a = a.C0475a.f35861a;
            this.f35881a = 2;
            if (mutableSharedFlow.emit(c0475a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: CycleTrackingFactorEditionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingFactorEditionViewModel$onSaveEditedFactor$1", f = "CycleTrackingFactorEditionViewModel.kt", l = {93, 99, 100}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35884a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f35885b;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ fr.a f35887d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(fr.a aVar, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f35887d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(this.f35887d, dVar);
            bVar.f35885b = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00a0 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r8 = r16
                kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r0 = r8.f35884a
                r10 = 0
                r11 = 3
                r12 = 2
                r1 = 1
                com.withings.cycletracking.ui.viewmodel.c r13 = com.withings.cycletracking.ui.viewmodel.c.this
                if (r0 == 0) goto L2c
                if (r0 == r1) goto L26
                if (r0 == r12) goto L21
                if (r0 != r11) goto L19
                nm0.l.b(r17)
                goto La1
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L21:
                nm0.l.b(r17)
                goto L90
            L26:
                nm0.l.b(r17)     // Catch: java.lang.Throwable -> L2a
                goto L78
            L2a:
                r0 = move-exception
                goto L7b
            L2c:
                nm0.l.b(r17)
                java.lang.Object r0 = r8.f35885b
                kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                fr.a r0 = r8.f35887d
                gr.a r2 = com.withings.cycletracking.ui.viewmodel.c.g0(r13)     // Catch: java.lang.Throwable -> L2a
                java.lang.Long r3 = r0.d()     // Catch: java.lang.Throwable -> L2a
                java.lang.Long r4 = r0.g()     // Catch: java.lang.Throwable -> L2a
                org.joda.time.LocalDate r5 = r0.e()     // Catch: java.lang.Throwable -> L2a
                org.joda.time.DateTime r5 = r5.toDateTimeAtStartOfDay()     // Catch: java.lang.Throwable -> L2a
                java.lang.String r6 = "toDateTimeAtStartOfDay(...)"
                kotlin.jvm.internal.u.i(r5, r6)     // Catch: java.lang.Throwable -> L2a
                long r5 = hn.a.j(r5)     // Catch: java.lang.Throwable -> L2a
                org.joda.time.LocalDate r0 = r0.c()     // Catch: java.lang.Throwable -> L2a
                if (r0 == 0) goto L68
                org.joda.time.DateTime r0 = r0.toDateTimeAtStartOfDay()     // Catch: java.lang.Throwable -> L2a
                if (r0 == 0) goto L68
                long r14 = hn.a.j(r0)     // Catch: java.lang.Throwable -> L2a
                java.lang.Long r0 = new java.lang.Long     // Catch: java.lang.Throwable -> L2a
                r0.<init>(r14)     // Catch: java.lang.Throwable -> L2a
                goto L69
            L68:
                r0 = r10
            L69:
                r8.f35884a = r1     // Catch: java.lang.Throwable -> L2a
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r0
                r7 = r16
                java.lang.Object r0 = r1.a(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L2a
                if (r0 != r9) goto L78
                return r9
            L78:
                nm0.y r0 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L2a
                goto L7f
            L7b:
                nm0.k$a r0 = nm0.l.a(r0)
            L7f:
                java.lang.Throwable r1 = nm0.k.b(r0)
                if (r1 == 0) goto L90
                r8.f35885b = r0
                r8.f35884a = r12
                java.lang.Object r0 = com.withings.cycletracking.ui.viewmodel.c.p0(r13, r1, r8)
                if (r0 != r9) goto L90
                return r9
            L90:
                kotlinx.coroutines.flow.MutableSharedFlow r0 = com.withings.cycletracking.ui.viewmodel.c.m0(r13)
                com.withings.cycletracking.ui.viewmodel.a$a r1 = com.withings.cycletracking.ui.viewmodel.a.C0475a.f35861a
                r8.f35885b = r10
                r8.f35884a = r11
                java.lang.Object r0 = r0.emit(r1, r8)
                if (r0 != r9) goto La1
                return r9
            La1:
                nm0.y r0 = nm0.y.f85009a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.cycletracking.ui.viewmodel.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r10v2, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    public c(long j5, long j11, xw.b dispatchers, gr.a factorRepository, um.a aVar) {
        kotlin.jvm.internal.u.j(dispatchers, "dispatchers");
        kotlin.jvm.internal.u.j(factorRepository, "factorRepository");
        this.f35869a = j5;
        this.f35870b = j11;
        this.f35871c = dispatchers;
        this.f35872d = factorRepository;
        this.f35873e = aVar;
        gr.b notDeleted = factorRepository.getNotDeleted(j5);
        this.f35874f = notDeleted;
        this.f35875g = new gn.a(notDeleted, this);
        MutableStateFlow<fr.a> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f35876h = MutableStateFlow;
        MutableSharedFlow<com.withings.cycletracking.ui.viewmodel.a> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35877i = MutableSharedFlow$default;
        this.f35878j = FlowKt.asSharedFlow(MutableSharedFlow$default);
        Flow<Integer> combine = FlowKt.combine(w70.b.c(), MutableStateFlow, new kotlin.coroutines.jvm.internal.i(3, null));
        this.f35879k = combine;
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), dispatchers.a(), null, new com.withings.cycletracking.ui.viewmodel.b(this, null), 2, null);
        this.f35880l = FlowKt.stateIn(FlowKt.flowOn(FlowKt.combine(MutableStateFlow, combine, new kotlin.coroutines.jvm.internal.i(3, null)), Dispatchers.getIO()), h1.a(this), SharingStarted.Companion.getEagerly(), h.b.f35899a);
    }

    public static final Object p0(c cVar, Throwable th2, qm0.d dVar) {
        CycleTrackingConflictingDateException cycleTrackingConflictingDateException;
        com.withings.cycletracking.ui.viewmodel.a cVar2;
        cVar.getClass();
        x70.b.n(th2);
        if (th2 instanceof CycleTrackingConflictingDateException) {
            cycleTrackingConflictingDateException = (CycleTrackingConflictingDateException) th2;
        } else {
            cycleTrackingConflictingDateException = null;
        }
        if (cycleTrackingConflictingDateException != null) {
            cVar2 = new a.b(cycleTrackingConflictingDateException.b(), cycleTrackingConflictingDateException.a());
        } else {
            cVar2 = new a.c();
        }
        Object emit = cVar.f35877i.emit(cVar2, dVar);
        if (emit != CoroutineSingletons.f76214a) {
            return nm0.y.f85009a;
        }
        return emit;
    }

    public final void A0(LocalDate date) {
        kotlin.jvm.internal.u.j(date, "date");
        fr.a value = this.f35876h.getValue();
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), this.f35871c.a(), null, new d(this, fr.a.a(value, null, date, 95), null), 2, null);
        }
    }

    public final void B0(fr.a aVar) {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), this.f35871c.a(), null, new b(aVar, null), 2, null);
    }

    public final void F0(LocalDate date) {
        kotlin.jvm.internal.u.j(date, "date");
        fr.a value = this.f35876h.getValue();
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), this.f35871c.a(), null, new d(this, fr.a.a(value, date, null, 111), null), 2, null);
        }
    }

    public final SharedFlow<com.withings.cycletracking.ui.viewmodel.a> q0() {
        return this.f35878j;
    }

    public final long r0() {
        return this.f35870b;
    }

    public final StateFlow<Object> t0() {
        return this.f35880l;
    }

    public final long y0() {
        return this.f35869a;
    }

    public final void z0(fr.a aVar) {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), this.f35871c.a(), null, new a(aVar, null), 2, null);
    }
}
