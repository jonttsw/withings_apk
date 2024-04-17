package com.withings.wiscale2.settings;

import android.content.Context;
/* compiled from: Hilt_SettingsActivity.java */
/* loaded from: classes5.dex */
final class g0 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_SettingsActivity f60009a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(Hilt_SettingsActivity hilt_SettingsActivity) {
        this.f60009a = hilt_SettingsActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f60009a.inject();
    }
}
