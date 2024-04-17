package com.withings.location.repository;

import com.withings.location.repository.data.db.GpsLocationDao;
import com.withings.location.repository.data.mapper.GpsLocationEntityMapper;
import com.withings.location.repository.ws.SynchronizeLocationVasistas;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class RoomGpsLocationRepository_Factory implements b<RoomGpsLocationRepository> {
    private final Provider<GpsLocationDao> daoProvider;
    private final Provider<GpsLocationEntityMapper> mapperProvider;
    private final Provider<SynchronizeLocationVasistas> synchronizeLocationVasistasProvider;

    public RoomGpsLocationRepository_Factory(Provider<GpsLocationDao> provider, Provider<GpsLocationEntityMapper> provider2, Provider<SynchronizeLocationVasistas> provider3) {
        this.daoProvider = provider;
        this.mapperProvider = provider2;
        this.synchronizeLocationVasistasProvider = provider3;
    }

    public static RoomGpsLocationRepository_Factory create(Provider<GpsLocationDao> provider, Provider<GpsLocationEntityMapper> provider2, Provider<SynchronizeLocationVasistas> provider3) {
        return new RoomGpsLocationRepository_Factory(provider, provider2, provider3);
    }

    public static RoomGpsLocationRepository newInstance(GpsLocationDao gpsLocationDao, GpsLocationEntityMapper gpsLocationEntityMapper, SynchronizeLocationVasistas synchronizeLocationVasistas) {
        return new RoomGpsLocationRepository(gpsLocationDao, gpsLocationEntityMapper, synchronizeLocationVasistas);
    }

    @Override // javax.inject.Provider
    public RoomGpsLocationRepository get() {
        return newInstance(this.daoProvider.get(), this.mapperProvider.get(), this.synchronizeLocationVasistasProvider.get());
    }
}
