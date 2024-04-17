package com.withings.leaderboard.repositories.data;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.camera.camera2.internal.v0;
import androidx.room.RoomDatabase;
import androidx.room.d0;
import androidx.room.g;
import androidx.room.h0;
import androidx.room.k;
import com.google.firebase.analytics.FirebaseAnalytics;
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
/* loaded from: classes3.dex */
public final class LeaderboardDAO_ProdRoomDb_Impl implements LeaderboardDAO {
    private final b __commonRoomConverter = new b();
    private final RoomDatabase __db;
    private final k<LeaderboardEntry> __insertionAdapterOfLeaderboardEntry;
    private final h0 __preparedStmtOfClear;
    private final h0 __preparedStmtOfDelete;
    private final h0 __preparedStmtOfDelete_1;

    public LeaderboardDAO_ProdRoomDb_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfLeaderboardEntry = new k<LeaderboardEntry>(roomDatabase) { // from class: com.withings.leaderboard.repositories.data.LeaderboardDAO_ProdRoomDb_Impl.1
            @Override // androidx.room.h0
            protected String createQuery() {
                return "INSERT OR ABORT INTO `leaderboard` (`id`,`date`,`userid`,`score`,`firstname`,`lastName`,`imageUrl`,`modified`) VALUES (?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.k
            public void bind(f fVar, LeaderboardEntry leaderboardEntry) {
                if (leaderboardEntry.getId() == null) {
                    fVar.g2(1);
                } else {
                    fVar.v(1, leaderboardEntry.getId().intValue());
                }
                fVar.s(2, leaderboardEntry.getDate());
                fVar.v(3, leaderboardEntry.getUserid());
                fVar.v(4, leaderboardEntry.getScore());
                fVar.s(5, leaderboardEntry.getFirstname());
                fVar.s(6, leaderboardEntry.getLastName());
                if (leaderboardEntry.getImageUrl() == null) {
                    fVar.g2(7);
                } else {
                    fVar.s(7, leaderboardEntry.getImageUrl());
                }
                b bVar = LeaderboardDAO_ProdRoomDb_Impl.this.__commonRoomConverter;
                DateTime modified = leaderboardEntry.getModified();
                bVar.getClass();
                Long e11 = b.e(modified);
                if (e11 == null) {
                    fVar.g2(8);
                } else {
                    fVar.v(8, e11.longValue());
                }
            }
        };
        this.__preparedStmtOfDelete = new h0(roomDatabase) { // from class: com.withings.leaderboard.repositories.data.LeaderboardDAO_ProdRoomDb_Impl.2
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM leaderboard WHERE date = ?";
            }
        };
        this.__preparedStmtOfDelete_1 = new h0(roomDatabase) { // from class: com.withings.leaderboard.repositories.data.LeaderboardDAO_ProdRoomDb_Impl.3
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM leaderboard WHERE userid = ?";
            }
        };
        this.__preparedStmtOfClear = new h0(roomDatabase) { // from class: com.withings.leaderboard.repositories.data.LeaderboardDAO_ProdRoomDb_Impl.4
            @Override // androidx.room.h0
            public String createQuery() {
                return "delete from leaderboard";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.withings.leaderboard.repositories.data.LeaderboardDAO
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

    @Override // com.withings.leaderboard.repositories.data.LeaderboardDAO
    public void delete(String str) {
        this.__db.b();
        f acquire = this.__preparedStmtOfDelete.acquire();
        acquire.s(1, str);
        try {
            this.__db.c();
            acquire.H();
            this.__db.z();
            this.__db.h();
        } finally {
            this.__preparedStmtOfDelete.release(acquire);
        }
    }

    @Override // com.withings.leaderboard.repositories.data.LeaderboardDAO
    public Object getLeaderboard(String str, d<? super List<LeaderboardEntry>> dVar) {
        final d0 c11 = d0.c(1, "SELECT * FROM leaderboard WHERE date = ? ORDER BY score DESC");
        c11.s(1, str);
        return g.b(this.__db, new CancellationSignal(), new Callable<List<LeaderboardEntry>>() { // from class: com.withings.leaderboard.repositories.data.LeaderboardDAO_ProdRoomDb_Impl.7
            @Override // java.util.concurrent.Callable
            public List<LeaderboardEntry> call() throws Exception {
                Cursor c12 = x8.b.c(LeaderboardDAO_ProdRoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "id");
                    int b11 = a.b(c12, "date");
                    int b12 = a.b(c12, "userid");
                    int b13 = a.b(c12, FirebaseAnalytics.Param.SCORE);
                    int b14 = a.b(c12, "firstname");
                    int b15 = a.b(c12, "lastName");
                    int b16 = a.b(c12, "imageUrl");
                    int b17 = a.b(c12, "modified");
                    ArrayList arrayList = new ArrayList(c12.getCount());
                    while (c12.moveToNext()) {
                        Long l5 = null;
                        Integer valueOf = c12.isNull(b10) ? null : Integer.valueOf(c12.getInt(b10));
                        String string = c12.getString(b11);
                        long j5 = c12.getLong(b12);
                        int i11 = c12.getInt(b13);
                        String string2 = c12.getString(b14);
                        String string3 = c12.getString(b15);
                        String string4 = c12.isNull(b16) ? null : c12.getString(b16);
                        if (!c12.isNull(b17)) {
                            l5 = Long.valueOf(c12.getLong(b17));
                        }
                        LeaderboardDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a11 = b.a(l5);
                        if (a11 != null) {
                            arrayList.add(new LeaderboardEntry(valueOf, string, j5, i11, string2, string3, string4, a11));
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
                    }
                    c12.close();
                    c11.release();
                    return arrayList;
                } catch (Throwable th2) {
                    c12.close();
                    c11.release();
                    throw th2;
                }
            }
        }, dVar);
    }

    @Override // com.withings.leaderboard.repositories.data.LeaderboardDAO
    public Flow<List<LeaderboardEntry>> getLeaderboardFlow(String str) {
        final d0 c11 = d0.c(1, "SELECT * FROM leaderboard WHERE date = ? ORDER BY score DESC");
        c11.s(1, str);
        return g.a(this.__db, false, new String[]{"leaderboard"}, new Callable<List<LeaderboardEntry>>() { // from class: com.withings.leaderboard.repositories.data.LeaderboardDAO_ProdRoomDb_Impl.8
            protected void finalize() {
                c11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<LeaderboardEntry> call() throws Exception {
                Cursor c12 = x8.b.c(LeaderboardDAO_ProdRoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "id");
                    int b11 = a.b(c12, "date");
                    int b12 = a.b(c12, "userid");
                    int b13 = a.b(c12, FirebaseAnalytics.Param.SCORE);
                    int b14 = a.b(c12, "firstname");
                    int b15 = a.b(c12, "lastName");
                    int b16 = a.b(c12, "imageUrl");
                    int b17 = a.b(c12, "modified");
                    ArrayList arrayList = new ArrayList(c12.getCount());
                    while (c12.moveToNext()) {
                        Long l5 = null;
                        Integer valueOf = c12.isNull(b10) ? null : Integer.valueOf(c12.getInt(b10));
                        String string = c12.getString(b11);
                        long j5 = c12.getLong(b12);
                        int i11 = c12.getInt(b13);
                        String string2 = c12.getString(b14);
                        String string3 = c12.getString(b15);
                        String string4 = c12.isNull(b16) ? null : c12.getString(b16);
                        if (!c12.isNull(b17)) {
                            l5 = Long.valueOf(c12.getLong(b17));
                        }
                        LeaderboardDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a11 = b.a(l5);
                        if (a11 != null) {
                            arrayList.add(new LeaderboardEntry(valueOf, string, j5, i11, string2, string3, string4, a11));
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

    @Override // com.withings.leaderboard.repositories.data.LeaderboardDAO
    public Object getMostRecentEntry(long j5, d<? super LeaderboardEntry> dVar) {
        final d0 c11 = d0.c(1, "SELECT * FROM leaderboard where userid = ? ORDER BY date DESC");
        return g.b(this.__db, v0.c(c11, 1, j5), new Callable<LeaderboardEntry>() { // from class: com.withings.leaderboard.repositories.data.LeaderboardDAO_ProdRoomDb_Impl.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public LeaderboardEntry call() throws Exception {
                Cursor c12 = x8.b.c(LeaderboardDAO_ProdRoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "id");
                    int b11 = a.b(c12, "date");
                    int b12 = a.b(c12, "userid");
                    int b13 = a.b(c12, FirebaseAnalytics.Param.SCORE);
                    int b14 = a.b(c12, "firstname");
                    int b15 = a.b(c12, "lastName");
                    int b16 = a.b(c12, "imageUrl");
                    int b17 = a.b(c12, "modified");
                    LeaderboardEntry leaderboardEntry = null;
                    Long valueOf = null;
                    if (c12.moveToFirst()) {
                        Integer valueOf2 = c12.isNull(b10) ? null : Integer.valueOf(c12.getInt(b10));
                        String string = c12.getString(b11);
                        long j11 = c12.getLong(b12);
                        int i11 = c12.getInt(b13);
                        String string2 = c12.getString(b14);
                        String string3 = c12.getString(b15);
                        String string4 = c12.isNull(b16) ? null : c12.getString(b16);
                        if (!c12.isNull(b17)) {
                            valueOf = Long.valueOf(c12.getLong(b17));
                        }
                        LeaderboardDAO_ProdRoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a11 = b.a(valueOf);
                        if (a11 != null) {
                            leaderboardEntry = new LeaderboardEntry(valueOf2, string, j11, i11, string2, string3, string4, a11);
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
                    }
                    c12.close();
                    c11.release();
                    return leaderboardEntry;
                } catch (Throwable th2) {
                    c12.close();
                    c11.release();
                    throw th2;
                }
            }
        }, dVar);
    }

    @Override // com.withings.leaderboard.repositories.data.LeaderboardDAO
    public void insert(List<LeaderboardEntry> list) {
        this.__db.b();
        this.__db.c();
        try {
            this.__insertionAdapterOfLeaderboardEntry.insert(list);
            this.__db.z();
        } finally {
            this.__db.h();
        }
    }

    @Override // com.withings.leaderboard.repositories.data.LeaderboardDAO
    public void insertLeaderboard(String str, List<LeaderboardEntry> list) {
        this.__db.c();
        try {
            super.insertLeaderboard(str, list);
            this.__db.z();
        } finally {
            this.__db.h();
        }
    }

    @Override // com.withings.leaderboard.repositories.data.LeaderboardDAO
    public DateTime localLastUpdate() {
        d0 c11 = d0.c(0, "SELECT modified FROM leaderboard ORDER BY modified DESC LIMIT 1");
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

    @Override // com.withings.leaderboard.repositories.data.LeaderboardDAO
    public Object delete(final long j5, d<? super y> dVar) {
        return g.c(this.__db, new Callable<y>() { // from class: com.withings.leaderboard.repositories.data.LeaderboardDAO_ProdRoomDb_Impl.5
            @Override // java.util.concurrent.Callable
            public y call() throws Exception {
                f acquire = LeaderboardDAO_ProdRoomDb_Impl.this.__preparedStmtOfDelete_1.acquire();
                acquire.v(1, j5);
                try {
                    LeaderboardDAO_ProdRoomDb_Impl.this.__db.c();
                    acquire.H();
                    LeaderboardDAO_ProdRoomDb_Impl.this.__db.z();
                    y yVar = y.f85009a;
                    LeaderboardDAO_ProdRoomDb_Impl.this.__db.h();
                    return yVar;
                } finally {
                    LeaderboardDAO_ProdRoomDb_Impl.this.__preparedStmtOfDelete_1.release(acquire);
                }
            }
        }, dVar);
    }
}
