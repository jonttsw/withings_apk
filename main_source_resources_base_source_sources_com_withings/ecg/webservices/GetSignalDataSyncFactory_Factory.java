package com.withings.ecg.webservices;

import android.content.Context;
import com.withings.ecg.model.HeartSignalRepository;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes3.dex */
public final class GetSignalDataSyncFactory_Factory implements b<GetSignalDataSyncFactory> {
    private final Provider<Context> contextProvider;
    private final Provider<HeartSignalRepository> heartSignalRepositoryProvider;
    private final Provider<SignalRemoteRepository> signalRemoteRepositoryProvider;

    public GetSignalDataSyncFactory_Factory(Provider<Context> provider, Provider<HeartSignalRepository> provider2, Provider<SignalRemoteRepository> provider3) {
        this.contextProvider = provider;
        this.heartSignalRepositoryProvider = provider2;
        this.signalRemoteRepositoryProvider = provider3;
    }

    public static GetSignalDataSyncFactory_Factory create(Provider<Context> provider, Provider<HeartSignalRepository> provider2, Provider<SignalRemoteRepository> provider3) {
        return new GetSignalDataSyncFactory_Factory(provider, provider2, provider3);
    }

    public static GetSignalDataSyncFactory newInstance(Context context, HeartSignalRepository heartSignalRepository, SignalRemoteRepository signalRemoteRepository) {
        return new GetSignalDataSyncFactory(context, heartSignalRepository, signalRemoteRepository);
    }

    @Override // javax.inject.Provider
    public GetSignalDataSyncFactory get() {
        return newInstance(this.contextProvider.get(), this.heartSignalRepositoryProvider.get(), this.signalRemoteRepositoryProvider.get());
    }
}
