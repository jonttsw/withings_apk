package com.withings.features.platform;

import ah.p;
import android.content.Context;
import com.withings.features.platform.model.PlatformFeatureRepository;
import dagger.internal.b;
import javax.inject.Provider;
import vr.c;
/* loaded from: classes3.dex */
public final class PlatformFeatureModule_ProvideFeatureTagsLastUpdateRepositoryFactory implements b<c> {
    private final Provider<Context> contextProvider;
    private final Provider<PlatformFeatureRepository> platformFeatureRepositoryProvider;

    public PlatformFeatureModule_ProvideFeatureTagsLastUpdateRepositoryFactory(Provider<Context> provider, Provider<PlatformFeatureRepository> provider2) {
        this.contextProvider = provider;
        this.platformFeatureRepositoryProvider = provider2;
    }

    public static PlatformFeatureModule_ProvideFeatureTagsLastUpdateRepositoryFactory create(Provider<Context> provider, Provider<PlatformFeatureRepository> provider2) {
        return new PlatformFeatureModule_ProvideFeatureTagsLastUpdateRepositoryFactory(provider, provider2);
    }

    public static c provideFeatureTagsLastUpdateRepository(Context context, PlatformFeatureRepository platformFeatureRepository) {
        c provideFeatureTagsLastUpdateRepository = PlatformFeatureModule.INSTANCE.provideFeatureTagsLastUpdateRepository(context, platformFeatureRepository);
        p.d(provideFeatureTagsLastUpdateRepository);
        return provideFeatureTagsLastUpdateRepository;
    }

    @Override // javax.inject.Provider
    public c get() {
        return provideFeatureTagsLastUpdateRepository(this.contextProvider.get(), this.platformFeatureRepositoryProvider.get());
    }
}
