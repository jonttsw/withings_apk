package com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: Wpa02CartridgeActivationViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.Wpa02CartridgeActivationViewModel$onCartridgeInfoReceived$2$1", f = "Wpa02CartridgeActivationViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class g0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0 f55178a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(b0 b0Var, qm0.d<? super g0> dVar) {
        super(2, dVar);
        this.f55178a = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new g0(this.f55178a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((g0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        this.f55178a.f55131i.d();
        return nm0.y.f85009a;
    }
}
