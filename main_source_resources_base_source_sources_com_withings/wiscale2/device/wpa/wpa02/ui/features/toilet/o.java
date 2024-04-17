package com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import se0.a;
/* compiled from: ToiletDeviceViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet.ToiletDeviceViewModel$onConnectionClosed$1", f = "ToiletDeviceViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class o extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k f55437a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(k kVar, qm0.d<? super o> dVar) {
        super(2, dVar);
        this.f55437a = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new o(this.f55437a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((o) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        this.f55437a.f55412i.setValue(a.b.f.f96918a);
        return nm0.y.f85009a;
    }
}
