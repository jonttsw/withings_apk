package com.withings.screen.repository.ws;

import com.withings.screen.repository.DeviceScreensRemoteRepository;
import com.withings.screen.repository.data.GetDeviceScreensLastUpdate;
import com.withings.screen.repository.data.RoomDeviceScreenContentDao;
import com.withings.screen.repository.data.RoomDeviceScreenDao;
import com.withings.screen.repository.data.RoomDeviceScreensGroupDao;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class GetDeviceScreens_Factory implements b<GetDeviceScreens> {
    private final Provider<RoomDeviceScreensGroupDao> deviceScreensGroupDaoProvider;
    private final Provider<GetDeviceScreensLastUpdate> getDeviceScreensLastUpdateProvider;
    private final Provider<DeviceScreensRemoteRepository> remoteRepositoryProvider;
    private final Provider<RoomDeviceScreenContentDao> roomDeviceScreenContentDaoProvider;
    private final Provider<RoomDeviceScreenDao> roomDeviceScreenDaoProvider;

    public GetDeviceScreens_Factory(Provider<RoomDeviceScreenDao> provider, Provider<RoomDeviceScreenContentDao> provider2, Provider<RoomDeviceScreensGroupDao> provider3, Provider<GetDeviceScreensLastUpdate> provider4, Provider<DeviceScreensRemoteRepository> provider5) {
        this.roomDeviceScreenDaoProvider = provider;
        this.roomDeviceScreenContentDaoProvider = provider2;
        this.deviceScreensGroupDaoProvider = provider3;
        this.getDeviceScreensLastUpdateProvider = provider4;
        this.remoteRepositoryProvider = provider5;
    }

    public static GetDeviceScreens_Factory create(Provider<RoomDeviceScreenDao> provider, Provider<RoomDeviceScreenContentDao> provider2, Provider<RoomDeviceScreensGroupDao> provider3, Provider<GetDeviceScreensLastUpdate> provider4, Provider<DeviceScreensRemoteRepository> provider5) {
        return new GetDeviceScreens_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static GetDeviceScreens newInstance(RoomDeviceScreenDao roomDeviceScreenDao, RoomDeviceScreenContentDao roomDeviceScreenContentDao, RoomDeviceScreensGroupDao roomDeviceScreensGroupDao, GetDeviceScreensLastUpdate getDeviceScreensLastUpdate, DeviceScreensRemoteRepository deviceScreensRemoteRepository) {
        return new GetDeviceScreens(roomDeviceScreenDao, roomDeviceScreenContentDao, roomDeviceScreensGroupDao, getDeviceScreensLastUpdate, deviceScreensRemoteRepository);
    }

    @Override // javax.inject.Provider
    public GetDeviceScreens get() {
        return newInstance(this.roomDeviceScreenDaoProvider.get(), this.roomDeviceScreenContentDaoProvider.get(), this.deviceScreensGroupDaoProvider.get(), this.getDeviceScreensLastUpdateProvider.get(), this.remoteRepositoryProvider.get());
    }
}
