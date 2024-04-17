package com.withings.leaderboard.ui;

import com.withings.leaderboard.domain.GetPublicKey;
import com.withings.leaderboard.repositories.data.SharePublicKey;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: LeaderboardActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/leaderboard/repositories/data/SharePublicKey;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.leaderboard.ui.LeaderboardActivity$onCreate$1$1$1$1$1", f = "LeaderboardActivity.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class LeaderboardActivity$onCreate$1$1$1$1$1 extends i implements p<CoroutineScope, d<? super SharePublicKey>, Object> {
    int label;
    final /* synthetic */ LeaderboardActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardActivity$onCreate$1$1$1$1$1(LeaderboardActivity leaderboardActivity, d<? super LeaderboardActivity$onCreate$1$1$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = leaderboardActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new LeaderboardActivity$onCreate$1$1$1$1$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        long userId;
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
            userId = this.this$0.getUserId();
            GetPublicKey getPublicKey = new GetPublicKey(userId, this.this$0.getLeaderboardRemoteRepository());
            this.label = 1;
            obj = getPublicKey.call(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super SharePublicKey> dVar) {
        return ((LeaderboardActivity$onCreate$1$1$1$1$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
