package com.withings.health.score.android.webservices.repository;

import com.withings.library.healthscore.HealthScoreService;
import hn.a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitHealthScoreRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/health/score/android/webservices/repository/HealthScoreRetrofit2Api;", "Lnm0/y;", "<anonymous>", "(Lcom/withings/health/score/android/webservices/repository/HealthScoreRetrofit2Api;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.health.score.android.webservices.repository.RetrofitHealthScoreRemoteRepository$saveScore$3", f = "RetrofitHealthScoreRemoteRepository.kt", l = {88}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitHealthScoreRemoteRepository$saveScore$3 extends i implements p<HealthScoreRetrofit2Api, d<? super y>, Object> {
    final /* synthetic */ String $scoresString;
    final /* synthetic */ DateTime $timestamp;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitHealthScoreRemoteRepository$saveScore$3(long j5, DateTime dateTime, String str, d<? super RetrofitHealthScoreRemoteRepository$saveScore$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$timestamp = dateTime;
        this.$scoresString = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitHealthScoreRemoteRepository$saveScore$3 retrofitHealthScoreRemoteRepository$saveScore$3 = new RetrofitHealthScoreRemoteRepository$saveScore$3(this.$userId, this.$timestamp, this.$scoresString, dVar);
        retrofitHealthScoreRemoteRepository$saveScore$3.L$0 = obj;
        return retrofitHealthScoreRemoteRepository$saveScore$3;
    }

    @Override // ym0.p
    public final Object invoke(HealthScoreRetrofit2Api healthScoreRetrofit2Api, d<? super y> dVar) {
        return ((RetrofitHealthScoreRemoteRepository$saveScore$3) create(healthScoreRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            DateTime timestamp = this.$timestamp;
            u.i(timestamp, "$timestamp");
            long j11 = a.j(timestamp);
            int versionCode = HealthScoreService.Companion.getVersionCode();
            String scoresString = this.$scoresString;
            u.i(scoresString, "$scoresString");
            this.label = 1;
            if (healthScoreRetrofit2Api.createScores(j5, j11, versionCode, scoresString, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
