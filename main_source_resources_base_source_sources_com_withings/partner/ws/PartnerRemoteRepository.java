package com.withings.partner.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.ws.model.RunkeeperActivities;
import com.withings.partner.ws.model.WsAllPartnerList;
import com.withings.partner.ws.model.WsPartnerList;
import kotlin.Metadata;
import nm0.y;
import qm0.d;
/* compiled from: PartnerRemoteRepository.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u0016\u0010\rJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tH¦@¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lcom/withings/partner/ws/PartnerRemoteRepository;", "", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/partner/ws/PartnerRemoteRepository;", "Lcom/withings/partner/ws/model/WsAllPartnerList;", "partnersForAccount", "(Lqm0/d;)Ljava/lang/Object;", "", NavigationArguments.USER_ID, "Lcom/withings/partner/ws/model/WsPartnerList;", "getPartners", "(JLqm0/d;)Ljava/lang/Object;", "userOrAccountId", "", "app", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "consumer", "Lnm0/y;", "createOrUpdatePartner", "(JILjava/lang/String;ILqm0/d;)Ljava/lang/Object;", "synchroRunkeeper", "lastUpdate", "Lcom/withings/partner/ws/model/RunkeeperActivities;", "getRunkeeperActivities", "(JJLqm0/d;)Ljava/lang/Object;", "partner_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface PartnerRemoteRepository {
    Object createOrUpdatePartner(long j5, int i11, String str, int i12, d<? super y> dVar);

    Object getPartners(long j5, d<? super WsPartnerList> dVar);

    Object getRunkeeperActivities(long j5, long j11, d<? super RunkeeperActivities> dVar);

    Object partnersForAccount(d<? super WsAllPartnerList> dVar);

    Object synchroRunkeeper(long j5, d<? super y> dVar);

    PartnerRemoteRepository withSyncContext(String str);
}
