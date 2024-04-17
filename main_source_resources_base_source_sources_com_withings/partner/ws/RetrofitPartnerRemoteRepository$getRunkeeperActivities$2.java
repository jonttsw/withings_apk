package com.withings.partner.ws;

import com.withings.partner.ws.model.RunkeeperActivities;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitPartnerRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/partner/ws/model/RunkeeperActivities;", "Lcom/withings/partner/ws/PartnerRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RetrofitPartnerRemoteRepository$getRunkeeperActivities$2 extends w implements l<PartnerRetrofit1Api, RunkeeperActivities> {
    final /* synthetic */ long $lastUpdate;
    final /* synthetic */ long $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitPartnerRemoteRepository$getRunkeeperActivities$2(long j5, long j11) {
        super(1);
        this.$userId = j5;
        this.$lastUpdate = j11;
    }

    @Override // ym0.l
    public final RunkeeperActivities invoke(PartnerRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.getRunkeeperActivities(this.$userId, this.$lastUpdate);
    }
}
