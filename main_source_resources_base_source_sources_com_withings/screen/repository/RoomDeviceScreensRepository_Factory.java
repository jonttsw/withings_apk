package com.withings.screen.repository;

import com.withings.screen.repository.data.RoomDeviceScreenContentDao;
import com.withings.screen.repository.data.RoomDeviceScreenDao;
import com.withings.screen.repository.data.RoomDeviceScreensGroupDao;
import com.withings.screen.repository.data.UpdateScreensStateAndOrder;
import com.withings.screen.repository.ws.SynchronizeDeviceScreens;
import dagger.internal.b;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class RoomDeviceScreensRepository_Factory implements b<RoomDeviceScreensRepository> {
    private final Provider<RoomDeviceScreenContentDao> roomDeviceScreenContentDaoProvider;
    private final Provider<RoomDeviceScreenDao> roomDeviceScreenDaoProvider;
    private final Provider<RoomDeviceScreensGroupDao> roomDeviceScreensGroupDaoProvider;
    private final Provider<SynchronizeDeviceScreens> synchronizeDeviceScreensProvider;
    private final Provider<UpdateScreensStateAndOrder> updateScreensStateAndOrderProvider;

    public RoomDeviceScreensRepository_Factory(Provider<RoomDeviceScreenDao> provider, Provider<RoomDeviceScreenContentDao> provider2, Provider<RoomDeviceScreensGroupDao> provider3, Provider<SynchronizeDeviceScreens> provider4, Provider<UpdateScreensStateAndOrder> provider5) {
        this.roomDeviceScreenDaoProvider = provider;
        this.roomDeviceScreenContentDaoProvider = provider2;
        this.roomDeviceScreensGroupDaoProvider = provider3;
        this.synchronizeDeviceScreensProvider = provider4;
        this.updateScreensStateAndOrderProvider = provider5;
    }

    public static RoomDeviceScreensRepository_Factory create(Provider<RoomDeviceScreenDao> provider, Provider<RoomDeviceScreenContentDao> provider2, Provider<RoomDeviceScreensGroupDao> provider3, Provider<SynchronizeDeviceScreens> provider4, Provider<UpdateScreensStateAndOrder> provider5) {
        return new RoomDeviceScreensRepository_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static RoomDeviceScreensRepository newInstance(RoomDeviceScreenDao roomDeviceScreenDao, RoomDeviceScreenContentDao roomDeviceScreenContentDao, RoomDeviceScreensGroupDao roomDeviceScreensGroupDao, SynchronizeDeviceScreens synchronizeDeviceScreens, UpdateScreensStateAndOrder updateScreensStateAndOrder) {
        return new RoomDeviceScreensRepository(roomDeviceScreenDao, roomDeviceScreenContentDao, roomDeviceScreensGroupDao, synchronizeDeviceScreens, updateScreensStateAndOrder);
    }

    @Override // javax.inject.Provider
    public RoomDeviceScreensRepository get() {
        return newInstance(this.roomDeviceScreenDaoProvider.get(), this.roomDeviceScreenContentDaoProvider.get(), this.roomDeviceScreensGroupDaoProvider.get(), this.synchronizeDeviceScreensProvider.get(), this.updateScreensStateAndOrderProvider.get());
    }
}
