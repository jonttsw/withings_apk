package com.withings.badge.detail;

import android.content.Context;
/* compiled from: Hilt_BadgeDetailActivity.java */
/* loaded from: classes3.dex */
final class o implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_BadgeDetailActivity f32792a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(Hilt_BadgeDetailActivity hilt_BadgeDetailActivity) {
        this.f32792a = hilt_BadgeDetailActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f32792a.inject();
    }
}
