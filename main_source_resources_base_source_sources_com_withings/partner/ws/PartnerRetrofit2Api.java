package com.withings.partner.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.ws.model.RunkeeperActivities;
import com.withings.partner.ws.model.WsAllPartnerList;
import com.withings.partner.ws.model.WsPartnerList;
import fr0.c;
import fr0.e;
import fr0.o;
import kotlin.Metadata;
import nm0.y;
import qm0.d;
/* compiled from: PartnerRetrofit2Api.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ8\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00102\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0013\u0010\tJ$\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/withings/partner/ws/PartnerRetrofit2Api;", "", "Lcom/withings/partner/ws/model/WsAllPartnerList;", "partnersForAccount", "(Lqm0/d;)Ljava/lang/Object;", "", NavigationArguments.USER_ID, "Lcom/withings/partner/ws/model/WsPartnerList;", "getPartners", "(JLqm0/d;)Ljava/lang/Object;", "userOrAccountId", "", "appli", "", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "consumer", "Lnm0/y;", "createOrUpdatePartner", "(JILjava/lang/String;ILqm0/d;)Ljava/lang/Object;", "synchroRunkeeper", "lastUpdate", "Lcom/withings/partner/ws/model/RunkeeperActivities;", "getRunkeeperActivities", "(JJLqm0/d;)Ljava/lang/Object;", "partner_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface PartnerRetrofit2Api {
    @e
    @o("push?action=create")
    Object createOrUpdatePartner(@c("relation") long j5, @c("appli") int i11, @c("context") String str, @c("consumer") int i12, d<? super y> dVar);

    @e
    @o("v2/partner?action=getbyuserid")
    Object getPartners(@c("userid") long j5, d<? super WsPartnerList> dVar);

    @e
    @o("runkeeper?action=getmeas")
    Object getRunkeeperActivities(@c("userid") long j5, @c("lastupdate") long j11, d<? super RunkeeperActivities> dVar);

    @o("v2/partner?action=getallbyaccount")
    Object partnersForAccount(d<? super WsAllPartnerList> dVar);

    @e
    @o("runkeeper?action=synchro")
    Object synchroRunkeeper(@c("userid") long j5, d<? super y> dVar);
}
