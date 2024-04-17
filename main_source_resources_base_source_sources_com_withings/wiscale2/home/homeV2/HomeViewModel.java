package com.withings.wiscale2.home.homeV2;

import android.content.Context;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import aw.j;
import com.withings.favorite.model.Favorite;
import com.withings.leaderboard.domain.GetUserPositionRankingUseCase;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.home.homeV2.a;
import iz.a;
import java.util.Comparator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
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
import nm0.h;
import nm0.l;
import nm0.y;
import or.g;
import oz.i;
import pg0.a0;
import pg0.b0;
import pg0.c0;
import vg0.f;
import vi.o;
import ym0.p;
import ym0.q;
/* compiled from: HomeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/home/homeV2/HomeViewModel;", "Landroidx/lifecycle/g1;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HomeViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final t00.d f57790a;

    /* renamed from: b  reason: collision with root package name */
    private final or.a f57791b;

    /* renamed from: c  reason: collision with root package name */
    private final or.c f57792c;

    /* renamed from: d  reason: collision with root package name */
    private final d00.d f57793d;

    /* renamed from: e  reason: collision with root package name */
    private final g f57794e;

    /* renamed from: f  reason: collision with root package name */
    private final ni.a f57795f;

    /* renamed from: g  reason: collision with root package name */
    private final qg0.a f57796g;

    /* renamed from: h  reason: collision with root package name */
    private final fl.e f57797h;

    /* renamed from: i  reason: collision with root package name */
    private final kn.e f57798i;

    /* renamed from: j  reason: collision with root package name */
    private final ch0.g f57799j;

    /* renamed from: k  reason: collision with root package name */
    private final i f57800k;

    /* renamed from: l  reason: collision with root package name */
    private final String f57801l;

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f57802m;

    /* renamed from: n  reason: collision with root package name */
    private final ch0.i f57803n;

    /* renamed from: o  reason: collision with root package name */
    private final SharedFlow f57804o;

    /* renamed from: p  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f57805p;

    /* renamed from: q  reason: collision with root package name */
    private final Flow<List<a.b>> f57806q;

    /* renamed from: r  reason: collision with root package name */
    private final Flow<List<vg0.a>> f57807r;

    /* renamed from: s  reason: collision with root package name */
    private final Flow<List<bw.d>> f57808s;

    /* renamed from: t  reason: collision with root package name */
    private final Flow<List<c10.c<?>>> f57809t;

    /* renamed from: u  reason: collision with root package name */
    private final Flow<String> f57810u;

    /* renamed from: v  reason: collision with root package name */
    private final MutableSharedFlow<y> f57811v;

    /* renamed from: w  reason: collision with root package name */
    private final StateFlow<com.withings.wiscale2.home.homeV2.a> f57812w;

    /* renamed from: x  reason: collision with root package name */
    private final Flow<o> f57813x;

    /* compiled from: HomeViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.home.homeV2.HomeViewModel$favorite$1", f = "HomeViewModel.kt", l = {192}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f57814a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f57816c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f57817d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f57816c = str;
            this.f57817d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f57816c, this.f57817d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f57814a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                or.a aVar = HomeViewModel.this.f57791b;
                List V = x.V(this.f57816c);
                this.f57814a = 1;
                if (aVar.a(V, this.f57817d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: HomeViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.home.homeV2.HomeViewModel$missionsList$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements q<List<? extends b00.c>, List<? extends Favorite>, qm0.d<? super List<? extends g00.a>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ List f57818a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ List f57819b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f57820c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ HomeViewModel f57821d;

        /* compiled from: Comparisons.kt */
        /* loaded from: classes5.dex */
        public static final class a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return pm0.a.b(Boolean.valueOf(((b00.c) t11).j()), Boolean.valueOf(((b00.c) t12).j()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, HomeViewModel homeViewModel, qm0.d<? super b> dVar) {
            super(3, dVar);
            this.f57820c = context;
            this.f57821d = homeViewModel;
        }

        @Override // ym0.q
        public final Object invoke(List<? extends b00.c> list, List<? extends Favorite> list2, qm0.d<? super List<? extends g00.a>> dVar) {
            b bVar = new b(this.f57820c, this.f57821d, dVar);
            bVar.f57818a = list;
            bVar.f57819b = list2;
            return bVar.invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Comparator] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            List D0 = x.D0(this.f57818a, new Object());
            ii.a a11 = this.f57821d.f57795f.a();
            return g00.b.a(D0, this.f57820c, a11, this.f57819b);
        }
    }

    /* compiled from: HomeViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.home.homeV2.HomeViewModel$onHeroButtonClicked$1", f = "HomeViewModel.kt", l = {222}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f57822a;

        c(qm0.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new c(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f57822a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                qg0.a aVar = HomeViewModel.this.f57796g;
                this.f57822a = 1;
                if (aVar.a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: HomeViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.home.homeV2.HomeViewModel$refresh$1", f = "HomeViewModel.kt", l = {205, 206}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        kn.e f57824a;

        /* renamed from: b  reason: collision with root package name */
        int f57825b;

        d(qm0.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new d(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b6 A[LOOP:2: B:30:0x00b0->B:32:0x00b6, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r7.f57825b
                r2 = 2
                r3 = 1
                com.withings.wiscale2.home.homeV2.HomeViewModel r4 = com.withings.wiscale2.home.homeV2.HomeViewModel.this
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                kn.e r0 = r7.f57824a
                nm0.l.b(r8)
                goto L62
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                nm0.l.b(r8)
                goto L4d
            L20:
                nm0.l.b(r8)
                kotlinx.coroutines.flow.MutableStateFlow r8 = com.withings.wiscale2.home.homeV2.HomeViewModel.y0(r4)
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r8.setValue(r1)
                t00.d r8 = com.withings.wiscale2.home.homeV2.HomeViewModel.p0(r4)
                r7.f57825b = r3
                qm0.i r1 = new qm0.i
                qm0.d r3 = rm0.a.b(r7)
                r1.<init>(r3)
                t00.e r3 = new t00.e
                r3.<init>(r1)
                r5 = 0
                java.lang.String r6 = "syncForHomeRefresh"
                r8.c(r6, r5, r3)
                java.lang.Object r8 = r1.a()
                if (r8 != r0) goto L4d
                return r0
            L4d:
                kn.e r8 = com.withings.wiscale2.home.homeV2.HomeViewModel.j0(r4)
                kotlinx.coroutines.flow.SharedFlow r1 = com.withings.wiscale2.home.homeV2.HomeViewModel.t0(r4)
                r7.f57824a = r8
                r7.f57825b = r2
                java.lang.Object r1 = kotlinx.coroutines.flow.FlowKt.first(r1, r7)
                if (r1 != r0) goto L60
                return r0
            L60:
                r0 = r8
                r8 = r1
            L62:
                com.withings.user.core.models.User r8 = (com.withings.user.core.models.User) r8
                long r1 = r8.getId()
                r8 = 16
                java.util.ArrayList r8 = r0.k(r8, r1)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r8 = r8.iterator()
            L77:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto L91
                java.lang.Object r1 = r8.next()
                com.withings.device.Device r1 = (com.withings.device.Device) r1
                fl.e r2 = com.withings.wiscale2.home.homeV2.HomeViewModel.i0(r4)
                fl.e$c r1 = r2.f(r1)
                if (r1 == 0) goto L77
                r0.add(r1)
                goto L77
            L91:
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.Iterator r0 = r0.iterator()
            L9a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto Lac
                java.lang.Object r1 = r0.next()
                boolean r2 = r1 instanceof fl.e.d
                if (r2 == 0) goto L9a
                r8.add(r1)
                goto L9a
            Lac:
                java.util.Iterator r8 = r8.iterator()
            Lb0:
                boolean r0 = r8.hasNext()
                if (r0 == 0) goto Lc0
                java.lang.Object r0 = r8.next()
                fl.e$d r0 = (fl.e.d) r0
                r0.d()
                goto Lb0
            Lc0:
                kotlinx.coroutines.flow.MutableStateFlow r8 = com.withings.wiscale2.home.homeV2.HomeViewModel.y0(r4)
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                r8.setValue(r0)
                nm0.y r8 = nm0.y.f85009a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.home.homeV2.HomeViewModel.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: HomeViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.home.homeV2.HomeViewModel$unFavorite$1", f = "HomeViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_EDA_RIGHT_FOOT}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class e extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f57827a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f57829c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f57830d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, String str2, qm0.d<? super e> dVar) {
            super(2, dVar);
            this.f57829c = str;
            this.f57830d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new e(this.f57829c, this.f57830d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f57827a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                or.c cVar = HomeViewModel.this.f57792c;
                List V = x.V(this.f57829c);
                this.f57827a = 1;
                if (cVar.a(V, this.f57830d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.jvm.internal.i, ym0.s] */
    @Inject
    public HomeViewModel(Context context, vg0.e eVar, vg0.b bVar, f fVar, x00.b bVar2, GetUserPositionRankingUseCase getUserPositionRankingUseCase, aw.a aVar, aw.d dVar, aw.i iVar, j jVar, r70.c userRepository, fl.p pVar, ch0.a bleDiscover, t00.d networkSyncManager, or.a aVar2, or.c cVar, d00.d dVar2, g gVar, ni.a aVar3, qg0.a heroRepository, fl.e eVar2, kn.e deviceManager, ch0.g requiredInteractionTimelineDelegate, i iVar2) {
        u.j(userRepository, "userRepository");
        u.j(bleDiscover, "bleDiscover");
        u.j(networkSyncManager, "networkSyncManager");
        u.j(heroRepository, "heroRepository");
        u.j(deviceManager, "deviceManager");
        u.j(requiredInteractionTimelineDelegate, "requiredInteractionTimelineDelegate");
        this.f57790a = networkSyncManager;
        this.f57791b = aVar2;
        this.f57792c = cVar;
        this.f57793d = dVar2;
        this.f57794e = gVar;
        this.f57795f = aVar3;
        this.f57796g = heroRepository;
        this.f57797h = eVar2;
        this.f57798i = deviceManager;
        this.f57799j = requiredInteractionTimelineDelegate;
        this.f57800k = iVar2;
        this.f57801l = fVar.a();
        this.f57802m = h.b(new com.withings.wiscale2.home.homeV2.c(this));
        this.f57803n = new ch0.i(context, deviceManager, pVar, new fl.b(context, deviceManager));
        Flow filterNotNull = FlowKt.filterNotNull(userRepository.f());
        CoroutineScope a11 = h1.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharedFlow flow = FlowKt.shareIn(filterNotNull, a11, companion.getLazily(), 1);
        this.f57804o = flow;
        this.f57805p = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        Flow<List<a.b>> flow2 = FlowKt.transformLatest(flow, new a0(null, eVar));
        this.f57806q = flow2;
        Flow<List<vg0.a>> flow6 = bVar.a();
        this.f57807r = flow6;
        Flow<List<bw.d>> flow5 = FlowKt.combine(dVar.c(), aVar.b(), jVar.b(), iVar.d(), new kotlin.coroutines.jvm.internal.i(5, null));
        this.f57808s = flow5;
        Flow<List<c10.c<?>>> flow3 = FlowKt.transformLatest(flow, new b0(null, bVar2));
        this.f57809t = flow3;
        Flow<String> flow4 = FlowKt.transformLatest(w70.b.c(), new c0(null, getUserPositionRankingUseCase));
        this.f57810u = flow4;
        this.f57811v = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        com.withings.wiscale2.home.homeV2.b bVar3 = new com.withings.wiscale2.home.homeV2.b(null);
        u.j(flow, "flow");
        u.j(flow2, "flow2");
        u.j(flow3, "flow3");
        u.j(flow4, "flow4");
        u.j(flow5, "flow5");
        u.j(flow6, "flow6");
        this.f57812w = FlowKt.stateIn(new w70.a(new Flow[]{flow, flow2, flow3, flow4, flow5, flow6}, bVar3), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), a.C0748a.f57831a);
        this.f57813x = bleDiscover.d();
    }

    public final void A0(String contentId, String type) {
        u.j(contentId, "contentId");
        u.j(type, "type");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(contentId, type, null), 2, null);
    }

    public final Flow<o> B0() {
        return this.f57813x;
    }

    public final String F0() {
        return this.f57801l;
    }

    public final StateFlow<com.withings.wiscale2.home.homeV2.a> G0() {
        return this.f57812w;
    }

    public final ch0.i K0() {
        return this.f57803n;
    }

    public final SharedFlow<y> M0() {
        return FlowKt.asSharedFlow(this.f57811v);
    }

    public final Flow<Boolean> O0() {
        return (Flow) this.f57802m.getValue();
    }

    public final StateFlow<Boolean> R0() {
        return FlowKt.asStateFlow(this.f57805p);
    }

    public final Flow<List<g00.a>> T0(Context context) {
        u.j(context, "context");
        d00.d dVar = this.f57793d;
        dVar.getClass();
        return FlowKt.flowOn(FlowKt.combine(FlowKt.transformLatest(w70.b.c(), new d00.b(null, dVar)), this.f57794e.a(), new b(context, this, null)), Dispatchers.getIO());
    }

    public final void U0() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new c(null), 3, null);
    }

    public final void V0() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new d(null), 2, null);
    }

    public final void W0(String contentId, String type) {
        u.j(contentId, "contentId");
        u.j(type, "type");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new e(contentId, type, null), 2, null);
    }
}
