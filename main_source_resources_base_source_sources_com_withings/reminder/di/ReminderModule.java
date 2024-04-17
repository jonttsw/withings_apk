package com.withings.reminder.di;

import android.content.Context;
import android.content.IntentFilter;
import androidx.core.content.a;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.reminder.model.ReminderRepository;
import com.withings.reminder.model.ReminderScheduler;
import com.withings.reminder.notification.DismissReceiver;
import com.withings.reminder.notification.ScheduleReceiver;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ReminderModule.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/withings/reminder/di/ReminderModule;", "", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Lcom/withings/reminder/model/ReminderRepository;", "reminderRepository", "Lcom/withings/reminder/model/ReminderScheduler;", "reminderScheduler", "Lnm0/y;", "init", "(Landroid/content/Context;Lcom/withings/reminder/model/ReminderRepository;Lcom/withings/reminder/model/ReminderScheduler;)V", "Lcom/withings/reminder/model/ReminderRepository;", "getReminderRepository", "()Lcom/withings/reminder/model/ReminderRepository;", "setReminderRepository", "(Lcom/withings/reminder/model/ReminderRepository;)V", "Lcom/withings/reminder/model/ReminderScheduler;", "getReminderScheduler", "()Lcom/withings/reminder/model/ReminderScheduler;", "setReminderScheduler", "(Lcom/withings/reminder/model/ReminderScheduler;)V", "<init>", "()V", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ReminderModule {
    public static ReminderRepository reminderRepository;
    public static ReminderScheduler reminderScheduler;
    public static final ReminderModule INSTANCE = new ReminderModule();
    public static final int $stable = 8;

    private ReminderModule() {
    }

    public static final void init(Context context, ReminderRepository reminderRepository2, ReminderScheduler reminderScheduler2) {
        u.j(context, "context");
        u.j(reminderRepository2, "reminderRepository");
        u.j(reminderScheduler2, "reminderScheduler");
        ReminderModule reminderModule = INSTANCE;
        reminderModule.setReminderRepository(reminderRepository2);
        reminderModule.setReminderScheduler(reminderScheduler2);
        reminderRepository2.getAllRemindersLiveData().observeForever(new ReminderModule$sam$androidx_lifecycle_Observer$0(new ReminderModule$init$1(reminderScheduler2)));
        a.registerReceiver(context, new DismissReceiver(), new IntentFilter(DismissReceiver.ACTION), 4);
        a.registerReceiver(context, new ScheduleReceiver(), new IntentFilter(ScheduleReceiver.ACTION), 4);
    }

    public final ReminderRepository getReminderRepository() {
        ReminderRepository reminderRepository2 = reminderRepository;
        if (reminderRepository2 != null) {
            return reminderRepository2;
        }
        u.s("reminderRepository");
        throw null;
    }

    public final ReminderScheduler getReminderScheduler() {
        ReminderScheduler reminderScheduler2 = reminderScheduler;
        if (reminderScheduler2 != null) {
            return reminderScheduler2;
        }
        u.s("reminderScheduler");
        throw null;
    }

    public final void setReminderRepository(ReminderRepository reminderRepository2) {
        u.j(reminderRepository2, "<set-?>");
        reminderRepository = reminderRepository2;
    }

    public final void setReminderScheduler(ReminderScheduler reminderScheduler2) {
        u.j(reminderScheduler2, "<set-?>");
        reminderScheduler = reminderScheduler2;
    }
}
