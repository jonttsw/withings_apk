package com.withings.wiscale2.user.ui.profile;

import android.content.Context;
/* compiled from: Hilt_EditProfileActivity.java */
/* loaded from: classes5.dex */
final class z0 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_EditProfileActivity f62128a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z0(Hilt_EditProfileActivity hilt_EditProfileActivity) {
        this.f62128a = hilt_EditProfileActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f62128a.inject();
    }
}
