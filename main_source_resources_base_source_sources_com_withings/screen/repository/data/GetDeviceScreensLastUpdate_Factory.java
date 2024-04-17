package com.withings.screen.repository.data;

import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class GetDeviceScreensLastUpdate_Factory implements b<GetDeviceScreensLastUpdate> {
    private final Provider<RoomDeviceScreenContentDao> roomDeviceScreenContentDaoProvider;
    private final Provider<RoomDeviceScreenDao> roomDeviceScreenDaoProvider;
    private final Provider<RoomDeviceScreensGroupDao> roomDeviceScreensGroupDaoProvider;

    public GetDeviceScreensLastUpdate_Factory(Provider<RoomDeviceScreenDao> provider, Provider<RoomDeviceScreenContentDao> provider2, Provider<RoomDeviceScreensGroupDao> provider3) {
        this.roomDeviceScreenDaoProvider = provider;
        this.roomDeviceScreenContentDaoProvider = provider2;
        this.roomDeviceScreensGroupDaoProvider = provider3;
    }

    public static GetDeviceScreensLastUpdate_Factory create(Provider<RoomDeviceScreenDao> provider, Provider<RoomDeviceScreenContentDao> provider2, Provider<RoomDeviceScreensGroupDao> provider3) {
        return new GetDeviceScreensLastUpdate_Factory(provider, provider2, provider3);
    }

    public static GetDeviceScreensLastUpdate newInstance(RoomDeviceScreenDao roomDeviceScreenDao, RoomDeviceScreenContentDao roomDeviceScreenContentDao, RoomDeviceScreensGroupDao roomDeviceScreensGroupDao) {
        return new GetDeviceScreensLastUpdate(roomDeviceScreenDao, roomDeviceScreenContentDao, roomDeviceScreensGroupDao);
    }

    @Override // javax.inject.Provider
    public GetDeviceScreensLastUpdate get() {
        return newInstance(this.roomDeviceScreenDaoProvider.get(), this.roomDeviceScreenContentDaoProvider.get(), this.roomDeviceScreensGroupDaoProvider.get());
    }
}
