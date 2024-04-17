package com.withings.reminder.di;

import ah.p;
import com.withings.reminder.model.ReminderRepository;
import dagger.internal.b;
/* loaded from: classes4.dex */
public final class RemindersBinderModule_ProvideReminderRepositoryFactory implements b<ReminderRepository> {

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final RemindersBinderModule_ProvideReminderRepositoryFactory INSTANCE = new RemindersBinderModule_ProvideReminderRepositoryFactory();

        private InstanceHolder() {
        }
    }

    public static RemindersBinderModule_ProvideReminderRepositoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ReminderRepository provideReminderRepository() {
        ReminderRepository provideReminderRepository = RemindersBinderModule.INSTANCE.provideReminderRepository();
        p.d(provideReminderRepository);
        return provideReminderRepository;
    }

    @Override // javax.inject.Provider
    public ReminderRepository get() {
        return provideReminderRepository();
    }
}
