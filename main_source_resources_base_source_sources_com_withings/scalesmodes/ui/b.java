package com.withings.scalesmodes.ui;

import android.content.Context;
/* compiled from: Hilt_ScalesModeActivity.java */
/* loaded from: classes4.dex */
final class b implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_ScalesModeActivity f43924a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Hilt_ScalesModeActivity hilt_ScalesModeActivity) {
        this.f43924a = hilt_ScalesModeActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f43924a.inject();
    }
}
