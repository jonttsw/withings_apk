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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/device/ws/Associations;", "Lcom/withings/device/ws/DeviceRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.device.ws.RetrofitDeviceRemoteRepository$getAssociations$3", f = "RetrofitDeviceRemoteRepository.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitDeviceRemoteRepository$getAssociations$3 extends i implements p<DeviceRetrofit2Api, d<? super Associations>, Object> {
    final /* synthetic */ String $enrich;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitDeviceRemoteRepository$getAssociations$3(String str, d<? super RetrofitDeviceRemoteRepository$getAssociations$3> dVar) {
        super(2, dVar);
        this.$enrich = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitDeviceRemoteRepository$getAssociations$3 retrofitDeviceRemoteRepository$getAssociations$3 = new RetrofitDeviceRemoteRepository$getAssociations$3(this.$enrich, dVar);
        retrofitDeviceRemoteRepository$getAssociations$3.L$0 = obj;
        return retrofitDeviceRemoteRepository$getAssociations$3;
    }

    @Override // ym0.p
    public final Object invoke(DeviceRetrofit2Api deviceRetrofit2Api, d<? super Associations> dVar) {
        return ((RetrofitDeviceRemoteRepository$getAssociations$3) create(deviceRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            String str = this.$enrich;
            this.label = 1;
            obj = ((DeviceRetrofit2Api) this.L$0).getAssociations(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
