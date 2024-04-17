package com.withings.leaderboard.ui;

import ah.o;
import androidx.compose.runtime.a;
import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LeaderboardWeekPage.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LeaderboardWeekPageKt$LeaderboardWeekPage$2 extends w implements p<a, Integer, y> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ l<LeaderboardEntry, y> $onClick;
    final /* synthetic */ ym0.a<y> $onInviteClicked;
    final /* synthetic */ l<LeaderboardEntry, y> $onLongClick;
    final /* synthetic */ long $userId;
    final /* synthetic */ LeaderboardWeekViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LeaderboardWeekPageKt$LeaderboardWeekPage$2(long j5, LeaderboardWeekViewModel leaderboardWeekViewModel, ym0.a<y> aVar, l<? super LeaderboardEntry, y> lVar, l<? super LeaderboardEntry, y> lVar2, int i11) {
        super(2);
        this.$userId = j5;
        this.$viewModel = leaderboardWeekViewModel;
        this.$onInviteClicked = aVar;
        this.$onClick = lVar;
        this.$onLongClick = lVar2;
        this.$$changed = i11;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(a aVar, int i11) {
        LeaderboardWeekPageKt.LeaderboardWeekPage(this.$userId, this.$viewModel, this.$onInviteClicked, this.$onClick, this.$onLongClick, aVar, o.g(this.$$changed | 1));
    }
}
