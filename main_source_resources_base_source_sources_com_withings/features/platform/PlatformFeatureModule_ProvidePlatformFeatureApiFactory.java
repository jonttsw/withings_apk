package com.withings.features.platform;

import ah.p;
import dagger.internal.b;
import javax.inject.Provider;
import qr.a;
/* loaded from: classes3.dex */
public final class PlatformFeatureModule_ProvidePlatformFeatureApiFactory implements b<a> {
    private final Provider<s00.b> compatWebServicesFactoryProvider;

    public PlatformFeatureModule_ProvidePlatformFeatureApiFactory(Provider<s00.b> provider) {
        this.compatWebServicesFactoryProvider = provider;
    }

    public static PlatformFeatureModule_ProvidePlatformFeatureApiFactory create(Provider<s00.b> provider) {
        return new PlatformFeatureModule_ProvidePlatformFeatureApiFactory(provider);
    }

    public static a providePlatformFeatureApi(s00.b bVar) {
        a providePlatformFeatureApi = PlatformFeatureModule.INSTANCE.providePlatformFeatureApi(bVar);
        p.d(providePlatformFeatureApi);
        return providePlatformFeatureApi;
    }

    @Override // javax.inject.Provider
    public a get() {
        return providePlatformFeatureApi(this.compatWebServicesFactoryProvider.get());
    }
}
