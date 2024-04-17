package com.withings.wiscale2.device.common.notifications.ui;

import android.content.Context;
/* compiled from: Hilt_DeviceNotificationSettingsActivity.java */
/* loaded from: classes5.dex */
final class i1 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_DeviceNotificationSettingsActivity f52921a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i1(Hilt_DeviceNotificationSettingsActivity hilt_DeviceNotificationSettingsActivity) {
        this.f52921a = hilt_DeviceNotificationSettingsActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f52921a.inject();
    }
}
