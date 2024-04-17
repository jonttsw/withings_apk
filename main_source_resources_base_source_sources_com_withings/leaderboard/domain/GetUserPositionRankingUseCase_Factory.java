package com.withings.leaderboard.domain;

import javax.inject.Provider;
/* loaded from: classes3.dex */
public final class GetUserPositionRankingUseCase_Factory implements dagger.internal.b<GetUserPositionRankingUseCase> {
    private final Provider<GetLeaderBoardItemUseCase> getLeaderBoardItemUseCaseProvider;

    public GetUserPositionRankingUseCase_Factory(Provider<GetLeaderBoardItemUseCase> provider) {
        this.getLeaderBoardItemUseCaseProvider = provider;
    }

    public static GetUserPositionRankingUseCase_Factory create(Provider<GetLeaderBoardItemUseCase> provider) {
        return new GetUserPositionRankingUseCase_Factory(provider);
    }

    public static GetUserPositionRankingUseCase newInstance(GetLeaderBoardItemUseCase getLeaderBoardItemUseCase) {
        return new GetUserPositionRankingUseCase(getLeaderBoardItemUseCase);
    }

    @Override // javax.inject.Provider
    public GetUserPositionRankingUseCase get() {
        return newInstance(this.getLeaderBoardItemUseCaseProvider.get());
    }
}
