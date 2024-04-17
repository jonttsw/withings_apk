package com.withings.target.data;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.d0;
import androidx.room.g;
import androidx.room.h0;
import androidx.room.j;
import androidx.room.k;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.target.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import nm0.y;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement;
import org.joda.time.DateTime;
import pm.b;
import qm0.d;
import x8.a;
import z8.f;
/* loaded from: classes4.dex */
public final class TargetDAO_ProdRoomDb_Impl implements TargetDAO {
    private final b __commonRoomConverter = new b();
    private final RoomDatabase __db;
    private final k<Target> __insertionAdapterOfTarget;
    private final h0 __preparedStmtOfClear;
    private final j<Target> __updateAdapterOfTarget;

    public TargetDAO_ProdRoomDb_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfTarget = new k<Target>(roomDatabase) { // from class: com.withings.target.data.TargetDAO_ProdRoomDb_Impl.1
            @Override // androidx.room.h0
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `Target` (`id`,`wsId`,`userId`,`type`,`measureType`,`range`,`mantissa`,`exponent`,`isActive`,`deactivated`,`created`,`modified`,`date`,`isSyncedWithApi`,`attrib`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.k
            public void bind(f fVar, Target target) {
                if (target.getId() == null) {
                    fVar.g2(1);
                } else {
                    fVar.v(1, target.getId().longValue());
                }
                if (target.getWsId() == null) {
                    fVar.g2(2);
                } else {
                    fVar.v(2, target.getWsId().longValue());
                }
                fVar.v(3, target.getUserId());
                fVar.v(4, target.getType());
                fVar.v(5, target.getMeasureType());
                fVar.v(6, target.getRange());
                fVar.v(7, target.getMantissa());
                fVar.v(8, target.getExponent());
                fVar.v(9, target.isActive() ? 1L : 0L);
                b bVar = TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter;
                DateTime deactivated = target.getDeactivated();
                bVar.getClass();
                Long e11 = b.e(deactivated);
                if (e11 == null) {
                    fVar.g2(10);
                } else {
                    fVar.v(10, e11.longValue());
                }
                b bVar2 = TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter;
                DateTime created = target.getCreated();
                bVar2.getClass();
                Long e12 = b.e(created);
                if (e12 == null) {
                    fVar.g2(11);
                } else {
                    fVar.v(11, e12.longValue());
                }
                b bVar3 = TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter;
                DateTime modified = target.getModified();
                bVar3.getClass();
                Long e13 = b.e(modified);
                if (e13 == null) {
                    fVar.g2(12);
                } else {
                    fVar.v(12, e13.longValue());
                }
                b bVar4 = TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter;
                DateTime date = target.getDate();
                bVar4.getClass();
                Long e14 = b.e(date);
                if (e14 == null) {
                    fVar.g2(13);
                } else {
                    fVar.v(13, e14.longValue());
                }
                fVar.v(14, target.isSyncedWithApi() ? 1L : 0L);
                if (target.getAttrib() == null) {
                    fVar.g2(15);
                } else {
                    fVar.v(15, target.getAttrib().intValue());
                }
            }
        };
        this.__updateAdapterOfTarget = new j<Target>(roomDatabase) { // from class: com.withings.target.data.TargetDAO_ProdRoomDb_Impl.2
            @Override // androidx.room.j, androidx.room.h0
            protected String createQuery() {
                return "UPDATE OR REPLACE `Target` SET `id` = ?,`wsId` = ?,`userId` = ?,`type` = ?,`measureType` = ?,`range` = ?,`mantissa` = ?,`exponent` = ?,`isActive` = ?,`deactivated` = ?,`created` = ?,`modified` = ?,`date` = ?,`isSyncedWithApi` = ?,`attrib` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.j
            public void bind(f fVar, Target target) {
                if (target.getId() == null) {
                    fVar.g2(1);
                } else {
                    fVar.v(1, target.getId().longValue());
                }
                if (target.getWsId() == null) {
                    fVar.g2(2);
                } else {
                    fVar.v(2, target.getWsId().longValue());
                }
                fVar.v(3, target.getUserId());
                fVar.v(4, target.getType());
                fVar.v(5, target.getMeasureType());
                fVar.v(6, target.getRange());
                fVar.v(7, target.getMantissa());
                fVar.v(8, target.getExponent());
                fVar.v(9, target.isActive() ? 1L : 0L);
                b bVar = TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter;
                DateTime deactivated = target.getDeactivated();
                bVar.getClass();
                Long e11 = b.e(deactivated);
                if (e11 == null) {
                    fVar.g2(10);
                } else {
                    fVar.v(10, e11.longValue());
                }
                b bVar2 = TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter;
                DateTime created = target.getCreated();
                bVar2.getClass();
                Long e12 = b.e(created);
                if (e12 == null) {
                    fVar.g2(11);
                } else {
                    fVar.v(11, e12.longValue());
                }
                b bVar3 = TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter;
                DateTime modified = target.getModified();
                bVar3.getClass();
                Long e13 = b.e(modified);
                if (e13 == null) {
                    fVar.g2(12);
                } else {
                    fVar.v(12, e13.longValue());
                }
                b bVar4 = TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter;
                DateTime date = target.getDate();
                bVar4.getClass();
                Long e14 = b.e(date);
                if (e14 == null) {
                    fVar.g2(13);
                } else {
                    fVar.v(13, e14.longValue());
                }
                fVar.v(14, target.isSyncedWithApi() ? 1L : 0L);
                if (target.getAttrib() == null) {
                    fVar.g2(15);
                } else {
                    fVar.v(15, target.getAttrib().intValue());
                }
                if (target.getId() == null) {
                    fVar.g2(16);
                } else {
                    fVar.v(16, target.getId().longValue());
                }
            }
        };
        this.__preparedStmtOfClear = new h0(roomDatabase) { // from class: com.withings.target.data.TargetDAO_ProdRoomDb_Impl.3
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM Target";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.withings.target.data.TargetDAO, com.withings.target.data.TargetDataSource
    public void clear() {
        this.__db.b();
        f acquire = this.__preparedStmtOfClear.acquire();
        try {
            this.__db.c();
            acquire.H();
            this.__db.z();
            this.__db.h();
        } finally {
            this.__preparedStmtOfClear.release(acquire);
        }
    }

    @Override // com.withings.target.data.TargetDAO, com.withings.target.data.TargetDataSource
    public Flow<List<Target>> getActiveStepTargetsForAllUser() {
        final d0 c11 = d0.c(0, "SELECT * FROM Target WHERE isActive AND measureType = 36 ORDER BY modified ASC");
        return g.a(this.__db, false, new String[]{"Target"}, new Callable<List<Target>>() { // from class: com.withings.target.data.TargetDAO_ProdRoomDb_Impl.7
            protected void finalize() {
                c11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<Target> call() throws Exception {
                Long valueOf;
                int i11;
                Long valueOf2;
                int i12;
                Long valueOf3;
                int i13;
                boolean z5;
                Cursor c12 = x8.b.c(TargetDAO_ProdRoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "id");
                    int b11 = a.b(c12, "wsId");
                    int b12 = a.b(c12, NavigationArguments.USER_ID);
                    int b13 = a.b(c12, "type");
                    int b14 = a.b(c12, "measureType");
                    int b15 = a.b(c12, ValidateElement.RangeValidateElement.METHOD);
                    int b16 = a.b(c12, "mantissa");
                    int b17 = a.b(c12, "exponent");
                    int b18 = a.b(c12, "isActive");
                    int b19 = a.b(c12, "deactivated");
                    int b21 = a.b(c12, ConstantsWs.JSON_ACCOUNT_KEY_CREATED);
                    int b22 = a.b(c12, "modified");
                    int b23 = a.b(c12, "date");
                    int b24 = a.b(c12, "isSyncedWithApi");
                    int b25 = a.b(c12, "attrib");
                    int i14 = b23;
                    ArrayList arrayList = new ArrayList(c12.getCount());
                    while (c12.moveToNext()) {
                        Long valueOf4 = c12.isNull(b10) ? null : Long.valueOf(c12.getLong(b10));
                        Long valueOf5 = c12.isNull(b11) ? null : Long.valueOf(c12.getLong(b11));
                        long j5 = c12.getLong(b12);
                        int i15 = c12.getInt(b13);
                        int i16 = c12.getInt(b14);
                        int i17 = c12.getInt(b15);
                        int i18 = c12.getInt(b16);
                        int i19 = c12.getInt(b17);
                        boolean z11 = c12.getInt(b18) != 0;
                        if (c12.isNull(b19)) {
                            i11 = b10;
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(c12.getLong(b19));
                            i11 = b10;
                        }
                        TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a11 = b.a(valueOf);
                        Long valueOf6 = c12.isNull(b21) ? null : Long.valueOf(c12.getLong(b21));
                        TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a12 = b.a(valueOf6);
                        if (a12 != null) {
                            if (c12.isNull(b22)) {
                                i12 = b11;
                                valueOf2 = null;
                            } else {
                                valueOf2 = Long.valueOf(c12.getLong(b22));
                                i12 = b11;
                            }
                            TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                            DateTime a13 = b.a(valueOf2);
                            if (a13 != null) {
                                int i21 = i14;
                                if (c12.isNull(i21)) {
                                    i14 = i21;
                                    valueOf3 = null;
                                } else {
                                    valueOf3 = Long.valueOf(c12.getLong(i21));
                                    i14 = i21;
                                }
                                TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                                DateTime a14 = b.a(valueOf3);
                                if (a14 != null) {
                                    int i22 = b24;
                                    if (c12.getInt(i22) != 0) {
                                        i13 = b25;
                                        z5 = true;
                                    } else {
                                        i13 = b25;
                                        z5 = false;
                                    }
                                    arrayList.add(new Target(valueOf4, valueOf5, j5, i15, i16, i17, i18, i19, z11, a11, a12, a13, a14, z5, c12.isNull(i13) ? null : Integer.valueOf(c12.getInt(i13))));
                                    b25 = i13;
                                    b24 = i22;
                                    b10 = i11;
                                    b11 = i12;
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                            }
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

    @Override // com.withings.target.data.TargetDAO, com.withings.target.data.TargetDataSource
    public Flow<List<Target>> getAllActivatedTargetsForUserFlow(long j5) {
        final d0 c11 = d0.c(1, "SELECT * FROM Target WHERE userId = ? AND isActive AND mantissa >= 0 AND deactivated IS NULL ORDER BY modified ASC");
        c11.v(1, j5);
        return g.a(this.__db, false, new String[]{"Target"}, new Callable<List<Target>>() { // from class: com.withings.target.data.TargetDAO_ProdRoomDb_Impl.8
            protected void finalize() {
                c11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<Target> call() throws Exception {
                Long valueOf;
                int i11;
                Long valueOf2;
                int i12;
                Long valueOf3;
                int i13;
                boolean z5;
                Cursor c12 = x8.b.c(TargetDAO_ProdRoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "id");
                    int b11 = a.b(c12, "wsId");
                    int b12 = a.b(c12, NavigationArguments.USER_ID);
                    int b13 = a.b(c12, "type");
                    int b14 = a.b(c12, "measureType");
                    int b15 = a.b(c12, ValidateElement.RangeValidateElement.METHOD);
                    int b16 = a.b(c12, "mantissa");
                    int b17 = a.b(c12, "exponent");
                    int b18 = a.b(c12, "isActive");
                    int b19 = a.b(c12, "deactivated");
                    int b21 = a.b(c12, ConstantsWs.JSON_ACCOUNT_KEY_CREATED);
                    int b22 = a.b(c12, "modified");
                    int b23 = a.b(c12, "date");
                    int b24 = a.b(c12, "isSyncedWithApi");
                    int b25 = a.b(c12, "attrib");
                    int i14 = b23;
                    ArrayList arrayList = new ArrayList(c12.getCount());
                    while (c12.moveToNext()) {
                        Long valueOf4 = c12.isNull(b10) ? null : Long.valueOf(c12.getLong(b10));
                        Long valueOf5 = c12.isNull(b11) ? null : Long.valueOf(c12.getLong(b11));
                        long j11 = c12.getLong(b12);
                        int i15 = c12.getInt(b13);
                        int i16 = c12.getInt(b14);
                        int i17 = c12.getInt(b15);
                        int i18 = c12.getInt(b16);
                        int i19 = c12.getInt(b17);
                        boolean z11 = c12.getInt(b18) != 0;
                        if (c12.isNull(b19)) {
                            i11 = b10;
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(c12.getLong(b19));
                            i11 = b10;
                        }
                        TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a11 = b.a(valueOf);
                        Long valueOf6 = c12.isNull(b21) ? null : Long.valueOf(c12.getLong(b21));
                        TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a12 = b.a(valueOf6);
                        if (a12 != null) {
                            if (c12.isNull(b22)) {
                                i12 = b11;
                                valueOf2 = null;
                            } else {
                                valueOf2 = Long.valueOf(c12.getLong(b22));
                                i12 = b11;
                            }
                            TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                            DateTime a13 = b.a(valueOf2);
                            if (a13 != null) {
                                int i21 = i14;
                                if (c12.isNull(i21)) {
                                    i14 = i21;
                                    valueOf3 = null;
                                } else {
                                    valueOf3 = Long.valueOf(c12.getLong(i21));
                                    i14 = i21;
                                }
                                TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                                DateTime a14 = b.a(valueOf3);
                                if (a14 != null) {
                                    int i22 = b24;
                                    if (c12.getInt(i22) != 0) {
                                        i13 = b25;
                                        z5 = true;
                                    } else {
                                        i13 = b25;
                                        z5 = false;
                                    }
                                    arrayList.add(new Target(valueOf4, valueOf5, j11, i15, i16, i17, i18, i19, z11, a11, a12, a13, a14, z5, c12.isNull(i13) ? null : Integer.valueOf(c12.getInt(i13))));
                                    b25 = i13;
                                    b24 = i22;
                                    b10 = i11;
                                    b11 = i12;
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                            }
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

    @Override // com.withings.target.data.TargetDAO, com.withings.target.data.TargetDataSource
    public List<Target> getAllTargetForUserSince(long j5, DateTime dateTime) {
        d0 d0Var;
        Long valueOf;
        Long valueOf2;
        boolean z5;
        Long valueOf3;
        int i11;
        Long valueOf4;
        Long valueOf5;
        int i12;
        Long valueOf6;
        int i13;
        boolean z11;
        d0 c11 = d0.c(2, "SELECT * FROM Target WHERE userId = ? AND modified >= ? ORDER BY created DESC");
        c11.v(1, j5);
        this.__commonRoomConverter.getClass();
        Long e11 = b.e(dateTime);
        if (e11 == null) {
            c11.g2(2);
        } else {
            c11.v(2, e11.longValue());
        }
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "id");
            int b11 = a.b(c12, "wsId");
            int b12 = a.b(c12, NavigationArguments.USER_ID);
            int b13 = a.b(c12, "type");
            int b14 = a.b(c12, "measureType");
            int b15 = a.b(c12, ValidateElement.RangeValidateElement.METHOD);
            int b16 = a.b(c12, "mantissa");
            int b17 = a.b(c12, "exponent");
            int b18 = a.b(c12, "isActive");
            int b19 = a.b(c12, "deactivated");
            int b21 = a.b(c12, ConstantsWs.JSON_ACCOUNT_KEY_CREATED);
            int b22 = a.b(c12, "modified");
            int b23 = a.b(c12, "date");
            d0Var = c11;
            try {
                int b24 = a.b(c12, "isSyncedWithApi");
                int b25 = a.b(c12, "attrib");
                int i14 = b23;
                ArrayList arrayList = new ArrayList(c12.getCount());
                while (c12.moveToNext()) {
                    Integer num = null;
                    if (c12.isNull(b10)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(c12.getLong(b10));
                    }
                    if (c12.isNull(b11)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(c12.getLong(b11));
                    }
                    long j11 = c12.getLong(b12);
                    int i15 = c12.getInt(b13);
                    int i16 = c12.getInt(b14);
                    int i17 = c12.getInt(b15);
                    int i18 = c12.getInt(b16);
                    int i19 = c12.getInt(b17);
                    if (c12.getInt(b18) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (c12.isNull(b19)) {
                        i11 = b10;
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(c12.getLong(b19));
                        i11 = b10;
                    }
                    this.__commonRoomConverter.getClass();
                    DateTime a11 = b.a(valueOf3);
                    if (c12.isNull(b21)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(c12.getLong(b21));
                    }
                    this.__commonRoomConverter.getClass();
                    DateTime a12 = b.a(valueOf4);
                    if (a12 != null) {
                        if (c12.isNull(b22)) {
                            i12 = b22;
                            valueOf5 = null;
                        } else {
                            valueOf5 = Long.valueOf(c12.getLong(b22));
                            i12 = b22;
                        }
                        this.__commonRoomConverter.getClass();
                        DateTime a13 = b.a(valueOf5);
                        if (a13 != null) {
                            int i21 = i14;
                            if (c12.isNull(i21)) {
                                i14 = i21;
                                valueOf6 = null;
                            } else {
                                valueOf6 = Long.valueOf(c12.getLong(i21));
                                i14 = i21;
                            }
                            this.__commonRoomConverter.getClass();
                            DateTime a14 = b.a(valueOf6);
                            if (a14 != null) {
                                int i22 = b24;
                                if (c12.getInt(i22) != 0) {
                                    i13 = b25;
                                    z11 = true;
                                } else {
                                    i13 = b25;
                                    z11 = false;
                                }
                                if (!c12.isNull(i13)) {
                                    num = Integer.valueOf(c12.getInt(i13));
                                }
                                arrayList.add(new Target(valueOf, valueOf2, j11, i15, i16, i17, i18, i19, z5, a11, a12, a13, a14, z11, num));
                                b24 = i22;
                                b25 = i13;
                                b10 = i11;
                                b22 = i12;
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
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

    @Override // com.withings.target.data.TargetDAO, com.withings.target.data.TargetDataSource
    public Flow<Target> getLastActiveTargetByTypeForUserFlow(long j5, int i11) {
        final d0 c11 = d0.c(2, "SELECT * FROM Target WHERE userId = ? AND type = ? AND isActive ORDER BY created DESC LIMIT 1");
        c11.v(1, j5);
        c11.v(2, i11);
        return g.a(this.__db, false, new String[]{"Target"}, new Callable<Target>() { // from class: com.withings.target.data.TargetDAO_ProdRoomDb_Impl.10
            protected void finalize() {
                c11.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Target call() throws Exception {
                Cursor c12 = x8.b.c(TargetDAO_ProdRoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "id");
                    int b11 = a.b(c12, "wsId");
                    int b12 = a.b(c12, NavigationArguments.USER_ID);
                    int b13 = a.b(c12, "type");
                    int b14 = a.b(c12, "measureType");
                    int b15 = a.b(c12, ValidateElement.RangeValidateElement.METHOD);
                    int b16 = a.b(c12, "mantissa");
                    int b17 = a.b(c12, "exponent");
                    int b18 = a.b(c12, "isActive");
                    int b19 = a.b(c12, "deactivated");
                    int b21 = a.b(c12, ConstantsWs.JSON_ACCOUNT_KEY_CREATED);
                    int b22 = a.b(c12, "modified");
                    int b23 = a.b(c12, "date");
                    int b24 = a.b(c12, "isSyncedWithApi");
                    int b25 = a.b(c12, "attrib");
                    Target target = null;
                    if (c12.moveToFirst()) {
                        Long valueOf = c12.isNull(b10) ? null : Long.valueOf(c12.getLong(b10));
                        Long valueOf2 = c12.isNull(b11) ? null : Long.valueOf(c12.getLong(b11));
                        long j11 = c12.getLong(b12);
                        int i12 = c12.getInt(b13);
                        int i13 = c12.getInt(b14);
                        int i14 = c12.getInt(b15);
                        int i15 = c12.getInt(b16);
                        int i16 = c12.getInt(b17);
                        boolean z5 = c12.getInt(b18) != 0;
                        Long valueOf3 = c12.isNull(b19) ? null : Long.valueOf(c12.getLong(b19));
                        TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a11 = b.a(valueOf3);
                        Long valueOf4 = c12.isNull(b21) ? null : Long.valueOf(c12.getLong(b21));
                        TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a12 = b.a(valueOf4);
                        if (a12 != null) {
                            Long valueOf5 = c12.isNull(b22) ? null : Long.valueOf(c12.getLong(b22));
                            TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                            DateTime a13 = b.a(valueOf5);
                            if (a13 != null) {
                                Long valueOf6 = c12.isNull(b23) ? null : Long.valueOf(c12.getLong(b23));
                                TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                                DateTime a14 = b.a(valueOf6);
                                if (a14 != null) {
                                    target = new Target(valueOf, valueOf2, j11, i12, i13, i14, i15, i16, z5, a11, a12, a13, a14, c12.getInt(b24) != 0, c12.isNull(b25) ? null : Integer.valueOf(c12.getInt(b25)));
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
                    }
                    c12.close();
                    return target;
                } catch (Throwable th2) {
                    c12.close();
                    throw th2;
                }
            }
        });
    }

    @Override // com.withings.target.data.TargetDAO, com.withings.target.data.TargetDataSource
    public Target getLastActiveTargetForUser(long j5, int i11, int i12) {
        d0 d0Var;
        int b10;
        int b11;
        int b12;
        int b13;
        int b14;
        int b15;
        int b16;
        int b17;
        int b18;
        int b19;
        int b21;
        int b22;
        int b23;
        Long valueOf;
        Long valueOf2;
        boolean z5;
        Long valueOf3;
        Long valueOf4;
        Long valueOf5;
        Long valueOf6;
        boolean z11;
        d0 c11 = d0.c(3, "SELECT * FROM Target WHERE userId = ? AND type = ? AND measureType = ? AND isActive ORDER BY created DESC");
        c11.v(1, j5);
        c11.v(2, i11);
        c11.v(3, i12);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            b10 = a.b(c12, "id");
            b11 = a.b(c12, "wsId");
            b12 = a.b(c12, NavigationArguments.USER_ID);
            b13 = a.b(c12, "type");
            b14 = a.b(c12, "measureType");
            b15 = a.b(c12, ValidateElement.RangeValidateElement.METHOD);
            b16 = a.b(c12, "mantissa");
            b17 = a.b(c12, "exponent");
            b18 = a.b(c12, "isActive");
            b19 = a.b(c12, "deactivated");
            b21 = a.b(c12, ConstantsWs.JSON_ACCOUNT_KEY_CREATED);
            b22 = a.b(c12, "modified");
            b23 = a.b(c12, "date");
            d0Var = c11;
        } catch (Throwable th2) {
            th = th2;
            d0Var = c11;
        }
        try {
            int b24 = a.b(c12, "isSyncedWithApi");
            int b25 = a.b(c12, "attrib");
            Target target = null;
            Integer valueOf7 = null;
            if (c12.moveToFirst()) {
                if (c12.isNull(b10)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(c12.getLong(b10));
                }
                if (c12.isNull(b11)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(c12.getLong(b11));
                }
                long j11 = c12.getLong(b12);
                int i13 = c12.getInt(b13);
                int i14 = c12.getInt(b14);
                int i15 = c12.getInt(b15);
                int i16 = c12.getInt(b16);
                int i17 = c12.getInt(b17);
                if (c12.getInt(b18) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (c12.isNull(b19)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(c12.getLong(b19));
                }
                this.__commonRoomConverter.getClass();
                DateTime a11 = b.a(valueOf3);
                if (c12.isNull(b21)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(c12.getLong(b21));
                }
                this.__commonRoomConverter.getClass();
                DateTime a12 = b.a(valueOf4);
                if (a12 != null) {
                    if (c12.isNull(b22)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(c12.getLong(b22));
                    }
                    this.__commonRoomConverter.getClass();
                    DateTime a13 = b.a(valueOf5);
                    if (a13 != null) {
                        if (c12.isNull(b23)) {
                            valueOf6 = null;
                        } else {
                            valueOf6 = Long.valueOf(c12.getLong(b23));
                        }
                        this.__commonRoomConverter.getClass();
                        DateTime a14 = b.a(valueOf6);
                        if (a14 != null) {
                            if (c12.getInt(b24) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!c12.isNull(b25)) {
                                valueOf7 = Integer.valueOf(c12.getInt(b25));
                            }
                            target = new Target(valueOf, valueOf2, j11, i13, i14, i15, i16, i17, z5, a11, a12, a13, a14, z11, valueOf7);
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                    }
                } else {
                    throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                }
            }
            c12.close();
            d0Var.release();
            return target;
        } catch (Throwable th3) {
            th = th3;
            c12.close();
            d0Var.release();
            throw th;
        }
    }

    @Override // com.withings.target.data.TargetDAO, com.withings.target.data.TargetDataSource
    public Flow<Target> getLastActiveTargetForUserFlow(long j5, int i11, int i12) {
        final d0 c11 = d0.c(3, "SELECT * FROM Target WHERE userId = ? AND type = ? AND measureType = ? AND isActive ORDER BY created DESC");
        c11.v(1, j5);
        c11.v(2, i11);
        c11.v(3, i12);
        return g.a(this.__db, false, new String[]{"Target"}, new Callable<Target>() { // from class: com.withings.target.data.TargetDAO_ProdRoomDb_Impl.9
            protected void finalize() {
                c11.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Target call() throws Exception {
                Cursor c12 = x8.b.c(TargetDAO_ProdRoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "id");
                    int b11 = a.b(c12, "wsId");
                    int b12 = a.b(c12, NavigationArguments.USER_ID);
                    int b13 = a.b(c12, "type");
                    int b14 = a.b(c12, "measureType");
                    int b15 = a.b(c12, ValidateElement.RangeValidateElement.METHOD);
                    int b16 = a.b(c12, "mantissa");
                    int b17 = a.b(c12, "exponent");
                    int b18 = a.b(c12, "isActive");
                    int b19 = a.b(c12, "deactivated");
                    int b21 = a.b(c12, ConstantsWs.JSON_ACCOUNT_KEY_CREATED);
                    int b22 = a.b(c12, "modified");
                    int b23 = a.b(c12, "date");
                    int b24 = a.b(c12, "isSyncedWithApi");
                    int b25 = a.b(c12, "attrib");
                    Target target = null;
                    if (c12.moveToFirst()) {
                        Long valueOf = c12.isNull(b10) ? null : Long.valueOf(c12.getLong(b10));
                        Long valueOf2 = c12.isNull(b11) ? null : Long.valueOf(c12.getLong(b11));
                        long j11 = c12.getLong(b12);
                        int i13 = c12.getInt(b13);
                        int i14 = c12.getInt(b14);
                        int i15 = c12.getInt(b15);
                        int i16 = c12.getInt(b16);
                        int i17 = c12.getInt(b17);
                        boolean z5 = c12.getInt(b18) != 0;
                        Long valueOf3 = c12.isNull(b19) ? null : Long.valueOf(c12.getLong(b19));
                        TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a11 = b.a(valueOf3);
                        Long valueOf4 = c12.isNull(b21) ? null : Long.valueOf(c12.getLong(b21));
                        TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a12 = b.a(valueOf4);
                        if (a12 != null) {
                            Long valueOf5 = c12.isNull(b22) ? null : Long.valueOf(c12.getLong(b22));
                            TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                            DateTime a13 = b.a(valueOf5);
                            if (a13 != null) {
                                Long valueOf6 = c12.isNull(b23) ? null : Long.valueOf(c12.getLong(b23));
                                TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                                DateTime a14 = b.a(valueOf6);
                                if (a14 != null) {
                                    target = new Target(valueOf, valueOf2, j11, i13, i14, i15, i16, i17, z5, a11, a12, a13, a14, c12.getInt(b24) != 0, c12.isNull(b25) ? null : Integer.valueOf(c12.getInt(b25)));
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
                    }
                    c12.close();
                    return target;
                } catch (Throwable th2) {
                    c12.close();
                    throw th2;
                }
            }
        });
    }

    @Override // com.withings.target.data.TargetDAO, com.withings.target.data.TargetDataSource
    public Target getLastTargetForUser(long j5, int i11, int i12) {
        d0 d0Var;
        int b10;
        int b11;
        int b12;
        int b13;
        int b14;
        int b15;
        int b16;
        int b17;
        int b18;
        int b19;
        int b21;
        int b22;
        int b23;
        Long valueOf;
        Long valueOf2;
        boolean z5;
        Long valueOf3;
        Long valueOf4;
        Long valueOf5;
        Long valueOf6;
        boolean z11;
        d0 c11 = d0.c(3, "SELECT * FROM Target WHERE userId = ? AND type = ? AND measureType = ? ORDER BY created DESC");
        c11.v(1, j5);
        c11.v(2, i11);
        c11.v(3, i12);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            b10 = a.b(c12, "id");
            b11 = a.b(c12, "wsId");
            b12 = a.b(c12, NavigationArguments.USER_ID);
            b13 = a.b(c12, "type");
            b14 = a.b(c12, "measureType");
            b15 = a.b(c12, ValidateElement.RangeValidateElement.METHOD);
            b16 = a.b(c12, "mantissa");
            b17 = a.b(c12, "exponent");
            b18 = a.b(c12, "isActive");
            b19 = a.b(c12, "deactivated");
            b21 = a.b(c12, ConstantsWs.JSON_ACCOUNT_KEY_CREATED);
            b22 = a.b(c12, "modified");
            b23 = a.b(c12, "date");
            d0Var = c11;
        } catch (Throwable th2) {
            th = th2;
            d0Var = c11;
        }
        try {
            int b24 = a.b(c12, "isSyncedWithApi");
            int b25 = a.b(c12, "attrib");
            Target target = null;
            Integer valueOf7 = null;
            if (c12.moveToFirst()) {
                if (c12.isNull(b10)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(c12.getLong(b10));
                }
                if (c12.isNull(b11)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(c12.getLong(b11));
                }
                long j11 = c12.getLong(b12);
                int i13 = c12.getInt(b13);
                int i14 = c12.getInt(b14);
                int i15 = c12.getInt(b15);
                int i16 = c12.getInt(b16);
                int i17 = c12.getInt(b17);
                if (c12.getInt(b18) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (c12.isNull(b19)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(c12.getLong(b19));
                }
                this.__commonRoomConverter.getClass();
                DateTime a11 = b.a(valueOf3);
                if (c12.isNull(b21)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(c12.getLong(b21));
                }
                this.__commonRoomConverter.getClass();
                DateTime a12 = b.a(valueOf4);
                if (a12 != null) {
                    if (c12.isNull(b22)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(c12.getLong(b22));
                    }
                    this.__commonRoomConverter.getClass();
                    DateTime a13 = b.a(valueOf5);
                    if (a13 != null) {
                        if (c12.isNull(b23)) {
                            valueOf6 = null;
                        } else {
                            valueOf6 = Long.valueOf(c12.getLong(b23));
                        }
                        this.__commonRoomConverter.getClass();
                        DateTime a14 = b.a(valueOf6);
                        if (a14 != null) {
                            if (c12.getInt(b24) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!c12.isNull(b25)) {
                                valueOf7 = Integer.valueOf(c12.getInt(b25));
                            }
                            target = new Target(valueOf, valueOf2, j11, i13, i14, i15, i16, i17, z5, a11, a12, a13, a14, z11, valueOf7);
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                    }
                } else {
                    throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                }
            }
            c12.close();
            d0Var.release();
            return target;
        } catch (Throwable th3) {
            th = th3;
            c12.close();
            d0Var.release();
            throw th;
        }
    }

    @Override // com.withings.target.data.TargetDAO, com.withings.target.data.TargetDataSource
    public Flow<Target> getLastTargetForUserFlow(long j5, int i11, int i12) {
        final d0 c11 = d0.c(3, "SELECT * FROM Target WHERE userId = ? AND type = ? AND measureType = ? ORDER BY created DESC");
        c11.v(1, j5);
        c11.v(2, i11);
        c11.v(3, i12);
        return g.a(this.__db, false, new String[]{"Target"}, new Callable<Target>() { // from class: com.withings.target.data.TargetDAO_ProdRoomDb_Impl.11
            protected void finalize() {
                c11.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Target call() throws Exception {
                Cursor c12 = x8.b.c(TargetDAO_ProdRoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "id");
                    int b11 = a.b(c12, "wsId");
                    int b12 = a.b(c12, NavigationArguments.USER_ID);
                    int b13 = a.b(c12, "type");
                    int b14 = a.b(c12, "measureType");
                    int b15 = a.b(c12, ValidateElement.RangeValidateElement.METHOD);
                    int b16 = a.b(c12, "mantissa");
                    int b17 = a.b(c12, "exponent");
                    int b18 = a.b(c12, "isActive");
                    int b19 = a.b(c12, "deactivated");
                    int b21 = a.b(c12, ConstantsWs.JSON_ACCOUNT_KEY_CREATED);
                    int b22 = a.b(c12, "modified");
                    int b23 = a.b(c12, "date");
                    int b24 = a.b(c12, "isSyncedWithApi");
                    int b25 = a.b(c12, "attrib");
                    Target target = null;
                    if (c12.moveToFirst()) {
                        Long valueOf = c12.isNull(b10) ? null : Long.valueOf(c12.getLong(b10));
                        Long valueOf2 = c12.isNull(b11) ? null : Long.valueOf(c12.getLong(b11));
                        long j11 = c12.getLong(b12);
                        int i13 = c12.getInt(b13);
                        int i14 = c12.getInt(b14);
                        int i15 = c12.getInt(b15);
                        int i16 = c12.getInt(b16);
                        int i17 = c12.getInt(b17);
                        boolean z5 = c12.getInt(b18) != 0;
                        Long valueOf3 = c12.isNull(b19) ? null : Long.valueOf(c12.getLong(b19));
                        TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a11 = b.a(valueOf3);
                        Long valueOf4 = c12.isNull(b21) ? null : Long.valueOf(c12.getLong(b21));
                        TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a12 = b.a(valueOf4);
                        if (a12 != null) {
                            Long valueOf5 = c12.isNull(b22) ? null : Long.valueOf(c12.getLong(b22));
                            TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                            DateTime a13 = b.a(valueOf5);
                            if (a13 != null) {
                                Long valueOf6 = c12.isNull(b23) ? null : Long.valueOf(c12.getLong(b23));
                                TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                                DateTime a14 = b.a(valueOf6);
                                if (a14 != null) {
                                    target = new Target(valueOf, valueOf2, j11, i13, i14, i15, i16, i17, z5, a11, a12, a13, a14, c12.getInt(b24) != 0, c12.isNull(b25) ? null : Integer.valueOf(c12.getInt(b25)));
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
                    }
                    c12.close();
                    return target;
                } catch (Throwable th2) {
                    c12.close();
                    throw th2;
                }
            }
        });
    }

    @Override // com.withings.target.data.TargetDAO, com.withings.target.data.TargetDataSource
    public Target getTargetAtTime(long j5, int i11, int i12, DateTime dateTime) {
        d0 d0Var;
        int b10;
        int b11;
        int b12;
        int b13;
        int b14;
        int b15;
        int b16;
        int b17;
        int b18;
        int b19;
        int b21;
        int b22;
        int b23;
        Long valueOf;
        Long valueOf2;
        boolean z5;
        Long valueOf3;
        Long valueOf4;
        Long valueOf5;
        Long valueOf6;
        boolean z11;
        d0 c11 = d0.c(4, "SELECT * FROM Target WHERE userId = ? AND type = ? AND measureType = ? AND created <= ? ORDER BY created DESC LIMIT 1");
        c11.v(1, j5);
        c11.v(2, i11);
        c11.v(3, i12);
        this.__commonRoomConverter.getClass();
        Long e11 = b.e(dateTime);
        if (e11 == null) {
            c11.g2(4);
        } else {
            c11.v(4, e11.longValue());
        }
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            b10 = a.b(c12, "id");
            b11 = a.b(c12, "wsId");
            b12 = a.b(c12, NavigationArguments.USER_ID);
            b13 = a.b(c12, "type");
            b14 = a.b(c12, "measureType");
            b15 = a.b(c12, ValidateElement.RangeValidateElement.METHOD);
            b16 = a.b(c12, "mantissa");
            b17 = a.b(c12, "exponent");
            b18 = a.b(c12, "isActive");
            b19 = a.b(c12, "deactivated");
            b21 = a.b(c12, ConstantsWs.JSON_ACCOUNT_KEY_CREATED);
            b22 = a.b(c12, "modified");
            b23 = a.b(c12, "date");
            d0Var = c11;
        } catch (Throwable th2) {
            th = th2;
            d0Var = c11;
        }
        try {
            int b24 = a.b(c12, "isSyncedWithApi");
            int b25 = a.b(c12, "attrib");
            Target target = null;
            Integer valueOf7 = null;
            if (c12.moveToFirst()) {
                if (c12.isNull(b10)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(c12.getLong(b10));
                }
                if (c12.isNull(b11)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(c12.getLong(b11));
                }
                long j11 = c12.getLong(b12);
                int i13 = c12.getInt(b13);
                int i14 = c12.getInt(b14);
                int i15 = c12.getInt(b15);
                int i16 = c12.getInt(b16);
                int i17 = c12.getInt(b17);
                if (c12.getInt(b18) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (c12.isNull(b19)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(c12.getLong(b19));
                }
                this.__commonRoomConverter.getClass();
                DateTime a11 = b.a(valueOf3);
                if (c12.isNull(b21)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(c12.getLong(b21));
                }
                this.__commonRoomConverter.getClass();
                DateTime a12 = b.a(valueOf4);
                if (a12 != null) {
                    if (c12.isNull(b22)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(c12.getLong(b22));
                    }
                    this.__commonRoomConverter.getClass();
                    DateTime a13 = b.a(valueOf5);
                    if (a13 != null) {
                        if (c12.isNull(b23)) {
                            valueOf6 = null;
                        } else {
                            valueOf6 = Long.valueOf(c12.getLong(b23));
                        }
                        this.__commonRoomConverter.getClass();
                        DateTime a14 = b.a(valueOf6);
                        if (a14 != null) {
                            if (c12.getInt(b24) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!c12.isNull(b25)) {
                                valueOf7 = Integer.valueOf(c12.getInt(b25));
                            }
                            target = new Target(valueOf, valueOf2, j11, i13, i14, i15, i16, i17, z5, a11, a12, a13, a14, z11, valueOf7);
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                    }
                } else {
                    throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                }
            }
            c12.close();
            d0Var.release();
            return target;
        } catch (Throwable th3) {
            th = th3;
            c12.close();
            d0Var.release();
            throw th;
        }
    }

    @Override // com.withings.target.data.TargetDAO, com.withings.target.data.TargetDataSource
    public Flow<Target> getTargetAtTimeFlow(long j5, int i11, int i12, DateTime dateTime) {
        final d0 c11 = d0.c(4, "SELECT * FROM Target WHERE userId = ? AND type = ? AND measureType = ? AND created <= ? ORDER BY created DESC LIMIT 1");
        c11.v(1, j5);
        c11.v(2, i11);
        c11.v(3, i12);
        this.__commonRoomConverter.getClass();
        Long e11 = b.e(dateTime);
        if (e11 == null) {
            c11.g2(4);
        } else {
            c11.v(4, e11.longValue());
        }
        return g.a(this.__db, false, new String[]{"Target"}, new Callable<Target>() { // from class: com.withings.target.data.TargetDAO_ProdRoomDb_Impl.12
            protected void finalize() {
                c11.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Target call() throws Exception {
                Cursor c12 = x8.b.c(TargetDAO_ProdRoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "id");
                    int b11 = a.b(c12, "wsId");
                    int b12 = a.b(c12, NavigationArguments.USER_ID);
                    int b13 = a.b(c12, "type");
                    int b14 = a.b(c12, "measureType");
                    int b15 = a.b(c12, ValidateElement.RangeValidateElement.METHOD);
                    int b16 = a.b(c12, "mantissa");
                    int b17 = a.b(c12, "exponent");
                    int b18 = a.b(c12, "isActive");
                    int b19 = a.b(c12, "deactivated");
                    int b21 = a.b(c12, ConstantsWs.JSON_ACCOUNT_KEY_CREATED);
                    int b22 = a.b(c12, "modified");
                    int b23 = a.b(c12, "date");
                    int b24 = a.b(c12, "isSyncedWithApi");
                    int b25 = a.b(c12, "attrib");
                    Target target = null;
                    if (c12.moveToFirst()) {
                        Long valueOf = c12.isNull(b10) ? null : Long.valueOf(c12.getLong(b10));
                        Long valueOf2 = c12.isNull(b11) ? null : Long.valueOf(c12.getLong(b11));
                        long j11 = c12.getLong(b12);
                        int i13 = c12.getInt(b13);
                        int i14 = c12.getInt(b14);
                        int i15 = c12.getInt(b15);
                        int i16 = c12.getInt(b16);
                        int i17 = c12.getInt(b17);
                        boolean z5 = c12.getInt(b18) != 0;
                        Long valueOf3 = c12.isNull(b19) ? null : Long.valueOf(c12.getLong(b19));
                        TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a11 = b.a(valueOf3);
                        Long valueOf4 = c12.isNull(b21) ? null : Long.valueOf(c12.getLong(b21));
                        TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a12 = b.a(valueOf4);
                        if (a12 != null) {
                            Long valueOf5 = c12.isNull(b22) ? null : Long.valueOf(c12.getLong(b22));
                            TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                            DateTime a13 = b.a(valueOf5);
                            if (a13 != null) {
                                Long valueOf6 = c12.isNull(b23) ? null : Long.valueOf(c12.getLong(b23));
                                TargetDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                                DateTime a14 = b.a(valueOf6);
                                if (a14 != null) {
                                    target = new Target(valueOf, valueOf2, j11, i13, i14, i15, i16, i17, z5, a11, a12, a13, a14, c12.getInt(b24) != 0, c12.isNull(b25) ? null : Integer.valueOf(c12.getInt(b25)));
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
                    }
                    c12.close();
                    return target;
                } catch (Throwable th2) {
                    c12.close();
                    throw th2;
                }
            }
        });
    }

    @Override // com.withings.target.data.TargetDAO, com.withings.target.data.TargetDataSource
    public List<Target> getTargetToSync(long j5) {
        d0 d0Var;
        int b10;
        int b11;
        int b12;
        int b13;
        int b14;
        int b15;
        int b16;
        int b17;
        int b18;
        int b19;
        int b21;
        int b22;
        int b23;
        Long valueOf;
        Long valueOf2;
        boolean z5;
        Long valueOf3;
        int i11;
        Long valueOf4;
        Long valueOf5;
        int i12;
        Long valueOf6;
        int i13;
        boolean z11;
        d0 c11 = d0.c(1, "SELECT * FROM Target WHERE userId = ? AND NOT isSyncedWithApi");
        c11.v(1, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            b10 = a.b(c12, "id");
            b11 = a.b(c12, "wsId");
            b12 = a.b(c12, NavigationArguments.USER_ID);
            b13 = a.b(c12, "type");
            b14 = a.b(c12, "measureType");
            b15 = a.b(c12, ValidateElement.RangeValidateElement.METHOD);
            b16 = a.b(c12, "mantissa");
            b17 = a.b(c12, "exponent");
            b18 = a.b(c12, "isActive");
            b19 = a.b(c12, "deactivated");
            b21 = a.b(c12, ConstantsWs.JSON_ACCOUNT_KEY_CREATED);
            b22 = a.b(c12, "modified");
            b23 = a.b(c12, "date");
            d0Var = c11;
        } catch (Throwable th2) {
            th = th2;
            d0Var = c11;
        }
        try {
            int b24 = a.b(c12, "isSyncedWithApi");
            int b25 = a.b(c12, "attrib");
            int i14 = b23;
            ArrayList arrayList = new ArrayList(c12.getCount());
            while (c12.moveToNext()) {
                Integer num = null;
                if (c12.isNull(b10)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(c12.getLong(b10));
                }
                if (c12.isNull(b11)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(c12.getLong(b11));
                }
                long j11 = c12.getLong(b12);
                int i15 = c12.getInt(b13);
                int i16 = c12.getInt(b14);
                int i17 = c12.getInt(b15);
                int i18 = c12.getInt(b16);
                int i19 = c12.getInt(b17);
                if (c12.getInt(b18) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (c12.isNull(b19)) {
                    i11 = b10;
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(c12.getLong(b19));
                    i11 = b10;
                }
                this.__commonRoomConverter.getClass();
                DateTime a11 = b.a(valueOf3);
                if (c12.isNull(b21)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(c12.getLong(b21));
                }
                this.__commonRoomConverter.getClass();
                DateTime a12 = b.a(valueOf4);
                if (a12 != null) {
                    if (c12.isNull(b22)) {
                        i12 = b22;
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(c12.getLong(b22));
                        i12 = b22;
                    }
                    this.__commonRoomConverter.getClass();
                    DateTime a13 = b.a(valueOf5);
                    if (a13 != null) {
                        int i21 = i14;
                        if (c12.isNull(i21)) {
                            i14 = i21;
                            valueOf6 = null;
                        } else {
                            valueOf6 = Long.valueOf(c12.getLong(i21));
                            i14 = i21;
                        }
                        this.__commonRoomConverter.getClass();
                        DateTime a14 = b.a(valueOf6);
                        if (a14 != null) {
                            int i22 = b24;
                            if (c12.getInt(i22) != 0) {
                                i13 = b25;
                                z11 = true;
                            } else {
                                i13 = b25;
                                z11 = false;
                            }
                            if (!c12.isNull(i13)) {
                                num = Integer.valueOf(c12.getInt(i13));
                            }
                            arrayList.add(new Target(valueOf, valueOf2, j11, i15, i16, i17, i18, i19, z5, a11, a12, a13, a14, z11, num));
                            b25 = i13;
                            b24 = i22;
                            b10 = i11;
                            b22 = i12;
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                    }
                } else {
                    throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                }
            }
            c12.close();
            d0Var.release();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            c12.close();
            d0Var.release();
            throw th;
        }
    }

    @Override // com.withings.target.data.TargetDAO, com.withings.target.data.TargetDataSource
    public Object insert(final Target target, d<? super y> dVar) {
        return g.c(this.__db, new Callable<y>() { // from class: com.withings.target.data.TargetDAO_ProdRoomDb_Impl.4
            @Override // java.util.concurrent.Callable
            public y call() throws Exception {
                TargetDAO_ProdRoomDb_Impl.this.__db.c();
                try {
                    TargetDAO_ProdRoomDb_Impl.this.__insertionAdapterOfTarget.insert((k) target);
                    TargetDAO_ProdRoomDb_Impl.this.__db.z();
                    return y.f85009a;
                } finally {
                    TargetDAO_ProdRoomDb_Impl.this.__db.h();
                }
            }
        }, dVar);
    }

    @Override // com.withings.target.data.TargetDAO, com.withings.target.data.TargetDataSource
    public DateTime mostRecentModified(long j5) {
        d0 c11 = d0.c(1, "SELECT MAX(modified) FROM Target WHERE userId = ? AND isActive AND isSyncedWithApi");
        c11.v(1, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            DateTime dateTime = null;
            Long valueOf = null;
            if (c12.moveToFirst()) {
                if (!c12.isNull(0)) {
                    valueOf = Long.valueOf(c12.getLong(0));
                }
                this.__commonRoomConverter.getClass();
                dateTime = b.a(valueOf);
            }
            return dateTime;
        } finally {
            c12.close();
            c11.release();
        }
    }

    @Override // com.withings.target.data.TargetDAO, com.withings.target.data.TargetDataSource
    public Object update(final Target target, d<? super y> dVar) {
        return g.c(this.__db, new Callable<y>() { // from class: com.withings.target.data.TargetDAO_ProdRoomDb_Impl.6
            @Override // java.util.concurrent.Callable
            public y call() throws Exception {
                TargetDAO_ProdRoomDb_Impl.this.__db.c();
                try {
                    TargetDAO_ProdRoomDb_Impl.this.__updateAdapterOfTarget.handle(target);
                    TargetDAO_ProdRoomDb_Impl.this.__db.z();
                    return y.f85009a;
                } finally {
                    TargetDAO_ProdRoomDb_Impl.this.__db.h();
                }
            }
        }, dVar);
    }

    @Override // com.withings.target.data.TargetDAO, com.withings.target.data.TargetDataSource
    public Object insert(final List<Target> list, d<? super y> dVar) {
        return g.c(this.__db, new Callable<y>() { // from class: com.withings.target.data.TargetDAO_ProdRoomDb_Impl.5
            @Override // java.util.concurrent.Callable
            public y call() throws Exception {
                TargetDAO_ProdRoomDb_Impl.this.__db.c();
                try {
                    TargetDAO_ProdRoomDb_Impl.this.__insertionAdapterOfTarget.insert((Iterable) list);
                    TargetDAO_ProdRoomDb_Impl.this.__db.z();
                    return y.f85009a;
                } finally {
                    TargetDAO_ProdRoomDb_Impl.this.__db.h();
                }
            }
        }, dVar);
    }
}
