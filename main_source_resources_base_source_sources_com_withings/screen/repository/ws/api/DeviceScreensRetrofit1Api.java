package com.withings.screen.repository.ws.api;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.screen.model.DeviceScreenContentResponse;
import com.withings.screen.model.DeviceScreenResponse;
import com.withings.screen.model.StoreDeviceScreenResponse;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: DeviceScreensRetrofit1Api.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0005H'J-\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\b\u001a\u00020\u00052\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u000b\u001a\u00020\fH'¢\u0006\u0002\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/withings/screen/repository/ws/api/DeviceScreensRetrofit1Api;", "", "getDeviceScreensContents", "Lcom/withings/screen/model/DeviceScreenContentResponse;", "deviceId", "", "getDevicesScreens", "Lcom/withings/screen/model/DeviceScreenResponse;", NavigationArguments.USER_ID, "saveDeviceScreens", "Lcom/withings/screen/model/StoreDeviceScreenResponse;", "screenIds", "", "(JLjava/lang/Long;Ljava/lang/String;)Lcom/withings/screen/model/StoreDeviceScreenResponse;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface DeviceScreensRetrofit1Api {
    @POST("/v2/screen?action=getcontentbydeviceid")
    @FormUrlEncoded
    DeviceScreenContentResponse getDeviceScreensContents(@Field("deviceid") long j5);

    @POST("/v2/screen?action=getbydeviceid&enrich=t")
    @FormUrlEncoded
    DeviceScreenResponse getDevicesScreens(@Field("deviceid") long j5);

    @POST("/v2/screen?action=setbyuserid")
    @FormUrlEncoded
    StoreDeviceScreenResponse saveDeviceScreens(@Field("userid") long j5, @Field("deviceid") Long l5, @Field("screenids") String str);
}
