package com.withings.wiscale2.device.common.ui.geoloc;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class n implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WeatherAirQualityActivity f53878a;

    public n(WeatherAirQualityActivity weatherAirQualityActivity) {
        this.f53878a = weatherAirQualityActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        WeatherAirQualityActivity weatherAirQualityActivity = this.f53878a;
        g0 g0Var = weatherAirQualityActivity.f53823f;
        if (g0Var != null) {
            return g0Var.a(WeatherAirQualityActivity.B3(weatherAirQualityActivity));
        }
        kotlin.jvm.internal.u.s("weatherAirQualityViewModelFactory");
        throw null;
    }
}
