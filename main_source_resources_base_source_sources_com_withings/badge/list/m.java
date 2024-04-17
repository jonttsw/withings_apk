package com.withings.badge.list;

import android.content.Context;
/* compiled from: Hilt_BadgesActivity.java */
/* loaded from: classes3.dex */
final class m implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_BadgesActivity f32845a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Hilt_BadgesActivity hilt_BadgesActivity) {
        this.f32845a = hilt_BadgesActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f32845a.inject();
    }
}
