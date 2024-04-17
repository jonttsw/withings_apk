package com.withings.tutorials.ui.screens.modes.pregnancy;

import android.content.Context;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.tutorials.android.modes.pregnancy.survey.DueDateMethod;
import com.withings.tutorials.core.UserMode;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
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
/* compiled from: PregnancyModeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/tutorials/ui/screens/modes/pregnancy/PregnancyModeViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PregnancyModeViewModel extends androidx.lifecycle.g1 {
    private final MutableSharedFlow<nm0.y> A;
    private final SharedFlow<nm0.y> B;
    private final SharedFlow<Boolean> F;
    private final MutableStateFlow<Throwable> G;
    private final SharedFlow<Throwable> M;
    private final MutableSharedFlow<com.withings.tutorials.ui.screens.modes.pregnancy.c> P;
    private final SharedFlow<com.withings.tutorials.ui.screens.modes.pregnancy.c> Q;
    private final MutableSharedFlow<w1> R;
    private final SharedFlow<w1> S;

    /* renamed from: a  reason: collision with root package name */
    private final y60.c f45787a;

    /* renamed from: b  reason: collision with root package name */
    private final y60.a f45788b;

    /* renamed from: c  reason: collision with root package name */
    private final u60.b f45789c;

    /* renamed from: d  reason: collision with root package name */
    private final y60.d f45790d;

    /* renamed from: e  reason: collision with root package name */
    private final y60.b f45791e;

    /* renamed from: f  reason: collision with root package name */
    private final xu.a f45792f;

    /* renamed from: g  reason: collision with root package name */
    private final z30.a f45793g;

    /* renamed from: h  reason: collision with root package name */
    private final w60.a f45794h;

    /* renamed from: i  reason: collision with root package name */
    private final ny.b f45795i;

    /* renamed from: j  reason: collision with root package name */
    private final iy.e f45796j;

    /* renamed from: k  reason: collision with root package name */
    private final w60.b f45797k;

    /* renamed from: l  reason: collision with root package name */
    private final long f45798l;

    /* renamed from: m  reason: collision with root package name */
    private final Long f45799m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f45800n;

    /* renamed from: o  reason: collision with root package name */
    private final MutableStateFlow<Long> f45801o;

    /* renamed from: p  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f45802p;

    /* renamed from: q  reason: collision with root package name */
    private final StateFlow<Boolean> f45803q;

    /* renamed from: r  reason: collision with root package name */
    private final StateFlow<Boolean> f45804r;

    /* renamed from: s  reason: collision with root package name */
    private final MutableStateFlow<DueDateMethod> f45805s;

    /* renamed from: t  reason: collision with root package name */
    private final MutableStateFlow<DateTime> f45806t;

    /* renamed from: u  reason: collision with root package name */
    private final t1 f45807u;

    /* renamed from: v  reason: collision with root package name */
    private final MutableStateFlow<DateTime> f45808v;

    /* renamed from: w  reason: collision with root package name */
    private final MutableStateFlow<DateTime> f45809w;

    /* renamed from: x  reason: collision with root package name */
    private final u1 f45810x;

    /* renamed from: y  reason: collision with root package name */
    private final Flow<Double> f45811y;

    /* renamed from: z  reason: collision with root package name */
    private final v1 f45812z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyModeViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel$changeFeatureActivation$1", f = "PregnancyModeViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_GLUCOSE_PERIOD}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f45813a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f45815c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z5, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f45815c = z5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f45815c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f45813a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                PregnancyModeViewModel pregnancyModeViewModel = PregnancyModeViewModel.this;
                y60.d dVar = pregnancyModeViewModel.f45790d;
                UserMode userMode = UserMode.f44571a;
                long j5 = pregnancyModeViewModel.f45798l;
                this.f45813a = 1;
                if (dVar.a(userMode, j5, this.f45815c, null, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyModeViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel$confirmActivation$1", f = "PregnancyModeViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_ECG_QT_INTERVAL_DURATION, ConstantsWs.MEASURE_TYPE_ECG_QTC_INTERVAL_DURATION}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f45816a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f45818c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ s60.a f45819d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, s60.a aVar, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f45818c = context;
            this.f45819d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f45818c, this.f45819d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f45816a;
            PregnancyModeViewModel pregnancyModeViewModel = PregnancyModeViewModel.this;
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
                this.f45816a = 1;
                if (pregnancyModeViewModel.l1(this.f45818c, this.f45819d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            this.f45816a = 2;
            if (PregnancyModeViewModel.F0(pregnancyModeViewModel, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyModeViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel", f = "PregnancyModeViewModel.kt", l = {ConstantsWs.WS_STATUS_UNAUTHORIZED, ConstantsWs.WS_STATUS_WRONGAPPLI}, m = "deleteObsoleteExistingPregnancyMeasuresGroupsToInsert")
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        PregnancyModeViewModel f45820a;

        /* renamed from: b  reason: collision with root package name */
        ky.d f45821b;

        /* renamed from: c  reason: collision with root package name */
        Iterator f45822c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f45823d;

        /* renamed from: f  reason: collision with root package name */
        int f45825f;

        c(qm0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f45823d = obj;
            this.f45825f |= Integer.MIN_VALUE;
            return PregnancyModeViewModel.this.M0(null, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyModeViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel", f = "PregnancyModeViewModel.kt", l = {208, 211, ConstantsWs.WS_STATUS_WRONGACCOUNTPARAMS, ConstantsWs.WS_STATUS_ACCOUNTACTIVATIONERROR, ConstantsWs.WS_STATUS_NOPWDUPDATECODE}, m = "save$ui_release")
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        PregnancyModeViewModel f45826a;

        /* renamed from: b  reason: collision with root package name */
        Object f45827b;

        /* renamed from: c  reason: collision with root package name */
        Object f45828c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f45829d;

        /* renamed from: f  reason: collision with root package name */
        int f45831f;

        d(qm0.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f45829d = obj;
            this.f45831f |= Integer.MIN_VALUE;
            return PregnancyModeViewModel.this.l1(null, null, this);
        }
    }

    @Inject
    public PregnancyModeViewModel(androidx.lifecycle.u0 savedStateHandle, xw.b dispatcher, y60.c synchronizePregnancyMeasureGroupUseCase, y60.a aVar, zb0.a aVar2, y60.d dVar, y60.b bVar, xu.a aVar3, z30.a aVar4, w60.a insertMeasureGroupUseCase, ny.b bVar2, iy.e measuresGroupRepositoryV2, w60.b lastPeriodDateConversionUseCase) {
        long j5;
        boolean z5;
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.u.j(dispatcher, "dispatcher");
        kotlin.jvm.internal.u.j(synchronizePregnancyMeasureGroupUseCase, "synchronizePregnancyMeasureGroupUseCase");
        kotlin.jvm.internal.u.j(insertMeasureGroupUseCase, "insertMeasureGroupUseCase");
        kotlin.jvm.internal.u.j(measuresGroupRepositoryV2, "measuresGroupRepositoryV2");
        kotlin.jvm.internal.u.j(lastPeriodDateConversionUseCase, "lastPeriodDateConversionUseCase");
        this.f45787a = synchronizePregnancyMeasureGroupUseCase;
        this.f45788b = aVar;
        this.f45789c = aVar2;
        this.f45790d = dVar;
        this.f45791e = bVar;
        this.f45792f = aVar3;
        this.f45793g = aVar4;
        this.f45794h = insertMeasureGroupUseCase;
        this.f45795i = bVar2;
        this.f45796j = measuresGroupRepositoryV2;
        this.f45797k = lastPeriodDateConversionUseCase;
        Long l5 = (Long) savedStateHandle.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID);
        if (l5 != null) {
            j5 = l5.longValue();
        } else {
            j5 = -1;
        }
        this.f45798l = j5;
        this.f45799m = (Long) savedStateHandle.c("device_id");
        Boolean bool = (Boolean) savedStateHandle.c("SHOULD_FINISH_IF_NO_DEVICE_FOUND_EXTRA");
        if (bool != null) {
            z5 = bool.booleanValue();
        } else {
            z5 = false;
        }
        this.f45800n = z5;
        this.f45801o = StateFlowKt.MutableStateFlow(null);
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f45802p = MutableStateFlow;
        this.f45803q = FlowKt.asStateFlow(MutableStateFlow);
        Flow flowOn = FlowKt.flowOn(FlowKt.flow(new p1(this, null)), dispatcher.a());
        CoroutineScope a11 = androidx.lifecycle.h1.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.f45804r = FlowKt.stateIn(flowOn, a11, companion.getEagerly(), null);
        this.f45805s = StateFlowKt.MutableStateFlow(null);
        DateTime now = DateTime.now();
        kotlin.jvm.internal.u.i(now, "now(...)");
        MutableStateFlow<DateTime> MutableStateFlow2 = StateFlowKt.MutableStateFlow(now);
        this.f45806t = MutableStateFlow2;
        this.f45807u = new t1(MutableStateFlow2);
        DateTime now2 = DateTime.now();
        kotlin.jvm.internal.u.i(now2, "now(...)");
        MutableStateFlow<DateTime> MutableStateFlow3 = StateFlowKt.MutableStateFlow(now2);
        this.f45808v = MutableStateFlow3;
        DateTime now3 = DateTime.now();
        kotlin.jvm.internal.u.i(now3, "now(...)");
        MutableStateFlow<DateTime> MutableStateFlow4 = StateFlowKt.MutableStateFlow(now3);
        this.f45809w = MutableStateFlow4;
        u1 u1Var = new u1(MutableStateFlow3, this);
        this.f45810x = u1Var;
        this.f45811y = FlowKt.flowCombine(MutableStateFlow4, MutableStateFlow3, new s1(this, null));
        this.f45812z = new v1(u1Var);
        MutableSharedFlow<nm0.y> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.A = MutableSharedFlow$default;
        this.B = FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.F = FlowKt.shareIn(FlowKt.flow(new o1(this, null)), androidx.lifecycle.h1.a(this), companion.getEagerly(), 1);
        MutableStateFlow<Throwable> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.G = MutableStateFlow5;
        this.M = FlowKt.asSharedFlow(MutableStateFlow5);
        MutableSharedFlow<com.withings.tutorials.ui.screens.modes.pregnancy.c> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.P = MutableSharedFlow$default2;
        this.Q = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        MutableSharedFlow<w1> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.R = MutableSharedFlow$default3;
        this.S = FlowKt.asSharedFlow(MutableSharedFlow$default3);
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), dispatcher.a(), null, new m1(this, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F0(com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel r6, qm0.d r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof com.withings.tutorials.ui.screens.modes.pregnancy.q1
            if (r0 == 0) goto L16
            r0 = r7
            com.withings.tutorials.ui.screens.modes.pregnancy.q1 r0 = (com.withings.tutorials.ui.screens.modes.pregnancy.q1) r0
            int r1 = r0.f46118d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f46118d = r1
            goto L1b
        L16:
            com.withings.tutorials.ui.screens.modes.pregnancy.q1 r0 = new com.withings.tutorials.ui.screens.modes.pregnancy.q1
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f46116b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f46118d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            nm0.l.b(r7)
            goto L60
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel r6 = r0.f46115a
            nm0.l.b(r7)
            goto L4d
        L3b:
            nm0.l.b(r7)
            r0.f46115a = r6
            r0.f46118d = r4
            xu.a r7 = r6.f45792f
            long r4 = r6.f45798l
            java.lang.Object r7 = r7.b(r4, r0)
            if (r7 != r1) goto L4d
            goto L62
        L4d:
            kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
            com.withings.tutorials.ui.screens.modes.pregnancy.r1 r2 = new com.withings.tutorials.ui.screens.modes.pregnancy.r1
            r2.<init>(r6)
            r6 = 0
            r0.f46115a = r6
            r0.f46118d = r3
            java.lang.Object r6 = r7.collect(r2, r0)
            if (r6 != r1) goto L60
            goto L62
        L60:
            nm0.y r1 = nm0.y.f85009a
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel.F0(com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M0(ky.d r20, int r21, qm0.d<? super nm0.y> r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r22
            boolean r2 = r1 instanceof com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel.c
            if (r2 == 0) goto L17
            r2 = r1
            com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel$c r2 = (com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel.c) r2
            int r3 = r2.f45825f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f45825f = r3
            goto L1c
        L17:
            com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel$c r2 = new com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel$c
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f45823d
            kotlin.coroutines.intrinsics.CoroutineSingletons r15 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r3 = r2.f45825f
            r14 = 2
            r4 = 1
            if (r3 == 0) goto L4a
            if (r3 == r4) goto L3f
            if (r3 != r14) goto L37
            java.util.Iterator r3 = r2.f45822c
            ky.d r4 = r2.f45821b
            com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel r5 = r2.f45820a
            nm0.l.b(r1)
            r6 = r14
            r1 = r15
            goto L98
        L37:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3f:
            ky.d r3 = r2.f45821b
            com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel r4 = r2.f45820a
            nm0.l.b(r1)
            r5 = r4
            r4 = r1
            r1 = r15
            goto L8b
        L4a:
            nm0.l.b(r1)
            org.joda.time.DateTime r1 = r20.c()
            long r5 = r1.getMillis()
            r1 = 20001(0x4e21, float:2.8027E-41)
            int[] r10 = new int[]{r1}
            int[] r1 = new int[]{r21}
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r5)
            r2.f45820a = r0
            r13 = r20
            r2.f45821b = r13
            r2.f45825f = r4
            r16 = 0
            r17 = 980(0x3d4, float:1.373E-42)
            iy.e r3 = r0.f45796j
            long r4 = r0.f45798l
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r6 = r1
            r13 = r16
            r1 = r14
            r14 = r2
            r1 = r15
            r15 = r17
            java.lang.Object r3 = iy.e.a(r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r3 != r1) goto L87
            return r1
        L87:
            r5 = r0
            r4 = r3
            r3 = r20
        L8b:
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
            r18 = r4
            r4 = r3
            r3 = r18
        L98:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto Lbc
            java.lang.Object r6 = r3.next()
            ky.d r6 = (ky.d) r6
            ny.b r7 = r5.f45795i
            long r8 = r6.d()
            r2.f45820a = r5
            r2.f45821b = r4
            r2.f45822c = r3
            r6 = 2
            r2.f45825f = r6
            java.lang.String r10 = "syncAfterPregnancyActivation"
            java.lang.Object r7 = r7.d(r8, r10, r2)
            if (r7 != r1) goto L98
            return r1
        Lbc:
            w60.a r1 = r5.f45794h
            long r2 = r5.f45798l
            r1.a(r2, r4)
            nm0.y r1 = nm0.y.f85009a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel.M0(ky.d, int, qm0.d):java.lang.Object");
    }

    public final void G0(boolean z5) {
        if (this.f45801o.getValue() != null) {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new a(z5, null), 2, null);
        }
    }

    public final void K0(Context context, s60.a weightFormState) {
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(weightFormState, "weightFormState");
        if (!kotlin.jvm.internal.u.e(this.f45804r.getValue(), Boolean.TRUE)) {
            G0(true);
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new b(context, weightFormState, null), 2, null);
            return;
        }
        throw new PregnancyModeFlowAlreadyCompletedException();
    }

    public final MutableStateFlow<DateTime> O0() {
        return this.f45809w;
    }

    public final u1 R0() {
        return this.f45810x;
    }

    public final MutableStateFlow<DateTime> T0() {
        return this.f45806t;
    }

    public final MutableStateFlow<DueDateMethod> U0() {
        return this.f45805s;
    }

    public final SharedFlow<Throwable> V0() {
        return this.M;
    }

    public final SharedFlow<nm0.y> W0() {
        return this.B;
    }

    public final t1 X0() {
        return this.f45807u;
    }

    public final SharedFlow<Boolean> Y0() {
        return this.F;
    }

    public final StateFlow<Boolean> Z0() {
        return this.f45804r;
    }

    public final SharedFlow<com.withings.tutorials.ui.screens.modes.pregnancy.c> a1() {
        return this.Q;
    }

    public final MutableStateFlow<DateTime> c1() {
        return this.f45808v;
    }

    public final Flow<Double> d1() {
        return this.f45811y;
    }

    public final String e1(String currentDestination) {
        kotlin.jvm.internal.u.j(currentDestination, "currentDestination");
        if (this.f45804r.getValue() != null) {
            boolean e11 = kotlin.jvm.internal.u.e(currentDestination, "disabledFeatures");
            MutableStateFlow<Boolean> mutableStateFlow = this.f45802p;
            if (!e11 || mutableStateFlow.getValue().booleanValue()) {
                if (kotlin.jvm.internal.u.e(currentDestination, "deactivation")) {
                    return "turnOffConfirmationBottomSheet";
                }
                String str = "babyDue";
                if (!kotlin.jvm.internal.u.e(currentDestination, "activation")) {
                    str = "weight";
                    if (!kotlin.jvm.internal.u.e(currentDestination, "babyDue")) {
                        if (kotlin.jvm.internal.u.e(currentDestination, "weight") && !mutableStateFlow.getValue().booleanValue()) {
                            return "disabledFeatures";
                        }
                        boolean e12 = kotlin.jvm.internal.u.e(currentDestination, "calculateDueDate");
                        MutableStateFlow<DueDateMethod> mutableStateFlow2 = this.f45805s;
                        if (e12 && mutableStateFlow2.getValue() == DueDateMethod.f44546a) {
                            return "lastPeriod";
                        }
                        if (kotlin.jvm.internal.u.e(currentDestination, "calculateDueDate") && mutableStateFlow2.getValue() == DueDateMethod.f44547b) {
                            return "conceptionDate";
                        }
                        if (!kotlin.collections.x.W("lastPeriod", "conceptionDate").contains(currentDestination)) {
                            return null;
                        }
                    }
                }
                return str;
            }
        }
        return "loading";
    }

    public final StateFlow<Boolean> g1() {
        return this.f45803q;
    }

    public final SharedFlow<w1> i1() {
        return this.S;
    }

    public final v1 k1() {
        return this.f45812z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l1(android.content.Context r19, s60.a r20, qm0.d<? super nm0.y> r21) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel.l1(android.content.Context, s60.a, qm0.d):java.lang.Object");
    }

    public final void m1(DateTime dateTime) {
        kotlin.jvm.internal.u.j(dateTime, "dateTime");
        MutableStateFlow<DateTime> mutableStateFlow = this.f45809w;
        if (!kotlin.jvm.internal.u.e(mutableStateFlow.getValue(), dateTime)) {
            mutableStateFlow.setValue(dateTime);
            this.f45808v.setValue(this.f45797k.a(dateTime));
        }
    }

    public final void n1(DateTime dateTime) {
        kotlin.jvm.internal.u.j(dateTime, "dateTime");
        MutableStateFlow<DateTime> mutableStateFlow = this.f45806t;
        if (!kotlin.jvm.internal.u.e(mutableStateFlow.getValue(), dateTime)) {
            mutableStateFlow.setValue(dateTime);
            this.f45808v.setValue(this.f45797k.d(dateTime));
        }
    }

    public final void o1(DueDateMethod method) {
        kotlin.jvm.internal.u.j(method, "method");
        MutableStateFlow<DueDateMethod> mutableStateFlow = this.f45805s;
        if (mutableStateFlow.getValue() != method) {
            mutableStateFlow.setValue(method);
        }
    }

    public final void q1(DateTime dateTime) {
        kotlin.jvm.internal.u.j(dateTime, "dateTime");
        MutableStateFlow<DateTime> mutableStateFlow = this.f45808v;
        if (!kotlin.jvm.internal.u.e(mutableStateFlow.getValue(), dateTime)) {
            mutableStateFlow.setValue(dateTime);
            this.f45806t.setValue(this.f45797k.c(dateTime));
        }
    }
}
