package com.withings.wiscale2.user.ui;

import android.content.Context;
/* compiled from: Hilt_EditUserMeasureActivity.java */
/* loaded from: classes5.dex */
final class a0 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_EditUserMeasureActivity f61821a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(Hilt_EditUserMeasureActivity hilt_EditUserMeasureActivity) {
        this.f61821a = hilt_EditUserMeasureActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f61821a.inject();
    }
}
