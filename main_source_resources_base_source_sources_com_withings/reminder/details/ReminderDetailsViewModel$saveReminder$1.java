package com.withings.reminder.details;

import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderType;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReminderDetailsActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ReminderDetailsViewModel$saveReminder$1 extends w implements ym0.a<y> {
    final /* synthetic */ ReminderDetailsViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderDetailsViewModel$saveReminder$1(ReminderDetailsViewModel reminderDetailsViewModel) {
        super(0);
        this.this$0 = reminderDetailsViewModel;
    }

    @Override // ym0.a
    public /* bridge */ /* synthetic */ y invoke() {
        invoke2();
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Reminder reminder;
        reminder = this.this$0.reminder;
        if (reminder != null) {
            this.this$0.saveUpdatedReminder(reminder);
            return;
        }
        ReminderType value = this.this$0.getReminderType().getValue();
        if (value != null) {
            this.this$0.saveNewReminder(value);
        }
    }
}
