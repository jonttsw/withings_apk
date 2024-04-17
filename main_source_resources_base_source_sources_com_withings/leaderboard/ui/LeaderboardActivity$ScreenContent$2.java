package com.withings.leaderboard.ui;

import ah.o;
import androidx.compose.material.c5;
import androidx.compose.runtime.a;
import com.withings.leaderboard.repositories.data.SharePublicKey;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LeaderboardActivity.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LeaderboardActivity$ScreenContent$2 extends w implements p<a, Integer, y> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ LeaderboardViewModel $leaderboardViewModel;
    final /* synthetic */ c5 $modalBottomSheetState;
    final /* synthetic */ SharePublicKey $sharedPublicKey;
    final /* synthetic */ LeaderboardActivity $tmp0_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardActivity$ScreenContent$2(LeaderboardActivity leaderboardActivity, c5 c5Var, SharePublicKey sharePublicKey, LeaderboardViewModel leaderboardViewModel, int i11, int i12) {
        super(2);
        this.$tmp0_rcvr = leaderboardActivity;
        this.$modalBottomSheetState = c5Var;
        this.$sharedPublicKey = sharePublicKey;
        this.$leaderboardViewModel = leaderboardViewModel;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(a aVar, int i11) {
        this.$tmp0_rcvr.ScreenContent(this.$modalBottomSheetState, this.$sharedPublicKey, this.$leaderboardViewModel, aVar, o.g(this.$$changed | 1), this.$$default);
    }
}
