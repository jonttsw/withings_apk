package com.withings.wiscale2.device.common.ui.geoloc;

import android.content.Context;
/* compiled from: Hilt_WeatherAirQualityActivity.java */
/* loaded from: classes5.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_WeatherAirQualityActivity f53829a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_WeatherAirQualityActivity hilt_WeatherAirQualityActivity) {
        this.f53829a = hilt_WeatherAirQualityActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f53829a.inject();
    }
}
