package com.withings.amazon;

import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
import xg.a;
/* loaded from: classes3.dex */
public interface StsApi {
    @POST("/v2/account?action=getsts")
    a.C1876a getSts();

    @POST("/v2/account?action=getsts")
    @FormUrlEncoded
    a.C1876a getSts(@Field("bucket") String str);
}
