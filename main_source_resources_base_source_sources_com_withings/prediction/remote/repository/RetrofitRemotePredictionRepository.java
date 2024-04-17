package com.withings.prediction.remote.repository;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.prediction.remote.repository.api.PredictionRetrofit1Api;
import com.withings.prediction.remote.repository.api.PredictionRetrofit2Api;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import s00.a;
import s00.b;
/* compiled from: RetrofitRemotePredictionRepository.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/withings/prediction/remote/repository/RetrofitRemotePredictionRepository;", "Lcom/withings/prediction/remote/repository/RemotePredictionRepository;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/prediction/remote/repository/RemotePredictionRepository;", "", NavigationArguments.USER_ID, "", "type", "lastUpdateInSeconds", "", "Lcom/withings/prediction/remote/model/WsPrediction;", "get", "(JLjava/lang/Integer;Ljava/lang/Long;Lqm0/d;)Ljava/lang/Object;", "Ls00/b;", "compatWebservicesFactory", "Ls00/b;", "Ls00/a;", "Lcom/withings/prediction/remote/repository/api/PredictionRetrofit1Api;", "Lcom/withings/prediction/remote/repository/api/PredictionRetrofit2Api;", "compatWS", "Ls00/a;", "<init>", "(Ls00/b;Ljava/lang/String;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RetrofitRemotePredictionRepository implements RemotePredictionRepository {
    private final a<PredictionRetrofit1Api, PredictionRetrofit2Api> compatWS;
    private final b compatWebservicesFactory;

    public RetrofitRemotePredictionRepository(b compatWebservicesFactory, String str) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        this.compatWebservicesFactory = compatWebservicesFactory;
        this.compatWS = compatWebservicesFactory.a(str, PredictionRetrofit1Api.class, PredictionRetrofit2Api.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    @Override // com.withings.prediction.remote.repository.RemotePredictionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object get(long r17, java.lang.Integer r19, java.lang.Long r20, qm0.d<? super java.util.List<com.withings.prediction.remote.model.WsPrediction>> r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r21
            boolean r2 = r1 instanceof com.withings.prediction.remote.repository.RetrofitRemotePredictionRepository$get$1
            if (r2 == 0) goto L18
            r2 = r1
            com.withings.prediction.remote.repository.RetrofitRemotePredictionRepository$get$1 r2 = (com.withings.prediction.remote.repository.RetrofitRemotePredictionRepository$get$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.label = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            com.withings.prediction.remote.repository.RetrofitRemotePredictionRepository$get$1 r2 = new com.withings.prediction.remote.repository.RetrofitRemotePredictionRepository$get$1
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r3 = r8.label
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            nm0.l.b(r1)
            goto L5f
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L35:
            nm0.l.b(r1)
            s00.a<com.withings.prediction.remote.repository.api.PredictionRetrofit1Api, com.withings.prediction.remote.repository.api.PredictionRetrofit2Api> r3 = r0.compatWS
            com.withings.prediction.remote.repository.RetrofitRemotePredictionRepository$get$result$1 r1 = new com.withings.prediction.remote.repository.RetrofitRemotePredictionRepository$get$result$1
            r5 = r17
            r7 = r19
            r13 = r20
            r1.<init>(r5, r7, r13)
            com.withings.prediction.remote.repository.RetrofitRemotePredictionRepository$get$result$2 r15 = new com.withings.prediction.remote.repository.RetrofitRemotePredictionRepository$get$result$2
            r14 = 0
            r9 = r15
            r10 = r17
            r12 = r19
            r9.<init>(r10, r12, r13, r14)
            r8.label = r4
            r7 = 0
            r9 = 124(0x7c, float:1.74E-43)
            r6 = 0
            r4 = r1
            r5 = r15
            java.lang.Object r1 = s00.a.d(r3, r4, r5, r6, r7, r8, r9)
            if (r1 != r2) goto L5f
            return r2
        L5f:
            com.withings.prediction.remote.repository.api.GetPredictionResponse r1 = (com.withings.prediction.remote.repository.api.GetPredictionResponse) r1
            java.util.List r1 = r1.getPredictions()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.prediction.remote.repository.RetrofitRemotePredictionRepository.get(long, java.lang.Integer, java.lang.Long, qm0.d):java.lang.Object");
    }

    @Override // com.withings.prediction.remote.repository.RemotePredictionRepository
    public RemotePredictionRepository withSyncContext(String str) {
        return new RetrofitRemotePredictionRepository(this.compatWebservicesFactory, str);
    }

    public /* synthetic */ RetrofitRemotePredictionRepository(b bVar, String str, int i11, m mVar) {
        this(bVar, (i11 & 2) != 0 ? null : str);
    }
}
