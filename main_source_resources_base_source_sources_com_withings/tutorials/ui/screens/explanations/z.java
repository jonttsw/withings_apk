package com.withings.tutorials.ui.screens.explanations;

import android.content.Context;
/* compiled from: Hilt_ExplanationsActivity.java */
/* loaded from: classes4.dex */
final class z implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_ExplanationsActivity f45297a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(Hilt_ExplanationsActivity hilt_ExplanationsActivity) {
        this.f45297a = hilt_ExplanationsActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f45297a.inject();
    }
}
