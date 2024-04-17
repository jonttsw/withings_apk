package com.withings.reminder.profile;

import com.withings.reminder.di.ReminderModule;
import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderType;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RemindersSectionView.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/withings/reminder/model/ReminderType;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReminderToggleViewHolder$bindName$1 extends w implements ym0.a<ReminderType> {
    final /* synthetic */ Reminder $reminder;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderToggleViewHolder$bindName$1(Reminder reminder) {
        super(0);
        this.$reminder = reminder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final ReminderType invoke() {
        Long typeWsId = this.$reminder.getTypeWsId();
        if (typeWsId != null) {
            return ReminderModule.INSTANCE.getReminderRepository().getReminderTypeByWsId(typeWsId.longValue());
        }
        return null;
    }
}
