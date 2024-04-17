package com.withings.location.di;

import ah.p;
import com.withings.location.domain.uc.CountTotalGapDuration;
import com.withings.location.domain.uc.HasEnoughGpsLocations;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class LocationProviderModule_ProvideHasEnoughGpsLocationsFactory implements b<HasEnoughGpsLocations> {
    private final Provider<CountTotalGapDuration> countTotalGapDurationProvider;

    public LocationProviderModule_ProvideHasEnoughGpsLocationsFactory(Provider<CountTotalGapDuration> provider) {
        this.countTotalGapDurationProvider = provider;
    }

    public static LocationProviderModule_ProvideHasEnoughGpsLocationsFactory create(Provider<CountTotalGapDuration> provider) {
        return new LocationProviderModule_ProvideHasEnoughGpsLocationsFactory(provider);
    }

    public static HasEnoughGpsLocations provideHasEnoughGpsLocations(CountTotalGapDuration countTotalGapDuration) {
        HasEnoughGpsLocations provideHasEnoughGpsLocations = LocationProviderModule.INSTANCE.provideHasEnoughGpsLocations(countTotalGapDuration);
        p.d(provideHasEnoughGpsLocations);
        return provideHasEnoughGpsLocations;
    }

    @Override // javax.inject.Provider
    public HasEnoughGpsLocations get() {
        return provideHasEnoughGpsLocations(this.countTotalGapDurationProvider.get());
    }
}
