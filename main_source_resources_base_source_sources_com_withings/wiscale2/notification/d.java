package com.withings.wiscale2.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import androidx.core.app.r;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LeaderboardNotificationManager.kt */
/* loaded from: classes5.dex */
public final class d extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NotificationManager f58748a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f58749b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Notification f58750c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f58751d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Context f58752e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(NotificationManager notificationManager, int i11, Notification notification, boolean z5, Context context) {
        super(0);
        this.f58748a = notificationManager;
        this.f58749b = i11;
        this.f58750c = notification;
        this.f58751d = z5;
        this.f58752e = context;
    }

    @Override // ym0.a
    public final y invoke() {
        Context context;
        int i11 = this.f58749b;
        Notification notification = this.f58750c;
        NotificationManager notificationManager = this.f58748a;
        notificationManager.notify(i11, notification);
        if (this.f58751d) {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            u.i(activeNotifications, "getActiveNotifications(...)");
            ArrayList arrayList = new ArrayList();
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                if (statusBarNotification.getNotification().extras.containsKey("leaderboard")) {
                    arrayList.add(statusBarNotification);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                context = this.f58752e;
                if (!hasNext) {
                    break;
                }
                StatusBarNotification statusBarNotification2 = (StatusBarNotification) it.next();
                u.g(statusBarNotification2);
                u.j(context, "context");
                vh.h.h().d(new e(context, statusBarNotification2, true)).s(new f(notificationManager, statusBarNotification2));
            }
            u.j(context, "context");
            r c11 = i.c(context, "leaderboard_channel");
            c11.e(false);
            c11.r();
            androidx.core.app.y.c(context).e(null, 88888, c11.c());
        }
        return y.f85009a;
    }
}
