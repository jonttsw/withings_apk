package com.withings.ecg.model;

import android.support.v4.media.session.c;
import androidx.camera.core.v;
import androidx.lifecycle.LiveData;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.ws.WsVasistasSerie;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
/* compiled from: HeartSignalDao.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u001c\bg\u0018\u00002\u00020\u0001:\u0001FJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH'¢\u0006\u0004\b\n\u0010\rJ)\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\n\u0010\u0011\u001a\u00020\u000f\"\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\u00142\u0006\u0010\u000e\u001a\u00020\u00042\n\u0010\u0011\u001a\u00020\u000f\"\u00020\u0010H'¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH'¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\"\u0010#J-\u0010%\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\n\u0010\u0011\u001a\u00020\u000f\"\u00020\u0010H'¢\u0006\u0004\b%\u0010&J3\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\n\u0010\u0011\u001a\u00020\u000f\"\u00020\u0010H'¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0018H'¢\u0006\u0004\b)\u0010*J/\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0+2\u0006\u0010\u000e\u001a\u00020\u00042\n\u0010\u0011\u001a\u00020\u000f\"\u00020\u0010H'¢\u0006\u0004\b,\u0010-J9\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\n\u0010\u0011\u001a\u00020\u000f\"\u00020\u0010H'¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020+2\u0006\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\b4\u0010!J%\u00105\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u00042\n\u0010\u0011\u001a\u00020\u000f\"\u00020\u0010H'¢\u0006\u0004\b5\u00106J+\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00042\n\u0010\u0011\u001a\u00020\u000f\"\u00020\u0010H'¢\u0006\u0004\b7\u0010\u0016J#\u00108\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00042\n\u0010\u0011\u001a\u00020\u000f\"\u00020\u0010H'¢\u0006\u0004\b8\u00109J+\u00108\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00042\n\u0010\u0011\u001a\u00020\u000f\"\u00020\u0010H'¢\u0006\u0004\b8\u0010;J-\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0004H'¢\u0006\u0004\b<\u0010=J\u0019\u0010?\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020\u0004H'¢\u0006\u0004\b?\u0010\tJ\u0019\u0010@\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020\u0004H'¢\u0006\u0004\b@\u0010\tJ\u0015\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014H'¢\u0006\u0004\bA\u0010BJ\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0006\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\bA\u0010CJ\u0017\u0010D\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\bD\u0010E¨\u0006GÀ\u0006\u0003"}, d2 = {"Lcom/withings/ecg/model/HeartSignalDao;", "", "Lcom/withings/ecg/model/HeartSignalMeasurement;", "heartSignalMeasurement", "", "insert", "(Lcom/withings/ecg/model/HeartSignalMeasurement;)J", "id", "getHeartSignal", "(J)Lcom/withings/ecg/model/HeartSignalMeasurement;", "getNotDeletedHeartSignal", "", "Lcom/withings/ecg/model/HeartSignalDao$SignalIdByUserId;", "()Ljava/util/List;", NavigationArguments.USER_ID, "", "", WsVasistasSerie.KEY_TYPES, "getSignalsWithType", "(J[I)Ljava/util/List;", "Lkotlinx/coroutines/flow/Flow;", "getSignalsWithTypeFlow", "(J[I)Lkotlinx/coroutines/flow/Flow;", "idList", "Lnm0/y;", "deleteByIds", "(Ljava/util/List;)V", "deleteByChunkedIds", "delete", "(J)V", "getNotSyncedSignalsForUser", "(J)Ljava/util/List;", "getLastUpdate", "(J)J", DiscoverItems.Item.UPDATE_ACTION, "(Lcom/withings/ecg/model/HeartSignalMeasurement;)V", "timestamp", "getByTimestampAndType", "(JJ[I)Lcom/withings/ecg/model/HeartSignalMeasurement;", "getByTimestampAndTypeFlow", "(JJ[I)Lkotlinx/coroutines/flow/Flow;", "deleteAll", "()V", "Landroidx/lifecycle/LiveData;", "getSignalsWithTypeLiveData", "(J[I)Landroidx/lifecycle/LiveData;", "start", "end", "getSignalsWithTypeBetween", "(JJJ[I)Ljava/util/List;", "getHeartSignalLiveData", "(J)Landroidx/lifecycle/LiveData;", "getLastModifiedSyncedToWsForUserId", "getLastHeartSignal", "(J[I)Lcom/withings/ecg/model/HeartSignalMeasurement;", "getContinuousLastHeartSignal", "hasInReviewEcg", "(J[I)I", "deviceId", "(JJ[I)I", "getSignalsForUserIdBetween", "(JJJ)Ljava/util/List;", "signalId", "getBySignalId", "getNotDeletedBySignalId", "getCountAsFlow", "()Lkotlinx/coroutines/flow/Flow;", "(J)Lkotlinx/coroutines/flow/Flow;", "getCount", "(J)I", "SignalIdByUserId", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface HeartSignalDao {

    /* compiled from: HeartSignalDao.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void deleteByIds(HeartSignalDao heartSignalDao, List<Long> idList) {
            u.j(idList, "idList");
            HeartSignalDao.super.deleteByIds(idList);
        }
    }

    /* compiled from: HeartSignalDao.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/withings/ecg/model/HeartSignalDao$SignalIdByUserId;", "", "id", "", "userID", "(JJ)V", "getId", "()J", "getUserID", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class SignalIdByUserId {
        public static final int $stable = 0;

        /* renamed from: id  reason: collision with root package name */
        private final long f38716id;
        private final long userID;

        public SignalIdByUserId(long j5, long j11) {
            this.f38716id = j5;
            this.userID = j11;
        }

        public static /* synthetic */ SignalIdByUserId copy$default(SignalIdByUserId signalIdByUserId, long j5, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j5 = signalIdByUserId.f38716id;
            }
            if ((i11 & 2) != 0) {
                j11 = signalIdByUserId.userID;
            }
            return signalIdByUserId.copy(j5, j11);
        }

        public final long component1() {
            return this.f38716id;
        }

        public final long component2() {
            return this.userID;
        }

        public final SignalIdByUserId copy(long j5, long j11) {
            return new SignalIdByUserId(j5, j11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignalIdByUserId)) {
                return false;
            }
            SignalIdByUserId signalIdByUserId = (SignalIdByUserId) obj;
            if (this.f38716id == signalIdByUserId.f38716id && this.userID == signalIdByUserId.userID) {
                return true;
            }
            return false;
        }

        public final long getId() {
            return this.f38716id;
        }

        public final long getUserID() {
            return this.userID;
        }

        public int hashCode() {
            return Long.hashCode(this.userID) + (Long.hashCode(this.f38716id) * 31);
        }

        public String toString() {
            long j5 = this.f38716id;
            return c.c(v.e("SignalIdByUserId(id=", j5, ", userID="), this.userID, ")");
        }
    }

    void delete(long j5);

    void deleteAll();

    void deleteByChunkedIds(List<Long> list);

    default void deleteByIds(List<Long> idList) {
        u.j(idList, "idList");
        for (List<Long> list : x.x(idList, ConstantsWs.MEASURE_TYPE_BLOOD_GLUCOSE_MAX)) {
            deleteByChunkedIds(list);
        }
    }

    HeartSignalMeasurement getBySignalId(long j5);

    HeartSignalMeasurement getByTimestampAndType(long j5, long j11, int... iArr);

    Flow<HeartSignalMeasurement> getByTimestampAndTypeFlow(long j5, long j11, int... iArr);

    Flow<HeartSignalMeasurement> getContinuousLastHeartSignal(long j5, int... iArr);

    int getCount(long j5);

    Flow<Integer> getCountAsFlow();

    Flow<Integer> getCountAsFlow(long j5);

    HeartSignalMeasurement getHeartSignal(long j5);

    LiveData<HeartSignalMeasurement> getHeartSignalLiveData(long j5);

    HeartSignalMeasurement getLastHeartSignal(long j5, int... iArr);

    long getLastModifiedSyncedToWsForUserId(long j5);

    long getLastUpdate(long j5);

    HeartSignalMeasurement getNotDeletedBySignalId(long j5);

    HeartSignalMeasurement getNotDeletedHeartSignal(long j5);

    List<SignalIdByUserId> getNotDeletedHeartSignal();

    List<HeartSignalMeasurement> getNotSyncedSignalsForUser(long j5);

    List<HeartSignalMeasurement> getSignalsForUserIdBetween(long j5, long j11, long j12);

    List<HeartSignalMeasurement> getSignalsWithType(long j5, int... iArr);

    List<HeartSignalMeasurement> getSignalsWithTypeBetween(long j5, long j11, long j12, int... iArr);

    Flow<List<HeartSignalMeasurement>> getSignalsWithTypeFlow(long j5, int... iArr);

    LiveData<List<HeartSignalMeasurement>> getSignalsWithTypeLiveData(long j5, int... iArr);

    int hasInReviewEcg(long j5, long j11, int... iArr);

    int hasInReviewEcg(long j5, int... iArr);

    long insert(HeartSignalMeasurement heartSignalMeasurement);

    void update(HeartSignalMeasurement heartSignalMeasurement);
}
