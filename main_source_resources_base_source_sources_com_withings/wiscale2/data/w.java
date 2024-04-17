package com.withings.wiscale2.data;
/* compiled from: RoomDb_AutoMigration_108_109_Impl.java */
/* loaded from: classes4.dex */
final class w extends w8.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f50673c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(int i11) {
        super(108, 109);
        this.f50673c = i11;
        if (i11 != 1) {
        } else {
            super(84, 85);
        }
    }

    @Override // w8.b
    public final void a(a9.c cVar) {
        switch (this.f50673c) {
            case 0:
                androidx.work.impl.g.c(cVar, "DROP VIEW BookmarkPreviewView", "CREATE TABLE IF NOT EXISTS `libraryFilter` (`id` INTEGER NOT NULL, `label` TEXT NOT NULL, `taskType` TEXT NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `libraryPreviewContent` (`contentId` TEXT NOT NULL, `taskType` TEXT NOT NULL, `title` TEXT NOT NULL, `thumbnail` TEXT NOT NULL, `capabilities` TEXT NOT NULL, PRIMARY KEY(`contentId`))", "CREATE TABLE IF NOT EXISTS `libraryPreviewContentWithFilter` (`contentId` TEXT NOT NULL, `filterId` INTEGER NOT NULL, PRIMARY KEY(`contentId`, `filterId`), FOREIGN KEY(`filterId`) REFERENCES `libraryFilter`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`contentId`) REFERENCES `libraryPreviewContent`(`contentId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                cVar.l("CREATE VIEW `BookmarkPreviewView` AS SELECT bookmark.remoteTaskId, bookmark.isSync, bookmark.isSelected, bookmark.updatedDate, bookmark.type, bookmarkPreview.title as title, bookmarkPreview.extraHighlightInfo as extraHighlightInfo, bookmarkPreview.thumbnail as thumbnail, bookmarkPreview.capabilities as capabilities FROM bookmark INNER JOIN bookmarkPreview ON bookmark.remoteTaskId = bookmarkPreview.remoteTaskId");
                return;
            default:
                cVar.l("CREATE TABLE IF NOT EXISTS `wifit_program` (`programid` INTEGER NOT NULL, `target_type` TEXT NOT NULL, `target_value` TEXT NOT NULL, `created` TEXT NOT NULL, `modified` TEXT NOT NULL, `visible` INTEGER NOT NULL, `identifier` TEXT NOT NULL, `title` TEXT NOT NULL, `subtitle` TEXT NOT NULL, `thumbnail` TEXT NOT NULL, `category_identifier` TEXT NOT NULL, `category_title` TEXT NOT NULL, `category_icon_id` TEXT NOT NULL, PRIMARY KEY(`programid`))");
                return;
        }
    }
}
