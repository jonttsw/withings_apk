package com.withings.leaderboard.ui;

import com.withings.leaderboard.domain.LeaderboardSyncJobFactory;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.sync.SyncJob;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
import t00.g;
import ym0.p;
/* compiled from: LeaderboardActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.leaderboard.ui.LeaderboardActivity$onActivityResult$1", f = "LeaderboardActivity.kt", l = {ConstantsWs.WS_STATUS_WRONGRESOURCETYPE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class LeaderboardActivity$onActivityResult$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    int label;
    final /* synthetic */ LeaderboardActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardActivity$onActivityResult$1(LeaderboardActivity leaderboardActivity, d<? super LeaderboardActivity$onActivityResult$1> dVar) {
        super(2, dVar);
        this.this$0 = leaderboardActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new LeaderboardActivity$onActivityResult$1(this.this$0, dVar);
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
            t00.d networkSyncManager = this.this$0.getNetworkSyncManager();
            LeaderboardSyncJobFactory leaderboardSyncJobFactory = this.this$0.getLeaderboardSyncJobFactory();
            userId = this.this$0.getUserId();
            DateTime minusDays = DateTime.now().minusDays(1);
            u.i(minusDays, "minusDays(...)");
            DateTime now = DateTime.now();
            u.i(now, "now(...)");
            SyncJob create = leaderboardSyncJobFactory.create(userId, minusDays, now, false);
            this.label = 1;
            if (g.a(networkSyncManager, create, "afterFriendCodeScanned", this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((LeaderboardActivity$onActivityResult$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
