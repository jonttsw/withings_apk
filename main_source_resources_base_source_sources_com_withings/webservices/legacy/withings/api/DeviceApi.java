package com.withings.webservices.legacy.withings.api;

import com.withings.webservices.legacy.withings.model.measure.StoreMeasureResponse;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
import retrofit.http.Query;
@Deprecated
/* loaded from: classes4.dex */
public interface DeviceApi {
    @POST("/v2/measure?action=storehf")
    @FormUrlEncoded
    Object storeHFMeasure(@Field("measuregrps") String str);

    @POST("/measure?action=store&getcreatedmeasgrps=1")
    @FormUrlEncoded
    StoreMeasureResponse storeMeasure(@Query("devtype") int i11, @Query("userid") Long l5, @Query("category") int i12, @Query("meastime") int i13, @Query("comment") String str, @Query("attribstatus") int i14, @Field("measures") String str2, @Query("algo") Integer num);
}
