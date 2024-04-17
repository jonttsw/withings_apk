package com.withings.leaderboard.ui;

import com.withings.leaderboard.domain.LeaderboardManager;
import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.k;
import nm0.l;
import nm0.y;
import qm0.d;
import x70.b;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LeaderboardActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.leaderboard.ui.LeaderboardViewModel$deleteUserFromLeaderboard$1", f = "LeaderboardActivity.kt", l = {ConstantsWs.WS_STATUS_OAUTHWRONGSIGNATURE, ConstantsWs.WS_STATUS_WRONGBIRTHDATE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LeaderboardViewModel$deleteUserFromLeaderboard$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ LeaderboardEntry $friend;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LeaderboardViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardViewModel$deleteUserFromLeaderboard$1(LeaderboardViewModel leaderboardViewModel, LeaderboardEntry leaderboardEntry, d<? super LeaderboardViewModel$deleteUserFromLeaderboard$1> dVar) {
        super(2, dVar);
        this.this$0 = leaderboardViewModel;
        this.$friend = leaderboardEntry;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        LeaderboardViewModel$deleteUserFromLeaderboard$1 leaderboardViewModel$deleteUserFromLeaderboard$1 = new LeaderboardViewModel$deleteUserFromLeaderboard$1(this.this$0, this.$friend, dVar);
        leaderboardViewModel$deleteUserFromLeaderboard$1.L$0 = obj;
        return leaderboardViewModel$deleteUserFromLeaderboard$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlinx.coroutines.CoroutineScope] */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlinx.coroutines.CoroutineScope] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        ?? r12;
        LeaderboardRemoteRepository leaderboardRemoteRepository;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            a11 = l.a(th2);
            r12 = i11;
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    l.b(obj);
                    return y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ?? r13 = (CoroutineScope) this.L$0;
            l.b(obj);
            i11 = r13;
        } else {
            l.b(obj);
            ?? r14 = (CoroutineScope) this.L$0;
            LeaderboardViewModel leaderboardViewModel = this.this$0;
            LeaderboardEntry leaderboardEntry = this.$friend;
            leaderboardRemoteRepository = leaderboardViewModel.remoteRepository;
            long q11 = m70.i.b().e().q();
            long userid = leaderboardEntry.getUserid();
            this.L$0 = r14;
            this.label = 1;
            i11 = r14;
            if (leaderboardRemoteRepository.revoke(q11, userid, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        a11 = y.f85009a;
        r12 = i11;
        if (k.b(a11) != null) {
            b.d(r12, "Error while deleting friend", new Object[0]);
        }
        LeaderboardEntry leaderboardEntry2 = this.$friend;
        if (true ^ (a11 instanceof k.a)) {
            y yVar = (y) a11;
            LeaderboardManager leaderboardManager = LeaderboardManager.Companion.get();
            long userid2 = leaderboardEntry2.getUserid();
            this.L$0 = a11;
            this.label = 2;
            if (leaderboardManager.deleteUser(userid2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((LeaderboardViewModel$deleteUserFromLeaderboard$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
