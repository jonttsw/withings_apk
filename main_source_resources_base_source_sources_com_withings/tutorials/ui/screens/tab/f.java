package com.withings.tutorials.ui.screens.tab;

import android.content.Context;
/* compiled from: Hilt_TabPresentationActivity.java */
/* loaded from: classes4.dex */
final class f implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_TabPresentationActivity f46277a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Hilt_TabPresentationActivity hilt_TabPresentationActivity) {
        this.f46277a = hilt_TabPresentationActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f46277a.inject();
    }
}
