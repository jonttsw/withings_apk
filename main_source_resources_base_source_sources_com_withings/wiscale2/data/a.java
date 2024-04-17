package com.withings.wiscale2.data;
/* compiled from: ProdRoomDb_AutoMigration_78_79_Impl.java */
/* loaded from: classes4.dex */
final class a extends w8.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f50649c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i11) {
        super(78, 79);
        this.f50649c = i11;
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            } else {
                super(85, 86);
                return;
            }
        }
        super(110, 111);
    }

    @Override // w8.b
    public final void a(a9.c cVar) {
        switch (this.f50649c) {
            case 0:
                androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `_new_HealthAttributes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `web_service_id` INTEGER, `user_id` INTEGER, `type` INTEGER NOT NULL, `name` TEXT, `key_name` TEXT, `key_description` TEXT, `default_description` TEXT NOT NULL DEFAULT '', `server_modification` INTEGER, `deleted` INTEGER NOT NULL, `min_age` INTEGER, `max_age` INTEGER)", "INSERT INTO `_new_HealthAttributes` (`id`,`web_service_id`,`user_id`,`type`,`name`,`key_name`,`key_description`,`default_description`,`server_modification`,`deleted`,`min_age`,`max_age`) SELECT `id`,`web_service_id`,`user_id`,`type`,`name`,`key_name`,`key_description`,`default_description`,`server_modification`,`deleted`,`min_age`,`max_age` FROM `HealthAttributes`", "DROP TABLE `HealthAttributes`", "ALTER TABLE `_new_HealthAttributes` RENAME TO `HealthAttributes`");
                return;
            case 1:
                cVar.l("DROP VIEW BookmarkPreviewView");
                cVar.l("CREATE VIEW `BookmarkPreviewView` AS SELECT bookmark.remoteTaskId, bookmark.isSync, bookmark.isSelected, bookmark.updatedDate, bookmark.type, bookmarkPreview.title as title, bookmarkPreview.extraHighlightInfo as extraHighlightInfo, bookmarkPreview.thumbnail as thumbnail, bookmarkPreview.capabilities as capabilities FROM bookmark INNER JOIN bookmarkPreview ON bookmark.remoteTaskId = bookmarkPreview.remoteTaskId");
                return;
            default:
                androidx.work.impl.g.c(cVar, "ALTER TABLE `WorkoutLocation` ADD COLUMN `speedAccuracy` REAL NOT NULL DEFAULT 0", "ALTER TABLE `WorkoutLocation` ADD COLUMN `course` REAL NOT NULL DEFAULT 0", "ALTER TABLE `WorkoutLocation` ADD COLUMN `courseAccuracy` REAL NOT NULL DEFAULT 0", "CREATE TABLE IF NOT EXISTS `wifit_task` (`task_identifier` TEXT NOT NULL, `identifier` TEXT NOT NULL, `type` TEXT, `title` TEXT, `thumbnail` TEXT, `required` INTEGER, `tags_list` TEXT, `data` TEXT, `week_index` INTEGER, `week_label` TEXT, `day_index` INTEGER, `day_label` TEXT, `task_index` INTEGER, PRIMARY KEY(`task_identifier`))");
                androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `wifit_progression_task` (`task_identifier` TEXT NOT NULL, `status` INTEGER NOT NULL, `completion_date` INTEGER, PRIMARY KEY(`task_identifier`))", "CREATE TABLE IF NOT EXISTS `_new_wifit_program` (`programid` INTEGER NOT NULL, `target_type` INTEGER NOT NULL, `target_value` TEXT, `created` TEXT, `modified` TEXT, `visible` INTEGER NOT NULL, `identifier` TEXT, `title` TEXT, `subtitle` TEXT, `thumbnail` TEXT, `description` TEXT, `category_identifier` TEXT, `category_title` TEXT, `category_icon_id` TEXT, `tags_list` TEXT, PRIMARY KEY(`programid`))", "INSERT INTO `_new_wifit_program` (`programid`,`target_type`,`target_value`,`created`,`modified`,`visible`,`identifier`,`title`,`subtitle`,`thumbnail`,`category_identifier`,`category_title`,`category_icon_id`) SELECT `programid`,`target_type`,`target_value`,`created`,`modified`,`visible`,`identifier`,`title`,`subtitle`,`thumbnail`,`category_identifier`,`category_title`,`category_icon_id` FROM `wifit_program`", "DROP TABLE `wifit_program`");
                cVar.l("ALTER TABLE `_new_wifit_program` RENAME TO `wifit_program`");
                return;
        }
    }
}
