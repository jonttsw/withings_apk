package com.withings.screen.repository;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.screen.ktx.DeviceScreenContentEntityKt;
import com.withings.screen.ktx.DeviceScreenEntityKt;
import com.withings.screen.model.DeviceScreensGroup;
import com.withings.screen.repository.data.RoomDeviceScreenContentDao;
import com.withings.screen.repository.data.RoomDeviceScreenDao;
import com.withings.screen.repository.data.RoomDeviceScreensGroupDao;
import com.withings.screen.repository.data.UpdateScreensStateAndOrder;
import com.withings.screen.repository.data.model.DeviceScreenContentEntity;
import com.withings.screen.repository.data.model.DeviceScreenEntity;
import com.withings.screen.repository.data.model.DeviceScreensGroupEntity;
import com.withings.screen.repository.ws.SynchronizeDeviceScreens;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import nm0.y;
import org.joda.time.DateTime;
import pm0.a;
import qm0.d;
/* compiled from: RoomDeviceScreensRepository.kt */
@Singleton
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b4\u00105J?\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J4\u0010\u001d\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u00100\u001a\b\u0012\u0004\u0012\u00020\f0\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/withings/screen/repository/RoomDeviceScreensRepository;", "Lcom/withings/screen/repository/DeviceScreensRepository;", "", "Lcom/withings/screen/repository/data/model/DeviceScreensGroupEntity;", "groups", "Lcom/withings/screen/repository/data/model/DeviceScreenEntity;", "screens", "Lcom/withings/screen/repository/data/model/DeviceScreenContentEntity;", "contents", "Lcom/withings/screen/model/DeviceScreensGroup;", "map", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "", "deviceId", NavigationArguments.USER_ID, "screenGroups", "Lnm0/y;", "updateOrderAndSelectedScreens", "(JJLjava/util/List;Lqm0/d;)Ljava/lang/Object;", "setSyncedWithDevice", "(JLqm0/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "get", "(JLjava/lang/Long;)Lkotlinx/coroutines/flow/Flow;", "Lorg/joda/time/DateTime;", "screensLastUpdate", "contentsLastUpdate", "", "syncContext", "synchronize", "(JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", CervicalMucusRecord.Appearance.CLEAR, "(Ljava/lang/Long;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/screen/repository/data/RoomDeviceScreenDao;", "roomDeviceScreenDao", "Lcom/withings/screen/repository/data/RoomDeviceScreenDao;", "Lcom/withings/screen/repository/data/RoomDeviceScreenContentDao;", "roomDeviceScreenContentDao", "Lcom/withings/screen/repository/data/RoomDeviceScreenContentDao;", "Lcom/withings/screen/repository/data/RoomDeviceScreensGroupDao;", "roomDeviceScreensGroupDao", "Lcom/withings/screen/repository/data/RoomDeviceScreensGroupDao;", "Lcom/withings/screen/repository/ws/SynchronizeDeviceScreens;", "synchronizeDeviceScreens", "Lcom/withings/screen/repository/ws/SynchronizeDeviceScreens;", "Lcom/withings/screen/repository/data/UpdateScreensStateAndOrder;", "updateScreensStateAndOrder", "Lcom/withings/screen/repository/data/UpdateScreensStateAndOrder;", "deviceScreensUpdateEvents", "Lkotlinx/coroutines/flow/Flow;", "getDeviceScreensUpdateEvents", "()Lkotlinx/coroutines/flow/Flow;", "<init>", "(Lcom/withings/screen/repository/data/RoomDeviceScreenDao;Lcom/withings/screen/repository/data/RoomDeviceScreenContentDao;Lcom/withings/screen/repository/data/RoomDeviceScreensGroupDao;Lcom/withings/screen/repository/ws/SynchronizeDeviceScreens;Lcom/withings/screen/repository/data/UpdateScreensStateAndOrder;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RoomDeviceScreensRepository implements DeviceScreensRepository {
    private final Flow<Long> deviceScreensUpdateEvents;
    private final RoomDeviceScreenContentDao roomDeviceScreenContentDao;
    private final RoomDeviceScreenDao roomDeviceScreenDao;
    private final RoomDeviceScreensGroupDao roomDeviceScreensGroupDao;
    private final SynchronizeDeviceScreens synchronizeDeviceScreens;
    private final UpdateScreensStateAndOrder updateScreensStateAndOrder;

    @Inject
    public RoomDeviceScreensRepository(RoomDeviceScreenDao roomDeviceScreenDao, RoomDeviceScreenContentDao roomDeviceScreenContentDao, RoomDeviceScreensGroupDao roomDeviceScreensGroupDao, SynchronizeDeviceScreens synchronizeDeviceScreens, UpdateScreensStateAndOrder updateScreensStateAndOrder) {
        u.j(roomDeviceScreenDao, "roomDeviceScreenDao");
        u.j(roomDeviceScreenContentDao, "roomDeviceScreenContentDao");
        u.j(roomDeviceScreensGroupDao, "roomDeviceScreensGroupDao");
        u.j(synchronizeDeviceScreens, "synchronizeDeviceScreens");
        u.j(updateScreensStateAndOrder, "updateScreensStateAndOrder");
        this.roomDeviceScreenDao = roomDeviceScreenDao;
        this.roomDeviceScreenContentDao = roomDeviceScreenContentDao;
        this.roomDeviceScreensGroupDao = roomDeviceScreensGroupDao;
        this.synchronizeDeviceScreens = synchronizeDeviceScreens;
        this.updateScreensStateAndOrder = updateScreensStateAndOrder;
        this.deviceScreensUpdateEvents = FlowKt.merge(roomDeviceScreenDao.getDeviceScreensUpdateEvents(), roomDeviceScreenContentDao.getDeviceScreensUpdateEvents(), roomDeviceScreensGroupDao.getDeviceScreensUpdateEvents());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<DeviceScreensGroup> map(List<DeviceScreensGroupEntity> list, List<DeviceScreenEntity> list2, List<DeviceScreenContentEntity> list3) {
        String str;
        Object obj;
        int i11;
        Integer valueOf;
        int i12;
        long j5;
        DateTime now;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list2) {
            Long group = ((DeviceScreenEntity) obj2).getGroup();
            Object obj3 = linkedHashMap.get(group);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(group, obj3);
            }
            ((List) obj3).add(obj2);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Long l5 = (Long) entry.getKey();
            List list4 = (List) entry.getValue();
            Iterator<T> it = list.iterator();
            while (true) {
                str = null;
                if (it.hasNext()) {
                    obj = it.next();
                    long id2 = ((DeviceScreensGroupEntity) obj).getId();
                    if (l5 != null && id2 == l5.longValue()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            DeviceScreensGroupEntity deviceScreensGroupEntity = (DeviceScreensGroupEntity) obj;
            List list5 = list4;
            Iterator it2 = list5.iterator();
            final int i13 = 0;
            if (!it2.hasNext()) {
                valueOf = null;
            } else {
                Integer fixedPosition = ((DeviceScreenEntity) it2.next()).getFixedPosition();
                if (fixedPosition != null) {
                    i11 = fixedPosition.intValue();
                } else {
                    i11 = 0;
                }
                valueOf = Integer.valueOf(i11);
                while (it2.hasNext()) {
                    Integer fixedPosition2 = ((DeviceScreenEntity) it2.next()).getFixedPosition();
                    if (fixedPosition2 != null) {
                        i12 = fixedPosition2.intValue();
                    } else {
                        i12 = 0;
                    }
                    Integer valueOf2 = Integer.valueOf(i12);
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                }
            }
            if (valueOf != null) {
                i13 = valueOf.intValue();
            }
            long j11 = 0;
            if (deviceScreensGroupEntity != null) {
                j5 = deviceScreensGroupEntity.getId();
            } else {
                j5 = 0;
            }
            if (deviceScreensGroupEntity != null) {
                str = deviceScreensGroupEntity.getName();
            }
            String str2 = str;
            List<DeviceScreenEntity> D0 = x.D0(list5, new Comparator() { // from class: com.withings.screen.repository.RoomDeviceScreensRepository$map$lambda$20$$inlined$sortedBy$1
                /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
                @Override // java.util.Comparator
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final int compare(T r5, T r6) {
                    /*
                        r4 = this;
                        com.withings.screen.repository.data.model.DeviceScreenEntity r5 = (com.withings.screen.repository.data.model.DeviceScreenEntity) r5
                        java.lang.Integer r0 = r5.getDefaultRank()
                        r1 = 2147483647(0x7fffffff, float:NaN)
                        r2 = 0
                        if (r0 == 0) goto L11
                    Lc:
                        int r5 = r0.intValue()
                        goto L49
                    L11:
                        java.lang.Integer r0 = r5.getFixedPosition()
                        if (r0 == 0) goto L1e
                        int r3 = r0.intValue()
                        if (r3 <= 0) goto L1e
                        goto L1f
                    L1e:
                        r0 = r2
                    L1f:
                        if (r0 == 0) goto L22
                        goto Lc
                    L22:
                        int r5 = r5.getDisplayOrder()
                        java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                        int r0 = r5.intValue()
                        if (r0 <= 0) goto L31
                        goto L32
                    L31:
                        r5 = r2
                    L32:
                        if (r5 == 0) goto L40
                        int r5 = r5.intValue()
                        int r0 = r1
                        int r5 = r5 + r0
                        java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                        goto L41
                    L40:
                        r5 = r2
                    L41:
                        if (r5 == 0) goto L48
                        int r5 = r5.intValue()
                        goto L49
                    L48:
                        r5 = r1
                    L49:
                        java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                        com.withings.screen.repository.data.model.DeviceScreenEntity r6 = (com.withings.screen.repository.data.model.DeviceScreenEntity) r6
                        java.lang.Integer r0 = r6.getDefaultRank()
                        if (r0 == 0) goto L5a
                    L55:
                        int r1 = r0.intValue()
                        goto L8e
                    L5a:
                        java.lang.Integer r0 = r6.getFixedPosition()
                        if (r0 == 0) goto L67
                        int r3 = r0.intValue()
                        if (r3 <= 0) goto L67
                        goto L68
                    L67:
                        r0 = r2
                    L68:
                        if (r0 == 0) goto L6b
                        goto L55
                    L6b:
                        int r6 = r6.getDisplayOrder()
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                        int r0 = r6.intValue()
                        if (r0 <= 0) goto L7a
                        goto L7b
                    L7a:
                        r6 = r2
                    L7b:
                        if (r6 == 0) goto L88
                        int r6 = r6.intValue()
                        int r0 = r1
                        int r6 = r6 + r0
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
                    L88:
                        if (r2 == 0) goto L8e
                        int r1 = r2.intValue()
                    L8e:
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
                        int r5 = pm0.a.b(r5, r6)
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.withings.screen.repository.RoomDeviceScreensRepository$map$lambda$20$$inlined$sortedBy$1.compare(java.lang.Object, java.lang.Object):int");
                }
            });
            ArrayList arrayList2 = new ArrayList(x.y(D0, 10));
            for (DeviceScreenEntity deviceScreenEntity : D0) {
                ArrayList<DeviceScreenContentEntity> arrayList3 = new ArrayList();
                for (Object obj4 : list3) {
                    if (((DeviceScreenContentEntity) obj4).getScreenWsId() == deviceScreenEntity.getWsId()) {
                        arrayList3.add(obj4);
                    }
                }
                ArrayList arrayList4 = new ArrayList(x.y(arrayList3, 10));
                for (DeviceScreenContentEntity deviceScreenContentEntity : arrayList3) {
                    arrayList4.add(DeviceScreenContentEntityKt.toDeviceScreenContent(deviceScreenContentEntity));
                }
                arrayList2.add(DeviceScreenEntityKt.toDeviceScreen(deviceScreenEntity, arrayList4));
            }
            if (deviceScreensGroupEntity == null || (now = deviceScreensGroupEntity.getModified()) == null) {
                now = DateTime.now();
            }
            DateTime dateTime = now;
            u.g(dateTime);
            if (deviceScreensGroupEntity != null) {
                j11 = deviceScreensGroupEntity.getRank();
            }
            arrayList.add(new DeviceScreensGroup(j5, str2, arrayList2, dateTime, j11));
        }
        return x.D0(arrayList, new Comparator() { // from class: com.withings.screen.repository.RoomDeviceScreensRepository$map$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return a.b(Long.valueOf(((DeviceScreensGroup) t11).getRank()), Long.valueOf(((DeviceScreensGroup) t12).getRank()));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc A[RETURN] */
    @Override // com.withings.screen.repository.DeviceScreensRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object clear(java.lang.Long r8, qm0.d<? super nm0.y> r9) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.screen.repository.RoomDeviceScreensRepository.clear(java.lang.Long, qm0.d):java.lang.Object");
    }

    @Override // com.withings.screen.repository.DeviceScreensRepository
    public Flow<List<DeviceScreensGroup>> get(long j5, Long l5) {
        if (l5 == null) {
            final Flow<List<DeviceScreensGroupEntity>> flow = this.roomDeviceScreensGroupDao.get(j5);
            return FlowKt.combine(new Flow<List<? extends DeviceScreensGroupEntity>>() { // from class: com.withings.screen.repository.RoomDeviceScreensRepository$get$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lnm0/y;", "emit", "(Ljava/lang/Object;Lqm0/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.withings.screen.repository.RoomDeviceScreensRepository$get$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @e(c = "com.withings.screen.repository.RoomDeviceScreensRepository$get$$inlined$map$1$2", f = "RoomDeviceScreensRepository.kt", l = {223}, m = "emit")
                    /* renamed from: com.withings.screen.repository.RoomDeviceScreensRepository$get$$inlined$map$1$2$1  reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass1 extends c {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r7, qm0.d r8) {
                        /*
                            r6 = this;
                            boolean r0 = r8 instanceof com.withings.screen.repository.RoomDeviceScreensRepository$get$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r8
                            com.withings.screen.repository.RoomDeviceScreensRepository$get$$inlined$map$1$2$1 r0 = (com.withings.screen.repository.RoomDeviceScreensRepository$get$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.withings.screen.repository.RoomDeviceScreensRepository$get$$inlined$map$1$2$1 r0 = new com.withings.screen.repository.RoomDeviceScreensRepository$get$$inlined$map$1$2$1
                            r0.<init>(r8)
                        L18:
                            java.lang.Object r8 = r0.result
                            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            nm0.l.b(r8)
                            goto L61
                        L27:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r8)
                            throw r7
                        L2f:
                            nm0.l.b(r8)
                            kotlinx.coroutines.flow.FlowCollector r8 = r6.$this_unsafeFlow
                            java.util.List r7 = (java.util.List) r7
                            java.lang.Iterable r7 = (java.lang.Iterable) r7
                            java.util.ArrayList r2 = new java.util.ArrayList
                            r2.<init>()
                            java.util.Iterator r7 = r7.iterator()
                        L41:
                            boolean r4 = r7.hasNext()
                            if (r4 == 0) goto L58
                            java.lang.Object r4 = r7.next()
                            r5 = r4
                            com.withings.screen.repository.data.model.DeviceScreensGroupEntity r5 = (com.withings.screen.repository.data.model.DeviceScreensGroupEntity) r5
                            boolean r5 = r5.getDeleted()
                            if (r5 != 0) goto L41
                            r2.add(r4)
                            goto L41
                        L58:
                            r0.label = r3
                            java.lang.Object r7 = r8.emit(r2, r0)
                            if (r7 != r1) goto L61
                            return r1
                        L61:
                            nm0.y r7 = nm0.y.f85009a
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.withings.screen.repository.RoomDeviceScreensRepository$get$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, qm0.d):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends DeviceScreensGroupEntity>> flowCollector, d dVar) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), dVar);
                    if (collect == CoroutineSingletons.f76214a) {
                        return collect;
                    }
                    return y.f85009a;
                }
            }, this.roomDeviceScreenDao.get(j5), this.roomDeviceScreenContentDao.get(j5), new RoomDeviceScreensRepository$get$2(this, null));
        }
        final Flow<List<DeviceScreensGroupEntity>> flow2 = this.roomDeviceScreensGroupDao.get(j5);
        return FlowKt.combine(new Flow<List<? extends DeviceScreensGroupEntity>>() { // from class: com.withings.screen.repository.RoomDeviceScreensRepository$get$$inlined$map$2

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lnm0/y;", "emit", "(Ljava/lang/Object;Lqm0/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.withings.screen.repository.RoomDeviceScreensRepository$get$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @e(c = "com.withings.screen.repository.RoomDeviceScreensRepository$get$$inlined$map$2$2", f = "RoomDeviceScreensRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.withings.screen.repository.RoomDeviceScreensRepository$get$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, qm0.d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.withings.screen.repository.RoomDeviceScreensRepository$get$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.withings.screen.repository.RoomDeviceScreensRepository$get$$inlined$map$2$2$1 r0 = (com.withings.screen.repository.RoomDeviceScreensRepository$get$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.withings.screen.repository.RoomDeviceScreensRepository$get$$inlined$map$2$2$1 r0 = new com.withings.screen.repository.RoomDeviceScreensRepository$get$$inlined$map$2$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        nm0.l.b(r8)
                        goto L61
                    L27:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L2f:
                        nm0.l.b(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.$this_unsafeFlow
                        java.util.List r7 = (java.util.List) r7
                        java.lang.Iterable r7 = (java.lang.Iterable) r7
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>()
                        java.util.Iterator r7 = r7.iterator()
                    L41:
                        boolean r4 = r7.hasNext()
                        if (r4 == 0) goto L58
                        java.lang.Object r4 = r7.next()
                        r5 = r4
                        com.withings.screen.repository.data.model.DeviceScreensGroupEntity r5 = (com.withings.screen.repository.data.model.DeviceScreensGroupEntity) r5
                        boolean r5 = r5.getDeleted()
                        if (r5 != 0) goto L41
                        r2.add(r4)
                        goto L41
                    L58:
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r2, r0)
                        if (r7 != r1) goto L61
                        return r1
                    L61:
                        nm0.y r7 = nm0.y.f85009a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.withings.screen.repository.RoomDeviceScreensRepository$get$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, qm0.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends DeviceScreensGroupEntity>> flowCollector, d dVar) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), dVar);
                if (collect == CoroutineSingletons.f76214a) {
                    return collect;
                }
                return y.f85009a;
            }
        }, this.roomDeviceScreenDao.get(l5.longValue(), j5), this.roomDeviceScreenContentDao.get(l5.longValue(), j5), new RoomDeviceScreensRepository$get$4(this, null));
    }

    @Override // com.withings.screen.repository.DeviceScreensRepository
    public Flow<Long> getDeviceScreensUpdateEvents() {
        return this.deviceScreensUpdateEvents;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e A[LOOP:0: B:40:0x0118->B:42:0x011e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0152 A[RETURN] */
    @Override // com.withings.screen.repository.DeviceScreensRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object setSyncedWithDevice(long r47, qm0.d<? super nm0.y> r49) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.screen.repository.RoomDeviceScreensRepository.setSyncedWithDevice(long, qm0.d):java.lang.Object");
    }

    @Override // com.withings.screen.repository.DeviceScreensRepository
    public Object synchronize(long j5, DateTime dateTime, DateTime dateTime2, String str, d<? super y> dVar) {
        Object invoke = this.synchronizeDeviceScreens.invoke(j5, dateTime, dateTime2, str, dVar);
        if (invoke == CoroutineSingletons.f76214a) {
            return invoke;
        }
        return y.f85009a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|8|(1:(1:(1:(7:13|14|15|16|(1:18)|19|20)(2:23|24))(8:25|26|(1:28)|15|16|(0)|19|20))(1:29))(2:45|(1:47)(1:48))|30|(5:33|(2:36|34)|37|38|31)|39|(2:41|(1:43)(6:44|26|(0)|15|16|(0)))|19|20))|51|6|7|8|(0)(0)|30|(1:31)|39|(0)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0100, code lost:
        r0 = nm0.l.a(r0);
        r2 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.withings.screen.repository.RoomDeviceScreensRepository] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    @Override // com.withings.screen.repository.DeviceScreensRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateOrderAndSelectedScreens(long r16, long r18, java.util.List<com.withings.screen.model.DeviceScreensGroup> r20, qm0.d<? super nm0.y> r21) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.screen.repository.RoomDeviceScreensRepository.updateOrderAndSelectedScreens(long, long, java.util.List, qm0.d):java.lang.Object");
    }
}
