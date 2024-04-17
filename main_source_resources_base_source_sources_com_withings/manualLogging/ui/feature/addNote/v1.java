package com.withings.manualLogging.ui.feature.addNote;

import android.content.Context;
/* compiled from: Hilt_AddManualLogActivity.java */
/* loaded from: classes4.dex */
final class v1 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_AddManualLogActivity f41600a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v1(Hilt_AddManualLogActivity hilt_AddManualLogActivity) {
        this.f41600a = hilt_AddManualLogActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f41600a.inject();
    }
}
