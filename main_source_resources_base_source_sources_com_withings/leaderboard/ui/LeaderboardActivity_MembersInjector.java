package com.withings.leaderboard.ui;

import ak0.b;
import com.withings.leaderboard.domain.LeaderboardSyncJobFactory;
import com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository;
import javax.inject.Provider;
import t00.d;
/* loaded from: classes3.dex */
public final class LeaderboardActivity_MembersInjector implements b<LeaderboardActivity> {
    private final Provider<LeaderboardRemoteRepository> leaderboardRemoteRepositoryProvider;
    private final Provider<LeaderboardSyncJobFactory> leaderboardSyncJobFactoryProvider;
    private final Provider<d> networkSyncManagerProvider;
    private final Provider<LeaderboardWeekViewModelFactory> viewModelFactoryProvider;

    public LeaderboardActivity_MembersInjector(Provider<LeaderboardSyncJobFactory> provider, Provider<d> provider2, Provider<LeaderboardWeekViewModelFactory> provider3, Provider<LeaderboardRemoteRepository> provider4) {
        this.leaderboardSyncJobFactoryProvider = provider;
        this.networkSyncManagerProvider = provider2;
        this.viewModelFactoryProvider = provider3;
        this.leaderboardRemoteRepositoryProvider = provider4;
    }

    public static b<LeaderboardActivity> create(Provider<LeaderboardSyncJobFactory> provider, Provider<d> provider2, Provider<LeaderboardWeekViewModelFactory> provider3, Provider<LeaderboardRemoteRepository> provider4) {
        return new LeaderboardActivity_MembersInjector(provider, provider2, provider3, provider4);
    }

    public static void injectLeaderboardRemoteRepository(LeaderboardActivity leaderboardActivity, LeaderboardRemoteRepository leaderboardRemoteRepository) {
        leaderboardActivity.leaderboardRemoteRepository = leaderboardRemoteRepository;
    }

    public static void injectLeaderboardSyncJobFactory(LeaderboardActivity leaderboardActivity, LeaderboardSyncJobFactory leaderboardSyncJobFactory) {
        leaderboardActivity.leaderboardSyncJobFactory = leaderboardSyncJobFactory;
    }

    public static void injectNetworkSyncManager(LeaderboardActivity leaderboardActivity, d dVar) {
        leaderboardActivity.networkSyncManager = dVar;
    }

    public static void injectViewModelFactory(LeaderboardActivity leaderboardActivity, LeaderboardWeekViewModelFactory leaderboardWeekViewModelFactory) {
        leaderboardActivity.viewModelFactory = leaderboardWeekViewModelFactory;
    }

    public void injectMembers(LeaderboardActivity leaderboardActivity) {
        injectLeaderboardSyncJobFactory(leaderboardActivity, this.leaderboardSyncJobFactoryProvider.get());
        injectNetworkSyncManager(leaderboardActivity, this.networkSyncManagerProvider.get());
        injectViewModelFactory(leaderboardActivity, this.viewModelFactoryProvider.get());
        injectLeaderboardRemoteRepository(leaderboardActivity, this.leaderboardRemoteRepositoryProvider.get());
    }
}
