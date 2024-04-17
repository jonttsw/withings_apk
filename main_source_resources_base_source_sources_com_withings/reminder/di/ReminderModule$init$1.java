package com.withings.reminder.di;

import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderScheduler;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: ReminderModule.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/withings/reminder/model/Reminder;", "kotlin.jvm.PlatformType", "it", "Lnm0/y;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class ReminderModule$init$1 extends w implements l<List<? extends Reminder>, y> {
    final /* synthetic */ ReminderScheduler $reminderScheduler;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderModule$init$1(ReminderScheduler reminderScheduler) {
        super(1);
        this.$reminderScheduler = reminderScheduler;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(List<? extends Reminder> list) {
        invoke2((List<Reminder>) list);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<Reminder> list) {
        ReminderScheduler reminderScheduler = this.$reminderScheduler;
        u.g(list);
        reminderScheduler.handleOnRemindersChanged(list);
    }
}
