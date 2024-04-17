package com.withings.notifications.ui;

import android.content.Context;
/* compiled from: Hilt_NotificationsActivity.java */
/* loaded from: classes4.dex */
final class d implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_NotificationsActivity f42859a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Hilt_NotificationsActivity hilt_NotificationsActivity) {
        this.f42859a = hilt_NotificationsActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f42859a.inject();
    }
}
