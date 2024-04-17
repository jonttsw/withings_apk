package com.withings.screen.repository.ws;

import com.withings.screen.repository.DeviceScreensRemoteRepository;
import com.withings.screen.repository.data.GetDeviceScreensLastUpdate;
import com.withings.screen.repository.data.RoomDeviceScreenContentDao;
import com.withings.screen.repository.data.RoomDeviceScreenDao;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
/* compiled from: GetDeviceScreensContents.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0086B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/withings/screen/repository/ws/GetDeviceScreensContents;", "", "", "deviceId", "", "hasRelevantActiveScreens", "(JLqm0/d;)Ljava/lang/Object;", "Lorg/joda/time/DateTime;", "remoteScreenContentLastUpdate", "", "syncContext", "Lnm0/y;", "invoke", "(JLorg/joda/time/DateTime;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/screen/repository/data/RoomDeviceScreenContentDao;", "roomDeviceScreenContentDao", "Lcom/withings/screen/repository/data/RoomDeviceScreenContentDao;", "Lcom/withings/screen/repository/data/RoomDeviceScreenDao;", "roomDeviceScreenDao", "Lcom/withings/screen/repository/data/RoomDeviceScreenDao;", "Lcom/withings/screen/repository/data/GetDeviceScreensLastUpdate;", "getDeviceScreensLastUpdate", "Lcom/withings/screen/repository/data/GetDeviceScreensLastUpdate;", "Lcom/withings/screen/repository/DeviceScreensRemoteRepository;", "remoteRepository", "Lcom/withings/screen/repository/DeviceScreensRemoteRepository;", "<init>", "(Lcom/withings/screen/repository/data/RoomDeviceScreenContentDao;Lcom/withings/screen/repository/data/RoomDeviceScreenDao;Lcom/withings/screen/repository/data/GetDeviceScreensLastUpdate;Lcom/withings/screen/repository/DeviceScreensRemoteRepository;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class GetDeviceScreensContents {
    private final GetDeviceScreensLastUpdate getDeviceScreensLastUpdate;
    private final DeviceScreensRemoteRepository remoteRepository;
    private final RoomDeviceScreenContentDao roomDeviceScreenContentDao;
    private final RoomDeviceScreenDao roomDeviceScreenDao;

    @Inject
    public GetDeviceScreensContents(RoomDeviceScreenContentDao roomDeviceScreenContentDao, RoomDeviceScreenDao roomDeviceScreenDao, GetDeviceScreensLastUpdate getDeviceScreensLastUpdate, DeviceScreensRemoteRepository remoteRepository) {
        u.j(roomDeviceScreenContentDao, "roomDeviceScreenContentDao");
        u.j(roomDeviceScreenDao, "roomDeviceScreenDao");
        u.j(getDeviceScreensLastUpdate, "getDeviceScreensLastUpdate");
        u.j(remoteRepository, "remoteRepository");
        this.roomDeviceScreenContentDao = roomDeviceScreenContentDao;
        this.roomDeviceScreenDao = roomDeviceScreenDao;
        this.getDeviceScreensLastUpdate = getDeviceScreensLastUpdate;
        this.remoteRepository = remoteRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hasRelevantActiveScreens(long r5, qm0.d<? super java.lang.Boolean> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.withings.screen.repository.ws.GetDeviceScreensContents$hasRelevantActiveScreens$1
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.screen.repository.ws.GetDeviceScreensContents$hasRelevantActiveScreens$1 r0 = (com.withings.screen.repository.ws.GetDeviceScreensContents$hasRelevantActiveScreens$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.screen.repository.ws.GetDeviceScreensContents$hasRelevantActiveScreens$1 r0 = new com.withings.screen.repository.ws.GetDeviceScreensContents$hasRelevantActiveScreens$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            nm0.l.b(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            nm0.l.b(r7)
            com.withings.screen.repository.data.RoomDeviceScreenDao r7 = r4.roomDeviceScreenDao
            kotlinx.coroutines.flow.Flow r5 = r7.get(r5)
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r5, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            java.util.List r7 = (java.util.List) r7
            r5 = 0
            if (r7 == 0) goto L73
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r6 = r7 instanceof java.util.Collection
            if (r6 == 0) goto L56
            r6 = r7
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L56
            goto L73
        L56:
            java.util.Iterator r6 = r7.iterator()
        L5a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L73
            java.lang.Object r7 = r6.next()
            com.withings.screen.repository.data.model.DeviceScreenEntity r7 = (com.withings.screen.repository.data.model.DeviceScreenEntity) r7
            boolean r0 = r7.getActive()
            if (r0 == 0) goto L5a
            int r7 = r7.getScreenSource()
            if (r7 == r3) goto L5a
            goto L74
        L73:
            r3 = r5
        L74:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.screen.repository.ws.GetDeviceScreensContents.hasRelevantActiveScreens(long, qm0.d):java.lang.Object");
    }

    public final Object invoke(long j5, DateTime dateTime, String str, d<? super y> dVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new GetDeviceScreensContents$invoke$2(this, j5, dateTime, str, null), dVar);
        if (withContext == CoroutineSingletons.f76214a) {
            return withContext;
        }
        return y.f85009a;
    }
}
