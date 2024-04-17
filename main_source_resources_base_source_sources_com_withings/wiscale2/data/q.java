package com.withings.wiscale2.data;
/* compiled from: ProdRoomDb_AutoMigration_99_100_Impl.java */
/* loaded from: classes4.dex */
final class q extends w8.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f50667c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i11) {
        super(99, 100);
        this.f50667c = i11;
        if (i11 != 1) {
        } else {
            super(79, 80);
        }
    }

    @Override // w8.b
    public final void a(a9.c cVar) {
        switch (this.f50667c) {
            case 0:
                androidx.work.impl.g.c(cVar, "DROP VIEW BookmarkPreviewView", "ALTER TABLE `mission_task_preview` ADD COLUMN `measureType` INTEGER DEFAULT NULL", "CREATE TABLE IF NOT EXISTS `libraryFilter` (`id` INTEGER NOT NULL, `label` TEXT NOT NULL, `taskType` TEXT NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `libraryPreviewContent` (`contentId` TEXT NOT NULL, `taskType` TEXT NOT NULL, `title` TEXT NOT NULL, `thumbnail` TEXT NOT NULL, `capabilities` TEXT NOT NULL, PRIMARY KEY(`contentId`))");
                cVar.l("CREATE TABLE IF NOT EXISTS `libraryPreviewContentWithFilter` (`contentId` TEXT NOT NULL, `filterId` INTEGER NOT NULL, PRIMARY KEY(`contentId`, `filterId`), FOREIGN KEY(`filterId`) REFERENCES `libraryFilter`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`contentId`) REFERENCES `libraryPreviewContent`(`contentId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                cVar.l("CREATE VIEW `BookmarkPreviewView` AS SELECT bookmark.remoteTaskId, bookmark.isSync, bookmark.isSelected, bookmark.updatedDate, bookmark.type, bookmarkPreview.title as title, bookmarkPreview.extraHighlightInfo as extraHighlightInfo, bookmarkPreview.thumbnail as thumbnail, bookmarkPreview.capabilities as capabilities FROM bookmark INNER JOIN bookmarkPreview ON bookmark.remoteTaskId = bookmarkPreview.remoteTaskId");
                return;
            default:
                androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `_new_HealthAttributes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `web_service_id` INTEGER, `user_id` INTEGER, `type` INTEGER NOT NULL, `name` TEXT, `key_name` TEXT, `key_description` TEXT, `default_description` TEXT, `server_modification` INTEGER, `deleted` INTEGER NOT NULL, `min_age` INTEGER, `max_age` INTEGER)", "INSERT INTO `_new_HealthAttributes` (`id`,`web_service_id`,`user_id`,`type`,`name`,`key_name`,`key_description`,`default_description`,`server_modification`,`deleted`,`min_age`,`max_age`) SELECT `id`,`web_service_id`,`user_id`,`type`,`name`,`key_name`,`key_description`,`default_description`,`server_modification`,`deleted`,`min_age`,`max_age` FROM `HealthAttributes`", "DROP TABLE `HealthAttributes`", "ALTER TABLE `_new_HealthAttributes` RENAME TO `HealthAttributes`");
                return;
        }
    }
}
