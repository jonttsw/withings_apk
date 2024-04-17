package com.withings.location.di;

import ah.p;
import com.withings.location.domain.uc.FilterGpsLocationWithPause;
import dagger.internal.b;
/* loaded from: classes4.dex */
public final class LocationProviderModule_ProvideFilterGpsLocationWithPauseFactory implements b<FilterGpsLocationWithPause> {

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final LocationProviderModule_ProvideFilterGpsLocationWithPauseFactory INSTANCE = new LocationProviderModule_ProvideFilterGpsLocationWithPauseFactory();

        private InstanceHolder() {
        }
    }

    public static LocationProviderModule_ProvideFilterGpsLocationWithPauseFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FilterGpsLocationWithPause provideFilterGpsLocationWithPause() {
        FilterGpsLocationWithPause provideFilterGpsLocationWithPause = LocationProviderModule.INSTANCE.provideFilterGpsLocationWithPause();
        p.d(provideFilterGpsLocationWithPause);
        return provideFilterGpsLocationWithPause;
    }

    @Override // javax.inject.Provider
    public FilterGpsLocationWithPause get() {
        return provideFilterGpsLocationWithPause();
    }
}
