package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.wiscale2.device.common.feature.ecg.f5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationActivity$RegisterAnalytics$1$1", f = "WBS08EcgActivationActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class x8 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.o1<String> f52113a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(k1.o1<String> o1Var, qm0.d<? super x8> dVar) {
        super(2, dVar);
        this.f52113a = o1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new x8(this.f52113a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((x8) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        f5.c flowStep = f5.c.f51341c;
        int i11 = WBS08EcgActivationActivity.f51104f;
        String value = this.f52113a.getValue();
        kotlin.jvm.internal.u.j(flowStep, "flowStep");
        if (flowStep.a().length() > 0) {
            int i12 = v70.a.f103433b;
            v70.a.d("onboarding_ecg_scanwatch", "onboarding_ecg_scanwatch", kotlin.collections.s0.j(new nm0.j("flow_specificity", value), new nm0.j("flow_step_name", flowStep.a()), new nm0.j("flow_step_order", Integer.valueOf(flowStep.b()))), true);
        }
        return nm0.y.f85009a;
    }
}
