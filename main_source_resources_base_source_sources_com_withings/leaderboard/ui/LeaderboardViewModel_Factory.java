package com.withings.leaderboard.ui;

import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes3.dex */
public final class LeaderboardViewModel_Factory implements b<LeaderboardViewModel> {
    private final Provider<ActivityAggregateManager> activityAggregateManagerProvider;
    private final Provider<LeaderboardRemoteRepository> remoteRepositoryProvider;

    public LeaderboardViewModel_Factory(Provider<LeaderboardRemoteRepository> provider, Provider<ActivityAggregateManager> provider2) {
        this.remoteRepositoryProvider = provider;
        this.activityAggregateManagerProvider = provider2;
    }

    public static LeaderboardViewModel_Factory create(Provider<LeaderboardRemoteRepository> provider, Provider<ActivityAggregateManager> provider2) {
        return new LeaderboardViewModel_Factory(provider, provider2);
    }

    public static LeaderboardViewModel newInstance(LeaderboardRemoteRepository leaderboardRemoteRepository, ActivityAggregateManager activityAggregateManager) {
        return new LeaderboardViewModel(leaderboardRemoteRepository, activityAggregateManager);
    }

    @Override // javax.inject.Provider
    public LeaderboardViewModel get() {
        return newInstance(this.remoteRepositoryProvider.get(), this.activityAggregateManagerProvider.get());
    }
}
