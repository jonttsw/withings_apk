package com.withings.healthplus.programdetail.ui.viewmodel;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.withings.favorite.model.Favorite;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.programs.model.program.ProgramDomain;
import com.withings.survey.ui.InAppSurveyActivity;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.y;
import org.joda.time.DateTime;
import rv.e;
import ym0.l;
import ym0.p;
import ym0.q;
/* compiled from: ProgramDetailViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/healthplus/programdetail/ui/viewmodel/ProgramDetailViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ProgramDetailViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final v30.a f40461a;

    /* renamed from: b  reason: collision with root package name */
    private final long f40462b;

    /* renamed from: c  reason: collision with root package name */
    private final long f40463c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f40464d;

    /* renamed from: e  reason: collision with root package name */
    private final MutableStateFlow<Integer> f40465e;

    /* renamed from: f  reason: collision with root package name */
    private final StateFlow<Integer> f40466f;

    /* renamed from: g  reason: collision with root package name */
    private final Flow<ProgramDomain.WifitDomain> f40467g;

    /* renamed from: h  reason: collision with root package name */
    private final StateFlow<rv.e> f40468h;

    /* compiled from: ProgramDetailViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel$cancelProgram$1", f = "ProgramDetailViewModel.kt", l = {102}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40469a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l<Boolean, y> f40471c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProgramDetailViewModel.kt */
        /* renamed from: com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0538a extends w implements l<Boolean, y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l<Boolean, y> f40472a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0538a(l<? super Boolean, y> lVar) {
                super(1);
                this.f40472a = lVar;
            }

            @Override // ym0.l
            public final y invoke(Boolean bool) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                this.f40472a.invoke(bool2);
                return y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(l<? super Boolean, y> lVar, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f40471c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f40471c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f40469a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                ProgramDetailViewModel programDetailViewModel = ProgramDetailViewModel.this;
                C0538a c0538a = new C0538a(this.f40471c);
                this.f40469a = 1;
                if (programDetailViewModel.f40461a.a(programDetailViewModel.r0(), (int) programDetailViewModel.k0(), c0538a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProgramDetailViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class b extends w implements l<Favorite, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f40473a = new w(1);

        @Override // ym0.l
        public final Boolean invoke(Favorite favorite) {
            Favorite it = favorite;
            u.j(it, "it");
            return Boolean.valueOf(it.isSelected());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProgramDetailViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class c extends w implements l<Favorite, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f40474a = new w(1);

        @Override // ym0.l
        public final String invoke(Favorite favorite) {
            Favorite it = favorite;
            u.j(it, "it");
            return it.getRemoteTaskId();
        }
    }

    /* compiled from: ProgramDetailViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel$onProgramJoined$1", f = "ProgramDetailViewModel.kt", l = {113}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class d extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40475a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40477c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11, qm0.d<? super d> dVar) {
            super(2, dVar);
            this.f40477c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new d(this.f40477c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f40475a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                MutableStateFlow mutableStateFlow = ProgramDetailViewModel.this.f40465e;
                Integer num = new Integer(this.f40477c);
                this.f40475a = 1;
                if (mutableStateFlow.emit(num, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: Merge.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel$special$$inlined$flatMapLatest$1", f = "ProgramDetailViewModel.kt", l = {193}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends i implements q<FlowCollector<? super ProgramDomain>, Integer, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40478a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ FlowCollector f40479b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f40480c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v30.f f40481d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ProgramDetailViewModel f40482e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(qm0.d dVar, v30.f fVar, ProgramDetailViewModel programDetailViewModel) {
            super(3, dVar);
            this.f40481d = fVar;
            this.f40482e = programDetailViewModel;
        }

        @Override // ym0.q
        public final Object invoke(FlowCollector<? super ProgramDomain> flowCollector, Integer num, qm0.d<? super y> dVar) {
            e eVar = new e(dVar, this.f40481d, this.f40482e);
            eVar.f40479b = flowCollector;
            eVar.f40480c = num;
            return eVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f40478a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                FlowCollector flowCollector = this.f40479b;
                int intValue = ((Number) this.f40480c).intValue();
                ProgramDetailViewModel programDetailViewModel = this.f40482e;
                Flow b10 = this.f40481d.b(intValue, programDetailViewModel.k0(), true, programDetailViewModel.r0());
                this.f40478a = 1;
                if (FlowKt.emitAll(flowCollector, b10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes3.dex */
    public static final class f implements Flow<ProgramDomain.WifitDomain> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f40483a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes3.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f40484a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel$special$$inlined$map$1$2", f = "ProgramDetailViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel$f$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0539a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f40485a;

                /* renamed from: b  reason: collision with root package name */
                int f40486b;

                public C0539a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f40485a = obj;
                    this.f40486b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f40484a = flowCollector;
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
                    boolean r0 = r6 instanceof com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel.f.a.C0539a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel$f$a$a r0 = (com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel.f.a.C0539a) r0
                    int r1 = r0.f40486b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f40486b = r1
                    goto L18
                L13:
                    com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel$f$a$a r0 = new com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f40485a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f40486b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L47
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    com.withings.programs.model.program.ProgramDomain r5 = (com.withings.programs.model.program.ProgramDomain) r5
                    boolean r6 = r5 instanceof com.withings.programs.model.program.ProgramDomain.WifitDomain
                    if (r6 == 0) goto L3b
                    com.withings.programs.model.program.ProgramDomain$WifitDomain r5 = (com.withings.programs.model.program.ProgramDomain.WifitDomain) r5
                    goto L3c
                L3b:
                    r5 = 0
                L3c:
                    r0.f40486b = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f40484a
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel.f.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public f(Flow flow) {
            this.f40483a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super ProgramDomain.WifitDomain> flowCollector, qm0.d dVar) {
            Object collect = this.f40483a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes3.dex */
    public static final class g implements Flow<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f40488a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes3.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f40489a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel$special$$inlined$map$2$2", f = "ProgramDetailViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0540a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f40490a;

                /* renamed from: b  reason: collision with root package name */
                int f40491b;

                public C0540a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f40490a = obj;
                    this.f40491b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f40489a = flowCollector;
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
                    boolean r0 = r6 instanceof com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel.g.a.C0540a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel$g$a$a r0 = (com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel.g.a.C0540a) r0
                    int r1 = r0.f40491b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f40491b = r1
                    goto L18
                L13:
                    com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel$g$a$a r0 = new com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel$g$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f40490a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f40491b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L55
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    java.util.List r5 = (java.util.List) r5
                    java.lang.Iterable r5 = (java.lang.Iterable) r5
                    kotlin.collections.d0 r5 = kotlin.collections.x.t(r5)
                    com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel$b r6 = com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel.b.f40473a
                    cp0.g r5 = cp0.n.h(r5, r6)
                    com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel$c r6 = com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel.c.f40474a
                    cp0.j0 r5 = cp0.n.t(r5, r6)
                    java.util.List r5 = cp0.n.A(r5)
                    r0.f40491b = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f40489a
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L55
                    return r1
                L55:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel.g.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public g(nr.b bVar) {
            this.f40488a = bVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super List<? extends String>> flowCollector, qm0.d dVar) {
            Object collect = this.f40488a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    /* compiled from: ProgramDetailViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.healthplus.programdetail.ui.viewmodel.ProgramDetailViewModel$state$1", f = "ProgramDetailViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class h extends i implements q<ProgramDomain.WifitDomain, List<? extends String>, qm0.d<? super e.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ ProgramDomain.WifitDomain f40493a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ List f40494b;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ni.a f40496d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f40497e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ni.a aVar, Context context, qm0.d<? super h> dVar) {
            super(3, dVar);
            this.f40496d = aVar;
            this.f40497e = context;
        }

        @Override // ym0.q
        public final Object invoke(ProgramDomain.WifitDomain wifitDomain, List<? extends String> list, qm0.d<? super e.a> dVar) {
            h hVar = new h(this.f40496d, this.f40497e, dVar);
            hVar.f40493a = wifitDomain;
            hVar.f40494b = list;
            return hVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Integer num;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            List<ii.b> a11 = this.f40496d.a().a();
            rv.c a12 = qv.a.a(this.f40493a, this.f40497e, a11, this.f40494b);
            ProgramDetailViewModel.this.getClass();
            rv.a d11 = a12.d();
            if (d11 != null) {
                num = Integer.valueOf(d11.a());
            } else {
                num = null;
            }
            if (num != null && num.intValue() < 0) {
                return new e.a.b(a12.a(), a12.d(), a12.e(), a12.f(), a12.g(), a12.l(), a12.i(), a12.j(), a12.k(), Math.abs(num.intValue()));
            }
            boolean b10 = a12.b();
            boolean c11 = a12.c();
            String a13 = a12.a();
            rv.a d12 = a12.d();
            String e11 = a12.e();
            List<rv.b> f11 = a12.f();
            String g11 = a12.g();
            boolean l5 = a12.l();
            s10.d h11 = a12.h();
            DateTime i11 = a12.i();
            return new e.a.C1592a(d12, h11, a13, e11, g11, a12.k(), f11, a12.j(), i11, l5, b10, c11);
        }
    }

    @Inject
    public ProgramDetailViewModel(Context context, ni.a aVar, v30.f getDetailedProgramByIdUseCase, or.g gVar, u0 savedStateHandle, v30.a aVar2) {
        boolean z5;
        u.j(getDetailedProgramByIdUseCase, "getDetailedProgramByIdUseCase");
        u.j(savedStateHandle, "savedStateHandle");
        this.f40461a = aVar2;
        Long l5 = (Long) savedStateHandle.c(NavigationArguments.USER_ID);
        if (l5 != null) {
            this.f40462b = l5.longValue();
            Long l6 = (Long) savedStateHandle.c(NavigationArguments.PROGRAM_ID);
            if (l6 != null) {
                this.f40463c = l6.longValue();
                Boolean bool = (Boolean) savedStateHandle.c(NavigationArguments.SHOULD_DISPLAY_DAYS_BEFORE_START_TOAST);
                if (bool != null) {
                    z5 = bool.booleanValue();
                } else {
                    z5 = false;
                }
                this.f40464d = z5;
                Integer num = (Integer) savedStateHandle.c(NavigationArguments.INSTANCE_ID);
                if (num != null) {
                    MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(num);
                    this.f40465e = MutableStateFlow;
                    this.f40466f = FlowKt.asStateFlow(MutableStateFlow);
                    Flow<ProgramDomain.WifitDomain> filterNotNull = FlowKt.filterNotNull(new f(FlowKt.transformLatest(MutableStateFlow, new e(null, getDetailedProgramByIdUseCase, this))));
                    this.f40467g = filterNotNull;
                    this.f40468h = FlowKt.stateIn(FlowKt.combine(filterNotNull, new g(gVar.a()), new h(aVar, context, null)), h1.a(this), SharingStarted.Companion.getLazily(), e.b.f95785a);
                    return;
                }
                throw new Exception("instanceId shouldn't be null");
            }
            throw new Exception("programId shouldn't be null");
        }
        throw new Exception("userId shouldn't be null");
    }

    public final void i0(l<? super Boolean, y> onCompletion) {
        u.j(onCompletion, "onCompletion");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(onCompletion, null), 2, null);
    }

    public final Intent j0(Context context) {
        u.j(context, "context");
        int i11 = InAppSurveyActivity.f44288f;
        return InAppSurveyActivity.a.a(context, "4835", this.f40462b);
    }

    public final long k0() {
        return this.f40463c;
    }

    public final StateFlow<Integer> m0() {
        return this.f40466f;
    }

    public final boolean p0() {
        return this.f40464d;
    }

    public final StateFlow<rv.e> q0() {
        return this.f40468h;
    }

    public final long r0() {
        return this.f40462b;
    }

    public final void t0(int i11) {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new d(i11, null), 3, null);
    }
}
