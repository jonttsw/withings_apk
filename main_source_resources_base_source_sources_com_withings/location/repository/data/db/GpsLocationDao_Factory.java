package com.withings.location.repository.data.db;

import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class GpsLocationDao_Factory implements b<GpsLocationDao> {
    private final Provider<RoomGpsLocationDao> roomGpsLocationDaoProvider;

    public GpsLocationDao_Factory(Provider<RoomGpsLocationDao> provider) {
        this.roomGpsLocationDaoProvider = provider;
    }

    public static GpsLocationDao_Factory create(Provider<RoomGpsLocationDao> provider) {
        return new GpsLocationDao_Factory(provider);
    }

    public static GpsLocationDao newInstance(RoomGpsLocationDao roomGpsLocationDao) {
        return new GpsLocationDao(roomGpsLocationDao);
    }

    @Override // javax.inject.Provider
    public GpsLocationDao get() {
        return newInstance(this.roomGpsLocationDaoProvider.get());
    }
}
