package com.withings.nutrisync.ui;

import android.content.Context;
/* compiled from: Hilt_VitaminCDatavizActivity.java */
/* loaded from: classes4.dex */
final class b implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_VitaminCDatavizActivity f43216a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Hilt_VitaminCDatavizActivity hilt_VitaminCDatavizActivity) {
        this.f43216a = hilt_VitaminCDatavizActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f43216a.inject();
    }
}
