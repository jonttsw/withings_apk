package com.withings.comm.trace.api;

import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
import retrofit.http.Query;
/* compiled from: TraceRetrofit1Api.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u00020\u00012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'¢\u0006\u0002\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/withings/comm/trace/api/TraceRetrofit1Api;", "", "storeTrace", "deviceId", "", "type", "", "log", "", "(Ljava/lang/Long;ILjava/lang/String;)Ljava/lang/Object;", "library_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TraceRetrofit1Api {
    @POST("/maint?action=store&source=4")
    @FormUrlEncoded
    Object storeTrace(@Query("deviceid") Long l5, @Query("type") int i11, @Field("data") String str);
}
