package com.withings.reminder.discovery;

import com.withings.reminder.model.ReminderType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: RemindersDiscoveryActivity.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "", "Lcom/withings/reminder/model/ReminderType;", "it", "Lnm0/y;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class RemindersDiscoveryActivity$onCreate$2$1 extends w implements l<Map<String, ? extends List<? extends ReminderType>>, y> {
    final /* synthetic */ RemindersDiscoveryActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemindersDiscoveryActivity$onCreate$2$1(RemindersDiscoveryActivity remindersDiscoveryActivity) {
        super(1);
        this.this$0 = remindersDiscoveryActivity;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(Map<String, ? extends List<? extends ReminderType>> map) {
        invoke2((Map<String, ? extends List<ReminderType>>) map);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, ? extends List<ReminderType>> it) {
        ReminderCategoriesAdapter categoriesAdapter;
        u.j(it, "it");
        categoriesAdapter = this.this$0.getCategoriesAdapter();
        categoriesAdapter.setData(it);
    }
}
