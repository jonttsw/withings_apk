package com.withings.wiscale2.settings;

import android.content.Intent;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class z1 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60404a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(SettingsActivity settingsActivity) {
        super(0);
        this.f60404a = settingsActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
        SettingsActivity settingsActivity = this.f60404a;
        Intent putExtra = intent.putExtra("android.provider.extra.APP_PACKAGE", settingsActivity.getPackageName()).putExtra("android.provider.extra.CHANNEL_ID", "devices_channel_communication");
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        settingsActivity.startActivity(putExtra);
        return nm0.y.f85009a;
    }
}
