package com.withings.device.ws;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitDeviceRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/device/ws/SharePublicKey;", "Lcom/withings/device/ws/DeviceRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.device.ws.RetrofitDeviceRemoteRepository$createPublicKey$3", f = "RetrofitDeviceRemoteRepository.kt", l = {ConstantsWs.WS_STATUS_NOPRIMARYUSER}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitDeviceRemoteRepository$createPublicKey$3 extends i implements p<DeviceRetrofit2Api, d<? super SharePublicKey>, Object> {
    final /* synthetic */ long $deviceId;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitDeviceRemoteRepository$createPublicKey$3(long j5, long j11, d<? super RetrofitDeviceRemoteRepository$createPublicKey$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$deviceId = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitDeviceRemoteRepository$createPublicKey$3 retrofitDeviceRemoteRepository$createPublicKey$3 = new RetrofitDeviceRemoteRepository$createPublicKey$3(this.$userId, this.$deviceId, dVar);
        retrofitDeviceRemoteRepository$createPublicKey$3.L$0 = obj;
        return retrofitDeviceRemoteRepository$createPublicKey$3;
    }

    @Override // ym0.p
    public final Object invoke(DeviceRetrofit2Api deviceRetrofit2Api, d<? super SharePublicKey> dVar) {
        return ((RetrofitDeviceRemoteRepository$createPublicKey$3) create(deviceRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            long j5 = this.$userId;
            long j11 = this.$deviceId;
            this.label = 1;
            obj = ((DeviceRetrofit2Api) this.L$0).createPublicKey(j5, j11, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
