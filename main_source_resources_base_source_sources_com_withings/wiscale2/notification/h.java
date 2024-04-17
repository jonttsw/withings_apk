package com.withings.wiscale2.notification;

import android.app.Notification;
import android.app.NotificationManager;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: NotificationAggregator.kt */
/* loaded from: classes5.dex */
final class h extends w implements p<Integer, Notification, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NotificationManager f58762a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(NotificationManager notificationManager) {
        super(2);
        this.f58762a = notificationManager;
    }

    @Override // ym0.p
    public final y invoke(Integer num, Notification notification) {
        int intValue = num.intValue();
        Notification notification2 = notification;
        u.j(notification2, "notification");
        this.f58762a.notify(intValue, notification2);
        return y.f85009a;
    }
}
