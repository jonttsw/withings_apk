package com.withings.location.repository.data.uc;

import com.withings.location.repository.data.db.GpsLocationDao;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class DeleteGpsLocations_Factory implements b<DeleteGpsLocations> {
    private final Provider<GpsLocationDao> daoProvider;

    public DeleteGpsLocations_Factory(Provider<GpsLocationDao> provider) {
        this.daoProvider = provider;
    }

    public static DeleteGpsLocations_Factory create(Provider<GpsLocationDao> provider) {
        return new DeleteGpsLocations_Factory(provider);
    }

    public static DeleteGpsLocations newInstance(GpsLocationDao gpsLocationDao) {
        return new DeleteGpsLocations(gpsLocationDao);
    }

    @Override // javax.inject.Provider
    public DeleteGpsLocations get() {
        return newInstance(this.daoProvider.get());
    }
}
