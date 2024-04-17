package com.withings.programs.ui.activity;

import android.content.Context;
/* compiled from: Hilt_TutorialProxyActivity.java */
/* loaded from: classes4.dex */
final class b implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_TutorialProxyActivity f43761a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Hilt_TutorialProxyActivity hilt_TutorialProxyActivity) {
        this.f43761a = hilt_TutorialProxyActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f43761a.inject();
    }
}
