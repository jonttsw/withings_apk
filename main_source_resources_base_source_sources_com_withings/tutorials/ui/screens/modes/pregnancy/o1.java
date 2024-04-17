package com.withings.tutorials.ui.screens.modes.pregnancy;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PregnancyModeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel$hasAnyModeEnabled$1", f = "PregnancyModeViewModel.kt", l = {107, 107}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class o1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super Boolean>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f46004a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f46005b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PregnancyModeViewModel f46006c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(PregnancyModeViewModel pregnancyModeViewModel, qm0.d<? super o1> dVar) {
        super(2, dVar);
        this.f46006c = pregnancyModeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        o1 o1Var = new o1(this.f46006c, dVar);
        o1Var.f46005b = obj;
        return o1Var;
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super Boolean> flowCollector, qm0.d<? super nm0.y> dVar) {
        return ((o1) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        y60.b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f46004a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowCollector) this.f46005b;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            flowCollector = (FlowCollector) this.f46005b;
            PregnancyModeViewModel pregnancyModeViewModel = this.f46006c;
            bVar = pregnancyModeViewModel.f45791e;
            long j5 = pregnancyModeViewModel.f45798l;
            this.f46005b = flowCollector;
            this.f46004a = 1;
            obj = bVar.c(j5, null, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.f46005b = null;
        this.f46004a = 2;
        if (flowCollector.emit(obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
