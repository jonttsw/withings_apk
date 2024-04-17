package com.withings.fever.ui.temperatureList;

import android.content.Context;
/* compiled from: Hilt_TemperatureListActivity.java */
/* loaded from: classes3.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_TemperatureListActivity f39425a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_TemperatureListActivity hilt_TemperatureListActivity) {
        this.f39425a = hilt_TemperatureListActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f39425a.inject();
    }
}
