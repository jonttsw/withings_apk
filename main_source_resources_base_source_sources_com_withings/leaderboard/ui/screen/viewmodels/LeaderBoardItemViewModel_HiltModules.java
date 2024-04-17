package com.withings.leaderboard.ui.screen.viewmodels;

import androidx.lifecycle.g1;
/* loaded from: classes3.dex */
public final class LeaderBoardItemViewModel_HiltModules {

    /* loaded from: classes3.dex */
    public static abstract class BindsModule {
        private BindsModule() {
        }

        public abstract g1 binds(LeaderBoardItemViewModel leaderBoardItemViewModel);
    }

    /* loaded from: classes3.dex */
    public static final class KeyModule {
        private KeyModule() {
        }

        public static String provide() {
            return "com.withings.leaderboard.ui.screen.viewmodels.LeaderBoardItemViewModel";
        }
    }

    private LeaderBoardItemViewModel_HiltModules() {
    }
}
