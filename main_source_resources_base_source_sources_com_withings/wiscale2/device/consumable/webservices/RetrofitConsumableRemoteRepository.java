package com.withings.wiscale2.device.consumable.webservices;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.device.consumable.model.GetConsumableResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import qm0.d;
import s00.a;
import s00.b;
import u70.i;
/* compiled from: RetrofitConsumableRemoteRepository.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/withings/wiscale2/device/consumable/webservices/RetrofitConsumableRemoteRepository;", "Lcom/withings/wiscale2/device/consumable/webservices/ConsumableRemoteRepository;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/wiscale2/device/consumable/webservices/ConsumableRemoteRepository;", "Lu70/i;", "mac", "Lcom/withings/wiscale2/device/consumable/model/GetConsumableResponse;", "get", "(Lu70/i;Lqm0/d;)Ljava/lang/Object;", "Ls00/b;", "compatWebservicesFactory", "Ls00/b;", "Ls00/a;", "Lcom/withings/wiscale2/device/consumable/webservices/ConsumableRetrofit1Api;", "Lcom/withings/wiscale2/device/consumable/webservices/ConsumableRetrofit2Api;", "compatWs", "Ls00/a;", "<init>", "(Ls00/b;Ljava/lang/String;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RetrofitConsumableRemoteRepository implements ConsumableRemoteRepository {
    public static final int $stable = 8;
    private final b compatWebservicesFactory;
    private final a<ConsumableRetrofit1Api, ConsumableRetrofit2Api> compatWs;

    public RetrofitConsumableRemoteRepository(b compatWebservicesFactory, String str) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        this.compatWebservicesFactory = compatWebservicesFactory;
        this.compatWs = compatWebservicesFactory.a(str, ConsumableRetrofit1Api.class, ConsumableRetrofit2Api.class);
    }

    @Override // com.withings.wiscale2.device.consumable.webservices.ConsumableRemoteRepository
    public Object get(i iVar, d<? super GetConsumableResponse> dVar) {
        return a.d(this.compatWs, new RetrofitConsumableRemoteRepository$get$2(iVar), new RetrofitConsumableRemoteRepository$get$3(iVar, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.wiscale2.device.consumable.webservices.ConsumableRemoteRepository
    public ConsumableRemoteRepository withSyncContext(String str) {
        return new RetrofitConsumableRemoteRepository(this.compatWebservicesFactory, str);
    }

    public /* synthetic */ RetrofitConsumableRemoteRepository(b bVar, String str, int i11, m mVar) {
        this(bVar, (i11 & 2) != 0 ? null : str);
    }
}
