package com.withings.wiscale2.data;
/* compiled from: ProdRoomDb_AutoMigration_89_90_Impl.java */
/* loaded from: classes4.dex */
final class k extends w8.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f50661c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i11) {
        super(89, 90);
        this.f50661c = i11;
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            } else {
                super(96, 97);
                return;
            }
        }
        super(121, 122);
    }

    @Override // w8.b
    public final void a(a9.c cVar) {
        switch (this.f50661c) {
            case 0:
                cVar.l("CREATE TABLE IF NOT EXISTS `mission_entity` (`id` INTEGER NOT NULL, `date` INTEGER NOT NULL, `completed` INTEGER NOT NULL, `type` TEXT NOT NULL, `title` TEXT NOT NULL, `details` TEXT, `thumbnail` TEXT, `goal` TEXT, `crmid` TEXT, `completionDate` INTEGER, `updatedDate` INTEGER, PRIMARY KEY(`id`))");
                return;
            case 1:
                androidx.activity.b.d(cVar, "DROP VIEW BookmarkPreviewView", "CREATE TABLE IF NOT EXISTS `prediction` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `wsId` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `type` INTEGER NOT NULL, `start` INTEGER NOT NULL, `end` INTEGER NOT NULL, `active` INTEGER NOT NULL, `created` INTEGER NOT NULL, `modified` INTEGER NOT NULL)", "CREATE VIEW `BookmarkPreviewView` AS SELECT bookmark.remoteTaskId, bookmark.isSync, bookmark.isSelected, bookmark.updatedDate, bookmark.type, bookmarkPreview.title as title, bookmarkPreview.extraHighlightInfo as extraHighlightInfo, bookmarkPreview.thumbnail as thumbnail, bookmarkPreview.capabilities as capabilities FROM bookmark INNER JOIN bookmarkPreview ON bookmark.remoteTaskId = bookmarkPreview.remoteTaskId");
                return;
            default:
                cVar.l("ALTER TABLE `mission_entity` ADD COLUMN `remote_task_id` TEXT DEFAULT NULL");
                return;
        }
    }
}
