package com.withings.partner.ws;

import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: PartnerOauth2Api.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0004H'¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/withings/partner/ws/PartnerOauth2Api;", "", "deleteRefreshToken", "clientId", "", "id", "", "type", "partner_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PartnerOauth2Api {
    @POST("/v2/oauth2?action=deleterefreshtoken")
    @FormUrlEncoded
    Object deleteRefreshToken(@Field("client_id") String str, @Field("producerid") int i11, @Field("producertype") String str2);
}
