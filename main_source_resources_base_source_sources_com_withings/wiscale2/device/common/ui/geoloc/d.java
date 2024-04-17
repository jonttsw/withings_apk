package com.withings.wiscale2.device.common.ui.geoloc;

import androidx.compose.material3.j5;
/* compiled from: WeatherAirQualityActivity.kt */
/* loaded from: classes5.dex */
final class d extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WeatherAirQualityActivity f53860a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(WeatherAirQualityActivity weatherAirQualityActivity) {
        super(4);
        this.f53860a = weatherAirQualityActivity;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        j5.e(num, cVar, "$this$composable", dVar, "it");
        WeatherAirQualityActivity weatherAirQualityActivity = this.f53860a;
        q.e(WeatherAirQualityActivity.D3(weatherAirQualityActivity), new b(weatherAirQualityActivity), new c(weatherAirQualityActivity), aVar, 8);
        return nm0.y.f85009a;
    }
}
