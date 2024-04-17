package com.withings.wiscale2.settings;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class l2 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60180a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(SettingsActivity settingsActivity) {
        super(0);
        this.f60180a = settingsActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        SettingsActivity settingsActivity = this.f60180a;
        String packageName = settingsActivity.getPackageName();
        kotlin.jvm.internal.u.i(packageName, "getPackageName(...)");
        try {
            settingsActivity.startActivity(u70.e.b(packageName, null));
        } catch (ActivityNotFoundException unused) {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("http://play.google.com/store/apps/details?id=".concat(packageName)));
            intent.setFlags(268435456);
            settingsActivity.startActivity(intent);
        }
        return nm0.y.f85009a;
    }
}
