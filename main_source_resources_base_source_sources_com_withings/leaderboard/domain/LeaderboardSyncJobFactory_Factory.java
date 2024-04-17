package com.withings.leaderboard.domain;

import android.content.Context;
import com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository;
import javax.inject.Provider;
/* loaded from: classes3.dex */
public final class LeaderboardSyncJobFactory_Factory implements dagger.internal.b<LeaderboardSyncJobFactory> {
    private final Provider<Context> contextProvider;
    private final Provider<LeaderboardRemoteRepository> leaderboardRemoteRepositoryProvider;

    public LeaderboardSyncJobFactory_Factory(Provider<Context> provider, Provider<LeaderboardRemoteRepository> provider2) {
        this.contextProvider = provider;
        this.leaderboardRemoteRepositoryProvider = provider2;
    }

    public static LeaderboardSyncJobFactory_Factory create(Provider<Context> provider, Provider<LeaderboardRemoteRepository> provider2) {
        return new LeaderboardSyncJobFactory_Factory(provider, provider2);
    }

    public static LeaderboardSyncJobFactory newInstance(Context context, LeaderboardRemoteRepository leaderboardRemoteRepository) {
        return new LeaderboardSyncJobFactory(context, leaderboardRemoteRepository);
    }

    @Override // javax.inject.Provider
    public LeaderboardSyncJobFactory get() {
        return newInstance(this.contextProvider.get(), this.leaderboardRemoteRepositoryProvider.get());
    }
}
