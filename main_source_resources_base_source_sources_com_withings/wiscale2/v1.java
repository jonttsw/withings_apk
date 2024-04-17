package com.withings.wiscale2;

import android.content.Context;
/* compiled from: Hilt_MainActivity.java */
/* loaded from: classes4.dex */
final class v1 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_MainActivity f62177a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v1(Hilt_MainActivity hilt_MainActivity) {
        this.f62177a = hilt_MainActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f62177a.inject();
    }
}
