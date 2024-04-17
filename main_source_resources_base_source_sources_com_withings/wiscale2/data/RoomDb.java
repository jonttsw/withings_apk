package com.withings.wiscale2.data;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.device.Device;
import com.withings.vasistas.model.Vasistas;
import java.util.Iterator;
import kotlin.Metadata;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
/* compiled from: RoomDb.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/data/RoomDb;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "f2", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class RoomDb extends RoomDatabase {

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class a extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.work.impl.g.c(cVar, "DROP TABLE IF EXISTS `ActirecCategoryDetection`", "DROP TABLE IF EXISTS `bookmark`", "DROP TABLE IF EXISTS `bookmarkPreview`", "DROP TABLE IF EXISTS `mission_entity`");
            androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `ActirecCategoryDetection` (`userId` INTEGER NOT NULL, `workoutCategory` INTEGER NOT NULL, `enabled` INTEGER NOT NULL, PRIMARY KEY(`userId`, `workoutCategory`))", "CREATE TABLE IF NOT EXISTS `bookmark` (`remoteTaskId` TEXT NOT NULL, `isSync` INTEGER NOT NULL, `isSelected` INTEGER NOT NULL, `updatedDate` INTEGER NOT NULL, PRIMARY KEY(`remoteTaskId`))", "CREATE TABLE IF NOT EXISTS `bookmarkPreview` (`remoteTaskId` TEXT NOT NULL, `updatedDate` INTEGER NOT NULL, `isSync` INTEGER NOT NULL, `type` TEXT NOT NULL, `title` TEXT NOT NULL, `extraHighlightInfo` TEXT NOT NULL, `thumbnail` TEXT NOT NULL, `capabilities` TEXT NOT NULL, PRIMARY KEY(`remoteTaskId`), FOREIGN KEY(`remoteTaskId`) REFERENCES `bookmark`(`remoteTaskId`) ON UPDATE NO ACTION ON DELETE CASCADE )", "CREATE TABLE IF NOT EXISTS `mission_entity` (`id` INTEGER NOT NULL, `date` INTEGER NOT NULL, `completed` INTEGER NOT NULL, `type` TEXT NOT NULL, `title` TEXT NOT NULL, `extraHighlightInfo` TEXT DEFAULT NULL, `thumbnail` TEXT, `goal` TEXT, `crmid` TEXT, `completionDate` INTEGER, `updatedDate` INTEGER, `is_synced` INTEGER NOT NULL DEFAULT false, `capabilities` TEXT, `remote_program_task_id` TEXT, `remote_task_id` TEXT NOT NULL DEFAULT '', PRIMARY KEY(`id`))");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class a0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "DeviceScreenContent", "syncedWithDevice", "INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class a1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.activity.b.d(cVar, "DROP TABLE IF EXISTS `DeviceScreen`", "CREATE TABLE IF NOT EXISTS `DeviceScreen` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `wsId` INTEGER NOT NULL, `name` TEXT NOT NULL, `deviceId` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `screenSource` INTEGER NOT NULL, `embeddedId` INTEGER, `displayOrder` INTEGER NOT NULL, `active` INTEGER NOT NULL, `displayContext` TEXT NOT NULL, `syncedWithWS` INTEGER NOT NULL, `syncedWithDevice` INTEGER NOT NULL, `modified` INTEGER NOT NULL, `imageType` INTEGER, `imageData` TEXT, `imageHeight` INTEGER, `images` TEXT, `appDependencies` TEXT NOT NULL DEFAULT '', `imageWidth` INTEGER)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_DeviceScreen_embeddedId_deviceId` ON `DeviceScreen` (`embeddedId`, `deviceId`)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class a2 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `Target` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `wsId` INTEGER, `userId` INTEGER NOT NULL, `type` INTEGER NOT NULL, `measureType` INTEGER NOT NULL, `range` INTEGER NOT NULL, `mantissa` INTEGER NOT NULL, `exponent` INTEGER NOT NULL, `isActive` INTEGER NOT NULL, `deactivated` INTEGER, `created` INTEGER NOT NULL, `modified` INTEGER NOT NULL, `date` INTEGER NOT NULL, `isSyncedWithApi` INTEGER NOT NULL)", "CREATE INDEX IF NOT EXISTS `index_Target_userId_isActive` ON `Target` (`userId`, `isActive`)", "CREATE INDEX IF NOT EXISTS `index_Target_userId_isSyncedWithApi` ON `Target` (`userId`, `isSyncedWithApi`)", "CREATE INDEX IF NOT EXISTS `index_Target_userId_type_measureType` ON `Target` (`userId`, `type`, `measureType`)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class b extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.work.impl.g.c(cVar, "DROP TABLE IF EXISTS `bookmarkPreview`", "DROP TABLE IF EXISTS `bookmark`", "CREATE TABLE IF NOT EXISTS `bookmark` (`isSelected` INTEGER NOT NULL, `updatedDate` INTEGER NOT NULL, `type` TEXT NOT NULL, `remoteTaskId` TEXT NOT NULL, `isSync` INTEGER NOT NULL, PRIMARY KEY(`remoteTaskId`))", "CREATE TABLE IF NOT EXISTS `bookmarkPreview` (`remoteTaskId` TEXT NOT NULL, `title` TEXT NOT NULL, `thumbnail` TEXT NOT NULL, `extraHighlightInfo` TEXT NOT NULL, `capabilities` TEXT NOT NULL, PRIMARY KEY(`remoteTaskId`), FOREIGN KEY(`remoteTaskId`) REFERENCES `bookmark`(`remoteTaskId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            cVar.l("CREATE VIEW `BookmarkPreviewView` AS SELECT bookmark.remoteTaskId, bookmark.isSync, bookmark.isSelected, bookmark.updatedDate, bookmark.type, bookmarkPreview.title as title, bookmarkPreview.extraHighlightInfo as extraHighlightInfo, bookmarkPreview.thumbnail as thumbnail, bookmarkPreview.capabilities as capabilities FROM bookmark INNER JOIN bookmarkPreview ON bookmark.remoteTaskId = bookmarkPreview.remoteTaskId");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class b0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DROP TABLE IF EXISTS `Insight`");
            cVar.l("CREATE TABLE IF NOT EXISTS `Insight` (`localId` INTEGER PRIMARY KEY AUTOINCREMENT, `id` TEXT NOT NULL,  `userId` INTEGER NOT NULL, `format` TEXT , `emotion` TEXT , `bgcolor` TEXT , `category` TEXT NOT NULL, `title` TEXT, `subtitle` TEXT, `buttonText` TEXT , `buttonUrl` TEXT, `day` INTEGER, `conversation` TEXT, `scenario` TEXT, `synced` INTEGER NOT NULL, `context` TEXT, `read` INTEGER NOT NULL DEFAULT 0, `index` INTEGER NOT NULL DEFAULT 0)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class b1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("CREATE TABLE IF NOT EXISTS `Plan` (`id` INTEGER PRIMARY KEY NOT NULL, `accountId` INTEGER, `deviceId` INTEGER, `state` TEXT NOT NULL, `type` INTEGER NOT NULL, `startDate` INTEGER NOT NULL)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class b2 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DROP TABLE IF EXISTS `VasistasSource`");
            cVar.l("CREATE TABLE IF NOT EXISTS `VasistasSource` (`deviceId` INTEGER NOT NULL, `vasistasCategory` INTEGER NOT NULL,`userId` INTEGER NOT NULL, `devicePriority` INTEGER NOT NULL,`timestamp` INTEGER NOT NULL , PRIMARY KEY (`deviceId`,`vasistasCategory`))");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class c extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DELETE FROM wifit_task");
            cVar.l("ALTER TABLE wifit_task ADD measureType INT");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class c0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DROP TABLE IF EXISTS `Section`");
            cVar.l("CREATE TABLE `Section` (`orderId` INTEGER PRIMARY KEY AUTOINCREMENT, `tag` TEXT NOT NULL, `title` TEXT NOT NULL, `subtitle` TEXT NOT NULL, `caption` TEXT NOT NULL, `layoutFormatId` INTEGER, `dataType` INTEGER, `maxItemsCount` INTEGER)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class c1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("CREATE TABLE IF NOT EXISTS `Event` (`id` INTEGER PRIMARY KEY, `type` TEXT NOT NULL, `epoch` INTEGER NOT NULL, `data` TEXT NOT NULL, `userId` INTEGER NOT NULL, `deviceId` INTEGER NOT NULL)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class c2 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.work.impl.g.c(cVar, "DROP TABLE IF EXISTS `wifit_task`", "DROP TABLE IF EXISTS `wifit_progression_task`", "CREATE TABLE IF NOT EXISTS `wifit_task` (`task_identifier` TEXT NOT NULL, `identifier` TEXT NOT NULL, `type` TEXT, `title` TEXT, `thumbnail` TEXT, `required` INTEGER, `tags_list` TEXT, `data` TEXT, `week_index` INTEGER, `week_label` TEXT, `day_index` INTEGER, `day_label` TEXT, `task_index` INTEGER, `program_id` INTEGER NOT NULL, `instance_id` INTEGER NOT NULL, `is_synced` INTEGER NOT NULL, PRIMARY KEY(`task_identifier`))", "CREATE TABLE IF NOT EXISTS `wifit_progression_task` (`task_identifier` TEXT NOT NULL, `status` INTEGER, `completion_date` INTEGER, PRIMARY KEY(`task_identifier`), FOREIGN KEY(`task_identifier`) REFERENCES `wifit_task`(`task_identifier`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class d extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `program_task_preview` (`task_identifier` TEXT NOT NULL, `identifier` TEXT NOT NULL, `type` TEXT, `title` TEXT, `thumbnail` TEXT, `required` INTEGER, `tags_list` TEXT, `week_index` INTEGER, `week_label` TEXT, `day_index` INTEGER, `day_label` TEXT, `task_index` INTEGER, `program_id` INTEGER NOT NULL, `instance_id` INTEGER NOT NULL, `is_synced` INTEGER NOT NULL, `measureType` INTEGER, `status` INTEGER, `goal` FLOAT, `completion_date` INTEGER, `program_lastupdate` INTEGER,PRIMARY KEY(`task_identifier`))", "DROP TABLE IF EXISTS `wifit_task`", "CREATE TABLE IF NOT EXISTS `mission_task_preview` (`id` INTEGER NOT NULL, `date` INTEGER NOT NULL, `thumbnail` TEXT, `title` TEXT NOT NULL, `capabilities` TEXT, `goal` TEXT, `remote_task_id` TEXT NOT NULL DEFAULT '', `completed` INTEGER NOT NULL, `updatedDate` INTEGER, `type` TEXT NOT NULL, `is_synced` INTEGER NOT NULL DEFAULT false, `crmid` TEXT, `remote_program_task_id` TEXT, `completionDate` INTEGER, `extraHighlightInfo` TEXT DEFAULT NULL, `status` INTEGER,PRIMARY KEY(`id`))", "DROP TABLE IF EXISTS `wifit_progression_task`");
            androidx.activity.b.d(cVar, "DROP TABLE IF EXISTS `mission_progression_task`", "UPDATE program_enrolled SET modified = 0", "CREATE TABLE IF NOT EXISTS `task_content` (`contentId` TEXT NOT NULL, `relatedProgramId` INTEGER NOT NULL DEFAULT -1, `content` TEXT NOT NULL, `lastUpdate` INTEGER NOT NULL, PRIMARY KEY(`contentId`, `relatedProgramId`))");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class d0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "Section", "actions", "TEXT");
            f2.a(cVar, "Section", "emptyState", "TEXT");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class d1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.activity.b.d(cVar, "DROP TABLE IF EXISTS `DeviceScreen`", "CREATE TABLE IF NOT EXISTS `DeviceScreen` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `wsId` INTEGER NOT NULL, `name` TEXT NOT NULL, `deviceId` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `screenSource` INTEGER NOT NULL, `embeddedId` INTEGER, `displayOrder` INTEGER NOT NULL, `active` INTEGER NOT NULL, `displayContext` TEXT NOT NULL, `syncedWithWS` INTEGER NOT NULL, `syncedWithDevice` INTEGER NOT NULL, `modified` INTEGER NOT NULL, `imageType` INTEGER, `imageData` TEXT, `imageHeight` INTEGER, `images` TEXT, `appDependencies` TEXT NOT NULL DEFAULT '', `imageWidth` INTEGER)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_DeviceScreen_wsId_embeddedId_deviceId` ON `DeviceScreen` (`wsId`, `embeddedId`, `deviceId`)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class d2 extends w8.b {

        /* compiled from: RoomDb.kt */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ sm0.a<Vasistas.Category> f50644a = sm0.b.a(Vasistas.Category.values());
        }

        @Override // w8.b
        public final void a(a9.c cVar) {
            long longValue;
            Vasistas h11;
            cVar.l("DROP TABLE IF EXISTS `VasistasSource`");
            cVar.l("CREATE TABLE IF NOT EXISTS `VasistasSource` (`deviceId` INTEGER NOT NULL, `vasistasCategory` INTEGER NOT NULL,`userId` INTEGER NOT NULL, `devicePriority` INTEGER NOT NULL,`timestamp` INTEGER NOT NULL , PRIMARY KEY (`deviceId`,`vasistasCategory`))");
            for (Device device : kn.e.c().h(16)) {
                Iterator it = ((kotlin.collections.c) a.f50644a).iterator();
                while (it.hasNext()) {
                    Vasistas.Category category = (Vasistas.Category) it.next();
                    Long userId = device.getUserId();
                    if (userId != null && (h11 = lj0.h0.e().h((longValue = userId.longValue()), category)) != null) {
                        lj0.k0 k0Var = new lj0.k0(device.getId(), category.getValue(), 1, longValue, h11.getEnd().getMillis());
                        long a11 = k0Var.a();
                        int e11 = k0Var.e();
                        long d11 = k0Var.d();
                        int b10 = k0Var.b();
                        long c11 = k0Var.c();
                        StringBuilder sb2 = new StringBuilder("INSERT INTO `VasistasSource` (deviceId, vasistasCategory, userId, devicePriority, timestamp) VALUES(");
                        sb2.append(a11);
                        sb2.append(", ");
                        sb2.append(e11);
                        androidx.work.impl.g.d(sb2, ", ", d11, ", ");
                        sb2.append(b10);
                        sb2.append(", ");
                        sb2.append(c11);
                        sb2.append(")");
                        cVar.l(sb2.toString());
                    }
                }
            }
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class e extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.work.impl.g.c(cVar, "ALTER TABLE DeviceScreensGroup RENAME TO DeviceScreensGroupOld", "CREATE TABLE IF NOT EXISTS `DeviceScreensGroup` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `modified` INTEGER NOT NULL, `deviceId` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, `rank` INTEGER NOT NULL, PRIMARY KEY(`id`, `deviceId`))", "INSERT INTO DeviceScreensGroup(id, name, modified, deviceId, deleted, rank)\nSELECT DeviceScreensGroupOld.id, DeviceScreensGroupOld.name, DeviceScreensGroupOld.modified, DeviceScreensGroupOld.deviceId, DeviceScreensGroupOld.deleted, DeviceScreensGroupOld.id\nFROM DeviceScreensGroupOld", "DROP TABLE DeviceScreensGroupOld");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class e0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "Insight", "archivable", "INTEGER");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class e1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DROP TABLE IF EXISTS `Insight`");
            cVar.l("CREATE TABLE IF NOT EXISTS `Insight` (`crmId` TEXT NOT NULL, `insightId` INTEGER PRIMARY KEY, `conversationId` INTEGER , `userId` INTEGER NOT NULL, `format` TEXT , `emotion` TEXT , `bgcolor` TEXT , `category` TEXT NOT NULL, `title` TEXT, `subtitle` TEXT, `buttonText` TEXT , `buttonUrl` TEXT, `day` INTEGER, `conversation` TEXT, `scenario` TEXT, `synced` INTEGER NOT NULL, `context` TEXT, `read` INTEGER NOT NULL , `archivable` INTEGER, `modified` INTEGER NOT NULL, `created` INTEGER NOT NULL, `deleted` INTEGER NOT NULL DEFAULT 0, `conditions` TEXT, `variables` TEXT, `opened` INTEGER NOT NULL DEFAULT 0, `priority` INTEGER, `expirationDate` INTEGER, `version` FLOAT )");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class e2 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.work.impl.g.c(cVar, "DROP TABLE IF EXISTS `NoteGroup`", "DROP TABLE IF EXISTS `Note`", "CREATE TABLE `NoteGroup` (`noteGroupId` INTEGER PRIMARY KEY NOT NULL, `wsId` INTEGER,`userId` INTEGER,`measureGroupId` INTEGER NOT NULL, `localMeasureGroupId` INTEGER, `localEcgId` INTEGER, `cryptpart` TEXT,`date` INTEGER NOT NULL,`serverCreatedDate` INTEGER, `serverModifiedDate` INTEGER, `localModifiedDate` INTEGER, `noSymptom` INTEGER NOT NULL, `signalId` INTEGER,`deleted` INTEGER NOT NULL, `synced` INTEGER NOT NULL)", "CREATE TABLE `NoteEntity` (`noteId` INTEGER PRIMARY KEY NOT NULL, `noteWsId` INTEGER ,`noteGroupId` INTEGER, `localNoteGroupId` INTEGER, `noteDeleted` INTEGER NOT NULL, `type` INTEGER NOT NULL,`text` TEXT,`noteHealthAttributeId` INTEGER, `signalId` INTEGER)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class f extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("CREATE TABLE IF NOT EXISTS HealthScore (`day` TEXT NOT NULL, `user_id` INTEGER NOT NULL, `last_modified` INTEGER NOT NULL, `global` REAL NOT NULL, `activity` REAL, `body` REAL, `heart` REAL, `sleep` REAL, `synced` INTEGER NOT NULL, PRIMARY KEY(`day`, `user_id`))");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class f0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "Insight", "modified", "INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class f1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "Track", "deviceId", "INTEGER");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class f2 {
        public static final void a(z8.b bVar, String str, String str2, String str3) {
            Cursor L1 = bVar.L1("PRAGMA table_info(" + str + ");");
            try {
                Cursor cursor = L1;
                if (cursor.getCount() == 0) {
                    ge0.d.a(L1, null);
                } else {
                    cursor.moveToFirst();
                    int columnIndex = cursor.getColumnIndex("name");
                    while (!cursor.isAfterLast()) {
                        if (kotlin.jvm.internal.u.e(str2, cursor.getString(columnIndex))) {
                            ge0.d.a(L1, null);
                            return;
                        }
                        cursor.moveToNext();
                    }
                    ge0.d.a(L1, null);
                }
                StringBuilder b10 = androidx.camera.camera2.internal.l0.b("ALTER TABLE ", str, " ADD COLUMN ", str2, " ");
                b10.append(str3);
                b10.append(";");
                bVar.l(b10.toString());
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ge0.d.a(L1, th2);
                    throw th3;
                }
            }
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class g extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("ALTER TABLE program_task_preview ADD `metadata` TEXT");
            cVar.l("ALTER TABLE mission_task_preview ADD `metadata` TEXT");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class g0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("CREATE TABLE IF NOT EXISTS `WorkoutLocation` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` INTEGER NOT NULL, `date` INTEGER, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `accuracy` REAL NOT NULL, `altitude` REAL NOT NULL, `speed` REAL NOT NULL)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class g1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.activity.b.d(cVar, "DROP TABLE IF EXISTS `DeviceScreen`", "CREATE TABLE IF NOT EXISTS `DeviceScreen` ( `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `wsId` INTEGER NOT NULL, `name` TEXT NOT NULL, `deviceId` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `screenSource` INTEGER NOT NULL, `embeddedId` INTEGER, `displayOrder` INTEGER NOT NULL, `active` INTEGER NOT NULL, `displayContext` TEXT NOT NULL, `syncedWithWS` INTEGER NOT NULL, `syncedWithDevice` INTEGER NOT NULL, `modified` INTEGER NOT NULL, `imageType` INTEGER, `imageData` TEXT, `imageHeight` INTEGER, `images` TEXT, `appDependencies` TEXT NOT NULL DEFAULT '', `imageWidth` INTEGER)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_DeviceScreen_wsId_embeddedId_deviceId_userId` ON `DeviceScreen` (`wsId`, `embeddedId`, `deviceId`, `userId`)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class h extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.activity.b.d(cVar, "DROP TABLE IF EXISTS `EcgMeasurement`", "CREATE TABLE `EcgMeasurement` (`id` INTEGER PRIMARY KEY NOT NULL,`userID` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL,`diagnostic` INTEGER, `heartRate` INTEGER NOT NULL,`signalId` INTEGER, `timeWindow` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `totalSize` INTEGER NOT NULL,`offset` INTEGER NOT NULL, `gain` INTEGER NOT NULL, `qfix` INTEGER NOT NULL, `type` INTEGER NOT NULL,`samplingFreq` INTEGER NOT NULL, `channel` INTEGER NOT NULL, `format` INTEGER NOT NULL, `size` INTEGER NOT NULL,`resolution` INTEGER NOT NULL, `signalPath` TEXT NOT NULL, `synced` INTEGER NOT NULL, `modified` INTEGER NOT NULL,`deviceModel` INTEGER NOT NULL, `filterBank` INTEGER NOT NULL)", "CREATE  INDEX `index_EcgMeasurement_userID_timestamp` ON `EcgMeasurement` (`userID`, `timestamp`)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class h0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DROP TABLE IF EXISTS `Insight`");
            cVar.l("CREATE TABLE IF NOT EXISTS `Insight` (`crmId` TEXT NOT NULL, `insightId` INTEGER PRIMARY KEY NOT NULL, `userId` INTEGER NOT NULL, `format` TEXT , `emotion` TEXT , `bgcolor` TEXT , `category` TEXT NOT NULL, `title` TEXT, `subtitle` TEXT, `buttonText` TEXT , `buttonUrl` TEXT, `day` INTEGER, `conversation` TEXT, `scenario` TEXT, `synced` INTEGER NOT NULL, `context` TEXT, `read` INTEGER NOT NULL , `archivable` INTEGER, `modified` INTEGER NOT NULL, `created` INTEGER NOT NULL)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class h1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `MeasurementEnvironment` (`id` INTEGER PRIMARY KEY NOT NULL, `wsId` INTEGER , `userId` INTEGER, `attrib` INTEGER, `date` INTEGER, `category` INTEGER, `deviceType` INTEGER, `modified` INTEGER, `algo` INTEGER, `deviceId` INTEGER, `brand` INTEGER, `synced` INTEGER, `deleted` INTEGER, `origin` TEXT, `probeReply` TEXT)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_MeasurementEnvironment_id_wsId_date` ON `MeasurementEnvironment` (`id`,`wsId`, `date`)", "CREATE TABLE IF NOT EXISTS `Measurement` (`id` INTEGER PRIMARY KEY NOT NULL, `wsId` INTEGER , `userId` INTEGER, `measurementEnvironmentId` INTEGER NOT NULL, `measurementEnvironmentWsId` INTEGER, `value` REAL NOT NULL, `date` INTEGER NOT NULL, `type` INTEGER, `unit` INTEGER NOT NULL, `y` REAL, `algoVersion` INTEGER, `appVersion` INTEGER, `platform` INTEGER, `synced` INTEGER, `deviceId` INTEGER, `deleted` INTEGER, FOREIGN KEY (measurementEnvironmentId) REFERENCES MeasurementEnvironment(id) ON UPDATE NO ACTION ON DELETE CASCADE)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_Measurement_id_measurementEnvironmentId_date_type` ON `Measurement` (`id`,`measurementEnvironmentId`, `date`, `type`)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class i extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DELETE FROM `program`");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class i0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DROP TABLE IF EXISTS `Section`");
            cVar.l("CREATE TABLE `Section` (`orderId` INTEGER PRIMARY KEY AUTOINCREMENT, `tag` TEXT NOT NULL, `title` TEXT NOT NULL, `subtitle` TEXT NOT NULL, `caption` TEXT NOT NULL, `layoutFormatId` INTEGER, `dataType` INTEGER, `maxItemsCount` INTEGER, `actions` TEXT, `emptyState` TEXT)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class i1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.work.impl.g.c(cVar, "DROP TABLE IF EXISTS `Measurement`", "DROP TABLE IF EXISTS `MeasurementEnvironment`", "CREATE TABLE IF NOT EXISTS `MeasurementContext` (`id` INTEGER PRIMARY KEY, `wsId` INTEGER , `userId` INTEGER, `attrib` INTEGER, `date` INTEGER, `category` INTEGER, `deviceType` INTEGER, `modified` INTEGER, `algo` INTEGER, `deviceId` INTEGER, `brand` INTEGER, `synced` INTEGER, `deleted` INTEGER, `origin` TEXT, `probeReply` TEXT, `created` INTEGER, `model` INTEGER)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_MeasurementContext_id_wsId_date` ON `MeasurementContext` (`id`,`wsId`, `date`)");
            cVar.l("CREATE TABLE IF NOT EXISTS `Measurement` (`id` INTEGER PRIMARY KEY, `userId` INTEGER, `measurementContextId` INTEGER NOT NULL, `measurementContextWsId` INTEGER, `value` REAL NOT NULL, `date` INTEGER NOT NULL, `type` INTEGER, `unit` INTEGER NOT NULL, `y` REAL, `algoVersion` INTEGER, `appVersion` INTEGER, `platform` INTEGER, `synced` INTEGER, `deviceId` INTEGER, `deleted` INTEGER, `fm` INTEGER, FOREIGN KEY (measurementContextId) REFERENCES MeasurementContext(id) ON UPDATE NO ACTION ON DELETE CASCADE)");
            cVar.l("CREATE UNIQUE INDEX IF NOT EXISTS `index_Measurement_id_measurementContextId_date_type` ON `Measurement` (`id`,`measurementContextId`, `date`, `type`)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class j extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DROP TABLE libraryPreviewContent");
            cVar.l("CREATE TABLE IF NOT EXISTS `libraryPreviewContent` (`contentId` TEXT NOT NULL, `taskType` TEXT NOT NULL, `title` TEXT NOT NULL, `thumbnail` TEXT NOT NULL, `capabilities` TEXT NOT NULL, `extraHighlightInfo` TEXT NOT NULL, PRIMARY KEY(`contentId`))");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class j0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "Insight", "deleted", "INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class j1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `HFMeasurement` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `userId` INTEGER,`value` REAL NOT NULL, `date` INTEGER NOT NULL, `type` INTEGER, `unit` INTEGER NOT NULL, `y` REAL, `synced` INTEGER, `deviceId` INTEGER, `deleted` INTEGER, `probeReply` TEXT, `modelId` INTEGER)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_HFMeasurement_deviceId_date_type` ON `HFMeasurement` (`deviceId`, `date`, `type`)", "DROP TABLE IF EXISTS `Measurement`", "DROP TABLE IF EXISTS `MeasurementContext`");
            androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `MeasurementContext` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `wsId` INTEGER , `userId` INTEGER, `attrib` INTEGER NOT NULL, `date` INTEGER NOT NULL, `category` INTEGER, `deviceType` INTEGER NOT NULL, `modified` INTEGER, `algo` INTEGER, `deviceId` INTEGER NOT NULL, `brand` INTEGER NOT NULL, `synced` INTEGER, `deleted` INTEGER, `origin` TEXT, `probeReply` TEXT, `created` INTEGER, `model` INTEGER)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_MeasurementContext_id_wsId_date` ON `MeasurementContext` (`id`,`wsId`, `date`)", "CREATE TABLE IF NOT EXISTS `Measurement` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `userId` INTEGER, `measurementContextId` INTEGER NOT NULL, `measurementContextWsId` INTEGER, `value` REAL NOT NULL, `date` INTEGER NOT NULL, `type` INTEGER, `unit` INTEGER NOT NULL, `y` REAL, `algoVersion` INTEGER, `appVersion` INTEGER, `platform` INTEGER, `synced` INTEGER, `deviceId` INTEGER, `deleted` INTEGER, `fm` INTEGER, `limbPosition` INTEGER, `modelId` INTEGER, FOREIGN KEY (measurementContextId) REFERENCES MeasurementContext(id) ON UPDATE NO ACTION ON DELETE CASCADE)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_Measurement_id_measurementContextId_date_type` ON `Measurement` (`id`,`measurementContextId`, `date`, `type`)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class k extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("ALTER TABLE `EcgMeasurement` ADD `deviceId` INTEGER");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class k0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("CREATE TABLE IF NOT EXISTS `Tag` (`id` INTEGER NOT NULL, `ownerType` TEXT NOT NULL, `ownerId` INTEGER NOT NULL, `name` TEXT NOT NULL, `description` TEXT NOT NULL, `created` INTEGER NOT NULL, `modified` INTEGER NOT NULL, PRIMARY KEY(`id`, `ownerId`, `ownerType`))");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class k1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "EcgMeasurement", "brand", "INTEGER");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class l extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DROP TABLE IF EXISTS `prediction`");
            cVar.l("CREATE TABLE `prediction` (`wsId` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `type` INTEGER NOT NULL, `start` INTEGER NOT NULL, `end` INTEGER NOT NULL, `active` INTEGER NOT NULL, `created` INTEGER NOT NULL, `modified` INTEGER NOT NULL, PRIMARY KEY(`wsId`))");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class l0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DROP TABLE IF EXISTS `Tag`");
            cVar.l("CREATE TABLE `Tag` (`ownerId` INTEGER NOT NULL, `ownerType` TEXT NOT NULL, `tags` TEXT NOT NULL,PRIMARY KEY(`ownerId`, `ownerType`))");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class l1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DROP TABLE IF EXISTS `Event`");
            cVar.l("CREATE TABLE IF NOT EXISTS `Event` (`id` INTEGER PRIMARY KEY, `type` TEXT NOT NULL, `epoch` INTEGER NOT NULL, `data` TEXT NOT NULL, `userId` INTEGER, `deviceId` INTEGER NOT NULL)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class m extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DROP TABLE HealthInsight");
            cVar.l("CREATE TABLE IF NOT EXISTS `HealthInsight` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `crm_id` TEXT NOT NULL, `user_id` INTEGER NOT NULL, `object_structure` TEXT NOT NULL, `object_type` INTEGER NOT NULL, `object_id` INTEGER, `timestamp` INTEGER NOT NULL, `time_to_live` INTEGER NOT NULL, `expiration_date` INTEGER NOT NULL, `url` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `created` INTEGER NOT NULL)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class m0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "Insight", "conditions", "TEXT");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class m1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DROP TABLE IF EXISTS `Plan`");
            cVar.l("CREATE TABLE IF NOT EXISTS `Plan` (`id` INTEGER PRIMARY KEY NOT NULL, `accountId` INTEGER, `deviceId` INTEGER, `state` TEXT NOT NULL, `type` INTEGER NOT NULL, `startDate` INTEGER)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class n extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "libraryPreviewContent", "event_info", "TEXT NOT NULL DEFAULT '[]'");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class n0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "EcgMeasurement", "spo2", "INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class n1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "DeviceScreen", "deactivableStatus", "INTEGER");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class o extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("ALTER TABLE `NoteEntity` ADD `modified` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class o0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.activity.b.d(cVar, "DROP TABLE IF EXISTS `EcgMeasurement`", "CREATE TABLE `EcgMeasurement` (`id` INTEGER PRIMARY KEY NOT NULL,`userID` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL,`diagnostic` INTEGER, `heartRate` INTEGER NOT NULL,`signalId` INTEGER, `timeWindow` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `totalSize` INTEGER NOT NULL,`offset` INTEGER NOT NULL, `gain` INTEGER NOT NULL, `qfix` INTEGER NOT NULL, `type` INTEGER NOT NULL,`samplingFreq` INTEGER NOT NULL, `channel` INTEGER NOT NULL, `format` INTEGER NOT NULL, `size` INTEGER NOT NULL,`resolution` INTEGER NOT NULL, `signalPath` TEXT NOT NULL, `synced` INTEGER NOT NULL, `modified` INTEGER NOT NULL,`deviceModel` INTEGER NOT NULL, `filterBank` INTEGER NOT NULL, `deviceId` INTEGER, `trackerWearPos` INTEGER,`deleted` INTEGER NOT NULL DEFAULT 0, `spo2` INTEGER NOT NULL DEFAULT 0)", "CREATE  INDEX `index_EcgMeasurement_userID_timestamp` ON `EcgMeasurement` (`userID`, `timestamp`)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class o1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "DeviceScreen", "parentId", "INTEGER");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class p extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("CREATE TABLE IF NOT EXISTS `Section` (`tag` TEXT PRIMARY KEY NOT NULL, `orderId` INTEGER NOT NULL, `name` TEXT NOT NULL, `description` TEXT NOT NULL, `layoutFormatId` INTEGER NOT NULL)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class p0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "Track", "brand", "INTEGER NOT NULL DEFAULT 1");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class p1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "DeviceScreen", "startDate", "INTEGER");
            f2.a(cVar, "DeviceScreen", "endDate", "INTEGER");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class q extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            String id2 = DateTimeZone.getDefault().getID();
            String abstractDateTime = new DateTime(0L).toString("yyyy-MM-dd");
            long millis = DateTime.now().getMillis();
            StringBuilder b10 = androidx.camera.camera2.internal.l0.b("CREATE TABLE `Track` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `wsId` INTEGER,`userId` INTEGER NOT NULL,`startDate` INTEGER NOT NULL DEFAULT 0, `endDate` INTEGER NOT NULL DEFAULT 0, `timeZone` TEXT DEFAULT '", id2, "',`day` TEXT NOT NULL DEFAULT '", abstractDateTime, "',`modifiedDate` INTEGER NOT NULL DEFAULT ");
            b10.append(millis);
            b10.append(",`deviceModel` INTEGER NOT NULL DEFAULT 0,`deviceType` INTEGER NOT NULL DEFAULT 16,`attrib` INTEGER NOT NULL DEFAULT 0,`category` INTEGER NOT NULL DEFAULT 36,`dataJson` TEXT, `activityRecognitionVersion` INTEGER, `isSyncedToWs` INTEGER NOT NULL DEFAULT 0,`deleted` INTEGER NOT NULL DEFAULT 0, `deletionReason` INTEGER, `note` TEXT,`sleepScoreValue` INTEGER, `sleepScoreStatus` INTEGER, `sleepScoreAlgoVersion` INTEGER,`duration_info_score` INTEGER, `duration_info_status` INTEGER,`recovery_info_score` INTEGER, `recovery_info_status` INTEGER,`interruptions_info_score` INTEGER, `interruptions_info_status` INTEGER,`timeToFallAsleep_info_score` INTEGER, `timeToFallAsleep_info_status` INTEGER, `timeToWakeUp_info_score` INTEGER, `timeToWakeUp_info_status` INTEGER, `regularity_info_score` INTEGER, `regularity_info_status` INTEGER, `snoring_info_score` INTEGER,`snoring_info_status` INTEGER,`night_heartrate_info_score` INTEGER, `night_heartrate_info_status` INTEGER,`snoringEnabled` INTEGER NOT NULL DEFAULT 1, `inProgress` INTEGER NOT NULL DEFAULT 0,`manualStartDate` INTEGER, `manualEndDate` INTEGER, `blankVasistasFilled` INTEGER NOT NULL DEFAULT 0,`distance` REAL, `averageSpeed` REAL, `minSpeed` REAL, `maxSpeed` REAL, `startLatitude` REAL, `startLongitude` REAL,`endLatitude` REAL, `endLongitude` REAL,`centerLatitude` REAL, `centerLongitude` REAL, `spanLatitudeDelta` REAL, `spanLongitudeDelta` REAL,`pathlists` TEXT, `cryptpart` TEXT, `coverPictureUrl` TEXT, `uris` TEXT, `coverPictureUri` TEXT)");
            cVar.l(b10.toString());
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class q0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.activity.b.d(cVar, "DROP TABLE IF EXISTS `EcgMeasurement`", "CREATE TABLE `EcgMeasurement` (`id` INTEGER PRIMARY KEY NOT NULL,`userID` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `measures` TEXT NOT NULL, `firmwareVersion` INTEGER,`signalId` INTEGER, `timeWindow` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `totalSize` INTEGER NOT NULL,`offset` INTEGER NOT NULL, `gain` INTEGER NOT NULL, `qfix` INTEGER NOT NULL, `type` INTEGER NOT NULL,`samplingFreq` INTEGER NOT NULL, `channel` INTEGER NOT NULL, `format` INTEGER NOT NULL, `size` INTEGER NOT NULL,`resolution` INTEGER NOT NULL, `signalPath` TEXT NOT NULL, `synced` INTEGER NOT NULL, `modified` INTEGER NOT NULL,`deviceModel` INTEGER NOT NULL, `filterBank` INTEGER NOT NULL, `deviceId` INTEGER, `trackerWearPos` INTEGER,`deleted` INTEGER NOT NULL DEFAULT 0)", "CREATE  INDEX `index_EcgMeasurement_userID_timestamp` ON `EcgMeasurement` (`userID`, `timestamp`)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class q1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("CREATE TABLE IF NOT EXISTS `leaderboard` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `date` TEXT NOT NULL, `userid` INTEGER NOT NULL, `score` INTEGER NOT NULL, `firstname` TEXT NOT NULL, `lastName` TEXT NOT NULL, `imageUrl` TEXT NOT NULL)");
            cVar.l("CREATE INDEX IF NOT EXISTS `index_leaderboard_date` ON `leaderboard` (`date`)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class r extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "EcgMeasurement", "trackerWearPos", "INTEGER");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class r0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("ALTER TABLE `WorkoutLocation` ADD `verticalAccuracy` REAL NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class r1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.activity.b.d(cVar, "DROP TABLE IF EXISTS `leaderboard`", "CREATE TABLE IF NOT EXISTS `leaderboard` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `date` TEXT NOT NULL, `userid` INTEGER NOT NULL, `score` INTEGER NOT NULL, `firstname` TEXT NOT NULL, `lastName` TEXT NOT NULL, `imageUrl` TEXT)", "CREATE INDEX IF NOT EXISTS `index_leaderboard_date` ON `leaderboard` (`date`)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class s extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "EcgMeasurement", "deleted", "INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class s0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "Insight", "variables", "TEXT");
            f2.a(cVar, "Insight", "opened", "INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class s1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "Plan", "modified", "INTEGER DEFAULT 0");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class t extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.work.impl.g.c(cVar, "UPDATE `Track` set `manualStartDate` = null where `manualStartDate` = 0", "UPDATE `Track` set `manualEndDate` = null where `manualEndDate` = 0", "UPDATE `Track` set `night_heartrate_info_score` = 0 where `night_heartrate_info_score` IS NULL", "UPDATE `Track` set `night_heartrate_info_status` = 0 where `night_heartrate_info_status` IS NULL");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class t0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "WorkoutLocation", "deviceId", "INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class t1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "leaderboard", "modified", "INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class u extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DROP TABLE IF EXISTS `Section`");
            cVar.l("CREATE TABLE `Section` (`orderId` INTEGER PRIMARY KEY AUTOINCREMENT, `tag` TEXT NOT NULL, `title` TEXT NOT NULL, `subtitle` TEXT NOT NULL, `caption` TEXT NOT NULL, `layoutFormatId` INTEGER, `dataType` INTEGER, `maxItemsCount` INTEGER)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class u0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "Insight", RemoteMessageConst.Notification.PRIORITY, "INTEGER");
            f2.a(cVar, "Insight", "expirationDate", "INTEGER");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class u1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("CREATE INDEX IF NOT EXISTS `index_WorkoutLocation_userId_date` ON `WorkoutLocation` (`userId`, `date`)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class v extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("CREATE TABLE IF NOT EXISTS `Insight` (`id` TEXT PRIMARY KEY NOT NULL,   `userId` INTEGER NOT NULL, `format` TEXT , `emotion` TEXT , `bgcolor` TEXT , `category` TEXT NOT NULL, `title` TEXT, `subtitle` TEXT, `buttonText` TEXT , `buttonUrl` TEXT, `day` INTEGER, `conversation` TEXT, `scenario` TEXT, `synced` INTEGER NOT NULL, `context` TEXT)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class v0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DROP TABLE IF EXISTS `Insight`");
            cVar.l("CREATE TABLE IF NOT EXISTS `Insight` (`crmId` TEXT NOT NULL, `insightId` INTEGER PRIMARY KEY NOT NULL, `conversationId` INTEGER , `userId` INTEGER NOT NULL, `format` TEXT , `emotion` TEXT , `bgcolor` TEXT , `category` TEXT NOT NULL, `title` TEXT, `subtitle` TEXT, `buttonText` TEXT , `buttonUrl` TEXT, `day` INTEGER, `conversation` TEXT, `scenario` TEXT, `synced` INTEGER NOT NULL, `context` TEXT, `read` INTEGER NOT NULL , `archivable` INTEGER, `modified` INTEGER NOT NULL, `created` INTEGER NOT NULL, `deleted` INTEGER NOT NULL DEFAULT 0, `conditions` TEXT, `variables` TEXT, `opened` INTEGER NOT NULL DEFAULT 0, `priority` INTEGER, `expirationDate` INTEGER )");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class v1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.work.impl.g.c(cVar, "CREATE INDEX IF NOT EXISTS `index_Track_userId_day_category_startDate_deleted` ON `Track` (`userId`, `day`, `category`, `startDate`, `deleted`)", "CREATE INDEX IF NOT EXISTS `index_Track_userId_deviceType_startDate` ON `Track` (`userId`, `deviceType`, `startDate`)", "CREATE INDEX IF NOT EXISTS `index_Track_userId_isSyncedToWs` ON `Track` (`userId`, `isSyncedToWs`)", "CREATE INDEX IF NOT EXISTS `index_Track_userId_modifiedDate` ON `Track` (`userId`, `modifiedDate`)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class w extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("CREATE TABLE IF NOT EXISTS `DeviceScreen` ( `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `wsId` INTEGER NOT NULL, `name` TEXT NOT NULL, `deviceId` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `screenSource` INTEGER NOT NULL, `embeddedId` INTEGER, `displayOrder` INTEGER NOT NULL, `active` INTEGER NOT NULL, `displayContext` TEXT NOT NULL, `syncedWithWS` INTEGER NOT NULL, `syncedWithDevice` INTEGER NOT NULL, `modified` INTEGER NOT NULL, `imageType` INTEGER, `imageData` TEXT, `imageHeight` INTEGER, `imageWidth` INTEGER)");
            cVar.l("CREATE TABLE IF NOT EXISTS `DeviceScreenContent` ( `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `deviceId` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `screenWsId` INTEGER NOT NULL, `displayStyle` INTEGER NOT NULL, `message` TEXT NOT NULL, `modified` INTEGER NOT NULL, `startDate` INTEGER, `endDate` INTEGER)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class w0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "DeviceScreen", "images", "TEXT");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class w1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "Section", "defaultNumberIncludedDays", "INTEGER");
            f2.a(cVar, "Section", "maxNumberIncludedDays", "INTEGER");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class x extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DROP TABLE IF EXISTS `Section`");
            cVar.l("CREATE TABLE `Section` (`orderId` INTEGER PRIMARY KEY AUTOINCREMENT, `tag` TEXT NOT NULL, `title` TEXT NOT NULL, `subtitle` TEXT NOT NULL, `caption` TEXT NOT NULL, `layoutFormatId` INTEGER, `dataType` INTEGER, `maxItemsCount` INTEGER)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class x0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DROP TABLE IF EXISTS `Insight`");
            cVar.l("CREATE TABLE IF NOT EXISTS `Insight` (`crmId` TEXT NOT NULL, `insightId` INTEGER PRIMARY KEY, `conversationId` INTEGER , `userId` INTEGER NOT NULL, `format` TEXT , `emotion` TEXT , `bgcolor` TEXT , `category` TEXT NOT NULL, `title` TEXT, `subtitle` TEXT, `buttonText` TEXT , `buttonUrl` TEXT, `day` INTEGER, `conversation` TEXT, `scenario` TEXT, `synced` INTEGER NOT NULL, `context` TEXT, `read` INTEGER NOT NULL , `archivable` INTEGER, `modified` INTEGER NOT NULL, `created` INTEGER NOT NULL, `deleted` INTEGER NOT NULL DEFAULT 0, `conditions` TEXT, `variables` TEXT, `opened` INTEGER NOT NULL DEFAULT 0, `priority` INTEGER, `expirationDate` INTEGER )");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class x1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("CREATE TABLE IF NOT EXISTS `PartnerExchangeLastUpdate` (`partnerConsumerId` INTEGER NOT NULL, `measureType` INTEGER NOT NULL, `exchangeType` INTEGER NOT NULL, `modified` INTEGER NOT NULL, PRIMARY KEY(`partnerConsumerId`, `measureType`, `exchangeType`))");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class y extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "DeviceScreen", "appDependencies", "TEXT NOT NULL DEFAULT ''");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class y0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "Insight", "version", "FLOAT");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class y1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("CREATE TABLE IF NOT EXISTS `PatientSession` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `patientId` TEXT NOT NULL, `startTime` INTEGER NOT NULL, `endTime` INTEGER NOT NULL, `ecgCount` INTEGER NOT NULL, `workoutCount` INTEGER NOT NULL)");
            cVar.l("CREATE INDEX IF NOT EXISTS `index_PatientSession_id_patientId` ON `PatientSession` (`id`, `patientId`)");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class z extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "Insight", "read", "INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class z0 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            f2.a(cVar, "Track", "deviceId", "INTEGER");
        }
    }

    /* compiled from: RoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class z1 extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DELETE FROM `NoteGroup` WHERE `signalId` NOT NULL AND `rowId` NOT IN (SELECT MIN(`rowId`) FROM `NoteGroup` GROUP BY `signalId`)");
            cVar.l("CREATE UNIQUE INDEX IF NOT EXISTS `index_NoteGroup_signalId` ON `NoteGroup` (`signalId`)");
        }
    }
}
