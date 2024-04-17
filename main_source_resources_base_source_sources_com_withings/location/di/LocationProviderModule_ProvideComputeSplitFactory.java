package com.withings.location.di;

import ah.p;
import com.withings.location.domain.uc.ComputeGpsDistance;
import com.withings.location.domain.uc.ComputeSplits;
import com.withings.location.domain.uc.FilterGpsLocationWithPause;
import com.withings.location.domain.uc.GpsLocationFilter;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class LocationProviderModule_ProvideComputeSplitFactory implements b<ComputeSplits> {
    private final Provider<ComputeGpsDistance> computeGpsDistanceProvider;
    private final Provider<FilterGpsLocationWithPause> filterGpsLocationWithPauseProvider;
    private final Provider<GpsLocationFilter> gpsLocationFilterProvider;

    public LocationProviderModule_ProvideComputeSplitFactory(Provider<ComputeGpsDistance> provider, Provider<FilterGpsLocationWithPause> provider2, Provider<GpsLocationFilter> provider3) {
        this.computeGpsDistanceProvider = provider;
        this.filterGpsLocationWithPauseProvider = provider2;
        this.gpsLocationFilterProvider = provider3;
    }

    public static LocationProviderModule_ProvideComputeSplitFactory create(Provider<ComputeGpsDistance> provider, Provider<FilterGpsLocationWithPause> provider2, Provider<GpsLocationFilter> provider3) {
        return new LocationProviderModule_ProvideComputeSplitFactory(provider, provider2, provider3);
    }

    public static ComputeSplits provideComputeSplit(ComputeGpsDistance computeGpsDistance, FilterGpsLocationWithPause filterGpsLocationWithPause, GpsLocationFilter gpsLocationFilter) {
        ComputeSplits provideComputeSplit = LocationProviderModule.INSTANCE.provideComputeSplit(computeGpsDistance, filterGpsLocationWithPause, gpsLocationFilter);
        p.d(provideComputeSplit);
        return provideComputeSplit;
    }

    @Override // javax.inject.Provider
    public ComputeSplits get() {
        return provideComputeSplit(this.computeGpsDistanceProvider.get(), this.filterGpsLocationWithPauseProvider.get(), this.gpsLocationFilterProvider.get());
    }
}
