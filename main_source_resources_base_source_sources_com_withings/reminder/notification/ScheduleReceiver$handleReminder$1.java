package com.withings.reminder.notification;

import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderRepository;
import com.withings.reminder.model.ReminderType;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import ym0.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidReminderScheduler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/withings/reminder/model/ReminderType;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScheduleReceiver$handleReminder$1 extends w implements a<ReminderType> {
    final /* synthetic */ Reminder $reminder;
    final /* synthetic */ ScheduleReceiver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduleReceiver$handleReminder$1(ScheduleReceiver scheduleReceiver, Reminder reminder) {
        super(0);
        this.this$0 = scheduleReceiver;
        this.$reminder = reminder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final ReminderType invoke() {
        ReminderRepository reminderRepository;
        reminderRepository = this.this$0.reminderRepository;
        Long typeWsId = this.$reminder.getTypeWsId();
        return reminderRepository.getReminderTypeByWsId(typeWsId != null ? typeWsId.longValue() : -1L);
    }
}
