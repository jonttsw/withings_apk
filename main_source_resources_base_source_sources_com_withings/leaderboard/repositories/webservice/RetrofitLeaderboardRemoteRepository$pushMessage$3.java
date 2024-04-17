package com.withings.leaderboard.repositories.webservice;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitLeaderboardRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/leaderboard/repositories/webservice/LeaderboardRetrofit2Api;", "Lnm0/y;", "<anonymous>", "(Lcom/withings/leaderboard/repositories/webservice/LeaderboardRetrofit2Api;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.leaderboard.repositories.webservice.RetrofitLeaderboardRemoteRepository$pushMessage$3", f = "RetrofitLeaderboardRemoteRepository.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitLeaderboardRemoteRepository$pushMessage$3 extends i implements p<LeaderboardRetrofit2Api, d<? super y>, Object> {
    final /* synthetic */ String $message;
    final /* synthetic */ String $options;
    final /* synthetic */ long $targetUserId;
    final /* synthetic */ long $userid;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitLeaderboardRemoteRepository$pushMessage$3(long j5, long j11, String str, String str2, d<? super RetrofitLeaderboardRemoteRepository$pushMessage$3> dVar) {
        super(2, dVar);
        this.$userid = j5;
        this.$targetUserId = j11;
        this.$message = str;
        this.$options = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitLeaderboardRemoteRepository$pushMessage$3 retrofitLeaderboardRemoteRepository$pushMessage$3 = new RetrofitLeaderboardRemoteRepository$pushMessage$3(this.$userid, this.$targetUserId, this.$message, this.$options, dVar);
        retrofitLeaderboardRemoteRepository$pushMessage$3.L$0 = obj;
        return retrofitLeaderboardRemoteRepository$pushMessage$3;
    }

    @Override // ym0.p
    public final Object invoke(LeaderboardRetrofit2Api leaderboardRetrofit2Api, d<? super y> dVar) {
        return ((RetrofitLeaderboardRemoteRepository$pushMessage$3) create(leaderboardRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            long j5 = this.$userid;
            long j11 = this.$targetUserId;
            String str = this.$message;
            String str2 = this.$options;
            this.label = 1;
            if (((LeaderboardRetrofit2Api) this.L$0).pushMessage(j5, j11, str, str2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
