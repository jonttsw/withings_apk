package com.withings.wiscale2.device.common.feature.afib;

import android.content.Context;
/* compiled from: Hilt_AfibSettingsActivity.java */
/* loaded from: classes5.dex */
final class v implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_AfibSettingsActivity f51047a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(Hilt_AfibSettingsActivity hilt_AfibSettingsActivity) {
        this.f51047a = hilt_AfibSettingsActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f51047a.inject();
    }
}
