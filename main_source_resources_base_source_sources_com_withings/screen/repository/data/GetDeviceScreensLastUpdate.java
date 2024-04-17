package com.withings.screen.repository.data;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: GetDeviceScreensLastUpdate.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0007\u0010\u0006J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/withings/screen/repository/data/GetDeviceScreensLastUpdate;", "", "", "deviceId", "Lorg/joda/time/DateTime;", "getDeviceScreenLocalLastUpdate", "(JLqm0/d;)Ljava/lang/Object;", "getDeviceScreenContentLocalLastUpdate", "getDeviceScreensGroupLocalLastUpdate", "Lcom/withings/screen/repository/data/RoomDeviceScreenDao;", "roomDeviceScreenDao", "Lcom/withings/screen/repository/data/RoomDeviceScreenDao;", "Lcom/withings/screen/repository/data/RoomDeviceScreenContentDao;", "roomDeviceScreenContentDao", "Lcom/withings/screen/repository/data/RoomDeviceScreenContentDao;", "Lcom/withings/screen/repository/data/RoomDeviceScreensGroupDao;", "roomDeviceScreensGroupDao", "Lcom/withings/screen/repository/data/RoomDeviceScreensGroupDao;", "<init>", "(Lcom/withings/screen/repository/data/RoomDeviceScreenDao;Lcom/withings/screen/repository/data/RoomDeviceScreenContentDao;Lcom/withings/screen/repository/data/RoomDeviceScreensGroupDao;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class GetDeviceScreensLastUpdate {
    private final RoomDeviceScreenContentDao roomDeviceScreenContentDao;
    private final RoomDeviceScreenDao roomDeviceScreenDao;
    private final RoomDeviceScreensGroupDao roomDeviceScreensGroupDao;

    @Inject
    public GetDeviceScreensLastUpdate(RoomDeviceScreenDao roomDeviceScreenDao, RoomDeviceScreenContentDao roomDeviceScreenContentDao, RoomDeviceScreensGroupDao roomDeviceScreensGroupDao) {
        u.j(roomDeviceScreenDao, "roomDeviceScreenDao");
        u.j(roomDeviceScreenContentDao, "roomDeviceScreenContentDao");
        u.j(roomDeviceScreensGroupDao, "roomDeviceScreensGroupDao");
        this.roomDeviceScreenDao = roomDeviceScreenDao;
        this.roomDeviceScreenContentDao = roomDeviceScreenContentDao;
        this.roomDeviceScreensGroupDao = roomDeviceScreensGroupDao;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getDeviceScreenContentLocalLastUpdate(long r5, qm0.d<? super org.joda.time.DateTime> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.withings.screen.repository.data.GetDeviceScreensLastUpdate$getDeviceScreenContentLocalLastUpdate$1
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.screen.repository.data.GetDeviceScreensLastUpdate$getDeviceScreenContentLocalLastUpdate$1 r0 = (com.withings.screen.repository.data.GetDeviceScreensLastUpdate$getDeviceScreenContentLocalLastUpdate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.screen.repository.data.GetDeviceScreensLastUpdate$getDeviceScreenContentLocalLastUpdate$1 r0 = new com.withings.screen.repository.data.GetDeviceScreensLastUpdate$getDeviceScreenContentLocalLastUpdate$1
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
            com.withings.screen.repository.data.RoomDeviceScreenContentDao r7 = r4.roomDeviceScreenContentDao
            kotlinx.coroutines.flow.Flow r5 = r7.get(r5)
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r5, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            java.util.List r7 = (java.util.List) r7
            r5 = 0
            if (r7 == 0) goto L8c
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r6 = r7.iterator()
            boolean r7 = r6.hasNext()
            if (r7 != 0) goto L54
            r7 = r5
            goto L80
        L54:
            java.lang.Object r7 = r6.next()
            com.withings.screen.repository.data.model.DeviceScreenContentEntity r7 = (com.withings.screen.repository.data.model.DeviceScreenContentEntity) r7
            long r0 = r7.getModified()
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r0)
        L63:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r0 = r6.next()
            com.withings.screen.repository.data.model.DeviceScreenContentEntity r0 = (com.withings.screen.repository.data.model.DeviceScreenContentEntity) r0
            long r0 = r0.getModified()
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            int r0 = r7.compareTo(r2)
            if (r0 >= 0) goto L63
            r7 = r2
            goto L63
        L80:
            if (r7 == 0) goto L8c
            long r5 = r7.longValue()
            org.joda.time.DateTime r7 = new org.joda.time.DateTime
            r7.<init>(r5)
            r5 = r7
        L8c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.screen.repository.data.GetDeviceScreensLastUpdate.getDeviceScreenContentLocalLastUpdate(long, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getDeviceScreenLocalLastUpdate(long r5, qm0.d<? super org.joda.time.DateTime> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.withings.screen.repository.data.GetDeviceScreensLastUpdate$getDeviceScreenLocalLastUpdate$1
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.screen.repository.data.GetDeviceScreensLastUpdate$getDeviceScreenLocalLastUpdate$1 r0 = (com.withings.screen.repository.data.GetDeviceScreensLastUpdate$getDeviceScreenLocalLastUpdate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.screen.repository.data.GetDeviceScreensLastUpdate$getDeviceScreenLocalLastUpdate$1 r0 = new com.withings.screen.repository.data.GetDeviceScreensLastUpdate$getDeviceScreenLocalLastUpdate$1
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
            if (r7 == 0) goto L8c
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r6 = r7.iterator()
            boolean r7 = r6.hasNext()
            if (r7 != 0) goto L54
            r7 = r5
            goto L80
        L54:
            java.lang.Object r7 = r6.next()
            com.withings.screen.repository.data.model.DeviceScreenEntity r7 = (com.withings.screen.repository.data.model.DeviceScreenEntity) r7
            long r0 = r7.getModified()
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r0)
        L63:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r0 = r6.next()
            com.withings.screen.repository.data.model.DeviceScreenEntity r0 = (com.withings.screen.repository.data.model.DeviceScreenEntity) r0
            long r0 = r0.getModified()
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            int r0 = r7.compareTo(r2)
            if (r0 >= 0) goto L63
            r7 = r2
            goto L63
        L80:
            if (r7 == 0) goto L8c
            long r5 = r7.longValue()
            org.joda.time.DateTime r7 = new org.joda.time.DateTime
            r7.<init>(r5)
            r5 = r7
        L8c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.screen.repository.data.GetDeviceScreensLastUpdate.getDeviceScreenLocalLastUpdate(long, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getDeviceScreensGroupLocalLastUpdate(long r5, qm0.d<? super org.joda.time.DateTime> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.withings.screen.repository.data.GetDeviceScreensLastUpdate$getDeviceScreensGroupLocalLastUpdate$1
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.screen.repository.data.GetDeviceScreensLastUpdate$getDeviceScreensGroupLocalLastUpdate$1 r0 = (com.withings.screen.repository.data.GetDeviceScreensLastUpdate$getDeviceScreensGroupLocalLastUpdate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.screen.repository.data.GetDeviceScreensLastUpdate$getDeviceScreensGroupLocalLastUpdate$1 r0 = new com.withings.screen.repository.data.GetDeviceScreensLastUpdate$getDeviceScreensGroupLocalLastUpdate$1
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
            com.withings.screen.repository.data.RoomDeviceScreensGroupDao r7 = r4.roomDeviceScreensGroupDao
            kotlinx.coroutines.flow.Flow r5 = r7.get(r5)
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r5, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            java.util.List r7 = (java.util.List) r7
            r5 = 0
            if (r7 == 0) goto L75
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r6 = r7.iterator()
            boolean r7 = r6.hasNext()
            if (r7 != 0) goto L53
            goto L75
        L53:
            java.lang.Object r5 = r6.next()
            com.withings.screen.repository.data.model.DeviceScreensGroupEntity r5 = (com.withings.screen.repository.data.model.DeviceScreensGroupEntity) r5
            org.joda.time.DateTime r5 = r5.getModified()
        L5d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L75
            java.lang.Object r7 = r6.next()
            com.withings.screen.repository.data.model.DeviceScreensGroupEntity r7 = (com.withings.screen.repository.data.model.DeviceScreensGroupEntity) r7
            org.joda.time.DateTime r7 = r7.getModified()
            int r0 = r5.compareTo(r7)
            if (r0 >= 0) goto L5d
            r5 = r7
            goto L5d
        L75:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.screen.repository.data.GetDeviceScreensLastUpdate.getDeviceScreensGroupLocalLastUpdate(long, qm0.d):java.lang.Object");
    }
}
