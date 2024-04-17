package com.withings.screen.repository.data;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.withings.screen.repository.data.db.DeviceScreensGroupDao;
import com.withings.screen.repository.data.model.DeviceScreensGroupEntity;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import nm0.y;
import qm0.d;
/* compiled from: RoomDeviceScreensGroupDao.kt */
@Singleton
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\r\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\r\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/withings/screen/repository/data/RoomDeviceScreensGroupDao;", "", "", "Lcom/withings/screen/repository/data/model/DeviceScreensGroupEntity;", "groups", "Lnm0/y;", "insertOrUpdate", "(Ljava/util/List;Lqm0/d;)Ljava/lang/Object;", "", "deviceId", "Lkotlinx/coroutines/flow/Flow;", "get", "(J)Lkotlinx/coroutines/flow/Flow;", CervicalMucusRecord.Appearance.CLEAR, "(JLqm0/d;)Ljava/lang/Object;", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/screen/repository/data/db/DeviceScreensGroupDao;", "dao", "Lcom/withings/screen/repository/data/db/DeviceScreensGroupDao;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "mutableDeviceScreensUpdateEvents", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "deviceScreensUpdateEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "getDeviceScreensUpdateEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "<init>", "(Lcom/withings/screen/repository/data/db/DeviceScreensGroupDao;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RoomDeviceScreensGroupDao {
    private final DeviceScreensGroupDao dao;
    private final SharedFlow<Long> deviceScreensUpdateEvents;
    private final MutableSharedFlow<Long> mutableDeviceScreensUpdateEvents;

    @Inject
    public RoomDeviceScreensGroupDao(DeviceScreensGroupDao dao) {
        u.j(dao, "dao");
        this.dao = dao;
        MutableSharedFlow<Long> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.mutableDeviceScreensUpdateEvents = MutableSharedFlow$default;
        this.deviceScreensUpdateEvents = FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final Object clear(long j5, d<? super y> dVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new RoomDeviceScreensGroupDao$clear$2(this, j5, null), dVar);
        return withContext == CoroutineSingletons.f76214a ? withContext : y.f85009a;
    }

    public final Flow<List<DeviceScreensGroupEntity>> get(long j5) {
        return this.dao.get(j5);
    }

    public final SharedFlow<Long> getDeviceScreensUpdateEvents() {
        return this.deviceScreensUpdateEvents;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078 A[LOOP:1: B:21:0x0072->B:23:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object insertOrUpdate(java.util.List<com.withings.screen.repository.data.model.DeviceScreensGroupEntity> r8, qm0.d<? super nm0.y> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.withings.screen.repository.data.RoomDeviceScreensGroupDao$insertOrUpdate$1
            if (r0 == 0) goto L13
            r0 = r9
            com.withings.screen.repository.data.RoomDeviceScreensGroupDao$insertOrUpdate$1 r0 = (com.withings.screen.repository.data.RoomDeviceScreensGroupDao$insertOrUpdate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.screen.repository.data.RoomDeviceScreensGroupDao$insertOrUpdate$1 r0 = new com.withings.screen.repository.data.RoomDeviceScreensGroupDao$insertOrUpdate$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r8 = r0.L$1
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r2 = r0.L$0
            com.withings.screen.repository.data.RoomDeviceScreensGroupDao r2 = (com.withings.screen.repository.data.RoomDeviceScreensGroupDao) r2
            nm0.l.b(r9)
            goto L95
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            java.lang.Object r8 = r0.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r2 = r0.L$0
            com.withings.screen.repository.data.RoomDeviceScreensGroupDao r2 = (com.withings.screen.repository.data.RoomDeviceScreensGroupDao) r2
            nm0.l.b(r9)
            goto L61
        L46:
            nm0.l.b(r9)
            kotlinx.coroutines.CoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.screen.repository.data.RoomDeviceScreensGroupDao$insertOrUpdate$2 r2 = new com.withings.screen.repository.data.RoomDeviceScreensGroupDao$insertOrUpdate$2
            r5 = 0
            r2.<init>(r7, r8, r5)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r2, r0)
            if (r9 != r1) goto L60
            return r1
        L60:
            r2 = r7
        L61:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.x.y(r8, r4)
            r9.<init>(r4)
            java.util.Iterator r8 = r8.iterator()
        L72:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L8b
            java.lang.Object r4 = r8.next()
            com.withings.screen.repository.data.model.DeviceScreensGroupEntity r4 = (com.withings.screen.repository.data.model.DeviceScreensGroupEntity) r4
            long r4 = r4.getDeviceId()
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            r9.add(r6)
            goto L72
        L8b:
            java.util.List r8 = kotlin.collections.x.B(r9)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L95:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lb9
            java.lang.Object r9 = r8.next()
            java.lang.Number r9 = (java.lang.Number) r9
            long r4 = r9.longValue()
            kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Long> r9 = r2.mutableDeviceScreensUpdateEvents
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            r0.L$0 = r2
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r9 = r9.emit(r6, r0)
            if (r9 != r1) goto L95
            return r1
        Lb9:
            nm0.y r8 = nm0.y.f85009a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.screen.repository.data.RoomDeviceScreensGroupDao.insertOrUpdate(java.util.List, qm0.d):java.lang.Object");
    }

    public final Object clear(d<? super y> dVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new RoomDeviceScreensGroupDao$clear$4(this, null), dVar);
        return withContext == CoroutineSingletons.f76214a ? withContext : y.f85009a;
    }
}
