package com.withings.wiscale2.data;
/* compiled from: ProdRoomDb_AutoMigration_94_95_Impl.java */
/* loaded from: classes4.dex */
final class p extends w8.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f50666c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i11) {
        super(94, 95);
        this.f50666c = i11;
        if (i11 != 1) {
        } else {
            super(78, 79);
        }
    }

    @Override // w8.b
    public final void a(a9.c cVar) {
        switch (this.f50666c) {
            case 0:
                androidx.work.impl.g.c(cVar, "ALTER TABLE `PartnerExchangeLastUpdate` ADD COLUMN `changeToken` TEXT DEFAULT NULL", "ALTER TABLE `wifit_task` ADD COLUMN `program_lastupdate` INTEGER DEFAULT NULL", "ALTER TABLE `wifit_task` ADD COLUMN `goal` REAL DEFAULT NULL", "ALTER TABLE `mission_entity` ADD COLUMN `remote_program_task_id` TEXT DEFAULT NULL");
                androidx.activity.b.d(cVar, "ALTER TABLE `mission_entity` ADD COLUMN `remote_task_id` TEXT NOT NULL DEFAULT ''", "CREATE TABLE IF NOT EXISTS `bookmark` (`remoteTaskId` TEXT NOT NULL, `isSync` INTEGER NOT NULL, `isSelected` INTEGER NOT NULL, `updatedDate` INTEGER NOT NULL, PRIMARY KEY(`remoteTaskId`))", "CREATE TABLE IF NOT EXISTS `bookmarkPreview` (`remoteTaskId` TEXT NOT NULL, `updatedDate` INTEGER NOT NULL, `isSync` INTEGER NOT NULL, `type` TEXT NOT NULL, `title` TEXT NOT NULL, `extraHighlightInfo` TEXT NOT NULL, `thumbnail` TEXT NOT NULL, `capabilities` TEXT NOT NULL, PRIMARY KEY(`remoteTaskId`), FOREIGN KEY(`remoteTaskId`) REFERENCES `bookmark`(`remoteTaskId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                return;
            default:
                androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `_new_HealthAttributes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `web_service_id` INTEGER, `user_id` INTEGER, `type` INTEGER NOT NULL, `name` TEXT, `key_name` TEXT, `key_description` TEXT, `default_description` TEXT NOT NULL DEFAULT '', `server_modification` INTEGER, `deleted` INTEGER NOT NULL, `min_age` INTEGER, `max_age` INTEGER)", "INSERT INTO `_new_HealthAttributes` (`id`,`web_service_id`,`user_id`,`type`,`name`,`key_name`,`key_description`,`default_description`,`server_modification`,`deleted`,`min_age`,`max_age`) SELECT `id`,`web_service_id`,`user_id`,`type`,`name`,`key_name`,`key_description`,`default_description`,`server_modification`,`deleted`,`min_age`,`max_age` FROM `HealthAttributes`", "DROP TABLE `HealthAttributes`", "ALTER TABLE `_new_HealthAttributes` RENAME TO `HealthAttributes`");
                return;
        }
    }
}
