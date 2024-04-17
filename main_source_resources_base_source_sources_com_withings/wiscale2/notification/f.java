package com.withings.wiscale2.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.service.notification.StatusBarNotification;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: LeaderboardNotificationManager.kt */
/* loaded from: classes5.dex */
final class f extends w implements l<Notification, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NotificationManager f58756a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ StatusBarNotification f58757b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(NotificationManager notificationManager, StatusBarNotification statusBarNotification) {
        super(1);
        this.f58756a = notificationManager;
        this.f58757b = statusBarNotification;
    }

    @Override // ym0.l
    public final y invoke(Notification notification) {
        Notification it = notification;
        u.j(it, "it");
        this.f58756a.notify(this.f58757b.getId(), it);
        return y.f85009a;
    }
}
