package com.withings.screen.repository.ws;

import com.withings.screen.repository.DeviceScreensRemoteRepository;
import com.withings.screen.repository.data.RoomDeviceScreenDao;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
import qm0.d;
/* compiled from: SendDeviceScreens.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086B¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/withings/screen/repository/ws/SendDeviceScreens;", "", "", "deviceId", "", "syncContext", "Lnm0/y;", "invoke", "(JLjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/screen/repository/data/RoomDeviceScreenDao;", "roomDeviceScreenDao", "Lcom/withings/screen/repository/data/RoomDeviceScreenDao;", "Lcom/withings/screen/repository/DeviceScreensRemoteRepository;", "remoteRepository", "Lcom/withings/screen/repository/DeviceScreensRemoteRepository;", "<init>", "(Lcom/withings/screen/repository/data/RoomDeviceScreenDao;Lcom/withings/screen/repository/DeviceScreensRemoteRepository;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SendDeviceScreens {
    private final DeviceScreensRemoteRepository remoteRepository;
    private final RoomDeviceScreenDao roomDeviceScreenDao;

    @Inject
    public SendDeviceScreens(RoomDeviceScreenDao roomDeviceScreenDao, DeviceScreensRemoteRepository remoteRepository) {
        u.j(roomDeviceScreenDao, "roomDeviceScreenDao");
        u.j(remoteRepository, "remoteRepository");
        this.roomDeviceScreenDao = roomDeviceScreenDao;
        this.remoteRepository = remoteRepository;
    }

    public final Object invoke(long j5, String str, d<? super y> dVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new SendDeviceScreens$invoke$2(this, j5, str, null), dVar);
        if (withContext == CoroutineSingletons.f76214a) {
            return withContext;
        }
        return y.f85009a;
    }
}
