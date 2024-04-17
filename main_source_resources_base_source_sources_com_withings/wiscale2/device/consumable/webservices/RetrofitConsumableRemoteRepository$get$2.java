package com.withings.wiscale2.device.consumable.webservices;

import com.withings.wiscale2.device.consumable.model.GetConsumableResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import u70.i;
import ym0.l;
/* compiled from: RetrofitConsumableRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/wiscale2/device/consumable/model/GetConsumableResponse;", "Lcom/withings/wiscale2/device/consumable/webservices/ConsumableRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class RetrofitConsumableRemoteRepository$get$2 extends w implements l<ConsumableRetrofit1Api, GetConsumableResponse> {
    final /* synthetic */ i $mac;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitConsumableRemoteRepository$get$2(i iVar) {
        super(1);
        this.$mac = iVar;
    }

    @Override // ym0.l
    public final GetConsumableResponse invoke(ConsumableRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.get(this.$mac);
    }
}
