package com.withings.ecg.model;

import ah.u;
import android.database.Cursor;
import androidx.camera.core.y1;
import androidx.compose.material3.j5;
import androidx.compose.material3.k4;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.room.d0;
import androidx.room.g;
import androidx.room.h0;
import androidx.room.j;
import androidx.room.k;
import com.withings.ecg.model.HeartSignalDao;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import com.withings.vasistas.ws.WsVasistasSerie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import org.joda.time.DateTime;
import pm.b;
import rb0.c;
import x8.a;
import z8.f;
/* loaded from: classes3.dex */
public final class HeartSignalDao_RoomDb_Impl implements HeartSignalDao {
    private final RoomDatabase __db;
    private final k<HeartSignalMeasurement> __insertionAdapterOfHeartSignalMeasurement;
    private final h0 __preparedStmtOfDelete;
    private final h0 __preparedStmtOfDeleteAll;
    private final j<HeartSignalMeasurement> __updateAdapterOfHeartSignalMeasurement;
    private final b __commonRoomConverter = new b();
    private final c __roomConverters = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [rb0.c, java.lang.Object] */
    public HeartSignalDao_RoomDb_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfHeartSignalMeasurement = new k<HeartSignalMeasurement>(roomDatabase) { // from class: com.withings.ecg.model.HeartSignalDao_RoomDb_Impl.1
            @Override // androidx.room.h0
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `EcgMeasurement` (`id`,`userID`,`deviceModel`,`timestamp`,`synced`,`modified`,`deviceId`,`trackerWearPos`,`deleted`,`measures`,`firmwareVersion`,`brand`,`signalId`,`signalPath`,`timeWindow`,`duration`,`totalSize`,`offset`,`gain`,`qfix`,`type`,`samplingFreq`,`channel`,`format`,`size`,`resolution`,`filterBank`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.k
            public void bind(f fVar, HeartSignalMeasurement heartSignalMeasurement) {
                fVar.v(1, heartSignalMeasurement.getId());
                fVar.v(2, heartSignalMeasurement.getUserID());
                fVar.v(3, heartSignalMeasurement.getDeviceModel());
                b bVar = HeartSignalDao_RoomDb_Impl.this.__commonRoomConverter;
                DateTime timestamp = heartSignalMeasurement.getTimestamp();
                bVar.getClass();
                Long e11 = b.e(timestamp);
                if (e11 == null) {
                    fVar.g2(4);
                } else {
                    fVar.v(4, e11.longValue());
                }
                fVar.v(5, heartSignalMeasurement.getSynced() ? 1L : 0L);
                fVar.v(6, heartSignalMeasurement.getModified());
                if (heartSignalMeasurement.getDeviceId() == null) {
                    fVar.g2(7);
                } else {
                    fVar.v(7, heartSignalMeasurement.getDeviceId().longValue());
                }
                if (heartSignalMeasurement.getTrackerWearPos() == null) {
                    fVar.g2(8);
                } else {
                    fVar.v(8, heartSignalMeasurement.getTrackerWearPos().intValue());
                }
                fVar.v(9, heartSignalMeasurement.getDeleted() ? 1L : 0L);
                c cVar = HeartSignalDao_RoomDb_Impl.this.__roomConverters;
                List<HeartSignalMeasurement.Measure> measures = heartSignalMeasurement.getMeasures();
                cVar.getClass();
                fVar.s(10, c.a(measures));
                if (heartSignalMeasurement.getFirmwareVersion() == null) {
                    fVar.g2(11);
                } else {
                    fVar.v(11, heartSignalMeasurement.getFirmwareVersion().intValue());
                }
                if (heartSignalMeasurement.getBrand() == null) {
                    fVar.g2(12);
                } else {
                    fVar.v(12, heartSignalMeasurement.getBrand().intValue());
                }
                Signal signal = heartSignalMeasurement.getSignal();
                if (signal.getSignalId() == null) {
                    fVar.g2(13);
                } else {
                    fVar.v(13, signal.getSignalId().longValue());
                }
                fVar.s(14, signal.getSignalPath());
                SignalMeta meta = signal.getMeta();
                fVar.v(15, meta.getTimeWindow());
                fVar.v(16, meta.getDuration());
                fVar.v(17, meta.getTotalSize());
                fVar.v(18, meta.getOffset());
                fVar.v(19, meta.getGain());
                fVar.v(20, meta.getQfix());
                fVar.v(21, meta.getType());
                fVar.v(22, meta.getSamplingFreq());
                fVar.v(23, meta.getChannel());
                fVar.v(24, meta.getFormat());
                fVar.v(25, meta.getSize());
                fVar.v(26, meta.getResolution());
                fVar.v(27, meta.getFilterBank());
            }
        };
        this.__updateAdapterOfHeartSignalMeasurement = new j<HeartSignalMeasurement>(roomDatabase) { // from class: com.withings.ecg.model.HeartSignalDao_RoomDb_Impl.2
            @Override // androidx.room.j, androidx.room.h0
            protected String createQuery() {
                return "UPDATE OR ABORT `EcgMeasurement` SET `id` = ?,`userID` = ?,`deviceModel` = ?,`timestamp` = ?,`synced` = ?,`modified` = ?,`deviceId` = ?,`trackerWearPos` = ?,`deleted` = ?,`measures` = ?,`firmwareVersion` = ?,`brand` = ?,`signalId` = ?,`signalPath` = ?,`timeWindow` = ?,`duration` = ?,`totalSize` = ?,`offset` = ?,`gain` = ?,`qfix` = ?,`type` = ?,`samplingFreq` = ?,`channel` = ?,`format` = ?,`size` = ?,`resolution` = ?,`filterBank` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.j
            public void bind(f fVar, HeartSignalMeasurement heartSignalMeasurement) {
                fVar.v(1, heartSignalMeasurement.getId());
                fVar.v(2, heartSignalMeasurement.getUserID());
                fVar.v(3, heartSignalMeasurement.getDeviceModel());
                b bVar = HeartSignalDao_RoomDb_Impl.this.__commonRoomConverter;
                DateTime timestamp = heartSignalMeasurement.getTimestamp();
                bVar.getClass();
                Long e11 = b.e(timestamp);
                if (e11 == null) {
                    fVar.g2(4);
                } else {
                    fVar.v(4, e11.longValue());
                }
                fVar.v(5, heartSignalMeasurement.getSynced() ? 1L : 0L);
                fVar.v(6, heartSignalMeasurement.getModified());
                if (heartSignalMeasurement.getDeviceId() == null) {
                    fVar.g2(7);
                } else {
                    fVar.v(7, heartSignalMeasurement.getDeviceId().longValue());
                }
                if (heartSignalMeasurement.getTrackerWearPos() == null) {
                    fVar.g2(8);
                } else {
                    fVar.v(8, heartSignalMeasurement.getTrackerWearPos().intValue());
                }
                fVar.v(9, heartSignalMeasurement.getDeleted() ? 1L : 0L);
                c cVar = HeartSignalDao_RoomDb_Impl.this.__roomConverters;
                List<HeartSignalMeasurement.Measure> measures = heartSignalMeasurement.getMeasures();
                cVar.getClass();
                fVar.s(10, c.a(measures));
                if (heartSignalMeasurement.getFirmwareVersion() == null) {
                    fVar.g2(11);
                } else {
                    fVar.v(11, heartSignalMeasurement.getFirmwareVersion().intValue());
                }
                if (heartSignalMeasurement.getBrand() == null) {
                    fVar.g2(12);
                } else {
                    fVar.v(12, heartSignalMeasurement.getBrand().intValue());
                }
                Signal signal = heartSignalMeasurement.getSignal();
                if (signal.getSignalId() == null) {
                    fVar.g2(13);
                } else {
                    fVar.v(13, signal.getSignalId().longValue());
                }
                fVar.s(14, signal.getSignalPath());
                SignalMeta meta = signal.getMeta();
                fVar.v(15, meta.getTimeWindow());
                fVar.v(16, meta.getDuration());
                fVar.v(17, meta.getTotalSize());
                fVar.v(18, meta.getOffset());
                fVar.v(19, meta.getGain());
                fVar.v(20, meta.getQfix());
                fVar.v(21, meta.getType());
                fVar.v(22, meta.getSamplingFreq());
                fVar.v(23, meta.getChannel());
                fVar.v(24, meta.getFormat());
                fVar.v(25, meta.getSize());
                fVar.v(26, meta.getResolution());
                fVar.v(27, meta.getFilterBank());
                fVar.v(28, heartSignalMeasurement.getId());
            }
        };
        this.__preparedStmtOfDelete = new h0(roomDatabase) { // from class: com.withings.ecg.model.HeartSignalDao_RoomDb_Impl.3
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM EcgMeasurement where id= ?";
            }
        };
        this.__preparedStmtOfDeleteAll = new h0(roomDatabase) { // from class: com.withings.ecg.model.HeartSignalDao_RoomDb_Impl.4
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM EcgMeasurement";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.withings.ecg.model.HeartSignalDao
    public void delete(long j5) {
        this.__db.b();
        f acquire = this.__preparedStmtOfDelete.acquire();
        acquire.v(1, j5);
        try {
            this.__db.c();
            acquire.H();
            this.__db.z();
            this.__db.h();
        } finally {
            this.__preparedStmtOfDelete.release(acquire);
        }
    }

    @Override // com.withings.ecg.model.HeartSignalDao
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

    @Override // com.withings.ecg.model.HeartSignalDao
    public void deleteByChunkedIds(List<Long> list) {
        this.__db.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM EcgMeasurement WHERE id in (");
        u.i(list.size(), sb2);
        sb2.append(")");
        f e11 = this.__db.e(sb2.toString());
        int i11 = 1;
        for (Long l5 : list) {
            e11.v(i11, l5.longValue());
            i11++;
        }
        this.__db.c();
        try {
            e11.H();
            this.__db.z();
        } finally {
            this.__db.h();
        }
    }

    @Override // com.withings.ecg.model.HeartSignalDao
    public void deleteByIds(List<Long> list) {
        this.__db.c();
        try {
            super.deleteByIds(list);
            this.__db.z();
        } finally {
            this.__db.h();
        }
    }

    @Override // com.withings.ecg.model.HeartSignalDao
    public HeartSignalMeasurement getBySignalId(long j5) {
        d0 d0Var;
        Long valueOf;
        boolean z5;
        Long valueOf2;
        Integer valueOf3;
        boolean z11;
        Integer valueOf4;
        Integer valueOf5;
        d0 c11 = d0.c(1, "SELECT * from EcgMeasurement where signalId = ? ");
        c11.v(1, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "id");
            int b11 = a.b(c12, "userID");
            int b12 = a.b(c12, "deviceModel");
            int b13 = a.b(c12, "timestamp");
            int b14 = a.b(c12, "synced");
            int b15 = a.b(c12, "modified");
            int b16 = a.b(c12, "deviceId");
            int b17 = a.b(c12, "trackerWearPos");
            int b18 = a.b(c12, "deleted");
            int b19 = a.b(c12, "measures");
            int b21 = a.b(c12, "firmwareVersion");
            int b22 = a.b(c12, "brand");
            int b23 = a.b(c12, "signalId");
            d0Var = c11;
            try {
                int b24 = a.b(c12, "signalPath");
                int b25 = a.b(c12, "timeWindow");
                int b26 = a.b(c12, "duration");
                int b27 = a.b(c12, "totalSize");
                int b28 = a.b(c12, GetHealthAttributeResponse.FIELD_OFFSET_NAME);
                int b29 = a.b(c12, "gain");
                int b31 = a.b(c12, "qfix");
                int b32 = a.b(c12, "type");
                int b33 = a.b(c12, "samplingFreq");
                int b34 = a.b(c12, "channel");
                int b35 = a.b(c12, WsVasistasSerie.KEY_FORMAT);
                int b36 = a.b(c12, "size");
                int b37 = a.b(c12, "resolution");
                int b38 = a.b(c12, "filterBank");
                HeartSignalMeasurement heartSignalMeasurement = null;
                Long valueOf6 = null;
                if (c12.moveToFirst()) {
                    long j11 = c12.getLong(b10);
                    long j12 = c12.getLong(b11);
                    int i11 = c12.getInt(b12);
                    if (c12.isNull(b13)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(c12.getLong(b13));
                    }
                    this.__commonRoomConverter.getClass();
                    DateTime a11 = b.a(valueOf);
                    if (a11 != null) {
                        if (c12.getInt(b14) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        long j13 = c12.getLong(b15);
                        if (c12.isNull(b16)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Long.valueOf(c12.getLong(b16));
                        }
                        if (c12.isNull(b17)) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Integer.valueOf(c12.getInt(b17));
                        }
                        if (c12.getInt(b18) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        String string = c12.getString(b19);
                        this.__roomConverters.getClass();
                        List c13 = c.c(string);
                        if (c12.isNull(b21)) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Integer.valueOf(c12.getInt(b21));
                        }
                        if (c12.isNull(b22)) {
                            valueOf5 = null;
                        } else {
                            valueOf5 = Integer.valueOf(c12.getInt(b22));
                        }
                        if (!c12.isNull(b23)) {
                            valueOf6 = Long.valueOf(c12.getLong(b23));
                        }
                        heartSignalMeasurement = new HeartSignalMeasurement(j11, j12, i11, a11, new Signal(valueOf6, new SignalMeta(c12.getInt(b25), c12.getLong(b26), c12.getLong(b27), c12.getInt(b28), c12.getInt(b29), c12.getLong(b31), c12.getInt(b32), c12.getInt(b33), c12.getShort(b34), c12.getShort(b35), c12.getShort(b36), c12.getShort(b37), c12.getLong(b38)), c12.getString(b24)), z5, j13, valueOf2, valueOf3, z11, c13, valueOf4, valueOf5);
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                    }
                }
                c12.close();
                d0Var.release();
                return heartSignalMeasurement;
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

    @Override // com.withings.ecg.model.HeartSignalDao
    public HeartSignalMeasurement getByTimestampAndType(long j5, long j11, int... iArr) {
        d0 d0Var;
        Long valueOf;
        boolean z5;
        Long valueOf2;
        Integer valueOf3;
        boolean z11;
        Integer valueOf4;
        Integer valueOf5;
        StringBuilder c11 = k4.c("SELECT * from EcgMeasurement where userID= ? AND timestamp=? AND type IN (");
        int length = iArr.length;
        d0 c12 = d0.c(length + 2, j5.c(length, c11, ") AND NOT deleted"));
        c12.v(1, j5);
        c12.v(2, j11);
        int i11 = 3;
        for (int i12 : iArr) {
            c12.v(i11, i12);
            i11++;
        }
        this.__db.b();
        Cursor c13 = x8.b.c(this.__db, c12, false);
        try {
            int b10 = a.b(c13, "id");
            int b11 = a.b(c13, "userID");
            int b12 = a.b(c13, "deviceModel");
            int b13 = a.b(c13, "timestamp");
            int b14 = a.b(c13, "synced");
            int b15 = a.b(c13, "modified");
            int b16 = a.b(c13, "deviceId");
            int b17 = a.b(c13, "trackerWearPos");
            int b18 = a.b(c13, "deleted");
            int b19 = a.b(c13, "measures");
            int b21 = a.b(c13, "firmwareVersion");
            int b22 = a.b(c13, "brand");
            int b23 = a.b(c13, "signalId");
            d0Var = c12;
            try {
                int b24 = a.b(c13, "signalPath");
                int b25 = a.b(c13, "timeWindow");
                int b26 = a.b(c13, "duration");
                int b27 = a.b(c13, "totalSize");
                int b28 = a.b(c13, GetHealthAttributeResponse.FIELD_OFFSET_NAME);
                int b29 = a.b(c13, "gain");
                int b31 = a.b(c13, "qfix");
                int b32 = a.b(c13, "type");
                int b33 = a.b(c13, "samplingFreq");
                int b34 = a.b(c13, "channel");
                int b35 = a.b(c13, WsVasistasSerie.KEY_FORMAT);
                int b36 = a.b(c13, "size");
                int b37 = a.b(c13, "resolution");
                int b38 = a.b(c13, "filterBank");
                HeartSignalMeasurement heartSignalMeasurement = null;
                Long valueOf6 = null;
                if (c13.moveToFirst()) {
                    long j12 = c13.getLong(b10);
                    long j13 = c13.getLong(b11);
                    int i13 = c13.getInt(b12);
                    if (c13.isNull(b13)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(c13.getLong(b13));
                    }
                    this.__commonRoomConverter.getClass();
                    DateTime a11 = b.a(valueOf);
                    if (a11 != null) {
                        if (c13.getInt(b14) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        long j14 = c13.getLong(b15);
                        if (c13.isNull(b16)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Long.valueOf(c13.getLong(b16));
                        }
                        if (c13.isNull(b17)) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Integer.valueOf(c13.getInt(b17));
                        }
                        if (c13.getInt(b18) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        String string = c13.getString(b19);
                        this.__roomConverters.getClass();
                        List c14 = c.c(string);
                        if (c13.isNull(b21)) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Integer.valueOf(c13.getInt(b21));
                        }
                        if (c13.isNull(b22)) {
                            valueOf5 = null;
                        } else {
                            valueOf5 = Integer.valueOf(c13.getInt(b22));
                        }
                        if (!c13.isNull(b23)) {
                            valueOf6 = Long.valueOf(c13.getLong(b23));
                        }
                        heartSignalMeasurement = new HeartSignalMeasurement(j12, j13, i13, a11, new Signal(valueOf6, new SignalMeta(c13.getInt(b25), c13.getLong(b26), c13.getLong(b27), c13.getInt(b28), c13.getInt(b29), c13.getLong(b31), c13.getInt(b32), c13.getInt(b33), c13.getShort(b34), c13.getShort(b35), c13.getShort(b36), c13.getShort(b37), c13.getLong(b38)), c13.getString(b24)), z5, j14, valueOf2, valueOf3, z11, c14, valueOf4, valueOf5);
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                    }
                }
                c13.close();
                d0Var.release();
                return heartSignalMeasurement;
            } catch (Throwable th2) {
                th = th2;
                c13.close();
                d0Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            d0Var = c12;
        }
    }

    @Override // com.withings.ecg.model.HeartSignalDao
    public Flow<HeartSignalMeasurement> getByTimestampAndTypeFlow(long j5, long j11, int... iArr) {
        StringBuilder c11 = k4.c("SELECT * from EcgMeasurement where userID= ? AND timestamp=? AND type IN (");
        int length = iArr.length;
        final d0 c12 = d0.c(length + 2, j5.c(length, c11, ") AND NOT deleted"));
        c12.v(1, j5);
        c12.v(2, j11);
        int i11 = 3;
        for (int i12 : iArr) {
            c12.v(i11, i12);
            i11++;
        }
        return g.a(this.__db, false, new String[]{"EcgMeasurement"}, new Callable<HeartSignalMeasurement>() { // from class: com.withings.ecg.model.HeartSignalDao_RoomDb_Impl.6
            protected void finalize() {
                c12.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public HeartSignalMeasurement call() throws Exception {
                Cursor c13 = x8.b.c(HeartSignalDao_RoomDb_Impl.this.__db, c12, false);
                try {
                    int b10 = a.b(c13, "id");
                    int b11 = a.b(c13, "userID");
                    int b12 = a.b(c13, "deviceModel");
                    int b13 = a.b(c13, "timestamp");
                    int b14 = a.b(c13, "synced");
                    int b15 = a.b(c13, "modified");
                    int b16 = a.b(c13, "deviceId");
                    int b17 = a.b(c13, "trackerWearPos");
                    int b18 = a.b(c13, "deleted");
                    int b19 = a.b(c13, "measures");
                    int b21 = a.b(c13, "firmwareVersion");
                    int b22 = a.b(c13, "brand");
                    int b23 = a.b(c13, "signalId");
                    int b24 = a.b(c13, "signalPath");
                    int b25 = a.b(c13, "timeWindow");
                    int b26 = a.b(c13, "duration");
                    int b27 = a.b(c13, "totalSize");
                    int b28 = a.b(c13, GetHealthAttributeResponse.FIELD_OFFSET_NAME);
                    int b29 = a.b(c13, "gain");
                    int b31 = a.b(c13, "qfix");
                    int b32 = a.b(c13, "type");
                    int b33 = a.b(c13, "samplingFreq");
                    int b34 = a.b(c13, "channel");
                    int b35 = a.b(c13, WsVasistasSerie.KEY_FORMAT);
                    int b36 = a.b(c13, "size");
                    int b37 = a.b(c13, "resolution");
                    int b38 = a.b(c13, "filterBank");
                    HeartSignalMeasurement heartSignalMeasurement = null;
                    if (c13.moveToFirst()) {
                        long j12 = c13.getLong(b10);
                        long j13 = c13.getLong(b11);
                        int i13 = c13.getInt(b12);
                        Long valueOf = c13.isNull(b13) ? null : Long.valueOf(c13.getLong(b13));
                        HeartSignalDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a11 = b.a(valueOf);
                        if (a11 != null) {
                            boolean z5 = c13.getInt(b14) != 0;
                            long j14 = c13.getLong(b15);
                            Long valueOf2 = c13.isNull(b16) ? null : Long.valueOf(c13.getLong(b16));
                            Integer valueOf3 = c13.isNull(b17) ? null : Integer.valueOf(c13.getInt(b17));
                            boolean z11 = c13.getInt(b18) != 0;
                            String string = c13.getString(b19);
                            HeartSignalDao_RoomDb_Impl.this.__roomConverters.getClass();
                            heartSignalMeasurement = new HeartSignalMeasurement(j12, j13, i13, a11, new Signal(c13.isNull(b23) ? null : Long.valueOf(c13.getLong(b23)), new SignalMeta(c13.getInt(b25), c13.getLong(b26), c13.getLong(b27), c13.getInt(b28), c13.getInt(b29), c13.getLong(b31), c13.getInt(b32), c13.getInt(b33), c13.getShort(b34), c13.getShort(b35), c13.getShort(b36), c13.getShort(b37), c13.getLong(b38)), c13.getString(b24)), z5, j14, valueOf2, valueOf3, z11, c.c(string), c13.isNull(b21) ? null : Integer.valueOf(c13.getInt(b21)), c13.isNull(b22) ? null : Integer.valueOf(c13.getInt(b22)));
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
                    }
                    c13.close();
                    return heartSignalMeasurement;
                } catch (Throwable th2) {
                    c13.close();
                    throw th2;
                }
            }
        });
    }

    @Override // com.withings.ecg.model.HeartSignalDao
    public Flow<HeartSignalMeasurement> getContinuousLastHeartSignal(long j5, int... iArr) {
        StringBuilder c11 = k4.c("SELECT * from EcgMeasurement where userId= ? AND type IN (");
        int length = iArr.length;
        final d0 c12 = d0.c(length + 1, j5.c(length, c11, ") AND NOT deleted Order by timestamp DESC LIMIT 1"));
        c12.v(1, j5);
        int i11 = 2;
        for (int i12 : iArr) {
            c12.v(i11, i12);
            i11++;
        }
        return g.a(this.__db, false, new String[]{"EcgMeasurement"}, new Callable<HeartSignalMeasurement>() { // from class: com.withings.ecg.model.HeartSignalDao_RoomDb_Impl.9
            protected void finalize() {
                c12.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public HeartSignalMeasurement call() throws Exception {
                Cursor c13 = x8.b.c(HeartSignalDao_RoomDb_Impl.this.__db, c12, false);
                try {
                    int b10 = a.b(c13, "id");
                    int b11 = a.b(c13, "userID");
                    int b12 = a.b(c13, "deviceModel");
                    int b13 = a.b(c13, "timestamp");
                    int b14 = a.b(c13, "synced");
                    int b15 = a.b(c13, "modified");
                    int b16 = a.b(c13, "deviceId");
                    int b17 = a.b(c13, "trackerWearPos");
                    int b18 = a.b(c13, "deleted");
                    int b19 = a.b(c13, "measures");
                    int b21 = a.b(c13, "firmwareVersion");
                    int b22 = a.b(c13, "brand");
                    int b23 = a.b(c13, "signalId");
                    int b24 = a.b(c13, "signalPath");
                    int b25 = a.b(c13, "timeWindow");
                    int b26 = a.b(c13, "duration");
                    int b27 = a.b(c13, "totalSize");
                    int b28 = a.b(c13, GetHealthAttributeResponse.FIELD_OFFSET_NAME);
                    int b29 = a.b(c13, "gain");
                    int b31 = a.b(c13, "qfix");
                    int b32 = a.b(c13, "type");
                    int b33 = a.b(c13, "samplingFreq");
                    int b34 = a.b(c13, "channel");
                    int b35 = a.b(c13, WsVasistasSerie.KEY_FORMAT);
                    int b36 = a.b(c13, "size");
                    int b37 = a.b(c13, "resolution");
                    int b38 = a.b(c13, "filterBank");
                    HeartSignalMeasurement heartSignalMeasurement = null;
                    if (c13.moveToFirst()) {
                        long j11 = c13.getLong(b10);
                        long j12 = c13.getLong(b11);
                        int i13 = c13.getInt(b12);
                        Long valueOf = c13.isNull(b13) ? null : Long.valueOf(c13.getLong(b13));
                        HeartSignalDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a11 = b.a(valueOf);
                        if (a11 != null) {
                            boolean z5 = c13.getInt(b14) != 0;
                            long j13 = c13.getLong(b15);
                            Long valueOf2 = c13.isNull(b16) ? null : Long.valueOf(c13.getLong(b16));
                            Integer valueOf3 = c13.isNull(b17) ? null : Integer.valueOf(c13.getInt(b17));
                            boolean z11 = c13.getInt(b18) != 0;
                            String string = c13.getString(b19);
                            HeartSignalDao_RoomDb_Impl.this.__roomConverters.getClass();
                            heartSignalMeasurement = new HeartSignalMeasurement(j11, j12, i13, a11, new Signal(c13.isNull(b23) ? null : Long.valueOf(c13.getLong(b23)), new SignalMeta(c13.getInt(b25), c13.getLong(b26), c13.getLong(b27), c13.getInt(b28), c13.getInt(b29), c13.getLong(b31), c13.getInt(b32), c13.getInt(b33), c13.getShort(b34), c13.getShort(b35), c13.getShort(b36), c13.getShort(b37), c13.getLong(b38)), c13.getString(b24)), z5, j13, valueOf2, valueOf3, z11, c.c(string), c13.isNull(b21) ? null : Integer.valueOf(c13.getInt(b21)), c13.isNull(b22) ? null : Integer.valueOf(c13.getInt(b22)));
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
                    }
                    c13.close();
                    return heartSignalMeasurement;
                } catch (Throwable th2) {
                    c13.close();
                    throw th2;
                }
            }
        });
    }

    @Override // com.withings.ecg.model.HeartSignalDao
    public int getCount(long j5) {
        d0 c11 = d0.c(1, "SELECT COUNT(*) from EcgMeasurement where userID = ?");
        c11.v(1, j5);
        this.__db.b();
        int i11 = 0;
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            if (c12.moveToFirst()) {
                i11 = c12.getInt(0);
            }
            return i11;
        } finally {
            c12.close();
            c11.release();
        }
    }

    @Override // com.withings.ecg.model.HeartSignalDao
    public Flow<Integer> getCountAsFlow() {
        final d0 c11 = d0.c(0, "SELECT COUNT(*) from EcgMeasurement");
        return g.a(this.__db, false, new String[]{"EcgMeasurement"}, new Callable<Integer>() { // from class: com.withings.ecg.model.HeartSignalDao_RoomDb_Impl.10
            protected void finalize() {
                c11.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                int i11;
                Cursor c12 = x8.b.c(HeartSignalDao_RoomDb_Impl.this.__db, c11, false);
                try {
                    if (c12.moveToFirst()) {
                        i11 = Integer.valueOf(c12.getInt(0));
                    } else {
                        i11 = 0;
                    }
                    c12.close();
                    return i11;
                } catch (Throwable th2) {
                    c12.close();
                    throw th2;
                }
            }
        });
    }

    @Override // com.withings.ecg.model.HeartSignalDao
    public HeartSignalMeasurement getHeartSignal(long j5) {
        d0 d0Var;
        Long valueOf;
        boolean z5;
        Long valueOf2;
        Integer valueOf3;
        boolean z11;
        Integer valueOf4;
        Integer valueOf5;
        d0 c11 = d0.c(1, "SELECT * from EcgMeasurement where id = ?");
        c11.v(1, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "id");
            int b11 = a.b(c12, "userID");
            int b12 = a.b(c12, "deviceModel");
            int b13 = a.b(c12, "timestamp");
            int b14 = a.b(c12, "synced");
            int b15 = a.b(c12, "modified");
            int b16 = a.b(c12, "deviceId");
            int b17 = a.b(c12, "trackerWearPos");
            int b18 = a.b(c12, "deleted");
            int b19 = a.b(c12, "measures");
            int b21 = a.b(c12, "firmwareVersion");
            int b22 = a.b(c12, "brand");
            int b23 = a.b(c12, "signalId");
            d0Var = c11;
            try {
                int b24 = a.b(c12, "signalPath");
                int b25 = a.b(c12, "timeWindow");
                int b26 = a.b(c12, "duration");
                int b27 = a.b(c12, "totalSize");
                int b28 = a.b(c12, GetHealthAttributeResponse.FIELD_OFFSET_NAME);
                int b29 = a.b(c12, "gain");
                int b31 = a.b(c12, "qfix");
                int b32 = a.b(c12, "type");
                int b33 = a.b(c12, "samplingFreq");
                int b34 = a.b(c12, "channel");
                int b35 = a.b(c12, WsVasistasSerie.KEY_FORMAT);
                int b36 = a.b(c12, "size");
                int b37 = a.b(c12, "resolution");
                int b38 = a.b(c12, "filterBank");
                HeartSignalMeasurement heartSignalMeasurement = null;
                Long valueOf6 = null;
                if (c12.moveToFirst()) {
                    long j11 = c12.getLong(b10);
                    long j12 = c12.getLong(b11);
                    int i11 = c12.getInt(b12);
                    if (c12.isNull(b13)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(c12.getLong(b13));
                    }
                    this.__commonRoomConverter.getClass();
                    DateTime a11 = b.a(valueOf);
                    if (a11 != null) {
                        if (c12.getInt(b14) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        long j13 = c12.getLong(b15);
                        if (c12.isNull(b16)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Long.valueOf(c12.getLong(b16));
                        }
                        if (c12.isNull(b17)) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Integer.valueOf(c12.getInt(b17));
                        }
                        if (c12.getInt(b18) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        String string = c12.getString(b19);
                        this.__roomConverters.getClass();
                        List c13 = c.c(string);
                        if (c12.isNull(b21)) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Integer.valueOf(c12.getInt(b21));
                        }
                        if (c12.isNull(b22)) {
                            valueOf5 = null;
                        } else {
                            valueOf5 = Integer.valueOf(c12.getInt(b22));
                        }
                        if (!c12.isNull(b23)) {
                            valueOf6 = Long.valueOf(c12.getLong(b23));
                        }
                        heartSignalMeasurement = new HeartSignalMeasurement(j11, j12, i11, a11, new Signal(valueOf6, new SignalMeta(c12.getInt(b25), c12.getLong(b26), c12.getLong(b27), c12.getInt(b28), c12.getInt(b29), c12.getLong(b31), c12.getInt(b32), c12.getInt(b33), c12.getShort(b34), c12.getShort(b35), c12.getShort(b36), c12.getShort(b37), c12.getLong(b38)), c12.getString(b24)), z5, j13, valueOf2, valueOf3, z11, c13, valueOf4, valueOf5);
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                    }
                }
                c12.close();
                d0Var.release();
                return heartSignalMeasurement;
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

    @Override // com.withings.ecg.model.HeartSignalDao
    public LiveData<HeartSignalMeasurement> getHeartSignalLiveData(long j5) {
        final d0 c11 = d0.c(1, "SELECT * from EcgMeasurement where id = ? AND NOT deleted");
        c11.v(1, j5);
        return this.__db.l().c(new String[]{"EcgMeasurement"}, new Callable<HeartSignalMeasurement>() { // from class: com.withings.ecg.model.HeartSignalDao_RoomDb_Impl.8
            protected void finalize() {
                c11.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public HeartSignalMeasurement call() throws Exception {
                Cursor c12 = x8.b.c(HeartSignalDao_RoomDb_Impl.this.__db, c11, false);
                try {
                    int b10 = a.b(c12, "id");
                    int b11 = a.b(c12, "userID");
                    int b12 = a.b(c12, "deviceModel");
                    int b13 = a.b(c12, "timestamp");
                    int b14 = a.b(c12, "synced");
                    int b15 = a.b(c12, "modified");
                    int b16 = a.b(c12, "deviceId");
                    int b17 = a.b(c12, "trackerWearPos");
                    int b18 = a.b(c12, "deleted");
                    int b19 = a.b(c12, "measures");
                    int b21 = a.b(c12, "firmwareVersion");
                    int b22 = a.b(c12, "brand");
                    int b23 = a.b(c12, "signalId");
                    int b24 = a.b(c12, "signalPath");
                    int b25 = a.b(c12, "timeWindow");
                    int b26 = a.b(c12, "duration");
                    int b27 = a.b(c12, "totalSize");
                    int b28 = a.b(c12, GetHealthAttributeResponse.FIELD_OFFSET_NAME);
                    int b29 = a.b(c12, "gain");
                    int b31 = a.b(c12, "qfix");
                    int b32 = a.b(c12, "type");
                    int b33 = a.b(c12, "samplingFreq");
                    int b34 = a.b(c12, "channel");
                    int b35 = a.b(c12, WsVasistasSerie.KEY_FORMAT);
                    int b36 = a.b(c12, "size");
                    int b37 = a.b(c12, "resolution");
                    int b38 = a.b(c12, "filterBank");
                    HeartSignalMeasurement heartSignalMeasurement = null;
                    if (c12.moveToFirst()) {
                        long j11 = c12.getLong(b10);
                        long j12 = c12.getLong(b11);
                        int i11 = c12.getInt(b12);
                        Long valueOf = c12.isNull(b13) ? null : Long.valueOf(c12.getLong(b13));
                        HeartSignalDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a11 = b.a(valueOf);
                        if (a11 != null) {
                            boolean z5 = c12.getInt(b14) != 0;
                            long j13 = c12.getLong(b15);
                            Long valueOf2 = c12.isNull(b16) ? null : Long.valueOf(c12.getLong(b16));
                            Integer valueOf3 = c12.isNull(b17) ? null : Integer.valueOf(c12.getInt(b17));
                            boolean z11 = c12.getInt(b18) != 0;
                            String string = c12.getString(b19);
                            HeartSignalDao_RoomDb_Impl.this.__roomConverters.getClass();
                            heartSignalMeasurement = new HeartSignalMeasurement(j11, j12, i11, a11, new Signal(c12.isNull(b23) ? null : Long.valueOf(c12.getLong(b23)), new SignalMeta(c12.getInt(b25), c12.getLong(b26), c12.getLong(b27), c12.getInt(b28), c12.getInt(b29), c12.getLong(b31), c12.getInt(b32), c12.getInt(b33), c12.getShort(b34), c12.getShort(b35), c12.getShort(b36), c12.getShort(b37), c12.getLong(b38)), c12.getString(b24)), z5, j13, valueOf2, valueOf3, z11, c.c(string), c12.isNull(b21) ? null : Integer.valueOf(c12.getInt(b21)), c12.isNull(b22) ? null : Integer.valueOf(c12.getInt(b22)));
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
                    }
                    c12.close();
                    return heartSignalMeasurement;
                } catch (Throwable th2) {
                    c12.close();
                    throw th2;
                }
            }
        });
    }

    @Override // com.withings.ecg.model.HeartSignalDao
    public HeartSignalMeasurement getLastHeartSignal(long j5, int... iArr) {
        d0 d0Var;
        Long valueOf;
        boolean z5;
        Long valueOf2;
        Integer valueOf3;
        boolean z11;
        Integer valueOf4;
        Integer valueOf5;
        StringBuilder c11 = k4.c("SELECT * from EcgMeasurement where userId= ? AND type IN (");
        int length = iArr.length;
        d0 c12 = d0.c(length + 1, j5.c(length, c11, ") AND NOT deleted Order by timestamp DESC LIMIT 1"));
        c12.v(1, j5);
        int i11 = 2;
        for (int i12 : iArr) {
            c12.v(i11, i12);
            i11++;
        }
        this.__db.b();
        Cursor c13 = x8.b.c(this.__db, c12, false);
        try {
            int b10 = a.b(c13, "id");
            int b11 = a.b(c13, "userID");
            int b12 = a.b(c13, "deviceModel");
            int b13 = a.b(c13, "timestamp");
            int b14 = a.b(c13, "synced");
            int b15 = a.b(c13, "modified");
            int b16 = a.b(c13, "deviceId");
            int b17 = a.b(c13, "trackerWearPos");
            int b18 = a.b(c13, "deleted");
            int b19 = a.b(c13, "measures");
            int b21 = a.b(c13, "firmwareVersion");
            int b22 = a.b(c13, "brand");
            int b23 = a.b(c13, "signalId");
            d0Var = c12;
            try {
                int b24 = a.b(c13, "signalPath");
                int b25 = a.b(c13, "timeWindow");
                int b26 = a.b(c13, "duration");
                int b27 = a.b(c13, "totalSize");
                int b28 = a.b(c13, GetHealthAttributeResponse.FIELD_OFFSET_NAME);
                int b29 = a.b(c13, "gain");
                int b31 = a.b(c13, "qfix");
                int b32 = a.b(c13, "type");
                int b33 = a.b(c13, "samplingFreq");
                int b34 = a.b(c13, "channel");
                int b35 = a.b(c13, WsVasistasSerie.KEY_FORMAT);
                int b36 = a.b(c13, "size");
                int b37 = a.b(c13, "resolution");
                int b38 = a.b(c13, "filterBank");
                HeartSignalMeasurement heartSignalMeasurement = null;
                Long valueOf6 = null;
                if (c13.moveToFirst()) {
                    long j11 = c13.getLong(b10);
                    long j12 = c13.getLong(b11);
                    int i13 = c13.getInt(b12);
                    if (c13.isNull(b13)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(c13.getLong(b13));
                    }
                    this.__commonRoomConverter.getClass();
                    DateTime a11 = b.a(valueOf);
                    if (a11 != null) {
                        if (c13.getInt(b14) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        long j13 = c13.getLong(b15);
                        if (c13.isNull(b16)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Long.valueOf(c13.getLong(b16));
                        }
                        if (c13.isNull(b17)) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Integer.valueOf(c13.getInt(b17));
                        }
                        if (c13.getInt(b18) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        String string = c13.getString(b19);
                        this.__roomConverters.getClass();
                        List c14 = c.c(string);
                        if (c13.isNull(b21)) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Integer.valueOf(c13.getInt(b21));
                        }
                        if (c13.isNull(b22)) {
                            valueOf5 = null;
                        } else {
                            valueOf5 = Integer.valueOf(c13.getInt(b22));
                        }
                        if (!c13.isNull(b23)) {
                            valueOf6 = Long.valueOf(c13.getLong(b23));
                        }
                        heartSignalMeasurement = new HeartSignalMeasurement(j11, j12, i13, a11, new Signal(valueOf6, new SignalMeta(c13.getInt(b25), c13.getLong(b26), c13.getLong(b27), c13.getInt(b28), c13.getInt(b29), c13.getLong(b31), c13.getInt(b32), c13.getInt(b33), c13.getShort(b34), c13.getShort(b35), c13.getShort(b36), c13.getShort(b37), c13.getLong(b38)), c13.getString(b24)), z5, j13, valueOf2, valueOf3, z11, c14, valueOf4, valueOf5);
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                    }
                }
                c13.close();
                d0Var.release();
                return heartSignalMeasurement;
            } catch (Throwable th2) {
                th = th2;
                c13.close();
                d0Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            d0Var = c12;
        }
    }

    @Override // com.withings.ecg.model.HeartSignalDao
    public long getLastModifiedSyncedToWsForUserId(long j5) {
        long j11;
        d0 c11 = d0.c(1, "SELECT MAX(modified) from EcgMeasurement where userId= ? AND synced");
        c11.v(1, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            if (c12.moveToFirst()) {
                j11 = c12.getLong(0);
            } else {
                j11 = 0;
            }
            return j11;
        } finally {
            c12.close();
            c11.release();
        }
    }

    @Override // com.withings.ecg.model.HeartSignalDao
    public long getLastUpdate(long j5) {
        long j11;
        d0 c11 = d0.c(1, "SELECT MAX(modified) from EcgMeasurement where userId=?");
        c11.v(1, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            if (c12.moveToFirst()) {
                j11 = c12.getLong(0);
            } else {
                j11 = 0;
            }
            return j11;
        } finally {
            c12.close();
            c11.release();
        }
    }

    @Override // com.withings.ecg.model.HeartSignalDao
    public HeartSignalMeasurement getNotDeletedBySignalId(long j5) {
        d0 d0Var;
        Long valueOf;
        boolean z5;
        Long valueOf2;
        Integer valueOf3;
        boolean z11;
        Integer valueOf4;
        Integer valueOf5;
        d0 c11 = d0.c(1, "SELECT * from EcgMeasurement where signalId = ? AND NOT deleted");
        c11.v(1, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "id");
            int b11 = a.b(c12, "userID");
            int b12 = a.b(c12, "deviceModel");
            int b13 = a.b(c12, "timestamp");
            int b14 = a.b(c12, "synced");
            int b15 = a.b(c12, "modified");
            int b16 = a.b(c12, "deviceId");
            int b17 = a.b(c12, "trackerWearPos");
            int b18 = a.b(c12, "deleted");
            int b19 = a.b(c12, "measures");
            int b21 = a.b(c12, "firmwareVersion");
            int b22 = a.b(c12, "brand");
            int b23 = a.b(c12, "signalId");
            d0Var = c11;
            try {
                int b24 = a.b(c12, "signalPath");
                int b25 = a.b(c12, "timeWindow");
                int b26 = a.b(c12, "duration");
                int b27 = a.b(c12, "totalSize");
                int b28 = a.b(c12, GetHealthAttributeResponse.FIELD_OFFSET_NAME);
                int b29 = a.b(c12, "gain");
                int b31 = a.b(c12, "qfix");
                int b32 = a.b(c12, "type");
                int b33 = a.b(c12, "samplingFreq");
                int b34 = a.b(c12, "channel");
                int b35 = a.b(c12, WsVasistasSerie.KEY_FORMAT);
                int b36 = a.b(c12, "size");
                int b37 = a.b(c12, "resolution");
                int b38 = a.b(c12, "filterBank");
                HeartSignalMeasurement heartSignalMeasurement = null;
                Long valueOf6 = null;
                if (c12.moveToFirst()) {
                    long j11 = c12.getLong(b10);
                    long j12 = c12.getLong(b11);
                    int i11 = c12.getInt(b12);
                    if (c12.isNull(b13)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(c12.getLong(b13));
                    }
                    this.__commonRoomConverter.getClass();
                    DateTime a11 = b.a(valueOf);
                    if (a11 != null) {
                        if (c12.getInt(b14) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        long j13 = c12.getLong(b15);
                        if (c12.isNull(b16)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Long.valueOf(c12.getLong(b16));
                        }
                        if (c12.isNull(b17)) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Integer.valueOf(c12.getInt(b17));
                        }
                        if (c12.getInt(b18) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        String string = c12.getString(b19);
                        this.__roomConverters.getClass();
                        List c13 = c.c(string);
                        if (c12.isNull(b21)) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Integer.valueOf(c12.getInt(b21));
                        }
                        if (c12.isNull(b22)) {
                            valueOf5 = null;
                        } else {
                            valueOf5 = Integer.valueOf(c12.getInt(b22));
                        }
                        if (!c12.isNull(b23)) {
                            valueOf6 = Long.valueOf(c12.getLong(b23));
                        }
                        heartSignalMeasurement = new HeartSignalMeasurement(j11, j12, i11, a11, new Signal(valueOf6, new SignalMeta(c12.getInt(b25), c12.getLong(b26), c12.getLong(b27), c12.getInt(b28), c12.getInt(b29), c12.getLong(b31), c12.getInt(b32), c12.getInt(b33), c12.getShort(b34), c12.getShort(b35), c12.getShort(b36), c12.getShort(b37), c12.getLong(b38)), c12.getString(b24)), z5, j13, valueOf2, valueOf3, z11, c13, valueOf4, valueOf5);
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                    }
                }
                c12.close();
                d0Var.release();
                return heartSignalMeasurement;
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

    @Override // com.withings.ecg.model.HeartSignalDao
    public HeartSignalMeasurement getNotDeletedHeartSignal(long j5) {
        d0 d0Var;
        d0 c11 = d0.c(1, "SELECT * from EcgMeasurement where id = ? AND NOT deleted");
        c11.v(1, j5);
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            int b10 = a.b(c12, "id");
            int b11 = a.b(c12, "userID");
            int b12 = a.b(c12, "deviceModel");
            int b13 = a.b(c12, "timestamp");
            int b14 = a.b(c12, "synced");
            int b15 = a.b(c12, "modified");
            int b16 = a.b(c12, "deviceId");
            int b17 = a.b(c12, "trackerWearPos");
            int b18 = a.b(c12, "deleted");
            int b19 = a.b(c12, "measures");
            int b21 = a.b(c12, "firmwareVersion");
            int b22 = a.b(c12, "brand");
            int b23 = a.b(c12, "signalId");
            d0Var = c11;
            try {
                int b24 = a.b(c12, "signalPath");
                int b25 = a.b(c12, "timeWindow");
                int b26 = a.b(c12, "duration");
                int b27 = a.b(c12, "totalSize");
                int b28 = a.b(c12, GetHealthAttributeResponse.FIELD_OFFSET_NAME);
                int b29 = a.b(c12, "gain");
                int b31 = a.b(c12, "qfix");
                int b32 = a.b(c12, "type");
                int b33 = a.b(c12, "samplingFreq");
                int b34 = a.b(c12, "channel");
                int b35 = a.b(c12, WsVasistasSerie.KEY_FORMAT);
                int b36 = a.b(c12, "size");
                int b37 = a.b(c12, "resolution");
                int b38 = a.b(c12, "filterBank");
                HeartSignalMeasurement heartSignalMeasurement = null;
                if (c12.moveToFirst()) {
                    long j11 = c12.getLong(b10);
                    long j12 = c12.getLong(b11);
                    int i11 = c12.getInt(b12);
                    Long valueOf = c12.isNull(b13) ? null : Long.valueOf(c12.getLong(b13));
                    this.__commonRoomConverter.getClass();
                    DateTime a11 = b.a(valueOf);
                    if (a11 != null) {
                        boolean z5 = c12.getInt(b14) != 0;
                        long j13 = c12.getLong(b15);
                        Long valueOf2 = c12.isNull(b16) ? null : Long.valueOf(c12.getLong(b16));
                        Integer valueOf3 = c12.isNull(b17) ? null : Integer.valueOf(c12.getInt(b17));
                        boolean z11 = c12.getInt(b18) != 0;
                        String string = c12.getString(b19);
                        this.__roomConverters.getClass();
                        heartSignalMeasurement = new HeartSignalMeasurement(j11, j12, i11, a11, new Signal(c12.isNull(b23) ? null : Long.valueOf(c12.getLong(b23)), new SignalMeta(c12.getInt(b25), c12.getLong(b26), c12.getLong(b27), c12.getInt(b28), c12.getInt(b29), c12.getLong(b31), c12.getInt(b32), c12.getInt(b33), c12.getShort(b34), c12.getShort(b35), c12.getShort(b36), c12.getShort(b37), c12.getLong(b38)), c12.getString(b24)), z5, j13, valueOf2, valueOf3, z11, c.c(string), c12.isNull(b21) ? null : Integer.valueOf(c12.getInt(b21)), c12.isNull(b22) ? null : Integer.valueOf(c12.getInt(b22)));
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                    }
                }
                c12.close();
                d0Var.release();
                return heartSignalMeasurement;
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

    @Override // com.withings.ecg.model.HeartSignalDao
    public List<HeartSignalMeasurement> getNotSyncedSignalsForUser(long j5) {
        d0 d0Var;
        Long valueOf;
        int i11;
        boolean z5;
        Long valueOf2;
        Integer valueOf3;
        boolean z11;
        Integer valueOf4;
        Integer valueOf5;
        int i12;
        HeartSignalDao_RoomDb_Impl heartSignalDao_RoomDb_Impl = this;
        d0 c11 = d0.c(1, "SELECT * from EcgMeasurement where userId = ? AND Not synced");
        c11.v(1, j5);
        heartSignalDao_RoomDb_Impl.__db.b();
        Cursor c12 = x8.b.c(heartSignalDao_RoomDb_Impl.__db, c11, false);
        try {
            int b10 = a.b(c12, "id");
            int b11 = a.b(c12, "userID");
            int b12 = a.b(c12, "deviceModel");
            int b13 = a.b(c12, "timestamp");
            int b14 = a.b(c12, "synced");
            int b15 = a.b(c12, "modified");
            int b16 = a.b(c12, "deviceId");
            int b17 = a.b(c12, "trackerWearPos");
            int b18 = a.b(c12, "deleted");
            int b19 = a.b(c12, "measures");
            int b21 = a.b(c12, "firmwareVersion");
            int b22 = a.b(c12, "brand");
            int b23 = a.b(c12, "signalId");
            d0Var = c11;
            try {
                int b24 = a.b(c12, "signalPath");
                int b25 = a.b(c12, "timeWindow");
                int b26 = a.b(c12, "duration");
                int b27 = a.b(c12, "totalSize");
                int b28 = a.b(c12, GetHealthAttributeResponse.FIELD_OFFSET_NAME);
                int b29 = a.b(c12, "gain");
                int b31 = a.b(c12, "qfix");
                int b32 = a.b(c12, "type");
                int b33 = a.b(c12, "samplingFreq");
                int b34 = a.b(c12, "channel");
                int b35 = a.b(c12, WsVasistasSerie.KEY_FORMAT);
                int b36 = a.b(c12, "size");
                int b37 = a.b(c12, "resolution");
                int b38 = a.b(c12, "filterBank");
                int i13 = b23;
                ArrayList arrayList = new ArrayList(c12.getCount());
                while (c12.moveToNext()) {
                    long j11 = c12.getLong(b10);
                    long j12 = c12.getLong(b11);
                    int i14 = c12.getInt(b12);
                    Long l5 = null;
                    if (c12.isNull(b13)) {
                        i11 = b10;
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(c12.getLong(b13));
                        i11 = b10;
                    }
                    heartSignalDao_RoomDb_Impl.__commonRoomConverter.getClass();
                    DateTime a11 = b.a(valueOf);
                    if (a11 != null) {
                        if (c12.getInt(b14) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        long j13 = c12.getLong(b15);
                        if (c12.isNull(b16)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Long.valueOf(c12.getLong(b16));
                        }
                        if (c12.isNull(b17)) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Integer.valueOf(c12.getInt(b17));
                        }
                        if (c12.getInt(b18) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        String string = c12.getString(b19);
                        heartSignalDao_RoomDb_Impl.__roomConverters.getClass();
                        List c13 = c.c(string);
                        if (c12.isNull(b21)) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Integer.valueOf(c12.getInt(b21));
                        }
                        if (c12.isNull(b22)) {
                            i12 = i13;
                            valueOf5 = null;
                        } else {
                            valueOf5 = Integer.valueOf(c12.getInt(b22));
                            i12 = i13;
                        }
                        if (!c12.isNull(i12)) {
                            l5 = Long.valueOf(c12.getLong(i12));
                        }
                        i13 = i12;
                        Long l6 = l5;
                        int i15 = b24;
                        String string2 = c12.getString(i15);
                        b24 = i15;
                        int i16 = b25;
                        int i17 = c12.getInt(i16);
                        b25 = i16;
                        int i18 = b26;
                        long j14 = c12.getLong(i18);
                        b26 = i18;
                        int i19 = b27;
                        long j15 = c12.getLong(i19);
                        b27 = i19;
                        int i21 = b28;
                        int i22 = c12.getInt(i21);
                        b28 = i21;
                        int i23 = b29;
                        int i24 = c12.getInt(i23);
                        b29 = i23;
                        int i25 = b31;
                        long j16 = c12.getLong(i25);
                        b31 = i25;
                        int i26 = b32;
                        int i27 = c12.getInt(i26);
                        b32 = i26;
                        int i28 = b33;
                        int i29 = c12.getInt(i28);
                        b33 = i28;
                        int i31 = b34;
                        short s11 = c12.getShort(i31);
                        b34 = i31;
                        int i32 = b35;
                        short s12 = c12.getShort(i32);
                        b35 = i32;
                        int i33 = b36;
                        short s13 = c12.getShort(i33);
                        b36 = i33;
                        int i34 = b37;
                        short s14 = c12.getShort(i34);
                        b37 = i34;
                        int i35 = b38;
                        b38 = i35;
                        arrayList.add(new HeartSignalMeasurement(j11, j12, i14, a11, new Signal(l6, new SignalMeta(i17, j14, j15, i22, i24, j16, i27, i29, s11, s12, s13, s14, c12.getLong(i35)), string2), z5, j13, valueOf2, valueOf3, z11, c13, valueOf4, valueOf5));
                        heartSignalDao_RoomDb_Impl = this;
                        b10 = i11;
                        b22 = b22;
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

    @Override // com.withings.ecg.model.HeartSignalDao
    public List<HeartSignalMeasurement> getSignalsForUserIdBetween(long j5, long j11, long j12) {
        d0 d0Var;
        Long valueOf;
        int i11;
        boolean z5;
        Long valueOf2;
        Integer valueOf3;
        boolean z11;
        Integer valueOf4;
        Integer valueOf5;
        int i12;
        HeartSignalDao_RoomDb_Impl heartSignalDao_RoomDb_Impl = this;
        d0 c11 = d0.c(3, "SELECT * from EcgMeasurement where userId= ? AND timestamp BETWEEN ? AND ? AND NOT deleted ORDER BY timestamp ASC");
        c11.v(1, j5);
        c11.v(2, j11);
        c11.v(3, j12);
        heartSignalDao_RoomDb_Impl.__db.b();
        Cursor c12 = x8.b.c(heartSignalDao_RoomDb_Impl.__db, c11, false);
        try {
            int b10 = a.b(c12, "id");
            int b11 = a.b(c12, "userID");
            int b12 = a.b(c12, "deviceModel");
            int b13 = a.b(c12, "timestamp");
            int b14 = a.b(c12, "synced");
            int b15 = a.b(c12, "modified");
            int b16 = a.b(c12, "deviceId");
            int b17 = a.b(c12, "trackerWearPos");
            int b18 = a.b(c12, "deleted");
            int b19 = a.b(c12, "measures");
            int b21 = a.b(c12, "firmwareVersion");
            int b22 = a.b(c12, "brand");
            int b23 = a.b(c12, "signalId");
            d0Var = c11;
            try {
                int b24 = a.b(c12, "signalPath");
                int b25 = a.b(c12, "timeWindow");
                int b26 = a.b(c12, "duration");
                int b27 = a.b(c12, "totalSize");
                int b28 = a.b(c12, GetHealthAttributeResponse.FIELD_OFFSET_NAME);
                int b29 = a.b(c12, "gain");
                int b31 = a.b(c12, "qfix");
                int b32 = a.b(c12, "type");
                int b33 = a.b(c12, "samplingFreq");
                int b34 = a.b(c12, "channel");
                int b35 = a.b(c12, WsVasistasSerie.KEY_FORMAT);
                int b36 = a.b(c12, "size");
                int b37 = a.b(c12, "resolution");
                int b38 = a.b(c12, "filterBank");
                int i13 = b23;
                ArrayList arrayList = new ArrayList(c12.getCount());
                while (c12.moveToNext()) {
                    long j13 = c12.getLong(b10);
                    long j14 = c12.getLong(b11);
                    int i14 = c12.getInt(b12);
                    Long l5 = null;
                    if (c12.isNull(b13)) {
                        i11 = b10;
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(c12.getLong(b13));
                        i11 = b10;
                    }
                    heartSignalDao_RoomDb_Impl.__commonRoomConverter.getClass();
                    DateTime a11 = b.a(valueOf);
                    if (a11 != null) {
                        if (c12.getInt(b14) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        long j15 = c12.getLong(b15);
                        if (c12.isNull(b16)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Long.valueOf(c12.getLong(b16));
                        }
                        if (c12.isNull(b17)) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Integer.valueOf(c12.getInt(b17));
                        }
                        if (c12.getInt(b18) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        String string = c12.getString(b19);
                        heartSignalDao_RoomDb_Impl.__roomConverters.getClass();
                        List c13 = c.c(string);
                        if (c12.isNull(b21)) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Integer.valueOf(c12.getInt(b21));
                        }
                        if (c12.isNull(b22)) {
                            i12 = i13;
                            valueOf5 = null;
                        } else {
                            valueOf5 = Integer.valueOf(c12.getInt(b22));
                            i12 = i13;
                        }
                        if (!c12.isNull(i12)) {
                            l5 = Long.valueOf(c12.getLong(i12));
                        }
                        Long l6 = l5;
                        int i15 = b22;
                        int i16 = b24;
                        String string2 = c12.getString(i16);
                        int i17 = b25;
                        int i18 = c12.getInt(i17);
                        b25 = i17;
                        int i19 = b26;
                        long j16 = c12.getLong(i19);
                        b26 = i19;
                        int i21 = b27;
                        long j17 = c12.getLong(i21);
                        b27 = i21;
                        int i22 = b28;
                        int i23 = c12.getInt(i22);
                        b28 = i22;
                        int i24 = b29;
                        int i25 = c12.getInt(i24);
                        b29 = i24;
                        int i26 = b31;
                        long j18 = c12.getLong(i26);
                        b31 = i26;
                        int i27 = b32;
                        int i28 = c12.getInt(i27);
                        b32 = i27;
                        int i29 = b33;
                        int i31 = c12.getInt(i29);
                        b33 = i29;
                        int i32 = b34;
                        short s11 = c12.getShort(i32);
                        b34 = i32;
                        int i33 = b35;
                        short s12 = c12.getShort(i33);
                        b35 = i33;
                        int i34 = b36;
                        short s13 = c12.getShort(i34);
                        b36 = i34;
                        int i35 = b37;
                        short s14 = c12.getShort(i35);
                        b37 = i35;
                        int i36 = b38;
                        b38 = i36;
                        arrayList.add(new HeartSignalMeasurement(j13, j14, i14, a11, new Signal(l6, new SignalMeta(i18, j16, j17, i23, i25, j18, i28, i31, s11, s12, s13, s14, c12.getLong(i36)), string2), z5, j15, valueOf2, valueOf3, z11, c13, valueOf4, valueOf5));
                        heartSignalDao_RoomDb_Impl = this;
                        b22 = i15;
                        b24 = i16;
                        b10 = i11;
                        i13 = i12;
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

    @Override // com.withings.ecg.model.HeartSignalDao
    public List<HeartSignalMeasurement> getSignalsWithType(long j5, int... iArr) {
        d0 d0Var;
        Long valueOf;
        int i11;
        boolean z5;
        Long valueOf2;
        Integer valueOf3;
        boolean z11;
        Integer valueOf4;
        Integer valueOf5;
        int i12;
        HeartSignalDao_RoomDb_Impl heartSignalDao_RoomDb_Impl = this;
        StringBuilder c11 = k4.c("SELECT * from EcgMeasurement where userId= ? AND NOT deleted AND type IN (");
        int length = iArr.length;
        d0 c12 = d0.c(length + 1, j5.c(length, c11, ") Order by timestamp ASC"));
        c12.v(1, j5);
        int i13 = 2;
        for (int i14 : iArr) {
            c12.v(i13, i14);
            i13++;
        }
        heartSignalDao_RoomDb_Impl.__db.b();
        Cursor c13 = x8.b.c(heartSignalDao_RoomDb_Impl.__db, c12, false);
        try {
            int b10 = a.b(c13, "id");
            int b11 = a.b(c13, "userID");
            int b12 = a.b(c13, "deviceModel");
            int b13 = a.b(c13, "timestamp");
            int b14 = a.b(c13, "synced");
            int b15 = a.b(c13, "modified");
            int b16 = a.b(c13, "deviceId");
            int b17 = a.b(c13, "trackerWearPos");
            int b18 = a.b(c13, "deleted");
            int b19 = a.b(c13, "measures");
            int b21 = a.b(c13, "firmwareVersion");
            int b22 = a.b(c13, "brand");
            int b23 = a.b(c13, "signalId");
            d0Var = c12;
            try {
                int b24 = a.b(c13, "signalPath");
                int b25 = a.b(c13, "timeWindow");
                int b26 = a.b(c13, "duration");
                int b27 = a.b(c13, "totalSize");
                int b28 = a.b(c13, GetHealthAttributeResponse.FIELD_OFFSET_NAME);
                int b29 = a.b(c13, "gain");
                int b31 = a.b(c13, "qfix");
                int b32 = a.b(c13, "type");
                int b33 = a.b(c13, "samplingFreq");
                int b34 = a.b(c13, "channel");
                int b35 = a.b(c13, WsVasistasSerie.KEY_FORMAT);
                int b36 = a.b(c13, "size");
                int b37 = a.b(c13, "resolution");
                int b38 = a.b(c13, "filterBank");
                int i15 = b23;
                ArrayList arrayList = new ArrayList(c13.getCount());
                while (c13.moveToNext()) {
                    long j11 = c13.getLong(b10);
                    long j12 = c13.getLong(b11);
                    int i16 = c13.getInt(b12);
                    Long l5 = null;
                    if (c13.isNull(b13)) {
                        i11 = b10;
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(c13.getLong(b13));
                        i11 = b10;
                    }
                    heartSignalDao_RoomDb_Impl.__commonRoomConverter.getClass();
                    DateTime a11 = b.a(valueOf);
                    if (a11 != null) {
                        if (c13.getInt(b14) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        long j13 = c13.getLong(b15);
                        if (c13.isNull(b16)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Long.valueOf(c13.getLong(b16));
                        }
                        if (c13.isNull(b17)) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Integer.valueOf(c13.getInt(b17));
                        }
                        if (c13.getInt(b18) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        String string = c13.getString(b19);
                        heartSignalDao_RoomDb_Impl.__roomConverters.getClass();
                        List c14 = c.c(string);
                        if (c13.isNull(b21)) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Integer.valueOf(c13.getInt(b21));
                        }
                        if (c13.isNull(b22)) {
                            i12 = i15;
                            valueOf5 = null;
                        } else {
                            valueOf5 = Integer.valueOf(c13.getInt(b22));
                            i12 = i15;
                        }
                        if (!c13.isNull(i12)) {
                            l5 = Long.valueOf(c13.getLong(i12));
                        }
                        i15 = i12;
                        Long l6 = l5;
                        int i17 = b24;
                        String string2 = c13.getString(i17);
                        b24 = i17;
                        int i18 = b25;
                        int i19 = c13.getInt(i18);
                        b25 = i18;
                        int i21 = b26;
                        long j14 = c13.getLong(i21);
                        b26 = i21;
                        int i22 = b27;
                        long j15 = c13.getLong(i22);
                        b27 = i22;
                        int i23 = b28;
                        int i24 = c13.getInt(i23);
                        b28 = i23;
                        int i25 = b29;
                        int i26 = c13.getInt(i25);
                        b29 = i25;
                        int i27 = b31;
                        long j16 = c13.getLong(i27);
                        b31 = i27;
                        int i28 = b32;
                        int i29 = c13.getInt(i28);
                        b32 = i28;
                        int i31 = b33;
                        int i32 = c13.getInt(i31);
                        b33 = i31;
                        int i33 = b34;
                        short s11 = c13.getShort(i33);
                        b34 = i33;
                        int i34 = b35;
                        short s12 = c13.getShort(i34);
                        b35 = i34;
                        int i35 = b36;
                        short s13 = c13.getShort(i35);
                        b36 = i35;
                        int i36 = b37;
                        short s14 = c13.getShort(i36);
                        b37 = i36;
                        int i37 = b38;
                        b38 = i37;
                        arrayList.add(new HeartSignalMeasurement(j11, j12, i16, a11, new Signal(l6, new SignalMeta(i19, j14, j15, i24, i26, j16, i29, i32, s11, s12, s13, s14, c13.getLong(i37)), string2), z5, j13, valueOf2, valueOf3, z11, c14, valueOf4, valueOf5));
                        heartSignalDao_RoomDb_Impl = this;
                        b10 = i11;
                        b22 = b22;
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                    }
                }
                c13.close();
                d0Var.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                c13.close();
                d0Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            d0Var = c12;
        }
    }

    @Override // com.withings.ecg.model.HeartSignalDao
    public List<HeartSignalMeasurement> getSignalsWithTypeBetween(long j5, long j11, long j12, int... iArr) {
        d0 d0Var;
        Long valueOf;
        int i11;
        boolean z5;
        Long valueOf2;
        Integer valueOf3;
        boolean z11;
        Integer valueOf4;
        Integer valueOf5;
        int i12;
        HeartSignalDao_RoomDb_Impl heartSignalDao_RoomDb_Impl = this;
        StringBuilder c11 = k4.c("SELECT * from EcgMeasurement where userId = ? AND type IN (");
        int length = iArr.length;
        u.i(length, c11);
        c11.append(") AND timestamp BETWEEN ");
        c11.append("?");
        c11.append(" AND ");
        int i13 = length + 3;
        d0 c12 = d0.c(i13, y1.e(c11, "?", " AND NOT deleted ORDER BY timestamp ASC"));
        c12.v(1, j5);
        int i14 = 2;
        for (int i15 : iArr) {
            c12.v(i14, i15);
            i14++;
        }
        c12.v(length + 2, j11);
        c12.v(i13, j12);
        heartSignalDao_RoomDb_Impl.__db.b();
        Cursor c13 = x8.b.c(heartSignalDao_RoomDb_Impl.__db, c12, false);
        try {
            int b10 = a.b(c13, "id");
            int b11 = a.b(c13, "userID");
            int b12 = a.b(c13, "deviceModel");
            int b13 = a.b(c13, "timestamp");
            int b14 = a.b(c13, "synced");
            int b15 = a.b(c13, "modified");
            int b16 = a.b(c13, "deviceId");
            int b17 = a.b(c13, "trackerWearPos");
            int b18 = a.b(c13, "deleted");
            int b19 = a.b(c13, "measures");
            int b21 = a.b(c13, "firmwareVersion");
            int b22 = a.b(c13, "brand");
            int b23 = a.b(c13, "signalId");
            d0Var = c12;
            try {
                int b24 = a.b(c13, "signalPath");
                int b25 = a.b(c13, "timeWindow");
                int b26 = a.b(c13, "duration");
                int b27 = a.b(c13, "totalSize");
                int b28 = a.b(c13, GetHealthAttributeResponse.FIELD_OFFSET_NAME);
                int b29 = a.b(c13, "gain");
                int b31 = a.b(c13, "qfix");
                int b32 = a.b(c13, "type");
                int b33 = a.b(c13, "samplingFreq");
                int b34 = a.b(c13, "channel");
                int b35 = a.b(c13, WsVasistasSerie.KEY_FORMAT);
                int b36 = a.b(c13, "size");
                int b37 = a.b(c13, "resolution");
                int b38 = a.b(c13, "filterBank");
                int i16 = b23;
                ArrayList arrayList = new ArrayList(c13.getCount());
                while (c13.moveToNext()) {
                    long j13 = c13.getLong(b10);
                    long j14 = c13.getLong(b11);
                    int i17 = c13.getInt(b12);
                    Long l5 = null;
                    if (c13.isNull(b13)) {
                        i11 = b10;
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(c13.getLong(b13));
                        i11 = b10;
                    }
                    heartSignalDao_RoomDb_Impl.__commonRoomConverter.getClass();
                    DateTime a11 = b.a(valueOf);
                    if (a11 != null) {
                        if (c13.getInt(b14) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        long j15 = c13.getLong(b15);
                        if (c13.isNull(b16)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Long.valueOf(c13.getLong(b16));
                        }
                        if (c13.isNull(b17)) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Integer.valueOf(c13.getInt(b17));
                        }
                        if (c13.getInt(b18) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        String string = c13.getString(b19);
                        heartSignalDao_RoomDb_Impl.__roomConverters.getClass();
                        List c14 = c.c(string);
                        if (c13.isNull(b21)) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Integer.valueOf(c13.getInt(b21));
                        }
                        if (c13.isNull(b22)) {
                            i12 = i16;
                            valueOf5 = null;
                        } else {
                            valueOf5 = Integer.valueOf(c13.getInt(b22));
                            i12 = i16;
                        }
                        if (!c13.isNull(i12)) {
                            l5 = Long.valueOf(c13.getLong(i12));
                        }
                        i16 = i12;
                        Long l6 = l5;
                        int i18 = b24;
                        String string2 = c13.getString(i18);
                        b24 = i18;
                        int i19 = b25;
                        int i21 = c13.getInt(i19);
                        b25 = i19;
                        int i22 = b26;
                        long j16 = c13.getLong(i22);
                        b26 = i22;
                        int i23 = b27;
                        long j17 = c13.getLong(i23);
                        b27 = i23;
                        int i24 = b28;
                        int i25 = c13.getInt(i24);
                        b28 = i24;
                        int i26 = b29;
                        int i27 = c13.getInt(i26);
                        b29 = i26;
                        int i28 = b31;
                        long j18 = c13.getLong(i28);
                        b31 = i28;
                        int i29 = b32;
                        int i31 = c13.getInt(i29);
                        b32 = i29;
                        int i32 = b33;
                        int i33 = c13.getInt(i32);
                        b33 = i32;
                        int i34 = b34;
                        short s11 = c13.getShort(i34);
                        b34 = i34;
                        int i35 = b35;
                        short s12 = c13.getShort(i35);
                        b35 = i35;
                        int i36 = b36;
                        short s13 = c13.getShort(i36);
                        b36 = i36;
                        int i37 = b37;
                        short s14 = c13.getShort(i37);
                        b37 = i37;
                        int i38 = b38;
                        b38 = i38;
                        arrayList.add(new HeartSignalMeasurement(j13, j14, i17, a11, new Signal(l6, new SignalMeta(i21, j16, j17, i25, i27, j18, i31, i33, s11, s12, s13, s14, c13.getLong(i38)), string2), z5, j15, valueOf2, valueOf3, z11, c14, valueOf4, valueOf5));
                        heartSignalDao_RoomDb_Impl = this;
                        b10 = i11;
                        b11 = b11;
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                    }
                }
                c13.close();
                d0Var.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                c13.close();
                d0Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            d0Var = c12;
        }
    }

    @Override // com.withings.ecg.model.HeartSignalDao
    public Flow<List<HeartSignalMeasurement>> getSignalsWithTypeFlow(long j5, int... iArr) {
        StringBuilder c11 = k4.c("SELECT * from EcgMeasurement where userId= ? AND NOT deleted AND type IN (");
        int length = iArr.length;
        final d0 c12 = d0.c(length + 1, j5.c(length, c11, ") Order by timestamp ASC"));
        c12.v(1, j5);
        int i11 = 2;
        for (int i12 : iArr) {
            c12.v(i11, i12);
            i11++;
        }
        return g.a(this.__db, false, new String[]{"EcgMeasurement"}, new Callable<List<HeartSignalMeasurement>>() { // from class: com.withings.ecg.model.HeartSignalDao_RoomDb_Impl.5
            protected void finalize() {
                c12.release();
            }

            @Override // java.util.concurrent.Callable
            public List<HeartSignalMeasurement> call() throws Exception {
                Long valueOf;
                int i13;
                Integer valueOf2;
                int i14;
                AnonymousClass5 anonymousClass5 = this;
                Cursor c13 = x8.b.c(HeartSignalDao_RoomDb_Impl.this.__db, c12, false);
                try {
                    int b10 = a.b(c13, "id");
                    int b11 = a.b(c13, "userID");
                    int b12 = a.b(c13, "deviceModel");
                    int b13 = a.b(c13, "timestamp");
                    int b14 = a.b(c13, "synced");
                    int b15 = a.b(c13, "modified");
                    int b16 = a.b(c13, "deviceId");
                    int b17 = a.b(c13, "trackerWearPos");
                    int b18 = a.b(c13, "deleted");
                    int b19 = a.b(c13, "measures");
                    int b21 = a.b(c13, "firmwareVersion");
                    int b22 = a.b(c13, "brand");
                    int b23 = a.b(c13, "signalId");
                    int b24 = a.b(c13, "signalPath");
                    int b25 = a.b(c13, "timeWindow");
                    int b26 = a.b(c13, "duration");
                    int b27 = a.b(c13, "totalSize");
                    int b28 = a.b(c13, GetHealthAttributeResponse.FIELD_OFFSET_NAME);
                    int b29 = a.b(c13, "gain");
                    int b31 = a.b(c13, "qfix");
                    int b32 = a.b(c13, "type");
                    int b33 = a.b(c13, "samplingFreq");
                    int b34 = a.b(c13, "channel");
                    int b35 = a.b(c13, WsVasistasSerie.KEY_FORMAT);
                    int b36 = a.b(c13, "size");
                    int b37 = a.b(c13, "resolution");
                    int b38 = a.b(c13, "filterBank");
                    int i15 = b23;
                    ArrayList arrayList = new ArrayList(c13.getCount());
                    while (c13.moveToNext()) {
                        long j11 = c13.getLong(b10);
                        long j12 = c13.getLong(b11);
                        int i16 = c13.getInt(b12);
                        if (c13.isNull(b13)) {
                            i13 = b10;
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(c13.getLong(b13));
                            i13 = b10;
                        }
                        HeartSignalDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a11 = b.a(valueOf);
                        if (a11 != null) {
                            boolean z5 = c13.getInt(b14) != 0;
                            long j13 = c13.getLong(b15);
                            Long valueOf3 = c13.isNull(b16) ? null : Long.valueOf(c13.getLong(b16));
                            Integer valueOf4 = c13.isNull(b17) ? null : Integer.valueOf(c13.getInt(b17));
                            boolean z11 = c13.getInt(b18) != 0;
                            String string = c13.getString(b19);
                            HeartSignalDao_RoomDb_Impl.this.__roomConverters.getClass();
                            List c14 = c.c(string);
                            Integer valueOf5 = c13.isNull(b21) ? null : Integer.valueOf(c13.getInt(b21));
                            if (c13.isNull(b22)) {
                                i14 = i15;
                                valueOf2 = null;
                            } else {
                                valueOf2 = Integer.valueOf(c13.getInt(b22));
                                i14 = i15;
                            }
                            Long valueOf6 = c13.isNull(i14) ? null : Long.valueOf(c13.getLong(i14));
                            i15 = i14;
                            int i17 = b24;
                            Long l5 = valueOf6;
                            String string2 = c13.getString(i17);
                            b24 = i17;
                            int i18 = b25;
                            int i19 = c13.getInt(i18);
                            b25 = i18;
                            int i21 = b26;
                            long j14 = c13.getLong(i21);
                            b26 = i21;
                            int i22 = b27;
                            long j15 = c13.getLong(i22);
                            b27 = i22;
                            int i23 = b28;
                            int i24 = c13.getInt(i23);
                            b28 = i23;
                            int i25 = b29;
                            int i26 = c13.getInt(i25);
                            b29 = i25;
                            int i27 = b31;
                            long j16 = c13.getLong(i27);
                            b31 = i27;
                            int i28 = b32;
                            int i29 = c13.getInt(i28);
                            b32 = i28;
                            int i31 = b33;
                            int i32 = c13.getInt(i31);
                            b33 = i31;
                            int i33 = b34;
                            short s11 = c13.getShort(i33);
                            b34 = i33;
                            int i34 = b35;
                            short s12 = c13.getShort(i34);
                            b35 = i34;
                            int i35 = b36;
                            short s13 = c13.getShort(i35);
                            b36 = i35;
                            int i36 = b37;
                            short s14 = c13.getShort(i36);
                            b37 = i36;
                            int i37 = b38;
                            b38 = i37;
                            arrayList.add(new HeartSignalMeasurement(j11, j12, i16, a11, new Signal(l5, new SignalMeta(i19, j14, j15, i24, i26, j16, i29, i32, s11, s12, s13, s14, c13.getLong(i37)), string2), z5, j13, valueOf3, valueOf4, z11, c14, valueOf5, valueOf2));
                            anonymousClass5 = this;
                            b10 = i13;
                            b11 = b11;
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
                    }
                    c13.close();
                    return arrayList;
                } catch (Throwable th2) {
                    c13.close();
                    throw th2;
                }
            }
        });
    }

    @Override // com.withings.ecg.model.HeartSignalDao
    public LiveData<List<HeartSignalMeasurement>> getSignalsWithTypeLiveData(long j5, int... iArr) {
        StringBuilder c11 = k4.c("SELECT * from EcgMeasurement where userId = ? AND type IN (");
        int length = iArr.length;
        final d0 c12 = d0.c(length + 1, j5.c(length, c11, ") AND NOT deleted"));
        c12.v(1, j5);
        int i11 = 2;
        for (int i12 : iArr) {
            c12.v(i11, i12);
            i11++;
        }
        return this.__db.l().c(new String[]{"EcgMeasurement"}, new Callable<List<HeartSignalMeasurement>>() { // from class: com.withings.ecg.model.HeartSignalDao_RoomDb_Impl.7
            protected void finalize() {
                c12.release();
            }

            @Override // java.util.concurrent.Callable
            public List<HeartSignalMeasurement> call() throws Exception {
                Long valueOf;
                int i13;
                Integer valueOf2;
                int i14;
                AnonymousClass7 anonymousClass7 = this;
                Cursor c13 = x8.b.c(HeartSignalDao_RoomDb_Impl.this.__db, c12, false);
                try {
                    int b10 = a.b(c13, "id");
                    int b11 = a.b(c13, "userID");
                    int b12 = a.b(c13, "deviceModel");
                    int b13 = a.b(c13, "timestamp");
                    int b14 = a.b(c13, "synced");
                    int b15 = a.b(c13, "modified");
                    int b16 = a.b(c13, "deviceId");
                    int b17 = a.b(c13, "trackerWearPos");
                    int b18 = a.b(c13, "deleted");
                    int b19 = a.b(c13, "measures");
                    int b21 = a.b(c13, "firmwareVersion");
                    int b22 = a.b(c13, "brand");
                    int b23 = a.b(c13, "signalId");
                    int b24 = a.b(c13, "signalPath");
                    int b25 = a.b(c13, "timeWindow");
                    int b26 = a.b(c13, "duration");
                    int b27 = a.b(c13, "totalSize");
                    int b28 = a.b(c13, GetHealthAttributeResponse.FIELD_OFFSET_NAME);
                    int b29 = a.b(c13, "gain");
                    int b31 = a.b(c13, "qfix");
                    int b32 = a.b(c13, "type");
                    int b33 = a.b(c13, "samplingFreq");
                    int b34 = a.b(c13, "channel");
                    int b35 = a.b(c13, WsVasistasSerie.KEY_FORMAT);
                    int b36 = a.b(c13, "size");
                    int b37 = a.b(c13, "resolution");
                    int b38 = a.b(c13, "filterBank");
                    int i15 = b23;
                    ArrayList arrayList = new ArrayList(c13.getCount());
                    while (c13.moveToNext()) {
                        long j11 = c13.getLong(b10);
                        long j12 = c13.getLong(b11);
                        int i16 = c13.getInt(b12);
                        if (c13.isNull(b13)) {
                            i13 = b10;
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(c13.getLong(b13));
                            i13 = b10;
                        }
                        HeartSignalDao_RoomDb_Impl.this.__commonRoomConverter.getClass();
                        DateTime a11 = b.a(valueOf);
                        if (a11 != null) {
                            boolean z5 = c13.getInt(b14) != 0;
                            long j13 = c13.getLong(b15);
                            Long valueOf3 = c13.isNull(b16) ? null : Long.valueOf(c13.getLong(b16));
                            Integer valueOf4 = c13.isNull(b17) ? null : Integer.valueOf(c13.getInt(b17));
                            boolean z11 = c13.getInt(b18) != 0;
                            String string = c13.getString(b19);
                            HeartSignalDao_RoomDb_Impl.this.__roomConverters.getClass();
                            List c14 = c.c(string);
                            Integer valueOf5 = c13.isNull(b21) ? null : Integer.valueOf(c13.getInt(b21));
                            if (c13.isNull(b22)) {
                                i14 = i15;
                                valueOf2 = null;
                            } else {
                                valueOf2 = Integer.valueOf(c13.getInt(b22));
                                i14 = i15;
                            }
                            Long valueOf6 = c13.isNull(i14) ? null : Long.valueOf(c13.getLong(i14));
                            i15 = i14;
                            int i17 = b24;
                            Long l5 = valueOf6;
                            String string2 = c13.getString(i17);
                            b24 = i17;
                            int i18 = b25;
                            int i19 = c13.getInt(i18);
                            b25 = i18;
                            int i21 = b26;
                            long j14 = c13.getLong(i21);
                            b26 = i21;
                            int i22 = b27;
                            long j15 = c13.getLong(i22);
                            b27 = i22;
                            int i23 = b28;
                            int i24 = c13.getInt(i23);
                            b28 = i23;
                            int i25 = b29;
                            int i26 = c13.getInt(i25);
                            b29 = i25;
                            int i27 = b31;
                            long j16 = c13.getLong(i27);
                            b31 = i27;
                            int i28 = b32;
                            int i29 = c13.getInt(i28);
                            b32 = i28;
                            int i31 = b33;
                            int i32 = c13.getInt(i31);
                            b33 = i31;
                            int i33 = b34;
                            short s11 = c13.getShort(i33);
                            b34 = i33;
                            int i34 = b35;
                            short s12 = c13.getShort(i34);
                            b35 = i34;
                            int i35 = b36;
                            short s13 = c13.getShort(i35);
                            b36 = i35;
                            int i36 = b37;
                            short s14 = c13.getShort(i36);
                            b37 = i36;
                            int i37 = b38;
                            b38 = i37;
                            arrayList.add(new HeartSignalMeasurement(j11, j12, i16, a11, new Signal(l5, new SignalMeta(i19, j14, j15, i24, i26, j16, i29, i32, s11, s12, s13, s14, c13.getLong(i37)), string2), z5, j13, valueOf3, valueOf4, z11, c14, valueOf5, valueOf2));
                            anonymousClass7 = this;
                            b10 = i13;
                            b11 = b11;
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
                    }
                    c13.close();
                    return arrayList;
                } catch (Throwable th2) {
                    c13.close();
                    throw th2;
                }
            }
        });
    }

    @Override // com.withings.ecg.model.HeartSignalDao
    public int hasInReviewEcg(long j5, int... iArr) {
        StringBuilder c11 = k4.c("SELECT COUNT(*) from EcgMeasurement where userId= ? AND type IN (");
        int length = iArr.length;
        d0 c12 = d0.c(length + 1, j5.c(length, c11, ") AND NOT deleted AND measures LIKE '%\"attrib\":11%' Order by timestamp DESC LIMIT 1"));
        c12.v(1, j5);
        int i11 = 2;
        for (int i12 : iArr) {
            c12.v(i11, i12);
            i11++;
        }
        this.__db.b();
        Cursor c13 = x8.b.c(this.__db, c12, false);
        try {
            return c13.moveToFirst() ? c13.getInt(0) : 0;
        } finally {
            c13.close();
            c12.release();
        }
    }

    @Override // com.withings.ecg.model.HeartSignalDao
    public long insert(HeartSignalMeasurement heartSignalMeasurement) {
        this.__db.b();
        this.__db.c();
        try {
            long insertAndReturnId = this.__insertionAdapterOfHeartSignalMeasurement.insertAndReturnId(heartSignalMeasurement);
            this.__db.z();
            return insertAndReturnId;
        } finally {
            this.__db.h();
        }
    }

    @Override // com.withings.ecg.model.HeartSignalDao
    public void update(HeartSignalMeasurement heartSignalMeasurement) {
        this.__db.b();
        this.__db.c();
        try {
            this.__updateAdapterOfHeartSignalMeasurement.handle(heartSignalMeasurement);
            this.__db.z();
        } finally {
            this.__db.h();
        }
    }

    @Override // com.withings.ecg.model.HeartSignalDao
    public Flow<Integer> getCountAsFlow(long j5) {
        final d0 c11 = d0.c(1, "SELECT COUNT(*) from EcgMeasurement where userID = ?");
        c11.v(1, j5);
        return g.a(this.__db, false, new String[]{"EcgMeasurement"}, new Callable<Integer>() { // from class: com.withings.ecg.model.HeartSignalDao_RoomDb_Impl.11
            protected void finalize() {
                c11.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                int i11;
                Cursor c12 = x8.b.c(HeartSignalDao_RoomDb_Impl.this.__db, c11, false);
                try {
                    if (c12.moveToFirst()) {
                        i11 = Integer.valueOf(c12.getInt(0));
                    } else {
                        i11 = 0;
                    }
                    c12.close();
                    return i11;
                } catch (Throwable th2) {
                    c12.close();
                    throw th2;
                }
            }
        });
    }

    @Override // com.withings.ecg.model.HeartSignalDao
    public int hasInReviewEcg(long j5, long j11, int... iArr) {
        StringBuilder c11 = k4.c("SELECT COUNT(*) from EcgMeasurement where userId= ? AND deviceId= ? AND type IN (");
        int length = iArr.length;
        d0 c12 = d0.c(length + 2, j5.c(length, c11, ") AND NOT deleted AND measures LIKE '%\"attrib\":11%' Order by timestamp DESC LIMIT 1"));
        c12.v(1, j5);
        c12.v(2, j11);
        int i11 = 3;
        for (int i12 : iArr) {
            c12.v(i11, i12);
            i11++;
        }
        this.__db.b();
        Cursor c13 = x8.b.c(this.__db, c12, false);
        try {
            return c13.moveToFirst() ? c13.getInt(0) : 0;
        } finally {
            c13.close();
            c12.release();
        }
    }

    @Override // com.withings.ecg.model.HeartSignalDao
    public List<HeartSignalDao.SignalIdByUserId> getNotDeletedHeartSignal() {
        d0 c11 = d0.c(0, "SELECT id, userID from EcgMeasurement where deleted AND synced Order by modified DESC");
        this.__db.b();
        Cursor c12 = x8.b.c(this.__db, c11, false);
        try {
            ArrayList arrayList = new ArrayList(c12.getCount());
            while (c12.moveToNext()) {
                arrayList.add(new HeartSignalDao.SignalIdByUserId(c12.getLong(0), c12.getLong(1)));
            }
            return arrayList;
        } finally {
            c12.close();
            c11.release();
        }
    }
}
