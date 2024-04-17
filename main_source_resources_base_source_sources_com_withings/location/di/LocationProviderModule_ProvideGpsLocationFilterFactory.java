package com.withings.location.di;

import ah.p;
import com.withings.location.domain.GpsDistanceComputer;
import com.withings.location.domain.uc.GpsLocationFilter;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class LocationProviderModule_ProvideGpsLocationFilterFactory implements b<GpsLocationFilter> {
    private final Provider<GpsDistanceComputer> gpsDistanceComputerProvider;

    public LocationProviderModule_ProvideGpsLocationFilterFactory(Provider<GpsDistanceComputer> provider) {
        this.gpsDistanceComputerProvider = provider;
    }

    public static LocationProviderModule_ProvideGpsLocationFilterFactory create(Provider<GpsDistanceComputer> provider) {
        return new LocationProviderModule_ProvideGpsLocationFilterFactory(provider);
    }

    public static GpsLocationFilter provideGpsLocationFilter(GpsDistanceComputer gpsDistanceComputer) {
        GpsLocationFilter provideGpsLocationFilter = LocationProviderModule.INSTANCE.provideGpsLocationFilter(gpsDistanceComputer);
        p.d(provideGpsLocationFilter);
        return provideGpsLocationFilter;
    }

    @Override // javax.inject.Provider
    public GpsLocationFilter get() {
        return provideGpsLocationFilter(this.gpsDistanceComputerProvider.get());
    }
}
