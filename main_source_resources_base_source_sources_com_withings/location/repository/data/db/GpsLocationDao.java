package com.withings.location.repository.data.db;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.location.repository.data.model.GpsLocationEntity;
import com.withings.location.repository.data.model.MinMaxDates;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
/* compiled from: GpsLocationDao.kt */
@Singleton
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010 \u001a\u00020\u0001¢\u0006\u0004\b)\u0010*J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/withings/location/repository/data/db/GpsLocationDao;", "Lcom/withings/location/repository/data/db/RoomGpsLocationDao;", "", "Lcom/withings/location/repository/data/model/GpsLocationEntity;", "locations", "Lnm0/y;", "insertOrUpdate", "(Ljava/util/List;)V", "", NavigationArguments.USER_ID, "from", "to", "", "accuracy", "Lkotlinx/coroutines/flow/Flow;", "getForUserBetween", "(JJJF)Lkotlinx/coroutines/flow/Flow;", "getForUserAfter", "(JJF)Lkotlinx/coroutines/flow/Flow;", "getForUserBefore", "Lcom/withings/location/repository/data/model/MinMaxDates;", "getFirstAndLastNotSyncedDatesForUser", "(J)Lcom/withings/location/repository/data/model/MinMaxDates;", "getNotSyncedForUserBetweenDates", "(JJJ)Ljava/util/List;", "getLastSyncedForUser", "(J)Lcom/withings/location/repository/data/model/GpsLocationEntity;", "id", "deleteById", "(J)V", "deleteAll", "()V", "roomGpsLocationDao", "Lcom/withings/location/repository/data/db/RoomGpsLocationDao;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "mutableAddedLocationsEvents", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "getAddedLocationsEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "addedLocationsEvents", "<init>", "(Lcom/withings/location/repository/data/db/RoomGpsLocationDao;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class GpsLocationDao implements RoomGpsLocationDao {
    private final MutableSharedFlow<List<GpsLocationEntity>> mutableAddedLocationsEvents;
    private final RoomGpsLocationDao roomGpsLocationDao;

    @Inject
    public GpsLocationDao(RoomGpsLocationDao roomGpsLocationDao) {
        u.j(roomGpsLocationDao, "roomGpsLocationDao");
        this.roomGpsLocationDao = roomGpsLocationDao;
        this.mutableAddedLocationsEvents = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    @Override // com.withings.location.repository.data.db.RoomGpsLocationDao
    public void deleteAll() {
        this.roomGpsLocationDao.deleteAll();
    }

    @Override // com.withings.location.repository.data.db.RoomGpsLocationDao
    public void deleteById(long j5) {
        this.roomGpsLocationDao.deleteById(j5);
    }

    public final SharedFlow<List<GpsLocationEntity>> getAddedLocationsEvents() {
        return this.mutableAddedLocationsEvents;
    }

    @Override // com.withings.location.repository.data.db.RoomGpsLocationDao
    public MinMaxDates getFirstAndLastNotSyncedDatesForUser(long j5) {
        return this.roomGpsLocationDao.getFirstAndLastNotSyncedDatesForUser(j5);
    }

    @Override // com.withings.location.repository.data.db.RoomGpsLocationDao
    public Flow<List<GpsLocationEntity>> getForUserAfter(long j5, long j11, float f11) {
        return this.roomGpsLocationDao.getForUserAfter(j5, j11, f11);
    }

    @Override // com.withings.location.repository.data.db.RoomGpsLocationDao
    public Flow<List<GpsLocationEntity>> getForUserBefore(long j5, long j11, float f11) {
        return this.roomGpsLocationDao.getForUserBefore(j5, j11, f11);
    }

    @Override // com.withings.location.repository.data.db.RoomGpsLocationDao
    public Flow<List<GpsLocationEntity>> getForUserBetween(long j5, long j11, long j12, float f11) {
        return this.roomGpsLocationDao.getForUserBetween(j5, j11, j12, f11);
    }

    @Override // com.withings.location.repository.data.db.RoomGpsLocationDao
    public GpsLocationEntity getLastSyncedForUser(long j5) {
        return this.roomGpsLocationDao.getLastSyncedForUser(j5);
    }

    @Override // com.withings.location.repository.data.db.RoomGpsLocationDao
    public List<GpsLocationEntity> getNotSyncedForUserBetweenDates(long j5, long j11, long j12) {
        return this.roomGpsLocationDao.getNotSyncedForUserBetweenDates(j5, j11, j12);
    }

    @Override // com.withings.location.repository.data.db.RoomGpsLocationDao
    public void insertOrUpdate(List<GpsLocationEntity> locations) {
        u.j(locations, "locations");
        this.roomGpsLocationDao.insertOrUpdate(locations);
        this.mutableAddedLocationsEvents.tryEmit(locations);
    }
}
