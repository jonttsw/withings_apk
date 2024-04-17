package com.withings.screen.repository.ws.api;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.screen.model.DeviceScreenContentResponse;
import com.withings.screen.model.DeviceScreenResponse;
import com.withings.screen.model.StoreDeviceScreenResponse;
import fr0.c;
import fr0.e;
import fr0.o;
import kotlin.Metadata;
import qm0.d;
/* compiled from: DeviceScreensRetrofit2Api.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0006J0\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/withings/screen/repository/ws/api/DeviceScreensRetrofit2Api;", "", "", NavigationArguments.USER_ID, "Lcom/withings/screen/model/DeviceScreenResponse;", "getDevicesScreens", "(JLqm0/d;)Ljava/lang/Object;", "deviceId", "Lcom/withings/screen/model/DeviceScreenContentResponse;", "getDeviceScreensContents", "", "screenIds", "Lcom/withings/screen/model/StoreDeviceScreenResponse;", "saveDeviceScreens", "(JLjava/lang/Long;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface DeviceScreensRetrofit2Api {
    @e
    @o("v2/screen?action=getcontentbydeviceid")
    Object getDeviceScreensContents(@c("deviceid") long j5, d<? super DeviceScreenContentResponse> dVar);

    @e
    @o("v2/screen?action=getbydeviceid&enrich=t")
    Object getDevicesScreens(@c("deviceid") long j5, d<? super DeviceScreenResponse> dVar);

    @e
    @o("v2/screen?action=setbyuserid")
    Object saveDeviceScreens(@c("userid") long j5, @c("deviceid") Long l5, @c("screenids") String str, d<? super StoreDeviceScreenResponse> dVar);
}
