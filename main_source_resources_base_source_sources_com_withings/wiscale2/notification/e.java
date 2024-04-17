package com.withings.wiscale2.notification;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: LeaderboardNotificationManager.kt */
/* loaded from: classes5.dex */
final class e extends w implements ym0.a<Notification> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f58753a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ StatusBarNotification f58754b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f58755c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, StatusBarNotification statusBarNotification, boolean z5) {
        super(0);
        this.f58753a = context;
        this.f58754b = statusBarNotification;
        this.f58755c = z5;
    }

    @Override // ym0.a
    public final Notification invoke() {
        Notification c11;
        StatusBarNotification statusBarNotification = this.f58754b;
        Bundle extras = statusBarNotification.getNotification().extras;
        u.i(extras, "extras");
        c11 = c.c(this.f58753a, bj0.d.q(extras), statusBarNotification.getId(), this.f58755c);
        return c11;
    }
}
