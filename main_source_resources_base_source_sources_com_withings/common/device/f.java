package com.withings.common.device;

import android.content.Context;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.Device;
import ej.w;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: BluetoothBondReceiver.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.common.device.BluetoothBondReceiver$checkAlreadyAssociatedAndStartConversationIfNecessary$1", f = "BluetoothBondReceiver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super WppDeviceConversation>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ gl.a f35188a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f35189b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ wi.c f35190c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(gl.a aVar, Context context, wi.c cVar, qm0.d<? super f> dVar) {
        super(2, dVar);
        this.f35188a = aVar;
        this.f35189b = context;
        this.f35190c = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new f(this.f35188a, this.f35189b, this.f35190c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super WppDeviceConversation> dVar) {
        return ((f) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        List<Device> m11 = kn.e.c().m();
        u.i(m11, "getDevices(...)");
        List<Device> list = m11;
        boolean z5 = list instanceof Collection;
        boolean z11 = false;
        wi.c cVar = this.f35190c;
        if (!z5 || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (jl.a.d(cVar, (Device) it.next())) {
                    z11 = true;
                    break;
                }
            }
        }
        Context context = this.f35189b;
        gl.a aVar = this.f35188a;
        WppDeviceConversation h02 = aVar.h0(context, z11);
        if (h02 == null) {
            return null;
        }
        return w.w().O(new cj.b(aVar.w().c(), cVar, null, null), h02, h02.getClass());
    }
}
