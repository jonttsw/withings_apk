package com.withings.factor.local.dao;

import android.database.Cursor;
import androidx.camera.camera2.internal.v0;
import androidx.room.RoomDatabase;
import androidx.room.b0;
import androidx.room.d0;
import androidx.room.g;
import androidx.room.h0;
import androidx.room.k;
import com.withings.factor.local.model.FactorEntity;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import nm0.y;
import org.joda.time.Instant;
import qm0.d;
import ym0.l;
import z8.f;
/* loaded from: classes3.dex */
public final class FactorDao_ProdRoomDb_Impl implements FactorDao {
    private final pm.b __commonRoomConverter = new pm.b();
    private final RoomDatabase __db;
    private final k<FactorEntity> __insertionAdapterOfFactorEntity;
    private final h0 __preparedStmtOfClear;
    private final h0 __preparedStmtOfClear_1;

    public FactorDao_ProdRoomDb_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfFactorEntity = new k<FactorEntity>(roomDatabase) { // from class: com.withings.factor.local.dao.FactorDao_ProdRoomDb_Impl.1
            @Override // androidx.room.h0
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `factor` (`id`,`wsId`,`userId`,`type`,`start`,`end`,`numberOfPills`,`deleted`,`deletionDate`,`created`,`modified`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.k
            public void bind(f fVar, FactorEntity factorEntity) {
                if (factorEntity.getId() == null) {
                    fVar.g2(1);
                } else {
                    fVar.v(1, factorEntity.getId().longValue());
                }
                if (factorEntity.getWsId() == null) {
                    fVar.g2(2);
                } else {
                    fVar.v(2, factorEntity.getWsId().longValue());
                }
                fVar.v(3, factorEntity.getUserId());
                fVar.v(4, factorEntity.getType());
                pm.b bVar = FactorDao_ProdRoomDb_Impl.this.__commonRoomConverter;
                Instant start = factorEntity.getStart();
                bVar.getClass();
                fVar.v(5, pm.b.f(start));
                pm.b bVar2 = FactorDao_ProdRoomDb_Impl.this.__commonRoomConverter;
                Instant end = factorEntity.getEnd();
                bVar2.getClass();
                Long valueOf = end != null ? Long.valueOf(end.getMillis()) : null;
                if (valueOf == null) {
                    fVar.g2(6);
                } else {
                    fVar.v(6, valueOf.longValue());
                }
                if (factorEntity.getNumberOfPills() == null) {
                    fVar.g2(7);
                } else {
                    fVar.v(7, factorEntity.getNumberOfPills().intValue());
                }
                Integer valueOf2 = factorEntity.getDeleted() == null ? null : Integer.valueOf(factorEntity.getDeleted().booleanValue() ? 1 : 0);
                if (valueOf2 == null) {
                    fVar.g2(8);
                } else {
                    fVar.v(8, valueOf2.intValue());
                }
                pm.b bVar3 = FactorDao_ProdRoomDb_Impl.this.__commonRoomConverter;
                Instant deletionDate = factorEntity.getDeletionDate();
                bVar3.getClass();
                Long valueOf3 = deletionDate != null ? Long.valueOf(deletionDate.getMillis()) : null;
                if (valueOf3 == null) {
                    fVar.g2(9);
                } else {
                    fVar.v(9, valueOf3.longValue());
                }
                pm.b bVar4 = FactorDao_ProdRoomDb_Impl.this.__commonRoomConverter;
                Instant created = factorEntity.getCreated();
                bVar4.getClass();
                fVar.v(10, pm.b.f(created));
                pm.b bVar5 = FactorDao_ProdRoomDb_Impl.this.__commonRoomConverter;
                Instant modified = factorEntity.getModified();
                bVar5.getClass();
                fVar.v(11, pm.b.f(modified));
            }
        };
        this.__preparedStmtOfClear = new h0(roomDatabase) { // from class: com.withings.factor.local.dao.FactorDao_ProdRoomDb_Impl.2
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM FACTOR";
            }
        };
        this.__preparedStmtOfClear_1 = new h0(roomDatabase) { // from class: com.withings.factor.local.dao.FactorDao_ProdRoomDb_Impl.3
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM FACTOR WHERE userId=?";
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

    @Override // com.withings.factor.local.dao.FactorDao
    public Object clear(d<? super y> dVar) {
        return g.c(this.__db, new Callable<y>() { // from class: com.withings.factor.local.dao.FactorDao_ProdRoomDb_Impl.6
            @Override // java.util.concurrent.Callable
            public y call() throws Exception {
                f acquire = FactorDao_ProdRoomDb_Impl.this.__preparedStmtOfClear.acquire();
                try {
                    FactorDao_ProdRoomDb_Impl.this.__db.c();
                    acquire.H();
                    FactorDao_ProdRoomDb_Impl.this.__db.z();
                    y yVar = y.f85009a;
                    FactorDao_ProdRoomDb_Impl.this.__db.h();
                    return yVar;
                } finally {
                    FactorDao_ProdRoomDb_Impl.this.__preparedStmtOfClear.release(acquire);
                }
            }
        }, dVar);
    }

    @Override // com.withings.factor.local.dao.FactorDao
    public Flow<FactorEntity> getById(long j5) {
        final d0 c11 = d0.c(1, "SELECT * FROM FACTOR WHERE id = ?");
        c11.v(1, j5);
        return g.a(this.__db, false, new String[]{"FACTOR"}, new Callable<FactorEntity>() { // from class: com.withings.factor.local.dao.FactorDao_ProdRoomDb_Impl.11
            protected void finalize() {
                c11.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public FactorEntity call() throws Exception {
                Boolean valueOf;
                Cursor c12 = x8.b.c(FactorDao_ProdRoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = x8.a.b(c12, "id");
                    int b11 = x8.a.b(c12, "wsId");
                    int b12 = x8.a.b(c12, NavigationArguments.USER_ID);
                    int b13 = x8.a.b(c12, "type");
                    int b14 = x8.a.b(c12, "start");
                    int b15 = x8.a.b(c12, "end");
                    int b16 = x8.a.b(c12, "numberOfPills");
                    int b17 = x8.a.b(c12, "deleted");
                    int b18 = x8.a.b(c12, "deletionDate");
                    int b19 = x8.a.b(c12, ConstantsWs.JSON_ACCOUNT_KEY_CREATED);
                    int b21 = x8.a.b(c12, "modified");
                    FactorEntity factorEntity = null;
                    Long valueOf2 = null;
                    if (c12.moveToFirst()) {
                        Long valueOf3 = c12.isNull(b10) ? null : Long.valueOf(c12.getLong(b10));
                        Long valueOf4 = c12.isNull(b11) ? null : Long.valueOf(c12.getLong(b11));
                        long j11 = c12.getLong(b12);
                        int i11 = c12.getInt(b13);
                        long j12 = c12.getLong(b14);
                        FactorDao_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant instant = new Instant(j12);
                        Long valueOf5 = c12.isNull(b15) ? null : Long.valueOf(c12.getLong(b15));
                        FactorDao_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant d11 = pm.b.d(valueOf5);
                        Integer valueOf6 = c12.isNull(b16) ? null : Integer.valueOf(c12.getInt(b16));
                        Integer valueOf7 = c12.isNull(b17) ? null : Integer.valueOf(c12.getInt(b17));
                        if (valueOf7 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(valueOf7.intValue() != 0);
                        }
                        if (!c12.isNull(b18)) {
                            valueOf2 = Long.valueOf(c12.getLong(b18));
                        }
                        FactorDao_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant d12 = pm.b.d(valueOf2);
                        long j13 = c12.getLong(b19);
                        FactorDao_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant instant2 = new Instant(j13);
                        long j14 = c12.getLong(b21);
                        FactorDao_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        factorEntity = new FactorEntity(valueOf3, valueOf4, j11, i11, instant, d11, valueOf6, valueOf, d12, instant2, new Instant(j14));
                    }
                    return factorEntity;
                } finally {
                    c12.close();
                }
            }
        });
    }

    @Override // com.withings.factor.local.dao.FactorDao
    public Flow<FactorEntity> getByWsId(long j5) {
        final d0 c11 = d0.c(1, "SELECT * FROM FACTOR WHERE wsId = ?");
        c11.v(1, j5);
        return g.a(this.__db, false, new String[]{"FACTOR"}, new Callable<FactorEntity>() { // from class: com.withings.factor.local.dao.FactorDao_ProdRoomDb_Impl.10
            protected void finalize() {
                c11.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public FactorEntity call() throws Exception {
                Boolean valueOf;
                Cursor c12 = x8.b.c(FactorDao_ProdRoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = x8.a.b(c12, "id");
                    int b11 = x8.a.b(c12, "wsId");
                    int b12 = x8.a.b(c12, NavigationArguments.USER_ID);
                    int b13 = x8.a.b(c12, "type");
                    int b14 = x8.a.b(c12, "start");
                    int b15 = x8.a.b(c12, "end");
                    int b16 = x8.a.b(c12, "numberOfPills");
                    int b17 = x8.a.b(c12, "deleted");
                    int b18 = x8.a.b(c12, "deletionDate");
                    int b19 = x8.a.b(c12, ConstantsWs.JSON_ACCOUNT_KEY_CREATED);
                    int b21 = x8.a.b(c12, "modified");
                    FactorEntity factorEntity = null;
                    Long valueOf2 = null;
                    if (c12.moveToFirst()) {
                        Long valueOf3 = c12.isNull(b10) ? null : Long.valueOf(c12.getLong(b10));
                        Long valueOf4 = c12.isNull(b11) ? null : Long.valueOf(c12.getLong(b11));
                        long j11 = c12.getLong(b12);
                        int i11 = c12.getInt(b13);
                        long j12 = c12.getLong(b14);
                        FactorDao_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant instant = new Instant(j12);
                        Long valueOf5 = c12.isNull(b15) ? null : Long.valueOf(c12.getLong(b15));
                        FactorDao_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant d11 = pm.b.d(valueOf5);
                        Integer valueOf6 = c12.isNull(b16) ? null : Integer.valueOf(c12.getInt(b16));
                        Integer valueOf7 = c12.isNull(b17) ? null : Integer.valueOf(c12.getInt(b17));
                        if (valueOf7 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(valueOf7.intValue() != 0);
                        }
                        if (!c12.isNull(b18)) {
                            valueOf2 = Long.valueOf(c12.getLong(b18));
                        }
                        FactorDao_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant d12 = pm.b.d(valueOf2);
                        long j13 = c12.getLong(b19);
                        FactorDao_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant instant2 = new Instant(j13);
                        long j14 = c12.getLong(b21);
                        FactorDao_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        factorEntity = new FactorEntity(valueOf3, valueOf4, j11, i11, instant, d11, valueOf6, valueOf, d12, instant2, new Instant(j14));
                    }
                    return factorEntity;
                } finally {
                    c12.close();
                }
            }
        });
    }

    @Override // com.withings.factor.local.dao.FactorDao
    public Object getLastModified(long j5, d<? super Instant> dVar) {
        final d0 c11 = d0.c(1, "SELECT MAX(modified) from FACTOR where userId=?");
        return g.b(this.__db, v0.c(c11, 1, j5), new Callable<Instant>() { // from class: com.withings.factor.local.dao.FactorDao_ProdRoomDb_Impl.8
            @Override // java.util.concurrent.Callable
            public Instant call() throws Exception {
                Cursor c12 = x8.b.c(FactorDao_ProdRoomDb_Impl.this.__db, c11, false);
                try {
                    Instant instant = null;
                    Long valueOf = null;
                    if (c12.moveToFirst()) {
                        if (!c12.isNull(0)) {
                            valueOf = Long.valueOf(c12.getLong(0));
                        }
                        FactorDao_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        instant = pm.b.d(valueOf);
                    }
                    return instant;
                } finally {
                    c12.close();
                    c11.release();
                }
            }
        }, dVar);
    }

    @Override // com.withings.factor.local.dao.FactorDao
    public Flow<List<FactorEntity>> getNotDeleted(long j5) {
        final d0 c11 = d0.c(1, "SELECT * FROM FACTOR WHERE userId = ? AND (deleted IS NULL OR NOT deleted)");
        c11.v(1, j5);
        return g.a(this.__db, false, new String[]{"FACTOR"}, new Callable<List<FactorEntity>>() { // from class: com.withings.factor.local.dao.FactorDao_ProdRoomDb_Impl.9
            protected void finalize() {
                c11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<FactorEntity> call() throws Exception {
                Boolean valueOf;
                Cursor c12 = x8.b.c(FactorDao_ProdRoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = x8.a.b(c12, "id");
                    int b11 = x8.a.b(c12, "wsId");
                    int b12 = x8.a.b(c12, NavigationArguments.USER_ID);
                    int b13 = x8.a.b(c12, "type");
                    int b14 = x8.a.b(c12, "start");
                    int b15 = x8.a.b(c12, "end");
                    int b16 = x8.a.b(c12, "numberOfPills");
                    int b17 = x8.a.b(c12, "deleted");
                    int b18 = x8.a.b(c12, "deletionDate");
                    int b19 = x8.a.b(c12, ConstantsWs.JSON_ACCOUNT_KEY_CREATED);
                    int b21 = x8.a.b(c12, "modified");
                    ArrayList arrayList = new ArrayList(c12.getCount());
                    while (c12.moveToNext()) {
                        Long l5 = null;
                        Long valueOf2 = c12.isNull(b10) ? null : Long.valueOf(c12.getLong(b10));
                        Long valueOf3 = c12.isNull(b11) ? null : Long.valueOf(c12.getLong(b11));
                        long j11 = c12.getLong(b12);
                        int i11 = c12.getInt(b13);
                        int i12 = b11;
                        long j12 = c12.getLong(b14);
                        FactorDao_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant instant = new Instant(j12);
                        Long valueOf4 = c12.isNull(b15) ? null : Long.valueOf(c12.getLong(b15));
                        FactorDao_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant d11 = pm.b.d(valueOf4);
                        Integer valueOf5 = c12.isNull(b16) ? null : Integer.valueOf(c12.getInt(b16));
                        Integer valueOf6 = c12.isNull(b17) ? null : Integer.valueOf(c12.getInt(b17));
                        if (valueOf6 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(valueOf6.intValue() != 0);
                        }
                        if (!c12.isNull(b18)) {
                            l5 = Long.valueOf(c12.getLong(b18));
                        }
                        FactorDao_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant d12 = pm.b.d(l5);
                        long j13 = c12.getLong(b19);
                        int i13 = b10;
                        FactorDao_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        Instant instant2 = new Instant(j13);
                        long j14 = c12.getLong(b21);
                        int i14 = b12;
                        FactorDao_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        arrayList.add(new FactorEntity(valueOf2, valueOf3, j11, i11, instant, d11, valueOf5, valueOf, d12, instant2, new Instant(j14)));
                        b10 = i13;
                        b11 = i12;
                        b12 = i14;
                    }
                    return arrayList;
                } finally {
                    c12.close();
                }
            }
        });
    }

    @Override // com.withings.factor.local.dao.FactorDao
    public Object replaceAll(final List<FactorEntity> list, d<? super y> dVar) {
        return b0.a(this.__db, new l() { // from class: com.withings.factor.local.dao.a
            @Override // ym0.l
            public final Object invoke(Object obj) {
                Object lambda$replaceAll$0;
                lambda$replaceAll$0 = FactorDao_ProdRoomDb_Impl.this.lambda$replaceAll$0(list, (d) obj);
                return lambda$replaceAll$0;
            }
        }, dVar);
    }

    @Override // com.withings.factor.local.dao.FactorDao
    public Object upsert(final FactorEntity factorEntity, d<? super Long> dVar) {
        return g.c(this.__db, new Callable<Long>() { // from class: com.withings.factor.local.dao.FactorDao_ProdRoomDb_Impl.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                FactorDao_ProdRoomDb_Impl.this.__db.c();
                try {
                    Long valueOf = Long.valueOf(FactorDao_ProdRoomDb_Impl.this.__insertionAdapterOfFactorEntity.insertAndReturnId(factorEntity));
                    FactorDao_ProdRoomDb_Impl.this.__db.z();
                    return valueOf;
                } finally {
                    FactorDao_ProdRoomDb_Impl.this.__db.h();
                }
            }
        }, dVar);
    }

    @Override // com.withings.factor.local.dao.FactorDao
    public Object clear(final long j5, d<? super y> dVar) {
        return g.c(this.__db, new Callable<y>() { // from class: com.withings.factor.local.dao.FactorDao_ProdRoomDb_Impl.7
            @Override // java.util.concurrent.Callable
            public y call() throws Exception {
                f acquire = FactorDao_ProdRoomDb_Impl.this.__preparedStmtOfClear_1.acquire();
                acquire.v(1, j5);
                try {
                    FactorDao_ProdRoomDb_Impl.this.__db.c();
                    acquire.H();
                    FactorDao_ProdRoomDb_Impl.this.__db.z();
                    y yVar = y.f85009a;
                    FactorDao_ProdRoomDb_Impl.this.__db.h();
                    return yVar;
                } finally {
                    FactorDao_ProdRoomDb_Impl.this.__preparedStmtOfClear_1.release(acquire);
                }
            }
        }, dVar);
    }

    @Override // com.withings.factor.local.dao.FactorDao
    public Object upsert(final List<FactorEntity> list, d<? super List<Long>> dVar) {
        return g.c(this.__db, new Callable<List<Long>>() { // from class: com.withings.factor.local.dao.FactorDao_ProdRoomDb_Impl.5
            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                FactorDao_ProdRoomDb_Impl.this.__db.c();
                try {
                    List<Long> insertAndReturnIdsList = FactorDao_ProdRoomDb_Impl.this.__insertionAdapterOfFactorEntity.insertAndReturnIdsList(list);
                    FactorDao_ProdRoomDb_Impl.this.__db.z();
                    return insertAndReturnIdsList;
                } finally {
                    FactorDao_ProdRoomDb_Impl.this.__db.h();
                }
            }
        }, dVar);
    }
}
