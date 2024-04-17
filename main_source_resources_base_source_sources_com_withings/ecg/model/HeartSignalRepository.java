package com.withings.ecg.model;

import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.lifecycle.LiveData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.vasistas.ws.WsVasistasSerie;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import org.joda.time.DateTime;
/* compiled from: HeartSignalRepository.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001:\u0001EJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0006J\u001f\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00102\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0006J\u001f\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00102\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0012J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0017J#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00150\u00102\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u0012J#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00150\u00072\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u001a\u0010\tJ#\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00150\u00072\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u001b\u0010\tJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0004H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u0004H&¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\fH&¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020%H&¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020%H&¢\u0006\u0004\b)\u0010(J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b*\u0010\u0017J\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b+\u0010\u0017J\u0017\u0010,\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001fH&¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b0\u0010-J9\u00107\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\n\u00106\u001a\u000204\"\u000205H&¢\u0006\u0004\b7\u00108J-\u0010:\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00022\n\u00106\u001a\u000204\"\u000205H&¢\u0006\u0004\b:\u0010;J3\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00102\u0006\u0010\n\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00022\n\u00106\u001a\u000204\"\u000205H&¢\u0006\u0004\b<\u0010=J\u0019\u0010?\u001a\u0004\u0018\u00010\u00042\u0006\u0010>\u001a\u00020\u0002H&¢\u0006\u0004\b?\u0010\u0006J\u0019\u0010@\u001a\u0004\u0018\u00010\u00042\u0006\u0010>\u001a\u00020\u0002H&¢\u0006\u0004\b@\u0010\u0006J\u0019\u0010A\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\bA\u0010\u0006J\u000f\u0010B\u001a\u00020\u001fH&¢\u0006\u0004\bB\u0010/J\u0015\u0010C\u001a\b\u0012\u0004\u0012\u0002050\u0010H&¢\u0006\u0004\bC\u0010DJ\u001d\u0010C\u001a\b\u0012\u0004\u0012\u0002050\u00102\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\bC\u0010\u0012¨\u0006FÀ\u0006\u0003"}, d2 = {"Lcom/withings/ecg/model/HeartSignalRepository;", "", "", "id", "Lcom/withings/ecg/model/HeartSignalMeasurement;", "getHeartSignal", "(J)Lcom/withings/ecg/model/HeartSignalMeasurement;", "Landroidx/lifecycle/LiveData;", "getHeartSignalLiveData", "(J)Landroidx/lifecycle/LiveData;", NavigationArguments.USER_ID, "deviceId", "", "hasInReviewEcg", "(JLjava/lang/Long;)Z", "getLastEcg", "Lkotlinx/coroutines/flow/Flow;", "getContinuousLastEcg", "(J)Lkotlinx/coroutines/flow/Flow;", "getLastHeartSound", "getContinuousLastHeartSound", "", "getSignalsWithSPO2", "(J)Ljava/util/List;", "getSignalsWithEcg", "getSignalsWithEcgFlow", "getSignalWithEcgLiveData", "getSignalsWithStethoscopeSoundLiveData", "heartSignalMeasurement", "insertOrUpdate", "(Lcom/withings/ecg/model/HeartSignalMeasurement;)J", "Lnm0/y;", DiscoverItems.Item.UPDATE_ACTION, "(Lcom/withings/ecg/model/HeartSignalMeasurement;)V", "syncedWithApi", "flagAsDeletedById", "(JZ)V", "Lcom/withings/ecg/model/HeartSignalRepository$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerListener", "(Lcom/withings/ecg/model/HeartSignalRepository$Listener;)V", "unregisterListener", "getSignalsWithStethoscopeSound", "getNotSyncedSignalsForUserId", "getLastUpdate", "(J)J", CervicalMucusRecord.Appearance.CLEAR, "()V", "getLastModifiedSyncedToWsForUserId", "Lorg/joda/time/DateTime;", "start", "realEnd", "", "", WsVasistasSerie.KEY_TYPES, "getSignalsWithTypeBetween", "(JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;[I)Ljava/util/List;", "timestamp", "getByTimestampAndType", "(JJ[I)Lcom/withings/ecg/model/HeartSignalMeasurement;", "getByTimestampAndTypeFlow", "(JJ[I)Lkotlinx/coroutines/flow/Flow;", "signalId", "getBySignalId", "getNotDeletedBySignalId", "getNotDeletedHeartSignal", "deleteOldSignalButNotLatest", "getCountAsFlow", "()Lkotlinx/coroutines/flow/Flow;", "Listener", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface HeartSignalRepository {

    /* compiled from: HeartSignalRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    /* compiled from: HeartSignalRepository.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/withings/ecg/model/HeartSignalRepository$Listener;", "", "Lcom/withings/ecg/model/HeartSignalMeasurement;", "heartSignalMeasurement", "Lnm0/y;", "onHeartSignalInserted", "(Lcom/withings/ecg/model/HeartSignalMeasurement;)V", "onHeartSignalUpdated", "", NavigationArguments.USER_ID, "measurementId", "onHeartSignalDeleted", "(JJ)V", "ecg_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public interface Listener {

        /* compiled from: HeartSignalRepository.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class DefaultImpls {
            @Deprecated
            public static void onHeartSignalUpdated(Listener listener, HeartSignalMeasurement heartSignalMeasurement) {
                u.j(heartSignalMeasurement, "heartSignalMeasurement");
                Listener.super.onHeartSignalUpdated(heartSignalMeasurement);
            }
        }

        void onHeartSignalDeleted(long j5, long j11);

        void onHeartSignalInserted(HeartSignalMeasurement heartSignalMeasurement);

        default void onHeartSignalUpdated(HeartSignalMeasurement heartSignalMeasurement) {
            u.j(heartSignalMeasurement, "heartSignalMeasurement");
        }
    }

    static /* synthetic */ void flagAsDeletedById$default(HeartSignalRepository heartSignalRepository, long j5, boolean z5, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                z5 = false;
            }
            heartSignalRepository.flagAsDeletedById(j5, z5);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: flagAsDeletedById");
    }

    void clear();

    void deleteOldSignalButNotLatest();

    void flagAsDeletedById(long j5, boolean z5);

    HeartSignalMeasurement getBySignalId(long j5);

    HeartSignalMeasurement getByTimestampAndType(long j5, long j11, int... iArr);

    Flow<HeartSignalMeasurement> getByTimestampAndTypeFlow(long j5, long j11, int... iArr);

    Flow<HeartSignalMeasurement> getContinuousLastEcg(long j5);

    Flow<HeartSignalMeasurement> getContinuousLastHeartSound(long j5);

    Flow<Integer> getCountAsFlow();

    Flow<Integer> getCountAsFlow(long j5);

    HeartSignalMeasurement getHeartSignal(long j5);

    LiveData<HeartSignalMeasurement> getHeartSignalLiveData(long j5);

    HeartSignalMeasurement getLastEcg(long j5);

    HeartSignalMeasurement getLastHeartSound(long j5);

    long getLastModifiedSyncedToWsForUserId(long j5);

    long getLastUpdate(long j5);

    HeartSignalMeasurement getNotDeletedBySignalId(long j5);

    HeartSignalMeasurement getNotDeletedHeartSignal(long j5);

    List<HeartSignalMeasurement> getNotSyncedSignalsForUserId(long j5);

    LiveData<List<HeartSignalMeasurement>> getSignalWithEcgLiveData(long j5);

    List<HeartSignalMeasurement> getSignalsWithEcg(long j5);

    Flow<List<HeartSignalMeasurement>> getSignalsWithEcgFlow(long j5);

    List<HeartSignalMeasurement> getSignalsWithSPO2(long j5);

    List<HeartSignalMeasurement> getSignalsWithStethoscopeSound(long j5);

    LiveData<List<HeartSignalMeasurement>> getSignalsWithStethoscopeSoundLiveData(long j5);

    List<HeartSignalMeasurement> getSignalsWithTypeBetween(long j5, DateTime dateTime, DateTime dateTime2, int... iArr);

    boolean hasInReviewEcg(long j5, Long l5);

    long insertOrUpdate(HeartSignalMeasurement heartSignalMeasurement);

    void registerListener(Listener listener);

    void unregisterListener(Listener listener);

    void update(HeartSignalMeasurement heartSignalMeasurement);
}
