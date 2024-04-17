package com.withings.leaderboard.ui;

import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.leaderboard.domain.LeaderboardSyncJobFactory;
import javax.inject.Provider;
import r70.c;
import t00.d;
/* loaded from: classes3.dex */
public final class LeaderboardWeekViewModel_Factory {
    private final Provider<ActivityAggregateManager> activityAggregateManagerProvider;
    private final Provider<LeaderboardSyncJobFactory> leaderboardSyncJobFactoryProvider;
    private final Provider<d> networkSyncManagerProvider;
    private final Provider<c> userRepositoryProvider;

    public LeaderboardWeekViewModel_Factory(Provider<LeaderboardSyncJobFactory> provider, Provider<ActivityAggregateManager> provider2, Provider<d> provider3, Provider<c> provider4) {
        this.leaderboardSyncJobFactoryProvider = provider;
        this.activityAggregateManagerProvider = provider2;
        this.networkSyncManagerProvider = provider3;
        this.userRepositoryProvider = provider4;
    }

    public static LeaderboardWeekViewModel_Factory create(Provider<LeaderboardSyncJobFactory> provider, Provider<ActivityAggregateManager> provider2, Provider<d> provider3, Provider<c> provider4) {
        return new LeaderboardWeekViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static LeaderboardWeekViewModel newInstance(String str, LeaderboardSyncJobFactory leaderboardSyncJobFactory, ActivityAggregateManager activityAggregateManager, d dVar, c cVar) {
        return new LeaderboardWeekViewModel(str, leaderboardSyncJobFactory, activityAggregateManager, dVar, cVar);
    }

    public LeaderboardWeekViewModel get(String str) {
        return newInstance(str, this.leaderboardSyncJobFactoryProvider.get(), this.activityAggregateManagerProvider.get(), this.networkSyncManagerProvider.get(), this.userRepositoryProvider.get());
    }
}
