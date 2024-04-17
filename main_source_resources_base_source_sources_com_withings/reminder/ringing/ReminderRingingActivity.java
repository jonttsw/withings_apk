package com.withings.reminder.ringing;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderType;
import com.withings.reminder.notification.ReminderNotificationBuilder;
import e.k;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import s1.a;
/* compiled from: ReminderRingingActivity.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/withings/reminder/ringing/ReminderRingingActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lnm0/y;", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/withings/reminder/model/Reminder;", "reminder$delegate", "Lnm0/g;", "getReminder", "()Lcom/withings/reminder/model/Reminder;", ReminderNotificationBuilder.NOTIFICATION_TAG, "Lcom/withings/reminder/model/ReminderType;", "reminderType$delegate", "getReminderType", "()Lcom/withings/reminder/model/ReminderType;", "reminderType", "<init>", "()V", "Companion", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ReminderRingingActivity extends Hilt_ReminderRingingActivity {
    public static final String EXTRA_REMINDER = "extra_reminder";
    public static final String EXTRA_REMINDER_TYPE = "extra_reminder_type";
    private final g reminder$delegate = h.b(new ReminderRingingActivity$reminder$2(this));
    private final g reminderType$delegate = h.b(new ReminderRingingActivity$reminderType$2(this));
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ReminderRingingActivity.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/withings/reminder/ringing/ReminderRingingActivity$Companion;", "", "()V", "EXTRA_REMINDER", "", "EXTRA_REMINDER_TYPE", "createIntent", "Landroid/content/Intent;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", ReminderNotificationBuilder.NOTIFICATION_TAG, "Lcom/withings/reminder/model/Reminder;", "reminderType", "Lcom/withings/reminder/model/ReminderType;", "reminder_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final Intent createIntent(Context context, Reminder reminder, ReminderType reminderType) {
            u.j(context, "context");
            u.j(reminder, "reminder");
            u.j(reminderType, "reminderType");
            Intent intent = new Intent(context, ReminderRingingActivity.class);
            intent.putExtra(ReminderRingingActivity.EXTRA_REMINDER, reminder);
            intent.putExtra(ReminderRingingActivity.EXTRA_REMINDER_TYPE, reminderType);
            intent.addFlags(268435456);
            return intent;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Reminder getReminder() {
        return (Reminder) this.reminder$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReminderType getReminderType() {
        return (ReminderType) this.reminderType$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.withings.reminder.ringing.Hilt_ReminderRingingActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k.a(this, new a(true, 492196268, new ReminderRingingActivity$onCreate$1(this)));
    }
}
