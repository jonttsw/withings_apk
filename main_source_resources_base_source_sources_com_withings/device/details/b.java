package com.withings.device.details;

import com.withings.device.Device;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: DissociateDeviceUseCase.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.DeleteLinkUseCase$delete$2", f = "DissociateDeviceUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Device f36750a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Device device, qm0.d<? super b> dVar) {
        super(2, dVar);
        this.f36750a = device;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new b(this.f36750a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        new kn.c(this.f36750a).run();
        return nm0.y.f85009a;
    }
}
