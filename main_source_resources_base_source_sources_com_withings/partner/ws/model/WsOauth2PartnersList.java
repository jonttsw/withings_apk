package com.withings.partner.ws.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: WsOauth2PartnersList.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R,\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR2\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/withings/partner/ws/model/WsOauth2PartnersList;", "", "()V", "accountPartners", "", "", "Lcom/withings/partner/ws/model/WsPartner;", "getAccountPartners", "()Ljava/util/Map;", "setAccountPartners", "(Ljava/util/Map;)V", "usersPartners", "", "getUsersPartners", "setUsersPartners", "partner_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsOauth2PartnersList {
    @SerializedName("account")
    private Map<String, WsPartner> accountPartners;
    @SerializedName("users")
    private Map<String, ? extends List<WsPartner>> usersPartners;

    public final Map<String, WsPartner> getAccountPartners() {
        return this.accountPartners;
    }

    public final Map<String, List<WsPartner>> getUsersPartners() {
        return this.usersPartners;
    }

    public final void setAccountPartners(Map<String, WsPartner> map) {
        this.accountPartners = map;
    }

    public final void setUsersPartners(Map<String, ? extends List<WsPartner>> map) {
        this.usersPartners = map;
    }
}
