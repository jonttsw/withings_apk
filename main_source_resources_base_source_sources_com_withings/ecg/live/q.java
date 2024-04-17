package com.withings.ecg.live;

import android.content.Context;
/* compiled from: Hilt_LiveEcgActivity.java */
/* loaded from: classes3.dex */
final class q implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_LiveEcgActivity f38704a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Hilt_LiveEcgActivity hilt_LiveEcgActivity) {
        this.f38704a = hilt_LiveEcgActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f38704a.inject();
    }
}
