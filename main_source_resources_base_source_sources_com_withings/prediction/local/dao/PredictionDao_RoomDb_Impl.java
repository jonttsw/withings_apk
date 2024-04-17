package com.withings.prediction.local.dao;

import android.database.Cursor;
import androidx.camera.camera2.internal.v0;
import androidx.room.RoomDatabase;
import androidx.room.b0;
import androidx.room.d0;
import androidx.room.g;
import androidx.room.h0;
import androidx.room.k;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.prediction.local.model.PredictionEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import nm0.y;
import org.joda.time.Instant;
import pm.b;
import qm0.d;
import ym0.l;
import z8.f;
/* loaded from: classes4.dex */
public final class PredictionDao_RoomDb_Impl implements PredictionDao {
    private final b __commonRoomConverter = new b();
    private final RoomDatabase __db;
    private final k<PredictionEntity> __insertionAdapterOfPredictionEntity;
    private final h0 __preparedStmtOfClear;
    private final h0 __preparedStmtOfClearAllUnactivePredictions;
    private final h0 __preparedStmtOfClear_1;

    public PredictionDao_RoomDb_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfPredictionEntity = new k<PredictionEntity>(roomDatabase) { // from class: com.withings.prediction.local.dao.PredictionDao_RoomDb_Impl.1
            @Override // androidx.room.h0
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `prediction` (`wsId`,`userId`,`type`,`start`,`end`,`active`,`created`,`modified`) VALUES (?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.k
            public void bind(f fVar, PredictionEntity predictionEntity) {
                fVar.v(1, predictionEntity.getWsId());
                fVar.v(2, predictionEntity.getUserId());
                fVar.v(3, predictionEntity.getType());
                b bVar = PredictionDao_RoomDb_Impl.this.__commonRoomConverter;
                Instant start = predictionEntity.getStart();
                bVar.getClass();
                fVar.v(4, b.f(start));
                b bVar2 = PredictionDao_RoomDb_Impl.this.__commonRoomConverter;
                Instant end = predictionEntity.getEnd();
                bVar2.getClass();
                fVar.v(5, b.f(end));
                fVar.v(6, predictionEntity.getActive() ? 1L : 0L);
                b bVar3 = PredictionDao_RoomDb_Impl.this.__commonRoomConverter;
                Instant created = predictionEntity.getCreated();
                bVar3.getClass();
                fVar.v(7, b.f(created));
                b bVar4 = PredictionDao_RoomDb_Impl.this.__commonRoomConverter;
                Instant modified = predictionEntity.getModified();
                bVar4.getClass();
                fVar.v(8, b.f(modified));
            }
        };
        this.__preparedStmtOfClear = new h0(roomDatabase) { // from class: com.withings.prediction.local.dao.PredictionDao_RoomDb_Impl.2
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM PREDICTION";
            }
        };
        this.__preparedStmtOfClear_1 = new h0(roomDatabase) { // from class: com.withings.prediction.local.dao.PredictionDao_RoomDb_Impl.3
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM PREDICTION WHERE userId=?";
            }
        };
        this.__preparedStmtOfClearAllUnactivePredictions = new h0(roomDatabase) { // from class: com.withings.prediction.local.dao.PredictionDao_RoomDb_Impl.4
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM PREDICTION WHERE userId=? AND NOT active";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$replaceAll$0(List list, d dVar) {
        return super.replaceAll(list, dVar);
    }

    @Override // com.withings.prediction.local.dao.PredictionDao
    public Object clear(d<? super y> dVar) {
        return g.c(this.__db, new Callable<y>() { // from class: com.withings.prediction.local.dao.PredictionDao_RoomDb_Impl.7
            @Override // java.util.concurrent.Callable
            public y call() throws Exception {
                f acquire = PredictionDao_RoomDb_Impl.this.__preparedStmtOfClear.acquire();
                try {
                    PredictionDao_RoomDb_Impl.this.__db.c();
                    acquire.H();
                    PredictionDao_RoomDb_Impl.this.__db.z();
                    y yVar = y.f85009a;
                    PredictionDao_RoomDb_Impl.this.__db.h();
                    return yVar;
                } finally {
                    PredictionDao_RoomDb_Impl.this.__preparedStmtOfClear.release(acquire);
                }
            }
        }, dVar);
    }

    @Override // com.withings.prediction.local.dao.PredictionDao
    public Object clearAllUnactivePredictions(final long j5, d<? super y> dVar) {
        return g.c(this.__db, new Callable<y>() { // from class: com.withings.prediction.local.dao.PredictionDao_RoomDb_Impl.9
            @Override // java.util.concurrent.Callable
            public y call() throws Exception {
                f acquire = PredictionDao_RoomDb_Impl.this.__preparedStmtOfClearAllUnactivePredictions.acquire();
                acquire.v(1, j5);
                try {
                    PredictionDao_RoomDb_Impl.this.__db.c();
                    acquire.H();
                    PredictionDao_RoomDb_Impl.this.__db.z();
                    y yVar = y.f85009a;
                    PredictionDao_RoomDb_Impl.this.__db.h();
                    return yVar;
                } finally {
                    PredictionDao_RoomDb_Impl.this.__preparedStmtOfClearAllUnactivePredictions.release(acquire);
                }
            }
        }, dVar);
    }

    @Override // com.withings.prediction.local.dao.PredictionDao
    public Flow<List<PredictionEntity>> get(long j5) {
        final d0 c11 = d0.c(1, "SELECT * FROM PREDICTION WHERE userId = ?");
        c11.v(1, j5);
        return g.a(this.__db, false, new String[]{"PREDICTION"}, new Callable<List<PredictionEntity>>() { // from class: com.withings.prediction.local.dao.PredictionDao_RoomDb_Impl.10
            protected void finalize() {
                c11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<PredictionEntity> call() throws Exception {
                Cursor c12 = x8.b.c(PredictionDao_RoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = x8.a.b(c12, "wsId");
                    int b11 = x8.a.b(c12, NavigationArguments.USER_ID);
                    int b12 = x8.a.b(c12, "type");
                    int b13 = x8.a.b(c12, "start");
                    int b14 = x8.a.b(c12, "end");
                    int b15 = x8.a.b(c12, "active");
                    int b16 = x8.a.b(c12, ConstantsWs.JSON_ACCOUNT_KEY_CREATED);
                    int b17 = x8.a.b(c12, "modified");
                    ArrayList arrayList = new ArrayList(c12.getCount());
                    while (c12.moveToNext()) {
                        long j11 = c12.getLong(b10);
                        long j12 = c12.getLong(b11);
                        int i11 = c12.getInt(b12);
                        long j13 = c12.getLong(b13);
                        PredictionDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant instant = new Instant(j13);
                        long j14 = c12.getLong(b14);
                        int i12 = b10;
                        PredictionDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant instant2 = new Instant(j14);
                        boolean z5 = c12.getInt(b15) != 0;
                        long j15 = c12.getLong(b16);
                        int i13 = b11;
                        PredictionDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant instant3 = new Instant(j15);
                        long j16 = c12.getLong(b17);
                        int i14 = b12;
                        PredictionDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        arrayList.add(new PredictionEntity(j11, j12, i11, instant, instant2, z5, instant3, new Instant(j16)));
                        b10 = i12;
                        b11 = i13;
                        b12 = i14;
                    }
                    return arrayList;
                } finally {
                    c12.close();
                }
            }
        });
    }

    @Override // com.withings.prediction.local.dao.PredictionDao
    public Flow<List<PredictionEntity>> getActive(long j5) {
        final d0 c11 = d0.c(1, "SELECT * FROM PREDICTION WHERE userId = ? AND active");
        c11.v(1, j5);
        return g.a(this.__db, false, new String[]{"PREDICTION"}, new Callable<List<PredictionEntity>>() { // from class: com.withings.prediction.local.dao.PredictionDao_RoomDb_Impl.12
            protected void finalize() {
                c11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<PredictionEntity> call() throws Exception {
                Cursor c12 = x8.b.c(PredictionDao_RoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = x8.a.b(c12, "wsId");
                    int b11 = x8.a.b(c12, NavigationArguments.USER_ID);
                    int b12 = x8.a.b(c12, "type");
                    int b13 = x8.a.b(c12, "start");
                    int b14 = x8.a.b(c12, "end");
                    int b15 = x8.a.b(c12, "active");
                    int b16 = x8.a.b(c12, ConstantsWs.JSON_ACCOUNT_KEY_CREATED);
                    int b17 = x8.a.b(c12, "modified");
                    ArrayList arrayList = new ArrayList(c12.getCount());
                    while (c12.moveToNext()) {
                        long j11 = c12.getLong(b10);
                        long j12 = c12.getLong(b11);
                        int i11 = c12.getInt(b12);
                        long j13 = c12.getLong(b13);
                        PredictionDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant instant = new Instant(j13);
                        long j14 = c12.getLong(b14);
                        int i12 = b10;
                        PredictionDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant instant2 = new Instant(j14);
                        boolean z5 = c12.getInt(b15) != 0;
                        long j15 = c12.getLong(b16);
                        int i13 = b11;
                        PredictionDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant instant3 = new Instant(j15);
                        long j16 = c12.getLong(b17);
                        int i14 = b12;
                        PredictionDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        arrayList.add(new PredictionEntity(j11, j12, i11, instant, instant2, z5, instant3, new Instant(j16)));
                        b10 = i12;
                        b11 = i13;
                        b12 = i14;
                    }
                    return arrayList;
                } finally {
                    c12.close();
                }
            }
        });
    }

    @Override // com.withings.prediction.local.dao.PredictionDao
    public Object getLastModified(long j5, d<? super Instant> dVar) {
        final d0 c11 = d0.c(1, "SELECT MAX(modified) from PREDICTION where userId=?");
        return g.b(this.__db, v0.c(c11, 1, j5), new Callable<Instant>() { // from class: com.withings.prediction.local.dao.PredictionDao_RoomDb_Impl.14
            @Override // java.util.concurrent.Callable
            public Instant call() throws Exception {
                Cursor c12 = x8.b.c(PredictionDao_RoomDb_Impl.this.__db, c11, false);
                try {
                    Instant instant = null;
                    Long valueOf = null;
                    if (c12.moveToFirst()) {
                        if (!c12.isNull(0)) {
                            valueOf = Long.valueOf(c12.getLong(0));
                        }
                        PredictionDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        instant = b.d(valueOf);
                    }
                    return instant;
                } finally {
                    c12.close();
                    c11.release();
                }
            }
        }, dVar);
    }

    @Override // com.withings.prediction.local.dao.PredictionDao
    public Object replaceAll(final List<PredictionEntity> list, d<? super y> dVar) {
        return b0.a(this.__db, new l() { // from class: com.withings.prediction.local.dao.a
            @Override // ym0.l
            public final Object invoke(Object obj) {
                Object lambda$replaceAll$0;
                lambda$replaceAll$0 = PredictionDao_RoomDb_Impl.this.lambda$replaceAll$0(list, (d) obj);
                return lambda$replaceAll$0;
            }
        }, dVar);
    }

    @Override // com.withings.prediction.local.dao.PredictionDao
    public Object upsert(final PredictionEntity predictionEntity, d<? super y> dVar) {
        return g.c(this.__db, new Callable<y>() { // from class: com.withings.prediction.local.dao.PredictionDao_RoomDb_Impl.5
            @Override // java.util.concurrent.Callable
            public y call() throws Exception {
                PredictionDao_RoomDb_Impl.this.__db.c();
                try {
                    PredictionDao_RoomDb_Impl.this.__insertionAdapterOfPredictionEntity.insert((k) predictionEntity);
                    PredictionDao_RoomDb_Impl.this.__db.z();
                    return y.f85009a;
                } finally {
                    PredictionDao_RoomDb_Impl.this.__db.h();
                }
            }
        }, dVar);
    }

    @Override // com.withings.prediction.local.dao.PredictionDao
    public Object clear(final long j5, d<? super y> dVar) {
        return g.c(this.__db, new Callable<y>() { // from class: com.withings.prediction.local.dao.PredictionDao_RoomDb_Impl.8
            @Override // java.util.concurrent.Callable
            public y call() throws Exception {
                f acquire = PredictionDao_RoomDb_Impl.this.__preparedStmtOfClear_1.acquire();
                acquire.v(1, j5);
                try {
                    PredictionDao_RoomDb_Impl.this.__db.c();
                    acquire.H();
                    PredictionDao_RoomDb_Impl.this.__db.z();
                    y yVar = y.f85009a;
                    PredictionDao_RoomDb_Impl.this.__db.h();
                    return yVar;
                } finally {
                    PredictionDao_RoomDb_Impl.this.__preparedStmtOfClear_1.release(acquire);
                }
            }
        }, dVar);
    }

    @Override // com.withings.prediction.local.dao.PredictionDao
    public Object upsert(final List<PredictionEntity> list, d<? super y> dVar) {
        return g.c(this.__db, new Callable<y>() { // from class: com.withings.prediction.local.dao.PredictionDao_RoomDb_Impl.6
            @Override // java.util.concurrent.Callable
            public y call() throws Exception {
                PredictionDao_RoomDb_Impl.this.__db.c();
                try {
                    PredictionDao_RoomDb_Impl.this.__insertionAdapterOfPredictionEntity.insert((Iterable) list);
                    PredictionDao_RoomDb_Impl.this.__db.z();
                    return y.f85009a;
                } finally {
                    PredictionDao_RoomDb_Impl.this.__db.h();
                }
            }
        }, dVar);
    }

    @Override // com.withings.prediction.local.dao.PredictionDao
    public Flow<List<PredictionEntity>> get(long j5, int i11) {
        final d0 c11 = d0.c(2, "SELECT * FROM PREDICTION WHERE userId = ? AND type = ?");
        c11.v(1, j5);
        c11.v(2, i11);
        return g.a(this.__db, false, new String[]{"PREDICTION"}, new Callable<List<PredictionEntity>>() { // from class: com.withings.prediction.local.dao.PredictionDao_RoomDb_Impl.11
            protected void finalize() {
                c11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<PredictionEntity> call() throws Exception {
                Cursor c12 = x8.b.c(PredictionDao_RoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = x8.a.b(c12, "wsId");
                    int b11 = x8.a.b(c12, NavigationArguments.USER_ID);
                    int b12 = x8.a.b(c12, "type");
                    int b13 = x8.a.b(c12, "start");
                    int b14 = x8.a.b(c12, "end");
                    int b15 = x8.a.b(c12, "active");
                    int b16 = x8.a.b(c12, ConstantsWs.JSON_ACCOUNT_KEY_CREATED);
                    int b17 = x8.a.b(c12, "modified");
                    ArrayList arrayList = new ArrayList(c12.getCount());
                    while (c12.moveToNext()) {
                        long j11 = c12.getLong(b10);
                        long j12 = c12.getLong(b11);
                        int i12 = c12.getInt(b12);
                        long j13 = c12.getLong(b13);
                        PredictionDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant instant = new Instant(j13);
                        long j14 = c12.getLong(b14);
                        int i13 = b10;
                        PredictionDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant instant2 = new Instant(j14);
                        boolean z5 = c12.getInt(b15) != 0;
                        long j15 = c12.getLong(b16);
                        int i14 = b11;
                        PredictionDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant instant3 = new Instant(j15);
                        long j16 = c12.getLong(b17);
                        int i15 = b12;
                        PredictionDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        arrayList.add(new PredictionEntity(j11, j12, i12, instant, instant2, z5, instant3, new Instant(j16)));
                        b10 = i13;
                        b11 = i14;
                        b12 = i15;
                    }
                    return arrayList;
                } finally {
                    c12.close();
                }
            }
        });
    }

    @Override // com.withings.prediction.local.dao.PredictionDao
    public Flow<List<PredictionEntity>> getActive(long j5, int i11) {
        final d0 c11 = d0.c(2, "SELECT * FROM PREDICTION WHERE userId = ? AND type = ? AND active");
        c11.v(1, j5);
        c11.v(2, i11);
        return g.a(this.__db, false, new String[]{"PREDICTION"}, new Callable<List<PredictionEntity>>() { // from class: com.withings.prediction.local.dao.PredictionDao_RoomDb_Impl.13
            protected void finalize() {
                c11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<PredictionEntity> call() throws Exception {
                Cursor c12 = x8.b.c(PredictionDao_RoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = x8.a.b(c12, "wsId");
                    int b11 = x8.a.b(c12, NavigationArguments.USER_ID);
                    int b12 = x8.a.b(c12, "type");
                    int b13 = x8.a.b(c12, "start");
                    int b14 = x8.a.b(c12, "end");
                    int b15 = x8.a.b(c12, "active");
                    int b16 = x8.a.b(c12, ConstantsWs.JSON_ACCOUNT_KEY_CREATED);
                    int b17 = x8.a.b(c12, "modified");
                    ArrayList arrayList = new ArrayList(c12.getCount());
                    while (c12.moveToNext()) {
                        long j11 = c12.getLong(b10);
                        long j12 = c12.getLong(b11);
                        int i12 = c12.getInt(b12);
                        long j13 = c12.getLong(b13);
                        PredictionDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant instant = new Instant(j13);
                        long j14 = c12.getLong(b14);
                        int i13 = b10;
                        PredictionDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant instant2 = new Instant(j14);
                        boolean z5 = c12.getInt(b15) != 0;
                        long j15 = c12.getLong(b16);
                        int i14 = b11;
                        PredictionDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant instant3 = new Instant(j15);
                        long j16 = c12.getLong(b17);
                        int i15 = b12;
                        PredictionDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        arrayList.add(new PredictionEntity(j11, j12, i12, instant, instant2, z5, instant3, new Instant(j16)));
                        b10 = i13;
                        b11 = i14;
                        b12 = i15;
                    }
                    return arrayList;
                } finally {
                    c12.close();
                }
            }
        });
    }
}
