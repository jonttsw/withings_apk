package com.withings.leaderboard.ui.screen.viewmodels;

import com.withings.leaderboard.domain.GetLeaderBoardItemUseCase;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes3.dex */
public final class LeaderBoardItemViewModel_Factory implements b<LeaderBoardItemViewModel> {
    private final Provider<GetLeaderBoardItemUseCase> getLeaderboardProvider;

    public LeaderBoardItemViewModel_Factory(Provider<GetLeaderBoardItemUseCase> provider) {
        this.getLeaderboardProvider = provider;
    }

    public static LeaderBoardItemViewModel_Factory create(Provider<GetLeaderBoardItemUseCase> provider) {
        return new LeaderBoardItemViewModel_Factory(provider);
    }

    public static LeaderBoardItemViewModel newInstance(GetLeaderBoardItemUseCase getLeaderBoardItemUseCase) {
        return new LeaderBoardItemViewModel(getLeaderBoardItemUseCase);
    }

    @Override // javax.inject.Provider
    public LeaderBoardItemViewModel get() {
        return newInstance(this.getLeaderboardProvider.get());
    }
}
