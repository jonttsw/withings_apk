package com.withings.leaderboard.repositories.webservice;

import com.withings.leaderboard.repositories.data.SharePublicKey;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitLeaderboardRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/leaderboard/repositories/data/SharePublicKey;", "Lcom/withings/leaderboard/repositories/webservice/LeaderboardRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.leaderboard.repositories.webservice.RetrofitLeaderboardRemoteRepository$createPublicKey$3", f = "RetrofitLeaderboardRemoteRepository.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitLeaderboardRemoteRepository$createPublicKey$3 extends i implements p<LeaderboardRetrofit2Api, d<? super SharePublicKey>, Object> {
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitLeaderboardRemoteRepository$createPublicKey$3(long j5, d<? super RetrofitLeaderboardRemoteRepository$createPublicKey$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitLeaderboardRemoteRepository$createPublicKey$3 retrofitLeaderboardRemoteRepository$createPublicKey$3 = new RetrofitLeaderboardRemoteRepository$createPublicKey$3(this.$userId, dVar);
        retrofitLeaderboardRemoteRepository$createPublicKey$3.L$0 = obj;
        return retrofitLeaderboardRemoteRepository$createPublicKey$3;
    }

    @Override // ym0.p
    public final Object invoke(LeaderboardRetrofit2Api leaderboardRetrofit2Api, d<? super SharePublicKey> dVar) {
        return ((RetrofitLeaderboardRemoteRepository$createPublicKey$3) create(leaderboardRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            long j5 = this.$userId;
            this.label = 1;
            obj = ((LeaderboardRetrofit2Api) this.L$0).createPublicKey(j5, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
