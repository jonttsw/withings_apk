package com.withings.leaderboard.domain;

import com.withings.leaderboard.utils.FilterLeaderBoardEntryUseCase;
import javax.inject.Provider;
import m70.i;
/* loaded from: classes3.dex */
public final class GetLeaderBoardItemUseCase_Factory implements dagger.internal.b<GetLeaderBoardItemUseCase> {
    private final Provider<FilterLeaderBoardEntryUseCase> filterLeaderBoardEntryUseCaseProvider;
    private final Provider<LeaderboardManager> leaderboardManagerProvider;
    private final Provider<i> userManagerProvider;

    public GetLeaderBoardItemUseCase_Factory(Provider<LeaderboardManager> provider, Provider<i> provider2, Provider<FilterLeaderBoardEntryUseCase> provider3) {
        this.leaderboardManagerProvider = provider;
        this.userManagerProvider = provider2;
        this.filterLeaderBoardEntryUseCaseProvider = provider3;
    }

    public static GetLeaderBoardItemUseCase_Factory create(Provider<LeaderboardManager> provider, Provider<i> provider2, Provider<FilterLeaderBoardEntryUseCase> provider3) {
        return new GetLeaderBoardItemUseCase_Factory(provider, provider2, provider3);
    }

    public static GetLeaderBoardItemUseCase newInstance(LeaderboardManager leaderboardManager, i iVar, FilterLeaderBoardEntryUseCase filterLeaderBoardEntryUseCase) {
        return new GetLeaderBoardItemUseCase(leaderboardManager, iVar, filterLeaderBoardEntryUseCase);
    }

    @Override // javax.inject.Provider
    public GetLeaderBoardItemUseCase get() {
        return newInstance(this.leaderboardManagerProvider.get(), this.userManagerProvider.get(), this.filterLeaderBoardEntryUseCaseProvider.get());
    }
}
