package com.withings.reminder.model;

import java.util.List;
import kotlin.Metadata;
/* compiled from: ReminderScheduler.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/withings/reminder/model/ReminderScheduler;", "", "", "Lcom/withings/reminder/model/Reminder;", "reminders", "Lnm0/y;", "handleOnRemindersChanged", "(Ljava/util/List;)V", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface ReminderScheduler {
    void handleOnRemindersChanged(List<Reminder> list);
}
