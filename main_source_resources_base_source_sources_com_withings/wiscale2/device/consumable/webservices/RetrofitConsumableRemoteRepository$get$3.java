package com.withings.wiscale2.device.consumable.webservices;

import com.withings.wiscale2.device.consumable.model.GetConsumableResponse;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitConsumableRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/wiscale2/device/consumable/model/GetConsumableResponse;", "Lcom/withings/wiscale2/device/consumable/webservices/ConsumableRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.wiscale2.device.consumable.webservices.RetrofitConsumableRemoteRepository$get$3", f = "RetrofitConsumableRemoteRepository.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class RetrofitConsumableRemoteRepository$get$3 extends i implements p<ConsumableRetrofit2Api, d<? super GetConsumableResponse>, Object> {
    final /* synthetic */ u70.i $mac;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitConsumableRemoteRepository$get$3(u70.i iVar, d<? super RetrofitConsumableRemoteRepository$get$3> dVar) {
        super(2, dVar);
        this.$mac = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitConsumableRemoteRepository$get$3 retrofitConsumableRemoteRepository$get$3 = new RetrofitConsumableRemoteRepository$get$3(this.$mac, dVar);
        retrofitConsumableRemoteRepository$get$3.L$0 = obj;
        return retrofitConsumableRemoteRepository$get$3;
    }

    @Override // ym0.p
    public final Object invoke(ConsumableRetrofit2Api consumableRetrofit2Api, d<? super GetConsumableResponse> dVar) {
        return ((RetrofitConsumableRemoteRepository$get$3) create(consumableRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            u70.i iVar = this.$mac;
            this.label = 1;
            obj = ((ConsumableRetrofit2Api) this.L$0).get(iVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
