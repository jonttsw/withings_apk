package com.withings.ecg.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.y;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import qm0.d;
import s00.a;
import s00.b;
/* compiled from: RetrofitEcgReviewRemoteRepository.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0015\u0010\u0012J(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0017\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/withings/ecg/webservices/RetrofitEcgReviewRemoteRepository;", "Lcom/withings/ecg/webservices/EcgReviewRemoteRepository;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/ecg/webservices/EcgReviewRemoteRepository;", "", NavigationArguments.USER_ID, "deviceId", "Lcom/withings/ecg/webservices/GetEcgReviewResponse;", "get", "(JJLqm0/d;)Ljava/lang/Object;", "Lcom/withings/ecg/webservices/ListStateCodeResponse;", "getStatesList", "(Lqm0/d;)Ljava/lang/Object;", "stateCode", "Lcom/withings/ecg/webservices/StoreEcgReviewResponse;", "store", "(JJLjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "phoneNumber", "Lnm0/y;", "sendCode", XHTMLText.CODE, "checkCode", "Ls00/b;", "compatWebservicesFactory", "Ls00/b;", "Ls00/a;", "Lcom/withings/ecg/webservices/EcgReviewRetrofit1Api;", "Lcom/withings/ecg/webservices/EcgReviewRetrofit2Api;", "compatWs", "Ls00/a;", "<init>", "(Ls00/b;Ljava/lang/String;)V", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RetrofitEcgReviewRemoteRepository implements EcgReviewRemoteRepository {
    public static final int $stable = 8;
    private final b compatWebservicesFactory;
    private final a<EcgReviewRetrofit1Api, EcgReviewRetrofit2Api> compatWs;

    public RetrofitEcgReviewRemoteRepository(b compatWebservicesFactory, String str) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        this.compatWebservicesFactory = compatWebservicesFactory;
        this.compatWs = compatWebservicesFactory.a(str, EcgReviewRetrofit1Api.class, EcgReviewRetrofit2Api.class);
    }

    @Override // com.withings.ecg.webservices.EcgReviewRemoteRepository
    public Object checkCode(long j5, long j11, String str, d<? super y> dVar) {
        return a.d(this.compatWs, new RetrofitEcgReviewRemoteRepository$checkCode$2(j5, j11, str), new RetrofitEcgReviewRemoteRepository$checkCode$3(j5, j11, str, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.ecg.webservices.EcgReviewRemoteRepository
    public Object get(long j5, long j11, d<? super GetEcgReviewResponse> dVar) {
        return a.d(this.compatWs, new RetrofitEcgReviewRemoteRepository$get$2(j5, j11), new RetrofitEcgReviewRemoteRepository$get$3(j5, j11, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.ecg.webservices.EcgReviewRemoteRepository
    public Object getStatesList(d<? super ListStateCodeResponse> dVar) {
        return a.d(this.compatWs, RetrofitEcgReviewRemoteRepository$getStatesList$2.INSTANCE, new RetrofitEcgReviewRemoteRepository$getStatesList$3(null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.ecg.webservices.EcgReviewRemoteRepository
    public Object sendCode(long j5, long j11, String str, d<? super y> dVar) {
        return a.d(this.compatWs, new RetrofitEcgReviewRemoteRepository$sendCode$2(j5, j11, str), new RetrofitEcgReviewRemoteRepository$sendCode$3(j5, j11, str, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.ecg.webservices.EcgReviewRemoteRepository
    public Object store(long j5, long j11, String str, d<? super StoreEcgReviewResponse> dVar) {
        return a.d(this.compatWs, new RetrofitEcgReviewRemoteRepository$store$2(j5, j11, str), new RetrofitEcgReviewRemoteRepository$store$3(j5, j11, str, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.ecg.webservices.EcgReviewRemoteRepository
    public EcgReviewRemoteRepository withSyncContext(String str) {
        return new RetrofitEcgReviewRemoteRepository(this.compatWebservicesFactory, str);
    }

    public /* synthetic */ RetrofitEcgReviewRemoteRepository(b bVar, String str, int i11, m mVar) {
        this(bVar, (i11 & 2) != 0 ? null : str);
    }
}
