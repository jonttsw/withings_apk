package com.withings.reminder.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.Spanned;
import androidx.core.app.h0;
import androidx.core.app.r;
import androidx.core.text.b;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.reminder.R;
import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderType;
import com.withings.reminder.ringing.ReminderRingingActivity;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.j;
import org.joda.time.DateTime;
import wq.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidReminderScheduler.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/withings/reminder/notification/ReminderNotificationBuilder;", "", "Lcom/withings/reminder/model/Reminder;", ReminderNotificationBuilder.NOTIFICATION_TAG, "Lcom/withings/reminder/model/ReminderType;", "reminderType", "Landroid/app/PendingIntent;", "getContentIntent", "(Lcom/withings/reminder/model/Reminder;Lcom/withings/reminder/model/ReminderType;)Landroid/app/PendingIntent;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "", "notificationId", "getDoneReminderIntent", "(Landroid/content/Context;I)Landroid/app/PendingIntent;", "Lnm0/j;", "Landroid/app/Notification;", "build", "(Lcom/withings/reminder/model/Reminder;Lcom/withings/reminder/model/ReminderType;)Lnm0/j;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "Companion", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ReminderNotificationBuilder {
    public static final Companion Companion = new Companion(null);
    public static final String NOTIFICATION_TAG = "reminder";
    private final Context context;

    /* compiled from: AndroidReminderScheduler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/reminder/notification/ReminderNotificationBuilder$Companion;", "", "()V", "NOTIFICATION_TAG", "", "reminder_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public ReminderNotificationBuilder(Context context) {
        u.j(context, "context");
        this.context = context;
    }

    private final PendingIntent getContentIntent(Reminder reminder, ReminderType reminderType) {
        Intent addFlags = ReminderRingingActivity.Companion.createIntent(this.context, reminder, reminderType).addFlags(268435456);
        u.i(addFlags, "addFlags(...)");
        h0 m11 = h0.m(this.context);
        m11.g(addFlags);
        PendingIntent p11 = m11.p(0, 201326592);
        u.g(p11);
        return p11;
    }

    private final PendingIntent getDoneReminderIntent(Context context, int i11) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i11, DismissReceiver.Companion.createIntent(i11), 67108864);
        u.i(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.core.app.u, androidx.core.app.q] */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.core.app.u, androidx.core.app.q] */
    public final j<Integer, Notification> build(Reminder reminder, ReminderType reminderType) {
        int notificationId;
        u.j(reminder, "reminder");
        u.j(reminderType, "reminderType");
        notificationId = AndroidReminderSchedulerKt.getNotificationId(reminder, DateTime.now().getDayOfWeek() - 1);
        Spanned b10 = b.b(a.i(this.context, reminderType.getTimelineName()));
        r rVar = new r(this.context, ReminderChannels.REMINDERS_CHANNEL);
        rVar.B(R.drawable.ic_status_icon_reminders);
        rVar.l(b10);
        rVar.m(this.context.getString(C1987R.string._REMINDER_));
        ?? uVar = new androidx.core.app.u();
        uVar.f(b10);
        rVar.D(uVar);
        rVar.e(true);
        rVar.k(getContentIntent(reminder, reminderType));
        rVar.n(-1);
        rVar.a(C1987R.drawable.ic_check_cshaded4_24dp, this.context.getString(C1987R.string._RMNDR_DONE_), getDoneReminderIntent(this.context, notificationId));
        Integer valueOf = Integer.valueOf(notificationId);
        ?? uVar2 = new androidx.core.app.u();
        uVar2.e(rVar);
        uVar2.f(b10);
        Notification c11 = uVar2.c();
        u.g(c11);
        return new j<>(valueOf, c11);
    }

    public final Context getContext() {
        return this.context;
    }
}
