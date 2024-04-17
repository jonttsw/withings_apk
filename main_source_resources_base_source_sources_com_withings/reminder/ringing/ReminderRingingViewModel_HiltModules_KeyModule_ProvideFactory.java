package com.withings.reminder.ringing;

import ah.p;
import com.withings.reminder.ringing.ReminderRingingViewModel_HiltModules;
import dagger.internal.b;
/* loaded from: classes4.dex */
public final class ReminderRingingViewModel_HiltModules_KeyModule_ProvideFactory implements b<String> {

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final ReminderRingingViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ReminderRingingViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }

    public static ReminderRingingViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        String provide = ReminderRingingViewModel_HiltModules.KeyModule.provide();
        p.d(provide);
        return provide;
    }

    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }
}
