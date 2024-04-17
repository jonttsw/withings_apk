package com.withings.reminder.model;

import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.lifecycle.LiveData;
import com.withings.reminder.notification.ReminderNotificationBuilder;
import java.util.List;
import kotlin.Metadata;
import org.jivesoftware.smack.sm.packet.StreamManagement;
/* compiled from: ReminderRepository.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\u0016\u0010\u0010J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H&¢\u0006\u0004\b\u001b\u0010\tJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0018H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH&¢\u0006\u0004\b\u001f\u0010 ¨\u0006!À\u0006\u0003"}, d2 = {"Lcom/withings/reminder/model/ReminderRepository;", "", "", "id", "Lcom/withings/reminder/model/Reminder;", "getReminderById", "(J)Lcom/withings/reminder/model/Reminder;", "", "getAllReminders", "()Ljava/util/List;", "Landroidx/lifecycle/LiveData;", "getAllRemindersLiveData", "()Landroidx/lifecycle/LiveData;", ReminderNotificationBuilder.NOTIFICATION_TAG, "Lnm0/y;", "addReminder", "(Lcom/withings/reminder/model/Reminder;)V", "updateReminder", "", StreamManagement.Enable.ELEMENT, "setReminderEnabled", "(Lcom/withings/reminder/model/Reminder;Z)V", "deleteReminder", "reminderWsId", "Lcom/withings/reminder/model/ReminderType;", "getReminderTypeByWsId", "(J)Lcom/withings/reminder/model/ReminderType;", "getAllReminderTypes", "reminderType", "addReminderType", "(Lcom/withings/reminder/model/ReminderType;)V", CervicalMucusRecord.Appearance.CLEAR, "()V", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface ReminderRepository {
    void addReminder(Reminder reminder);

    void addReminderType(ReminderType reminderType);

    void clear();

    void deleteReminder(Reminder reminder);

    List<ReminderType> getAllReminderTypes();

    List<Reminder> getAllReminders();

    LiveData<List<Reminder>> getAllRemindersLiveData();

    Reminder getReminderById(long j5);

    ReminderType getReminderTypeByWsId(long j5);

    void setReminderEnabled(Reminder reminder, boolean z5);

    void updateReminder(Reminder reminder);
}
