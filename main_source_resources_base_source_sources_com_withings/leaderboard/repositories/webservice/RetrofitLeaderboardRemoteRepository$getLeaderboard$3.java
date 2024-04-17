package com.withings.leaderboard.repositories.webservice;

import com.withings.leaderboard.repositories.data.LeaderboardResult;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitLeaderboardRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/leaderboard/repositories/data/LeaderboardResult;", "Lcom/withings/leaderboard/repositories/webservice/LeaderboardRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.leaderboard.repositories.webservice.RetrofitLeaderboardRemoteRepository$getLeaderboard$3", f = "RetrofitLeaderboardRemoteRepository.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitLeaderboardRemoteRepository$getLeaderboard$3 extends i implements p<LeaderboardRetrofit2Api, d<? super LeaderboardResult>, Object> {
    final /* synthetic */ int $measureType;
    final /* synthetic */ long $userId;
    final /* synthetic */ String $weekDate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitLeaderboardRemoteRepository$getLeaderboard$3(String str, int i11, long j5, d<? super RetrofitLeaderboardRemoteRepository$getLeaderboard$3> dVar) {
        super(2, dVar);
        this.$weekDate = str;
        this.$measureType = i11;
        this.$userId = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitLeaderboardRemoteRepository$getLeaderboard$3 retrofitLeaderboardRemoteRepository$getLeaderboard$3 = new RetrofitLeaderboardRemoteRepository$getLeaderboard$3(this.$weekDate, this.$measureType, this.$userId, dVar);
        retrofitLeaderboardRemoteRepository$getLeaderboard$3.L$0 = obj;
        return retrofitLeaderboardRemoteRepository$getLeaderboard$3;
    }

    @Override // ym0.p
    public final Object invoke(LeaderboardRetrofit2Api leaderboardRetrofit2Api, d<? super LeaderboardResult> dVar) {
        return ((RetrofitLeaderboardRemoteRepository$getLeaderboard$3) create(leaderboardRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            String str = this.$weekDate;
            int i12 = this.$measureType;
            long j5 = this.$userId;
            this.label = 1;
            obj = ((LeaderboardRetrofit2Api) this.L$0).getLeaderboard(str, i12, j5, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
