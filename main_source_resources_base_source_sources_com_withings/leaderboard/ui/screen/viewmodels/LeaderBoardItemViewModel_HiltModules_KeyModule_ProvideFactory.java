package com.withings.leaderboard.ui.screen.viewmodels;

import ah.p;
import com.withings.leaderboard.ui.screen.viewmodels.LeaderBoardItemViewModel_HiltModules;
import dagger.internal.b;
/* loaded from: classes3.dex */
public final class LeaderBoardItemViewModel_HiltModules_KeyModule_ProvideFactory implements b<String> {

    /* loaded from: classes3.dex */
    private static final class InstanceHolder {
        private static final LeaderBoardItemViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new LeaderBoardItemViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }

    public static LeaderBoardItemViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        String provide = LeaderBoardItemViewModel_HiltModules.KeyModule.provide();
        p.d(provide);
        return provide;
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
