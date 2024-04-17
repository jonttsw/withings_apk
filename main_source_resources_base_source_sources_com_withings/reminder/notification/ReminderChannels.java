package com.withings.reminder.notification;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ReminderChannels.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/withings/reminder/notification/ReminderChannels;", "", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Lnm0/y;", "createChannel", "(Landroid/content/Context;)V", "", "REMINDERS_GROUP", "Ljava/lang/String;", "REMINDERS_CHANNEL", "<init>", "()V", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ReminderChannels {
    public static final int $stable = 0;
    public static final ReminderChannels INSTANCE = new ReminderChannels();
    public static final String REMINDERS_CHANNEL = "reminders_channel";
    public static final String REMINDERS_GROUP = "reminders_group";

    private ReminderChannels() {
    }

    public final void createChannel(Context context) {
        u.j(context, "context");
        Object systemService = context.getSystemService(RemoteMessageConst.NOTIFICATION);
        u.h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        String string = context.getString(C1987R.string.notificationChannel_groupReminders);
        u.i(string, "getString(...)");
        notificationManager.createNotificationChannelGroup(new NotificationChannelGroup(REMINDERS_GROUP, string));
        NotificationChannel notificationChannel = new NotificationChannel(REMINDERS_CHANNEL, context.getString(C1987R.string.notificationChannel_reminders), 4);
        notificationChannel.setGroup(REMINDERS_GROUP);
        notificationManager.createNotificationChannel(notificationChannel);
    }
}
