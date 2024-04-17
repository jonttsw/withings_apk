package com.withings.features.platform.api;

import com.withings.feature.platform.model.PlatformFeatureListWS;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: PlatformFeatureRetrofit1Api.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J_\u0010\u0004\u001a\u00020\u00012\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000eH'¢\u0006\u0002\u0010\u000fJG\u0010\u0010\u001a\u00020\u00012\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000eH'¢\u0006\u0002\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/withings/features/platform/api/PlatformFeatureRetrofit1Api;", "", "getPlatformFeatures", "Lcom/withings/feature/platform/model/PlatformFeatureListWS;", "setPlatformFeature", "featureId", "", "deviceId", "", "accountId", NavigationArguments.USER_ID, "startDate", "endDate", "isTutorialSeen", "", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Ljava/lang/Object;", "unsetPlatformFeature", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Ljava/lang/Object;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PlatformFeatureRetrofit1Api {

    /* compiled from: PlatformFeatureRetrofit1Api.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object setPlatformFeature$default(PlatformFeatureRetrofit1Api platformFeatureRetrofit1Api, int i11, Long l5, Long l6, Long l11, Long l12, Long l13, Boolean bool, int i12, Object obj) {
        Long l14;
        Long l15;
        Long l16;
        Long l17;
        Long l18;
        if (obj == null) {
            Boolean bool2 = null;
            if ((i12 & 2) != 0) {
                l14 = null;
            } else {
                l14 = l5;
            }
            if ((i12 & 4) != 0) {
                l15 = null;
            } else {
                l15 = l6;
            }
            if ((i12 & 8) != 0) {
                l16 = null;
            } else {
                l16 = l11;
            }
            if ((i12 & 16) != 0) {
                l17 = null;
            } else {
                l17 = l12;
            }
            if ((i12 & 32) != 0) {
                l18 = null;
            } else {
                l18 = l13;
            }
            if ((i12 & 64) == 0) {
                bool2 = bool;
            }
            return platformFeatureRetrofit1Api.setPlatformFeature(i11, l14, l15, l16, l17, l18, bool2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPlatformFeature");
    }

    static /* synthetic */ Object unsetPlatformFeature$default(PlatformFeatureRetrofit1Api platformFeatureRetrofit1Api, int i11, Long l5, Long l6, Long l11, Boolean bool, int i12, Object obj) {
        Long l12;
        Long l13;
        Long l14;
        Boolean bool2;
        if (obj == null) {
            if ((i12 & 2) != 0) {
                l12 = null;
            } else {
                l12 = l5;
            }
            if ((i12 & 4) != 0) {
                l13 = null;
            } else {
                l13 = l6;
            }
            if ((i12 & 8) != 0) {
                l14 = null;
            } else {
                l14 = l11;
            }
            if ((i12 & 16) != 0) {
                bool2 = null;
            } else {
                bool2 = bool;
            }
            return platformFeatureRetrofit1Api.unsetPlatformFeature(i11, l12, l13, l14, bool2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unsetPlatformFeature");
    }

    @POST("/v2/feature?action=getall")
    PlatformFeatureListWS getPlatformFeatures();

    @POST("/v2/feature?action=set")
    @FormUrlEncoded
    Object setPlatformFeature(@Field("featureid") int i11, @Field("deviceid") Long l5, @Field("accountid") Long l6, @Field("userid") Long l11, @Field("startdate") Long l12, @Field("enddate") Long l13, @Field("tutorial") Boolean bool);

    @POST("/v2/feature?action=unset")
    @FormUrlEncoded
    Object unsetPlatformFeature(@Field("featureid") int i11, @Field("deviceid") Long l5, @Field("accountid") Long l6, @Field("userid") Long l11, @Field("tutorial") Boolean bool);
}
