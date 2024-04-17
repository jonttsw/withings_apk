package com.withings.nervehealth.ui.guidedscan;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.common.device.model.capabilities.DeviceWithVideoMedia;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.nervehealth.android.NeuropathyFeature;
import com.withings.nervehealth.ui.guidedscan.c;
import com.withings.nervehealth.ui.guidedscan.d;
import com.withings.user.User;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
/* compiled from: NerveHealthGuidedScanViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/nervehealth/ui/guidedscan/NerveHealthGuidedScanViewModel;", "Landroidx/lifecycle/g1;", "Lky/b;", "nervehealth-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NerveHealthGuidedScanViewModel extends g1 implements ky.b {

    /* renamed from: a  reason: collision with root package name */
    private final cy.a f42530a;

    /* renamed from: b  reason: collision with root package name */
    private final e0 f42531b;

    /* renamed from: c  reason: collision with root package name */
    private final j00.e f42532c;

    /* renamed from: d  reason: collision with root package name */
    private final j00.a f42533d;

    /* renamed from: e  reason: collision with root package name */
    private final j00.b f42534e;

    /* renamed from: f  reason: collision with root package name */
    private final fy.c0 f42535f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f42536g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f42537h;

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f42538i;

    /* renamed from: j  reason: collision with root package name */
    private final MutableStateFlow<List<Long>> f42539j;

    /* renamed from: k  reason: collision with root package name */
    private final MutableStateFlow<p0> f42540k;

    /* renamed from: l  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f42541l;

    /* renamed from: m  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f42542m;

    /* renamed from: n  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f42543n;

    /* renamed from: o  reason: collision with root package name */
    private final MutableSharedFlow<com.withings.nervehealth.ui.guidedscan.c> f42544o;

    /* renamed from: p  reason: collision with root package name */
    private final nm0.g f42545p;

    /* renamed from: q  reason: collision with root package name */
    private final StateFlow<p0> f42546q;

    /* renamed from: r  reason: collision with root package name */
    private final StateFlow<Boolean> f42547r;

    /* renamed from: s  reason: collision with root package name */
    private final StateFlow<Boolean> f42548s;

    /* renamed from: t  reason: collision with root package name */
    private final StateFlow<Boolean> f42549t;

    /* renamed from: u  reason: collision with root package name */
    private final SharedFlow<com.withings.nervehealth.ui.guidedscan.c> f42550u;

    /* renamed from: v  reason: collision with root package name */
    private final DeviceWithVideoMedia.a f42551v;

    /* compiled from: NerveHealthGuidedScanViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel$1", f = "NerveHealthGuidedScanViewModel.kt", l = {ConstantsWs.WS_STATUS_UNVERIFIED_SESSION, ConstantsWs.WS_STATUS_WRONGTZNAME, ConstantsWs.WS_STATUS_WRONGASSOCID, ConstantsWs.WS_STATUS_WRONGDEVICEID}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        boolean f42552a;

        /* renamed from: b  reason: collision with root package name */
        boolean f42553b;

        /* renamed from: c  reason: collision with root package name */
        int f42554c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i00.f f42555d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NerveHealthGuidedScanViewModel f42556e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i00.f fVar, NerveHealthGuidedScanViewModel nerveHealthGuidedScanViewModel, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f42555d = fVar;
            this.f42556e = nerveHealthGuidedScanViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f42555d, this.f42556e, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00aa A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r9.f42554c
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                i00.f r6 = r9.f42555d
                com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel r7 = r9.f42556e
                if (r1 == 0) goto L35
                if (r1 == r5) goto L31
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                nm0.l.b(r10)
                goto Lab
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                boolean r1 = r9.f42553b
                boolean r3 = r9.f42552a
                nm0.l.b(r10)
                goto L90
            L2b:
                boolean r1 = r9.f42552a
                nm0.l.b(r10)
                goto L6d
            L31:
                nm0.l.b(r10)
                goto L4d
            L35:
                nm0.l.b(r10)
                kotlinx.coroutines.flow.MutableStateFlow r10 = com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel.j0(r7)
                java.lang.Object r10 = r10.getValue()
                java.util.List r10 = (java.util.List) r10
                com.withings.nervehealth.core.model.MeasureCategory r1 = com.withings.nervehealth.core.model.MeasureCategory.f42341c
                r9.f42554c = r5
                java.lang.Boolean r10 = r6.c(r10, r1)
                if (r10 != r0) goto L4d
                return r0
            L4d:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                kotlinx.coroutines.flow.MutableStateFlow r1 = com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel.j0(r7)
                java.lang.Object r1 = r1.getValue()
                java.util.List r1 = (java.util.List) r1
                com.withings.nervehealth.core.model.MeasureCategory r5 = com.withings.nervehealth.core.model.MeasureCategory.f42343e
                r9.f42552a = r10
                r9.f42554c = r4
                java.lang.Boolean r1 = r6.c(r1, r5)
                if (r1 != r0) goto L6a
                return r0
            L6a:
                r8 = r1
                r1 = r10
                r10 = r8
            L6d:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                kotlinx.coroutines.flow.MutableStateFlow r4 = com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel.j0(r7)
                java.lang.Object r4 = r4.getValue()
                java.util.List r4 = (java.util.List) r4
                com.withings.nervehealth.core.model.MeasureCategory r5 = com.withings.nervehealth.core.model.MeasureCategory.f42342d
                r9.f42552a = r1
                r9.f42553b = r10
                r9.f42554c = r3
                java.lang.Boolean r3 = r6.c(r4, r5)
                if (r3 != r0) goto L8c
                return r0
            L8c:
                r8 = r1
                r1 = r10
                r10 = r3
                r3 = r8
            L90:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r3 != 0) goto Lab
                if (r10 != 0) goto Lab
                if (r1 != 0) goto Lab
                kotlinx.coroutines.flow.MutableSharedFlow r10 = com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel.t0(r7)
                com.withings.nervehealth.ui.guidedscan.c$a r1 = com.withings.nervehealth.ui.guidedscan.c.a.f42596a
                r9.f42554c = r2
                java.lang.Object r10 = r10.emit(r1, r9)
                if (r10 != r0) goto Lab
                return r0
            Lab:
                nm0.y r10 = nm0.y.f85009a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NerveHealthGuidedScanViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel", f = "NerveHealthGuidedScanViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_VO2MAX_HR_MAX}, m = "finishGuidedScan")
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        NerveHealthGuidedScanViewModel f42557a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f42558b;

        /* renamed from: d  reason: collision with root package name */
        int f42560d;

        b(qm0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f42558b = obj;
            this.f42560d |= Integer.MIN_VALUE;
            return NerveHealthGuidedScanViewModel.this.G0(this);
        }
    }

    /* compiled from: NerveHealthGuidedScanViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel$onBack$1", f = "NerveHealthGuidedScanViewModel.kt", l = {123}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f42561a;

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
            int i11 = this.f42561a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                MutableSharedFlow mutableSharedFlow = NerveHealthGuidedScanViewModel.this.f42544o;
                c.a aVar = c.a.f42596a;
                this.f42561a = 1;
                if (mutableSharedFlow.emit(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: NerveHealthGuidedScanViewModel.kt */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m70.i f42563a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(m70.i iVar) {
            super(0);
            this.f42563a = iVar;
        }

        @Override // ym0.a
        public final Long invoke() {
            User g11 = this.f42563a.g();
            if (g11 != null) {
                return Long.valueOf(g11.q());
            }
            return null;
        }
    }

    /* compiled from: NerveHealthGuidedScanViewModel.kt */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<o0> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final o0 invoke() {
            return new o0(NerveHealthGuidedScanViewModel.this);
        }
    }

    /* compiled from: NerveHealthGuidedScanViewModel.kt */
    /* loaded from: classes4.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m70.i f42565a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NerveHealthGuidedScanViewModel f42566b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(m70.i iVar, NerveHealthGuidedScanViewModel nerveHealthGuidedScanViewModel) {
            super(0);
            this.f42565a = iVar;
            this.f42566b = nerveHealthGuidedScanViewModel;
        }

        @Override // ym0.a
        public final String invoke() {
            return this.f42565a.i(NerveHealthGuidedScanViewModel.r0(this.f42566b)).l();
        }
    }

    /* compiled from: NerveHealthGuidedScanViewModel.kt */
    /* loaded from: classes4.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u0 f42567a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(u0 u0Var) {
            super(0);
            this.f42567a = u0Var;
        }

        @Override // ym0.a
        public final Long invoke() {
            long j5;
            Long l5 = (Long) this.f42567a.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID);
            if (l5 != null) {
                j5 = l5.longValue();
            } else {
                j5 = 0;
            }
            return Long.valueOf(j5);
        }
    }

    @Inject
    public NerveHealthGuidedScanViewModel(m70.i userManager, cy.a aVar, e0 e0Var, j00.e eVar, j00.a aVar2, j00.b bVar, fy.c0 c0Var, i00.f fVar, i00.a aVar3, com.withings.nervehealth.ui.usecases.g gVar, u0 savedStateHandle) {
        kotlin.jvm.internal.u.j(userManager, "userManager");
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
        this.f42530a = aVar;
        this.f42531b = e0Var;
        this.f42532c = eVar;
        this.f42533d = aVar2;
        this.f42534e = bVar;
        this.f42535f = c0Var;
        this.f42536g = nm0.h.b(new g(savedStateHandle));
        nm0.g b10 = nm0.h.b(new f(userManager, this));
        this.f42537h = b10;
        this.f42538i = nm0.h.b(new d(userManager));
        MutableStateFlow<List<Long>> MutableStateFlow = StateFlowKt.MutableStateFlow(kotlin.collections.i0.f76187a);
        this.f42539j = MutableStateFlow;
        d.c cVar = d.c.f42602b;
        String str = (String) b10.getValue();
        kotlin.jvm.internal.u.i(str, "<get-userFirstName>(...)");
        MutableStateFlow<p0> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new p0(cVar, str, null));
        this.f42540k = MutableStateFlow2;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool);
        this.f42541l = MutableStateFlow3;
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(bool);
        this.f42542m = MutableStateFlow4;
        MutableStateFlow<Boolean> MutableStateFlow5 = StateFlowKt.MutableStateFlow(bool);
        this.f42543n = MutableStateFlow5;
        MutableSharedFlow<com.withings.nervehealth.ui.guidedscan.c> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f42544o = MutableSharedFlow$default;
        this.f42545p = nm0.h.b(new e());
        this.f42546q = FlowKt.asStateFlow(MutableStateFlow2);
        this.f42547r = FlowKt.asStateFlow(MutableStateFlow3);
        this.f42548s = FlowKt.asStateFlow(MutableStateFlow4);
        this.f42549t = FlowKt.asStateFlow(MutableStateFlow5);
        this.f42550u = FlowKt.asSharedFlow(MutableSharedFlow$default);
        int i11 = DeviceWithVideoMedia.VideoType.f35228b;
        this.f42551v = gVar.a();
        aVar.a(this);
        MutableStateFlow.setValue(aVar3.a());
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(fVar, this, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A0(com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel r7, android.content.Context r8, qm0.d r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof com.withings.nervehealth.ui.guidedscan.m0
            if (r0 == 0) goto L17
            r0 = r9
            com.withings.nervehealth.ui.guidedscan.m0 r0 = (com.withings.nervehealth.ui.guidedscan.m0) r0
            int r1 = r0.f42643d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f42643d = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            com.withings.nervehealth.ui.guidedscan.m0 r0 = new com.withings.nervehealth.ui.guidedscan.m0
            r0.<init>(r7, r9)
            goto L15
        L1d:
            java.lang.Object r9 = r6.f42641b
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r6.f42643d
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel r7 = r6.f42640a
            nm0.l.b(r9)
            goto L7a
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            nm0.l.b(r9)
            ui.b r9 = new ui.b
            r9.<init>(r8)
            boolean r8 = r9.b()
            if (r8 != 0) goto L4c
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r7 = r7.f42543n
            r7.setValue(r8)
            goto L8e
        L4c:
            kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.Long>> r8 = r7.f42539j
            java.lang.Object r8 = r8.getValue()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = kotlin.collections.x.K(r8)
            java.lang.Long r8 = (java.lang.Long) r8
            if (r8 == 0) goto L7a
            long r4 = r8.longValue()
            nm0.g r8 = r7.f42536g
            java.lang.Object r8 = r8.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            long r8 = r8.longValue()
            r6.f42640a = r7
            r6.f42643d = r2
            j00.e r1 = r7.f42532c
            r2 = r8
            java.lang.Object r8 = r1.a(r2, r4, r6)
            if (r8 != r0) goto L7a
            goto L90
        L7a:
            kotlinx.coroutines.CoroutineScope r0 = androidx.lifecycle.h1.a(r7)
            kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
            com.withings.nervehealth.ui.guidedscan.n0 r3 = new com.withings.nervehealth.ui.guidedscan.n0
            r8 = 0
            r3.<init>(r7, r8)
            r2 = 0
            r4 = 2
            r5 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
        L8e:
            nm0.y r0 = nm0.y.f85009a
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel.A0(com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel, android.content.Context, qm0.d):java.lang.Object");
    }

    public static final void B0(NerveHealthGuidedScanViewModel nerveHealthGuidedScanViewModel) {
        MutableStateFlow<Boolean> mutableStateFlow = nerveHealthGuidedScanViewModel.f42542m;
        mutableStateFlow.setValue(Boolean.valueOf(!mutableStateFlow.getValue().booleanValue()));
        nerveHealthGuidedScanViewModel.f42543n.setValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G0(qm0.d<? super nm0.y> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel.b
            if (r0 == 0) goto L14
            r0 = r10
            com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel$b r0 = (com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel.b) r0
            int r1 = r0.f42560d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f42560d = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel$b r0 = new com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel$b
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f42558b
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r6.f42560d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel r0 = r6.f42557a
            nm0.l.b(r10)
            goto L65
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            nm0.l.b(r10)
            kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.Long>> r10 = r9.f42539j
            java.lang.Object r10 = r10.getValue()
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r10 = kotlin.collections.x.K(r10)
            java.lang.Long r10 = (java.lang.Long) r10
            if (r10 == 0) goto L64
            long r4 = r10.longValue()
            nm0.g r10 = r9.f42536g
            java.lang.Object r10 = r10.getValue()
            java.lang.Number r10 = (java.lang.Number) r10
            long r7 = r10.longValue()
            r6.f42557a = r9
            r6.f42560d = r2
            j00.b r1 = r9.f42534e
            r2 = r7
            java.lang.Object r10 = r1.a(r2, r4, r6)
            if (r10 != r0) goto L64
            return r0
        L64:
            r0 = r9
        L65:
            com.withings.nervehealth.ui.guidedscan.d$a r10 = com.withings.nervehealth.ui.guidedscan.d.a.f42599b
            r0.a1(r10)
            nm0.g r10 = r0.f42545p
            java.lang.Object r10 = r10.getValue()
            com.withings.nervehealth.ui.guidedscan.o0 r10 = (com.withings.nervehealth.ui.guidedscan.o0) r10
            r10.cancel()
            nm0.y r10 = nm0.y.f85009a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel.G0(qm0.d):java.lang.Object");
    }

    private final void Z0() {
        MutableStateFlow<Boolean> mutableStateFlow = this.f42541l;
        mutableStateFlow.setValue(Boolean.valueOf(!mutableStateFlow.getValue().booleanValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a1(com.withings.nervehealth.ui.guidedscan.d dVar) {
        String str = (String) this.f42537h.getValue();
        kotlin.jvm.internal.u.i(str, "<get-userFirstName>(...)");
        this.f42540k.setValue(new p0(dVar, str, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f0(com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel r9, android.content.Context r10, qm0.d r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof com.withings.nervehealth.ui.guidedscan.f0
            if (r0 == 0) goto L17
            r0 = r11
            com.withings.nervehealth.ui.guidedscan.f0 r0 = (com.withings.nervehealth.ui.guidedscan.f0) r0
            int r1 = r0.f42615e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f42615e = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            com.withings.nervehealth.ui.guidedscan.f0 r0 = new com.withings.nervehealth.ui.guidedscan.f0
            r0.<init>(r9, r11)
            goto L15
        L1d:
            java.lang.Object r11 = r6.f42613c
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r6.f42615e
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            android.content.Context r10 = r6.f42612b
            com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel r9 = r6.f42611a
            nm0.l.b(r11)
            goto L76
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            nm0.l.b(r11)
            nm0.g r11 = r9.f42545p
            java.lang.Object r11 = r11.getValue()
            com.withings.nervehealth.ui.guidedscan.o0 r11 = (com.withings.nervehealth.ui.guidedscan.o0) r11
            r11.cancel()
            kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.Long>> r11 = r9.f42539j
            java.lang.Object r11 = r11.getValue()
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r11 = kotlin.collections.x.K(r11)
            java.lang.Long r11 = (java.lang.Long) r11
            if (r11 == 0) goto L76
            long r4 = r11.longValue()
            nm0.g r11 = r9.f42536g
            java.lang.Object r11 = r11.getValue()
            java.lang.Number r11 = (java.lang.Number) r11
            long r7 = r11.longValue()
            r6.f42611a = r9
            r6.f42612b = r10
            r6.f42615e = r2
            j00.a r1 = r9.f42533d
            r2 = r7
            java.lang.Object r11 = r1.a(r2, r4, r6)
            if (r11 != r0) goto L76
            goto L8a
        L76:
            ui.b r11 = new ui.b
            r11.<init>(r10)
            boolean r10 = r11.b()
            if (r10 != 0) goto L88
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r9 = r9.f42543n
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r9.setValue(r10)
        L88:
            nm0.y r0 = nm0.y.f85009a
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel.f0(com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel, android.content.Context, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i0(com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel r4, android.content.Context r5, qm0.d r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof com.withings.nervehealth.ui.guidedscan.h0
            if (r0 == 0) goto L16
            r0 = r6
            com.withings.nervehealth.ui.guidedscan.h0 r0 = (com.withings.nervehealth.ui.guidedscan.h0) r0
            int r1 = r0.f42625e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f42625e = r1
            goto L1b
        L16:
            com.withings.nervehealth.ui.guidedscan.h0 r0 = new com.withings.nervehealth.ui.guidedscan.h0
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f42623c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f42625e
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            android.content.Context r5 = r0.f42622b
            com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel r4 = r0.f42621a
            nm0.l.b(r6)
            goto L46
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            nm0.l.b(r6)
            r0.f42621a = r4
            r0.f42622b = r5
            r0.f42625e = r3
            java.lang.Object r6 = r4.G0(r0)
            if (r6 != r1) goto L46
            goto L5a
        L46:
            ui.b r6 = new ui.b
            r6.<init>(r5)
            boolean r5 = r6.b()
            if (r5 != 0) goto L58
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r4 = r4.f42543n
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.setValue(r5)
        L58:
            nm0.y r1 = nm0.y.f85009a
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel.i0(com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel, android.content.Context, qm0.d):java.lang.Object");
    }

    public static final o0 m0(NerveHealthGuidedScanViewModel nerveHealthGuidedScanViewModel) {
        return (o0) nerveHealthGuidedScanViewModel.f42545p.getValue();
    }

    public static final long r0(NerveHealthGuidedScanViewModel nerveHealthGuidedScanViewModel) {
        return ((Number) nerveHealthGuidedScanViewModel.f42536g.getValue()).longValue();
    }

    public static final boolean z0(NerveHealthGuidedScanViewModel nerveHealthGuidedScanViewModel, ky.d dVar, long j5) {
        d.b bVar;
        DateTime c11;
        nerveHealthGuidedScanViewModel.getClass();
        if (kotlin.collections.x.W(Long.valueOf(dVar.h()), (Long) nerveHealthGuidedScanViewModel.f42538i.getValue()).contains(Long.valueOf(j5))) {
            MutableStateFlow<p0> mutableStateFlow = nerveHealthGuidedScanViewModel.f42540k;
            if (mutableStateFlow.getValue().c() != null) {
                com.withings.nervehealth.ui.guidedscan.d b10 = mutableStateFlow.getValue().b();
                if (b10 instanceof d.b) {
                    bVar = (d.b) b10;
                } else {
                    bVar = null;
                }
                if (bVar != null && (c11 = bVar.c()) != null) {
                    DateTime plusMillis = c11.plusMillis(600000);
                    DateTime c12 = dVar.c();
                    if (c12.compareTo((ReadableInstant) c11) >= 0 && c12.compareTo((ReadableInstant) plusMillis) <= 0) {
                        if (ly.a.b(NeuropathyFeature.f42331e.b(), dVar.f()) == null) {
                            if (ly.a.b(NeuropathyFeature.f42332f.b(), dVar.f()) != null) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final SharedFlow<com.withings.nervehealth.ui.guidedscan.c> K0() {
        return this.f42550u;
    }

    public final StateFlow<Boolean> M0() {
        return this.f42547r;
    }

    public final StateFlow<Boolean> O0() {
        return this.f42549t;
    }

    public final StateFlow<Boolean> R0() {
        return this.f42548s;
    }

    public final StateFlow<p0> T0() {
        return this.f42546q;
    }

    public final void U0() {
        com.withings.nervehealth.ui.guidedscan.d b10 = this.f42540k.getValue().b();
        if (b10 instanceof d.c) {
            Z0();
        } else if (b10 instanceof d.b) {
            if (((d.b) b10).d()) {
                Z0();
            } else {
                a1(d.c.f42602b);
            }
        } else if (b10 instanceof d.a) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new c(null), 3, null);
        }
    }

    public final void V0() {
        Z0();
    }

    public final Job W0(NerveHealthGuidedScanActivity context) {
        Job launch$default;
        kotlin.jvm.internal.u.j(context, "context");
        launch$default = BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new i0(this, context, null), 2, null);
        return launch$default;
    }

    public final void X0() {
        a1(new d.b(null, this.f42551v, 1));
    }

    public final void Y0() {
        Z0();
    }

    @Override // ky.b
    public final void b(long j5, ky.d measuresGroup) {
        kotlin.jvm.internal.u.j(measuresGroup, "measuresGroup");
    }

    @Override // ky.b
    public final void c(long j5, List<ky.d> list) {
        kotlin.jvm.internal.u.j(list, "list");
    }

    @Override // ky.b
    public final void d(long j5, ky.d measuresGroup, boolean z5) {
        kotlin.jvm.internal.u.j(measuresGroup, "measuresGroup");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new g0(this, measuresGroup, j5, null), 2, null);
    }

    @Override // ky.b
    public final void g(long j5, ky.d measuresGroup) {
        kotlin.jvm.internal.u.j(measuresGroup, "measuresGroup");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new g0(this, measuresGroup, j5, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g1
    public final void onCleared() {
        ((o0) this.f42545p.getValue()).cancel();
        this.f42530a.b(this);
        super.onCleared();
    }
}
