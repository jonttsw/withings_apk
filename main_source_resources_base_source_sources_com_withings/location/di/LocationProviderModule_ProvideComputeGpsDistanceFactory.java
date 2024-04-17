package com.withings.location.di;

import ah.p;
import com.withings.location.domain.GpsDistanceComputer;
import com.withings.location.domain.uc.ComputeGpsDistance;
import com.withings.location.domain.uc.FilterGpsLocationWithPause;
import com.withings.location.domain.uc.GpsLocationFilter;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class LocationProviderModule_ProvideComputeGpsDistanceFactory implements b<ComputeGpsDistance> {
    private final Provider<FilterGpsLocationWithPause> filterGpsLocationWithPauseProvider;
    private final Provider<GpsDistanceComputer> gpsDistanceComputerProvider;
    private final Provider<GpsLocationFilter> gpsLocationFilterProvider;

    public LocationProviderModule_ProvideComputeGpsDistanceFactory(Provider<GpsDistanceComputer> provider, Provider<GpsLocationFilter> provider2, Provider<FilterGpsLocationWithPause> provider3) {
        this.gpsDistanceComputerProvider = provider;
        this.gpsLocationFilterProvider = provider2;
        this.filterGpsLocationWithPauseProvider = provider3;
    }

    public static LocationProviderModule_ProvideComputeGpsDistanceFactory create(Provider<GpsDistanceComputer> provider, Provider<GpsLocationFilter> provider2, Provider<FilterGpsLocationWithPause> provider3) {
        return new LocationProviderModule_ProvideComputeGpsDistanceFactory(provider, provider2, provider3);
    }

    public static ComputeGpsDistance provideComputeGpsDistance(GpsDistanceComputer gpsDistanceComputer, GpsLocationFilter gpsLocationFilter, FilterGpsLocationWithPause filterGpsLocationWithPause) {
        ComputeGpsDistance provideComputeGpsDistance = LocationProviderModule.INSTANCE.provideComputeGpsDistance(gpsDistanceComputer, gpsLocationFilter, filterGpsLocationWithPause);
        p.d(provideComputeGpsDistance);
        return provideComputeGpsDistance;
    }

    @Override // javax.inject.Provider
    public ComputeGpsDistance get() {
        return provideComputeGpsDistance(this.gpsDistanceComputerProvider.get(), this.gpsLocationFilterProvider.get(), this.filterGpsLocationWithPauseProvider.get());
    }
}
