package com.withings.ecg.model;

import androidx.camera.camera2.internal.o0;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.lifecycle.LiveData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.withings.ecg.model.HeartSignalDao;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.vasistas.ws.WsVasistasSerie;
import e2.r;
import e2.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.b0;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import org.joda.time.DateTime;
import u70.h;
import v.d;
import x70.b;
/* compiled from: RoomHeartSignalRepository.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bM\u0010NJ#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u001f\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\bJ\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\fJ\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u0017J#\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u000fJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010#J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010\u0017J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010\u0017J\u0017\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010+J\u0017\u0010-\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010.J9\u00105\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/2\n\u00104\u001a\u000202\"\u000203H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u001dH\u0016¢\u0006\u0004\b7\u00108J-\u0010:\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00022\n\u00104\u001a\u000202\"\u000203H\u0016¢\u0006\u0004\b:\u0010;J3\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00022\n\u00104\u001a\u000202\"\u000203H\u0016¢\u0006\u0004\b<\u0010=J\u0019\u0010?\u001a\u0004\u0018\u00010\u00062\u0006\u0010>\u001a\u00020\u0002H\u0016¢\u0006\u0004\b?\u0010\fJ\u0019\u0010@\u001a\u0004\u0018\u00010\u00062\u0006\u0010>\u001a\u00020\u0002H\u0016¢\u0006\u0004\b@\u0010\fJ\u0019\u0010A\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\bA\u0010\fJ\u000f\u0010B\u001a\u00020\u001dH\u0016¢\u0006\u0004\bB\u00108J\u0015\u0010C\u001a\b\u0012\u0004\u0012\u0002030\rH\u0016¢\u0006\u0004\bC\u0010DJ\u001d\u0010C\u001a\b\u0012\u0004\u0012\u0002030\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\bC\u0010\u000fJ\u001b\u0010E\u001a\u00020\u001d*\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020 0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006O"}, d2 = {"Lcom/withings/ecg/model/RoomHeartSignalRepository;", "Lcom/withings/ecg/model/HeartSignalRepository;", "", NavigationArguments.USER_ID, "Landroidx/lifecycle/LiveData;", "", "Lcom/withings/ecg/model/HeartSignalMeasurement;", "getSignalsWithStethoscopeSoundLiveData", "(J)Landroidx/lifecycle/LiveData;", "id", "getHeartSignalLiveData", "getLastEcg", "(J)Lcom/withings/ecg/model/HeartSignalMeasurement;", "Lkotlinx/coroutines/flow/Flow;", "getContinuousLastEcg", "(J)Lkotlinx/coroutines/flow/Flow;", "deviceId", "", "hasInReviewEcg", "(JLjava/lang/Long;)Z", "getLastHeartSound", "getContinuousLastHeartSound", "getSignalsWithSPO2", "(J)Ljava/util/List;", "getSignalWithEcgLiveData", "getHeartSignal", "getSignalsWithEcg", "getSignalsWithEcgFlow", "syncedWithApi", "Lnm0/y;", "flagAsDeletedById", "(JZ)V", "Lcom/withings/ecg/model/HeartSignalRepository$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerListener", "(Lcom/withings/ecg/model/HeartSignalRepository$Listener;)V", "unregisterListener", "getSignalsWithStethoscopeSound", "getNotSyncedSignalsForUserId", "heartSignalMeasurement", "insertOrUpdate", "(Lcom/withings/ecg/model/HeartSignalMeasurement;)J", "getLastUpdate", "(J)J", "getLastModifiedSyncedToWsForUserId", DiscoverItems.Item.UPDATE_ACTION, "(Lcom/withings/ecg/model/HeartSignalMeasurement;)V", "Lorg/joda/time/DateTime;", "start", "realEnd", "", "", WsVasistasSerie.KEY_TYPES, "getSignalsWithTypeBetween", "(JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;[I)Ljava/util/List;", CervicalMucusRecord.Appearance.CLEAR, "()V", "timestamp", "getByTimestampAndType", "(JJ[I)Lcom/withings/ecg/model/HeartSignalMeasurement;", "getByTimestampAndTypeFlow", "(JJ[I)Lkotlinx/coroutines/flow/Flow;", "signalId", "getBySignalId", "getNotDeletedBySignalId", "getNotDeletedHeartSignal", "deleteOldSignalButNotLatest", "getCountAsFlow", "()Lkotlinx/coroutines/flow/Flow;", "flagAsDeleted", "(Lcom/withings/ecg/model/HeartSignalMeasurement;Z)V", "Lcom/withings/ecg/model/HeartSignalDao;", "heartSignalDao", "Lcom/withings/ecg/model/HeartSignalDao;", "Lu70/h;", "listenerManager", "Lu70/h;", "<init>", "(Lcom/withings/ecg/model/HeartSignalDao;)V", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RoomHeartSignalRepository implements HeartSignalRepository {
    public static final int $stable = 8;
    private final HeartSignalDao heartSignalDao;
    private final h<HeartSignalRepository.Listener> listenerManager;

    public RoomHeartSignalRepository(HeartSignalDao heartSignalDao) {
        u.j(heartSignalDao, "heartSignalDao");
        this.heartSignalDao = heartSignalDao;
        this.listenerManager = new h<>();
    }

    public static /* synthetic */ void b(HeartSignalMeasurement heartSignalMeasurement, HeartSignalRepository.Listener listener) {
        insertOrUpdate$lambda$9(heartSignalMeasurement, listener);
    }

    public static /* synthetic */ void c(HeartSignalMeasurement heartSignalMeasurement, HeartSignalRepository.Listener listener) {
        flagAsDeleted$lambda$2(heartSignalMeasurement, listener);
    }

    private final void flagAsDeleted(HeartSignalMeasurement heartSignalMeasurement, boolean z5) {
        Long signalId = heartSignalMeasurement.getSignal().getSignalId();
        if (signalId != null) {
            if (signalId.longValue() <= 0) {
                signalId = null;
            }
            if (signalId != null) {
                heartSignalMeasurement.setSynced(z5);
                heartSignalMeasurement.setDeleted(true);
                this.heartSignalDao.update(heartSignalMeasurement);
                this.listenerManager.f(new r(heartSignalMeasurement, 4));
            }
        }
        this.heartSignalDao.delete(heartSignalMeasurement.getId());
        this.listenerManager.f(new r(heartSignalMeasurement, 4));
    }

    public static final void flagAsDeleted$lambda$2(HeartSignalMeasurement this_flagAsDeleted, HeartSignalRepository.Listener listener) {
        u.j(this_flagAsDeleted, "$this_flagAsDeleted");
        listener.onHeartSignalDeleted(this_flagAsDeleted.getUserID(), this_flagAsDeleted.getId());
    }

    public static final void insertOrUpdate$lambda$9(HeartSignalMeasurement heartSignalMeasurement, HeartSignalRepository.Listener listener) {
        u.j(heartSignalMeasurement, "$heartSignalMeasurement");
        listener.onHeartSignalInserted(heartSignalMeasurement);
    }

    public static final void update$lambda$10(HeartSignalMeasurement heartSignalMeasurement, HeartSignalRepository.Listener listener) {
        u.j(heartSignalMeasurement, "$heartSignalMeasurement");
        listener.onHeartSignalUpdated(heartSignalMeasurement);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public void clear() {
        this.heartSignalDao.deleteAll();
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public void deleteOldSignalButNotLatest() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : this.heartSignalDao.getNotDeletedHeartSignal()) {
            Long valueOf = Long.valueOf(((HeartSignalDao.SignalIdByUserId) obj).getUserID());
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(s0.h(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), x.C((Iterable) entry.getValue()));
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            x.n((List) entry2.getValue(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList(x.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((HeartSignalDao.SignalIdByUserId) it.next()).getId()));
        }
        this.heartSignalDao.deleteByIds(arrayList2);
        b.t(this, o0.a("Removing ", arrayList2.size(), " old deleted signals"), new Object[0]);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public void flagAsDeletedById(long j5, boolean z5) {
        HeartSignalMeasurement heartSignal = this.heartSignalDao.getHeartSignal(j5);
        if (heartSignal != null) {
            flagAsDeleted(heartSignal, z5);
        }
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public HeartSignalMeasurement getBySignalId(long j5) {
        return this.heartSignalDao.getBySignalId(j5);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public HeartSignalMeasurement getByTimestampAndType(long j5, long j11, int... types) {
        u.j(types, "types");
        return this.heartSignalDao.getByTimestampAndType(j5, j11, Arrays.copyOf(types, types.length));
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public Flow<HeartSignalMeasurement> getByTimestampAndTypeFlow(long j5, long j11, int... types) {
        u.j(types, "types");
        return this.heartSignalDao.getByTimestampAndTypeFlow(j5, j11, Arrays.copyOf(types, types.length));
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public Flow<HeartSignalMeasurement> getContinuousLastEcg(long j5) {
        return this.heartSignalDao.getContinuousLastHeartSignal(j5, 1, 6, 8, 7, 13);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public Flow<HeartSignalMeasurement> getContinuousLastHeartSound(long j5) {
        return this.heartSignalDao.getContinuousLastHeartSignal(j5, 2);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public Flow<Integer> getCountAsFlow() {
        return this.heartSignalDao.getCountAsFlow();
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public HeartSignalMeasurement getHeartSignal(long j5) {
        return this.heartSignalDao.getHeartSignal(j5);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public LiveData<HeartSignalMeasurement> getHeartSignalLiveData(long j5) {
        return this.heartSignalDao.getHeartSignalLiveData(j5);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public HeartSignalMeasurement getLastEcg(long j5) {
        return this.heartSignalDao.getLastHeartSignal(j5, 1, 6, 8, 7, 13);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public HeartSignalMeasurement getLastHeartSound(long j5) {
        return this.heartSignalDao.getLastHeartSignal(j5, 2);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public long getLastModifiedSyncedToWsForUserId(long j5) {
        return this.heartSignalDao.getLastModifiedSyncedToWsForUserId(j5);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public long getLastUpdate(long j5) {
        return this.heartSignalDao.getLastUpdate(j5);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public HeartSignalMeasurement getNotDeletedBySignalId(long j5) {
        return this.heartSignalDao.getNotDeletedBySignalId(j5);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public HeartSignalMeasurement getNotDeletedHeartSignal(long j5) {
        return this.heartSignalDao.getNotDeletedHeartSignal(j5);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public List<HeartSignalMeasurement> getNotSyncedSignalsForUserId(long j5) {
        return this.heartSignalDao.getNotSyncedSignalsForUser(j5);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public LiveData<List<HeartSignalMeasurement>> getSignalWithEcgLiveData(long j5) {
        return this.heartSignalDao.getSignalsWithTypeLiveData(j5, 1, 6, 8, 7, 13);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public List<HeartSignalMeasurement> getSignalsWithEcg(long j5) {
        return this.heartSignalDao.getSignalsWithType(j5, 1, 6, 8, 7, 13);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public Flow<List<HeartSignalMeasurement>> getSignalsWithEcgFlow(long j5) {
        return this.heartSignalDao.getSignalsWithTypeFlow(j5, new int[0]);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public List<HeartSignalMeasurement> getSignalsWithSPO2(long j5) {
        return this.heartSignalDao.getSignalsWithType(j5, 4);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public List<HeartSignalMeasurement> getSignalsWithStethoscopeSound(long j5) {
        return this.heartSignalDao.getSignalsWithType(j5, 2);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public LiveData<List<HeartSignalMeasurement>> getSignalsWithStethoscopeSoundLiveData(long j5) {
        return this.heartSignalDao.getSignalsWithTypeLiveData(j5, 2);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public List<HeartSignalMeasurement> getSignalsWithTypeBetween(long j5, DateTime start, DateTime realEnd, int... types) {
        u.j(start, "start");
        u.j(realEnd, "realEnd");
        u.j(types, "types");
        return this.heartSignalDao.getSignalsWithTypeBetween(j5, start.getMillis(), realEnd.getMillis(), Arrays.copyOf(types, types.length));
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public boolean hasInReviewEcg(long j5, Long l5) {
        if (l5 == null) {
            if (this.heartSignalDao.hasInReviewEcg(j5, 1, 6, 8, 7, 13) <= 0) {
                return false;
            }
        } else if (this.heartSignalDao.hasInReviewEcg(j5, l5.longValue(), 1, 6, 8, 7, 13) <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public long insertOrUpdate(HeartSignalMeasurement heartSignalMeasurement) {
        Integer heartRate;
        u.j(heartSignalMeasurement, "heartSignalMeasurement");
        HeartSignalMeasurement byTimestampAndType = this.heartSignalDao.getByTimestampAndType(heartSignalMeasurement.getUserID(), heartSignalMeasurement.getTimestamp().getMillis(), heartSignalMeasurement.getSignal().getMeta().getType());
        if (byTimestampAndType != null) {
            if (heartSignalMeasurement.getMeasures().isEmpty()) {
                ArrayList S0 = x.S0(heartSignalMeasurement.getMeasures());
                S0.addAll(byTimestampAndType.getMeasures());
                heartSignalMeasurement.setMeasures(x.Q0(S0));
            }
            heartSignalMeasurement.setId(byTimestampAndType.getId());
            Integer heartRate2 = heartSignalMeasurement.getHeartRate();
            if ((heartRate2 == null || heartRate2.intValue() == 0) && (heartRate = byTimestampAndType.getHeartRate()) != null && heartRate.intValue() > 0) {
                ArrayList S02 = x.S0(heartSignalMeasurement.getMeasures());
                b0.j(S02, RoomHeartSignalRepository$insertOrUpdate$1$2$1.INSTANCE);
                for (Object obj : byTimestampAndType.getMeasures()) {
                    if (((HeartSignalMeasurement.Measure) obj).getType() == 11) {
                        S02.add(obj);
                        heartSignalMeasurement.setMeasures(x.Q0(S02));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            update(heartSignalMeasurement);
            return heartSignalMeasurement.getId();
        }
        long insert = this.heartSignalDao.insert(heartSignalMeasurement);
        heartSignalMeasurement.setId(insert);
        this.listenerManager.f(new d(heartSignalMeasurement, 4));
        return insert;
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public void registerListener(HeartSignalRepository.Listener listener) {
        u.j(listener, "listener");
        this.listenerManager.b(listener);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public void unregisterListener(HeartSignalRepository.Listener listener) {
        u.j(listener, "listener");
        this.listenerManager.a(listener);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public void update(HeartSignalMeasurement heartSignalMeasurement) {
        u.j(heartSignalMeasurement, "heartSignalMeasurement");
        this.heartSignalDao.update(heartSignalMeasurement);
        this.listenerManager.f(new s(heartSignalMeasurement, 1));
    }

    @Override // com.withings.ecg.model.HeartSignalRepository
    public Flow<Integer> getCountAsFlow(long j5) {
        return this.heartSignalDao.getCountAsFlow(j5);
    }
}
