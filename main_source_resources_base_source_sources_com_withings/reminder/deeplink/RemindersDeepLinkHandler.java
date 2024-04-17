package com.withings.reminder.deeplink;

import android.content.Context;
import android.content.Intent;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.reminder.details.ReminderDetailsActivity;
import com.withings.reminder.discovery.RemindersDiscoveryActivity;
import com.withings.reminder.model.ReminderRepository;
import com.withings.reminder.model.ReminderType;
import hm.a;
import hm.d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: RemindersDeepLinkHandler.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/withings/reminder/deeplink/RemindersDeepLinkHandler;", "Lhm/a;", "Lhm/d;", "deeplink", "Landroid/content/Intent;", "getIntent", "(Lhm/d;)Landroid/content/Intent;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/withings/reminder/model/ReminderRepository;", "reminderRepository", "Lcom/withings/reminder/model/ReminderRepository;", "getReminderRepository", "()Lcom/withings/reminder/model/ReminderRepository;", "", "", "getCommands", "()Ljava/util/List;", "commands", "<init>", "(Landroid/content/Context;Lcom/withings/reminder/model/ReminderRepository;)V", "Companion", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RemindersDeepLinkHandler implements a {
    public static final String DEEP_LINK_COMMAND = "timeline/reminders";
    private static final String KEY_ACTION = "action";
    private static final String KEY_ID = "id";
    private final Context context;
    private final ReminderRepository reminderRepository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RemindersDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/withings/reminder/deeplink/RemindersDeepLinkHandler$Companion;", "", "()V", "DEEP_LINK_COMMAND", "", "KEY_ACTION", "KEY_ID", "reminder_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public RemindersDeepLinkHandler(Context context, ReminderRepository reminderRepository) {
        u.j(context, "context");
        u.j(reminderRepository, "reminderRepository");
        this.context = context;
        this.reminderRepository = reminderRepository;
    }

    @Override // hm.a
    public /* bridge */ /* synthetic */ String defaultNavigation(d dVar) {
        super.defaultNavigation(dVar);
        return null;
    }

    @Override // hm.a
    public List<String> getCommands() {
        return x.V(DEEP_LINK_COMMAND);
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // hm.a
    public Intent getIntent(d deeplink) {
        String str;
        String str2;
        Intent createIntent;
        u.j(deeplink, "deeplink");
        Map<String, String> d11 = deeplink.d();
        Object obj = null;
        if (d11 != null) {
            str = d11.get("action");
        } else {
            str = null;
        }
        Map<String, String> d12 = deeplink.d();
        if (d12 != null) {
            str2 = d12.get("id");
        } else {
            str2 = null;
        }
        if (str2 != null && str2.length() > 0 && u.e(str, "create")) {
            Iterator<T> it = this.reminderRepository.getAllReminderTypes().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Long reminderTypeId = ((ReminderType) next).getReminderTypeId();
                long parseLong = Long.parseLong(str2);
                if (reminderTypeId != null && reminderTypeId.longValue() == parseLong) {
                    obj = next;
                    break;
                }
            }
            ReminderType reminderType = (ReminderType) obj;
            if (reminderType == null || (createIntent = ReminderDetailsActivity.Companion.createIntent(this.context, reminderType)) == null) {
                return RemindersDiscoveryActivity.Companion.createIntent(this.context);
            }
            return createIntent;
        }
        return RemindersDiscoveryActivity.Companion.createIntent(this.context);
    }

    public final ReminderRepository getReminderRepository() {
        return this.reminderRepository;
    }

    @Override // hm.a
    public /* bridge */ /* synthetic */ void run(d dVar) {
        super.run(dVar);
    }
}
