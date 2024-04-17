package com.withings.device.details;

import com.withings.device.Device;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DissociateDeviceUseCase.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.DeleteOtherAssociationsUseCase$delete$2", f = "DissociateDeviceUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ nn.b f36752a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Device f36753b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(nn.b bVar, Device device, qm0.d<? super c> dVar) {
        super(2, dVar);
        this.f36752a = bVar;
        this.f36753b = device;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new c(this.f36752a, this.f36753b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        vf.c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        cVar = this.f36752a.f85014a;
        new kn.d(cVar.h().e(), this.f36753b).run();
        return nm0.y.f85009a;
    }
}
