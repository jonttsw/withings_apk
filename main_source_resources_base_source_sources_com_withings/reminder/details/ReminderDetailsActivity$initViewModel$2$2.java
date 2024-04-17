package com.withings.reminder.details;

import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReminderDetailsActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lnm0/y;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ReminderDetailsActivity$initViewModel$2$2 extends w implements l<Boolean, y> {
    final /* synthetic */ ReminderDetailsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderDetailsActivity$initViewModel$2$2(ReminderDetailsActivity reminderDetailsActivity) {
        super(1);
        this.this$0 = reminderDetailsActivity;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return y.f85009a;
    }

    public final void invoke(boolean z5) {
        if (z5) {
            this.this$0.showDelete();
        }
    }
}
