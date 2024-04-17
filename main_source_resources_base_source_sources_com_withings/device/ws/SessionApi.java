package com.withings.device.ws;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import com.withings.webservices.legacy.withings.model.Once;
import com.withings.webservices.legacy.withings.model.session.DeviceSession;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: SessionApi.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001Jm\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u000f\u001a\u00020\u000bH'¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H'¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/withings/device/ws/SessionApi;", "", "getDeviceSession", "Lcom/withings/webservices/legacy/withings/model/session/DeviceSession;", FirebaseAnalytics.Event.LOGIN, "", "hash", "duration", "currentfw", "", ConstantsWs.JSON_SESSION_KEY_MFGID, "", "batterylvl", "featureMask", "enrich", "last_used_network", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;I)Lcom/withings/webservices/legacy/withings/model/session/DeviceSession;", "getOnce", "Lcom/withings/webservices/legacy/withings/model/Once;", "device-legacy_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SessionApi {

    /* compiled from: SessionApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ DeviceSession getDeviceSession$default(SessionApi sessionApi, String str, String str2, String str3, long j5, int i11, Integer num, Integer num2, String str4, int i12, int i13, Object obj) throws WsAuthFailedException {
        String str5;
        int i14;
        if (obj == null) {
            if ((i13 & 128) != 0) {
                str5 = "t";
            } else {
                str5 = str4;
            }
            if ((i13 & 256) != 0) {
                i14 = 2;
            } else {
                i14 = i12;
            }
            return sessionApi.getDeviceSession(str, str2, str3, j5, i11, num, num2, str5, i14);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDeviceSession");
    }

    @POST("/session?action=new")
    @FormUrlEncoded
    DeviceSession getDeviceSession(@Field("auth") String str, @Field("hash") String str2, @Field("duration") String str3, @Field("currentfw") long j5, @Field("mfgid") int i11, @Field("batterylvl") Integer num, @Field("feature_mask") Integer num2, @Field("enrich") String str4, @Field("last_used_network") int i12) throws WsAuthFailedException;

    @POST("/once?action=get")
    Once getOnce();
}
