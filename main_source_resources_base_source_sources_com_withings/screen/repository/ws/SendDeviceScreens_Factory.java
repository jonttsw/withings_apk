package com.withings.screen.repository.ws;

import com.withings.screen.repository.DeviceScreensRemoteRepository;
import com.withings.screen.repository.data.RoomDeviceScreenDao;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class SendDeviceScreens_Factory implements b<SendDeviceScreens> {
    private final Provider<DeviceScreensRemoteRepository> remoteRepositoryProvider;
    private final Provider<RoomDeviceScreenDao> roomDeviceScreenDaoProvider;

    public SendDeviceScreens_Factory(Provider<RoomDeviceScreenDao> provider, Provider<DeviceScreensRemoteRepository> provider2) {
        this.roomDeviceScreenDaoProvider = provider;
        this.remoteRepositoryProvider = provider2;
    }

    public static SendDeviceScreens_Factory create(Provider<RoomDeviceScreenDao> provider, Provider<DeviceScreensRemoteRepository> provider2) {
        return new SendDeviceScreens_Factory(provider, provider2);
    }

    public static SendDeviceScreens newInstance(RoomDeviceScreenDao roomDeviceScreenDao, DeviceScreensRemoteRepository deviceScreensRemoteRepository) {
        return new SendDeviceScreens(roomDeviceScreenDao, deviceScreensRemoteRepository);
    }

    @Override // javax.inject.Provider
    public SendDeviceScreens get() {
        return newInstance(this.roomDeviceScreenDaoProvider.get(), this.remoteRepositoryProvider.get());
    }
}
