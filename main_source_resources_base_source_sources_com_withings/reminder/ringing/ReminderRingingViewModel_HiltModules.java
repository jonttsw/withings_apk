package com.withings.reminder.ringing;

import androidx.lifecycle.g1;
/* loaded from: classes4.dex */
public final class ReminderRingingViewModel_HiltModules {

    /* loaded from: classes4.dex */
    public static abstract class BindsModule {
        private BindsModule() {
        }

        public abstract g1 binds(ReminderRingingViewModel reminderRingingViewModel);
    }

    /* loaded from: classes4.dex */
    public static final class KeyModule {
        private KeyModule() {
        }

        public static String provide() {
            return "com.withings.reminder.ringing.ReminderRingingViewModel";
        }
    }

    private ReminderRingingViewModel_HiltModules() {
    }
}
