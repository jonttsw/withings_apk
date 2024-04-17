package com.withings.wiscale2.data;
/* compiled from: ProdRoomDb_AutoMigration_79_80_Impl.java */
/* loaded from: classes4.dex */
final class b extends w8.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f50650c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i11) {
        super(79, 80);
        this.f50650c = i11;
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            } else {
                super(87, 88);
                return;
            }
        }
        super(111, 112);
    }

    @Override // w8.b
    public final void a(a9.c cVar) {
        switch (this.f50650c) {
            case 0:
                androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `_new_HealthAttributes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `web_service_id` INTEGER, `user_id` INTEGER, `type` INTEGER NOT NULL, `name` TEXT, `key_name` TEXT, `key_description` TEXT, `default_description` TEXT, `server_modification` INTEGER, `deleted` INTEGER NOT NULL, `min_age` INTEGER, `max_age` INTEGER)", "INSERT INTO `_new_HealthAttributes` (`id`,`web_service_id`,`user_id`,`type`,`name`,`key_name`,`key_description`,`default_description`,`server_modification`,`deleted`,`min_age`,`max_age`) SELECT `id`,`web_service_id`,`user_id`,`type`,`name`,`key_name`,`key_description`,`default_description`,`server_modification`,`deleted`,`min_age`,`max_age` FROM `HealthAttributes`", "DROP TABLE `HealthAttributes`", "ALTER TABLE `_new_HealthAttributes` RENAME TO `HealthAttributes`");
                return;
            case 1:
                androidx.activity.b.d(cVar, "DROP VIEW BookmarkPreviewView", "ALTER TABLE `mission_task_preview` ADD COLUMN `measureType` INTEGER DEFAULT NULL", "CREATE VIEW `BookmarkPreviewView` AS SELECT bookmark.remoteTaskId, bookmark.isSync, bookmark.isSelected, bookmark.updatedDate, bookmark.type, bookmarkPreview.title as title, bookmarkPreview.extraHighlightInfo as extraHighlightInfo, bookmarkPreview.thumbnail as thumbnail, bookmarkPreview.capabilities as capabilities FROM bookmark INNER JOIN bookmarkPreview ON bookmark.remoteTaskId = bookmarkPreview.remoteTaskId");
                return;
            default:
                cVar.l("CREATE TABLE IF NOT EXISTS `HealthmateSessionData` (`accountId` INTEGER NOT NULL, `sessionId` TEXT NOT NULL, `providerToken` TEXT NOT NULL, `authToken` TEXT NOT NULL, `isSecured` INTEGER NOT NULL, `requireSecure` INTEGER NOT NULL, `expirationTimestamp` INTEGER NOT NULL, `providerType` TEXT NOT NULL, `serverUrl` TEXT NOT NULL, `inappviewUrl` TEXT NOT NULL, `maintUrl` TEXT NOT NULL, `accountUrl` TEXT NOT NULL, `cookieDomain` TEXT NOT NULL, `cookieName` TEXT NOT NULL, `sessionType` TEXT NOT NULL, PRIMARY KEY(`accountId`))");
                return;
        }
    }
}
