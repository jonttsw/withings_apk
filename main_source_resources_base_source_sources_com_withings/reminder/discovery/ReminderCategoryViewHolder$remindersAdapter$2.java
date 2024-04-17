package com.withings.reminder.discovery;

import com.withings.reminder.discovery.views.ReminderTypeAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import ym0.a;
/* compiled from: RemindersDiscoveryActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/withings/reminder/discovery/views/ReminderTypeAdapter;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ReminderCategoryViewHolder$remindersAdapter$2 extends w implements a<ReminderTypeAdapter> {
    final /* synthetic */ ReminderCategoryViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderCategoryViewHolder$remindersAdapter$2(ReminderCategoryViewHolder reminderCategoryViewHolder) {
        super(0);
        this.this$0 = reminderCategoryViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final ReminderTypeAdapter invoke() {
        return new ReminderTypeAdapter(this.this$0);
    }
}
