package com.withings.reminder.details;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h;
import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderRepository;
import com.withings.reminder.model.ReminderType;
import com.withings.reminder.notification.ReminderNotificationBuilder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: ReminderDetailsActivity.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b3\u00104J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R#\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\u000f8\u0006¢\u0006\f\n\u0004\b,\u0010\u0019\u001a\u0004\b-\u0010\u001bR\u0011\u00100\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00102\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b1\u0010!¨\u00065"}, d2 = {"Lcom/withings/reminder/details/ReminderDetailsViewModel;", "Landroidx/lifecycle/g1;", "Lcom/withings/reminder/model/Reminder;", ReminderNotificationBuilder.NOTIFICATION_TAG, "Lnm0/y;", "saveUpdatedReminder", "(Lcom/withings/reminder/model/Reminder;)V", "Lcom/withings/reminder/model/ReminderType;", "reminderType", "saveNewReminder", "(Lcom/withings/reminder/model/ReminderType;)V", "Lcom/withings/reminder/model/ReminderRepository;", "reminderRepository", "", "reminderTypeWsId", "Landroidx/lifecycle/LiveData;", "createBackgroundReminderTypeLiveData", "(Lcom/withings/reminder/model/ReminderRepository;Ljava/lang/Long;)Landroidx/lifecycle/LiveData;", "deleteReminder", "()V", "saveReminder", "Lcom/withings/reminder/model/ReminderRepository;", "Lcom/withings/reminder/model/Reminder;", "", "shouldShowDelete", "Landroidx/lifecycle/LiveData;", "getShouldShowDelete", "()Landroidx/lifecycle/LiveData;", "getReminderType", "Lorg/joda/time/DateTime;", "modifiedTime", "Lorg/joda/time/DateTime;", "getModifiedTime", "()Lorg/joda/time/DateTime;", "setModifiedTime", "(Lorg/joda/time/DateTime;)V", "", "", "modifiedDays", "Ljava/util/List;", "getModifiedDays", "()Ljava/util/List;", "setModifiedDays", "(Ljava/util/List;)V", "previousDays", "getPreviousDays", "getHasChanged", "()Z", "hasChanged", "getCurrentTime", "currentTime", "<init>", "(Lcom/withings/reminder/model/ReminderRepository;Lcom/withings/reminder/model/Reminder;Lcom/withings/reminder/model/ReminderType;)V", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ReminderDetailsViewModel extends g1 {
    public static final int $stable = 8;
    private List<Integer> modifiedDays;
    private DateTime modifiedTime;
    private final LiveData<List<Integer>> previousDays;
    private final Reminder reminder;
    private final ReminderRepository reminderRepository;
    private final LiveData<ReminderType> reminderType;
    private final LiveData<Boolean> shouldShowDelete;

    public ReminderDetailsViewModel(ReminderRepository reminderRepository, Reminder reminder, ReminderType reminderType) {
        boolean z5;
        Long l5;
        LiveData<ReminderType> createBackgroundReminderTypeLiveData;
        u.j(reminderRepository, "reminderRepository");
        this.reminderRepository = reminderRepository;
        this.reminder = reminder;
        if (reminder != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.shouldShowDelete = xw.d.a(Boolean.valueOf(z5));
        if (reminderType != null) {
            createBackgroundReminderTypeLiveData = xw.d.a(reminderType);
        } else {
            if (reminder != null) {
                l5 = reminder.getTypeWsId();
            } else {
                l5 = null;
            }
            createBackgroundReminderTypeLiveData = createBackgroundReminderTypeLiveData(reminderRepository, l5);
        }
        this.reminderType = createBackgroundReminderTypeLiveData;
        this.previousDays = e1.b(createBackgroundReminderTypeLiveData, new ReminderDetailsViewModel$previousDays$1(this));
    }

    private final LiveData<ReminderType> createBackgroundReminderTypeLiveData(ReminderRepository reminderRepository, Long l5) {
        return h.a(Dispatchers.getIO(), new ReminderDetailsViewModel$createBackgroundReminderTypeLiveData$1(l5, reminderRepository, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveNewReminder(ReminderType reminderType) {
        ReminderRepository reminderRepository = this.reminderRepository;
        Reminder reminder = new Reminder(null, null, null, null, null, null, null, null, false, 511, null);
        reminder.setTypeWsId(reminderType.getReminderTypeId());
        List<Integer> list = this.modifiedDays;
        if (list == null) {
            list = reminderType.getDefaultDays();
        }
        reminder.setDays(list);
        DateTime dateTime = this.modifiedTime;
        if (dateTime == null) {
            dateTime = DateTime.now().withHourOfDay(reminderType.getDefaultTime()).withMinuteOfHour(0);
            u.i(dateTime, "withMinuteOfHour(...)");
        }
        reminder.setTime(dateTime);
        reminder.setEnabled(true);
        reminderRepository.addReminder(reminder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveUpdatedReminder(Reminder reminder) {
        ReminderRepository reminderRepository = this.reminderRepository;
        List<Integer> list = this.modifiedDays;
        if (list != null) {
            reminder.setDays(list);
        }
        DateTime dateTime = this.modifiedTime;
        if (dateTime != null) {
            reminder.setTime(dateTime);
        }
        reminder.setEnabled(true);
        reminder.setMuteDate(null);
        reminderRepository.updateReminder(reminder);
    }

    public final void deleteReminder() {
        int i11 = vh.h.f103738e;
        vh.h.d(new ReminderDetailsViewModel$deleteReminder$1(this)).p(this);
    }

    public final DateTime getCurrentTime() {
        DateTime dateTime;
        DateTime dateTime2;
        DateTime dateTime3 = this.modifiedTime;
        if (dateTime3 == null) {
            Reminder reminder = this.reminder;
            if (reminder != null) {
                dateTime = reminder.getTime();
            } else {
                dateTime = null;
            }
            if (dateTime == null) {
                ReminderType value = this.reminderType.getValue();
                if (value != null) {
                    dateTime2 = DateTime.now().withHourOfDay(value.getDefaultTime()).withMinuteOfHour(0);
                } else {
                    dateTime2 = null;
                }
                if (dateTime2 == null) {
                    DateTime now = DateTime.now();
                    u.i(now, "now(...)");
                    return now;
                }
                return dateTime2;
            }
            return dateTime;
        }
        return dateTime3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (kotlin.jvm.internal.u.e(r0, r3.modifiedDays) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean getHasChanged() {
        /*
            r3 = this;
            java.util.List<java.lang.Integer> r0 = r3.modifiedDays
            r1 = 0
            if (r0 == 0) goto L17
            com.withings.reminder.model.Reminder r0 = r3.reminder
            if (r0 == 0) goto Le
            java.util.List r0 = r0.getDays()
            goto Lf
        Le:
            r0 = r1
        Lf:
            java.util.List<java.lang.Integer> r2 = r3.modifiedDays
            boolean r0 = kotlin.jvm.internal.u.e(r0, r2)
            if (r0 == 0) goto L2b
        L17:
            org.joda.time.DateTime r0 = r3.modifiedTime
            if (r0 == 0) goto L2d
            com.withings.reminder.model.Reminder r0 = r3.reminder
            if (r0 == 0) goto L23
            org.joda.time.DateTime r1 = r0.getTime()
        L23:
            org.joda.time.DateTime r0 = r3.modifiedTime
            boolean r0 = kotlin.jvm.internal.u.e(r1, r0)
            if (r0 != 0) goto L2d
        L2b:
            r0 = 1
            goto L2e
        L2d:
            r0 = 0
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.reminder.details.ReminderDetailsViewModel.getHasChanged():boolean");
    }

    public final List<Integer> getModifiedDays() {
        return this.modifiedDays;
    }

    public final DateTime getModifiedTime() {
        return this.modifiedTime;
    }

    public final LiveData<List<Integer>> getPreviousDays() {
        return this.previousDays;
    }

    public final LiveData<ReminderType> getReminderType() {
        return this.reminderType;
    }

    public final LiveData<Boolean> getShouldShowDelete() {
        return this.shouldShowDelete;
    }

    public final void saveReminder() {
        int i11 = vh.h.f103738e;
        vh.h.d(new ReminderDetailsViewModel$saveReminder$1(this)).p(this);
    }

    public final void setModifiedDays(List<Integer> list) {
        this.modifiedDays = list;
    }

    public final void setModifiedTime(DateTime dateTime) {
        this.modifiedTime = dateTime;
    }
}
