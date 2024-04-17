package com.withings.location.di;

import ah.p;
import com.withings.location.domain.uc.ComputeGpsDistance;
import com.withings.location.domain.uc.ComputeSpeed;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class LocationProviderModule_ProvideComputeSpeedFactory implements b<ComputeSpeed> {
    private final Provider<ComputeGpsDistance> computeGpsDistanceProvider;

    public LocationProviderModule_ProvideComputeSpeedFactory(Provider<ComputeGpsDistance> provider) {
        this.computeGpsDistanceProvider = provider;
    }

    public static LocationProviderModule_ProvideComputeSpeedFactory create(Provider<ComputeGpsDistance> provider) {
        return new LocationProviderModule_ProvideComputeSpeedFactory(provider);
    }

    public static ComputeSpeed provideComputeSpeed(ComputeGpsDistance computeGpsDistance) {
        ComputeSpeed provideComputeSpeed = LocationProviderModule.INSTANCE.provideComputeSpeed(computeGpsDistance);
        p.d(provideComputeSpeed);
        return provideComputeSpeed;
    }

    @Override // javax.inject.Provider
    public ComputeSpeed get() {
        return provideComputeSpeed(this.computeGpsDistanceProvider.get());
    }
}
