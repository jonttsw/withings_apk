package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.manualLogging.ui.feature.addNote.cycle.model.CycleManualLoggingEvent;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleManualLoggingViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel$saveAndNotifyResult$1", f = "CycleManualLoggingViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_VASISTAS_TYPE_WALKING_ASYMETRY, ConstantsWs.MEASURE_TYPE_FAT_FREE_MASS_SEGMENT}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class b2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40921a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f40922b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CycleManualLoggingViewModel f40923c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f40924d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ long f40925e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f40926f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleManualLoggingViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel$saveAndNotifyResult$1$1", f = "CycleManualLoggingViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_R50KHZ_SEGMENT, ConstantsWs.MEASURE_TYPE_R250KHZ_SEGMENT, ConstantsWs.MEASURE_TYPE_SNORING_INTENSITY, ConstantsWs.MEASURE_TYPE_MENSTRUATION_FLOW, 186}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<Boolean, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        boolean f40927a;

        /* renamed from: b  reason: collision with root package name */
        Object f40928b;

        /* renamed from: c  reason: collision with root package name */
        CycleManualLoggingViewModel f40929c;

        /* renamed from: d  reason: collision with root package name */
        long f40930d;

        /* renamed from: e  reason: collision with root package name */
        int f40931e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ boolean f40932f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ CycleManualLoggingViewModel f40933g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f40934h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f40935i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f40936j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f40937k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CycleManualLoggingViewModel cycleManualLoggingViewModel, CoroutineScope coroutineScope, boolean z5, long j5, boolean z11, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f40933g = cycleManualLoggingViewModel;
            this.f40934h = coroutineScope;
            this.f40935i = z5;
            this.f40936j = j5;
            this.f40937k = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(this.f40933g, this.f40934h, this.f40935i, this.f40936j, this.f40937k, dVar);
            aVar.f40932f = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(Boolean bool, qm0.d<? super nm0.y> dVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:71:0x01b5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01c3  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01e5  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 506
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.manualLogging.ui.feature.addNote.cycle.b2.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(CycleManualLoggingViewModel cycleManualLoggingViewModel, boolean z5, long j5, boolean z11, qm0.d<? super b2> dVar) {
        super(2, dVar);
        this.f40923c = cycleManualLoggingViewModel;
        this.f40924d = z5;
        this.f40925e = j5;
        this.f40926f = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        b2 b2Var = new b2(this.f40923c, this.f40924d, this.f40925e, this.f40926f, dVar);
        b2Var.f40922b = obj;
        return b2Var;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((b2) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        MutableStateFlow mutableStateFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f40921a;
        CycleManualLoggingViewModel cycleManualLoggingViewModel = this.f40923c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.f40922b;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            coroutineScope = (CoroutineScope) this.f40922b;
            mutableStateFlow = cycleManualLoggingViewModel.f40773v;
            CycleManualLoggingEvent cycleManualLoggingEvent = CycleManualLoggingEvent.f41114b;
            this.f40922b = coroutineScope;
            this.f40921a = 1;
            if (mutableStateFlow.emit(cycleManualLoggingEvent, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        CoroutineScope coroutineScope2 = coroutineScope;
        Flow<Boolean> W0 = cycleManualLoggingViewModel.W0();
        a aVar = new a(this.f40923c, coroutineScope2, this.f40924d, this.f40925e, this.f40926f, null);
        this.f40922b = null;
        this.f40921a = 2;
        if (FlowKt.collectLatest(W0, aVar, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
