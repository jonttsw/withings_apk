package com.withings.webradio.network;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webradio.model.WsAirableWebRadioResponse;
import com.withings.webservices.legacy.withings.model.airable.WsAirableSubCategoryList;
import com.withings.webservices.legacy.withings.model.airable.WsAirableTree;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.apache.http.cookie.ClientCookie;
import qm0.d;
import s00.a;
import s00.b;
/* compiled from: RetrofitWebRadiosRemoteRepository.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u000b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\r\u0010\tR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/withings/webradio/network/RetrofitWebRadiosRemoteRepository;", "Lcom/withings/webradio/network/WebRadiosRemoteRepository;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/webradio/network/WebRadiosRemoteRepository;", ClientCookie.PATH_ATTR, "Lcom/withings/webservices/legacy/withings/model/airable/WsAirableSubCategoryList;", "getAirableSubCategory", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/webradio/model/WsAirableWebRadioResponse;", "getAirableWebRadios", "Lcom/withings/webservices/legacy/withings/model/airable/WsAirableTree;", "getAirableTree", "Ls00/b;", "compatWebservicesFactory", "Ls00/b;", "Ls00/a;", "Lcom/withings/webradio/network/WebRadiosRetrofit1Api;", "Lcom/withings/webradio/network/WebRadiosRetrofit2Api;", "compatWS", "Ls00/a;", "<init>", "(Ls00/b;Ljava/lang/String;)V", "webradio_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RetrofitWebRadiosRemoteRepository implements WebRadiosRemoteRepository {
    private final a<WebRadiosRetrofit1Api, WebRadiosRetrofit2Api> compatWS;
    private final b compatWebservicesFactory;

    public RetrofitWebRadiosRemoteRepository(b compatWebservicesFactory, String str) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        this.compatWebservicesFactory = compatWebservicesFactory;
        this.compatWS = compatWebservicesFactory.a(str, WebRadiosRetrofit1Api.class, WebRadiosRetrofit2Api.class);
    }

    @Override // com.withings.webradio.network.WebRadiosRemoteRepository
    public Object getAirableSubCategory(String str, d<? super WsAirableSubCategoryList> dVar) {
        return a.d(this.compatWS, new RetrofitWebRadiosRemoteRepository$getAirableSubCategory$2(str), new RetrofitWebRadiosRemoteRepository$getAirableSubCategory$3(str, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.webradio.network.WebRadiosRemoteRepository
    public Object getAirableTree(String str, d<? super WsAirableTree> dVar) {
        return a.d(this.compatWS, new RetrofitWebRadiosRemoteRepository$getAirableTree$2(str), new RetrofitWebRadiosRemoteRepository$getAirableTree$3(str, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.webradio.network.WebRadiosRemoteRepository
    public Object getAirableWebRadios(String str, d<? super WsAirableWebRadioResponse> dVar) {
        return a.d(this.compatWS, new RetrofitWebRadiosRemoteRepository$getAirableWebRadios$2(str), new RetrofitWebRadiosRemoteRepository$getAirableWebRadios$3(str, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.webradio.network.WebRadiosRemoteRepository
    public WebRadiosRemoteRepository withSyncContext(String str) {
        return new RetrofitWebRadiosRemoteRepository(this.compatWebservicesFactory, str);
    }

    public /* synthetic */ RetrofitWebRadiosRemoteRepository(b bVar, String str, int i11, m mVar) {
        this(bVar, (i11 & 2) != 0 ? null : str);
    }
}
