package com.withings.location.repository.data.uc;

import com.withings.location.repository.data.db.GpsLocationDao;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class GetLastGpsLocationSyncedDate_Factory implements b<GetLastGpsLocationSyncedDate> {
    private final Provider<GpsLocationDao> gpsLocationDaoProvider;

    public GetLastGpsLocationSyncedDate_Factory(Provider<GpsLocationDao> provider) {
        this.gpsLocationDaoProvider = provider;
    }

    public static GetLastGpsLocationSyncedDate_Factory create(Provider<GpsLocationDao> provider) {
        return new GetLastGpsLocationSyncedDate_Factory(provider);
    }

    public static GetLastGpsLocationSyncedDate newInstance(GpsLocationDao gpsLocationDao) {
        return new GetLastGpsLocationSyncedDate(gpsLocationDao);
    }

    @Override // javax.inject.Provider
    public GetLastGpsLocationSyncedDate get() {
        return newInstance(this.gpsLocationDaoProvider.get());
    }
}
