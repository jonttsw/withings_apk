package com.withings.leaderboard.ui;

import ah.o;
import androidx.compose.runtime.a;
import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import k1.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LeaderboardActivity.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LeaderboardActivity$AskDelete$4 extends w implements p<a, Integer, y> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ LeaderboardActivity $tmp2_rcvr;
    final /* synthetic */ r0<LeaderboardEntry> $userToDelete;
    final /* synthetic */ LeaderboardViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardActivity$AskDelete$4(LeaderboardActivity leaderboardActivity, LeaderboardViewModel leaderboardViewModel, r0<LeaderboardEntry> r0Var, int i11) {
        super(2);
        this.$tmp2_rcvr = leaderboardActivity;
        this.$viewModel = leaderboardViewModel;
        this.$userToDelete = r0Var;
        this.$$changed = i11;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(a aVar, int i11) {
        this.$tmp2_rcvr.AskDelete(this.$viewModel, this.$userToDelete, aVar, o.g(this.$$changed | 1));
    }
}
