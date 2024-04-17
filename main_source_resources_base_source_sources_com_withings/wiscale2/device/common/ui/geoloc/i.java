package com.withings.wiscale2.device.common.ui.geoloc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WeatherAirQualityActivity.kt */
/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WeatherAirQualityActivity f53871a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(WeatherAirQualityActivity weatherAirQualityActivity) {
        super(1);
        this.f53871a = weatherAirQualityActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        r8.m NavHost = mVar;
        kotlin.jvm.internal.u.j(NavHost, "$this$NavHost");
        WeatherAirQualityActivity weatherAirQualityActivity = this.f53871a;
        androidx.navigation.compose.n.b(NavHost, "weatherAirQuality", null, null, null, null, null, null, new s1.a(true, 1002815148, new d(weatherAirQualityActivity)), 126);
        androidx.navigation.compose.n.b(NavHost, "weatherAirQualitySearch", null, null, null, null, null, null, new s1.a(true, -313479723, new h(weatherAirQualityActivity)), 126);
        return nm0.y.f85009a;
    }
}
