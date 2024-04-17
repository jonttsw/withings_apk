package com.withings.reminder.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.reminder.di.ReminderModule;
import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderRepository;
import com.withings.reminder.model.ReminderType;
import com.withings.reminder.ringing.ReminderRingingActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.j;
import u70.a;
import vh.h;
/* compiled from: AndroidReminderScheduler.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/withings/reminder/notification/ScheduleReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Lcom/withings/reminder/model/Reminder;", ReminderNotificationBuilder.NOTIFICATION_TAG, "Lnm0/y;", "handleReminder", "(Landroid/content/Context;Lcom/withings/reminder/model/Reminder;)V", "Lcom/withings/reminder/model/ReminderType;", "reminderType", "notifyReminder", "(Landroid/content/Context;Lcom/withings/reminder/model/Reminder;Lcom/withings/reminder/model/ReminderType;)V", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lcom/withings/reminder/model/ReminderRepository;", "reminderRepository", "Lcom/withings/reminder/model/ReminderRepository;", "Lu70/a;", "kotlin.jvm.PlatformType", "backgroundManager", "Lu70/a;", "<init>", "()V", "Companion", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ScheduleReceiver extends BroadcastReceiver {
    public static final String ACTION = "com.withings.reminder.notification.ScheduleReceiver.ACTION";
    private static final String EXTRA_REMINDER_ID = "reminderId";
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final ReminderRepository reminderRepository = ReminderModule.INSTANCE.getReminderRepository();
    private final a backgroundManager = a.b();

    /* compiled from: AndroidReminderScheduler.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/withings/reminder/notification/ScheduleReceiver$Companion;", "", "()V", "ACTION", "", "EXTRA_REMINDER_ID", "createIntent", "Landroid/content/Intent;", ScheduleReceiver.EXTRA_REMINDER_ID, "", "(Ljava/lang/Long;)Landroid/content/Intent;", "reminder_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final Intent createIntent(Long l5) {
            Intent putExtra = new Intent(ScheduleReceiver.ACTION).putExtra(ScheduleReceiver.EXTRA_REMINDER_ID, l5);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleReminder(Context context, Reminder reminder) {
        h.h().d(new ScheduleReceiver$handleReminder$1(this, reminder)).s(new ScheduleReceiver$handleReminder$2(this, context, reminder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyReminder(Context context, Reminder reminder, ReminderType reminderType) {
        if (this.backgroundManager.e()) {
            context.startActivity(ReminderRingingActivity.Companion.createIntent(context, reminder, reminderType));
            return;
        }
        Object systemService = context.getSystemService(RemoteMessageConst.NOTIFICATION);
        u.h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        j<Integer, Notification> build = new ReminderNotificationBuilder(context).build(reminder, reminderType);
        ((NotificationManager) systemService).notify(ReminderNotificationBuilder.NOTIFICATION_TAG, build.c().intValue(), build.d());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        u.j(context, "context");
        u.j(intent, "intent");
        h.h().d(new ScheduleReceiver$onReceive$1(intent, this)).s(new ScheduleReceiver$onReceive$2(this, context));
    }
}
