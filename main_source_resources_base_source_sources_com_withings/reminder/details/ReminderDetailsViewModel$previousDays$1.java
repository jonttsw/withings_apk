package com.withings.reminder.details;

import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReminderDetailsActivity.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/withings/reminder/model/ReminderType;", "it", "", "", "invoke", "(Lcom/withings/reminder/model/ReminderType;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ReminderDetailsViewModel$previousDays$1 extends w implements l<ReminderType, List<Integer>> {
    final /* synthetic */ ReminderDetailsViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderDetailsViewModel$previousDays$1(ReminderDetailsViewModel reminderDetailsViewModel) {
        super(1);
        this.this$0 = reminderDetailsViewModel;
    }

    @Override // ym0.l
    public final List<Integer> invoke(ReminderType it) {
        Reminder reminder;
        List<Integer> days;
        u.j(it, "it");
        reminder = this.this$0.reminder;
        return (reminder == null || (days = reminder.getDays()) == null) ? it.getDefaultDays() : x.S0(days);
    }
}
