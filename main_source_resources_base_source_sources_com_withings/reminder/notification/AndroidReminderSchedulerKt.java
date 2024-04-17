package com.withings.reminder.notification;

import com.withings.reminder.model.Reminder;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import kotlin.Metadata;
/* compiled from: AndroidReminderScheduler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0002¨\u0006\u0004"}, d2 = {"getNotificationId", "", "Lcom/withings/reminder/model/Reminder;", FoodDayFragment.ARG_DAY, "reminder_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidReminderSchedulerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int getNotificationId(Reminder reminder, int i11) {
        Long id2 = reminder.getId();
        if (id2 != null) {
            return (((int) id2.longValue()) * 7) + i11;
        }
        return -1;
    }
}
