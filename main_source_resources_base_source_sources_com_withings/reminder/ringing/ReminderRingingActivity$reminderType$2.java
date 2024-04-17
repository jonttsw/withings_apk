package com.withings.reminder.ringing;

import android.os.Parcelable;
import com.withings.reminder.model.ReminderType;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.a;
/* compiled from: ReminderRingingActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/withings/reminder/model/ReminderType;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ReminderRingingActivity$reminderType$2 extends w implements a<ReminderType> {
    final /* synthetic */ ReminderRingingActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderRingingActivity$reminderType$2(ReminderRingingActivity reminderRingingActivity) {
        super(0);
        this.this$0 = reminderRingingActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final ReminderType invoke() {
        Parcelable parcelableExtra = this.this$0.getIntent().getParcelableExtra(ReminderRingingActivity.EXTRA_REMINDER_TYPE);
        u.h(parcelableExtra, "null cannot be cast to non-null type com.withings.reminder.model.ReminderType");
        return (ReminderType) parcelableExtra;
    }
}
