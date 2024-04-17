package com.withings.wiscale2.vascularage;

import android.content.Context;
/* compiled from: Hilt_VascularAgeActivity.java */
/* loaded from: classes5.dex */
final class e implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_VascularAgeActivity f62275a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Hilt_VascularAgeActivity hilt_VascularAgeActivity) {
        this.f62275a = hilt_VascularAgeActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f62275a.inject();
    }
}
