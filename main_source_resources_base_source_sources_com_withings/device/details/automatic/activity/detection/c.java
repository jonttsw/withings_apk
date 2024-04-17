package com.withings.device.details.automatic.activity.detection;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.d0;
import androidx.room.h0;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import org.jivesoftware.smack.sm.packet.StreamManagement;
/* compiled from: ActirecCategoryDetectionDao_ProdRoomDb_Impl.java */
/* loaded from: classes3.dex */
public final class c implements com.withings.device.details.automatic.activity.detection.b {

    /* renamed from: a  reason: collision with root package name */
    private final RoomDatabase f36684a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.k<com.withings.device.details.automatic.activity.detection.a> f36685b;

    /* renamed from: c  reason: collision with root package name */
    private final h0 f36686c;

    /* renamed from: d  reason: collision with root package name */
    private final h0 f36687d;

    /* compiled from: ActirecCategoryDetectionDao_ProdRoomDb_Impl.java */
    /* loaded from: classes3.dex */
    final class a extends androidx.room.k<com.withings.device.details.automatic.activity.detection.a> {
        @Override // androidx.room.k
        protected final void bind(z8.f fVar, com.withings.device.details.automatic.activity.detection.a aVar) {
            com.withings.device.details.automatic.activity.detection.a aVar2 = aVar;
            fVar.v(1, aVar2.b());
            fVar.v(2, aVar2.c());
            fVar.v(3, aVar2.a() ? 1L : 0L);
        }

        @Override // androidx.room.h0
        protected final String createQuery() {
            return "INSERT OR REPLACE INTO `ActirecCategoryDetection` (`userId`,`workoutCategory`,`enabled`) VALUES (?,?,?)";
        }
    }

    /* compiled from: ActirecCategoryDetectionDao_ProdRoomDb_Impl.java */
    /* loaded from: classes3.dex */
    final class b extends h0 {
        @Override // androidx.room.h0
        public final String createQuery() {
            return "UPDATE ActirecCategoryDetection SET enabled = ? WHERE userId = ? AND workoutCategory = ?";
        }
    }

    /* compiled from: ActirecCategoryDetectionDao_ProdRoomDb_Impl.java */
    /* renamed from: com.withings.device.details.automatic.activity.detection.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    final class C0480c extends h0 {
        @Override // androidx.room.h0
        public final String createQuery() {
            return "UPDATE ActirecCategoryDetection SET enabled = ? WHERE userId = ?";
        }
    }

    /* compiled from: ActirecCategoryDetectionDao_ProdRoomDb_Impl.java */
    /* loaded from: classes3.dex */
    final class d implements Callable<List<com.withings.device.details.automatic.activity.detection.a>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d0 f36688a;

        d(d0 d0Var) {
            this.f36688a = d0Var;
        }

        @Override // java.util.concurrent.Callable
        public final List<com.withings.device.details.automatic.activity.detection.a> call() throws Exception {
            boolean z5;
            Cursor c11 = x8.b.c(c.this.f36684a, this.f36688a, false);
            try {
                int b10 = x8.a.b(c11, NavigationArguments.USER_ID);
                int b11 = x8.a.b(c11, "workoutCategory");
                int b12 = x8.a.b(c11, StreamManagement.Enabled.ELEMENT);
                ArrayList arrayList = new ArrayList(c11.getCount());
                while (c11.moveToNext()) {
                    long j5 = c11.getLong(b10);
                    long j11 = c11.getLong(b11);
                    if (c11.getInt(b12) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    arrayList.add(new com.withings.device.details.automatic.activity.detection.a(j5, j11, z5));
                }
                return arrayList;
            } finally {
                c11.close();
            }
        }

        protected final void finalize() {
            this.f36688a.release();
        }
    }

    public c(RoomDatabase roomDatabase) {
        this.f36684a = roomDatabase;
        this.f36685b = new androidx.room.k<>(roomDatabase);
        this.f36686c = new h0(roomDatabase);
        this.f36687d = new h0(roomDatabase);
    }

    @Override // com.withings.device.details.automatic.activity.detection.b
    public final void a(long j5, boolean z5) {
        RoomDatabase roomDatabase = this.f36684a;
        roomDatabase.b();
        h0 h0Var = this.f36687d;
        z8.f acquire = h0Var.acquire();
        acquire.v(1, z5 ? 1L : 0L);
        acquire.v(2, j5);
        try {
            roomDatabase.c();
            acquire.H();
            roomDatabase.z();
            roomDatabase.h();
        } finally {
            h0Var.release(acquire);
        }
    }

    @Override // com.withings.device.details.automatic.activity.detection.b
    public final void b(ArrayList arrayList) {
        RoomDatabase roomDatabase = this.f36684a;
        roomDatabase.b();
        roomDatabase.c();
        try {
            this.f36685b.insert(arrayList);
            roomDatabase.z();
        } finally {
            roomDatabase.h();
        }
    }

    @Override // com.withings.device.details.automatic.activity.detection.b
    public final void c(long j5, long j11, boolean z5) {
        RoomDatabase roomDatabase = this.f36684a;
        roomDatabase.b();
        h0 h0Var = this.f36686c;
        z8.f acquire = h0Var.acquire();
        acquire.v(1, z5 ? 1L : 0L);
        acquire.v(2, j5);
        acquire.v(3, j11);
        try {
            roomDatabase.c();
            acquire.H();
            roomDatabase.z();
            roomDatabase.h();
        } finally {
            h0Var.release(acquire);
        }
    }

    @Override // com.withings.device.details.automatic.activity.detection.b
    public final Flow<List<com.withings.device.details.automatic.activity.detection.a>> d(long j5) {
        d0 c11 = d0.c(1, "SELECT * FROM ActirecCategoryDetection WHERE userId = ?");
        c11.v(1, j5);
        d dVar = new d(c11);
        return androidx.room.g.a(this.f36684a, false, new String[]{"ActirecCategoryDetection"}, dVar);
    }

    @Override // com.withings.device.details.automatic.activity.detection.b
    public final LinkedHashMap e(long j5) {
        boolean z5;
        d0 c11 = d0.c(1, "SELECT workoutCategory, enabled FROM ActirecCategoryDetection WHERE userId = ?");
        c11.v(1, j5);
        RoomDatabase roomDatabase = this.f36684a;
        roomDatabase.b();
        Cursor c12 = x8.b.c(roomDatabase, c11, false);
        try {
            int b10 = x8.a.b(c12, "workoutCategory");
            int b11 = x8.a.b(c12, StreamManagement.Enabled.ELEMENT);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (c12.moveToNext()) {
                Long valueOf = Long.valueOf(c12.getLong(b10));
                if (c12.isNull(b11)) {
                    linkedHashMap.put(valueOf, null);
                } else {
                    if (c12.getInt(b11) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    Boolean valueOf2 = Boolean.valueOf(z5);
                    if (!linkedHashMap.containsKey(valueOf)) {
                        linkedHashMap.put(valueOf, valueOf2);
                    }
                }
            }
            c12.close();
            c11.release();
            return linkedHashMap;
        } catch (Throwable th2) {
            c12.close();
            c11.release();
            throw th2;
        }
    }
}
