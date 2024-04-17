package com.withings.leaderboard.ui;

import ah.p;
import com.withings.leaderboard.ui.LeaderboardViewModel_HiltModules;
import dagger.internal.b;
/* loaded from: classes3.dex */
public final class LeaderboardViewModel_HiltModules_KeyModule_ProvideFactory implements b<String> {

    /* loaded from: classes3.dex */
    private static final class InstanceHolder {
        private static final LeaderboardViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new LeaderboardViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }

    public static LeaderboardViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        String provide = LeaderboardViewModel_HiltModules.KeyModule.provide();
        p.d(provide);
        return provide;
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
