package com.withings.partner.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.ws.model.RunkeeperActivities;
import com.withings.partner.ws.model.WsAllPartnerList;
import com.withings.partner.ws.model.WsPartnerList;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.y;
import qm0.d;
import s00.a;
import s00.b;
/* compiled from: RetrofitPartnerRemoteRepository.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0016\u0010\rJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/withings/partner/ws/RetrofitPartnerRemoteRepository;", "Lcom/withings/partner/ws/PartnerRemoteRepository;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/partner/ws/PartnerRemoteRepository;", "Lcom/withings/partner/ws/model/WsAllPartnerList;", "partnersForAccount", "(Lqm0/d;)Ljava/lang/Object;", "", NavigationArguments.USER_ID, "Lcom/withings/partner/ws/model/WsPartnerList;", "getPartners", "(JLqm0/d;)Ljava/lang/Object;", "userOrAccountId", "", "app", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "consumer", "Lnm0/y;", "createOrUpdatePartner", "(JILjava/lang/String;ILqm0/d;)Ljava/lang/Object;", "synchroRunkeeper", "lastUpdate", "Lcom/withings/partner/ws/model/RunkeeperActivities;", "getRunkeeperActivities", "(JJLqm0/d;)Ljava/lang/Object;", "Ls00/b;", "compatWebservicesFactory", "Ls00/b;", "Ls00/a;", "Lcom/withings/partner/ws/PartnerRetrofit1Api;", "Lcom/withings/partner/ws/PartnerRetrofit2Api;", "compatWS", "Ls00/a;", "<init>", "(Ls00/b;Ljava/lang/String;)V", "partner_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RetrofitPartnerRemoteRepository implements PartnerRemoteRepository {
    private final a<PartnerRetrofit1Api, PartnerRetrofit2Api> compatWS;
    private final b compatWebservicesFactory;

    public RetrofitPartnerRemoteRepository(b compatWebservicesFactory, String str) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        this.compatWebservicesFactory = compatWebservicesFactory;
        this.compatWS = compatWebservicesFactory.a(str, PartnerRetrofit1Api.class, PartnerRetrofit2Api.class);
    }

    @Override // com.withings.partner.ws.PartnerRemoteRepository
    public Object createOrUpdatePartner(long j5, int i11, String str, int i12, d<? super y> dVar) {
        Object d11 = a.d(this.compatWS, new RetrofitPartnerRemoteRepository$createOrUpdatePartner$2(j5, i11, str, i12), new RetrofitPartnerRemoteRepository$createOrUpdatePartner$3(j5, i11, str, i12, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
        if (d11 == CoroutineSingletons.f76214a) {
            return d11;
        }
        return y.f85009a;
    }

    @Override // com.withings.partner.ws.PartnerRemoteRepository
    public Object getPartners(long j5, d<? super WsPartnerList> dVar) {
        return a.d(this.compatWS, new RetrofitPartnerRemoteRepository$getPartners$2(j5), new RetrofitPartnerRemoteRepository$getPartners$3(j5, null), null, false, dVar, 124);
    }

    @Override // com.withings.partner.ws.PartnerRemoteRepository
    public Object getRunkeeperActivities(long j5, long j11, d<? super RunkeeperActivities> dVar) {
        return a.d(this.compatWS, new RetrofitPartnerRemoteRepository$getRunkeeperActivities$2(j5, j11), new RetrofitPartnerRemoteRepository$getRunkeeperActivities$3(j5, j11, null), null, false, dVar, 124);
    }

    @Override // com.withings.partner.ws.PartnerRemoteRepository
    public Object partnersForAccount(d<? super WsAllPartnerList> dVar) {
        return a.d(this.compatWS, RetrofitPartnerRemoteRepository$partnersForAccount$2.INSTANCE, new RetrofitPartnerRemoteRepository$partnersForAccount$3(null), null, false, dVar, 124);
    }

    @Override // com.withings.partner.ws.PartnerRemoteRepository
    public Object synchroRunkeeper(long j5, d<? super y> dVar) {
        Object d11 = a.d(this.compatWS, new RetrofitPartnerRemoteRepository$synchroRunkeeper$2(j5), new RetrofitPartnerRemoteRepository$synchroRunkeeper$3(j5, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
        if (d11 == CoroutineSingletons.f76214a) {
            return d11;
        }
        return y.f85009a;
    }

    @Override // com.withings.partner.ws.PartnerRemoteRepository
    public PartnerRemoteRepository withSyncContext(String str) {
        return new RetrofitPartnerRemoteRepository(this.compatWebservicesFactory, str);
    }

    public /* synthetic */ RetrofitPartnerRemoteRepository(b bVar, String str, int i11, m mVar) {
        this(bVar, (i11 & 2) != 0 ? null : str);
    }
}
