package com.withings.manualLogging.ui.feature.addNote.cycle;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: CycleOnBoardingManualLoggingActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.CycleOnBoardingManualLoggingActivity$onCreate$1$1$1", f = "CycleOnBoardingManualLoggingActivity.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class w2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f41388a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CycleOnBoardingManualLoggingActivity f41389b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleOnBoardingManualLoggingActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CycleOnBoardingManualLoggingActivity f41390a;

        a(CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity) {
            this.f41390a = cycleOnBoardingManualLoggingActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            Throwable th2 = (Throwable) obj;
            if (th2 != null) {
                CycleOnBoardingManualLoggingActivity.G3(this.f41390a, th2);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity, qm0.d<? super w2> dVar) {
        super(2, dVar);
        this.f41389b = cycleOnBoardingManualLoggingActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new w2(this.f41389b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        ((w2) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        return CoroutineSingletons.f76214a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f41388a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity = this.f41389b;
            SharedFlow<Throwable> U0 = CycleOnBoardingManualLoggingActivity.F3(cycleOnBoardingManualLoggingActivity).U0();
            a aVar = new a(cycleOnBoardingManualLoggingActivity);
            this.f41388a = 1;
            if (U0.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        throw new KotlinNothingValueException();
    }
}
