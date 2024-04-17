package com.withings.vasistas.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.ws.WsVasistasSerie;
import kotlin.Metadata;
import nm0.y;
/* compiled from: RetrofitVasistasRemoteRepository.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J<\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/withings/vasistas/ws/RetrofitVasistasRemoteRepository;", "Lcom/withings/vasistas/ws/VasistasRemoteRepository;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/vasistas/ws/VasistasRemoteRepository;", "", NavigationArguments.USER_ID, "startDate", "endDate", "category", "measureTypes", "Lcom/withings/vasistas/ws/WsVasistasSerie$Response;", "getVasistas", "(JJJLjava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "vasistasSerie", "Lnm0/y;", "storeVasistas", "(JLjava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "", "deviceId", "(JLjava/lang/String;Ljava/lang/String;ILqm0/d;)Ljava/lang/Object;", "Ls00/b;", "compatWebservicesFactory", "Ls00/b;", "Ls00/a;", "Lcom/withings/vasistas/ws/VasistasRetrofit1Api;", "Lcom/withings/vasistas/ws/VasistasRetrofit2Api;", "compatWs", "Ls00/a;", "<init>", "(Ls00/b;Ljava/lang/String;)V", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RetrofitVasistasRemoteRepository implements VasistasRemoteRepository {
    private final s00.b compatWebservicesFactory;
    private final s00.a<VasistasRetrofit1Api, VasistasRetrofit2Api> compatWs;

    public RetrofitVasistasRemoteRepository(s00.b compatWebservicesFactory, String str) {
        kotlin.jvm.internal.u.j(compatWebservicesFactory, "compatWebservicesFactory");
        this.compatWebservicesFactory = compatWebservicesFactory;
        this.compatWs = compatWebservicesFactory.a(str, VasistasRetrofit1Api.class, VasistasRetrofit2Api.class);
    }

    @Override // com.withings.vasistas.ws.VasistasRemoteRepository
    public Object getVasistas(long j5, long j11, long j12, String str, String str2, qm0.d<? super WsVasistasSerie.Response> dVar) {
        return s00.a.d(this.compatWs, new RetrofitVasistasRemoteRepository$getVasistas$2(j5, j11, j12, str, str2), new RetrofitVasistasRemoteRepository$getVasistas$3(j5, j11, j12, str, str2, null), null, false, dVar, 124);
    }

    @Override // com.withings.vasistas.ws.VasistasRemoteRepository
    public Object storeVasistas(long j5, String str, String str2, int i11, qm0.d<? super y> dVar) {
        return s00.a.d(this.compatWs, new RetrofitVasistasRemoteRepository$storeVasistas$5(j5, str, str2, i11), new RetrofitVasistasRemoteRepository$storeVasistas$6(j5, str, str2, i11, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.vasistas.ws.VasistasRemoteRepository
    public VasistasRemoteRepository withSyncContext(String str) {
        return new RetrofitVasistasRemoteRepository(this.compatWebservicesFactory, str);
    }

    @Override // com.withings.vasistas.ws.VasistasRemoteRepository
    public Object storeVasistas(long j5, String str, String str2, qm0.d<? super y> dVar) {
        return s00.a.d(this.compatWs, new RetrofitVasistasRemoteRepository$storeVasistas$2(j5, str, str2), new RetrofitVasistasRemoteRepository$storeVasistas$3(j5, str, str2, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    public /* synthetic */ RetrofitVasistasRemoteRepository(s00.b bVar, String str, int i11, kotlin.jvm.internal.m mVar) {
        this(bVar, (i11 & 2) != 0 ? null : str);
    }
}
