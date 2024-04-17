package com.withings.reminder.di;

import com.withings.reminder.model.ReminderRepository;
import kotlin.Metadata;
/* compiled from: ReminderModule.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/withings/reminder/di/RemindersBinderModule;", "", "()V", "provideReminderRepository", "Lcom/withings/reminder/model/ReminderRepository;", "reminder_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RemindersBinderModule {
    public static final int $stable = 0;
    public static final RemindersBinderModule INSTANCE = new RemindersBinderModule();

    private RemindersBinderModule() {
    }

    public final ReminderRepository provideReminderRepository() {
        return ReminderModule.INSTANCE.getReminderRepository();
    }
}
