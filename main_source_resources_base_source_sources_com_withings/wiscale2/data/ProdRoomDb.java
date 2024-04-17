package com.withings.wiscale2.data;

import android.content.Context;
import androidx.room.RoomDatabase;
import com.withings.clinicalstudy.repository.PatientSessionDao;
import com.withings.ecg.model.HeartSignalDao;
import com.withings.factor.local.dao.FactorDao;
import com.withings.features.platform.model.PlatformFeatureDao;
import com.withings.leaderboard.repositories.data.LeaderboardDAO;
import com.withings.location.repository.data.db.RoomGpsLocationDao;
import com.withings.manualLogging.data.webservice.healthAttribute.WebServiceHealthAttribute;
import com.withings.note.model.NoteGroupDao;
import com.withings.prediction.local.dao.PredictionDao;
import com.withings.screen.repository.data.db.DeviceScreenContentDao;
import com.withings.screen.repository.data.db.DeviceScreenDao;
import com.withings.screen.repository.data.db.DeviceScreensGroupDao;
import com.withings.target.data.TargetDAO;
import com.withings.wiscale2.food.model.MealDao;
import com.withings.wiscale2.food.model.MealNameDao;
import kotlin.Metadata;
import lj0.l0;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
/* compiled from: ProdRoomDb.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/data/ProdRoomDb;", "Landroidx/room/RoomDatabase;", "<init>", "()V", XHTMLText.Q, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class ProdRoomDb extends RoomDatabase {

    /* renamed from: m  reason: collision with root package name */
    private static ProdRoomDb f50612m;

    /* renamed from: n  reason: collision with root package name */
    private static final j f50613n = new w8.b(74, 75);

    /* renamed from: o  reason: collision with root package name */
    private static final k f50614o = new w8.b(75, 76);

    /* renamed from: p  reason: collision with root package name */
    private static final l f50615p = new w8.b(86, 87);

    /* renamed from: q  reason: collision with root package name */
    private static final m f50616q = new w8.b(95, 96);

    /* renamed from: r  reason: collision with root package name */
    private static final n f50617r = new w8.b(96, 97);

    /* renamed from: s  reason: collision with root package name */
    private static final o f50618s = new w8.b(97, 98);

    /* renamed from: t  reason: collision with root package name */
    private static final p f50619t = new w8.b(98, 99);

    /* renamed from: u  reason: collision with root package name */
    private static final a f50620u = new w8.b(100, 101);

    /* renamed from: v  reason: collision with root package name */
    private static final b f50621v = new w8.b(101, 102);

    /* renamed from: w  reason: collision with root package name */
    private static final c f50622w = new w8.b(102, 103);

    /* renamed from: x  reason: collision with root package name */
    private static final d f50623x = new w8.b(103, 104);

    /* renamed from: y  reason: collision with root package name */
    private static final e f50624y = new w8.b(104, 105);

    /* renamed from: z  reason: collision with root package name */
    private static final f f50625z = new w8.b(105, 106);
    private static final g A = new w8.b(106, 107);
    private static final h B = new w8.b(107, 108);
    private static final i C = new w8.b(108, 109);

    /* compiled from: ProdRoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class a extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DROP TABLE IF EXISTS `mission_task_preview`");
            cVar.l("CREATE TABLE IF NOT EXISTS `mission_task_preview` (`id` INTEGER NOT NULL, `date` INTEGER NOT NULL, `completed` INTEGER NOT NULL, `type` TEXT NOT NULL, `title` TEXT NOT NULL, `extraHighlightInfo` TEXT DEFAULT NULL, `thumbnail` TEXT, `goal` TEXT, `crmid` TEXT, `completionDate` INTEGER, `updatedDate` INTEGER, `is_synced` INTEGER NOT NULL DEFAULT false, `capabilities` TEXT, `remote_program_task_id` TEXT, `remote_task_id` TEXT NOT NULL DEFAULT '', `status` INTEGER, `metadata` TEXT, `measureType` INTEGER, PRIMARY KEY(`id`))");
        }
    }

    /* compiled from: ProdRoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class b extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DELETE FROM `program`");
        }
    }

    /* compiled from: ProdRoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class c extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.work.impl.g.c(cVar, "DROP TABLE IF EXISTS libraryPreviewContentWithFilter", "DROP TABLE IF EXISTS libraryPreviewContent", "DROP TABLE IF EXISTS healthScore", "CREATE TABLE IF NOT EXISTS `libraryPreviewContent` (`contentId` TEXT NOT NULL, `taskType` TEXT NOT NULL, `title` TEXT NOT NULL, `thumbnail` TEXT NOT NULL, `capabilities` TEXT NOT NULL, `extraHighlightInfo` TEXT NOT NULL, PRIMARY KEY(`contentId`))");
            cVar.l("CREATE TABLE IF NOT EXISTS `libraryPreviewContentWithFilter` (`contentId` TEXT NOT NULL, `filterId` INTEGER NOT NULL, PRIMARY KEY(`contentId`, `filterId`), FOREIGN KEY(`filterId`) REFERENCES `libraryFilter`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`contentId`) REFERENCES `libraryPreviewContent`(`contentId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            cVar.l("CREATE TABLE IF NOT EXISTS `HealthScore` (`day` TEXT NOT NULL, `user_id` INTEGER NOT NULL, `last_modified` INTEGER NOT NULL, `global` REAL NOT NULL, `activity` REAL, `active_minutes` REAL, `steps` REAL, `body` REAL, `body_composition` REAL, `weight_engagement` REAL, `bmi` REAL, `heart` REAL, `ecg_engagement` REAL, `vascular_age` REAL, `night_hr` REAL, `blood_pressure` REAL, `blood_pressure_burden` REAL, `bpm_engagement` REAL, `ecg_afib` REAL, `afib_burden` REAL, `sleep` REAL, `sleep_apnea_burden` REAL, `sleep_quality` REAL, `sleep_monitoring` REAL, `synced` INTEGER NOT NULL, PRIMARY KEY(`day`, `user_id`))");
            m0.t.c(cVar, "program_task_preview", "currentlySwapped", "INTEGER NOT NULL DEFAULT false");
            m0.t.c(cVar, "mission_task_preview", "currentlySwapped", "INTEGER NOT NULL DEFAULT false");
        }
    }

    /* compiled from: ProdRoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class d extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DROP TABLE IF EXISTS HealthScore");
            cVar.l("CREATE TABLE IF NOT EXISTS `HealthScore` (`day` TEXT NOT NULL, `user_id` INTEGER NOT NULL, `last_modified` INTEGER NOT NULL, `global` REAL NOT NULL, `activity` REAL, `active_minutes` REAL, `steps` REAL, `body` REAL, `body_composition` REAL, `weight_engagement` REAL, `bmi` REAL, `heart` REAL, `ecg_engagement` REAL, `vascular_age` REAL, `night_hr` REAL, `blood_pressure` REAL, `blood_pressure_burden` REAL, `bpm_engagement` REAL, `ecg_afib` REAL, `afib_burden` REAL, `sleep` REAL, `sleep_apnea_burden` REAL, `sleep_quality` REAL, `sleep_monitoring` REAL, `algo` INTEGER NOT NULL DEFAULT 0, `synced` INTEGER NOT NULL, `valid` INTEGER NOT NULL DEFAULT true, PRIMARY KEY(`day`, `user_id`))");
        }
    }

    /* compiled from: ProdRoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class e extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            m0.t.c(cVar, "program_task_preview", "measureType", "INTEGER");
            m0.t.c(cVar, "HealthAttributes", "category", "TEXT DEFAULT NULL");
            m0.t.c(cVar, "HealthAttributes", WebServiceHealthAttribute.FIELD_SUBCATEGORY_NAME, "TEXT DEFAULT NULL");
            m0.t.c(cVar, "HealthAttributes", WebServiceHealthAttribute.FIELD_ASSET_NAME, "TEXT DEFAULT NULL");
            m0.t.c(cVar, "program", "is_suggested", "INTEGER NOT NULL DEFAULT false");
            m0.t.c(cVar, "libraryPreviewContent", "isSuggested", "INTEGER NOT NULL DEFAULT false");
            m0.t.c(cVar, "Section", "minAppVersion", "TEXT");
            m0.t.c(cVar, "Section", "maxAppVersion", "TEXT");
            cVar.l("CREATE TABLE IF NOT EXISTS `prediction` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `wsId` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `type` INTEGER NOT NULL, `start` INTEGER NOT NULL, `end` INTEGER NOT NULL, `active` INTEGER NOT NULL, `created` INTEGER NOT NULL, `modified` INTEGER NOT NULL)");
        }
    }

    /* compiled from: ProdRoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class f extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            m0.t.c(cVar, "program", "access_level", "INTEGER NOT NULL DEFAULT 0");
            m0.t.c(cVar, "bookmarkPreview", "access_level", "INTEGER NOT NULL DEFAULT 0");
            m0.t.c(cVar, "libraryPreviewContent", "access_level", "INTEGER NOT NULL DEFAULT 0");
            cVar.l("DROP VIEW IF EXISTS `BookmarkPreviewView`");
            cVar.l("CREATE VIEW `BookmarkPreviewView` AS SELECT bookmark.remoteTaskId, bookmark.isSync, bookmark.isSelected, bookmark.updatedDate, bookmark.type, bookmarkPreview.title as title, bookmarkPreview.access_level as accessLevel, bookmarkPreview.extraHighlightInfo as extraHighlightInfo, bookmarkPreview.thumbnail as thumbnail, bookmarkPreview.capabilities as capabilities FROM bookmark INNER JOIN bookmarkPreview ON bookmark.remoteTaskId = bookmarkPreview.remoteTaskId");
        }
    }

    /* compiled from: ProdRoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class g extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DROP TABLE IF EXISTS `prediction`");
            cVar.l("CREATE TABLE `prediction` (`wsId` INTEGER PRIMARY KEY NOT NULL, `userId` INTEGER NOT NULL, `type` INTEGER NOT NULL, `start` INTEGER NOT NULL, `end` INTEGER NOT NULL, `active` INTEGER NOT NULL, `created` INTEGER NOT NULL, `modified` INTEGER NOT NULL)");
        }
    }

    /* compiled from: ProdRoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class h extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.activity.b.d(cVar, "CREATE TABLE IF NOT EXISTS `HealthInsight` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `crm_id` TEXT NOT NULL, `user_id` INTEGER NOT NULL, `object_structure` TEXT NOT NULL, `object_type` INTEGER NOT NULL, `object_id` INTEGER, `timestamp` INTEGER NOT NULL, `time_to_live` INTEGER NOT NULL, `expiration_date` INTEGER NOT NULL, `url` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `created` INTEGER NOT NULL)", "CREATE TABLE IF NOT EXISTS `factor` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `wsId` INTEGER, `userId` INTEGER NOT NULL, `type` INTEGER NOT NULL, `start` INTEGER NOT NULL, `end` INTEGER, `numberOfPills` INTEGER, `deleted` INTEGER, `deletionDate` INTEGER, `created` INTEGER NOT NULL, `modified` INTEGER NOT NULL)", "DROP TABLE IF EXISTS `Section`");
        }
    }

    /* compiled from: ProdRoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class i extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            m0.t.c(cVar, "libraryPreviewContent", "event_info", "TEXT NOT NULL DEFAULT '[]'");
        }
    }

    /* compiled from: ProdRoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class j extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("DELETE FROM `NoteGroup` WHERE `signalId` NOT NULL AND `rowId` NOT IN (SELECT MIN(`rowId`) FROM `NoteGroup` GROUP BY `signalId`)");
            cVar.l("CREATE UNIQUE INDEX IF NOT EXISTS `index_NoteGroup_signalId` ON `NoteGroup` (`signalId`)");
        }
    }

    /* compiled from: ProdRoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class k extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `Target` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `wsId` INTEGER, `userId` INTEGER NOT NULL, `type` INTEGER NOT NULL, `measureType` INTEGER NOT NULL, `range` INTEGER NOT NULL, `mantissa` INTEGER NOT NULL, `exponent` INTEGER NOT NULL, `isActive` INTEGER NOT NULL, `deactivated` INTEGER, `created` INTEGER NOT NULL, `modified` INTEGER NOT NULL, `date` INTEGER NOT NULL, `isSyncedWithApi` INTEGER NOT NULL)", "CREATE INDEX IF NOT EXISTS `index_Target_userId_isActive` ON `Target` (`userId`, `isActive`)", "CREATE INDEX IF NOT EXISTS `index_Target_userId_isSyncedWithApi` ON `Target` (`userId`, `isSyncedWithApi`)", "CREATE INDEX IF NOT EXISTS `index_Target_userId_type_measureType` ON `Target` (`userId`, `type`, `measureType`)");
        }
    }

    /* compiled from: ProdRoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class l extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.work.impl.g.c(cVar, "DROP TABLE IF EXISTS `wifit_task`", "DROP TABLE IF EXISTS `wifit_progression_task`", "CREATE TABLE IF NOT EXISTS `wifit_task` (`task_identifier` TEXT NOT NULL, `identifier` TEXT NOT NULL, `type` TEXT, `title` TEXT, `thumbnail` TEXT, `required` INTEGER, `tags_list` TEXT, `data` TEXT, `week_index` INTEGER, `week_label` TEXT, `day_index` INTEGER, `day_label` TEXT, `task_index` INTEGER, `program_id` INTEGER NOT NULL, `instance_id` INTEGER NOT NULL, `is_synced` INTEGER NOT NULL, PRIMARY KEY(`task_identifier`))", "CREATE TABLE IF NOT EXISTS `wifit_progression_task` (`task_identifier` TEXT NOT NULL, `status` INTEGER, `completion_date` INTEGER, PRIMARY KEY(`task_identifier`), FOREIGN KEY(`task_identifier`) REFERENCES `wifit_task`(`task_identifier`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        }
    }

    /* compiled from: ProdRoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class m extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.work.impl.g.c(cVar, "DROP TABLE IF EXISTS `bookmarkPreview`", "DROP TABLE IF EXISTS `bookmark`", "CREATE TABLE IF NOT EXISTS `bookmark` (`isSelected` INTEGER NOT NULL, `updatedDate` INTEGER NOT NULL, `type` TEXT NOT NULL, `remoteTaskId` TEXT NOT NULL, `isSync` INTEGER NOT NULL, PRIMARY KEY(`remoteTaskId`))", "CREATE TABLE IF NOT EXISTS `bookmarkPreview` (`remoteTaskId` TEXT NOT NULL, `title` TEXT NOT NULL, `thumbnail` TEXT NOT NULL, `extraHighlightInfo` TEXT NOT NULL, `capabilities` TEXT NOT NULL, PRIMARY KEY(`remoteTaskId`), FOREIGN KEY(`remoteTaskId`) REFERENCES `bookmark`(`remoteTaskId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            cVar.l("CREATE VIEW `BookmarkPreviewView` AS SELECT bookmark.remoteTaskId, bookmark.isSync, bookmark.isSelected, bookmark.updatedDate, bookmark.type, bookmarkPreview.title as title, bookmarkPreview.extraHighlightInfo as extraHighlightInfo, bookmarkPreview.thumbnail as thumbnail, bookmarkPreview.capabilities as capabilities FROM bookmark INNER JOIN bookmarkPreview ON bookmark.remoteTaskId = bookmarkPreview.remoteTaskId");
        }
    }

    /* compiled from: ProdRoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class n extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            androidx.work.impl.g.c(cVar, "DELETE FROM wifit_task", "ALTER TABLE wifit_task ADD measureType INT", "CREATE TABLE IF NOT EXISTS `program_task_preview` (`task_identifier` TEXT NOT NULL, `identifier` TEXT NOT NULL, `type` TEXT, `title` TEXT, `thumbnail` TEXT, `required` INTEGER, `tags_list` TEXT, `week_index` INTEGER, `week_label` TEXT, `day_index` INTEGER, `day_label` TEXT, `task_index` INTEGER, `program_id` INTEGER NOT NULL, `instance_id` INTEGER NOT NULL, `is_synced` INTEGER NOT NULL, `measureType` INTEGER, `status` INTEGER, `goal` FLOAT, `completion_date` INTEGER, `program_lastupdate` INTEGER,PRIMARY KEY(`task_identifier`))", "DROP TABLE IF EXISTS `wifit_task`");
            androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `mission_task_preview` (`id` INTEGER NOT NULL, `date` INTEGER NOT NULL, `thumbnail` TEXT, `title` TEXT NOT NULL, `capabilities` TEXT, `goal` TEXT, `remote_task_id` TEXT NOT NULL DEFAULT '', `completed` INTEGER NOT NULL, `updatedDate` INTEGER, `type` TEXT NOT NULL, `is_synced` INTEGER NOT NULL DEFAULT false, `crmid` TEXT, `remote_program_task_id` TEXT, `completionDate` INTEGER, `extraHighlightInfo` TEXT DEFAULT NULL, `status` INTEGER,PRIMARY KEY(`id`))", "DROP TABLE IF EXISTS `wifit_progression_task`", "DROP TABLE IF EXISTS `mission_progression_task`", "UPDATE program_enrolled SET modified = 0");
            cVar.l("CREATE TABLE IF NOT EXISTS `task_content` (`contentId` TEXT NOT NULL, `relatedProgramId` INTEGER NOT NULL DEFAULT -1, `content` TEXT NOT NULL, `lastUpdate` INTEGER NOT NULL, PRIMARY KEY(`contentId`, `relatedProgramId`))");
            cVar.l("CREATE TABLE IF NOT EXISTS `ActirecCategoryDetection` (`userId` INTEGER NOT NULL, `workoutCategory` INTEGER NOT NULL, `enabled` INTEGER NOT NULL, PRIMARY KEY(`userId`, `workoutCategory`))");
            try {
                cVar.l("ALTER TABLE IF EXISTS DeviceScreensGroup RENAME TO DeviceScreensGroupOld");
            } catch (Exception unused) {
                cVar.l("CREATE TABLE IF NOT EXISTS `DeviceScreensGroup` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `modified` INTEGER NOT NULL, `deviceId` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, `rank` INTEGER NOT NULL, PRIMARY KEY(`id`, `deviceId`))");
                cVar.l("ALTER TABLE DeviceScreensGroup RENAME TO DeviceScreensGroupOld");
            }
            androidx.activity.b.d(cVar, "CREATE TABLE IF NOT EXISTS `DeviceScreensGroup` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `modified` INTEGER NOT NULL, `deviceId` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, `rank` INTEGER NOT NULL, PRIMARY KEY(`id`, `deviceId`))", "INSERT INTO DeviceScreensGroup(id, name, modified, deviceId, deleted, rank)\nSELECT DeviceScreensGroupOld.id, DeviceScreensGroupOld.name, DeviceScreensGroupOld.modified, DeviceScreensGroupOld.deviceId, DeviceScreensGroupOld.deleted, DeviceScreensGroupOld.id\nFROM DeviceScreensGroupOld", "DROP TABLE DeviceScreensGroupOld");
        }
    }

    /* compiled from: ProdRoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class o extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("CREATE TABLE IF NOT EXISTS `HealthScore` (`day` TEXT NOT NULL, `user_id` INTEGER NOT NULL, `last_modified` INTEGER NOT NULL, `global` REAL NOT NULL, `activity` REAL, `body` REAL, `heart` REAL, `sleep` REAL, `synced` INTEGER NOT NULL, PRIMARY KEY(`day`, `user_id`))");
        }
    }

    /* compiled from: ProdRoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class p extends w8.b {
        @Override // w8.b
        public final void a(a9.c cVar) {
            cVar.l("ALTER TABLE program_task_preview ADD `metadata` TEXT");
            cVar.l("ALTER TABLE mission_task_preview ADD `metadata` TEXT");
        }
    }

    /* compiled from: ProdRoomDb.kt */
    /* loaded from: classes4.dex */
    public static final class q {
        public static ProdRoomDb a(Context context) {
            kotlin.jvm.internal.u.j(context, "context");
            if (ProdRoomDb.f50612m == null) {
                Context applicationContext = context.getApplicationContext();
                kotlin.jvm.internal.u.i(applicationContext, "getApplicationContext(...)");
                RoomDatabase.a a11 = androidx.room.z.a(applicationContext, ProdRoomDb.class, "room-healthmate.db");
                a11.b(ProdRoomDb.f50613n);
                a11.b(ProdRoomDb.f50614o);
                a11.b(ProdRoomDb.f50615p);
                a11.b(ProdRoomDb.f50616q);
                a11.b(ProdRoomDb.f50617r);
                a11.b(ProdRoomDb.f50618s);
                a11.b(ProdRoomDb.f50619t);
                a11.b(ProdRoomDb.f50620u);
                a11.b(ProdRoomDb.f50621v);
                a11.b(ProdRoomDb.f50622w);
                a11.b(ProdRoomDb.f50623x);
                a11.b(ProdRoomDb.f50624y);
                a11.b(ProdRoomDb.f50625z);
                a11.b(ProdRoomDb.A);
                a11.b(ProdRoomDb.B);
                a11.b(ProdRoomDb.C);
                a11.e();
                ProdRoomDb.f50612m = (ProdRoomDb) a11.d();
            }
            ProdRoomDb prodRoomDb = ProdRoomDb.f50612m;
            kotlin.jvm.internal.u.g(prodRoomDb);
            return prodRoomDb;
        }
    }

    public abstract a30.o A0();

    public abstract a30.q B0();

    public abstract ei0.m C0();

    public abstract TargetDAO D0();

    public abstract f60.a E0();

    public abstract bj0.f F0();

    public abstract l0 G0();

    public abstract com.withings.device.details.automatic.activity.detection.b T();

    public abstract pl.a U();

    public abstract DeviceScreenContentDao V();

    public abstract DeviceScreenDao W();

    public abstract DeviceScreensGroupDao X();

    public abstract HeartSignalDao Y();

    public abstract a30.a Z();

    public abstract yb0.a a0();

    public abstract FactorDao b0();

    public abstract mr.a c0();

    public abstract RoomGpsLocationDao d0();

    public abstract mx.a e0();

    public abstract fw.a f0();

    public abstract bv.a g0();

    public abstract gt.a h0();

    public abstract yf.g i0();

    public abstract fw.c j0();

    public abstract LeaderboardDAO k0();

    public abstract MealDao l0();

    public abstract MealNameDao m0();

    public abstract tz.a n0();

    public abstract lx.a o0();

    public abstract nx.b p0();

    public abstract NoteGroupDao q0();

    public abstract u10.x r0();

    public abstract PatientSessionDao s0();

    public abstract i20.a t0();

    public abstract PlatformFeatureDao u0();

    public abstract PredictionDao v0();

    public abstract a30.d w0();

    public abstract a30.f x0();

    public abstract a30.j y0();

    public abstract a30.l z0();
}
