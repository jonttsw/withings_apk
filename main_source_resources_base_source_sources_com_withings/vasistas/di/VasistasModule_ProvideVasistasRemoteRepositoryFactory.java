package com.withings.vasistas.di;

import ah.p;
import com.withings.vasistas.ws.VasistasRemoteRepository;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class VasistasModule_ProvideVasistasRemoteRepositoryFactory implements b<VasistasRemoteRepository> {
    private final Provider<s00.b> compatWebservicesFactoryProvider;
    private final VasistasModule module;

    public VasistasModule_ProvideVasistasRemoteRepositoryFactory(VasistasModule vasistasModule, Provider<s00.b> provider) {
        this.module = vasistasModule;
        this.compatWebservicesFactoryProvider = provider;
    }

    public static VasistasModule_ProvideVasistasRemoteRepositoryFactory create(VasistasModule vasistasModule, Provider<s00.b> provider) {
        return new VasistasModule_ProvideVasistasRemoteRepositoryFactory(vasistasModule, provider);
    }

    public static VasistasRemoteRepository provideVasistasRemoteRepository(VasistasModule vasistasModule, s00.b bVar) {
        VasistasRemoteRepository provideVasistasRemoteRepository = vasistasModule.provideVasistasRemoteRepository(bVar);
        p.d(provideVasistasRemoteRepository);
        return provideVasistasRemoteRepository;
    }

    @Override // javax.inject.Provider
    public VasistasRemoteRepository get() {
        return provideVasistasRemoteRepository(this.module, this.compatWebservicesFactoryProvider.get());
    }
}
