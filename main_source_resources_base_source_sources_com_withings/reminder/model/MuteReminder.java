package com.withings.reminder.model;

import com.withings.reminder.notification.ReminderNotificationBuilder;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: MuteReminder.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/withings/reminder/model/MuteReminder;", "", "Lcom/withings/reminder/model/Reminder;", ReminderNotificationBuilder.NOTIFICATION_TAG, "Lnm0/y;", "runFor", "(Lcom/withings/reminder/model/Reminder;)V", "runForAll", "()V", "Lcom/withings/reminder/model/ReminderRepository;", "reminderRepository", "Lcom/withings/reminder/model/ReminderRepository;", "getReminderRepository", "()Lcom/withings/reminder/model/ReminderRepository;", "<init>", "(Lcom/withings/reminder/model/ReminderRepository;)V", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MuteReminder {
    public static final int $stable = 8;
    private final ReminderRepository reminderRepository;

    public MuteReminder(ReminderRepository reminderRepository) {
        u.j(reminderRepository, "reminderRepository");
        this.reminderRepository = reminderRepository;
    }

    public final ReminderRepository getReminderRepository() {
        return this.reminderRepository;
    }

    public final void runFor(Reminder reminder) {
        u.j(reminder, "reminder");
        reminder.setMuteDate(DateTime.now());
        this.reminderRepository.updateReminder(reminder);
    }

    public final void runForAll() {
        ArrayList<Reminder> arrayList = new ArrayList();
        for (Object obj : this.reminderRepository.getAllReminders()) {
            if (((Reminder) obj).getDays().contains(Integer.valueOf(DateTime.now().getDayOfWeek()))) {
                arrayList.add(obj);
            }
        }
        for (Reminder reminder : arrayList) {
            runFor(reminder);
        }
    }
}
