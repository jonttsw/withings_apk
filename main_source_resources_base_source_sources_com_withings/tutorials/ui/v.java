package com.withings.tutorials.ui;

import android.content.Context;
/* compiled from: Hilt_TutorialActivity.java */
/* loaded from: classes4.dex */
final class v implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_TutorialActivity f46315a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(Hilt_TutorialActivity hilt_TutorialActivity) {
        this.f46315a = hilt_TutorialActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f46315a.inject();
    }
}
