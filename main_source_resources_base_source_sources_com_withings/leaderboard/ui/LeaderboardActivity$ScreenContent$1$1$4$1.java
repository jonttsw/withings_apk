package com.withings.leaderboard.ui;

import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import k1.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: LeaderboardActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withings/leaderboard/repositories/data/LeaderboardEntry;", "it", "Lnm0/y;", "invoke", "(Lcom/withings/leaderboard/repositories/data/LeaderboardEntry;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class LeaderboardActivity$ScreenContent$1$1$4$1 extends w implements l<LeaderboardEntry, y> {
    final /* synthetic */ r0<LeaderboardEntry> $userToDelete;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardActivity$ScreenContent$1$1$4$1(r0<LeaderboardEntry> r0Var) {
        super(1);
        this.$userToDelete = r0Var;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(LeaderboardEntry leaderboardEntry) {
        invoke2(leaderboardEntry);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LeaderboardEntry it) {
        u.j(it, "it");
        this.$userToDelete.setValue(it);
    }
}
