package com.withings.location.di;

import ah.p;
import com.withings.location.repository.GpsLocationRemoteRepository;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class LocationProviderModule_ProvideGpsLocationRemoteRepositoryFactory implements b<GpsLocationRemoteRepository> {
    private final Provider<s00.b> compatWebservicesFactoryProvider;

    public LocationProviderModule_ProvideGpsLocationRemoteRepositoryFactory(Provider<s00.b> provider) {
        this.compatWebservicesFactoryProvider = provider;
    }

    public static LocationProviderModule_ProvideGpsLocationRemoteRepositoryFactory create(Provider<s00.b> provider) {
        return new LocationProviderModule_ProvideGpsLocationRemoteRepositoryFactory(provider);
    }

    public static GpsLocationRemoteRepository provideGpsLocationRemoteRepository(s00.b bVar) {
        GpsLocationRemoteRepository provideGpsLocationRemoteRepository = LocationProviderModule.INSTANCE.provideGpsLocationRemoteRepository(bVar);
        p.d(provideGpsLocationRemoteRepository);
        return provideGpsLocationRemoteRepository;
    }

    @Override // javax.inject.Provider
    public GpsLocationRemoteRepository get() {
        return provideGpsLocationRemoteRepository(this.compatWebservicesFactoryProvider.get());
    }
}
