package com.withings.leaderboard.ui;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LeaderboardWeekPage.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.leaderboard.ui.LeaderboardWeekViewModel", f = "LeaderboardWeekPage.kt", l = {209}, m = "hackUserScoreWithLocalScore")
/* loaded from: classes3.dex */
public final class LeaderboardWeekViewModel$hackUserScoreWithLocalScore$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LeaderboardWeekViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardWeekViewModel$hackUserScoreWithLocalScore$1(LeaderboardWeekViewModel leaderboardWeekViewModel, d<? super LeaderboardWeekViewModel$hackUserScoreWithLocalScore$1> dVar) {
        super(dVar);
        this.this$0 = leaderboardWeekViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object hackUserScoreWithLocalScore;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        hackUserScoreWithLocalScore = this.this$0.hackUserScoreWithLocalScore(null, this);
        return hackUserScoreWithLocalScore;
    }
}
