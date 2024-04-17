package com.withings.reminder.discovery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.g1;
import androidx.lifecycle.h;
import com.withings.reminder.model.ReminderRepository;
import com.withings.reminder.model.ReminderType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.Dispatchers;
/* compiled from: RemindersDiscoveryActivity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR/\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/withings/reminder/discovery/RemindersDiscoveryViewModel;", "Landroidx/lifecycle/g1;", "Landroidx/lifecycle/LiveData;", "", "", "", "Lcom/withings/reminder/model/ReminderType;", "remindersByCategory", "Landroidx/lifecycle/LiveData;", "getRemindersByCategory", "()Landroidx/lifecycle/LiveData;", "Lcom/withings/reminder/model/ReminderRepository;", "reminderRepository", "<init>", "(Lcom/withings/reminder/model/ReminderRepository;)V", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RemindersDiscoveryViewModel extends g1 {
    public static final int $stable = 8;
    private final LiveData<Map<String, List<ReminderType>>> remindersByCategory;

    public RemindersDiscoveryViewModel(ReminderRepository reminderRepository) {
        u.j(reminderRepository, "reminderRepository");
        this.remindersByCategory = h.a(Dispatchers.getIO(), new RemindersDiscoveryViewModel$remindersByCategory$1(reminderRepository, null), 2);
    }

    public final LiveData<Map<String, List<ReminderType>>> getRemindersByCategory() {
        return this.remindersByCategory;
    }
}
