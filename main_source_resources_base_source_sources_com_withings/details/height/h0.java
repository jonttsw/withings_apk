package com.withings.details.height;

import android.content.Context;
/* compiled from: Hilt_HeightActivity.java */
/* loaded from: classes3.dex */
final class h0 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_HeightActivity f36609a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(Hilt_HeightActivity hilt_HeightActivity) {
        this.f36609a = hilt_HeightActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f36609a.inject();
    }
}
