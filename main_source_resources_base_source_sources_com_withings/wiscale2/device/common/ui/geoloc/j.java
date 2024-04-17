package com.withings.wiscale2.device.common.ui.geoloc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WeatherAirQualityActivity.kt */
/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WeatherAirQualityActivity f53872a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f53873b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(WeatherAirQualityActivity weatherAirQualityActivity, int i11) {
        super(2);
        this.f53872a = weatherAirQualityActivity;
        this.f53873b = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f53873b | 1);
        WeatherAirQualityActivity.z3(this.f53872a, aVar, g11);
        return nm0.y.f85009a;
    }
}
