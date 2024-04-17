package com.withings.target.data.di;

import ah.p;
import com.withings.target.data.api.TargetRemoteRepository;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class TargetModule_ProvideTargetRemoteRepositoryFactory implements b<TargetRemoteRepository> {
    private final Provider<s00.b> compatWebservicesFactoryProvider;

    public TargetModule_ProvideTargetRemoteRepositoryFactory(Provider<s00.b> provider) {
        this.compatWebservicesFactoryProvider = provider;
    }

    public static TargetModule_ProvideTargetRemoteRepositoryFactory create(Provider<s00.b> provider) {
        return new TargetModule_ProvideTargetRemoteRepositoryFactory(provider);
    }

    public static TargetRemoteRepository provideTargetRemoteRepository(s00.b bVar) {
        TargetRemoteRepository provideTargetRemoteRepository = TargetModule.INSTANCE.provideTargetRemoteRepository(bVar);
        p.d(provideTargetRemoteRepository);
        return provideTargetRemoteRepository;
    }

    @Override // javax.inject.Provider
    public TargetRemoteRepository get() {
        return provideTargetRemoteRepository(this.compatWebservicesFactoryProvider.get());
    }
}
