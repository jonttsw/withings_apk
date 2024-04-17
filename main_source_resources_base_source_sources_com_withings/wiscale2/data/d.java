package com.withings.wiscale2.data;
/* compiled from: ProdRoomDb_AutoMigration_81_82_Impl.java */
/* loaded from: classes4.dex */
final class d extends w8.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f50653c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i11) {
        super(81, 82);
        this.f50653c = i11;
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            } else {
                super(89, 90);
                return;
            }
        }
        super(114, 115);
    }

    @Override // w8.b
    public final void a(a9.c cVar) {
        switch (this.f50653c) {
            case 0:
                cVar.l("CREATE TABLE IF NOT EXISTS `Mood` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `user_id` INTEGER NOT NULL, `subjected_id` INTEGER, `mood_level` INTEGER NOT NULL, `date` INTEGER NOT NULL, `is_deleted` INTEGER NOT NULL)");
                return;
            case 1:
                androidx.work.impl.g.c(cVar, "DROP VIEW BookmarkPreviewView", "ALTER TABLE `HealthScore` ADD COLUMN `active_minutes` REAL DEFAULT NULL", "ALTER TABLE `HealthScore` ADD COLUMN `steps` REAL DEFAULT NULL", "ALTER TABLE `HealthScore` ADD COLUMN `body_composition` REAL DEFAULT NULL");
                androidx.work.impl.g.c(cVar, "ALTER TABLE `HealthScore` ADD COLUMN `weight_engagement` REAL DEFAULT NULL", "ALTER TABLE `HealthScore` ADD COLUMN `bmi` REAL DEFAULT NULL", "ALTER TABLE `HealthScore` ADD COLUMN `ecg_engagement` REAL DEFAULT NULL", "ALTER TABLE `HealthScore` ADD COLUMN `vascular_age` REAL DEFAULT NULL");
                androidx.work.impl.g.c(cVar, "ALTER TABLE `HealthScore` ADD COLUMN `night_hr` REAL DEFAULT NULL", "ALTER TABLE `HealthScore` ADD COLUMN `blood_pressure` REAL DEFAULT NULL", "ALTER TABLE `HealthScore` ADD COLUMN `blood_pressure_burden` REAL DEFAULT NULL", "ALTER TABLE `HealthScore` ADD COLUMN `bpm_engagement` REAL DEFAULT NULL");
                androidx.work.impl.g.c(cVar, "ALTER TABLE `HealthScore` ADD COLUMN `ecg_afib` REAL DEFAULT NULL", "ALTER TABLE `HealthScore` ADD COLUMN `afib_burden` REAL DEFAULT NULL", "ALTER TABLE `HealthScore` ADD COLUMN `sleep_apnea_burden` REAL DEFAULT NULL", "ALTER TABLE `HealthScore` ADD COLUMN `sleep_quality` REAL DEFAULT NULL");
                cVar.l("ALTER TABLE `HealthScore` ADD COLUMN `sleep_monitoring` REAL DEFAULT NULL");
                cVar.l("CREATE VIEW `BookmarkPreviewView` AS SELECT bookmark.remoteTaskId, bookmark.isSync, bookmark.isSelected, bookmark.updatedDate, bookmark.type, bookmarkPreview.title as title, bookmarkPreview.extraHighlightInfo as extraHighlightInfo, bookmarkPreview.thumbnail as thumbnail, bookmarkPreview.capabilities as capabilities FROM bookmark INNER JOIN bookmarkPreview ON bookmark.remoteTaskId = bookmarkPreview.remoteTaskId");
                return;
            default:
                cVar.l("CREATE TABLE IF NOT EXISTS `mission_entity` (`id` INTEGER NOT NULL, `date` INTEGER NOT NULL, `completed` INTEGER NOT NULL, `type` TEXT NOT NULL, `title` TEXT NOT NULL, `details` TEXT, `thumbnail` TEXT, `goal` TEXT, `crmid` TEXT, `completionDate` INTEGER, `updatedDate` INTEGER, PRIMARY KEY(`id`))");
                return;
        }
    }
}
