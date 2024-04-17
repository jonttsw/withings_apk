package com.withings.screen.repository.data.db;

import androidx.room.RoomDatabase;
import androidx.room.d0;
import androidx.room.g;
import androidx.room.h0;
import androidx.room.k;
import com.huawei.hms.health.a;
import com.withings.screen.repository.data.model.DeviceScreenConverters;
import com.withings.screen.repository.data.model.DeviceScreenEntity;
import com.withings.screen.repository.data.model.DeviceScreenEntityImage;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import nm0.y;
import pm.b;
import qm0.d;
import z8.f;
/* loaded from: classes4.dex */
public final class DeviceScreenDao_RoomDb_Impl implements DeviceScreenDao {
    private final RoomDatabase __db;
    private final k<DeviceScreenEntity> __insertionAdapterOfDeviceScreenEntity;
    private final h0 __preparedStmtOfClear;
    private final h0 __preparedStmtOfClearFor;
    private final h0 __preparedStmtOfClear_1;
    private final DeviceScreenConverters __deviceScreenConverters = new DeviceScreenConverters();
    private final b __commonRoomConverter = new b();

    public DeviceScreenDao_RoomDb_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfDeviceScreenEntity = new k<DeviceScreenEntity>(roomDatabase) { // from class: com.withings.screen.repository.data.db.DeviceScreenDao_RoomDb_Impl.1
            @Override // androidx.room.h0
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `DeviceScreen` (`id`,`wsId`,`name`,`deviceId`,`userId`,`screenSource`,`images`,`embeddedId`,`displayOrder`,`active`,`deactivableStatus`,`parentId`,`displayContext`,`syncedWithWS`,`syncedWithDevice`,`modified`,`startDate`,`endDate`,`appDependencies`,`defaultActive`,`defaultRank`,`group`,`requiredFeatureIds`,`fixedPosition`,`imageType`,`imageData`,`imageHeight`,`imageWidth`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.k
            public void bind(f fVar, DeviceScreenEntity deviceScreenEntity) {
                fVar.v(1, deviceScreenEntity.getId());
                fVar.v(2, deviceScreenEntity.getWsId());
                fVar.s(3, deviceScreenEntity.getName());
                fVar.v(4, deviceScreenEntity.getDeviceId());
                fVar.v(5, deviceScreenEntity.getUserId());
                fVar.v(6, deviceScreenEntity.getScreenSource());
                String deviceScreenImageToString = DeviceScreenDao_RoomDb_Impl.this.__deviceScreenConverters.deviceScreenImageToString(deviceScreenEntity.getImages());
                if (deviceScreenImageToString == null) {
                    fVar.g2(7);
                } else {
                    fVar.s(7, deviceScreenImageToString);
                }
                if (deviceScreenEntity.getEmbeddedId() == null) {
                    fVar.g2(8);
                } else {
                    fVar.v(8, deviceScreenEntity.getEmbeddedId().intValue());
                }
                fVar.v(9, deviceScreenEntity.getDisplayOrder());
                fVar.v(10, deviceScreenEntity.getActive() ? 1L : 0L);
                if (deviceScreenEntity.getDeactivableStatus() == null) {
                    fVar.g2(11);
                } else {
                    fVar.v(11, deviceScreenEntity.getDeactivableStatus().intValue());
                }
                if (deviceScreenEntity.getParentId() == null) {
                    fVar.g2(12);
                } else {
                    fVar.v(12, deviceScreenEntity.getParentId().longValue());
                }
                fVar.s(13, deviceScreenEntity.getDisplayContext());
                fVar.v(14, deviceScreenEntity.getSyncedWithWS() ? 1L : 0L);
                fVar.v(15, deviceScreenEntity.getSyncedWithDevice() ? 1L : 0L);
                fVar.v(16, deviceScreenEntity.getModified());
                if (deviceScreenEntity.getStartDate() == null) {
                    fVar.g2(17);
                } else {
                    fVar.v(17, deviceScreenEntity.getStartDate().longValue());
                }
                if (deviceScreenEntity.getEndDate() == null) {
                    fVar.g2(18);
                } else {
                    fVar.v(18, deviceScreenEntity.getEndDate().longValue());
                }
                b bVar = DeviceScreenDao_RoomDb_Impl.this.__commonRoomConverter;
                List<String> appDependencies = deviceScreenEntity.getAppDependencies();
                bVar.getClass();
                fVar.s(19, b.b(appDependencies));
                Integer valueOf = deviceScreenEntity.getDefaultActive() == null ? null : Integer.valueOf(deviceScreenEntity.getDefaultActive().booleanValue() ? 1 : 0);
                if (valueOf == null) {
                    fVar.g2(20);
                } else {
                    fVar.v(20, valueOf.intValue());
                }
                if (deviceScreenEntity.getDefaultRank() == null) {
                    fVar.g2(21);
                } else {
                    fVar.v(21, deviceScreenEntity.getDefaultRank().intValue());
                }
                if (deviceScreenEntity.getGroup() == null) {
                    fVar.g2(22);
                } else {
                    fVar.v(22, deviceScreenEntity.getGroup().longValue());
                }
                String listOfListOfIntToString = DeviceScreenDao_RoomDb_Impl.this.__deviceScreenConverters.listOfListOfIntToString(deviceScreenEntity.getRequiredFeatureIds());
                if (listOfListOfIntToString == null) {
                    fVar.g2(23);
                } else {
                    fVar.s(23, listOfListOfIntToString);
                }
                if (deviceScreenEntity.getFixedPosition() == null) {
                    fVar.g2(24);
                } else {
                    fVar.v(24, deviceScreenEntity.getFixedPosition().intValue());
                }
                DeviceScreenEntityImage image = deviceScreenEntity.getImage();
                if (image != null) {
                    if (image.getImageType() == null) {
                        fVar.g2(25);
                    } else {
                        fVar.v(25, image.getImageType().intValue());
                    }
                    if (image.getImageData() == null) {
                        fVar.g2(26);
                    } else {
                        fVar.s(26, image.getImageData());
                    }
                    if (image.getImageHeight() == null) {
                        fVar.g2(27);
                    } else {
                        fVar.v(27, image.getImageHeight().intValue());
                    }
                    if (image.getImageWidth() == null) {
                        fVar.g2(28);
                        return;
                    } else {
                        fVar.v(28, image.getImageWidth().intValue());
                        return;
                    }
                }
                a.c(fVar, 25, 26, 27, 28);
            }
        };
        this.__preparedStmtOfClearFor = new h0(roomDatabase) { // from class: com.withings.screen.repository.data.db.DeviceScreenDao_RoomDb_Impl.2
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM devicescreen WHERE userId = ? AND deviceId = ?";
            }
        };
        this.__preparedStmtOfClear = new h0(roomDatabase) { // from class: com.withings.screen.repository.data.db.DeviceScreenDao_RoomDb_Impl.3
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM devicescreen WHERE deviceId = ?";
            }
        };
        this.__preparedStmtOfClear_1 = new h0(roomDatabase) { // from class: com.withings.screen.repository.data.db.DeviceScreenDao_RoomDb_Impl.4
            @Override // androidx.room.h0
            public String createQuery() {
                return "DELETE FROM devicescreen";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.withings.screen.repository.data.db.DeviceScreenDao
    public Object clear(final long j5, d<? super y> dVar) {
        return g.c(this.__db, new Callable<y>() { // from class: com.withings.screen.repository.data.db.DeviceScreenDao_RoomDb_Impl.7
            @Override // java.util.concurrent.Callable
            public y call() throws Exception {
                f acquire = DeviceScreenDao_RoomDb_Impl.this.__preparedStmtOfClear.acquire();
                acquire.v(1, j5);
                try {
                    DeviceScreenDao_RoomDb_Impl.this.__db.c();
                    acquire.H();
                    DeviceScreenDao_RoomDb_Impl.this.__db.z();
                    y yVar = y.f85009a;
                    DeviceScreenDao_RoomDb_Impl.this.__db.h();
                    return yVar;
                } finally {
                    DeviceScreenDao_RoomDb_Impl.this.__preparedStmtOfClear.release(acquire);
                }
            }
        }, dVar);
    }

    @Override // com.withings.screen.repository.data.db.DeviceScreenDao
    public Object clearFor(final long j5, final long j11, d<? super y> dVar) {
        return g.c(this.__db, new Callable<y>() { // from class: com.withings.screen.repository.data.db.DeviceScreenDao_RoomDb_Impl.6
            @Override // java.util.concurrent.Callable
            public y call() throws Exception {
                f acquire = DeviceScreenDao_RoomDb_Impl.this.__preparedStmtOfClearFor.acquire();
                acquire.v(1, j5);
                acquire.v(2, j11);
                try {
                    DeviceScreenDao_RoomDb_Impl.this.__db.c();
                    acquire.H();
                    DeviceScreenDao_RoomDb_Impl.this.__db.z();
                    y yVar = y.f85009a;
                    DeviceScreenDao_RoomDb_Impl.this.__db.h();
                    return yVar;
                } finally {
                    DeviceScreenDao_RoomDb_Impl.this.__preparedStmtOfClearFor.release(acquire);
                }
            }
        }, dVar);
    }

    @Override // com.withings.screen.repository.data.db.DeviceScreenDao
    public Flow<List<DeviceScreenEntity>> get(long j5, long j11) {
        final d0 c11 = d0.c(2, "SELECT * FROM devicescreen WHERE userId = ? AND deviceId = ?");
        c11.v(1, j5);
        c11.v(2, j11);
        return g.a(this.__db, false, new String[]{"devicescreen"}, new Callable<List<DeviceScreenEntity>>() { // from class: com.withings.screen.repository.data.db.DeviceScreenDao_RoomDb_Impl.9
            protected void finalize() {
                c11.release();
            }

            /* JADX WARN: Removed duplicated region for block: B:101:0x0318 A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x000f, B:4:0x00e0, B:6:0x00e6, B:10:0x0111, B:14:0x012e, B:18:0x013d, B:22:0x0150, B:26:0x0167, B:30:0x0180, B:34:0x0193, B:38:0x01b6, B:42:0x01d1, B:53:0x0215, B:57:0x0230, B:61:0x024b, B:65:0x0262, B:69:0x0285, B:71:0x028b, B:73:0x0295, B:75:0x029d, B:86:0x02ca, B:90:0x02e1, B:94:0x02f4, B:98:0x030b, B:102:0x0321, B:103:0x0328, B:101:0x0318, B:97:0x02ff, B:93:0x02ec, B:89:0x02d5, B:68:0x0279, B:64:0x0258, B:60:0x023d, B:56:0x0222, B:48:0x0200, B:52:0x020b, B:45:0x01ef, B:41:0x01c3, B:37:0x01a8, B:25:0x015b, B:21:0x0146, B:13:0x0124, B:9:0x010b), top: B:109:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:88:0x02d0  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x02d5 A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x000f, B:4:0x00e0, B:6:0x00e6, B:10:0x0111, B:14:0x012e, B:18:0x013d, B:22:0x0150, B:26:0x0167, B:30:0x0180, B:34:0x0193, B:38:0x01b6, B:42:0x01d1, B:53:0x0215, B:57:0x0230, B:61:0x024b, B:65:0x0262, B:69:0x0285, B:71:0x028b, B:73:0x0295, B:75:0x029d, B:86:0x02ca, B:90:0x02e1, B:94:0x02f4, B:98:0x030b, B:102:0x0321, B:103:0x0328, B:101:0x0318, B:97:0x02ff, B:93:0x02ec, B:89:0x02d5, B:68:0x0279, B:64:0x0258, B:60:0x023d, B:56:0x0222, B:48:0x0200, B:52:0x020b, B:45:0x01ef, B:41:0x01c3, B:37:0x01a8, B:25:0x015b, B:21:0x0146, B:13:0x0124, B:9:0x010b), top: B:109:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:92:0x02e7  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x02ec A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x000f, B:4:0x00e0, B:6:0x00e6, B:10:0x0111, B:14:0x012e, B:18:0x013d, B:22:0x0150, B:26:0x0167, B:30:0x0180, B:34:0x0193, B:38:0x01b6, B:42:0x01d1, B:53:0x0215, B:57:0x0230, B:61:0x024b, B:65:0x0262, B:69:0x0285, B:71:0x028b, B:73:0x0295, B:75:0x029d, B:86:0x02ca, B:90:0x02e1, B:94:0x02f4, B:98:0x030b, B:102:0x0321, B:103:0x0328, B:101:0x0318, B:97:0x02ff, B:93:0x02ec, B:89:0x02d5, B:68:0x0279, B:64:0x0258, B:60:0x023d, B:56:0x0222, B:48:0x0200, B:52:0x020b, B:45:0x01ef, B:41:0x01c3, B:37:0x01a8, B:25:0x015b, B:21:0x0146, B:13:0x0124, B:9:0x010b), top: B:109:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:96:0x02fa  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x02ff A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x000f, B:4:0x00e0, B:6:0x00e6, B:10:0x0111, B:14:0x012e, B:18:0x013d, B:22:0x0150, B:26:0x0167, B:30:0x0180, B:34:0x0193, B:38:0x01b6, B:42:0x01d1, B:53:0x0215, B:57:0x0230, B:61:0x024b, B:65:0x0262, B:69:0x0285, B:71:0x028b, B:73:0x0295, B:75:0x029d, B:86:0x02ca, B:90:0x02e1, B:94:0x02f4, B:98:0x030b, B:102:0x0321, B:103:0x0328, B:101:0x0318, B:97:0x02ff, B:93:0x02ec, B:89:0x02d5, B:68:0x0279, B:64:0x0258, B:60:0x023d, B:56:0x0222, B:48:0x0200, B:52:0x020b, B:45:0x01ef, B:41:0x01c3, B:37:0x01a8, B:25:0x015b, B:21:0x0146, B:13:0x0124, B:9:0x010b), top: B:109:0x000f }] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.List<com.withings.screen.repository.data.model.DeviceScreenEntity> call() throws java.lang.Exception {
                /*
                    Method dump skipped, instructions count: 854
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.screen.repository.data.db.DeviceScreenDao_RoomDb_Impl.AnonymousClass9.call():java.util.List");
            }
        });
    }

    @Override // com.withings.screen.repository.data.db.DeviceScreenDao
    public Object insertOrUpdate(final List<DeviceScreenEntity> list, d<? super y> dVar) {
        return g.c(this.__db, new Callable<y>() { // from class: com.withings.screen.repository.data.db.DeviceScreenDao_RoomDb_Impl.5
            @Override // java.util.concurrent.Callable
            public y call() throws Exception {
                DeviceScreenDao_RoomDb_Impl.this.__db.c();
                try {
                    DeviceScreenDao_RoomDb_Impl.this.__insertionAdapterOfDeviceScreenEntity.insert((Iterable) list);
                    DeviceScreenDao_RoomDb_Impl.this.__db.z();
                    return y.f85009a;
                } finally {
                    DeviceScreenDao_RoomDb_Impl.this.__db.h();
                }
            }
        }, dVar);
    }

    @Override // com.withings.screen.repository.data.db.DeviceScreenDao
    public Object clear(d<? super y> dVar) {
        return g.c(this.__db, new Callable<y>() { // from class: com.withings.screen.repository.data.db.DeviceScreenDao_RoomDb_Impl.8
            @Override // java.util.concurrent.Callable
            public y call() throws Exception {
                f acquire = DeviceScreenDao_RoomDb_Impl.this.__preparedStmtOfClear_1.acquire();
                try {
                    DeviceScreenDao_RoomDb_Impl.this.__db.c();
                    acquire.H();
                    DeviceScreenDao_RoomDb_Impl.this.__db.z();
                    y yVar = y.f85009a;
                    DeviceScreenDao_RoomDb_Impl.this.__db.h();
                    return yVar;
                } finally {
                    DeviceScreenDao_RoomDb_Impl.this.__preparedStmtOfClear_1.release(acquire);
                }
            }
        }, dVar);
    }

    @Override // com.withings.screen.repository.data.db.DeviceScreenDao
    public Flow<List<DeviceScreenEntity>> get(long j5) {
        final d0 c11 = d0.c(1, "SELECT * FROM devicescreen WHERE deviceId = ?");
        c11.v(1, j5);
        return g.a(this.__db, false, new String[]{"devicescreen"}, new Callable<List<DeviceScreenEntity>>() { // from class: com.withings.screen.repository.data.db.DeviceScreenDao_RoomDb_Impl.10
            protected void finalize() {
                c11.release();
            }

            /* JADX WARN: Removed duplicated region for block: B:101:0x0318 A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x000f, B:4:0x00e0, B:6:0x00e6, B:10:0x0111, B:14:0x012e, B:18:0x013d, B:22:0x0150, B:26:0x0167, B:30:0x0180, B:34:0x0193, B:38:0x01b6, B:42:0x01d1, B:53:0x0215, B:57:0x0230, B:61:0x024b, B:65:0x0262, B:69:0x0285, B:71:0x028b, B:73:0x0295, B:75:0x029d, B:86:0x02ca, B:90:0x02e1, B:94:0x02f4, B:98:0x030b, B:102:0x0321, B:103:0x0328, B:101:0x0318, B:97:0x02ff, B:93:0x02ec, B:89:0x02d5, B:68:0x0279, B:64:0x0258, B:60:0x023d, B:56:0x0222, B:48:0x0200, B:52:0x020b, B:45:0x01ef, B:41:0x01c3, B:37:0x01a8, B:25:0x015b, B:21:0x0146, B:13:0x0124, B:9:0x010b), top: B:109:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:88:0x02d0  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x02d5 A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x000f, B:4:0x00e0, B:6:0x00e6, B:10:0x0111, B:14:0x012e, B:18:0x013d, B:22:0x0150, B:26:0x0167, B:30:0x0180, B:34:0x0193, B:38:0x01b6, B:42:0x01d1, B:53:0x0215, B:57:0x0230, B:61:0x024b, B:65:0x0262, B:69:0x0285, B:71:0x028b, B:73:0x0295, B:75:0x029d, B:86:0x02ca, B:90:0x02e1, B:94:0x02f4, B:98:0x030b, B:102:0x0321, B:103:0x0328, B:101:0x0318, B:97:0x02ff, B:93:0x02ec, B:89:0x02d5, B:68:0x0279, B:64:0x0258, B:60:0x023d, B:56:0x0222, B:48:0x0200, B:52:0x020b, B:45:0x01ef, B:41:0x01c3, B:37:0x01a8, B:25:0x015b, B:21:0x0146, B:13:0x0124, B:9:0x010b), top: B:109:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:92:0x02e7  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x02ec A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x000f, B:4:0x00e0, B:6:0x00e6, B:10:0x0111, B:14:0x012e, B:18:0x013d, B:22:0x0150, B:26:0x0167, B:30:0x0180, B:34:0x0193, B:38:0x01b6, B:42:0x01d1, B:53:0x0215, B:57:0x0230, B:61:0x024b, B:65:0x0262, B:69:0x0285, B:71:0x028b, B:73:0x0295, B:75:0x029d, B:86:0x02ca, B:90:0x02e1, B:94:0x02f4, B:98:0x030b, B:102:0x0321, B:103:0x0328, B:101:0x0318, B:97:0x02ff, B:93:0x02ec, B:89:0x02d5, B:68:0x0279, B:64:0x0258, B:60:0x023d, B:56:0x0222, B:48:0x0200, B:52:0x020b, B:45:0x01ef, B:41:0x01c3, B:37:0x01a8, B:25:0x015b, B:21:0x0146, B:13:0x0124, B:9:0x010b), top: B:109:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:96:0x02fa  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x02ff A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x000f, B:4:0x00e0, B:6:0x00e6, B:10:0x0111, B:14:0x012e, B:18:0x013d, B:22:0x0150, B:26:0x0167, B:30:0x0180, B:34:0x0193, B:38:0x01b6, B:42:0x01d1, B:53:0x0215, B:57:0x0230, B:61:0x024b, B:65:0x0262, B:69:0x0285, B:71:0x028b, B:73:0x0295, B:75:0x029d, B:86:0x02ca, B:90:0x02e1, B:94:0x02f4, B:98:0x030b, B:102:0x0321, B:103:0x0328, B:101:0x0318, B:97:0x02ff, B:93:0x02ec, B:89:0x02d5, B:68:0x0279, B:64:0x0258, B:60:0x023d, B:56:0x0222, B:48:0x0200, B:52:0x020b, B:45:0x01ef, B:41:0x01c3, B:37:0x01a8, B:25:0x015b, B:21:0x0146, B:13:0x0124, B:9:0x010b), top: B:109:0x000f }] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.List<com.withings.screen.repository.data.model.DeviceScreenEntity> call() throws java.lang.Exception {
                /*
                    Method dump skipped, instructions count: 854
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.screen.repository.data.db.DeviceScreenDao_RoomDb_Impl.AnonymousClass10.call():java.util.List");
            }
        });
    }
}
