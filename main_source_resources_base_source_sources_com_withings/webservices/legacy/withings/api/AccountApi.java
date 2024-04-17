package com.withings.webservices.legacy.withings.api;

import com.google.gson.JsonObject;
import com.withings.webservices.legacy.common.exception.AlreadyExistsException;
import com.withings.webservices.legacy.common.exception.ObjectNotFoundException;
import com.withings.webservices.legacy.common.exception.SynchroTimeException;
import com.withings.webservices.legacy.common.exception.TooBigException;
import com.withings.webservices.legacy.common.exception.WrongRelationException;
import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import com.withings.webservices.legacy.withings.model.DeviceSts;
import com.withings.webservices.legacy.withings.model.GeoIp;
import com.withings.webservices.legacy.withings.model.LastUpdate;
import com.withings.webservices.legacy.withings.model.WsVasistasSerie;
import com.withings.webservices.legacy.withings.model.measure.HFMeasureResponse;
import com.withings.webservices.legacy.withings.model.measure.MeasureGroupResponse;
import com.withings.webservices.legacy.withings.model.measure.StoreMeasureResponse;
import com.withings.webservices.legacy.withings.model.measure.WsAggregate;
import com.withings.webservices.legacy.withings.model.partner.OldPartnerConf;
import com.withings.webservices.legacy.withings.model.partner.WsPartnerList;
import com.withings.webservices.legacy.withings.model.plan.Plans;
import com.withings.webservices.legacy.withings.model.timeline.Timeline;
import java.util.List;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
import retrofit.http.Path;
@Deprecated
/* loaded from: classes4.dex */
public interface AccountApi {
    @POST("/v2/crm?action=feedback")
    @FormUrlEncoded
    Object crmFeedback(@Field("crmid") String str, @Field("crmevent") String str2, @Field("userid") long j5);

    @POST("/v2/timeline?action=devicedeleteitem")
    @FormUrlEncoded
    Object deleteDeviceTimelineItem(@Field("deviceid") long j5, @Field("itemids") String str);

    @POST("/measure?action=deletemeasgrp")
    @FormUrlEncoded
    Object deleteMeasure(@Field("measgrpid") long j5) throws ObjectNotFoundException;

    @POST("/session?action=delete")
    Object deleteSession() throws WsAuthFailedException;

    @POST("/sharing?action=delete")
    @FormUrlEncoded
    Object deleteSharing(@Field("sharingid") List<Integer> list);

    @POST("/v2/measure?action=getagregatewam")
    @FormUrlEncoded
    WsAggregate.Response getAggregate(@Field("userid") long j5, @Field("lastupdate") long j11, @Field("offset") int i11);

    @POST("/v2/timeline?action=getbydeviceid&type=3")
    @FormUrlEncoded
    Timeline getDeviceCvr(@Field("deviceid") long j5, @Field("startdate") long j11, @Field("enddate") long j12);

    @POST("/v2/timeline?action=getbydeviceid&type=2")
    @FormUrlEncoded
    Timeline getDeviceTimelapse(@Field("deviceid") long j5, @Field("startdate") long j11, @Field("enddate") long j12);

    @POST("/v2/timeline?action=getbydeviceid")
    @FormUrlEncoded
    Timeline getDeviceTimelineForType(@Field("deviceid") long j5, @Field("type") int i11, @Field("lastupdate") String str);

    @POST("/session?action=geoip")
    GeoIp getGeoIp();

    @POST("/v2/measure?action=getmeashf")
    @FormUrlEncoded
    HFMeasureResponse getHFMeasure(@Field("deviceid") long j5, @Field("meastype") String str, @Field("startdate") long j11, @Field("enddate") long j12);

    @POST("/v2/measure?action=getlastupdate&objects=accounts,users,devices")
    LastUpdate getLastUpdate();

    @POST("/v2/measure?action=getlastupdate")
    @FormUrlEncoded
    LastUpdate getLastUpdate(@Field("objects") String str);

    @POST("/{partner}?action=getconf")
    @FormUrlEncoded
    OldPartnerConf getOldPartnerConf(@Path("partner") String str, @Field("userid") long j5) throws TooBigException;

    @POST("/{partner}?action=getmeas")
    @FormUrlEncoded
    JsonObject getOldPartnerMeasures(@Path("partner") String str, @Field("userid") long j5, @Field("lastupdate") long j11);

    @POST("/{partner}?action=synchro")
    @FormUrlEncoded
    Object getOldPartnerSynchro(@Path("partner") String str, @Field("userid") long j5);

    @POST("/v2/measure?action=getmeas")
    @FormUrlEncoded
    JsonObject getPartnerMeasures(@Field("userid") long j5, @Field("brand") int i11, @Field("meastype") int i12, @Field("startdate") long j11);

    @POST("/v2/partner?action=getbyuserid")
    @FormUrlEncoded
    @Deprecated
    WsPartnerList getPartners(@Field("userid") long j5);

    @POST("/v2/plan?action=getbyaccountid")
    Plans getPlan();

    @POST("/push?action=get&appli=1")
    @FormUrlEncoded
    Object getPushRelation(@Field("relation") long j5, @Field("consumer") int i11) throws WrongRelationException;

    @POST("/v2/device?action=getsts")
    @FormUrlEncoded
    DeviceSts getSts(@Field("deviceid") long j5);

    @POST("/v2/timeline?action=getbyuserid")
    @FormUrlEncoded
    Timeline getTimeline(@Field("userid") long j5);

    @POST("/measure?action=getmeas&category=1")
    @FormUrlEncoded
    MeasureGroupResponse getUserMeasures(@Field("userid") long j5, @Field("lastupdate") int i11, @Field("limit") int i12, @Field("offset") int i13);

    @POST("/measure?action=getmeas&category=2")
    @FormUrlEncoded
    MeasureGroupResponse getUserObjectives(@Field("userid") long j5, @Field("lastupdate") int i11, @Field("limit") int i12, @Field("offset") int i13);

    @POST("/v2/measure?action=getvasistas&meastype=11,36,37,38,39,40,41,42,43,44,45,59,70,87")
    @FormUrlEncoded
    WsVasistasSerie.Response getVasistas(@Field("userid") long j5, @Field("startdate") long j11, @Field("enddate") long j12, @Field("devicetype") int i11);

    @POST("/push?action=creategoogle")
    @FormUrlEncoded
    Object registerGoogleFit(@Field("relation") long j5, @Field("code") String str);

    @POST("/push?action=create&secret=nmw")
    @FormUrlEncoded
    Object registerPush(@Field("accesstoken") String str, @Field("context") String str2, @Field("relation") long j5, @Field("consumer") long j11, @Field("appli") int i11);

    @POST("/runkeeper?action=batchstore")
    @FormUrlEncoded
    Object runkeeperForceUpdate(@Field("userid") long j5);

    @POST("/v2/program?action=pushmessage")
    @FormUrlEncoded
    Object sendProgramMessage(@Field("programid") long j5, @Field("userid") long j11, @Field("targettype") String str, @Field("targetid") long j12, @Field("message") String str2, @Field("options") String str3);

    @POST("/v2/measure?action=storeagregatewam")
    @FormUrlEncoded
    Object storeAggregate(@Field("userid") long j5, @Field("agreg") String str, @Field("model") Integer num) throws AlreadyExistsException, SynchroTimeException;

    @POST("/measure?action=store&getcreatedmeasgrps=1")
    @FormUrlEncoded
    StoreMeasureResponse storeMeasure(@Field("devtype") int i11, @Field("userid") Long l5, @Field("category") int i12, @Field("meastime") int i13, @Field("comment") String str, @Field("attribstatus") int i14, @Field("measures") String str2);

    @POST("/v2/measure?action=storewamhf")
    @FormUrlEncoded
    Object storeVasistas(@Field("userid") long j5, @Field("measuregrps") String str);

    @POST("/bodymedia?action=deleteconf")
    @FormUrlEncoded
    Object unRegisterBodyMedia(@Field("userid") long j5);

    @POST("/runkeeper?action=deleteconf")
    @FormUrlEncoded
    Object unRegisterRunkeeper(@Field("userid") long j5);

    @POST("/push?action=delete&secret=nmw")
    @FormUrlEncoded
    Object unregisterPushId(@Field("relation") long j5, @Field("consumer") int i11, @Field("appli") int i12);

    @POST("/measure?action=updatemeasgrp")
    @FormUrlEncoded
    Object updateMeasure(@Field("measgrpid") long j5, @Field("userid") long j11, @Field("comment") String str, @Field("attribstatus") int i11, @Field("measures") String str2);
}
