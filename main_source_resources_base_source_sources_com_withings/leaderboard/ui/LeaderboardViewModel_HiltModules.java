package com.withings.leaderboard.ui;

import androidx.lifecycle.g1;
/* loaded from: classes3.dex */
public final class LeaderboardViewModel_HiltModules {

    /* loaded from: classes3.dex */
    public static abstract class BindsModule {
        private BindsModule() {
        }

        public abstract g1 binds(LeaderboardViewModel leaderboardViewModel);
    }

    /* loaded from: classes3.dex */
    public static final class KeyModule {
        private KeyModule() {
        }

        public static String provide() {
            return "com.withings.leaderboard.ui.LeaderboardViewModel";
        }
    }

    private LeaderboardViewModel_HiltModules() {
    }
}
