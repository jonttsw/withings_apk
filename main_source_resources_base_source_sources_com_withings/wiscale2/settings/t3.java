package com.withings.wiscale2.settings;

import com.withings.appnavigation.api.builder.SettingsDestinations;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class t3 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60312a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f60313b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(r8.n nVar, SettingsActivity settingsActivity) {
        super(0);
        this.f60312a = settingsActivity;
        this.f60313b = nVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        SettingsActivity settingsActivity = this.f60312a;
        if (SettingsActivity.I3(settingsActivity) == SettingsDestinations.f31279c) {
            settingsActivity.finish();
        } else {
            this.f60313b.N();
        }
        return nm0.y.f85009a;
    }
}
