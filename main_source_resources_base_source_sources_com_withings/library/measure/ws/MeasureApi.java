package com.withings.library.measure.ws;

import com.withings.webservices.legacy.common.exception.AlreadyExistsException;
import com.withings.webservices.legacy.common.exception.ObjectNotFoundException;
import java.util.List;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* loaded from: classes4.dex */
public interface MeasureApi {
    public static final int GET_CREATED_MEASURE_GROUP_TRUE = 1;

    @POST("/measure?action=batchstore")
    @FormUrlEncoded
    List<BatchStoreMeasureResponse> batchStore(@Field("measuregrps") String str, @Field("category") int i11, @Field("devtype") int i12, @Field("attribstatus") int i13, @Field("brand") int i14, @Field("userid") Long l5, @Field("getcreatedmeasgrps") Integer num);

    @POST("/measure?action=deletemeasgrp")
    @FormUrlEncoded
    Object deleteMeasure(@Field("measgrpid") long j5) throws ObjectNotFoundException;

    @POST("/v2/measure?action=getmeashf")
    @FormUrlEncoded
    HFMeasureResponse getHFMeasure(@Field("deviceid") long j5, @Field("meastype") String str, @Field("startdate") long j11, @Field("enddate") long j12);

    @POST("/measure?action=getmeas")
    @FormUrlEncoded
    MeasureGroupResponse getUserMeasures(@Field("userid") long j5, @Field("lastupdate") int i11, @Field("limit") int i12, @Field("offset") int i13, @Field("category") int i14);

    @POST("/v2/measure?action=storehf")
    @FormUrlEncoded
    Object storeHFMeasure(@Field("measuregrps") String str);

    @POST("/measure?action=store")
    @FormUrlEncoded
    StoreMeasureResponse storeMeasure(@Field("devtype") int i11, @Field("userid") Long l5, @Field("category") int i12, @Field("meastime") int i13, @Field("comment") String str, @Field("attribstatus") int i14, @Field("measures") String str2, @Field("algo") Integer num, @Field("getcreatedmeasgrps") int i15, @Field("deviceid") Long l6, @Field("brand") Long l11) throws AlreadyExistsException;

    @POST("/measure?action=store")
    @FormUrlEncoded
    StoreMeasureResponse storeMeasure(@Field("devtype") int i11, @Field("userid") Long l5, @Field("category") int i12, @Field("meastime") int i13, @Field("comment") String str, @Field("attribstatus") int i14, @Field("measures") String str2, @Field("getcreatedmeasgrps") Integer num, @Field("deviceid") Long l6, @Field("brand") Long l11) throws AlreadyExistsException;

    @POST("/measure?action=updatemeasgrp")
    @FormUrlEncoded
    Object updateMeasure(@Field("measgrpid") long j5, @Field("userid") long j11, @Field("comment") String str, @Field("attribstatus") int i11, @Field("measures") String str2);
}
