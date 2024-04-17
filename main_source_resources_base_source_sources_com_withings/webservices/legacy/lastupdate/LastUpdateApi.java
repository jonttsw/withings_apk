package com.withings.webservices.legacy.lastupdate;

import retrofit.http.GET;
/* loaded from: classes4.dex */
public interface LastUpdateApi {
    @GET("/v2/measure?action=getlastupdate&objects=accounts,users,devices")
    LastUpdate getLastUpdate();
}
