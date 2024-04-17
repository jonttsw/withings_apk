package com.withings.wiscale2.ancs.sources;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import th0.b;
/* compiled from: AndroidNotificationListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/ancs/sources/AndroidNotificationListener;", "Landroid/service/notification/NotificationListenerService;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AndroidNotificationListener extends NotificationListenerService {

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayList f50040a = new ArrayList();

    /* compiled from: AndroidNotificationListener.kt */
    /* loaded from: classes4.dex */
    public interface a {
        void b(th0.a aVar);

        void e(th0.a aVar, StatusBarNotification statusBarNotification);
    }

    private final void b(StatusBarNotification statusBarNotification, boolean z5) {
        th0.a a11 = b.a(this, statusBarNotification);
        NotificationListenerService.Ranking ranking = new NotificationListenerService.Ranking();
        getCurrentRanking().getRanking(statusBarNotification.getKey(), ranking);
        if (!ranking.isSuspended()) {
            Iterator it = f50040a.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (z5) {
                    aVar.b(a11);
                } else {
                    aVar.e(a11, statusBarNotification);
                }
            }
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationPosted(StatusBarNotification notification) {
        u.j(notification, "notification");
        super.onNotificationPosted(notification);
        b(notification, false);
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationRemoved(StatusBarNotification notification) {
        u.j(notification, "notification");
        super.onNotificationRemoved(notification);
        b(notification, true);
    }
}
