package com.withings.screen.repository.ws;

import com.withings.screen.model.DeviceScreenContentResponse;
import com.withings.screen.repository.ws.api.DeviceScreensRetrofit2Api;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitDeviceScreensRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/screen/model/DeviceScreenContentResponse;", "Lcom/withings/screen/repository/ws/api/DeviceScreensRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.screen.repository.ws.RetrofitDeviceScreensRemoteRepository$getDeviceScreensContents$3", f = "RetrofitDeviceScreensRemoteRepository.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RetrofitDeviceScreensRemoteRepository$getDeviceScreensContents$3 extends i implements p<DeviceScreensRetrofit2Api, d<? super DeviceScreenContentResponse>, Object> {
    final /* synthetic */ long $deviceId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitDeviceScreensRemoteRepository$getDeviceScreensContents$3(long j5, d<? super RetrofitDeviceScreensRemoteRepository$getDeviceScreensContents$3> dVar) {
        super(2, dVar);
        this.$deviceId = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitDeviceScreensRemoteRepository$getDeviceScreensContents$3 retrofitDeviceScreensRemoteRepository$getDeviceScreensContents$3 = new RetrofitDeviceScreensRemoteRepository$getDeviceScreensContents$3(this.$deviceId, dVar);
        retrofitDeviceScreensRemoteRepository$getDeviceScreensContents$3.L$0 = obj;
        return retrofitDeviceScreensRemoteRepository$getDeviceScreensContents$3;
    }

    @Override // ym0.p
    public final Object invoke(DeviceScreensRetrofit2Api deviceScreensRetrofit2Api, d<? super DeviceScreenContentResponse> dVar) {
        return ((RetrofitDeviceScreensRemoteRepository$getDeviceScreensContents$3) create(deviceScreensRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            this.label = 1;
            obj = ((DeviceScreensRetrofit2Api) this.L$0).getDeviceScreensContents(j5, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
