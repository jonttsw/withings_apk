package com.withings.nervehealth.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: NerveHealthViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.NerveHealthViewModel$onShowNormalityChange$1", f = "NerveHealthViewModel.kt", l = {219, 218}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class q0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    j00.f f42763a;

    /* renamed from: b  reason: collision with root package name */
    int f42764b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NerveHealthViewModel f42765c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f42766d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(NerveHealthViewModel nerveHealthViewModel, boolean z5, qm0.d<? super q0> dVar) {
        super(2, dVar);
        this.f42765c = nerveHealthViewModel;
        this.f42766d = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new q0(this.f42765c, this.f42766d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((q0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        j00.f fVar;
        Flow flow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f42764b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = this.f42763a;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            NerveHealthViewModel nerveHealthViewModel = this.f42765c;
            fVar = nerveHealthViewModel.f42408h;
            flow = nerveHealthViewModel.f42423w;
            this.f42763a = fVar;
            this.f42764b = 1;
            obj = FlowKt.first(flow, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        ((l00.b) obj).getClass();
        l00.b bVar = new l00.b(this.f42766d);
        this.f42763a = null;
        this.f42764b = 2;
        if (fVar.a(bVar, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
