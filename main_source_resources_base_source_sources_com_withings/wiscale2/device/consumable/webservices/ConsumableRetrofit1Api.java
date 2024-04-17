package com.withings.wiscale2.device.consumable.webservices;

import com.withings.wiscale2.device.consumable.model.GetConsumableResponse;
import kotlin.Metadata;
import retrofit.http.GET;
import retrofit.http.Query;
import u70.i;
/* compiled from: ConsumableRetrofit1Api.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/device/consumable/webservices/ConsumableRetrofit1Api;", "", "Lu70/i;", "mac", "Lcom/withings/wiscale2/device/consumable/model/GetConsumableResponse;", "get", "(Lu70/i;)Lcom/withings/wiscale2/device/consumable/model/GetConsumableResponse;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public interface ConsumableRetrofit1Api {
    @GET("/v2/consumable?action=get")
    GetConsumableResponse get(@Query("serial") i iVar);
}
