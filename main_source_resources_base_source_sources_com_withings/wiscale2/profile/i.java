package com.withings.wiscale2.profile;

import android.content.Context;
/* compiled from: Hilt_ProfileActivity.java */
/* loaded from: classes5.dex */
final class i implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_ProfileActivity f59360a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Hilt_ProfileActivity hilt_ProfileActivity) {
        this.f59360a = hilt_ProfileActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f59360a.inject();
    }
}
