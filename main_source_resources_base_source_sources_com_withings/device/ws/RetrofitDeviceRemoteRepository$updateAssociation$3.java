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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/device/ws/DeviceRetrofit2Api;", "Lnm0/y;", "<anonymous>", "(Lcom/withings/device/ws/DeviceRetrofit2Api;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.device.ws.RetrofitDeviceRemoteRepository$updateAssociation$3", f = "RetrofitDeviceRemoteRepository.kt", l = {75}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitDeviceRemoteRepository$updateAssociation$3 extends i implements p<DeviceRetrofit2Api, d<? super y>, Object> {
    final /* synthetic */ long $associationId;
    final /* synthetic */ String $data;
    final /* synthetic */ String $name;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitDeviceRemoteRepository$updateAssociation$3(long j5, String str, String str2, d<? super RetrofitDeviceRemoteRepository$updateAssociation$3> dVar) {
        super(2, dVar);
        this.$associationId = j5;
        this.$name = str;
        this.$data = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitDeviceRemoteRepository$updateAssociation$3 retrofitDeviceRemoteRepository$updateAssociation$3 = new RetrofitDeviceRemoteRepository$updateAssociation$3(this.$associationId, this.$name, this.$data, dVar);
        retrofitDeviceRemoteRepository$updateAssociation$3.L$0 = obj;
        return retrofitDeviceRemoteRepository$updateAssociation$3;
    }

    @Override // ym0.p
    public final Object invoke(DeviceRetrofit2Api deviceRetrofit2Api, d<? super y> dVar) {
        return ((RetrofitDeviceRemoteRepository$updateAssociation$3) create(deviceRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            long j5 = this.$associationId;
            String str = this.$name;
            String str2 = this.$data;
            this.label = 1;
            if (((DeviceRetrofit2Api) this.L$0).updateAssociation(j5, str, str2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
