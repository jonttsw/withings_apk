package com.withings.wiscale2.device.common.ui.geoloc;
/* compiled from: WeatherAirQualityActivity.kt */
/* loaded from: classes5.dex */
final class f extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WeatherAirQualityActivity f53866a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(WeatherAirQualityActivity weatherAirQualityActivity) {
        super(0);
        this.f53866a = weatherAirQualityActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        r8.n nVar;
        nVar = this.f53866a.f53825h;
        if (nVar != null) {
            nVar.N();
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("navHostController");
        throw null;
    }
}
