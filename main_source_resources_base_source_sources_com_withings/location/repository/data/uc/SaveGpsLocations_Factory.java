package com.withings.location.repository.data.uc;

import com.withings.location.repository.data.db.GpsLocationDao;
import com.withings.location.repository.data.mapper.GpsLocationEntityMapper;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class SaveGpsLocations_Factory implements b<SaveGpsLocations> {
    private final Provider<GpsLocationDao> daoProvider;
    private final Provider<GpsLocationEntityMapper> mapperProvider;

    public SaveGpsLocations_Factory(Provider<GpsLocationDao> provider, Provider<GpsLocationEntityMapper> provider2) {
        this.daoProvider = provider;
        this.mapperProvider = provider2;
    }

    public static SaveGpsLocations_Factory create(Provider<GpsLocationDao> provider, Provider<GpsLocationEntityMapper> provider2) {
        return new SaveGpsLocations_Factory(provider, provider2);
    }

    public static SaveGpsLocations newInstance(GpsLocationDao gpsLocationDao, GpsLocationEntityMapper gpsLocationEntityMapper) {
        return new SaveGpsLocations(gpsLocationDao, gpsLocationEntityMapper);
    }

    @Override // javax.inject.Provider
    public SaveGpsLocations get() {
        return newInstance(this.daoProvider.get(), this.mapperProvider.get());
    }
}
