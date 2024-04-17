package com.withings.location.repository.ws;

import dagger.internal.b;
import javax.inject.Provider;
import r70.c;
/* loaded from: classes4.dex */
public final class SynchronizeLocationVasistas_Factory implements b<SynchronizeLocationVasistas> {
    private final Provider<GetLastLocationVasistas> getLastLocationVasistasProvider;
    private final Provider<SendLocationVasistas> sendLocationVasistasProvider;
    private final Provider<c> userRepositoryProvider;

    public SynchronizeLocationVasistas_Factory(Provider<c> provider, Provider<GetLastLocationVasistas> provider2, Provider<SendLocationVasistas> provider3) {
        this.userRepositoryProvider = provider;
        this.getLastLocationVasistasProvider = provider2;
        this.sendLocationVasistasProvider = provider3;
    }

    public static SynchronizeLocationVasistas_Factory create(Provider<c> provider, Provider<GetLastLocationVasistas> provider2, Provider<SendLocationVasistas> provider3) {
        return new SynchronizeLocationVasistas_Factory(provider, provider2, provider3);
    }

    public static SynchronizeLocationVasistas newInstance(c cVar, GetLastLocationVasistas getLastLocationVasistas, SendLocationVasistas sendLocationVasistas) {
        return new SynchronizeLocationVasistas(cVar, getLastLocationVasistas, sendLocationVasistas);
    }

    @Override // javax.inject.Provider
    public SynchronizeLocationVasistas get() {
        return newInstance(this.userRepositoryProvider.get(), this.getLastLocationVasistasProvider.get(), this.sendLocationVasistasProvider.get());
    }
}
