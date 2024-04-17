package com.withings.notifications.ui;

import android.content.Intent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.appnavigation.api.builder.SettingsDestinations;
/* compiled from: NotificationsActivity.kt */
/* loaded from: classes4.dex */
final class v extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NotificationsActivity f43116a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(NotificationsActivity notificationsActivity) {
        super(0);
        this.f43116a = notificationsActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        NotificationsActivity notificationsActivity = this.f43116a;
        ch.d dVar = notificationsActivity.f42842f;
        if (dVar != null) {
            ah.e settings = dVar.getSettings();
            SettingsDestinations settingsDestinations = SettingsDestinations.f31279c;
            settings.getClass();
            Intent putExtra = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(notificationsActivity.getPackageName(), "com.withings.wiscale2.settings.SettingsActivity").putExtra("settingsStart", settingsDestinations);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            notificationsActivity.startActivity(putExtra);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }
}
