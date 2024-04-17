package com.withings.screen.di;

import com.withings.screen.repository.DeviceScreensRepository;
import com.withings.screen.repository.RoomDeviceScreensRepository;
import kotlin.Metadata;
/* compiled from: DeviceScreenModule.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0007"}, d2 = {"Lcom/withings/screen/di/DeviceScreenBinderModule;", "", "()V", "bindRepository", "Lcom/withings/screen/repository/DeviceScreensRepository;", "roomDeviceScreensRepository", "Lcom/withings/screen/repository/RoomDeviceScreensRepository;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DeviceScreenBinderModule {
    public abstract DeviceScreensRepository bindRepository(RoomDeviceScreensRepository roomDeviceScreensRepository);
}
