package com.withings.location.repository;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.location.model.GpsLocation;
import com.withings.location.repository.data.db.GpsLocationDao;
import com.withings.location.repository.data.mapper.GpsLocationEntityMapper;
import com.withings.location.repository.data.model.GpsLocationEntity;
import com.withings.location.repository.ws.SynchronizeLocationVasistas;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
/* compiled from: RoomGpsLocationRepository.kt */
@Singleton
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B!\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b%\u0010&J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\r2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0015\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/withings/location/repository/RoomGpsLocationRepository;", "Lcom/withings/location/repository/GpsLocationRepository;", "", "Lcom/withings/location/model/GpsLocation;", "gpsLocations", "Lnm0/y;", "add", "(Ljava/util/List;Lqm0/d;)Ljava/lang/Object;", "", NavigationArguments.USER_ID, "Lorg/joda/time/DateTime;", "from", "to", "Lkotlinx/coroutines/flow/Flow;", "get", "(JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lkotlinx/coroutines/flow/Flow;", "lastUpdate", "", "maxDaysToSync", "", "syncContext", "synchronize", "(JLorg/joda/time/DateTime;ILjava/lang/String;Lqm0/d;)Ljava/lang/Object;", CervicalMucusRecord.Appearance.CLEAR, "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/location/repository/data/db/GpsLocationDao;", "dao", "Lcom/withings/location/repository/data/db/GpsLocationDao;", "Lcom/withings/location/repository/data/mapper/GpsLocationEntityMapper;", "mapper", "Lcom/withings/location/repository/data/mapper/GpsLocationEntityMapper;", "Lcom/withings/location/repository/ws/SynchronizeLocationVasistas;", "synchronizeLocationVasistas", "Lcom/withings/location/repository/ws/SynchronizeLocationVasistas;", "getAddedGpsLocationsEvents", "()Lkotlinx/coroutines/flow/Flow;", "addedGpsLocationsEvents", "<init>", "(Lcom/withings/location/repository/data/db/GpsLocationDao;Lcom/withings/location/repository/data/mapper/GpsLocationEntityMapper;Lcom/withings/location/repository/ws/SynchronizeLocationVasistas;)V", "Companion", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RoomGpsLocationRepository implements GpsLocationRepository {
    public static final Companion Companion = new Companion(null);
    private static final float DEFAULT_MAX_ACCURACY_METERS = 80.0f;
    private final GpsLocationDao dao;
    private final GpsLocationEntityMapper mapper;
    private final SynchronizeLocationVasistas synchronizeLocationVasistas;

    /* compiled from: RoomGpsLocationRepository.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/location/repository/RoomGpsLocationRepository$Companion;", "", "()V", "DEFAULT_MAX_ACCURACY_METERS", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    @Inject
    public RoomGpsLocationRepository(GpsLocationDao dao, GpsLocationEntityMapper mapper, SynchronizeLocationVasistas synchronizeLocationVasistas) {
        u.j(dao, "dao");
        u.j(mapper, "mapper");
        u.j(synchronizeLocationVasistas, "synchronizeLocationVasistas");
        this.dao = dao;
        this.mapper = mapper;
        this.synchronizeLocationVasistas = synchronizeLocationVasistas;
    }

    @Override // com.withings.location.repository.GpsLocationRepository
    public Object add(List<GpsLocation> list, d<? super y> dVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new RoomGpsLocationRepository$add$2(this, list, null), dVar);
        if (withContext == CoroutineSingletons.f76214a) {
            return withContext;
        }
        return y.f85009a;
    }

    @Override // com.withings.location.repository.GpsLocationRepository
    public Object clear(d<? super y> dVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new RoomGpsLocationRepository$clear$2(this, null), dVar);
        if (withContext == CoroutineSingletons.f76214a) {
            return withContext;
        }
        return y.f85009a;
    }

    @Override // com.withings.location.repository.GpsLocationRepository
    public Flow<List<GpsLocation>> get(long j5, DateTime dateTime, DateTime dateTime2) {
        final Flow<List<GpsLocationEntity>> forUserBetween;
        if (dateTime != null && dateTime2 != null) {
            forUserBetween = this.dao.getForUserBetween(j5, dateTime.getMillis(), dateTime2.getMillis(), DEFAULT_MAX_ACCURACY_METERS);
        } else if (dateTime != null) {
            forUserBetween = this.dao.getForUserAfter(j5, dateTime.getMillis(), DEFAULT_MAX_ACCURACY_METERS);
        } else if (dateTime2 != null) {
            forUserBetween = this.dao.getForUserBefore(j5, dateTime2.getMillis(), DEFAULT_MAX_ACCURACY_METERS);
        } else {
            forUserBetween = this.dao.getForUserBetween(j5, 0L, System.currentTimeMillis(), DEFAULT_MAX_ACCURACY_METERS);
        }
        return new Flow<List<? extends GpsLocation>>() { // from class: com.withings.location.repository.RoomGpsLocationRepository$get$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lnm0/y;", "emit", "(Ljava/lang/Object;Lqm0/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.withings.location.repository.RoomGpsLocationRepository$get$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ RoomGpsLocationRepository this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @e(c = "com.withings.location.repository.RoomGpsLocationRepository$get$$inlined$map$1$2", f = "RoomGpsLocationRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.withings.location.repository.RoomGpsLocationRepository$get$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, RoomGpsLocationRepository roomGpsLocationRepository) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = roomGpsLocationRepository;
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
                        boolean r0 = r8 instanceof com.withings.location.repository.RoomGpsLocationRepository$get$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.withings.location.repository.RoomGpsLocationRepository$get$$inlined$map$1$2$1 r0 = (com.withings.location.repository.RoomGpsLocationRepository$get$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.withings.location.repository.RoomGpsLocationRepository$get$$inlined$map$1$2$1 r0 = new com.withings.location.repository.RoomGpsLocationRepository$get$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        nm0.l.b(r8)
                        goto L6a
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
                        r4 = 10
                        int r4 = kotlin.collections.x.y(r7, r4)
                        r2.<init>(r4)
                        java.util.Iterator r7 = r7.iterator()
                    L47:
                        boolean r4 = r7.hasNext()
                        if (r4 == 0) goto L61
                        java.lang.Object r4 = r7.next()
                        com.withings.location.repository.data.model.GpsLocationEntity r4 = (com.withings.location.repository.data.model.GpsLocationEntity) r4
                        com.withings.location.repository.RoomGpsLocationRepository r5 = r6.this$0
                        com.withings.location.repository.data.mapper.GpsLocationEntityMapper r5 = com.withings.location.repository.RoomGpsLocationRepository.access$getMapper$p(r5)
                        com.withings.location.model.GpsLocation r4 = r5.toGpsLocation(r4)
                        r2.add(r4)
                        goto L47
                    L61:
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r2, r0)
                        if (r7 != r1) goto L6a
                        return r1
                    L6a:
                        nm0.y r7 = nm0.y.f85009a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.withings.location.repository.RoomGpsLocationRepository$get$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, qm0.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends GpsLocation>> flowCollector, d dVar) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), dVar);
                if (collect == CoroutineSingletons.f76214a) {
                    return collect;
                }
                return y.f85009a;
            }
        };
    }

    @Override // com.withings.location.repository.GpsLocationRepository
    public Flow<List<GpsLocation>> getAddedGpsLocationsEvents() {
        final SharedFlow<List<GpsLocationEntity>> addedLocationsEvents = this.dao.getAddedLocationsEvents();
        return new Flow<List<? extends GpsLocation>>() { // from class: com.withings.location.repository.RoomGpsLocationRepository$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lnm0/y;", "emit", "(Ljava/lang/Object;Lqm0/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.withings.location.repository.RoomGpsLocationRepository$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ RoomGpsLocationRepository this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @e(c = "com.withings.location.repository.RoomGpsLocationRepository$special$$inlined$map$1$2", f = "RoomGpsLocationRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.withings.location.repository.RoomGpsLocationRepository$special$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, RoomGpsLocationRepository roomGpsLocationRepository) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = roomGpsLocationRepository;
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
                        boolean r0 = r8 instanceof com.withings.location.repository.RoomGpsLocationRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.withings.location.repository.RoomGpsLocationRepository$special$$inlined$map$1$2$1 r0 = (com.withings.location.repository.RoomGpsLocationRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.withings.location.repository.RoomGpsLocationRepository$special$$inlined$map$1$2$1 r0 = new com.withings.location.repository.RoomGpsLocationRepository$special$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        nm0.l.b(r8)
                        goto L6a
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
                        r4 = 10
                        int r4 = kotlin.collections.x.y(r7, r4)
                        r2.<init>(r4)
                        java.util.Iterator r7 = r7.iterator()
                    L47:
                        boolean r4 = r7.hasNext()
                        if (r4 == 0) goto L61
                        java.lang.Object r4 = r7.next()
                        com.withings.location.repository.data.model.GpsLocationEntity r4 = (com.withings.location.repository.data.model.GpsLocationEntity) r4
                        com.withings.location.repository.RoomGpsLocationRepository r5 = r6.this$0
                        com.withings.location.repository.data.mapper.GpsLocationEntityMapper r5 = com.withings.location.repository.RoomGpsLocationRepository.access$getMapper$p(r5)
                        com.withings.location.model.GpsLocation r4 = r5.toGpsLocation(r4)
                        r2.add(r4)
                        goto L47
                    L61:
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r2, r0)
                        if (r7 != r1) goto L6a
                        return r1
                    L6a:
                        nm0.y r7 = nm0.y.f85009a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.withings.location.repository.RoomGpsLocationRepository$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, qm0.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends GpsLocation>> flowCollector, d dVar) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), dVar);
                if (collect == CoroutineSingletons.f76214a) {
                    return collect;
                }
                return y.f85009a;
            }
        };
    }

    @Override // com.withings.location.repository.GpsLocationRepository
    public Object synchronize(long j5, DateTime dateTime, int i11, String str, d<? super y> dVar) {
        Object invoke = this.synchronizeLocationVasistas.invoke(j5, dateTime, str, i11, dVar);
        if (invoke == CoroutineSingletons.f76214a) {
            return invoke;
        }
        return y.f85009a;
    }
}
