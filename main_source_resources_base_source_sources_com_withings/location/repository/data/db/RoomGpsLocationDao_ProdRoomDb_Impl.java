package com.withings.location.repository.data.db;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.d0;
import androidx.room.g;
import androidx.room.h0;
import androidx.room.k;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.location.repository.data.model.GpsLocationEntity;
import com.withings.location.repository.data.model.MinMaxDates;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import org.joda.time.DateTime;
import pm.b;
import x8.a;
import z8.f;
/* loaded from: classes4.dex */
public final class RoomGpsLocationDao_ProdRoomDb_Impl implements RoomGpsLocationDao {
    private final b __commonRoomConverter = new b();
    private final RoomDatabase __db;
    private final k<GpsLocationEntity> __insertionAdapterOfGpsLocationEntity;
    private final h0 __preparedStmtOfDeleteAll;
    private final h0 __preparedStmtOfDeleteById;

    public RoomGpsLocationDao_ProdRoomDb_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfGpsLocationEntity = new k<GpsLocationEntity>(roomDatabase) { // from class: com.withings.location.repository.data.db.RoomGpsLocationDao_ProdRoomDb_Impl.1
            @Override // androidx.room.h0
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `WorkoutLocation` (`id`,`userId`,`date`,`speed`,`horizontalAccuracy`,`altitude`,`verticalAccuracy`,`latitude`,`longitude`,`speedAccuracy`,`course`,`courseAccuracy`,`synced`,`deviceId`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.k
            public void bind(f fVar, GpsLocationEntity gpsLocationEntity) {
                if (gpsLocationEntity.getId() == null) {
                    fVar.g2(1);
                } else {
                    fVar.v(1, gpsLocationEntity.getId().longValue());
                }
                fVar.v(2, gpsLocationEntity.getUserId());
                b bVar = RoomGpsLocationDao_ProdRoomDb_Impl.this.__commonRoomConverter;
                DateTime date = gpsLocationEntity.getDate();
                bVar.getClass();
                Long e11 = b.e(date);
                if (e11 == null) {
                    fVar.g2(3);
                } else {
                    fVar.v(3, e11.longValue());
                }
                fVar.f2(gpsLocationEntity.getSpeed(), 4);
                fVar.f2(gpsLocationEntity.getHorizontalAccuracy(), 5);
                fVar.f2(gpsLocationEntity.getAltitude(), 6);
                fVar.f2(gpsLocationEntity.getVerticalAccuracy(), 7);
                fVar.f2(gpsLocationEntity.getLatitude(), 8);
                fVar.f2(gpsLocationEntity.getLongitude(), 9);
                fVar.f2(gpsLocationEntity.getSpeedAccuracy(), 10);
                fVar.f2(gpsLocationEntity.getCourse(), 11);
                fVar.f2(gpsLocationEntity.getCourseAccuracy(), 12);
                fVar.v(13, gpsLocationEntity.getSynced() ? 1L : 0L);
                fVar.v(14, gpsLocationEntity.getDeviceId());
            }
        };
        this.__preparedStmtOfDeleteById = new h0(roomDatabase) { // from class: com.withings.location.repository.data.db.RoomGpsLocationDao_ProdRoomDb_Impl.2
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM workoutLocation WHERE id = ?";
            }
        };
        this.__preparedStmtOfDeleteAll = new h0(roomDatabase) { // from class: com.withings.location.repository.data.db.RoomGpsLocationDao_ProdRoomDb_Impl.3
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM workoutLocation";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.withings.location.repository.data.db.RoomGpsLocationDao
    public void deleteAll() {
        this.__db.b();
        f acquire = this.__preparedStmtOfDeleteAll.acquire();
        try {
            this.__db.c();
            acquire.H();
            this.__db.z();
            this.__db.h();
        } finally {
            this.__preparedStmtOfDeleteAll.release(acquire);
        }
    }

    @Override // com.withings.location.repository.data.db.RoomGpsLocationDao
    public void deleteById(long j5) {
        this.__db.b();
        f acquire = this.__preparedStmtOfDeleteById.acquire();
        acquire.v(1, j5);
        try {
            this.__db.c();
            acquire.H();
            this.__db.z();
            this.__db.h();
        } finally {
            this.__preparedStmtOfDeleteById.release(acquire);
        }
    }

    @Override // com.withings.location.repository.data.db.RoomGpsLocationDao
    public MinMaxDates getFirstAndLastNotSyncedDatesForUser(long j5) {
        Long valueOf;
        d0 c11 = d0.c(1, "SELECT MIN(date) as minValue, MAX(date) as maxValue FROM workoutLocation WHERE userId = ? AND NOT synced ORDER BY date");
        c11.v(1, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            MinMaxDates minMaxDates = null;
            Long valueOf2 = null;
            if (c12.moveToFirst()) {
                if (c12.isNull(0)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(c12.getLong(0));
                }
                if (!c12.isNull(1)) {
                    valueOf2 = Long.valueOf(c12.getLong(1));
                }
                minMaxDates = new MinMaxDates(valueOf, valueOf2);
            }
            return minMaxDates;
        } finally {
            c12.close();
            c11.release();
        }
    }

    @Override // com.withings.location.repository.data.db.RoomGpsLocationDao
    public Flow<List<GpsLocationEntity>> getForUserAfter(long j5, long j11, float f11) {
        final d0 c11 = d0.c(3, "SELECT * FROM workoutLocation WHERE userId = ? AND date >= ? AND horizontalAccuracy <= ? ORDER BY date");
        c11.v(1, j5);
        c11.v(2, j11);
        c11.f2(f11, 3);
        return g.a(this.__db, false, new String[]{"workoutLocation"}, new Callable<List<GpsLocationEntity>>() { // from class: com.withings.location.repository.data.db.RoomGpsLocationDao_ProdRoomDb_Impl.5
            protected void finalize() {
                c11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<GpsLocationEntity> call() throws Exception {
                Cursor c12 = x8.b.c(RoomGpsLocationDao_ProdRoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "id");
                    int b11 = a.b(c12, NavigationArguments.USER_ID);
                    int b12 = a.b(c12, "date");
                    int b13 = a.b(c12, "speed");
                    int b14 = a.b(c12, "horizontalAccuracy");
                    int b15 = a.b(c12, "altitude");
                    int b16 = a.b(c12, FusedLocationProviderClient.KEY_VERTICAL_ACCURACY);
                    int b17 = a.b(c12, "latitude");
                    int b18 = a.b(c12, "longitude");
                    int b19 = a.b(c12, "speedAccuracy");
                    int b21 = a.b(c12, "course");
                    int b22 = a.b(c12, "courseAccuracy");
                    int b23 = a.b(c12, "synced");
                    int b24 = a.b(c12, "deviceId");
                    int i11 = b23;
                    ArrayList arrayList = new ArrayList(c12.getCount());
                    while (c12.moveToNext()) {
                        Long l5 = null;
                        Long valueOf = c12.isNull(b10) ? null : Long.valueOf(c12.getLong(b10));
                        long j12 = c12.getLong(b11);
                        if (!c12.isNull(b12)) {
                            l5 = Long.valueOf(c12.getLong(b12));
                        }
                        RoomGpsLocationDao_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a11 = b.a(l5);
                        if (a11 != null) {
                            int i12 = i11;
                            int i13 = b24;
                            int i14 = b10;
                            arrayList.add(new GpsLocationEntity(valueOf, j12, a11, c12.getFloat(b13), c12.getFloat(b14), c12.getDouble(b15), c12.getFloat(b16), c12.getDouble(b17), c12.getDouble(b18), c12.getFloat(b19), c12.getFloat(b21), c12.getFloat(b22), c12.getInt(i12) != 0, c12.getLong(i13)));
                            b10 = i14;
                            b24 = i13;
                            i11 = i12;
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
                    }
                    c12.close();
                    return arrayList;
                } catch (Throwable th2) {
                    c12.close();
                    throw th2;
                }
            }
        });
    }

    @Override // com.withings.location.repository.data.db.RoomGpsLocationDao
    public Flow<List<GpsLocationEntity>> getForUserBefore(long j5, long j11, float f11) {
        final d0 c11 = d0.c(3, "SELECT * FROM workoutLocation WHERE userId = ? AND date <= ? AND horizontalAccuracy <= ? ORDER BY date");
        c11.v(1, j5);
        c11.v(2, j11);
        c11.f2(f11, 3);
        return g.a(this.__db, false, new String[]{"workoutLocation"}, new Callable<List<GpsLocationEntity>>() { // from class: com.withings.location.repository.data.db.RoomGpsLocationDao_ProdRoomDb_Impl.6
            protected void finalize() {
                c11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<GpsLocationEntity> call() throws Exception {
                Cursor c12 = x8.b.c(RoomGpsLocationDao_ProdRoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "id");
                    int b11 = a.b(c12, NavigationArguments.USER_ID);
                    int b12 = a.b(c12, "date");
                    int b13 = a.b(c12, "speed");
                    int b14 = a.b(c12, "horizontalAccuracy");
                    int b15 = a.b(c12, "altitude");
                    int b16 = a.b(c12, FusedLocationProviderClient.KEY_VERTICAL_ACCURACY);
                    int b17 = a.b(c12, "latitude");
                    int b18 = a.b(c12, "longitude");
                    int b19 = a.b(c12, "speedAccuracy");
                    int b21 = a.b(c12, "course");
                    int b22 = a.b(c12, "courseAccuracy");
                    int b23 = a.b(c12, "synced");
                    int b24 = a.b(c12, "deviceId");
                    int i11 = b23;
                    ArrayList arrayList = new ArrayList(c12.getCount());
                    while (c12.moveToNext()) {
                        Long l5 = null;
                        Long valueOf = c12.isNull(b10) ? null : Long.valueOf(c12.getLong(b10));
                        long j12 = c12.getLong(b11);
                        if (!c12.isNull(b12)) {
                            l5 = Long.valueOf(c12.getLong(b12));
                        }
                        RoomGpsLocationDao_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a11 = b.a(l5);
                        if (a11 != null) {
                            int i12 = i11;
                            int i13 = b24;
                            int i14 = b10;
                            arrayList.add(new GpsLocationEntity(valueOf, j12, a11, c12.getFloat(b13), c12.getFloat(b14), c12.getDouble(b15), c12.getFloat(b16), c12.getDouble(b17), c12.getDouble(b18), c12.getFloat(b19), c12.getFloat(b21), c12.getFloat(b22), c12.getInt(i12) != 0, c12.getLong(i13)));
                            b10 = i14;
                            b24 = i13;
                            i11 = i12;
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
                    }
                    c12.close();
                    return arrayList;
                } catch (Throwable th2) {
                    c12.close();
                    throw th2;
                }
            }
        });
    }

    @Override // com.withings.location.repository.data.db.RoomGpsLocationDao
    public Flow<List<GpsLocationEntity>> getForUserBetween(long j5, long j11, long j12, float f11) {
        final d0 c11 = d0.c(4, "SELECT * FROM workoutLocation WHERE userId = ? AND date BETWEEN ? AND ? AND horizontalAccuracy <= ? ORDER BY date");
        c11.v(1, j5);
        c11.v(2, j11);
        c11.v(3, j12);
        c11.f2(f11, 4);
        return g.a(this.__db, false, new String[]{"workoutLocation"}, new Callable<List<GpsLocationEntity>>() { // from class: com.withings.location.repository.data.db.RoomGpsLocationDao_ProdRoomDb_Impl.4
            protected void finalize() {
                c11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<GpsLocationEntity> call() throws Exception {
                Cursor c12 = x8.b.c(RoomGpsLocationDao_ProdRoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "id");
                    int b11 = a.b(c12, NavigationArguments.USER_ID);
                    int b12 = a.b(c12, "date");
                    int b13 = a.b(c12, "speed");
                    int b14 = a.b(c12, "horizontalAccuracy");
                    int b15 = a.b(c12, "altitude");
                    int b16 = a.b(c12, FusedLocationProviderClient.KEY_VERTICAL_ACCURACY);
                    int b17 = a.b(c12, "latitude");
                    int b18 = a.b(c12, "longitude");
                    int b19 = a.b(c12, "speedAccuracy");
                    int b21 = a.b(c12, "course");
                    int b22 = a.b(c12, "courseAccuracy");
                    int b23 = a.b(c12, "synced");
                    int b24 = a.b(c12, "deviceId");
                    int i11 = b23;
                    ArrayList arrayList = new ArrayList(c12.getCount());
                    while (c12.moveToNext()) {
                        Long l5 = null;
                        Long valueOf = c12.isNull(b10) ? null : Long.valueOf(c12.getLong(b10));
                        long j13 = c12.getLong(b11);
                        if (!c12.isNull(b12)) {
                            l5 = Long.valueOf(c12.getLong(b12));
                        }
                        RoomGpsLocationDao_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a11 = b.a(l5);
                        if (a11 != null) {
                            int i12 = i11;
                            int i13 = b24;
                            int i14 = b10;
                            arrayList.add(new GpsLocationEntity(valueOf, j13, a11, c12.getFloat(b13), c12.getFloat(b14), c12.getDouble(b15), c12.getFloat(b16), c12.getDouble(b17), c12.getDouble(b18), c12.getFloat(b19), c12.getFloat(b21), c12.getFloat(b22), c12.getInt(i12) != 0, c12.getLong(i13)));
                            b10 = i14;
                            b24 = i13;
                            i11 = i12;
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
                    }
                    c12.close();
                    return arrayList;
                } catch (Throwable th2) {
                    c12.close();
                    throw th2;
                }
            }
        });
    }

    @Override // com.withings.location.repository.data.db.RoomGpsLocationDao
    public GpsLocationEntity getLastSyncedForUser(long j5) {
        d0 d0Var;
        Long valueOf;
        boolean z5;
        d0 c11 = d0.c(1, "SELECT * FROM workoutLocation WHERE userId = ? AND synced ORDER BY date DESC LIMIT 1");
        c11.v(1, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "id");
            int b11 = a.b(c12, NavigationArguments.USER_ID);
            int b12 = a.b(c12, "date");
            int b13 = a.b(c12, "speed");
            int b14 = a.b(c12, "horizontalAccuracy");
            int b15 = a.b(c12, "altitude");
            int b16 = a.b(c12, FusedLocationProviderClient.KEY_VERTICAL_ACCURACY);
            int b17 = a.b(c12, "latitude");
            int b18 = a.b(c12, "longitude");
            int b19 = a.b(c12, "speedAccuracy");
            int b21 = a.b(c12, "course");
            int b22 = a.b(c12, "courseAccuracy");
            int b23 = a.b(c12, "synced");
            d0Var = c11;
            try {
                int b24 = a.b(c12, "deviceId");
                GpsLocationEntity gpsLocationEntity = null;
                Long valueOf2 = null;
                if (c12.moveToFirst()) {
                    if (c12.isNull(b10)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(c12.getLong(b10));
                    }
                    long j11 = c12.getLong(b11);
                    if (!c12.isNull(b12)) {
                        valueOf2 = Long.valueOf(c12.getLong(b12));
                    }
                    this.__commonRoomConverter.getClass();
                    DateTime a11 = b.a(valueOf2);
                    if (a11 != null) {
                        float f11 = c12.getFloat(b13);
                        float f12 = c12.getFloat(b14);
                        double d11 = c12.getDouble(b15);
                        float f13 = c12.getFloat(b16);
                        double d12 = c12.getDouble(b17);
                        double d13 = c12.getDouble(b18);
                        float f14 = c12.getFloat(b19);
                        float f15 = c12.getFloat(b21);
                        float f16 = c12.getFloat(b22);
                        if (c12.getInt(b23) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        gpsLocationEntity = new GpsLocationEntity(valueOf, j11, a11, f11, f12, d11, f13, d12, d13, f14, f15, f16, z5, c12.getLong(b24));
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                    }
                }
                c12.close();
                d0Var.release();
                return gpsLocationEntity;
            } catch (Throwable th2) {
                th = th2;
                c12.close();
                d0Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            d0Var = c11;
        }
    }

    @Override // com.withings.location.repository.data.db.RoomGpsLocationDao
    public List<GpsLocationEntity> getNotSyncedForUserBetweenDates(long j5, long j11, long j12) {
        d0 d0Var;
        Long valueOf;
        boolean z5;
        d0 c11 = d0.c(3, "SELECT * FROM workoutLocation WHERE userId = ? AND NOT synced AND date BETWEEN ? AND ? ORDER BY date");
        c11.v(1, j5);
        c11.v(2, j11);
        c11.v(3, j12);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "id");
            int b11 = a.b(c12, NavigationArguments.USER_ID);
            int b12 = a.b(c12, "date");
            int b13 = a.b(c12, "speed");
            int b14 = a.b(c12, "horizontalAccuracy");
            int b15 = a.b(c12, "altitude");
            int b16 = a.b(c12, FusedLocationProviderClient.KEY_VERTICAL_ACCURACY);
            int b17 = a.b(c12, "latitude");
            int b18 = a.b(c12, "longitude");
            int b19 = a.b(c12, "speedAccuracy");
            int b21 = a.b(c12, "course");
            int b22 = a.b(c12, "courseAccuracy");
            int b23 = a.b(c12, "synced");
            d0Var = c11;
            try {
                int b24 = a.b(c12, "deviceId");
                int i11 = b23;
                ArrayList arrayList = new ArrayList(c12.getCount());
                while (c12.moveToNext()) {
                    Long l5 = null;
                    if (c12.isNull(b10)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(c12.getLong(b10));
                    }
                    long j13 = c12.getLong(b11);
                    if (!c12.isNull(b12)) {
                        l5 = Long.valueOf(c12.getLong(b12));
                    }
                    this.__commonRoomConverter.getClass();
                    DateTime a11 = b.a(l5);
                    if (a11 != null) {
                        float f11 = c12.getFloat(b13);
                        float f12 = c12.getFloat(b14);
                        double d11 = c12.getDouble(b15);
                        float f13 = c12.getFloat(b16);
                        double d12 = c12.getDouble(b17);
                        double d13 = c12.getDouble(b18);
                        float f14 = c12.getFloat(b19);
                        float f15 = c12.getFloat(b21);
                        float f16 = c12.getFloat(b22);
                        int i12 = i11;
                        if (c12.getInt(i12) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        int i13 = b22;
                        int i14 = b24;
                        arrayList.add(new GpsLocationEntity(valueOf, j13, a11, f11, f12, d11, f13, d12, d13, f14, f15, f16, z5, c12.getLong(i14)));
                        b22 = i13;
                        i11 = i12;
                        b24 = i14;
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                    }
                }
                c12.close();
                d0Var.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                c12.close();
                d0Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            d0Var = c11;
        }
    }

    @Override // com.withings.location.repository.data.db.RoomGpsLocationDao
    public void insertOrUpdate(List<GpsLocationEntity> list) {
        this.__db.b();
        this.__db.c();
        try {
            this.__insertionAdapterOfGpsLocationEntity.insert(list);
            this.__db.z();
        } finally {
            this.__db.h();
        }
    }
}
