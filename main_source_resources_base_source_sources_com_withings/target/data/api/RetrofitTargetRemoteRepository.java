package com.withings.target.data.api;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.target.data.api.model.TargetSeriesWS;
import com.withings.target.data.api.model.TargetSingleWS;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.rsm.packet.RSMSet;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement;
import qm0.d;
import s00.a;
import s00.b;
/* compiled from: RetrofitTargetRemoteRepository.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/withings/target/data/api/RetrofitTargetRemoteRepository;", "Lcom/withings/target/data/api/TargetRemoteRepository;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/target/data/api/TargetRemoteRepository;", "", "userid", "lastUpdate", "Lcom/withings/target/data/api/model/TargetSeriesWS;", "get", "(JJLqm0/d;)Ljava/lang/Object;", "targets", RSMSet.ELEMENT, "(JLjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "", "type", ValidateElement.RangeValidateElement.METHOD, "measureType", "Lcom/withings/target/data/api/model/TargetSingleWS;", "unset", "(JILjava/lang/Integer;ILqm0/d;)Ljava/lang/Object;", "Ls00/b;", "compatWebservicesFactory", "Ls00/b;", "Ls00/a;", "Lcom/withings/target/data/api/TargetRetrofit1Api;", "Lcom/withings/target/data/api/TargetRetrofit2Api;", "compatWS", "Ls00/a;", "<init>", "(Ls00/b;Ljava/lang/String;)V", "target_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RetrofitTargetRemoteRepository implements TargetRemoteRepository {
    private final a<TargetRetrofit1Api, TargetRetrofit2Api> compatWS;
    private final b compatWebservicesFactory;

    public RetrofitTargetRemoteRepository(b compatWebservicesFactory, String str) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        this.compatWebservicesFactory = compatWebservicesFactory;
        this.compatWS = compatWebservicesFactory.a(str, TargetRetrofit1Api.class, TargetRetrofit2Api.class);
    }

    @Override // com.withings.target.data.api.TargetRemoteRepository
    public Object get(long j5, long j11, d<? super TargetSeriesWS> dVar) {
        return a.d(this.compatWS, new RetrofitTargetRemoteRepository$get$2(j5, j11), new RetrofitTargetRemoteRepository$get$3(j5, j11, null), null, false, dVar, 124);
    }

    @Override // com.withings.target.data.api.TargetRemoteRepository
    public Object set(long j5, String str, d<? super TargetSeriesWS> dVar) {
        return a.d(this.compatWS, new RetrofitTargetRemoteRepository$set$2(j5, str), new RetrofitTargetRemoteRepository$set$3(j5, str, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.target.data.api.TargetRemoteRepository
    public Object unset(long j5, int i11, Integer num, int i12, d<? super TargetSingleWS> dVar) {
        return a.d(this.compatWS, new RetrofitTargetRemoteRepository$unset$2(j5, i11, num, i12), new RetrofitTargetRemoteRepository$unset$3(j5, i11, num, i12, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.target.data.api.TargetRemoteRepository
    public TargetRemoteRepository withSyncContext(String str) {
        return new RetrofitTargetRemoteRepository(this.compatWebservicesFactory, str);
    }

    public /* synthetic */ RetrofitTargetRemoteRepository(b bVar, String str, int i11, m mVar) {
        this(bVar, (i11 & 2) != 0 ? null : str);
    }
}
