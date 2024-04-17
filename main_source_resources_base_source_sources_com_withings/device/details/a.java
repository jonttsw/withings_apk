package com.withings.device.details;

import android.content.Context;
import com.withings.device.Device;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DissociateDeviceUseCase.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.DeleteAssociationUseCase$delete$2", f = "DissociateDeviceUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ nn.a f36654a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Device f36655b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(nn.a aVar, Device device, qm0.d<? super a> dVar) {
        super(2, dVar);
        this.f36654a = aVar;
        this.f36655b = device;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new a(this.f36654a, this.f36655b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        vf.c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        nn.a aVar = this.f36654a;
        context = aVar.f85012a;
        cVar = aVar.f85013b;
        new kn.b(cVar.h().e(), context, this.f36655b).run();
        return nm0.y.f85009a;
    }
}
