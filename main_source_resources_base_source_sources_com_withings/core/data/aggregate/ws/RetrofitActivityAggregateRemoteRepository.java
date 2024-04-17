package com.withings.core.data.aggregate.ws;

import com.withings.core.data.aggregate.ws.WsAggregate;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import com.withings.vasistas.ws.WsVasistasSerie;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import qm0.d;
import s00.a;
import s00.b;
/* compiled from: RetrofitActivityAggregateRemoteRepository.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/withings/core/data/aggregate/ws/RetrofitActivityAggregateRemoteRepository;", "Lcom/withings/core/data/aggregate/ws/ActivityAggregateRemoteRepository;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/core/data/aggregate/ws/ActivityAggregateRemoteRepository;", "", NavigationArguments.USER_ID, "lastUpdate", "", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "Lcom/withings/core/data/aggregate/ws/WsAggregate$Response;", "getAggregate", "(JJILqm0/d;)Ljava/lang/Object;", "aggregateJson", WsVasistasSerie.KEY_MODEL, "Lcom/withings/core/data/aggregate/ws/StoreAggregateResponse;", "storeAggregate", "(JLjava/lang/String;ILqm0/d;)Ljava/lang/Object;", "Ls00/b;", "compatWebservicesFactory", "Ls00/b;", "Ls00/a;", "Lcom/withings/core/data/aggregate/ws/ActivityAggregateRetrofit1Api;", "Lcom/withings/core/data/aggregate/ws/ActivityAggregateRetrofit2Api;", "compatWs", "Ls00/a;", "<init>", "(Ls00/b;Ljava/lang/String;)V", "core-data_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RetrofitActivityAggregateRemoteRepository implements ActivityAggregateRemoteRepository {
    private final b compatWebservicesFactory;
    private final a<ActivityAggregateRetrofit1Api, ActivityAggregateRetrofit2Api> compatWs;

    public RetrofitActivityAggregateRemoteRepository(b compatWebservicesFactory, String str) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        this.compatWebservicesFactory = compatWebservicesFactory;
        this.compatWs = compatWebservicesFactory.a(str, ActivityAggregateRetrofit1Api.class, ActivityAggregateRetrofit2Api.class);
    }

    @Override // com.withings.core.data.aggregate.ws.ActivityAggregateRemoteRepository
    public Object getAggregate(long j5, long j11, int i11, d<? super WsAggregate.Response> dVar) {
        return a.d(this.compatWs, new RetrofitActivityAggregateRemoteRepository$getAggregate$2(j5, j11, i11), new RetrofitActivityAggregateRemoteRepository$getAggregate$3(j5, j11, i11, null), null, false, dVar, 124);
    }

    @Override // com.withings.core.data.aggregate.ws.ActivityAggregateRemoteRepository
    public Object storeAggregate(long j5, String str, int i11, d<? super StoreAggregateResponse> dVar) {
        return a.d(this.compatWs, new RetrofitActivityAggregateRemoteRepository$storeAggregate$2(j5, str, i11), new RetrofitActivityAggregateRemoteRepository$storeAggregate$3(j5, str, i11, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.core.data.aggregate.ws.ActivityAggregateRemoteRepository
    public ActivityAggregateRemoteRepository withSyncContext(String str) {
        return new RetrofitActivityAggregateRemoteRepository(this.compatWebservicesFactory, str);
    }

    public /* synthetic */ RetrofitActivityAggregateRemoteRepository(b bVar, String str, int i11, m mVar) {
        this(bVar, (i11 & 2) != 0 ? null : str);
    }
}
