package com.withings.wiscale2.device.common.feature.spo2;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: SpO2ActivationActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.spo2.Spo2ActivationViewModel$forceSpO2ScreenActivation$1", f = "SpO2ActivationActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class p extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f52540a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, qm0.d<? super p> dVar) {
        super(2, dVar);
        this.f52540a = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new p(this.f52540a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((p) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        com.withings.wiscale2.device.common.feature.c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        q qVar = this.f52540a;
        cVar = qVar.f52542b;
        cVar.d(10, qVar.f52541a);
        return y.f85009a;
    }
}
