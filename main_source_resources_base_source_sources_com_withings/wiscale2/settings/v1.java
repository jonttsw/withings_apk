package com.withings.wiscale2.settings;

import com.withings.wiscale2.C1987R;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class v1 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60349a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(SettingsActivity settingsActivity) {
        super(0);
        this.f60349a = settingsActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        SettingsActivity settingsActivity = this.f60349a;
        String string = settingsActivity.getString(C1987R.string._URL_HELP_CENTER_);
        kotlin.jvm.internal.u.g(string);
        SettingsActivity.J3(settingsActivity, string);
        return nm0.y.f85009a;
    }
}
