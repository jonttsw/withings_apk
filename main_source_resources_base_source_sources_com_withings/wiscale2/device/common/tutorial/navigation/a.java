package com.withings.wiscale2.device.common.tutorial.navigation;

import android.content.Context;
/* compiled from: Hilt_NavigationTutorialActivity.java */
/* loaded from: classes5.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_NavigationTutorialActivity f53645a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_NavigationTutorialActivity hilt_NavigationTutorialActivity) {
        this.f53645a = hilt_NavigationTutorialActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f53645a.inject();
    }
}
