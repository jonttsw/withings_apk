package com.withings.reminder.notification;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderScheduler;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import x70.b;
/* compiled from: AndroidReminderScheduler.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b&\u0010'J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010%¨\u0006("}, d2 = {"Lcom/withings/reminder/notification/AndroidReminderScheduler;", "Lcom/withings/reminder/model/ReminderScheduler;", "Lcom/withings/reminder/model/Reminder;", ReminderNotificationBuilder.NOTIFICATION_TAG, "Lnm0/y;", "onReminderAdded", "(Lcom/withings/reminder/model/Reminder;)V", "onReminderDeleted", "old", "new", "onReminderUpdated", "(Lcom/withings/reminder/model/Reminder;Lcom/withings/reminder/model/Reminder;)V", "scheduleReminder", "", FoodDayFragment.ARG_DAY, "Lorg/joda/time/DateTime;", "getNextReminderDateTimeForDay", "(Lcom/withings/reminder/model/Reminder;I)Lorg/joda/time/DateTime;", "cancelReminder", "date", "setRepeatingAlarm", "(Lcom/withings/reminder/model/Reminder;Lorg/joda/time/DateTime;)V", "Landroid/app/PendingIntent;", "getAlarmIntent", "(Lcom/withings/reminder/model/Reminder;I)Landroid/app/PendingIntent;", "", "reminders", "handleOnRemindersChanged", "(Ljava/util/List;)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/app/AlarmManager;", "alarmManager", "Landroid/app/AlarmManager;", "Ljava/util/List;", "<init>", "(Landroid/content/Context;)V", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AndroidReminderScheduler implements ReminderScheduler {
    public static final int $stable = 8;
    private final AlarmManager alarmManager;
    private final Context context;
    private List<Reminder> reminders;

    public AndroidReminderScheduler(Context context) {
        u.j(context, "context");
        this.context = context;
        Object systemService = context.getSystemService("alarm");
        u.h(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        this.alarmManager = (AlarmManager) systemService;
        this.reminders = i0.f76187a;
    }

    private final void cancelReminder(Reminder reminder) {
        for (Number number : reminder.getDays()) {
            this.alarmManager.cancel(getAlarmIntent(reminder, number.intValue()));
        }
    }

    private final PendingIntent getAlarmIntent(Reminder reminder, int i11) {
        int notificationId;
        Intent createIntent = ScheduleReceiver.Companion.createIntent(reminder.getId());
        notificationId = AndroidReminderSchedulerKt.getNotificationId(reminder, i11);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.context, notificationId, createIntent, 201326592);
        u.i(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    private final DateTime getNextReminderDateTimeForDay(Reminder reminder, int i11) {
        int dayOfWeek = DateTime.now().getDayOfWeek();
        if (i11 > dayOfWeek) {
            DateTime withDayOfWeek = DateTime.now().withTime(reminder.getTime().getHourOfDay(), reminder.getTime().getMinuteOfHour(), 0, 0).withDayOfWeek(i11);
            u.i(withDayOfWeek, "withDayOfWeek(...)");
            return withDayOfWeek;
        } else if (i11 < dayOfWeek) {
            DateTime plusWeeks = DateTime.now().withTime(reminder.getTime().getHourOfDay(), reminder.getTime().getMinuteOfHour(), 0, 0).withDayOfWeek(i11).plusWeeks(1);
            u.i(plusWeeks, "plusWeeks(...)");
            return plusWeeks;
        } else {
            DateTime withTime = DateTime.now().withTime(reminder.getTime().getHourOfDay(), reminder.getTime().getMinuteOfHour(), 0, 0);
            if (withTime.isBeforeNow()) {
                withTime = withTime.plusWeeks(1);
            }
            u.g(withTime);
            return withTime;
        }
    }

    private final void onReminderAdded(Reminder reminder) {
        scheduleReminder(reminder);
    }

    private final void onReminderDeleted(Reminder reminder) {
        cancelReminder(reminder);
    }

    private final void onReminderUpdated(Reminder reminder, Reminder reminder2) {
        cancelReminder(reminder);
        scheduleReminder(reminder2);
    }

    private final void scheduleReminder(Reminder reminder) {
        for (Number number : reminder.getDays()) {
            DateTime nextReminderDateTimeForDay = getNextReminderDateTimeForDay(reminder, number.intValue() + 1);
            b.b(this, "Reminder set for date : " + nextReminderDateTimeForDay, new Object[0]);
            setRepeatingAlarm(reminder, nextReminderDateTimeForDay);
        }
    }

    private final void setRepeatingAlarm(Reminder reminder, DateTime dateTime) {
        boolean canScheduleExactAlarms;
        PendingIntent alarmIntent = getAlarmIntent(reminder, dateTime.getDayOfWeek());
        if (Build.VERSION.SDK_INT >= 31) {
            canScheduleExactAlarms = this.alarmManager.canScheduleExactAlarms();
            if (!canScheduleExactAlarms) {
                this.alarmManager.setAndAllowWhileIdle(0, dateTime.getMillis(), alarmIntent);
                return;
            }
        }
        this.alarmManager.setExactAndAllowWhileIdle(0, dateTime.getMillis(), alarmIntent);
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.withings.reminder.model.ReminderScheduler
    public synchronized void handleOnRemindersChanged(List<Reminder> reminders) {
        Object obj;
        try {
            u.j(reminders, "reminders");
            Iterator<T> it = this.reminders.iterator();
            while (true) {
                Object obj2 = null;
                if (!it.hasNext()) {
                    break;
                }
                Reminder reminder = (Reminder) it.next();
                Iterator<T> it2 = reminders.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (u.e(reminder.getId(), ((Reminder) next).getId())) {
                        obj2 = next;
                        break;
                    }
                }
                Reminder reminder2 = (Reminder) obj2;
                if (reminder2 == null) {
                    onReminderDeleted(reminder);
                } else if (!u.e(reminder2, reminder)) {
                    onReminderUpdated(reminder, reminder2);
                }
            }
            for (Reminder reminder3 : reminders) {
                Iterator<T> it3 = this.reminders.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj = it3.next();
                        if (u.e(reminder3.getId(), ((Reminder) obj).getId())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (((Reminder) obj) == null) {
                    onReminderAdded(reminder3);
                }
            }
            this.reminders = reminders;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
