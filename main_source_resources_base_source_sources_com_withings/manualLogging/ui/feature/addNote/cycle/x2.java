package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.manualLogging.ui.feature.addNote.cycle.model.CycleManualLoggingEvent;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: CycleOnBoardingManualLoggingActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.CycleOnBoardingManualLoggingActivity$onCreate$1$1$2", f = "CycleOnBoardingManualLoggingActivity.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class x2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f41404a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CycleOnBoardingManualLoggingActivity f41405b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f41406c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f41407d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleOnBoardingManualLoggingActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r8.n f41408a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CycleOnBoardingManualLoggingActivity f41409b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.r0<String> f41410c;

        a(r8.n nVar, CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity, k1.r0<String> r0Var) {
            this.f41408a = nVar;
            this.f41409b = cycleOnBoardingManualLoggingActivity;
            this.f41410c = r0Var;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            long userId;
            boolean M3;
            CycleManualLoggingEvent cycleManualLoggingEvent = (CycleManualLoggingEvent) obj;
            CycleManualLoggingEvent cycleManualLoggingEvent2 = CycleManualLoggingEvent.f41114b;
            r8.n nVar = this.f41408a;
            if (cycleManualLoggingEvent == cycleManualLoggingEvent2) {
                int i11 = t0.f41220b;
                kotlin.jvm.internal.u.j(nVar, "<this>");
                androidx.navigation.e.L(nVar, "loading", null, 6);
            } else {
                CycleManualLoggingEvent cycleManualLoggingEvent3 = CycleManualLoggingEvent.f41115c;
                CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity = this.f41409b;
                if (cycleManualLoggingEvent == cycleManualLoggingEvent3) {
                    M3 = cycleOnBoardingManualLoggingActivity.M3();
                    if (M3) {
                        int i12 = t0.f41220b;
                        kotlin.jvm.internal.u.j(nVar, "<this>");
                        nVar.J("regularity", new r0(nVar, true));
                    }
                }
                if (cycleManualLoggingEvent == cycleManualLoggingEvent3) {
                    this.f41410c.setValue("cycle_tutorial_introduction");
                } else if (cycleManualLoggingEvent == CycleManualLoggingEvent.f41117e) {
                    userId = cycleOnBoardingManualLoggingActivity.getUserId();
                    CycleOnBoardingManualLoggingActivity.I3(cycleOnBoardingManualLoggingActivity, userId);
                } else if (cycleManualLoggingEvent == CycleManualLoggingEvent.f41116d) {
                    cycleOnBoardingManualLoggingActivity.finish();
                } else if (cycleManualLoggingEvent == CycleManualLoggingEvent.f41118f) {
                    kotlin.jvm.internal.u.j(nVar, "<this>");
                    androidx.navigation.e.L(nVar, "cycle_tutorial_logwatch", null, 6);
                } else if (cycleManualLoggingEvent == CycleManualLoggingEvent.f41119g) {
                    kotlin.jvm.internal.u.j(nVar, "<this>");
                    androidx.navigation.e.L(nVar, "cycle_tutorial_log", null, 6);
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity, r8.n nVar, k1.r0<String> r0Var, qm0.d<? super x2> dVar) {
        super(2, dVar);
        this.f41405b = cycleOnBoardingManualLoggingActivity;
        this.f41406c = nVar;
        this.f41407d = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new x2(this.f41405b, this.f41406c, this.f41407d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        ((x2) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        return CoroutineSingletons.f76214a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f41404a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity = this.f41405b;
            StateFlow<CycleManualLoggingEvent> V0 = CycleOnBoardingManualLoggingActivity.F3(cycleOnBoardingManualLoggingActivity).V0();
            a aVar = new a(this.f41406c, cycleOnBoardingManualLoggingActivity, this.f41407d);
            this.f41404a = 1;
            if (V0.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        throw new KotlinNothingValueException();
    }
}
