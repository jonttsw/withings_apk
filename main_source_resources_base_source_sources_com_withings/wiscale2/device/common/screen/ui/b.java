package com.withings.wiscale2.device.common.screen.ui;

import android.content.Context;
/* compiled from: Hilt_ScreenSelectionActivity.java */
/* loaded from: classes5.dex */
final class b implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_ScreenSelectionActivity f53266a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Hilt_ScreenSelectionActivity hilt_ScreenSelectionActivity) {
        this.f53266a = hilt_ScreenSelectionActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f53266a.inject();
    }
}
