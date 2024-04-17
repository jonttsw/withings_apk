package com.withings.reminder.notification;

import android.content.Intent;
import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import ym0.a;
/* compiled from: AndroidReminderScheduler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/withings/reminder/model/Reminder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ScheduleReceiver$onReceive$1 extends w implements a<Reminder> {
    final /* synthetic */ Intent $intent;
    final /* synthetic */ ScheduleReceiver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduleReceiver$onReceive$1(Intent intent, ScheduleReceiver scheduleReceiver) {
        super(0);
        this.$intent = intent;
        this.this$0 = scheduleReceiver;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final Reminder invoke() {
        ReminderRepository reminderRepository;
        long longExtra = this.$intent.getLongExtra("reminderId", -1L);
        reminderRepository = this.this$0.reminderRepository;
        return reminderRepository.getReminderById(longExtra);
    }
}
