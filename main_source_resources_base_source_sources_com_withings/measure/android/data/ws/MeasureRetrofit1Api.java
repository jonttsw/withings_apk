package com.withings.measure.android.data.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import com.withings.vasistas.ws.WsVasistasSerie;
import com.withings.webservices.legacy.common.exception.WrongStatusException;
import java.util.List;
import kotlin.Metadata;
import my.a;
import my.b;
import my.c;
import my.d;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: MeasureRetrofit1Api.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 02\u00020\u0001:\u00010JA\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\u000bJ\u0097\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\f\u001a\u00020\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00042\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u00042\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0019\u0010\u001aJG\u0010\u001c\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u001b\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u00042\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000fH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u001e\u001a\u00020\u0002H'¢\u0006\u0004\b\u001f\u0010 J9\u0010%\u001a\u00020$2\b\b\u0001\u0010\u0015\u001a\u00020\u00022\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\"\u001a\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\u0002H'¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u0004\u0018\u00010\u00012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u000fH'¢\u0006\u0004\b(\u0010)Jo\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u00042\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b.\u0010/¨\u00061À\u0006\u0003"}, d2 = {"Lcom/withings/measure/android/data/ws/MeasureRetrofit1Api;", "", "", NavigationArguments.USER_ID, "", "lastUpdate", "limit", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "category", "Lmy/c;", "getUserMeasures", "(JIIII)Lmy/c;", "devType", "categoryType", "measTimeInSecond", "", "comment", "attrib", "measures", WsVasistasSerie.KEY_ALGO, "getCreatedMeasureGroup", "deviceId", "deviceModelId", "brand", "Lmy/d;", "storeMeasure", "(ILjava/lang/Long;IILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;)Lmy/d;", "grpid", "updateMeasure", "(JJLjava/lang/String;ILjava/lang/String;)Ljava/lang/Object;", "grpId", "deleteMeasure", "(J)Ljava/lang/Object;", "measTypes", "start", "end", "Lmy/b;", "getHFMeasure", "(JLjava/lang/String;JJ)Lmy/b;", "measureJson", "storeHFMeasure", "(Ljava/lang/String;)Ljava/lang/Object;", "measuregrps", WsVasistasSerie.KEY_MODEL, "", "Lmy/a;", "batchStore", "(Ljava/lang/String;IILjava/lang/Integer;ILjava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/util/List;", "Companion", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface MeasureRetrofit1Api {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int GET_CREATED_MEASURE_GROUP_TRUE = 1;

    /* compiled from: MeasureRetrofit1Api.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/measure/android/data/ws/MeasureRetrofit1Api$Companion;", "", "()V", "GET_CREATED_MEASURE_GROUP_TRUE", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int GET_CREATED_MEASURE_GROUP_TRUE = 1;

        private Companion() {
        }
    }

    @POST("/measure?action=batchstore")
    @FormUrlEncoded
    List<a> batchStore(@Field("measuregrps") String str, @Field("category") int i11, @Field("devtype") int i12, @Field("attribstatus") Integer num, @Field("brand") int i13, @Field("userid") Long l5, @Field("model") Integer num2, @Field("getcreatedmeasgrps") Integer num3) throws WrongStatusException.Checked;

    @POST("/measure?action=deletemeasgrp")
    @FormUrlEncoded
    Object deleteMeasure(@Field("measgrpid") long j5) throws WrongStatusException.Checked;

    @POST("/v2/measure?action=getmeashf")
    @FormUrlEncoded
    b getHFMeasure(@Field("deviceid") long j5, @Field("meastype") String str, @Field("startdate") long j11, @Field("enddate") long j12) throws WrongStatusException.Checked;

    @POST("/measure?action=getmeas")
    @FormUrlEncoded
    c getUserMeasures(@Field("userid") long j5, @Field("lastupdate") int i11, @Field("limit") int i12, @Field("offset") int i13, @Field("category") int i14) throws WrongStatusException.Checked;

    @POST("/v2/measure?action=storehf")
    @FormUrlEncoded
    Object storeHFMeasure(@Field("measuregrps") String str) throws WrongStatusException.Checked;

    @POST("/measure?action=store")
    @FormUrlEncoded
    d storeMeasure(@Field("devtype") int i11, @Field("userid") Long l5, @Field("category") int i12, @Field("meastime") int i13, @Field("comment") String str, @Field("attribstatus") int i14, @Field("measures") String str2, @Field("algo") Integer num, @Field("getcreatedmeasgrps") Integer num2, @Field("deviceid") Long l6, @Field("model") Integer num3, @Field("brand") Long l11) throws WrongStatusException.Checked;

    @POST("/measure?action=updatemeasgrp")
    @FormUrlEncoded
    Object updateMeasure(@Field("measgrpid") long j5, @Field("userid") long j11, @Field("comment") String str, @Field("attribstatus") int i11, @Field("measures") String str2) throws WrongStatusException.Checked;
}
