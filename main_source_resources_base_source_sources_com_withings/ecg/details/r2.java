package com.withings.ecg.details;

import android.content.Context;
/* compiled from: Hilt_EcgListActivity.java */
/* loaded from: classes3.dex */
final class r2 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_EcgListActivity f38304a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r2(Hilt_EcgListActivity hilt_EcgListActivity) {
        this.f38304a = hilt_EcgListActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f38304a.inject();
    }
}
