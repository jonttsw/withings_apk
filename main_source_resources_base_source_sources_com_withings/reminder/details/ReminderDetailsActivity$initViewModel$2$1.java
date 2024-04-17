package com.withings.reminder.details;

import com.withings.reminder.model.ReminderType;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReminderDetailsActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withings/reminder/model/ReminderType;", "it", "Lnm0/y;", "invoke", "(Lcom/withings/reminder/model/ReminderType;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ReminderDetailsActivity$initViewModel$2$1 extends w implements l<ReminderType, y> {
    final /* synthetic */ ReminderDetailsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderDetailsActivity$initViewModel$2$1(ReminderDetailsActivity reminderDetailsActivity) {
        super(1);
        this.this$0 = reminderDetailsActivity;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(ReminderType reminderType) {
        invoke2(reminderType);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ReminderType it) {
        u.j(it, "it");
        this.this$0.initViews(it);
    }
}
