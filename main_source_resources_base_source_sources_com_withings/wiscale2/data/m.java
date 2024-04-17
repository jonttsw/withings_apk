package com.withings.wiscale2.data;
/* compiled from: ProdRoomDb_AutoMigration_91_92_Impl.java */
/* loaded from: classes4.dex */
final class m extends w8.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f50663c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i11) {
        super(91, 92);
        this.f50663c = i11;
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            } else {
                super(98, 99);
                return;
            }
        }
        super(123, 124);
    }

    @Override // w8.b
    public final void a(a9.c cVar) {
        switch (this.f50663c) {
            case 0:
                cVar.l("ALTER TABLE `mission_entity` ADD COLUMN `is_synced` INTEGER NOT NULL DEFAULT false");
                cVar.l("CREATE TABLE IF NOT EXISTS `mission_progression_task` (`task_identifier` INTEGER NOT NULL, `status` INTEGER, `completion_date` INTEGER, PRIMARY KEY(`task_identifier`), FOREIGN KEY(`task_identifier`) REFERENCES `mission_entity`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                return;
            case 1:
                androidx.activity.b.d(cVar, "DROP VIEW BookmarkPreviewView", "CREATE TABLE IF NOT EXISTS `HealthInsight` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `crmId` TEXT NOT NULL, `userId` INTEGER NOT NULL, `objectStructure` TEXT NOT NULL, `objectType` INTEGER NOT NULL, `objectId` INTEGER, `timestamp` INTEGER NOT NULL, `timeToLive` INTEGER, `url` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `created` INTEGER NOT NULL)", "CREATE VIEW `BookmarkPreviewView` AS SELECT bookmark.remoteTaskId, bookmark.isSync, bookmark.isSelected, bookmark.updatedDate, bookmark.type, bookmarkPreview.title as title, bookmarkPreview.access_level as accessLevel, bookmarkPreview.extraHighlightInfo as extraHighlightInfo, bookmarkPreview.thumbnail as thumbnail, bookmarkPreview.capabilities as capabilities FROM bookmark INNER JOIN bookmarkPreview ON bookmark.remoteTaskId = bookmarkPreview.remoteTaskId");
                return;
            default:
                cVar.l("CREATE TABLE IF NOT EXISTS `bookmark` (`remoteTaskId` TEXT NOT NULL, `updatedDate` INTEGER NOT NULL, `isSync` INTEGER NOT NULL, `type` TEXT NOT NULL, `title` TEXT NOT NULL, `extraHighlightInfo` TEXT NOT NULL, `thumbnail` TEXT NOT NULL, `capabilities` TEXT NOT NULL, PRIMARY KEY(`remoteTaskId`))");
                return;
        }
    }
}
