package com.withings.common.device.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: EventRetrofit1Api.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001JE\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0002\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/withings/common/device/webservices/EventRetrofit1Api;", "", "fire", "type", "", "epoch", "", "eventData", NavigationArguments.USER_ID, "deviceId", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Ljava/lang/Object;", "common-device_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface EventRetrofit1Api {
    @POST("/v2/event?action=fire")
    @FormUrlEncoded
    Object fire(@Field("type") String str, @Field("epoch") long j5, @Field("data") String str2, @Field("userid") Long l5, @Field("deviceid") Long l6) throws WsAuthFailedException;
}
