package com.withings.location.di;

import ah.p;
import com.withings.location.domain.uc.ComputeGpsDistance;
import com.withings.location.domain.uc.ComputeGpsSummary;
import com.withings.location.domain.uc.FilterGpsLocationWithPause;
import com.withings.location.domain.uc.HasEnoughGpsLocations;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class LocationProviderModule_ProvideComputeGpsSummaryFactory implements b<ComputeGpsSummary> {
    private final Provider<ComputeGpsDistance> computeGpsDistanceProvider;
    private final Provider<FilterGpsLocationWithPause> filterGpsLocationWithPauseProvider;
    private final Provider<HasEnoughGpsLocations> hasEnoughGpsLocationsProvider;

    public LocationProviderModule_ProvideComputeGpsSummaryFactory(Provider<HasEnoughGpsLocations> provider, Provider<ComputeGpsDistance> provider2, Provider<FilterGpsLocationWithPause> provider3) {
        this.hasEnoughGpsLocationsProvider = provider;
        this.computeGpsDistanceProvider = provider2;
        this.filterGpsLocationWithPauseProvider = provider3;
    }

    public static LocationProviderModule_ProvideComputeGpsSummaryFactory create(Provider<HasEnoughGpsLocations> provider, Provider<ComputeGpsDistance> provider2, Provider<FilterGpsLocationWithPause> provider3) {
        return new LocationProviderModule_ProvideComputeGpsSummaryFactory(provider, provider2, provider3);
    }

    public static ComputeGpsSummary provideComputeGpsSummary(HasEnoughGpsLocations hasEnoughGpsLocations, ComputeGpsDistance computeGpsDistance, FilterGpsLocationWithPause filterGpsLocationWithPause) {
        ComputeGpsSummary provideComputeGpsSummary = LocationProviderModule.INSTANCE.provideComputeGpsSummary(hasEnoughGpsLocations, computeGpsDistance, filterGpsLocationWithPause);
        p.d(provideComputeGpsSummary);
        return provideComputeGpsSummary;
    }

    @Override // javax.inject.Provider
    public ComputeGpsSummary get() {
        return provideComputeGpsSummary(this.hasEnoughGpsLocationsProvider.get(), this.computeGpsDistanceProvider.get(), this.filterGpsLocationWithPauseProvider.get());
    }
}
