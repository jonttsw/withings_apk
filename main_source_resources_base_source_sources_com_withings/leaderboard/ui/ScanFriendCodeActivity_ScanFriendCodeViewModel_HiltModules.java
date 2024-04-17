package com.withings.leaderboard.ui;

import androidx.lifecycle.g1;
import com.withings.leaderboard.ui.ScanFriendCodeActivity;
/* loaded from: classes3.dex */
public final class ScanFriendCodeActivity_ScanFriendCodeViewModel_HiltModules {

    /* loaded from: classes3.dex */
    public static abstract class BindsModule {
        private BindsModule() {
        }

        public abstract g1 binds(ScanFriendCodeActivity.ScanFriendCodeViewModel scanFriendCodeViewModel);
    }

    /* loaded from: classes3.dex */
    public static final class KeyModule {
        private KeyModule() {
        }

        public static String provide() {
            return "com.withings.leaderboard.ui.ScanFriendCodeActivity$ScanFriendCodeViewModel";
        }
    }

    private ScanFriendCodeActivity_ScanFriendCodeViewModel_HiltModules() {
    }
}
