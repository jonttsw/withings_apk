package com.withings.leaderboard.ui;

import ah.o;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import u0.i0;
import ym0.l;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LeaderboardActivity.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LeaderboardActivity$LeaderboardPager$2 extends w implements p<a, Integer, y> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ e $modifier;
    final /* synthetic */ ym0.a<y> $onInviteClicked;
    final /* synthetic */ l<LeaderboardEntry, y> $onLongClick;
    final /* synthetic */ i0 $pagerState;
    final /* synthetic */ LeaderboardActivity $tmp0_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LeaderboardActivity$LeaderboardPager$2(LeaderboardActivity leaderboardActivity, e eVar, i0 i0Var, ym0.a<y> aVar, l<? super LeaderboardEntry, y> lVar, int i11) {
        super(2);
        this.$tmp0_rcvr = leaderboardActivity;
        this.$modifier = eVar;
        this.$pagerState = i0Var;
        this.$onInviteClicked = aVar;
        this.$onLongClick = lVar;
        this.$$changed = i11;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(a aVar, int i11) {
        this.$tmp0_rcvr.LeaderboardPager(this.$modifier, this.$pagerState, this.$onInviteClicked, this.$onLongClick, aVar, o.g(this.$$changed | 1));
    }
}
