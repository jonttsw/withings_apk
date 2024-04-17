package com.withings.location.di;

import ah.p;
import com.withings.location.domain.GpsDistanceComputer;
import com.withings.location.domain.uc.ComputeElevation;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class LocationProviderModule_ProvideComputeElevationFactory implements b<ComputeElevation> {
    private final Provider<GpsDistanceComputer> gpsDistanceComputerProvider;

    public LocationProviderModule_ProvideComputeElevationFactory(Provider<GpsDistanceComputer> provider) {
        this.gpsDistanceComputerProvider = provider;
    }

    public static LocationProviderModule_ProvideComputeElevationFactory create(Provider<GpsDistanceComputer> provider) {
        return new LocationProviderModule_ProvideComputeElevationFactory(provider);
    }

    public static ComputeElevation provideComputeElevation(GpsDistanceComputer gpsDistanceComputer) {
        ComputeElevation provideComputeElevation = LocationProviderModule.INSTANCE.provideComputeElevation(gpsDistanceComputer);
        p.d(provideComputeElevation);
        return provideComputeElevation;
    }

    @Override // javax.inject.Provider
    public ComputeElevation get() {
        return provideComputeElevation(this.gpsDistanceComputerProvider.get());
    }
}
