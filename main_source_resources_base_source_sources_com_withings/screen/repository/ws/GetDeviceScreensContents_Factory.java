package com.withings.screen.repository.ws;

import com.withings.screen.repository.DeviceScreensRemoteRepository;
import com.withings.screen.repository.data.GetDeviceScreensLastUpdate;
import com.withings.screen.repository.data.RoomDeviceScreenContentDao;
import com.withings.screen.repository.data.RoomDeviceScreenDao;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class GetDeviceScreensContents_Factory implements b<GetDeviceScreensContents> {
    private final Provider<GetDeviceScreensLastUpdate> getDeviceScreensLastUpdateProvider;
    private final Provider<DeviceScreensRemoteRepository> remoteRepositoryProvider;
    private final Provider<RoomDeviceScreenContentDao> roomDeviceScreenContentDaoProvider;
    private final Provider<RoomDeviceScreenDao> roomDeviceScreenDaoProvider;

    public GetDeviceScreensContents_Factory(Provider<RoomDeviceScreenContentDao> provider, Provider<RoomDeviceScreenDao> provider2, Provider<GetDeviceScreensLastUpdate> provider3, Provider<DeviceScreensRemoteRepository> provider4) {
        this.roomDeviceScreenContentDaoProvider = provider;
        this.roomDeviceScreenDaoProvider = provider2;
        this.getDeviceScreensLastUpdateProvider = provider3;
        this.remoteRepositoryProvider = provider4;
    }

    public static GetDeviceScreensContents_Factory create(Provider<RoomDeviceScreenContentDao> provider, Provider<RoomDeviceScreenDao> provider2, Provider<GetDeviceScreensLastUpdate> provider3, Provider<DeviceScreensRemoteRepository> provider4) {
        return new GetDeviceScreensContents_Factory(provider, provider2, provider3, provider4);
    }

    public static GetDeviceScreensContents newInstance(RoomDeviceScreenContentDao roomDeviceScreenContentDao, RoomDeviceScreenDao roomDeviceScreenDao, GetDeviceScreensLastUpdate getDeviceScreensLastUpdate, DeviceScreensRemoteRepository deviceScreensRemoteRepository) {
        return new GetDeviceScreensContents(roomDeviceScreenContentDao, roomDeviceScreenDao, getDeviceScreensLastUpdate, deviceScreensRemoteRepository);
    }

    @Override // javax.inject.Provider
    public GetDeviceScreensContents get() {
        return newInstance(this.roomDeviceScreenContentDaoProvider.get(), this.roomDeviceScreenDaoProvider.get(), this.getDeviceScreensLastUpdateProvider.get(), this.remoteRepositoryProvider.get());
    }
}
