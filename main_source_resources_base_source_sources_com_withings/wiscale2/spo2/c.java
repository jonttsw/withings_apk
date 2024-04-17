package com.withings.wiscale2.spo2;

import android.content.Context;
/* compiled from: Hilt_SpO2MeasuresListActivity.java */
/* loaded from: classes5.dex */
final class c implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_SpO2MeasuresListActivity f61652a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Hilt_SpO2MeasuresListActivity hilt_SpO2MeasuresListActivity) {
        this.f61652a = hilt_SpO2MeasuresListActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f61652a.inject();
    }
}
