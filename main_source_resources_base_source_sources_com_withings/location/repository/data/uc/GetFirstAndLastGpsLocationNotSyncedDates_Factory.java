package com.withings.location.repository.data.uc;

import com.withings.location.repository.data.db.GpsLocationDao;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class GetFirstAndLastGpsLocationNotSyncedDates_Factory implements b<GetFirstAndLastGpsLocationNotSyncedDates> {
    private final Provider<GpsLocationDao> daoProvider;

    public GetFirstAndLastGpsLocationNotSyncedDates_Factory(Provider<GpsLocationDao> provider) {
        this.daoProvider = provider;
    }

    public static GetFirstAndLastGpsLocationNotSyncedDates_Factory create(Provider<GpsLocationDao> provider) {
        return new GetFirstAndLastGpsLocationNotSyncedDates_Factory(provider);
    }

    public static GetFirstAndLastGpsLocationNotSyncedDates newInstance(GpsLocationDao gpsLocationDao) {
        return new GetFirstAndLastGpsLocationNotSyncedDates(gpsLocationDao);
    }

    @Override // javax.inject.Provider
    public GetFirstAndLastGpsLocationNotSyncedDates get() {
        return newInstance(this.daoProvider.get());
    }
}
