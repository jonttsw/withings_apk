package com.withings.leaderboard.di;

import ah.p;
import com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes3.dex */
public final class LeaderboardModule_ProvideLeaderboardRemoteRepositoryFactory implements b<LeaderboardRemoteRepository> {
    private final Provider<s00.b> compatWebservicesFactoryProvider;
    private final LeaderboardModule module;

    public LeaderboardModule_ProvideLeaderboardRemoteRepositoryFactory(LeaderboardModule leaderboardModule, Provider<s00.b> provider) {
        this.module = leaderboardModule;
        this.compatWebservicesFactoryProvider = provider;
    }

    public static LeaderboardModule_ProvideLeaderboardRemoteRepositoryFactory create(LeaderboardModule leaderboardModule, Provider<s00.b> provider) {
        return new LeaderboardModule_ProvideLeaderboardRemoteRepositoryFactory(leaderboardModule, provider);
    }

    public static LeaderboardRemoteRepository provideLeaderboardRemoteRepository(LeaderboardModule leaderboardModule, s00.b bVar) {
        LeaderboardRemoteRepository provideLeaderboardRemoteRepository = leaderboardModule.provideLeaderboardRemoteRepository(bVar);
        p.d(provideLeaderboardRemoteRepository);
        return provideLeaderboardRemoteRepository;
    }

    @Override // javax.inject.Provider
    public LeaderboardRemoteRepository get() {
        return provideLeaderboardRemoteRepository(this.module, this.compatWebservicesFactoryProvider.get());
    }
}
