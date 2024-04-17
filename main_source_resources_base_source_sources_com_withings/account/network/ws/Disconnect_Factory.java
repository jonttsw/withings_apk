package com.withings.account.network.ws;

import dagger.internal.b;
import javax.inject.Provider;
import vf.d;
/* loaded from: classes3.dex */
public final class Disconnect_Factory implements b<Disconnect> {
    private final Provider<d> fcmRegistererProvider;
    private final Provider<yf.d> healthmateSessionDaoProvider;
    private final Provider<SessionRemoteRepository> sessionRemoteRepositoryProvider;

    public Disconnect_Factory(Provider<SessionRemoteRepository> provider, Provider<yf.d> provider2, Provider<d> provider3) {
        this.sessionRemoteRepositoryProvider = provider;
        this.healthmateSessionDaoProvider = provider2;
        this.fcmRegistererProvider = provider3;
    }

    public static Disconnect_Factory create(Provider<SessionRemoteRepository> provider, Provider<yf.d> provider2, Provider<d> provider3) {
        return new Disconnect_Factory(provider, provider2, provider3);
    }

    public static Disconnect newInstance(SessionRemoteRepository sessionRemoteRepository, yf.d dVar, d dVar2) {
        return new Disconnect(sessionRemoteRepository, dVar, dVar2);
    }

    @Override // javax.inject.Provider
    public Disconnect get() {
        return newInstance(this.sessionRemoteRepositoryProvider.get(), this.healthmateSessionDaoProvider.get(), this.fcmRegistererProvider.get());
    }
}
