package com.withings.partner.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.ws.model.RunkeeperActivities;
import com.withings.partner.ws.model.WsAllPartnerList;
import com.withings.partner.ws.model.WsPartnerList;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: PartnerRetrofit1Api.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0006H'J\u0012\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u0004H'J\u001c\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0004H'J\b\u0010\u0010\u001a\u00020\u0011H'J\u0012\u0010\u0012\u001a\u00020\u00012\b\b\u0001\u0010\f\u001a\u00020\u0004H'¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/withings/partner/ws/PartnerRetrofit1Api;", "", "createOrUpdatePartner", "userOrAccountId", "", "appli", "", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "", "consumer", "getPartners", "Lcom/withings/partner/ws/model/WsPartnerList;", NavigationArguments.USER_ID, "getRunkeeperActivities", "Lcom/withings/partner/ws/model/RunkeeperActivities;", "lastUpdate", "partnersForAccount", "Lcom/withings/partner/ws/model/WsAllPartnerList;", "synchroRunkeeper", "partner_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PartnerRetrofit1Api {
    @POST("/push?action=create")
    @FormUrlEncoded
    Object createOrUpdatePartner(@Field("relation") long j5, @Field("appli") int i11, @Field("context") String str, @Field("consumer") int i12);

    @POST("/v2/partner?action=getbyuserid")
    @FormUrlEncoded
    WsPartnerList getPartners(@Field("userid") long j5);

    @POST("/runkeeper?action=getmeas")
    @FormUrlEncoded
    RunkeeperActivities getRunkeeperActivities(@Field("userid") long j5, @Field("lastupdate") long j11);

    @POST("/v2/partner?action=getallbyaccount")
    WsAllPartnerList partnersForAccount();

    @POST("/runkeeper?action=synchro")
    @FormUrlEncoded
    Object synchroRunkeeper(@Field("userid") long j5);
}
