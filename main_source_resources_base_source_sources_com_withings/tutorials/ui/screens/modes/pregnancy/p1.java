package com.withings.tutorials.ui.screens.modes.pregnancy;

import com.withings.tutorials.core.UserMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PregnancyModeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel$hasPregnancyFeatureActivated$1", f = "PregnancyModeViewModel.kt", l = {89, 89}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class p1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super Boolean>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f46008a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f46009b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PregnancyModeViewModel f46010c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(PregnancyModeViewModel pregnancyModeViewModel, qm0.d<? super p1> dVar) {
        super(2, dVar);
        this.f46010c = pregnancyModeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        p1 p1Var = new p1(this.f46010c, dVar);
        p1Var.f46009b = obj;
        return p1Var;
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super Boolean> flowCollector, qm0.d<? super nm0.y> dVar) {
        return ((p1) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        y60.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f46008a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowCollector) this.f46009b;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            flowCollector = (FlowCollector) this.f46009b;
            PregnancyModeViewModel pregnancyModeViewModel = this.f46010c;
            aVar = pregnancyModeViewModel.f45788b;
            UserMode userMode = UserMode.f44571a;
            long j5 = pregnancyModeViewModel.f45798l;
            this.f46009b = flowCollector;
            this.f46008a = 1;
            obj = aVar.c(userMode, j5, null, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.f46009b = null;
        this.f46008a = 2;
        if (flowCollector.emit(obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
