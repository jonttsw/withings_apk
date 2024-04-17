package com.withings.wiscale2.notification;

import ah.t;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.service.notification.StatusBarNotification;
import androidx.core.app.r;
import androidx.core.app.y;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: LeaderboardNotificationManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/notification/DeleteLeaderboardNotificationReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class DeleteLeaderboardNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ArrayList m11;
        u.j(context, "context");
        u.j(intent, "intent");
        Object systemService = context.getSystemService(RemoteMessageConst.NOTIFICATION);
        u.h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        m11 = t.m(notificationManager);
        if (m11.isEmpty()) {
            notificationManager.cancel(88888);
        } else if (m11.size() == 1) {
            Context applicationContext = context.getApplicationContext();
            u.i(applicationContext, "getApplicationContext(...)");
            Object I = x.I(m11);
            u.i(I, "first(...)");
            StatusBarNotification statusBarNotification = (StatusBarNotification) I;
            vh.h.h().d(new e(applicationContext, statusBarNotification, false)).s(new f(notificationManager, statusBarNotification));
            notificationManager.cancel(88888);
        } else {
            Iterator it = m11.iterator();
            while (it.hasNext()) {
                StatusBarNotification statusBarNotification2 = (StatusBarNotification) it.next();
                Context applicationContext2 = context.getApplicationContext();
                u.i(applicationContext2, "getApplicationContext(...)");
                u.g(statusBarNotification2);
                vh.h.h().d(new e(applicationContext2, statusBarNotification2, true)).s(new f(notificationManager, statusBarNotification2));
            }
            r c11 = i.c(context, "leaderboard_channel");
            c11.e(false);
            c11.r();
            y.c(context).e(null, 88888, c11.c());
        }
    }
}
