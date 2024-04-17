package com.withings.partner.ws.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: WsAllPartnerList.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR2\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/withings/partner/ws/model/WsAllPartnerList;", "", "()V", "modified", "", "getModified", "()Ljava/lang/Long;", "setModified", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "oauth2", "Lcom/withings/partner/ws/model/WsOauth2PartnersList;", "getOauth2", "()Lcom/withings/partner/ws/model/WsOauth2PartnersList;", "setOauth2", "(Lcom/withings/partner/ws/model/WsOauth2PartnersList;)V", "partners", "", "", "", "Lcom/withings/partner/ws/model/WsPartner;", "getPartners", "()Ljava/util/Map;", "setPartners", "(Ljava/util/Map;)V", "partner_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsAllPartnerList {
    @SerializedName("modified")
    private Long modified;
    @SerializedName("oauth2")
    private WsOauth2PartnersList oauth2;
    @SerializedName("partners")
    private Map<String, ? extends List<WsPartner>> partners;

    public final Long getModified() {
        return this.modified;
    }

    public final WsOauth2PartnersList getOauth2() {
        return this.oauth2;
    }

    public final Map<String, List<WsPartner>> getPartners() {
        return this.partners;
    }

    public final void setModified(Long l5) {
        this.modified = l5;
    }

    public final void setOauth2(WsOauth2PartnersList wsOauth2PartnersList) {
        this.oauth2 = wsOauth2PartnersList;
    }

    public final void setPartners(Map<String, ? extends List<WsPartner>> map) {
        this.partners = map;
    }
}
