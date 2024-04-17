package com.withings.leaderboard.ui;

import dagger.internal.c;
import dagger.internal.d;
import javax.inject.Provider;
/* loaded from: classes3.dex */
public final class LeaderboardWeekViewModelFactory_Impl implements LeaderboardWeekViewModelFactory {
    private final LeaderboardWeekViewModel_Factory delegateFactory;

    LeaderboardWeekViewModelFactory_Impl(LeaderboardWeekViewModel_Factory leaderboardWeekViewModel_Factory) {
        this.delegateFactory = leaderboardWeekViewModel_Factory;
    }

    public static d<LeaderboardWeekViewModelFactory> createFactoryProvider(LeaderboardWeekViewModel_Factory leaderboardWeekViewModel_Factory) {
        return c.a(new LeaderboardWeekViewModelFactory_Impl(leaderboardWeekViewModel_Factory));
    }

    @Override // com.withings.leaderboard.ui.LeaderboardWeekViewModelFactory
    public LeaderboardWeekViewModel create(String str) {
        return this.delegateFactory.get(str);
    }

    public static Provider<LeaderboardWeekViewModelFactory> create(LeaderboardWeekViewModel_Factory leaderboardWeekViewModel_Factory) {
        return c.a(new LeaderboardWeekViewModelFactory_Impl(leaderboardWeekViewModel_Factory));
    }
}
