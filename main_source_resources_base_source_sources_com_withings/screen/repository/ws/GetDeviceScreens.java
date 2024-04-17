package com.withings.screen.repository.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.screen.repository.DeviceScreensRemoteRepository;
import com.withings.screen.repository.data.GetDeviceScreensLastUpdate;
import com.withings.screen.repository.data.RoomDeviceScreenContentDao;
import com.withings.screen.repository.data.RoomDeviceScreenDao;
import com.withings.screen.repository.data.RoomDeviceScreensGroupDao;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
/* compiled from: GetDeviceScreens.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J.\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082@¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/withings/screen/repository/ws/GetDeviceScreens;", "", "", NavigationArguments.USER_ID, "deviceId", "", "Lcom/withings/screen/model/WsDeviceScreen;", "wsScreens", "Lnm0/y;", "storeDeviceScreensAndContents", "(JJLjava/util/List;Lqm0/d;)Ljava/lang/Object;", "Lorg/joda/time/DateTime;", "remoteScreenLastUpdate", "", "syncContext", "invoke", "(JLorg/joda/time/DateTime;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/screen/repository/data/RoomDeviceScreenDao;", "roomDeviceScreenDao", "Lcom/withings/screen/repository/data/RoomDeviceScreenDao;", "Lcom/withings/screen/repository/data/RoomDeviceScreenContentDao;", "roomDeviceScreenContentDao", "Lcom/withings/screen/repository/data/RoomDeviceScreenContentDao;", "Lcom/withings/screen/repository/data/RoomDeviceScreensGroupDao;", "deviceScreensGroupDao", "Lcom/withings/screen/repository/data/RoomDeviceScreensGroupDao;", "Lcom/withings/screen/repository/data/GetDeviceScreensLastUpdate;", "getDeviceScreensLastUpdate", "Lcom/withings/screen/repository/data/GetDeviceScreensLastUpdate;", "Lcom/withings/screen/repository/DeviceScreensRemoteRepository;", "remoteRepository", "Lcom/withings/screen/repository/DeviceScreensRemoteRepository;", "<init>", "(Lcom/withings/screen/repository/data/RoomDeviceScreenDao;Lcom/withings/screen/repository/data/RoomDeviceScreenContentDao;Lcom/withings/screen/repository/data/RoomDeviceScreensGroupDao;Lcom/withings/screen/repository/data/GetDeviceScreensLastUpdate;Lcom/withings/screen/repository/DeviceScreensRemoteRepository;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class GetDeviceScreens {
    private final RoomDeviceScreensGroupDao deviceScreensGroupDao;
    private final GetDeviceScreensLastUpdate getDeviceScreensLastUpdate;
    private final DeviceScreensRemoteRepository remoteRepository;
    private final RoomDeviceScreenContentDao roomDeviceScreenContentDao;
    private final RoomDeviceScreenDao roomDeviceScreenDao;

    @Inject
    public GetDeviceScreens(RoomDeviceScreenDao roomDeviceScreenDao, RoomDeviceScreenContentDao roomDeviceScreenContentDao, RoomDeviceScreensGroupDao deviceScreensGroupDao, GetDeviceScreensLastUpdate getDeviceScreensLastUpdate, DeviceScreensRemoteRepository remoteRepository) {
        u.j(roomDeviceScreenDao, "roomDeviceScreenDao");
        u.j(roomDeviceScreenContentDao, "roomDeviceScreenContentDao");
        u.j(deviceScreensGroupDao, "deviceScreensGroupDao");
        u.j(getDeviceScreensLastUpdate, "getDeviceScreensLastUpdate");
        u.j(remoteRepository, "remoteRepository");
        this.roomDeviceScreenDao = roomDeviceScreenDao;
        this.roomDeviceScreenContentDao = roomDeviceScreenContentDao;
        this.deviceScreensGroupDao = deviceScreensGroupDao;
        this.getDeviceScreensLastUpdate = getDeviceScreensLastUpdate;
        this.remoteRepository = remoteRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019d A[RETURN] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object storeDeviceScreensAndContents(long r41, long r43, java.util.List<com.withings.screen.model.WsDeviceScreen> r45, qm0.d<? super nm0.y> r46) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.screen.repository.ws.GetDeviceScreens.storeDeviceScreensAndContents(long, long, java.util.List, qm0.d):java.lang.Object");
    }

    public final Object invoke(long j5, DateTime dateTime, String str, d<? super y> dVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new GetDeviceScreens$invoke$2(this, j5, dateTime, str, null), dVar);
        if (withContext == CoroutineSingletons.f76214a) {
            return withContext;
        }
        return y.f85009a;
    }
}
