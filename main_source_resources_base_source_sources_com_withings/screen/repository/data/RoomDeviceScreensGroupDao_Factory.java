package com.withings.screen.repository.data;

import com.withings.screen.repository.data.db.DeviceScreensGroupDao;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class RoomDeviceScreensGroupDao_Factory implements b<RoomDeviceScreensGroupDao> {
    private final Provider<DeviceScreensGroupDao> daoProvider;

    public RoomDeviceScreensGroupDao_Factory(Provider<DeviceScreensGroupDao> provider) {
        this.daoProvider = provider;
    }

    public static RoomDeviceScreensGroupDao_Factory create(Provider<DeviceScreensGroupDao> provider) {
        return new RoomDeviceScreensGroupDao_Factory(provider);
    }

    public static RoomDeviceScreensGroupDao newInstance(DeviceScreensGroupDao deviceScreensGroupDao) {
        return new RoomDeviceScreensGroupDao(deviceScreensGroupDao);
    }

    @Override // javax.inject.Provider
    public RoomDeviceScreensGroupDao get() {
        return newInstance(this.daoProvider.get());
    }
}
