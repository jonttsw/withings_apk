package com.withings.device.ws;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitDeviceRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/device/ws/StoreLink;", "Lcom/withings/device/ws/DeviceRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.device.ws.RetrofitDeviceRemoteRepository$storeLink$3", f = "RetrofitDeviceRemoteRepository.kt", l = {125}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitDeviceRemoteRepository$storeLink$3 extends i implements p<DeviceRetrofit2Api, d<? super StoreLink>, Object> {
    final /* synthetic */ String $sessionIdDevice;
    final /* synthetic */ Long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitDeviceRemoteRepository$storeLink$3(String str, Long l5, d<? super RetrofitDeviceRemoteRepository$storeLink$3> dVar) {
        super(2, dVar);
        this.$sessionIdDevice = str;
        this.$userId = l5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitDeviceRemoteRepository$storeLink$3 retrofitDeviceRemoteRepository$storeLink$3 = new RetrofitDeviceRemoteRepository$storeLink$3(this.$sessionIdDevice, this.$userId, dVar);
        retrofitDeviceRemoteRepository$storeLink$3.L$0 = obj;
        return retrofitDeviceRemoteRepository$storeLink$3;
    }

    @Override // ym0.p
    public final Object invoke(DeviceRetrofit2Api deviceRetrofit2Api, d<? super StoreLink> dVar) {
        return ((RetrofitDeviceRemoteRepository$storeLink$3) create(deviceRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            String str = this.$sessionIdDevice;
            Long l5 = this.$userId;
            this.label = 1;
            obj = ((DeviceRetrofit2Api) this.L$0).storeLink(str, l5, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
