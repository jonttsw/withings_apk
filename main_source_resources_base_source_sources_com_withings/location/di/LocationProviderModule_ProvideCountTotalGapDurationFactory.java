package com.withings.location.di;

import ah.p;
import com.withings.location.domain.GpsDistanceComputer;
import com.withings.location.domain.uc.CountTotalGapDuration;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class LocationProviderModule_ProvideCountTotalGapDurationFactory implements b<CountTotalGapDuration> {
    private final Provider<GpsDistanceComputer> gpsDistanceComputerProvider;

    public LocationProviderModule_ProvideCountTotalGapDurationFactory(Provider<GpsDistanceComputer> provider) {
        this.gpsDistanceComputerProvider = provider;
    }

    public static LocationProviderModule_ProvideCountTotalGapDurationFactory create(Provider<GpsDistanceComputer> provider) {
        return new LocationProviderModule_ProvideCountTotalGapDurationFactory(provider);
    }

    public static CountTotalGapDuration provideCountTotalGapDuration(GpsDistanceComputer gpsDistanceComputer) {
        CountTotalGapDuration provideCountTotalGapDuration = LocationProviderModule.INSTANCE.provideCountTotalGapDuration(gpsDistanceComputer);
        p.d(provideCountTotalGapDuration);
        return provideCountTotalGapDuration;
    }

    @Override // javax.inject.Provider
    public CountTotalGapDuration get() {
        return provideCountTotalGapDuration(this.gpsDistanceComputerProvider.get());
    }
}
