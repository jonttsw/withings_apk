package com.withings.device.ws;

import com.withings.library.authentication.api.ConstantsWs;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitDeviceRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/device/ws/DeviceRetrofit2Api;", "Lnm0/y;", "<anonymous>", "(Lcom/withings/device/ws/DeviceRetrofit2Api;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.device.ws.RetrofitDeviceRemoteRepository$setSettings$3", f = "RetrofitDeviceRemoteRepository.kt", l = {ConstantsWs.MEASURE_TYPE_LUTEINIZING_HORMONE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitDeviceRemoteRepository$setSettings$3 extends i implements p<DeviceRetrofit2Api, d<? super y>, Object> {
    final /* synthetic */ long $deviceId;
    final /* synthetic */ Map<String, Object> $options;
    final /* synthetic */ int $type;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitDeviceRemoteRepository$setSettings$3(long j5, int i11, Map<String, ? extends Object> map, d<? super RetrofitDeviceRemoteRepository$setSettings$3> dVar) {
        super(2, dVar);
        this.$deviceId = j5;
        this.$type = i11;
        this.$options = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitDeviceRemoteRepository$setSettings$3 retrofitDeviceRemoteRepository$setSettings$3 = new RetrofitDeviceRemoteRepository$setSettings$3(this.$deviceId, this.$type, this.$options, dVar);
        retrofitDeviceRemoteRepository$setSettings$3.L$0 = obj;
        return retrofitDeviceRemoteRepository$setSettings$3;
    }

    @Override // ym0.p
    public final Object invoke(DeviceRetrofit2Api deviceRetrofit2Api, d<? super y> dVar) {
        return ((RetrofitDeviceRemoteRepository$setSettings$3) create(deviceRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            long j5 = this.$deviceId;
            int i12 = this.$type;
            Map<String, ? extends Object> map = this.$options;
            this.label = 1;
            if (((DeviceRetrofit2Api) this.L$0).setSettings(j5, i12, map, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
