package com.withings.screen.repository.data;

import com.withings.screen.repository.data.db.DeviceScreenContentDao;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class RoomDeviceScreenContentDao_Factory implements b<RoomDeviceScreenContentDao> {
    private final Provider<DeviceScreenContentDao> daoProvider;

    public RoomDeviceScreenContentDao_Factory(Provider<DeviceScreenContentDao> provider) {
        this.daoProvider = provider;
    }

    public static RoomDeviceScreenContentDao_Factory create(Provider<DeviceScreenContentDao> provider) {
        return new RoomDeviceScreenContentDao_Factory(provider);
    }

    public static RoomDeviceScreenContentDao newInstance(DeviceScreenContentDao deviceScreenContentDao) {
        return new RoomDeviceScreenContentDao(deviceScreenContentDao);
    }

    @Override // javax.inject.Provider
    public RoomDeviceScreenContentDao get() {
        return newInstance(this.daoProvider.get());
    }
}
