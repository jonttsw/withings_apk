package com.withings.wiscale2.settings;

import com.withings.wiscale2.settings.SettingsActivity;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class a2 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f59859a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f59860b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(SettingsActivity settingsActivity, k1.r0<String> r0Var) {
        super(1);
        this.f59859a = settingsActivity;
        this.f59860b = r0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String newThemeString = str;
        kotlin.jvm.internal.u.j(newThemeString, "newThemeString");
        this.f59860b.setValue(newThemeString);
        SettingsActivity.b bVar = SettingsActivity.f59742k;
        this.f59859a.setResult(1002);
        return nm0.y.f85009a;
    }
}
