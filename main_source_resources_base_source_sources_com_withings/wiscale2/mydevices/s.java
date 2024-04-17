package com.withings.wiscale2.mydevices;

import com.withings.device.Device;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import nm0.y;
/* compiled from: MyDevicesViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.mydevices.MyDevicesViewModel$devicesFlow$1$deviceListener$1$1", f = "MyDevicesViewModel.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class s extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f58711a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ProducerScope<List<? extends Device>> f58712b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MyDevicesViewModel f58713c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(ProducerScope<? super List<? extends Device>> producerScope, MyDevicesViewModel myDevicesViewModel, qm0.d<? super s> dVar) {
        super(2, dVar);
        this.f58712b = producerScope;
        this.f58713c = myDevicesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new s(this.f58712b, this.f58713c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((s) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f58711a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            List<Device> m11 = this.f58713c.f58594b.m();
            u.i(m11, "getDevices(...)");
            this.f58711a = 1;
            if (this.f58712b.send(m11, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
