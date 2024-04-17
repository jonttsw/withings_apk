package com.withings.wiscale2.notification;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.service.notification.StatusBarNotification;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: NotificationAggregator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/notification/DeletePlatformNotificationReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class DeletePlatformNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        u.j(context, "context");
        u.j(intent, "intent");
        Object systemService = context.getSystemService(RemoteMessageConst.NOTIFICATION);
        u.h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        String stringExtra = intent.getStringExtra("channel");
        int intExtra = intent.getIntExtra(ConstantsWs.JSON_ACCOUNT_KEY_CREATED, -1);
        if (stringExtra != null && stringExtra.length() != 0 && intExtra != -1) {
            ArrayList e11 = g.e(notificationManager, stringExtra);
            if (e11.isEmpty()) {
                notificationManager.cancel(4325);
            } else if (e11.size() == 1) {
                Context applicationContext = context.getApplicationContext();
                u.i(applicationContext, "getApplicationContext(...)");
                g.a(applicationContext, (StatusBarNotification) x.I(e11), false);
                notificationManager.cancel(4325);
            } else {
                Iterator it = e11.iterator();
                while (it.hasNext()) {
                    Context applicationContext2 = context.getApplicationContext();
                    u.i(applicationContext2, "getApplicationContext(...)");
                    g.a(applicationContext2, (StatusBarNotification) it.next(), true);
                }
                g.c(context, stringExtra);
            }
        }
    }
}
