package com.withings.location.repository.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.location.model.VasistasResponse;
import com.withings.location.repository.GpsLocationRemoteRepository;
import com.withings.location.repository.ws.api.LocationVasistasRetrofit1Api;
import com.withings.location.repository.ws.api.LocationVasistasRetrofit2Api;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.y;
import qm0.d;
import s00.a;
import s00.b;
/* compiled from: RetrofitGpsLocationRemoteRepository.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J:\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/withings/location/repository/ws/RetrofitGpsLocationRemoteRepository;", "Lcom/withings/location/repository/GpsLocationRemoteRepository;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/location/repository/GpsLocationRemoteRepository;", "", NavigationArguments.USER_ID, "startDate", "endDate", "measureTypes", "category", "Lcom/withings/location/model/VasistasResponse;", "getVasistas", "(JJJLjava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "vasistasSeries", "Lnm0/y;", "storeVasistas", "(JLjava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Ls00/b;", "compatWebservicesFactory", "Ls00/b;", "Ls00/a;", "Lcom/withings/location/repository/ws/api/LocationVasistasRetrofit1Api;", "Lcom/withings/location/repository/ws/api/LocationVasistasRetrofit2Api;", "compatWS", "Ls00/a;", "<init>", "(Ls00/b;Ljava/lang/String;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RetrofitGpsLocationRemoteRepository implements GpsLocationRemoteRepository {
    private final a<LocationVasistasRetrofit1Api, LocationVasistasRetrofit2Api> compatWS;
    private final b compatWebservicesFactory;

    public RetrofitGpsLocationRemoteRepository(b compatWebservicesFactory, String str) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        this.compatWebservicesFactory = compatWebservicesFactory;
        this.compatWS = compatWebservicesFactory.a(str, LocationVasistasRetrofit1Api.class, LocationVasistasRetrofit2Api.class);
    }

    @Override // com.withings.location.repository.GpsLocationRemoteRepository
    public Object getVasistas(long j5, long j11, long j12, String str, String str2, d<? super VasistasResponse> dVar) {
        return a.d(this.compatWS, new RetrofitGpsLocationRemoteRepository$getVasistas$2(j5, j11, j12, str, str2, "location"), new RetrofitGpsLocationRemoteRepository$getVasistas$3(j5, j11, j12, str, str2, "location", null), null, false, dVar, 124);
    }

    @Override // com.withings.location.repository.GpsLocationRemoteRepository
    public Object storeVasistas(long j5, String str, String str2, d<? super y> dVar) {
        Object d11 = a.d(this.compatWS, new RetrofitGpsLocationRemoteRepository$storeVasistas$2(j5, str, str2, "location"), new RetrofitGpsLocationRemoteRepository$storeVasistas$3(j5, str, str2, "location", null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
        if (d11 == CoroutineSingletons.f76214a) {
            return d11;
        }
        return y.f85009a;
    }

    @Override // com.withings.location.repository.GpsLocationRemoteRepository
    public GpsLocationRemoteRepository withSyncContext(String str) {
        return new RetrofitGpsLocationRemoteRepository(this.compatWebservicesFactory, str);
    }

    public /* synthetic */ RetrofitGpsLocationRemoteRepository(b bVar, String str, int i11, m mVar) {
        this(bVar, (i11 & 2) != 0 ? null : str);
    }
}
