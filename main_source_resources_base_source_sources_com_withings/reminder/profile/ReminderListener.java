package com.withings.reminder.profile;

import com.withings.reminder.model.Reminder;
import com.withings.reminder.notification.ReminderNotificationBuilder;
import kotlin.Metadata;
import org.jivesoftware.smack.sm.packet.StreamManagement;
/* compiled from: RemindersSectionView.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u0006¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/withings/reminder/profile/ReminderListener;", "", "Lcom/withings/reminder/model/Reminder;", ReminderNotificationBuilder.NOTIFICATION_TAG, "Lnm0/y;", "onReminderClicked", "(Lcom/withings/reminder/model/Reminder;)V", "", StreamManagement.Enabled.ELEMENT, "onReminderSwitched", "(Lcom/withings/reminder/model/Reminder;Z)V", "onDiscoveryClick", "()V", "onReminderDelete", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface ReminderListener {
    void onDiscoveryClick();

    void onReminderClicked(Reminder reminder);

    void onReminderDelete(Reminder reminder);

    void onReminderSwitched(Reminder reminder, boolean z5);
}
