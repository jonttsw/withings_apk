package com.withings.screen.repository.data.db;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.d0;
import androidx.room.g;
import androidx.room.h0;
import androidx.room.k;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.screen.repository.data.model.DeviceScreenContentEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import nm0.y;
import qm0.d;
import x8.a;
import x8.b;
import z8.f;
/* loaded from: classes4.dex */
public final class DeviceScreenContentDao_RoomDb_Impl implements DeviceScreenContentDao {
    private final RoomDatabase __db;
    private final k<DeviceScreenContentEntity> __insertionAdapterOfDeviceScreenContentEntity;
    private final h0 __preparedStmtOfClear;
    private final h0 __preparedStmtOfClearFor;
    private final h0 __preparedStmtOfClear_1;

    public DeviceScreenContentDao_RoomDb_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfDeviceScreenContentEntity = new k<DeviceScreenContentEntity>(roomDatabase) { // from class: com.withings.screen.repository.data.db.DeviceScreenContentDao_RoomDb_Impl.1
            @Override // androidx.room.h0
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `DeviceScreenContent` (`id`,`deviceId`,`userId`,`screenWsId`,`displayStyle`,`message`,`startDate`,`endDate`,`modified`,`syncedWithDevice`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.k
            public void bind(f fVar, DeviceScreenContentEntity deviceScreenContentEntity) {
                fVar.v(1, deviceScreenContentEntity.getId());
                fVar.v(2, deviceScreenContentEntity.getDeviceId());
                fVar.v(3, deviceScreenContentEntity.getUserId());
                fVar.v(4, deviceScreenContentEntity.getScreenWsId());
                fVar.v(5, deviceScreenContentEntity.getDisplayStyle());
                fVar.s(6, deviceScreenContentEntity.getMessage());
                if (deviceScreenContentEntity.getStartDate() == null) {
                    fVar.g2(7);
                } else {
                    fVar.v(7, deviceScreenContentEntity.getStartDate().longValue());
                }
                if (deviceScreenContentEntity.getEndDate() == null) {
                    fVar.g2(8);
                } else {
                    fVar.v(8, deviceScreenContentEntity.getEndDate().longValue());
                }
                fVar.v(9, deviceScreenContentEntity.getModified());
                fVar.v(10, deviceScreenContentEntity.getSyncedWithDevice() ? 1L : 0L);
            }
        };
        this.__preparedStmtOfClearFor = new h0(roomDatabase) { // from class: com.withings.screen.repository.data.db.DeviceScreenContentDao_RoomDb_Impl.2
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM devicescreencontent WHERE userId = ? AND deviceId = ?";
            }
        };
        this.__preparedStmtOfClear = new h0(roomDatabase) { // from class: com.withings.screen.repository.data.db.DeviceScreenContentDao_RoomDb_Impl.3
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM devicescreencontent WHERE deviceId = ?";
            }
        };
        this.__preparedStmtOfClear_1 = new h0(roomDatabase) { // from class: com.withings.screen.repository.data.db.DeviceScreenContentDao_RoomDb_Impl.4
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM devicescreencontent";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.withings.screen.repository.data.db.DeviceScreenContentDao
    public Object clear(final long j5, d<? super y> dVar) {
        return g.c(this.__db, new Callable<y>() { // from class: com.withings.screen.repository.data.db.DeviceScreenContentDao_RoomDb_Impl.7
            @Override // java.util.concurrent.Callable
            public y call() throws Exception {
                f acquire = DeviceScreenContentDao_RoomDb_Impl.this.__preparedStmtOfClear.acquire();
                acquire.v(1, j5);
                try {
                    DeviceScreenContentDao_RoomDb_Impl.this.__db.c();
                    acquire.H();
                    DeviceScreenContentDao_RoomDb_Impl.this.__db.z();
                    y yVar = y.f85009a;
                    DeviceScreenContentDao_RoomDb_Impl.this.__db.h();
                    return yVar;
                } finally {
                    DeviceScreenContentDao_RoomDb_Impl.this.__preparedStmtOfClear.release(acquire);
                }
            }
        }, dVar);
    }

    @Override // com.withings.screen.repository.data.db.DeviceScreenContentDao
    public Object clearFor(final long j5, final long j11, d<? super y> dVar) {
        return g.c(this.__db, new Callable<y>() { // from class: com.withings.screen.repository.data.db.DeviceScreenContentDao_RoomDb_Impl.6
            @Override // java.util.concurrent.Callable
            public y call() throws Exception {
                f acquire = DeviceScreenContentDao_RoomDb_Impl.this.__preparedStmtOfClearFor.acquire();
                acquire.v(1, j5);
                acquire.v(2, j11);
                try {
                    DeviceScreenContentDao_RoomDb_Impl.this.__db.c();
                    acquire.H();
                    DeviceScreenContentDao_RoomDb_Impl.this.__db.z();
                    y yVar = y.f85009a;
                    DeviceScreenContentDao_RoomDb_Impl.this.__db.h();
                    return yVar;
                } finally {
                    DeviceScreenContentDao_RoomDb_Impl.this.__preparedStmtOfClearFor.release(acquire);
                }
            }
        }, dVar);
    }

    @Override // com.withings.screen.repository.data.db.DeviceScreenContentDao
    public Flow<List<DeviceScreenContentEntity>> get(long j5, long j11) {
        final d0 c11 = d0.c(2, "SELECT * FROM devicescreencontent WHERE userId = ? AND deviceId = ?");
        c11.v(1, j5);
        c11.v(2, j11);
        return g.a(this.__db, false, new String[]{"devicescreencontent"}, new Callable<List<DeviceScreenContentEntity>>() { // from class: com.withings.screen.repository.data.db.DeviceScreenContentDao_RoomDb_Impl.9
            protected void finalize() {
                c11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<DeviceScreenContentEntity> call() throws Exception {
                Cursor c12 = b.c(DeviceScreenContentDao_RoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "id");
                    int b11 = a.b(c12, "deviceId");
                    int b12 = a.b(c12, NavigationArguments.USER_ID);
                    int b13 = a.b(c12, "screenWsId");
                    int b14 = a.b(c12, "displayStyle");
                    int b15 = a.b(c12, "message");
                    int b16 = a.b(c12, "startDate");
                    int b17 = a.b(c12, "endDate");
                    int b18 = a.b(c12, "modified");
                    int b19 = a.b(c12, "syncedWithDevice");
                    ArrayList arrayList = new ArrayList(c12.getCount());
                    while (c12.moveToNext()) {
                        arrayList.add(new DeviceScreenContentEntity(c12.getLong(b10), c12.getLong(b11), c12.getLong(b12), c12.getLong(b13), c12.getInt(b14), c12.getString(b15), c12.isNull(b16) ? null : Long.valueOf(c12.getLong(b16)), c12.isNull(b17) ? null : Long.valueOf(c12.getLong(b17)), c12.getLong(b18), c12.getInt(b19) != 0));
                    }
                    return arrayList;
                } finally {
                    c12.close();
                }
            }
        });
    }

    @Override // com.withings.screen.repository.data.db.DeviceScreenContentDao
    public Object insertOrUpdate(final List<DeviceScreenContentEntity> list, d<? super y> dVar) {
        return g.c(this.__db, new Callable<y>() { // from class: com.withings.screen.repository.data.db.DeviceScreenContentDao_RoomDb_Impl.5
            @Override // java.util.concurrent.Callable
            public y call() throws Exception {
                DeviceScreenContentDao_RoomDb_Impl.this.__db.c();
                try {
                    DeviceScreenContentDao_RoomDb_Impl.this.__insertionAdapterOfDeviceScreenContentEntity.insert((Iterable) list);
                    DeviceScreenContentDao_RoomDb_Impl.this.__db.z();
                    return y.f85009a;
                } finally {
                    DeviceScreenContentDao_RoomDb_Impl.this.__db.h();
                }
            }
        }, dVar);
    }

    @Override // com.withings.screen.repository.data.db.DeviceScreenContentDao
    public Object clear(d<? super y> dVar) {
        return g.c(this.__db, new Callable<y>() { // from class: com.withings.screen.repository.data.db.DeviceScreenContentDao_RoomDb_Impl.8
            @Override // java.util.concurrent.Callable
            public y call() throws Exception {
                f acquire = DeviceScreenContentDao_RoomDb_Impl.this.__preparedStmtOfClear_1.acquire();
                try {
                    DeviceScreenContentDao_RoomDb_Impl.this.__db.c();
                    acquire.H();
                    DeviceScreenContentDao_RoomDb_Impl.this.__db.z();
                    y yVar = y.f85009a;
                    DeviceScreenContentDao_RoomDb_Impl.this.__db.h();
                    return yVar;
                } finally {
                    DeviceScreenContentDao_RoomDb_Impl.this.__preparedStmtOfClear_1.release(acquire);
                }
            }
        }, dVar);
    }

    @Override // com.withings.screen.repository.data.db.DeviceScreenContentDao
    public Flow<List<DeviceScreenContentEntity>> get(long j5) {
        final d0 c11 = d0.c(1, "SELECT * FROM devicescreencontent WHERE deviceId = ?");
        c11.v(1, j5);
        return g.a(this.__db, false, new String[]{"devicescreencontent"}, new Callable<List<DeviceScreenContentEntity>>() { // from class: com.withings.screen.repository.data.db.DeviceScreenContentDao_RoomDb_Impl.10
            protected void finalize() {
                c11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<DeviceScreenContentEntity> call() throws Exception {
                Cursor c12 = b.c(DeviceScreenContentDao_RoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "id");
                    int b11 = a.b(c12, "deviceId");
                    int b12 = a.b(c12, NavigationArguments.USER_ID);
                    int b13 = a.b(c12, "screenWsId");
                    int b14 = a.b(c12, "displayStyle");
                    int b15 = a.b(c12, "message");
                    int b16 = a.b(c12, "startDate");
                    int b17 = a.b(c12, "endDate");
                    int b18 = a.b(c12, "modified");
                    int b19 = a.b(c12, "syncedWithDevice");
                    ArrayList arrayList = new ArrayList(c12.getCount());
                    while (c12.moveToNext()) {
                        arrayList.add(new DeviceScreenContentEntity(c12.getLong(b10), c12.getLong(b11), c12.getLong(b12), c12.getLong(b13), c12.getInt(b14), c12.getString(b15), c12.isNull(b16) ? null : Long.valueOf(c12.getLong(b16)), c12.isNull(b17) ? null : Long.valueOf(c12.getLong(b17)), c12.getLong(b18), c12.getInt(b19) != 0));
                    }
                    return arrayList;
                } finally {
                    c12.close();
                }
            }
        });
    }
}
