package com.withings.location.di;

import ah.p;
import com.withings.location.domain.uc.ComputePace;
import com.withings.location.domain.uc.ComputeSpeed;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class LocationProviderModule_ProvideComputePaceFactory implements b<ComputePace> {
    private final Provider<ComputeSpeed> computeSpeedProvider;

    public LocationProviderModule_ProvideComputePaceFactory(Provider<ComputeSpeed> provider) {
        this.computeSpeedProvider = provider;
    }

    public static LocationProviderModule_ProvideComputePaceFactory create(Provider<ComputeSpeed> provider) {
        return new LocationProviderModule_ProvideComputePaceFactory(provider);
    }

    public static ComputePace provideComputePace(ComputeSpeed computeSpeed) {
        ComputePace provideComputePace = LocationProviderModule.INSTANCE.provideComputePace(computeSpeed);
        p.d(provideComputePace);
        return provideComputePace;
    }

    @Override // javax.inject.Provider
    public ComputePace get() {
        return provideComputePace(this.computeSpeedProvider.get());
    }
}
