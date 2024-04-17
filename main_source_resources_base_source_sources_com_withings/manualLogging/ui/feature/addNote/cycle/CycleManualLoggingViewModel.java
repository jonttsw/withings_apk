package com.withings.manualLogging.ui.feature.addNote.cycle;

import android.content.Context;
import b5.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.device.Device;
import com.withings.features.FeatureFlag;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.manualLogging.core.entity.cycle.CycleRegularity;
import com.withings.manualLogging.ui.feature.addNote.cycle.model.CycleManualLoggingEvent;
import gx.b;
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
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
/* compiled from: CycleManualLoggingViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/manualLogging/ui/feature/addNote/cycle/CycleManualLoggingViewModel;", "Landroidx/lifecycle/g1;", "manual-logging-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CycleManualLoggingViewModel extends androidx.lifecycle.g1 {
    private final d2 A;
    private final ym0.l<g3, nm0.y> B;

    /* renamed from: a  reason: collision with root package name */
    private final ym.g f40752a;

    /* renamed from: b  reason: collision with root package name */
    private final xm.a f40753b;

    /* renamed from: c  reason: collision with root package name */
    private final xw.b f40754c;

    /* renamed from: d  reason: collision with root package name */
    private final fl.i f40755d;

    /* renamed from: e  reason: collision with root package name */
    private final u60.a f40756e;

    /* renamed from: f  reason: collision with root package name */
    private final u60.c f40757f;

    /* renamed from: g  reason: collision with root package name */
    private final ym.b f40758g;

    /* renamed from: h  reason: collision with root package name */
    private final ym.c f40759h;

    /* renamed from: i  reason: collision with root package name */
    private final ym.o f40760i;

    /* renamed from: j  reason: collision with root package name */
    private final Integer f40761j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f40762k;

    /* renamed from: l  reason: collision with root package name */
    private final Long f40763l;

    /* renamed from: m  reason: collision with root package name */
    private final Long f40764m;

    /* renamed from: n  reason: collision with root package name */
    private final String f40765n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f40766o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f40767p;

    /* renamed from: q  reason: collision with root package name */
    private final Flow<Boolean> f40768q;

    /* renamed from: r  reason: collision with root package name */
    private final MutableSharedFlow<Throwable> f40769r;

    /* renamed from: s  reason: collision with root package name */
    private final SharedFlow<Throwable> f40770s;

    /* renamed from: t  reason: collision with root package name */
    private final MutableStateFlow<g3> f40771t;

    /* renamed from: u  reason: collision with root package name */
    private final SharedFlow<g3> f40772u;

    /* renamed from: v  reason: collision with root package name */
    private final MutableStateFlow<CycleManualLoggingEvent> f40773v;

    /* renamed from: w  reason: collision with root package name */
    private final StateFlow<CycleManualLoggingEvent> f40774w;

    /* renamed from: x  reason: collision with root package name */
    private final Flow<Boolean> f40775x;

    /* renamed from: y  reason: collision with root package name */
    private final SharedFlow<Device> f40776y;

    /* renamed from: z  reason: collision with root package name */
    private final c2 f40777z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleManualLoggingViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel$onPregnancyFactorSet$1", f = "CycleManualLoggingViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DateTime f40779b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f40780c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(DateTime dateTime, long j5, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f40779b = dateTime;
            this.f40780c = j5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f40779b, this.f40780c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            LocalDate localDate = this.f40779b.toLocalDate();
            kotlin.jvm.internal.u.i(localDate, "toLocalDate(...)");
            ((g3) CycleManualLoggingViewModel.this.f40771t.getValue()).y(localDate);
            CycleManualLoggingViewModel.c1(CycleManualLoggingViewModel.this, this.f40780c, false, false, 6);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleManualLoggingViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel$setFeatureActivation$1", f = "CycleManualLoggingViewModel.kt", l = {229, ConstantsWs.WS_STATUS_WRONGACCOUNTPARAMS, ConstantsWs.WS_STATUS_WRONGACCOUNTID, ConstantsWs.WS_STATUS_UNVERIFIED_SESSION}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        CycleManualLoggingViewModel f40781a;

        /* renamed from: b  reason: collision with root package name */
        long f40782b;

        /* renamed from: c  reason: collision with root package name */
        boolean f40783c;

        /* renamed from: d  reason: collision with root package name */
        int f40784d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f40785e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f40786f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ CycleManualLoggingViewModel f40787g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f40788h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f40789i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j5, CycleManualLoggingViewModel cycleManualLoggingViewModel, boolean z5, long j11, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f40786f = j5;
            this.f40787g = cycleManualLoggingViewModel;
            this.f40788h = z5;
            this.f40789i = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(this.f40786f, this.f40787g, this.f40788h, this.f40789i, dVar);
            bVar.f40785e = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a8 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r8 = r18
                kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r0 = r8.f40784d
                r10 = 4
                r11 = 3
                r1 = 2
                r2 = 1
                r12 = 0
                com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel r13 = r8.f40787g
                if (r0 == 0) goto L3f
                if (r0 == r2) goto L3b
                if (r0 == r1) goto L2d
                if (r0 == r11) goto L24
                if (r0 != r10) goto L1c
                nm0.l.b(r19)
                goto Lc3
            L1c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L24:
                java.lang.Object r0 = r8.f40785e
                kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                nm0.l.b(r19)
                goto La9
            L2d:
                boolean r0 = r8.f40783c
                long r1 = r8.f40782b
                com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel r3 = r8.f40781a
                java.lang.Object r4 = r8.f40785e
                kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
                nm0.l.b(r19)
                goto L93
            L3b:
                nm0.l.b(r19)
                goto L5a
            L3f:
                nm0.l.b(r19)
                java.lang.Object r0 = r8.f40785e
                r14 = r0
                kotlinx.coroutines.CoroutineScope r14 = (kotlinx.coroutines.CoroutineScope) r14
                long r3 = r8.f40786f
                r5 = -1
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 != 0) goto L5d
                r8.f40784d = r2
                boolean r0 = r8.f40788h
                java.lang.Object r0 = com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.i0(r13, r0, r8)
                if (r0 != r9) goto L5a
                return r9
            L5a:
                nm0.y r0 = nm0.y.f85009a
                return r0
            L5d:
                u60.c r0 = com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.r0(r13)
                com.withings.tutorials.core.FeatureTutorial r2 = com.withings.tutorials.core.FeatureTutorial.f44549a
                java.lang.Integer r0 = r0.execute()
                u60.a r2 = com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.q0(r13)
                int r5 = r0.intValue()
                r8.f40785e = r14
                r8.f40781a = r13
                long r6 = r8.f40789i
                r8.f40782b = r6
                boolean r15 = r8.f40788h
                r8.f40783c = r15
                r8.f40784d = r1
                long r3 = r8.f40786f
                r0 = r2
                r1 = r3
                r3 = r6
                r16 = r6
                r6 = r15
                r7 = r18
                java.lang.Object r0 = r0.a(r1, r3, r5, r6, r7)
                if (r0 != r9) goto L8e
                return r9
            L8e:
                r3 = r13
                r4 = r14
                r0 = r15
                r1 = r16
            L93:
                if (r0 == 0) goto L9c
                ym.o r5 = com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.A0(r3)
                r5.a(r1)
            L9c:
                r8.f40785e = r4
                r8.f40781a = r12
                r8.f40784d = r11
                java.lang.Object r0 = com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.i0(r3, r0, r8)
                if (r0 != r9) goto La9
                return r9
            La9:
                nm0.y r0 = nm0.y.f85009a
                if (r0 != 0) goto Lc3
                kotlinx.coroutines.flow.MutableSharedFlow r0 = com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.F0(r13)
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Cycle Tracking is not handled"
                r1.<init>(r2)
                r8.f40785e = r12
                r8.f40784d = r10
                java.lang.Object r0 = r0.emit(r1, r8)
                if (r0 != r9) goto Lc3
                return r9
            Lc3:
                nm0.y r0 = nm0.y.f85009a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public CycleManualLoggingViewModel(androidx.lifecycle.u0 savedStateHandle, Context context, vm.n nVar, um.a aVar, xw.b dispatchers, fl.i deviceModelRepository, u60.a featureActivationUseCase, n60.a aVar2, ym.b bVar, vm.f fVar, an.c cVar) {
        boolean z5;
        boolean z11;
        Flow<Boolean> flowOf;
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.u.j(dispatchers, "dispatchers");
        kotlin.jvm.internal.u.j(deviceModelRepository, "deviceModelRepository");
        kotlin.jvm.internal.u.j(featureActivationUseCase, "featureActivationUseCase");
        this.f40752a = nVar;
        this.f40753b = aVar;
        this.f40754c = dispatchers;
        this.f40755d = deviceModelRepository;
        this.f40756e = featureActivationUseCase;
        this.f40757f = aVar2;
        this.f40758g = bVar;
        this.f40759h = fVar;
        this.f40760i = cVar;
        Integer num = (Integer) savedStateHandle.c("device_model_id");
        this.f40761j = num;
        this.f40762k = kotlin.jvm.internal.u.e(savedStateHandle.c(DiscoverItems.Item.UPDATE_ACTION), Boolean.TRUE);
        Long l5 = (Long) savedStateHandle.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID);
        this.f40763l = l5;
        this.f40764m = (Long) savedStateHandle.c("device_id");
        this.f40765n = (String) savedStateHandle.c(FirebaseAnalytics.Param.DESTINATION);
        if (num == null || num.intValue() != -1) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f40766o = z5;
        b5.a.f20419a.getClass();
        if (a.b.c(context, "com.google.android.apps.healthdata") != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f40767p = z11;
        int i11 = wr.b.f106035c;
        this.f40768q = wr.b.d(FeatureFlag.f39109f);
        MutableSharedFlow<Throwable> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.f40769r = MutableSharedFlow$default;
        this.f40770s = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableStateFlow<g3> MutableStateFlow = StateFlowKt.MutableStateFlow(new g3());
        this.f40771t = MutableStateFlow;
        this.f40772u = FlowKt.asSharedFlow(MutableStateFlow);
        MutableStateFlow<CycleManualLoggingEvent> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CycleManualLoggingEvent.f41113a);
        this.f40773v = MutableStateFlow2;
        this.f40774w = FlowKt.asStateFlow(MutableStateFlow2);
        if (l5 != null) {
            flowOf = nVar.b(l5.longValue(), null);
        } else {
            flowOf = FlowKt.flowOf(Boolean.FALSE);
        }
        this.f40775x = flowOf;
        SharedFlow<Device> shareIn = FlowKt.shareIn(FlowKt.flowOn(FlowKt.flow(new a2(this, null)), dispatchers.a()), androidx.lifecycle.h1.a(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), 1);
        this.f40776y = shareIn;
        this.f40777z = new c2(shareIn, this);
        this.A = new d2(shareIn, this);
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), dispatchers.a(), null, new v1(this, null), 2, null);
        this.B = new z1(this);
    }

    private final Object M0(long j5, b.f fVar, qm0.d dVar, boolean z5) {
        LocalDate localDate;
        b.c cVar;
        CycleRegularity cycleRegularity;
        Integer num;
        int i11;
        gx.c a11 = fVar.a();
        LocalDate b10 = a11.b();
        if (z5) {
            localDate = b10;
        } else {
            localDate = null;
        }
        if (fVar instanceof b.c) {
            cVar = (b.c) fVar;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            cycleRegularity = cVar.c();
        } else {
            cycleRegularity = null;
        }
        if (cycleRegularity != null && cycleRegularity == CycleRegularity.f40684d) {
            Object a12 = this.f40758g.a(j5, b10, localDate, dVar);
            if (a12 == CoroutineSingletons.f76214a) {
                return a12;
            }
            return nm0.y.f85009a;
        }
        int c11 = a11.c();
        int a13 = a11.a();
        if (cycleRegularity != null) {
            if (cycleRegularity == CycleRegularity.f40683c) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            num = new Integer(i11);
        } else {
            num = null;
        }
        Object b11 = this.f40758g.b(j5, b10, localDate, c11, a13, num, dVar);
        if (b11 == CoroutineSingletons.f76214a) {
            return b11;
        }
        return nm0.y.f85009a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c1(CycleManualLoggingViewModel cycleManualLoggingViewModel, long j5, boolean z5, boolean z11, int i11) {
        boolean z12;
        boolean z13;
        if ((i11 & 2) != 0) {
            z12 = false;
        } else {
            z12 = z5;
        }
        if ((i11 & 4) != 0) {
            z13 = false;
        } else {
            z13 = z11;
        }
        cycleManualLoggingViewModel.getClass();
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(cycleManualLoggingViewModel), cycleManualLoggingViewModel.f40754c.a(), null, new b2(cycleManualLoggingViewModel, z12, j5, z13, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f0(com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel r5, long r6, org.joda.time.LocalDate r8, qm0.d r9) {
        /*
            r5.getClass()
            boolean r0 = r9 instanceof com.withings.manualLogging.ui.feature.addNote.cycle.w1
            if (r0 == 0) goto L16
            r0 = r9
            com.withings.manualLogging.ui.feature.addNote.cycle.w1 r0 = (com.withings.manualLogging.ui.feature.addNote.cycle.w1) r0
            int r1 = r0.f41387f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f41387f = r1
            goto L1b
        L16:
            com.withings.manualLogging.ui.feature.addNote.cycle.w1 r0 = new com.withings.manualLogging.ui.feature.addNote.cycle.w1
            r0.<init>(r5, r9)
        L1b:
            java.lang.Object r9 = r0.f41385d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f41387f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            nm0.l.b(r9)
            goto L79
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            long r6 = r0.f41384c
            org.joda.time.LocalDate r8 = r0.f41383b
            com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel r5 = r0.f41382a
            nm0.l.b(r9)
            goto L57
        L3f:
            nm0.l.b(r9)
            xm.a r9 = r5.f40753b
            kotlinx.coroutines.flow.Flow r9 = r9.d(r6, r8)
            r0.f41382a = r5
            r0.f41383b = r8
            r0.f41384c = r6
            r0.f41387f = r4
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r9, r0)
            if (r9 != r1) goto L57
            goto L7b
        L57:
            nm0.o r9 = (nm0.o) r9
            if (r9 == 0) goto L79
            java.lang.Object r9 = r9.b()
            wm.b$a r9 = (wm.b.a) r9
            wm.b$a$e$a r2 = wm.b.a.e.C1820a.f105799a
            boolean r9 = kotlin.jvm.internal.u.e(r9, r2)
            if (r9 != 0) goto L79
            ym.c r5 = r5.f40759h
            r9 = 0
            r0.f41382a = r9
            r0.f41383b = r9
            r0.f41387f = r3
            java.lang.Object r5 = r5.b(r6, r8, r0)
            if (r5 != r1) goto L79
            goto L7b
        L79:
            nm0.y r1 = nm0.y.f85009a
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.f0(com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel, long, org.joda.time.LocalDate, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g0(com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel r17, long r18, gx.b.f r20, boolean r21, qm0.d r22) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel.g0(com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel, long, gx.b$f, boolean, qm0.d):java.lang.Object");
    }

    public static final Object i0(CycleManualLoggingViewModel cycleManualLoggingViewModel, boolean z5, qm0.d dVar) {
        CycleManualLoggingEvent cycleManualLoggingEvent;
        if (!cycleManualLoggingViewModel.f40766o && z5) {
            cycleManualLoggingEvent = CycleManualLoggingEvent.f41117e;
        } else {
            cycleManualLoggingEvent = CycleManualLoggingEvent.f41116d;
        }
        Object emit = cycleManualLoggingViewModel.f40773v.emit(cycleManualLoggingEvent, dVar);
        if (emit != CoroutineSingletons.f76214a) {
            return nm0.y.f85009a;
        }
        return emit;
    }

    public final ym0.l<g3, nm0.y> O0() {
        return this.B;
    }

    public final d2 R0() {
        return this.A;
    }

    public final c2 T0() {
        return this.f40777z;
    }

    public final SharedFlow<Throwable> U0() {
        return this.f40770s;
    }

    public final StateFlow<CycleManualLoggingEvent> V0() {
        return this.f40774w;
    }

    public final Flow<Boolean> W0() {
        return this.f40768q;
    }

    public final boolean X0() {
        return this.f40767p;
    }

    public final Flow<Boolean> Y0() {
        return this.f40775x;
    }

    public final SharedFlow<g3> Z0() {
        return this.f40772u;
    }

    public final void a1(long j5, DateTime dateTime) {
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), this.f40754c.a(), null, new a(dateTime, j5, null), 2, null);
    }

    public final void d1(long j5, long j11, boolean z5) {
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), this.f40754c.a(), null, new b(j11, this, z5, j5, null), 2, null);
    }
}
