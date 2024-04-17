package com.withings.features.platform.model;

import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e1;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.library.authentication.api.ConstantsWs;
import e2.s;
import e2.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
import u70.h;
/* compiled from: RoomPlatformFeatureRepository.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0011\b\u0002\u0012\u0006\u00108\u001a\u000207¢\u0006\u0004\b=\u0010>J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00102\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00132\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u0016\u0010\u000bJ\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\u0010\r\u001a\u00020\u001f\"\u00020\fH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\u00020\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b#\u0010$J'\u0010)\u001a\u00020(2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*J'\u0010+\u001a\u00020(2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b+\u0010*J\u001d\u0010-\u001a\u00020\u00042\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b-\u0010$J\u0017\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b1\u0010$J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0004H\u0016¢\u0006\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/withings/features/platform/model/RoomPlatformFeatureRepository;", "Lcom/withings/features/platform/model/PlatformFeatureRepository;", "Lcom/withings/features/platform/model/PlatformFeatureRepository$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lnm0/y;", "registerListener", "(Lcom/withings/features/platform/model/PlatformFeatureRepository$Listener;)V", "unregisterListener", "", "Lcom/withings/features/platform/model/PlatformFeature;", "getNotSyncedFeatures", "()Ljava/util/List;", "", "featureId", "getFeature", "(I)Lcom/withings/features/platform/model/PlatformFeature;", "Lkotlinx/coroutines/flow/Flow;", "getFeatureAsFlow", "(I)Lkotlinx/coroutines/flow/Flow;", "Landroidx/lifecycle/LiveData;", "getFeatureLiveData", "(I)Landroidx/lifecycle/LiveData;", "getAllFeatures", "", "deviceId", "getAllFeaturesForDevice", "(J)Ljava/util/List;", "getAllFeaturesForDeviceFlow", "(J)Lkotlinx/coroutines/flow/Flow;", "getAllFeaturesForDeviceLiveData", "(J)Landroidx/lifecycle/LiveData;", "", "getPlatformFeatures", "([I)Ljava/util/List;", "features", "insertFeatures", "(Ljava/util/List;)V", "ownerId", "", "ownerType", "", "isFeatureEligibleForOwnerIdAndType", "(IJLjava/lang/String;)Z", "isFeatureEnabledForOwnerIdAndType", "platformFeatures", "updateFeatures", "platformFeature", "updateFeature", "(Lcom/withings/features/platform/model/PlatformFeature;)V", "replaceAllFeatures", "Lorg/joda/time/DateTime;", "getLastUpdate", "()Lorg/joda/time/DateTime;", CervicalMucusRecord.Appearance.CLEAR, "()V", "Lcom/withings/features/platform/model/PlatformFeatureDao;", "platformFeatureDao", "Lcom/withings/features/platform/model/PlatformFeatureDao;", "Lu70/h;", "listenerManager", "Lu70/h;", "<init>", "(Lcom/withings/features/platform/model/PlatformFeatureDao;)V", "Companion", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RoomPlatformFeatureRepository implements PlatformFeatureRepository {
    public static final Companion Companion = new Companion(null);
    public static PlatformFeatureRepository instance;
    private final h<PlatformFeatureRepository.Listener> listenerManager;
    private final PlatformFeatureDao platformFeatureDao;

    /* compiled from: RoomPlatformFeatureRepository.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/withings/features/platform/model/RoomPlatformFeatureRepository$Companion;", "", "()V", "instance", "Lcom/withings/features/platform/model/PlatformFeatureRepository;", "getInstance", "()Lcom/withings/features/platform/model/PlatformFeatureRepository;", "setInstance", "(Lcom/withings/features/platform/model/PlatformFeatureRepository;)V", "get", "init", "platformFeatureDao", "Lcom/withings/features/platform/model/PlatformFeatureDao;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final PlatformFeatureRepository get() {
            return getInstance();
        }

        public final PlatformFeatureRepository getInstance() {
            PlatformFeatureRepository platformFeatureRepository = RoomPlatformFeatureRepository.instance;
            if (platformFeatureRepository != null) {
                return platformFeatureRepository;
            }
            u.s("instance");
            throw null;
        }

        public final PlatformFeatureRepository init(PlatformFeatureDao platformFeatureDao) {
            u.j(platformFeatureDao, "platformFeatureDao");
            setInstance(new RoomPlatformFeatureRepository(platformFeatureDao, null));
            return getInstance();
        }

        public final void setInstance(PlatformFeatureRepository platformFeatureRepository) {
            u.j(platformFeatureRepository, "<set-?>");
            RoomPlatformFeatureRepository.instance = platformFeatureRepository;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RoomPlatformFeatureRepository(PlatformFeatureDao platformFeatureDao, m mVar) {
        this(platformFeatureDao);
    }

    public static /* synthetic */ void a(PlatformFeature platformFeature, PlatformFeatureRepository.Listener listener) {
        updateFeatures$lambda$19$lambda$18(platformFeature, listener);
    }

    public static /* synthetic */ void b(PlatformFeature platformFeature, PlatformFeatureRepository.Listener listener) {
        insertFeatures$lambda$11$lambda$10(platformFeature, listener);
    }

    public static final PlatformFeatureRepository get() {
        return Companion.get();
    }

    public static final PlatformFeatureRepository init(PlatformFeatureDao platformFeatureDao) {
        return Companion.init(platformFeatureDao);
    }

    public static final void insertFeatures$lambda$11$lambda$10(PlatformFeature feature, PlatformFeatureRepository.Listener listener) {
        u.j(feature, "$feature");
        listener.onFeatureInserted(feature);
    }

    public static final void updateFeature$lambda$20(PlatformFeature platformFeature, PlatformFeatureRepository.Listener listener) {
        u.j(platformFeature, "$platformFeature");
        listener.onFeatureUpdated(platformFeature);
    }

    public static final void updateFeatures$lambda$19$lambda$18(PlatformFeature feature, PlatformFeatureRepository.Listener listener) {
        u.j(feature, "$feature");
        listener.onFeatureUpdated(feature);
    }

    @Override // com.withings.features.platform.model.PlatformFeatureRepository
    public void clear() {
        this.platformFeatureDao.clear();
    }

    @Override // com.withings.features.platform.model.PlatformFeatureRepository
    public List<PlatformFeature> getAllFeatures() {
        return this.platformFeatureDao.getAllPlatformFeatures();
    }

    @Override // com.withings.features.platform.model.PlatformFeatureRepository
    public List<PlatformFeature> getAllFeaturesForDevice(long j5) {
        DeviceOwner deviceOwner;
        Long deviceId;
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.platformFeatureDao.getAllPlatformFeatures()) {
            List<Owner> owners = ((PlatformFeature) obj).getOwners();
            if (!(owners instanceof Collection) || !owners.isEmpty()) {
                Iterator<T> it = owners.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Owner owner = (Owner) it.next();
                        if (owner instanceof DeviceOwner) {
                            deviceOwner = (DeviceOwner) owner;
                        } else {
                            deviceOwner = null;
                        }
                        if (deviceOwner != null && (deviceId = deviceOwner.getDeviceId()) != null && deviceId.longValue() == j5) {
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.withings.features.platform.model.PlatformFeatureRepository
    public Flow<List<PlatformFeature>> getAllFeaturesForDeviceFlow(final long j5) {
        final Flow<List<PlatformFeature>> allPlatformFeaturesFlow = this.platformFeatureDao.getAllPlatformFeaturesFlow();
        return new Flow<List<? extends PlatformFeature>>() { // from class: com.withings.features.platform.model.RoomPlatformFeatureRepository$getAllFeaturesForDeviceFlow$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lnm0/y;", "emit", "(Ljava/lang/Object;Lqm0/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.withings.features.platform.model.RoomPlatformFeatureRepository$getAllFeaturesForDeviceFlow$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ long $deviceId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @e(c = "com.withings.features.platform.model.RoomPlatformFeatureRepository$getAllFeaturesForDeviceFlow$$inlined$map$1$2", f = "RoomPlatformFeatureRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.withings.features.platform.model.RoomPlatformFeatureRepository$getAllFeaturesForDeviceFlow$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes3.dex */
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

                public AnonymousClass2(FlowCollector flowCollector, long j5) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$deviceId$inlined = j5;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r12, qm0.d r13) {
                    /*
                        r11 = this;
                        boolean r0 = r13 instanceof com.withings.features.platform.model.RoomPlatformFeatureRepository$getAllFeaturesForDeviceFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r13
                        com.withings.features.platform.model.RoomPlatformFeatureRepository$getAllFeaturesForDeviceFlow$$inlined$map$1$2$1 r0 = (com.withings.features.platform.model.RoomPlatformFeatureRepository$getAllFeaturesForDeviceFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.withings.features.platform.model.RoomPlatformFeatureRepository$getAllFeaturesForDeviceFlow$$inlined$map$1$2$1 r0 = new com.withings.features.platform.model.RoomPlatformFeatureRepository$getAllFeaturesForDeviceFlow$$inlined$map$1$2$1
                        r0.<init>(r13)
                    L18:
                        java.lang.Object r13 = r0.result
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L30
                        if (r2 != r3) goto L28
                        nm0.l.b(r13)
                        goto L9b
                    L28:
                        java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                        java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                        r12.<init>(r13)
                        throw r12
                    L30:
                        nm0.l.b(r13)
                        kotlinx.coroutines.flow.FlowCollector r13 = r11.$this_unsafeFlow
                        java.util.List r12 = (java.util.List) r12
                        java.lang.Iterable r12 = (java.lang.Iterable) r12
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>()
                        java.util.Iterator r12 = r12.iterator()
                    L42:
                        boolean r4 = r12.hasNext()
                        if (r4 == 0) goto L92
                        java.lang.Object r4 = r12.next()
                        r5 = r4
                        com.withings.features.platform.model.PlatformFeature r5 = (com.withings.features.platform.model.PlatformFeature) r5
                        java.util.List r5 = r5.getOwners()
                        java.lang.Iterable r5 = (java.lang.Iterable) r5
                        boolean r6 = r5 instanceof java.util.Collection
                        if (r6 == 0) goto L63
                        r6 = r5
                        java.util.Collection r6 = (java.util.Collection) r6
                        boolean r6 = r6.isEmpty()
                        if (r6 == 0) goto L63
                        goto L42
                    L63:
                        java.util.Iterator r5 = r5.iterator()
                    L67:
                        boolean r6 = r5.hasNext()
                        if (r6 == 0) goto L42
                        java.lang.Object r6 = r5.next()
                        com.withings.features.platform.model.Owner r6 = (com.withings.features.platform.model.Owner) r6
                        boolean r7 = r6 instanceof com.withings.features.platform.model.DeviceOwner
                        if (r7 == 0) goto L7a
                        com.withings.features.platform.model.DeviceOwner r6 = (com.withings.features.platform.model.DeviceOwner) r6
                        goto L7b
                    L7a:
                        r6 = 0
                    L7b:
                        if (r6 == 0) goto L67
                        java.lang.Long r6 = r6.getDeviceId()
                        long r7 = r11.$deviceId$inlined
                        if (r6 != 0) goto L86
                        goto L67
                    L86:
                        long r9 = r6.longValue()
                        int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                        if (r6 != 0) goto L67
                        r2.add(r4)
                        goto L42
                    L92:
                        r0.label = r3
                        java.lang.Object r12 = r13.emit(r2, r0)
                        if (r12 != r1) goto L9b
                        return r1
                    L9b:
                        nm0.y r12 = nm0.y.f85009a
                        return r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.withings.features.platform.model.RoomPlatformFeatureRepository$getAllFeaturesForDeviceFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, qm0.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends PlatformFeature>> flowCollector, d dVar) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, j5), dVar);
                if (collect == CoroutineSingletons.f76214a) {
                    return collect;
                }
                return y.f85009a;
            }
        };
    }

    @Override // com.withings.features.platform.model.PlatformFeatureRepository
    public LiveData<List<PlatformFeature>> getAllFeaturesForDeviceLiveData(long j5) {
        return e1.b(this.platformFeatureDao.getAllPlatformFeaturesLiveData(), new RoomPlatformFeatureRepository$getAllFeaturesForDeviceLiveData$$inlined$map$1(j5));
    }

    @Override // com.withings.features.platform.model.PlatformFeatureRepository
    public PlatformFeature getFeature(int i11) {
        return this.platformFeatureDao.getFeature(i11);
    }

    @Override // com.withings.features.platform.model.PlatformFeatureRepository
    public Flow<PlatformFeature> getFeatureAsFlow(int i11) {
        return this.platformFeatureDao.getFeatureAsFlow(i11);
    }

    @Override // com.withings.features.platform.model.PlatformFeatureRepository
    public LiveData<PlatformFeature> getFeatureLiveData(int i11) {
        return this.platformFeatureDao.getFeatureLiveData(i11);
    }

    @Override // com.withings.features.platform.model.PlatformFeatureRepository
    public DateTime getLastUpdate() {
        Long l5;
        long j5;
        Iterator<T> it = getAllFeatures().iterator();
        if (!it.hasNext()) {
            l5 = null;
        } else {
            Long valueOf = Long.valueOf(RoomPlatformFeatureRepositoryKt.getLastUpdate(((PlatformFeature) it.next()).getOwners()));
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(RoomPlatformFeatureRepositoryKt.getLastUpdate(((PlatformFeature) it.next()).getOwners()));
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l5 = valueOf;
        }
        if (l5 != null) {
            j5 = l5.longValue();
        } else {
            j5 = 0;
        }
        return new DateTime(j5);
    }

    @Override // com.withings.features.platform.model.PlatformFeatureRepository
    public List<PlatformFeature> getNotSyncedFeatures() {
        return this.platformFeatureDao.getNotSyncedFeatures();
    }

    @Override // com.withings.features.platform.model.PlatformFeatureRepository
    public List<PlatformFeature> getPlatformFeatures(int... featureId) {
        u.j(featureId, "featureId");
        ArrayList arrayList = new ArrayList();
        for (Number number : l.Y(featureId)) {
            PlatformFeature featureById = this.platformFeatureDao.getFeatureById(number.intValue());
            if (featureById != null) {
                arrayList.add(featureById);
            }
        }
        return arrayList;
    }

    @Override // com.withings.features.platform.model.PlatformFeatureRepository
    public void insertFeatures(List<PlatformFeature> features) {
        u.j(features, "features");
        this.platformFeatureDao.insert(features);
        for (PlatformFeature platformFeature : features) {
            this.listenerManager.f(new t(platformFeature, 6));
        }
    }

    @Override // com.withings.features.platform.model.PlatformFeatureRepository
    public boolean isFeatureEligibleForOwnerIdAndType(int i11, long j5, String ownerType) {
        List<Owner> owners;
        Long deviceId;
        List<Owner> owners2;
        Long accountId;
        List<Owner> owners3;
        Long userId;
        u.j(ownerType, "ownerType");
        PlatformFeature featureById = this.platformFeatureDao.getFeatureById(i11);
        int hashCode = ownerType.hashCode();
        boolean z5 = true;
        if (hashCode != -1335157162) {
            if (hashCode != -1177318867) {
                if (hashCode != 3599307 || !ownerType.equals(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT) || featureById == null || (owners3 = featureById.getOwners()) == null) {
                    return false;
                }
                List<Owner> list = owners3;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (Owner owner : list) {
                        if ((owner instanceof UserOwner) && (userId = ((UserOwner) owner).getUserId()) != null && userId.longValue() == j5) {
                            break;
                        }
                    }
                }
                z5 = false;
                return z5;
            } else if (!ownerType.equals("account") || featureById == null || (owners2 = featureById.getOwners()) == null) {
                return false;
            } else {
                List<Owner> list2 = owners2;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (Owner owner2 : list2) {
                        if ((owner2 instanceof AccountOwner) && (accountId = ((AccountOwner) owner2).getAccountId()) != null && accountId.longValue() == j5) {
                            break;
                        }
                    }
                }
                z5 = false;
                return z5;
            }
        } else if (!ownerType.equals("device") || featureById == null || (owners = featureById.getOwners()) == null) {
            return false;
        } else {
            List<Owner> list3 = owners;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                for (Owner owner3 : list3) {
                    if ((owner3 instanceof DeviceOwner) && (deviceId = ((DeviceOwner) owner3).getDeviceId()) != null && deviceId.longValue() == j5) {
                        break;
                    }
                }
            }
            z5 = false;
            return z5;
        }
    }

    @Override // com.withings.features.platform.model.PlatformFeatureRepository
    public boolean isFeatureEnabledForOwnerIdAndType(int i11, long j5, String ownerType) {
        List<Owner> owners;
        Long deviceId;
        List<Owner> owners2;
        Long accountId;
        List<Owner> owners3;
        Long userId;
        u.j(ownerType, "ownerType");
        PlatformFeature featureById = this.platformFeatureDao.getFeatureById(i11);
        int hashCode = ownerType.hashCode();
        boolean z5 = true;
        if (hashCode != -1335157162) {
            if (hashCode != -1177318867) {
                if (hashCode != 3599307 || !ownerType.equals(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT) || featureById == null || (owners3 = featureById.getOwners()) == null) {
                    return false;
                }
                List<Owner> list = owners3;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (Owner owner : list) {
                        if ((owner instanceof UserOwner) && (userId = ((UserOwner) owner).getUserId()) != null && userId.longValue() == j5 && owner.getActive()) {
                            break;
                        }
                    }
                }
                z5 = false;
                return z5;
            } else if (!ownerType.equals("account") || featureById == null || (owners2 = featureById.getOwners()) == null) {
                return false;
            } else {
                List<Owner> list2 = owners2;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (Owner owner2 : list2) {
                        if ((owner2 instanceof AccountOwner) && (accountId = ((AccountOwner) owner2).getAccountId()) != null && accountId.longValue() == j5 && owner2.getActive()) {
                            break;
                        }
                    }
                }
                z5 = false;
                return z5;
            }
        } else if (!ownerType.equals("device") || featureById == null || (owners = featureById.getOwners()) == null) {
            return false;
        } else {
            List<Owner> list3 = owners;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                for (Owner owner3 : list3) {
                    if ((owner3 instanceof DeviceOwner) && (deviceId = ((DeviceOwner) owner3).getDeviceId()) != null && deviceId.longValue() == j5 && owner3.getActive()) {
                        break;
                    }
                }
            }
            z5 = false;
            return z5;
        }
    }

    @Override // com.withings.features.platform.model.PlatformFeatureRepository
    public void registerListener(PlatformFeatureRepository.Listener listener) {
        u.j(listener, "listener");
        this.listenerManager.b(listener);
    }

    @Override // com.withings.features.platform.model.PlatformFeatureRepository
    public void replaceAllFeatures(List<PlatformFeature> features) {
        u.j(features, "features");
        this.platformFeatureDao.clear();
        insertFeatures(features);
    }

    @Override // com.withings.features.platform.model.PlatformFeatureRepository
    public void unregisterListener(PlatformFeatureRepository.Listener listener) {
        u.j(listener, "listener");
        this.listenerManager.a(listener);
    }

    @Override // com.withings.features.platform.model.PlatformFeatureRepository
    public void updateFeature(PlatformFeature platformFeature) {
        u.j(platformFeature, "platformFeature");
        this.platformFeatureDao.updateFeature(platformFeature);
        this.listenerManager.f(new s(platformFeature, 2));
    }

    @Override // com.withings.features.platform.model.PlatformFeatureRepository
    public void updateFeatures(List<PlatformFeature> platformFeatures) {
        u.j(platformFeatures, "platformFeatures");
        this.platformFeatureDao.updateFeatures(platformFeatures);
        for (PlatformFeature platformFeature : platformFeatures) {
            this.listenerManager.f(new v.d(platformFeature, 5));
        }
    }

    private RoomPlatformFeatureRepository(PlatformFeatureDao platformFeatureDao) {
        this.platformFeatureDao = platformFeatureDao;
        this.listenerManager = new h<>();
    }
}
