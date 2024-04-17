package com.withings.leaderboard.domain;

import com.withings.leaderboard.repositories.data.LeaderboardProgramPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
/* compiled from: GetLeaderboard.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/withings/leaderboard/repositories/data/LeaderboardProgramPrefs;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AutoJoinLeaderboard$leaderboardProgramPrefs$2 extends w implements ym0.a<LeaderboardProgramPrefs> {
    final /* synthetic */ AutoJoinLeaderboard this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoJoinLeaderboard$leaderboardProgramPrefs$2(AutoJoinLeaderboard autoJoinLeaderboard) {
        super(0);
        this.this$0 = autoJoinLeaderboard;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final LeaderboardProgramPrefs invoke() {
        return new LeaderboardProgramPrefs(this.this$0.getContext());
    }
}
