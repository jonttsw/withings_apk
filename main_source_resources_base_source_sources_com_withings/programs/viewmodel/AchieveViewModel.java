package com.withings.programs.viewmodel;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.programs.model.AchieveTabState;
import com.withings.programs.model.MadeForYouLibraryUi;
import com.withings.programs.model.goal.HealthGoalHeaderUi;
import com.withings.programs.model.program.ProgramDomain;
import com.withings.programs.model.programpreview.ProgramPreviewUi;
import com.withings.programs.model.programpreview.ProgramPreviewUiMappingKt;
import com.withings.user.User;
import cp0.e0;
import cp0.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__BuildersKt;
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
import l70.u;
import l70.w;
import n20.h;
import nm0.y;
import org.joda.time.DateTime;
import ym0.p;
/* compiled from: AchieveViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/programs/viewmodel/AchieveViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AchieveViewModel extends g1 {
    private final SharedFlow<y> A;

    /* renamed from: a  reason: collision with root package name */
    private final n90.h f43770a;

    /* renamed from: b  reason: collision with root package name */
    private final ni.a f43771b;

    /* renamed from: c  reason: collision with root package name */
    private final u30.b f43772c;

    /* renamed from: d  reason: collision with root package name */
    private final ch.d f43773d;

    /* renamed from: e  reason: collision with root package name */
    private final m70.i f43774e;

    /* renamed from: f  reason: collision with root package name */
    private final mv.f f43775f;

    /* renamed from: g  reason: collision with root package name */
    private final w f43776g;

    /* renamed from: h  reason: collision with root package name */
    private final User f43777h;

    /* renamed from: i  reason: collision with root package name */
    private final StateFlow<n20.h> f43778i;

    /* renamed from: j  reason: collision with root package name */
    private final x30.b f43779j;

    /* renamed from: k  reason: collision with root package name */
    private final MutableStateFlow<List<ProgramPreviewUi.OnGoing>> f43780k;

    /* renamed from: l  reason: collision with root package name */
    private final MutableStateFlow f43781l;

    /* renamed from: m  reason: collision with root package name */
    private final MutableStateFlow<Map<String, List<ProgramPreviewUi.Discover>>> f43782m;

    /* renamed from: n  reason: collision with root package name */
    private final MutableStateFlow f43783n;

    /* renamed from: o  reason: collision with root package name */
    private final MutableStateFlow<List<MadeForYouLibraryUi>> f43784o;

    /* renamed from: p  reason: collision with root package name */
    private final MutableStateFlow<List<ProgramPreviewUi.Discover>> f43785p;

    /* renamed from: q  reason: collision with root package name */
    private final MutableStateFlow f43786q;

    /* renamed from: r  reason: collision with root package name */
    private final MutableStateFlow<List<ProgramPreviewUi.Discover>> f43787r;

    /* renamed from: s  reason: collision with root package name */
    private final MutableStateFlow f43788s;

    /* renamed from: t  reason: collision with root package name */
    private final MutableStateFlow<List<ProgramPreviewUi.Planned>> f43789t;

    /* renamed from: u  reason: collision with root package name */
    private final MutableStateFlow f43790u;

    /* renamed from: v  reason: collision with root package name */
    private final pm0.b f43791v;

    /* renamed from: w  reason: collision with root package name */
    private final SharedFlow<u> f43792w;

    /* renamed from: x  reason: collision with root package name */
    private final StateFlow<HealthGoalHeaderUi> f43793x;

    /* renamed from: y  reason: collision with root package name */
    private final MutableStateFlow<AchieveTabState> f43794y;

    /* renamed from: z  reason: collision with root package name */
    private final MutableSharedFlow<y> f43795z;

    /* compiled from: AchieveViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.programs.viewmodel.AchieveViewModel$getLegacyProgramIntent$1", f = "AchieveViewModel.kt", l = {ConstantsWs.WS_STATUS_INVALID_CONSUMABLE_HEADER}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super Intent>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f43796a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f43798c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f43799d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, int i11, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f43798c = context;
            this.f43799d = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f43798c, this.f43799d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Intent> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f43796a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                AchieveViewModel achieveViewModel = AchieveViewModel.this;
                u30.b bVar = achieveViewModel.f43772c;
                long X0 = achieveViewModel.X0();
                this.f43796a = 1;
                obj = bVar.a(this.f43798c, X0, this.f43799d, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return obj;
        }
    }

    /* compiled from: AchieveViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.programs.viewmodel.AchieveViewModel$scrollToTop$1", f = "AchieveViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_EDA_LEFT_FOOT}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f43800a;

        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f43800a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                MutableSharedFlow mutableSharedFlow = AchieveViewModel.this.f43795z;
                y yVar = y.f85009a;
                this.f43800a = 1;
                if (mutableSharedFlow.emit(yVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    @Inject
    public AchieveViewModel(Context context, xw.b dispatchers, x30.c getAllProgramsByUserUseCase, es.c cVar, u0 savedStateHandle, n20.b bVar, n90.h hVar, ni.a aVar, u30.b bVar2, ch.d intentBuilder, m70.i userManager, mv.f fVar, w unitPreferencesRepository) {
        Map map;
        kotlin.jvm.internal.u.j(dispatchers, "dispatchers");
        kotlin.jvm.internal.u.j(getAllProgramsByUserUseCase, "getAllProgramsByUserUseCase");
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        kotlin.jvm.internal.u.j(unitPreferencesRepository, "unitPreferencesRepository");
        this.f43770a = hVar;
        this.f43771b = aVar;
        this.f43772c = bVar2;
        this.f43773d = intentBuilder;
        this.f43774e = userManager;
        this.f43775f = fVar;
        this.f43776g = unitPreferencesRepository;
        User user = (User) savedStateHandle.c(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        if (user != null) {
            this.f43777h = user;
            Flow<n20.h> a11 = bVar.a();
            CoroutineScope a12 = h1.a(this);
            SharingStarted.Companion companion = SharingStarted.Companion;
            this.f43778i = FlowKt.stateIn(a11, a12, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), h.b.f83019a);
            this.f43779j = getAllProgramsByUserUseCase.a(user.q());
            i0 i0Var = i0.f76187a;
            MutableStateFlow<List<ProgramPreviewUi.OnGoing>> MutableStateFlow = StateFlowKt.MutableStateFlow(i0Var);
            this.f43780k = MutableStateFlow;
            this.f43781l = MutableStateFlow;
            map = j0.f76190a;
            MutableStateFlow<Map<String, List<ProgramPreviewUi.Discover>>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(map);
            this.f43782m = MutableStateFlow2;
            this.f43783n = MutableStateFlow2;
            this.f43784o = StateFlowKt.MutableStateFlow(i0Var);
            MutableStateFlow<List<ProgramPreviewUi.Discover>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(i0Var);
            this.f43785p = MutableStateFlow3;
            this.f43786q = MutableStateFlow3;
            MutableStateFlow<List<ProgramPreviewUi.Discover>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(i0Var);
            this.f43787r = MutableStateFlow4;
            this.f43788s = MutableStateFlow4;
            MutableStateFlow<List<ProgramPreviewUi.Planned>> MutableStateFlow5 = StateFlowKt.MutableStateFlow(i0Var);
            this.f43789t = MutableStateFlow5;
            this.f43790u = MutableStateFlow5;
            this.f43791v = pm0.a.a(c.f43827a, d.f43828a, e.f43829a);
            SharedFlow<u> shareIn = FlowKt.shareIn(new c40.c(new om.b(context, unitPreferencesRepository, userManager).a(user.q())), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
            this.f43792w = shareIn;
            DateTime now = DateTime.now();
            kotlin.jvm.internal.u.i(now, "now(...)");
            this.f43793x = FlowKt.stateIn(FlowKt.combine(cVar.b(hn.a.q(now), new int[]{1}, user.q()), shareIn, new m(this, null)), h1.a(this), companion.getEagerly(), null);
            this.f43794y = StateFlowKt.MutableStateFlow(new AchieveTabState.ProgramTab(0, 1, null));
            MutableSharedFlow<y> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
            this.f43795z = MutableSharedFlow$default;
            this.A = FlowKt.asSharedFlow(MutableSharedFlow$default);
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), dispatchers.a(), null, new com.withings.programs.viewmodel.a(this, null), 2, null);
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new com.withings.programs.viewmodel.b(this, null), 3, null);
            return;
        }
        throw new Exception("user shouldn't be null");
    }

    public static final Object f0(List list, AchieveViewModel achieveViewModel, qm0.d dVar) {
        e0 y11 = n.y(n.u(n.h(x.t(list), f.f43830a), new g(achieveViewModel)), achieveViewModel.f43791v);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Object> it = y11.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String section = ((ProgramPreviewUi.Discover) next).getSection();
            Object obj = linkedHashMap.get(section);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(section, obj);
            }
            ((List) obj).add(next);
        }
        Object emit = achieveViewModel.f43782m.emit(linkedHashMap, dVar);
        if (emit != CoroutineSingletons.f76214a) {
            return y.f85009a;
        }
        return emit;
    }

    public static final Object g0(List list, AchieveViewModel achieveViewModel, qm0.d dVar) {
        Object emit = achieveViewModel.f43787r.emit(n.A(n.y(n.u(n.h(x.t(list), h.f43832a), new i(achieveViewModel)), achieveViewModel.f43791v)), dVar);
        if (emit != CoroutineSingletons.f76214a) {
            return y.f85009a;
        }
        return emit;
    }

    public static final Object i0(List list, AchieveViewModel achieveViewModel, qm0.d dVar) {
        Object emit = achieveViewModel.f43785p.emit(n.A(n.y(n.u(n.h(x.t(list), j.f43834a), new k(achieveViewModel)), achieveViewModel.f43791v)), dVar);
        if (emit != CoroutineSingletons.f76214a) {
            return y.f85009a;
        }
        return emit;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Comparator] */
    public static final Object j0(ArrayList arrayList, AchieveViewModel achieveViewModel, qm0.d dVar) {
        ProgramPreviewUi.OnGoing onGoing;
        ArrayList arrayList2 = new ArrayList();
        for (ProgramDomain programDomain : x.D0(arrayList, new Object())) {
            ProgramPreviewUi previewUiItem = ProgramPreviewUiMappingKt.toPreviewUiItem(programDomain, achieveViewModel.f43771b.a());
            if (previewUiItem instanceof ProgramPreviewUi.OnGoing) {
                onGoing = (ProgramPreviewUi.OnGoing) previewUiItem;
            } else {
                onGoing = null;
            }
            if (onGoing != null) {
                arrayList2.add(onGoing);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ProgramPreviewUi.OnGoing) next).getProgramId() != 38) {
                arrayList3.add(next);
            }
        }
        Object emit = achieveViewModel.f43780k.emit(arrayList3, dVar);
        if (emit != CoroutineSingletons.f76214a) {
            return y.f85009a;
        }
        return emit;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Comparator] */
    public static final Object k0(List list, AchieveViewModel achieveViewModel, qm0.d dVar) {
        ProgramPreviewUi.Planned planned;
        ArrayList arrayList = new ArrayList();
        for (ProgramDomain programDomain : x.D0(list, new Object())) {
            ProgramPreviewUi previewUiItem = ProgramPreviewUiMappingKt.toPreviewUiItem(programDomain, achieveViewModel.f43771b.a());
            if (previewUiItem instanceof ProgramPreviewUi.Planned) {
                planned = (ProgramPreviewUi.Planned) previewUiItem;
            } else {
                planned = null;
            }
            if (planned != null) {
                arrayList.add(planned);
            }
        }
        Object emit = achieveViewModel.f43789t.emit(arrayList, dVar);
        if (emit != CoroutineSingletons.f76214a) {
            return y.f85009a;
        }
        return emit;
    }

    public static final Object t0(AchieveViewModel achieveViewModel, qm0.d dVar) {
        Object collect = achieveViewModel.f43775f.a().collect(new l(achieveViewModel), dVar);
        if (collect != CoroutineSingletons.f76214a) {
            return y.f85009a;
        }
        return collect;
    }

    public final MutableStateFlow A0() {
        return this.f43794y;
    }

    public final MutableStateFlow B0() {
        return this.f43783n;
    }

    public final StateFlow<HealthGoalHeaderUi> F0() {
        return this.f43793x;
    }

    public final MutableStateFlow G0() {
        return this.f43781l;
    }

    public final Intent K0(int i11, Context context) {
        Object runBlocking$default;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new a(context, i11, null), 1, null);
        return (Intent) runBlocking$default;
    }

    public final MutableStateFlow M0() {
        return this.f43790u;
    }

    public final MutableStateFlow O0() {
        return this.f43788s;
    }

    public final MutableStateFlow R0() {
        return this.f43786q;
    }

    public final SharedFlow<y> T0() {
        return this.A;
    }

    public final StateFlow<n20.h> U0() {
        return this.f43778i;
    }

    public final StateFlow<List<MadeForYouLibraryUi>> V0() {
        return FlowKt.asStateFlow(this.f43784o);
    }

    public final String W0() {
        String a11 = this.f43777h.a();
        if (a11 == null) {
            return "no-avatar";
        }
        return a11;
    }

    public final long X0() {
        return this.f43777h.q();
    }

    public final Intent Y0(int i11, Context context) {
        User user = this.f43777h;
        m70.i iVar = this.f43774e;
        ch.d dVar = this.f43773d;
        if (i11 != 1) {
            if (i11 != 8 && i11 != 76) {
                return null;
            }
            a3.b b10 = dVar.b();
            DateTime now = DateTime.now();
            kotlin.jvm.internal.u.i(now, "now(...)");
            User i12 = iVar.i(user.q());
            kotlin.jvm.internal.u.i(i12, "getUserById(...)");
            b10.getClass();
            return a3.b.c(context, i12, now, false);
        }
        a3.b b11 = dVar.b();
        User i13 = iVar.i(user.q());
        kotlin.jvm.internal.u.i(i13, "getUserById(...)");
        b11.getClass();
        return a3.b.h(context, i13);
    }

    public final void Z0() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new b(null), 3, null);
    }

    public final void a1(AchieveTabState tab, boolean z5) {
        kotlin.jvm.internal.u.j(tab, "tab");
        MutableStateFlow<AchieveTabState> mutableStateFlow = this.f43794y;
        if (!kotlin.jvm.internal.u.e(tab, mutableStateFlow.getValue()) || z5) {
            if (tab instanceof AchieveTabState.LibraryTab) {
                v70.a.c("library", null, 6);
            } else if (tab instanceof AchieveTabState.ProgramTab) {
                v70.a.c("programs", null, 6);
            }
        }
        do {
        } while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), tab));
    }
}
