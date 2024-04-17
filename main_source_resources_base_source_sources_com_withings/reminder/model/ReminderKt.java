package com.withings.reminder.model;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: Reminder.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isMuted", "", "Lcom/withings/reminder/model/Reminder;", "reminder_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReminderKt {
    public static final boolean isMuted(Reminder reminder) {
        DateTime dateTime;
        u.j(reminder, "<this>");
        DateTime withTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
        DateTime muteDate = reminder.getMuteDate();
        if (muteDate != null) {
            dateTime = muteDate.withTimeAtStartOfDay();
        } else {
            dateTime = null;
        }
        return withTimeAtStartOfDay.isEqual(dateTime);
    }
}
