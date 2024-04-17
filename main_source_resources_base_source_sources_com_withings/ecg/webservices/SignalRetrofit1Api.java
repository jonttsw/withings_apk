package com.withings.ecg.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import com.withings.webservices.legacy.common.exception.AlreadyExistsException;
import com.withings.webservices.legacy.common.exception.InvalidParamsException;
import com.withings.webservices.legacy.common.exception.ObjectNotFoundException;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;
/* compiled from: SignalRetrofit1Api.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\u001c\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J-\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u000b2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0002\u0010\rJÇ\u0001\u0010\u000e\u001a\u00020\u000f2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u000b2\b\b\u0001\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u000b2\b\b\u0001\u0010\u0015\u001a\u00020\u000b2\b\b\u0001\u0010\u0016\u001a\u00020\u000b2\b\b\u0001\u0010\u0017\u001a\u00020\u000b2\b\b\u0001\u0010\u0018\u001a\u00020\u000b2\b\b\u0001\u0010\u0019\u001a\u00020\u000b2\b\b\u0001\u0010\u001a\u001a\u00020\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u000b2\b\b\u0001\u0010\u001c\u001a\u00020\u00042\b\b\u0001\u0010\u001d\u001a\u00020\u00042\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u00042\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0002\u0010\"¨\u0006#À\u0006\u0003"}, d2 = {"Lcom/withings/ecg/webservices/SignalRetrofit1Api;", "", "deleteSignal", NavigationArguments.USER_ID, "", "signalId", "getSignal", "Lcom/withings/ecg/webservices/GetSignalResponse;", "getSignals", "Lcom/withings/ecg/webservices/GetSignalsResponse;", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "", "lastUpdate", "(JILjava/lang/Long;)Lcom/withings/ecg/webservices/GetSignalsResponse;", "storeSignal", "Lcom/withings/ecg/webservices/StoreSignalResponse;", "signal", "", "signalType", "timestamp", "metaFreq", "metaFormat", "metaSize", "metaResolution", "metaChannel", "metaGain", "metaFix", "metaOffset", "deviceId", "duration", "totalSize", "metaFilterBank", "metaWearPosition", "firmwareVersion", "(Ljava/lang/String;JIJIIIIIIJIJJJJLjava/lang/Integer;Ljava/lang/Integer;)Lcom/withings/ecg/webservices/StoreSignalResponse;", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SignalRetrofit1Api {
    @POST("/v2/signal?action=delete")
    @FormUrlEncoded
    Object deleteSignal(@Field("userid") long j5, @Field("signalid") long j11) throws ObjectNotFoundException;

    @GET("/v2/signal?action=get")
    GetSignalResponse getSignal(@Query("userid") long j5, @Query("signalid") long j11);

    @GET("/v2/signal?action=list")
    GetSignalsResponse getSignals(@Query("userid") long j5, @Query("offset") int i11, @Query("lastupdate") Long l5);

    @POST("/v2/signal?action=store")
    @FormUrlEncoded
    StoreSignalResponse storeSignal(@Field("signal") String str, @Field("userid") long j5, @Field("signaltype") int i11, @Field("timestamp") long j11, @Field("metafreq") int i12, @Field("metaformat") int i13, @Field("metasize") int i14, @Field("metaresolution") int i15, @Field("metachannel") int i16, @Field("metagain") int i17, @Field("metaqfix") long j12, @Field("metaoffset") int i18, @Field("deviceid") long j13, @Field("metaduration") long j14, @Field("metatotalsize") long j15, @Field("metafilterbank") long j16, @Field("metawearposition") Integer num, @Field("fw") Integer num2) throws AlreadyExistsException, InvalidParamsException;
}
