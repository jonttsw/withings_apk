package com.withings.location.repository.ws.api;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.location.model.VasistasResponse;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: LocationVasistasRetrofit1Api.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\tH'J(\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\tH'¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/withings/location/repository/ws/api/LocationVasistasRetrofit1Api;", "", "getVasistas", "Lcom/withings/location/model/VasistasResponse;", NavigationArguments.USER_ID, "", "startDate", "endDate", "measureTypes", "", "category", "storeVasistas", "vasistasSeries", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface LocationVasistasRetrofit1Api {

    /* compiled from: LocationVasistasRetrofit1Api.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ VasistasResponse getVasistas$default(LocationVasistasRetrofit1Api locationVasistasRetrofit1Api, long j5, long j11, long j12, String str, String str2, int i11, Object obj) {
        String str3;
        if (obj == null) {
            if ((i11 & 16) != 0) {
                str3 = "location";
            } else {
                str3 = str2;
            }
            return locationVasistasRetrofit1Api.getVasistas(j5, j11, j12, str, str3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVasistas");
    }

    static /* synthetic */ Object storeVasistas$default(LocationVasistasRetrofit1Api locationVasistasRetrofit1Api, long j5, String str, String str2, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                str2 = "location";
            }
            return locationVasistasRetrofit1Api.storeVasistas(j5, str, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: storeVasistas");
    }

    @POST("/v2/measure?action=getvasistas")
    @FormUrlEncoded
    VasistasResponse getVasistas(@Field("userid") long j5, @Field("startdate") long j11, @Field("enddate") long j12, @Field(encodeValue = false, value = "meastype") String str, @Field("vasistas_category") String str2);

    @POST("/v2/measure?action=storewamhf")
    @FormUrlEncoded
    Object storeVasistas(@Field("userid") long j5, @Field("measuregrps") String str, @Field("vasistas_category") String str2);
}
