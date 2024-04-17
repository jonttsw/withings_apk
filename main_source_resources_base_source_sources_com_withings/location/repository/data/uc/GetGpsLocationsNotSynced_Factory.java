package com.withings.location.repository.data.uc;

import com.withings.location.repository.data.db.GpsLocationDao;
import com.withings.location.repository.data.mapper.GpsLocationEntityMapper;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class GetGpsLocationsNotSynced_Factory implements b<GetGpsLocationsNotSynced> {
    private final Provider<GpsLocationDao> daoProvider;
    private final Provider<GpsLocationEntityMapper> mapperProvider;

    public GetGpsLocationsNotSynced_Factory(Provider<GpsLocationDao> provider, Provider<GpsLocationEntityMapper> provider2) {
        this.daoProvider = provider;
        this.mapperProvider = provider2;
    }

    public static GetGpsLocationsNotSynced_Factory create(Provider<GpsLocationDao> provider, Provider<GpsLocationEntityMapper> provider2) {
        return new GetGpsLocationsNotSynced_Factory(provider, provider2);
    }

    public static GetGpsLocationsNotSynced newInstance(GpsLocationDao gpsLocationDao, GpsLocationEntityMapper gpsLocationEntityMapper) {
        return new GetGpsLocationsNotSynced(gpsLocationDao, gpsLocationEntityMapper);
    }

    @Override // javax.inject.Provider
    public GetGpsLocationsNotSynced get() {
        return newInstance(this.daoProvider.get(), this.mapperProvider.get());
    }
}
