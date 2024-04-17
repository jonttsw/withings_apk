package com.withings.wiscale2.user.ui;

import android.content.Context;
/* compiled from: Hilt_EditUserEmailActivity.java */
/* loaded from: classes5.dex */
final class z implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_EditUserEmailActivity f62159a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(Hilt_EditUserEmailActivity hilt_EditUserEmailActivity) {
        this.f62159a = hilt_EditUserEmailActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f62159a.inject();
    }
}
