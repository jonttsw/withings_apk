package com.withings.reminder.details;

import android.widget.TextView;
import com.withings.reminder.R;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
/* compiled from: ReminderDetailsActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ReminderDetailsActivity$whenTextView$2 extends w implements ym0.a<TextView> {
    final /* synthetic */ ReminderDetailsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderDetailsActivity$whenTextView$2(ReminderDetailsActivity reminderDetailsActivity) {
        super(0);
        this.this$0 = reminderDetailsActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final TextView invoke() {
        return (TextView) this.this$0.findViewById(R.id.reminder_when_text);
    }
}
