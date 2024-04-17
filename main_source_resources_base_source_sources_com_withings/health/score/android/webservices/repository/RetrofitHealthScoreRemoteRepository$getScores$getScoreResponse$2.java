package com.withings.health.score.android.webservices.repository;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.n0;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitHealthScoreRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/health/score/android/webservices/repository/GetScoreResponse;", "Lcom/withings/health/score/android/webservices/repository/HealthScoreRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.health.score.android.webservices.repository.RetrofitHealthScoreRemoteRepository$getScores$getScoreResponse$2", f = "RetrofitHealthScoreRemoteRepository.kt", l = {202}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitHealthScoreRemoteRepository$getScores$getScoreResponse$2 extends i implements p<HealthScoreRetrofit2Api, d<? super GetScoreResponse>, Object> {
    final /* synthetic */ long $lastUpdate;
    final /* synthetic */ n0 $offset;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitHealthScoreRemoteRepository$getScores$getScoreResponse$2(long j5, long j11, n0 n0Var, d<? super RetrofitHealthScoreRemoteRepository$getScores$getScoreResponse$2> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$lastUpdate = j11;
        this.$offset = n0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitHealthScoreRemoteRepository$getScores$getScoreResponse$2 retrofitHealthScoreRemoteRepository$getScores$getScoreResponse$2 = new RetrofitHealthScoreRemoteRepository$getScores$getScoreResponse$2(this.$userId, this.$lastUpdate, this.$offset, dVar);
        retrofitHealthScoreRemoteRepository$getScores$getScoreResponse$2.L$0 = obj;
        return retrofitHealthScoreRemoteRepository$getScores$getScoreResponse$2;
    }

    @Override // ym0.p
    public final Object invoke(HealthScoreRetrofit2Api healthScoreRetrofit2Api, d<? super GetScoreResponse> dVar) {
        return ((RetrofitHealthScoreRemoteRepository$getScores$getScoreResponse$2) create(healthScoreRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            HealthScoreRetrofit2Api healthScoreRetrofit2Api = (HealthScoreRetrofit2Api) this.L$0;
            long j5 = this.$userId;
            long j11 = this.$lastUpdate;
            Integer num = new Integer(this.$offset.f76254a);
            this.label = 1;
            obj = healthScoreRetrofit2Api.getScores(j5, j11, num, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
