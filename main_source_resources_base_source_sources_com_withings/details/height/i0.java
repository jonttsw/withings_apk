package com.withings.details.height;

import android.content.Context;
/* compiled from: Hilt_HeightListActivity.java */
/* loaded from: classes3.dex */
final class i0 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_HeightListActivity f36613a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(Hilt_HeightListActivity hilt_HeightListActivity) {
        this.f36613a = hilt_HeightListActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f36613a.inject();
    }
}
