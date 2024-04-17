package com.withings.reminder.ringing;

import com.withings.reminder.model.ReminderRepository;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ReminderRingingViewModel_Factory implements b<ReminderRingingViewModel> {
    private final Provider<ReminderRepository> reminderRepositoryProvider;

    public ReminderRingingViewModel_Factory(Provider<ReminderRepository> provider) {
        this.reminderRepositoryProvider = provider;
    }

    public static ReminderRingingViewModel_Factory create(Provider<ReminderRepository> provider) {
        return new ReminderRingingViewModel_Factory(provider);
    }

    public static ReminderRingingViewModel newInstance(ReminderRepository reminderRepository) {
        return new ReminderRingingViewModel(reminderRepository);
    }

    @Override // javax.inject.Provider
    public ReminderRingingViewModel get() {
        return newInstance(this.reminderRepositoryProvider.get());
    }
}
