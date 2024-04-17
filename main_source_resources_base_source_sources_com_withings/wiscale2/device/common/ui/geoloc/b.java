package com.withings.wiscale2.device.common.ui.geoloc;
/* compiled from: WeatherAirQualityActivity.kt */
/* loaded from: classes5.dex */
final class b extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WeatherAirQualityActivity f53852a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(WeatherAirQualityActivity weatherAirQualityActivity) {
        super(0);
        this.f53852a = weatherAirQualityActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        r8.n nVar;
        nVar = this.f53852a.f53825h;
        if (nVar != null) {
            androidx.navigation.e.L(nVar, "weatherAirQualitySearch", null, 6);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("navHostController");
        throw null;
    }
}
