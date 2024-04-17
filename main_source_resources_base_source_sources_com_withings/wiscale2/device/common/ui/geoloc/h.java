package com.withings.wiscale2.device.common.ui.geoloc;

import androidx.compose.material3.j5;
/* compiled from: WeatherAirQualityActivity.kt */
/* loaded from: classes5.dex */
final class h extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WeatherAirQualityActivity f53870a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(WeatherAirQualityActivity weatherAirQualityActivity) {
        super(4);
        this.f53870a = weatherAirQualityActivity;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        j5.e(num, cVar, "$this$composable", dVar, "it");
        WeatherAirQualityActivity weatherAirQualityActivity = this.f53870a;
        a0 D3 = WeatherAirQualityActivity.D3(weatherAirQualityActivity);
        q.c(new e(weatherAirQualityActivity), D3, new f(weatherAirQualityActivity), new g(weatherAirQualityActivity), aVar, 64);
        return nm0.y.f85009a;
    }
}
