package com.withings.screen.repository.data.db;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.d0;
import androidx.room.g;
import androidx.room.h0;
import androidx.room.k;
import com.withings.screen.repository.data.model.DeviceScreensGroupEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import nm0.y;
import org.joda.time.DateTime;
import pm.b;
import qm0.d;
import x8.a;
import z8.f;
/* loaded from: classes4.dex */
public final class DeviceScreensGroupDao_RoomDb_Impl implements DeviceScreensGroupDao {
    private final b __commonRoomConverter = new b();
    private final RoomDatabase __db;
    private final k<DeviceScreensGroupEntity> __insertionAdapterOfDeviceScreensGroupEntity;
    private final h0 __preparedStmtOfClear;
    private final h0 __preparedStmtOfClear_1;

    public DeviceScreensGroupDao_RoomDb_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfDeviceScreensGroupEntity = new k<DeviceScreensGroupEntity>(roomDatabase) { // from class: com.withings.screen.repository.data.db.DeviceScreensGroupDao_RoomDb_Impl.1
            @Override // androidx.room.h0
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `DeviceScreensGroup` (`id`,`name`,`modified`,`deviceId`,`deleted`,`rank`) VALUES (?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.k
            public void bind(f fVar, DeviceScreensGroupEntity deviceScreensGroupEntity) {
                fVar.v(1, deviceScreensGroupEntity.getId());
                fVar.s(2, deviceScreensGroupEntity.getName());
                b bVar = DeviceScreensGroupDao_RoomDb_Impl.this.__commonRoomConverter;
                DateTime modified = deviceScreensGroupEntity.getModified();
                bVar.getClass();
                Long e11 = b.e(modified);
                if (e11 == null) {
                    fVar.g2(3);
                } else {
                    fVar.v(3, e11.longValue());
                }
                fVar.v(4, deviceScreensGroupEntity.getDeviceId());
                fVar.v(5, deviceScreensGroupEntity.getDeleted() ? 1L : 0L);
                fVar.v(6, deviceScreensGroupEntity.getRank());
            }
        };
        this.__preparedStmtOfClear = new h0(roomDatabase) { // from class: com.withings.screen.repository.data.db.DeviceScreensGroupDao_RoomDb_Impl.2
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM devicescreensgroup WHERE deviceId = ?";
            }
        };
        this.__preparedStmtOfClear_1 = new h0(roomDatabase) { // from class: com.withings.screen.repository.data.db.DeviceScreensGroupDao_RoomDb_Impl.3
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM devicescreensgroup";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.withings.screen.repository.data.db.DeviceScreensGroupDao
    public Object clear(final long j5, d<? super y> dVar) {
        return g.c(this.__db, new Callable<y>() { // from class: com.withings.screen.repository.data.db.DeviceScreensGroupDao_RoomDb_Impl.5
            @Override // java.util.concurrent.Callable
            public y call() throws Exception {
                f acquire = DeviceScreensGroupDao_RoomDb_Impl.this.__preparedStmtOfClear.acquire();
                acquire.v(1, j5);
                try {
                    DeviceScreensGroupDao_RoomDb_Impl.this.__db.c();
                    acquire.H();
                    DeviceScreensGroupDao_RoomDb_Impl.this.__db.z();
                    y yVar = y.f85009a;
                    DeviceScreensGroupDao_RoomDb_Impl.this.__db.h();
                    return yVar;
                } finally {
                    DeviceScreensGroupDao_RoomDb_Impl.this.__preparedStmtOfClear.release(acquire);
                }
            }
        }, dVar);
    }

    @Override // com.withings.screen.repository.data.db.DeviceScreensGroupDao
    public Flow<List<DeviceScreensGroupEntity>> get(long j5) {
        final d0 c11 = d0.c(1, "SELECT * FROM devicescreensgroup WHERE deviceId = ?");
        c11.v(1, j5);
        return g.a(this.__db, false, new String[]{"devicescreensgroup"}, new Callable<List<DeviceScreensGroupEntity>>() { // from class: com.withings.screen.repository.data.db.DeviceScreensGroupDao_RoomDb_Impl.7
            protected void finalize() {
                c11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<DeviceScreensGroupEntity> call() throws Exception {
                Cursor c12 = x8.b.c(DeviceScreensGroupDao_RoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "id");
                    int b11 = a.b(c12, "name");
                    int b12 = a.b(c12, "modified");
                    int b13 = a.b(c12, "deviceId");
                    int b14 = a.b(c12, "deleted");
                    int b15 = a.b(c12, "rank");
                    ArrayList arrayList = new ArrayList(c12.getCount());
                    while (c12.moveToNext()) {
                        long j11 = c12.getLong(b10);
                        String string = c12.getString(b11);
                        Long valueOf = c12.isNull(b12) ? null : Long.valueOf(c12.getLong(b12));
                        DeviceScreensGroupDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a11 = b.a(valueOf);
                        if (a11 != null) {
                            arrayList.add(new DeviceScreensGroupEntity(j11, string, a11, c12.getLong(b13), c12.getInt(b14) != 0, c12.getLong(b15)));
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

    @Override // com.withings.screen.repository.data.db.DeviceScreensGroupDao
    public Object insertOrUpdate(final List<DeviceScreensGroupEntity> list, d<? super y> dVar) {
        return g.c(this.__db, new Callable<y>() { // from class: com.withings.screen.repository.data.db.DeviceScreensGroupDao_RoomDb_Impl.4
            @Override // java.util.concurrent.Callable
            public y call() throws Exception {
                DeviceScreensGroupDao_RoomDb_Impl.this.__db.c();
                try {
                    DeviceScreensGroupDao_RoomDb_Impl.this.__insertionAdapterOfDeviceScreensGroupEntity.insert((Iterable) list);
                    DeviceScreensGroupDao_RoomDb_Impl.this.__db.z();
                    return y.f85009a;
                } finally {
                    DeviceScreensGroupDao_RoomDb_Impl.this.__db.h();
                }
            }
        }, dVar);
    }

    @Override // com.withings.screen.repository.data.db.DeviceScreensGroupDao
    public Object clear(d<? super y> dVar) {
        return g.c(this.__db, new Callable<y>() { // from class: com.withings.screen.repository.data.db.DeviceScreensGroupDao_RoomDb_Impl.6
            @Override // java.util.concurrent.Callable
            public y call() throws Exception {
                f acquire = DeviceScreensGroupDao_RoomDb_Impl.this.__preparedStmtOfClear_1.acquire();
                try {
                    DeviceScreensGroupDao_RoomDb_Impl.this.__db.c();
                    acquire.H();
                    DeviceScreensGroupDao_RoomDb_Impl.this.__db.z();
                    y yVar = y.f85009a;
                    DeviceScreensGroupDao_RoomDb_Impl.this.__db.h();
                    return yVar;
                } finally {
                    DeviceScreensGroupDao_RoomDb_Impl.this.__preparedStmtOfClear_1.release(acquire);
                }
            }
        }, dVar);
    }
}
