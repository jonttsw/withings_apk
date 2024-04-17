package com.withings.screen.di;

import ah.p;
import com.withings.screen.repository.DeviceScreensRemoteRepository;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class DeviceScreenModule_ProvideRemoteRepositoryFactory implements b<DeviceScreensRemoteRepository> {
    private final Provider<s00.b> compatWebservicesFactoryProvider;

    public DeviceScreenModule_ProvideRemoteRepositoryFactory(Provider<s00.b> provider) {
        this.compatWebservicesFactoryProvider = provider;
    }

    public static DeviceScreenModule_ProvideRemoteRepositoryFactory create(Provider<s00.b> provider) {
        return new DeviceScreenModule_ProvideRemoteRepositoryFactory(provider);
    }

    public static DeviceScreensRemoteRepository provideRemoteRepository(s00.b bVar) {
        DeviceScreensRemoteRepository provideRemoteRepository = DeviceScreenModule.INSTANCE.provideRemoteRepository(bVar);
        p.d(provideRemoteRepository);
        return provideRemoteRepository;
    }

    @Override // javax.inject.Provider
    public DeviceScreensRemoteRepository get() {
        return provideRemoteRepository(this.compatWebservicesFactoryProvider.get());
    }
}
