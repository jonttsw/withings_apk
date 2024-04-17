package com.withings.cycletracking.ui.viewmodel;

import android.content.Context;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.cycletracking.ui.e2;
import com.withings.graph.GraphPeriod;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.periodsbar.Period;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import dn.b;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
/* compiled from: CycleTrackingViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/cycletracking/ui/viewmodel/CycleTrackingViewModel;", "Landroidx/lifecycle/g1;", "Lpy/a;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CycleTrackingViewModel extends g1 implements py.a {
    private final SharedFlow<PredictionEvent> A;
    private final MutableSharedFlow<nm0.y> B;
    private final SharedFlow<nm0.y> F;
    private final MutableStateFlow<PredictionState> G;
    private final Flow<en.m> M;
    private final Flow<en.l> P;
    private final Flow<e2.a> Q;
    private final Flow<e2.c.C0470c> R;
    private final SharedFlow<List<b.InterfaceC0847b>> S;
    private final Flow<e2> T;

    /* renamed from: a  reason: collision with root package name */
    private final xw.b f35790a;

    /* renamed from: b  reason: collision with root package name */
    private final ym.a f35791b;

    /* renamed from: c  reason: collision with root package name */
    private final LearnMoreManager f35792c;

    /* renamed from: d  reason: collision with root package name */
    private final jm.a f35793d;

    /* renamed from: e  reason: collision with root package name */
    private final df.d f35794e;

    /* renamed from: f  reason: collision with root package name */
    private final ym.f f35795f;

    /* renamed from: g  reason: collision with root package name */
    private final xm.b f35796g;

    /* renamed from: h  reason: collision with root package name */
    private final long f35797h;

    /* renamed from: i  reason: collision with root package name */
    private final int f35798i;

    /* renamed from: j  reason: collision with root package name */
    private final MutableStateFlow<Throwable> f35799j;

    /* renamed from: k  reason: collision with root package name */
    private final StateFlow<Throwable> f35800k;

    /* renamed from: l  reason: collision with root package name */
    private final Flow<wm.j> f35801l;

    /* renamed from: m  reason: collision with root package name */
    private final Flow<fr.a> f35802m;

    /* renamed from: n  reason: collision with root package name */
    private final Flow<e2.c.b> f35803n;

    /* renamed from: o  reason: collision with root package name */
    private final gn.e f35804o;

    /* renamed from: p  reason: collision with root package name */
    private final String f35805p;

    /* renamed from: q  reason: collision with root package name */
    private final SharedFlow<e2.c.a> f35806q;

    /* renamed from: r  reason: collision with root package name */
    private final SharedFlow<List<wm.f>> f35807r;

    /* renamed from: s  reason: collision with root package name */
    private final MutableStateFlow<at.a> f35808s;

    /* renamed from: t  reason: collision with root package name */
    private final SharedFlow<List<wm.b>> f35809t;

    /* renamed from: u  reason: collision with root package name */
    private final StateFlow<en.k> f35810u;

    /* renamed from: v  reason: collision with root package name */
    private final Flow<List<wm.d>> f35811v;

    /* renamed from: w  reason: collision with root package name */
    private final Flow<List<wm.i>> f35812w;

    /* renamed from: x  reason: collision with root package name */
    private final StateFlow<en.n> f35813x;

    /* renamed from: y  reason: collision with root package name */
    private final StateFlow<en.c> f35814y;

    /* renamed from: z  reason: collision with root package name */
    private final MutableSharedFlow<PredictionEvent> f35815z;

    /* compiled from: CycleTrackingViewModel.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ sm0.a<Period> f35816a = sm0.b.a(Period.values());
    }

    /* compiled from: CycleTrackingViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingViewModel$addPeriodLogsFromStart$1", f = "CycleTrackingViewModel.kt", l = {ConstantsWs.WS_STATUS_UNKNOWN_ASSOCIATION, ConstantsWs.WS_STATUS_WRONGMFGID, ConstantsWs.WS_STATUS_WRONGCOMMIT, ConstantsWs.WS_STATUS_OAUTHWRONGTOKEN, ConstantsWs.WS_STATUS_WRONG_OLD_PASSWORD}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        e2 f35817a;

        /* renamed from: b  reason: collision with root package name */
        boolean f35818b;

        /* renamed from: c  reason: collision with root package name */
        int f35819c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f35820d;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ LocalDate f35822f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(LocalDate localDate, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f35822f = localDate;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(this.f35822f, dVar);
            bVar.f35820d = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00e7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00ad A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 371
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.cycletracking.ui.viewmodel.CycleTrackingViewModel.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CycleTrackingViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingViewModel$onPressDetected$1", f = "CycleTrackingViewModel.kt", l = {ConstantsWs.WS_STATUS_MEASDELLASTERROR}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35823a;

        c(qm0.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new c(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f35823a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                MutableSharedFlow mutableSharedFlow = CycleTrackingViewModel.this.B;
                nm0.y yVar = nm0.y.f85009a;
                this.f35823a = 1;
                if (mutableSharedFlow.emit(yVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: CycleTrackingViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingViewModel$onSwitchPinOnTop$1", f = "CycleTrackingViewModel.kt", l = {308}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35825a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f35827c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CycleTrackingViewModel.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingViewModel$onSwitchPinOnTop$1$1", f = "CycleTrackingViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<wm.j, qm0.d<? super wm.j>, Object> {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f35828a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f35829b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z5, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f35829b = z5;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                a aVar = new a(this.f35829b, dVar);
                aVar.f35828a = obj;
                return aVar;
            }

            @Override // ym0.p
            public final Object invoke(wm.j jVar, qm0.d<? super wm.j> dVar) {
                return ((a) create(jVar, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                return wm.j.a((wm.j) this.f35828a, false, this.f35829b, 1);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z5, qm0.d<? super d> dVar) {
            super(2, dVar);
            this.f35827c = z5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new d(this.f35827c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f35825a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                CycleTrackingViewModel cycleTrackingViewModel = CycleTrackingViewModel.this;
                xm.b bVar = cycleTrackingViewModel.f35796g;
                long G0 = cycleTrackingViewModel.G0();
                a aVar = new a(this.f35827c, null);
                this.f35825a = 1;
                if (bVar.a(G0, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r13v2, types: [kotlin.coroutines.jvm.internal.i, ym0.s] */
    /* JADX WARN: Type inference failed for: r13v3, types: [kotlin.coroutines.jvm.internal.i, ym0.s] */
    /* JADX WARN: Type inference failed for: r5v14, types: [kotlin.coroutines.jvm.internal.i, ym0.s] */
    /* JADX WARN: Type inference failed for: r8v1, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r8v14, types: [kotlin.coroutines.jvm.internal.i, ym0.r] */
    @Inject
    public CycleTrackingViewModel(Context context, vm.v vVar, u0 savedStateHandle, um.a aVar, vm.o oVar, xw.b dispatchers, vm.a aVar2, LearnMoreManager learnMoreManager, jm.a aVar3, df.d dVar, vm.j jVar, xm.b settingsRepository) {
        Object obj;
        GraphPeriod graphPeriod;
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.u.j(dispatchers, "dispatchers");
        kotlin.jvm.internal.u.j(settingsRepository, "settingsRepository");
        this.f35790a = dispatchers;
        this.f35791b = aVar2;
        this.f35792c = learnMoreManager;
        this.f35793d = aVar3;
        this.f35794e = dVar;
        this.f35795f = jVar;
        this.f35796g = settingsRepository;
        Long l5 = (Long) savedStateHandle.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID);
        if (l5 != null) {
            long longValue = l5.longValue();
            this.f35797h = longValue;
            Integer num = (Integer) savedStateHandle.c("period");
            if (num != null) {
                this.f35798i = num.intValue();
                MutableStateFlow<Throwable> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
                this.f35799j = MutableStateFlow;
                this.f35800k = FlowKt.asStateFlow(MutableStateFlow);
                um.i iVar = settingsRepository.get(longValue);
                um.b e11 = aVar.e(longValue);
                this.f35802m = e11;
                this.f35803n = FlowKt.flowCombine(new gn.d(e11), iVar, new kotlin.coroutines.jvm.internal.i(3, null));
                this.f35804o = new gn.e(e11);
                this.f35805p = "cycle_tracking";
                Flow flowOn = FlowKt.flowOn(FlowKt.flow(new p(this, null)), dispatchers.a());
                CoroutineScope a11 = h1.a(this);
                SharingStarted.Companion companion = SharingStarted.Companion;
                this.f35806q = FlowKt.shareIn(flowOn, a11, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
                this.f35807r = FlowKt.shareIn(FlowKt.flowOn(vVar.a(longValue), dispatchers.a()), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
                Iterator it = ((kotlin.collections.c) a.f35816a).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((Period) obj).ordinal() == this.f35798i) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Period period = (Period) obj;
                if (period != null) {
                    graphPeriod = h20.a.c(period);
                } else {
                    graphPeriod = GraphPeriod.f39502b;
                }
                DateTime withTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
                kotlin.jvm.internal.u.i(withTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                MutableStateFlow<at.a> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new at.a(graphPeriod, withTimeAtStartOfDay));
                this.f35808s = MutableStateFlow2;
                Flow<List<wm.b>> flow = aVar.get(this.f35797h);
                CoroutineScope a12 = h1.a(this);
                SharingStarted.Companion companion2 = SharingStarted.Companion;
                SharedFlow<List<wm.b>> shareIn = FlowKt.shareIn(flow, a12, companion2.getLazily(), 1);
                this.f35809t = shareIn;
                StateFlow<en.k> stateIn = FlowKt.stateIn(FlowKt.flowOn(FlowKt.mapLatest(this.f35807r, new kotlin.coroutines.jvm.internal.i(2, null)), this.f35790a.a()), h1.a(this), companion2.getEagerly(), null);
                this.f35810u = stateIn;
                Flow<List<wm.d>> c11 = oVar.c(this.f35797h);
                this.f35811v = c11;
                Flow<List<wm.i>> d11 = oVar.d(this.f35797h);
                this.f35812w = d11;
                StateFlow<en.n> stateIn2 = FlowKt.stateIn(FlowKt.flowOn(FlowKt.combine(this.f35802m, c11, d11, new s(context, null)), this.f35790a.a()), h1.a(this), companion2.getEagerly(), null);
                this.f35813x = stateIn2;
                StateFlow<en.c> stateIn3 = FlowKt.stateIn(FlowKt.flowOn(FlowKt.combine(this.f35802m, shareIn, new k(context, this, null)), this.f35790a.a()), h1.a(this), companion2.getEagerly(), null);
                this.f35814y = stateIn3;
                MutableSharedFlow<PredictionEvent> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
                this.f35815z = MutableSharedFlow$default;
                this.A = FlowKt.asSharedFlow(MutableSharedFlow$default);
                MutableSharedFlow<nm0.y> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
                this.B = MutableSharedFlow$default2;
                this.F = FlowKt.asSharedFlow(MutableSharedFlow$default2);
                MutableStateFlow<PredictionState> MutableStateFlow3 = StateFlowKt.MutableStateFlow(PredictionState.f35835a);
                this.G = MutableStateFlow3;
                Flow<en.m> combine = FlowKt.combine(MutableStateFlow3, shareIn, this.f35802m, this.f35803n, new kotlin.coroutines.jvm.internal.i(5, null));
                this.M = combine;
                Flow<en.l> combine2 = FlowKt.combine(stateIn, stateIn2, stateIn3, this.f35804o, new kotlin.coroutines.jvm.internal.i(5, null));
                this.P = combine2;
                Flow<e2.a> combine3 = FlowKt.combine(this.f35802m, shareIn, MutableStateFlow2, new kotlin.coroutines.jvm.internal.i(4, null));
                this.Q = combine3;
                Flow<e2.c.C0470c> combine4 = FlowKt.combine(combine, this.f35803n, combine2, combine3, this.f35806q, new r(null));
                this.R = combine4;
                SharedFlow<List<b.InterfaceC0847b>> shareIn2 = FlowKt.shareIn(FlowKt.flowOn(FlowKt.mapLatest(this.f35807r, new l(context, this, null)), this.f35790a.a()), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion2, 0L, 0L, 3, null), 1);
                this.S = shareIn2;
                this.T = FlowKt.combine(combine4, shareIn2, this.f35807r, MutableStateFlow3, new kotlin.coroutines.jvm.internal.i(5, null));
                BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new j(this, null), 3, null);
                return;
            }
            throw new Exception("period shouldn't be null");
        }
        throw new Exception("user id shouldn't be null");
    }

    public final SharedFlow<PredictionEvent> A0() {
        return this.A;
    }

    public final SharedFlow<nm0.y> B0() {
        return this.F;
    }

    public final Flow<e2> F0() {
        return this.T;
    }

    public final long G0() {
        return this.f35797h;
    }

    public final void K0(GraphPeriod newGraphPeriod, DateTime newDate) {
        kotlin.jvm.internal.u.j(newGraphPeriod, "newGraphPeriod");
        kotlin.jvm.internal.u.j(newDate, "newDate");
        Period a11 = newGraphPeriod.a();
        MutableStateFlow<at.a> mutableStateFlow = this.f35808s;
        if (a11 != mutableStateFlow.getValue().d().a() || !kotlin.jvm.internal.u.e(newDate, mutableStateFlow.getValue().c())) {
            b0.V(this, a11, newDate);
        }
        mutableStateFlow.getValue().i(newGraphPeriod, newDate);
    }

    public final void M0() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), this.f35790a.a(), null, new c(null), 2, null);
    }

    public final void O0(boolean z5) {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), this.f35790a.a(), null, new d(z5, null), 2, null);
    }

    @Override // py.a
    public final String getAnalyticsDetailsViewIdentifier() {
        return this.f35805p;
    }

    public final void y0(LocalDate date) {
        kotlin.jvm.internal.u.j(date, "date");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), this.f35790a.a(), null, new b(date, null), 2, null);
    }

    public final StateFlow<Throwable> z0() {
        return this.f35800k;
    }
}
