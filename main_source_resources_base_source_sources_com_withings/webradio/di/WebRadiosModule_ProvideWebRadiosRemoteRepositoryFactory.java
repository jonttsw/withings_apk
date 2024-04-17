package com.withings.webradio.di;

import ah.p;
import com.withings.webradio.network.WebRadiosRemoteRepository;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class WebRadiosModule_ProvideWebRadiosRemoteRepositoryFactory implements b<WebRadiosRemoteRepository> {
    private final Provider<s00.b> compatWebservicesFactoryProvider;

    public WebRadiosModule_ProvideWebRadiosRemoteRepositoryFactory(Provider<s00.b> provider) {
        this.compatWebservicesFactoryProvider = provider;
    }

    public static WebRadiosModule_ProvideWebRadiosRemoteRepositoryFactory create(Provider<s00.b> provider) {
        return new WebRadiosModule_ProvideWebRadiosRemoteRepositoryFactory(provider);
    }

    public static WebRadiosRemoteRepository provideWebRadiosRemoteRepository(s00.b bVar) {
        WebRadiosRemoteRepository provideWebRadiosRemoteRepository = WebRadiosModule.INSTANCE.provideWebRadiosRemoteRepository(bVar);
        p.d(provideWebRadiosRemoteRepository);
        return provideWebRadiosRemoteRepository;
    }

    @Override // javax.inject.Provider
    public WebRadiosRemoteRepository get() {
        return provideWebRadiosRemoteRepository(this.compatWebservicesFactoryProvider.get());
    }
}
