package com.withings.screen.repository.data;

import com.withings.screen.repository.data.db.DeviceScreenDao;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class RoomDeviceScreenDao_Factory implements b<RoomDeviceScreenDao> {
    private final Provider<DeviceScreenDao> daoProvider;

    public RoomDeviceScreenDao_Factory(Provider<DeviceScreenDao> provider) {
        this.daoProvider = provider;
    }

    public static RoomDeviceScreenDao_Factory create(Provider<DeviceScreenDao> provider) {
        return new RoomDeviceScreenDao_Factory(provider);
    }

    public static RoomDeviceScreenDao newInstance(DeviceScreenDao deviceScreenDao) {
        return new RoomDeviceScreenDao(deviceScreenDao);
    }

    @Override // javax.inject.Provider
    public RoomDeviceScreenDao get() {
        return newInstance(this.daoProvider.get());
    }
}
