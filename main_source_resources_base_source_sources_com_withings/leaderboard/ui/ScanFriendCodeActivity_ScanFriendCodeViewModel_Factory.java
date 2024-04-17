package com.withings.leaderboard.ui;

import com.withings.leaderboard.domain.LeaderboardSyncJobFactory;
import com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository;
import com.withings.leaderboard.ui.ScanFriendCodeActivity;
import dagger.internal.b;
import javax.inject.Provider;
import r70.c;
import t00.d;
/* loaded from: classes3.dex */
public final class ScanFriendCodeActivity_ScanFriendCodeViewModel_Factory implements b<ScanFriendCodeActivity.ScanFriendCodeViewModel> {
    private final Provider<LeaderboardSyncJobFactory> leaderboardSyncJobFactoryProvider;
    private final Provider<d> networkSyncManagerProvider;
    private final Provider<LeaderboardRemoteRepository> remoteRepositoryProvider;
    private final Provider<c> userRepositoryProvider;

    public ScanFriendCodeActivity_ScanFriendCodeViewModel_Factory(Provider<c> provider, Provider<LeaderboardRemoteRepository> provider2, Provider<LeaderboardSyncJobFactory> provider3, Provider<d> provider4) {
        this.userRepositoryProvider = provider;
        this.remoteRepositoryProvider = provider2;
        this.leaderboardSyncJobFactoryProvider = provider3;
        this.networkSyncManagerProvider = provider4;
    }

    public static ScanFriendCodeActivity_ScanFriendCodeViewModel_Factory create(Provider<c> provider, Provider<LeaderboardRemoteRepository> provider2, Provider<LeaderboardSyncJobFactory> provider3, Provider<d> provider4) {
        return new ScanFriendCodeActivity_ScanFriendCodeViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static ScanFriendCodeActivity.ScanFriendCodeViewModel newInstance(c cVar, LeaderboardRemoteRepository leaderboardRemoteRepository, LeaderboardSyncJobFactory leaderboardSyncJobFactory, d dVar) {
        return new ScanFriendCodeActivity.ScanFriendCodeViewModel(cVar, leaderboardRemoteRepository, leaderboardSyncJobFactory, dVar);
    }

    @Override // javax.inject.Provider
    public ScanFriendCodeActivity.ScanFriendCodeViewModel get() {
        return newInstance(this.userRepositoryProvider.get(), this.remoteRepositoryProvider.get(), this.leaderboardSyncJobFactoryProvider.get(), this.networkSyncManagerProvider.get());
    }
}
