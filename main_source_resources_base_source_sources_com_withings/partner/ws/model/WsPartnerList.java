package com.withings.partner.ws.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
/* compiled from: WsPartnerList.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withings/partner/ws/model/WsPartnerList;", "", "()V", "partners", "", "Lcom/withings/partner/ws/model/WsPartner;", "getPartners", "()Ljava/util/List;", "setPartners", "(Ljava/util/List;)V", "partner_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsPartnerList {
    @SerializedName("partners")
    private List<WsPartner> partners;

    public final List<WsPartner> getPartners() {
        return this.partners;
    }

    public final void setPartners(List<WsPartner> list) {
        this.partners = list;
    }
}
