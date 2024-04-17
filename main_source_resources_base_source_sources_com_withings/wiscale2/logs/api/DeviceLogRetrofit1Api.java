package com.withings.wiscale2.logs.api;

import com.withings.webservices.legacy.common.exception.TooBigException;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
import retrofit.http.Query;
/* compiled from: DeviceLogRetrofit1Api.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/logs/api/DeviceLogRetrofit1Api;", "", "storeLogs", "deviceId", "", "data", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DeviceLogRetrofit1Api {
    @POST("/maint?action=store&source=4&type=2")
    @FormUrlEncoded
    Object storeLogs(@Query("deviceid") long j5, @Field("data") String str) throws TooBigException;
}
