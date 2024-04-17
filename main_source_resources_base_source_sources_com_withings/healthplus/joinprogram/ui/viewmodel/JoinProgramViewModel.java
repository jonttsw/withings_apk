package com.withings.healthplus.joinprogram.ui.viewmodel;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import vu.a;
import ym0.p;
import ym0.r;
import zu.a;
/* compiled from: JoinProgramViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/healthplus/joinprogram/ui/viewmodel/JoinProgramViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class JoinProgramViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final xu.a f40375a;

    /* renamed from: b  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f40376b;

    /* renamed from: c  reason: collision with root package name */
    private final MutableStateFlow<vu.a> f40377c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableStateFlow<DateTime> f40378d;

    /* renamed from: e  reason: collision with root package name */
    private final StateFlow<zu.a> f40379e;

    /* compiled from: JoinProgramViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel$joinProgramState$1", f = "JoinProgramViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends i implements r<Boolean, vu.a, DateTime, qm0.d<? super zu.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ boolean f40380a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ vu.a f40381b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ DateTime f40382c;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel$a, kotlin.coroutines.jvm.internal.i] */
        @Override // ym0.r
        public final Object invoke(Boolean bool, vu.a aVar, DateTime dateTime, qm0.d<? super zu.a> dVar) {
            boolean booleanValue = bool.booleanValue();
            ?? iVar = new i(4, dVar);
            iVar.f40380a = booleanValue;
            iVar.f40381b = aVar;
            iVar.f40382c = dateTime;
            return iVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            boolean z5 = this.f40380a;
            vu.a aVar = this.f40381b;
            DateTime dateTime = this.f40382c;
            if (dateTime != null) {
                if (z5) {
                    return new a.e(dateTime);
                }
                if (aVar != null) {
                    if (aVar instanceof a.C1782a) {
                        return new a.d(dateTime, ((a.C1782a) aVar).a());
                    }
                    if (aVar instanceof a.c) {
                        return new a.c.b(dateTime);
                    }
                    if (aVar instanceof a.b) {
                        return new a.c.C1979a(dateTime);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return new a.C1978a(dateTime);
            }
            return a.b.f111041a;
        }
    }

    /* compiled from: JoinProgramViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel$joinProgramState$2", f = "JoinProgramViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends i implements p<zu.a, qm0.d<? super zu.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f40383a;

        b() {
            throw null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel$b, kotlin.coroutines.jvm.internal.i, qm0.d<nm0.y>] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            ?? iVar = new i(2, dVar);
            iVar.f40383a = obj;
            return iVar;
        }

        @Override // ym0.p
        public final Object invoke(zu.a aVar, qm0.d<? super zu.a> dVar) {
            return ((b) create(aVar, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            return (zu.a) this.f40383a;
        }
    }

    /* compiled from: JoinProgramViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel$onJoinProgramAction$1", f = "JoinProgramViewModel.kt", l = {106, 108, 117}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class c extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40384a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f40386c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f40387d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f40388e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: JoinProgramViewModel.kt */
        /* loaded from: classes3.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ JoinProgramViewModel f40389a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: JoinProgramViewModel.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel$onJoinProgramAction$1$2", f = "JoinProgramViewModel.kt", l = {118, 119}, m = "emit")
            /* renamed from: com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0534a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                Object f40390a;

                /* renamed from: b  reason: collision with root package name */
                /* synthetic */ Object f40391b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ a<T> f40392c;

                /* renamed from: d  reason: collision with root package name */
                int f40393d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0534a(a<? super T> aVar, qm0.d<? super C0534a> dVar) {
                    super(dVar);
                    this.f40392c = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f40391b = obj;
                    this.f40393d |= Integer.MIN_VALUE;
                    return this.f40392c.emit(null, this);
                }
            }

            a(JoinProgramViewModel joinProgramViewModel) {
                this.f40389a = joinProgramViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(vu.a r6, qm0.d<? super nm0.y> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel.c.a.C0534a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel$c$a$a r0 = (com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel.c.a.C0534a) r0
                    int r1 = r0.f40393d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f40393d = r1
                    goto L18
                L13:
                    com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel$c$a$a r0 = new com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel$c$a$a
                    r0.<init>(r5, r7)
                L18:
                    java.lang.Object r7 = r0.f40391b
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f40393d
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3a
                    if (r2 == r4) goto L32
                    if (r2 != r3) goto L2a
                    nm0.l.b(r7)
                    goto L63
                L2a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L32:
                    java.lang.Object r6 = r0.f40390a
                    com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel$c$a r6 = (com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel.c.a) r6
                    nm0.l.b(r7)
                    goto L4f
                L3a:
                    nm0.l.b(r7)
                    com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel r7 = r5.f40389a
                    kotlinx.coroutines.flow.MutableStateFlow r7 = com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel.g0(r7)
                    r0.f40390a = r5
                    r0.f40393d = r4
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L4e
                    return r1
                L4e:
                    r6 = r5
                L4f:
                    com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel r6 = r6.f40389a
                    kotlinx.coroutines.flow.MutableStateFlow r6 = com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel.j0(r6)
                    java.lang.Boolean r7 = java.lang.Boolean.FALSE
                    r2 = 0
                    r0.f40390a = r2
                    r0.f40393d = r3
                    java.lang.Object r6 = r6.emit(r7, r0)
                    if (r6 != r1) goto L63
                    return r1
                L63:
                    nm0.y r6 = nm0.y.f85009a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel.c.a.emit(vu.a, qm0.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j5, int i11, boolean z5, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f40386c = j5;
            this.f40387d = i11;
            this.f40388e = z5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f40386c, this.f40387d, this.f40388e, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x007e A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r13.f40384a
                r2 = 3
                r3 = 2
                r4 = 1
                com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel r5 = com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel.this
                if (r1 == 0) goto L26
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                nm0.l.b(r14)
                goto L7f
            L16:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1e:
                nm0.l.b(r14)
                goto L6f
            L22:
                nm0.l.b(r14)
                goto L38
            L26:
                nm0.l.b(r14)
                kotlinx.coroutines.flow.MutableStateFlow r14 = com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel.j0(r5)
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r13.f40384a = r4
                java.lang.Object r14 = r14.emit(r1, r13)
                if (r14 != r0) goto L38
                return r0
            L38:
                xu.a r6 = com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel.f0(r5)
                kotlinx.coroutines.flow.MutableStateFlow r14 = com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel.i0(r5)
                java.lang.Object r14 = r14.getValue()
                org.joda.time.DateTime r14 = (org.joda.time.DateTime) r14
                r1 = 0
                if (r14 == 0) goto L5e
                boolean r4 = r14.isAfterNow()
                if (r4 == 0) goto L50
                goto L51
            L50:
                r14 = r1
            L51:
                if (r14 == 0) goto L5e
                long r7 = androidx.activity.b0.w(r14)
                java.lang.Long r14 = new java.lang.Long
                r14.<init>(r7)
                r11 = r14
                goto L5f
            L5e:
                r11 = r1
            L5f:
                r13.f40384a = r3
                long r7 = r13.f40386c
                int r9 = r13.f40387d
                boolean r10 = r13.f40388e
                r12 = r13
                java.lang.Object r14 = r6.a(r7, r9, r10, r11, r12)
                if (r14 != r0) goto L6f
                return r0
            L6f:
                kotlinx.coroutines.flow.Flow r14 = (kotlinx.coroutines.flow.Flow) r14
                com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel$c$a r1 = new com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel$c$a
                r1.<init>(r5)
                r13.f40384a = r2
                java.lang.Object r14 = r14.collect(r1, r13)
                if (r14 != r0) goto L7f
                return r0
            L7f:
                nm0.y r14 = nm0.y.f85009a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: JoinProgramViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel$onSelectedStartDateChange$1", f = "JoinProgramViewModel.kt", l = {95}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class d extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40394a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DateTime f40396c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(DateTime dateTime, qm0.d<? super d> dVar) {
            super(2, dVar);
            this.f40396c = dateTime;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new d(this.f40396c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f40394a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                MutableStateFlow mutableStateFlow = JoinProgramViewModel.this.f40378d;
                this.f40394a = 1;
                if (mutableStateFlow.emit(this.f40396c, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: JoinProgramViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.healthplus.joinprogram.ui.viewmodel.JoinProgramViewModel$setDefaultState$1", f = "JoinProgramViewModel.kt", l = {85, 86}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class e extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40397a;

        e(qm0.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new e(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f40397a;
            JoinProgramViewModel joinProgramViewModel = JoinProgramViewModel.this;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        l.b(obj);
                        return y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l.b(obj);
            } else {
                l.b(obj);
                MutableStateFlow mutableStateFlow = joinProgramViewModel.f40376b;
                Boolean bool = Boolean.FALSE;
                this.f40397a = 1;
                if (mutableStateFlow.emit(bool, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            MutableStateFlow mutableStateFlow2 = joinProgramViewModel.f40377c;
            this.f40397a = 2;
            if (mutableStateFlow2.emit(null, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return y.f85009a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.jvm.internal.i, ym0.r] */
    @Inject
    public JoinProgramViewModel(xu.a aVar) {
        this.f40375a = aVar;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f40376b = MutableStateFlow;
        MutableStateFlow<vu.a> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.f40377c = MutableStateFlow2;
        MutableStateFlow<DateTime> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.f40378d = MutableStateFlow3;
        this.f40379e = FlowKt.stateIn(FlowKt.mapLatest(FlowKt.combine(MutableStateFlow, MutableStateFlow2, MutableStateFlow3, new i(4, null)), new i(2, null)), h1.a(this), SharingStarted.Companion.getLazily(), a.b.f111041a);
    }

    public final StateFlow<zu.a> k0() {
        return this.f40379e;
    }

    public final void m0(long j5, int i11, boolean z5) {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new c(j5, i11, z5, null), 3, null);
    }

    public final void p0(DateTime startDate) {
        u.j(startDate, "startDate");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new d(startDate, null), 3, null);
    }

    public final void q0() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new e(null), 3, null);
    }
}
