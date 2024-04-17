package com.withings.wiscale2.data;
/* compiled from: RoomDb_AutoMigration_124_125_Impl.java */
/* loaded from: classes4.dex */
final class y extends w8.b {
    @Override // w8.b
    public final void a(a9.c cVar) {
        androidx.activity.b.d(cVar, "DROP VIEW BookmarkPreviewView", "CREATE TABLE IF NOT EXISTS `factor` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `wsId` INTEGER, `userId` INTEGER NOT NULL, `type` INTEGER NOT NULL, `start` INTEGER NOT NULL, `end` INTEGER, `numberOfPills` INTEGER, `deleted` INTEGER, `deletionDate` INTEGER, `created` INTEGER NOT NULL, `modified` INTEGER NOT NULL)", "CREATE VIEW `BookmarkPreviewView` AS SELECT bookmark.remoteTaskId, bookmark.isSync, bookmark.isSelected, bookmark.updatedDate, bookmark.type, bookmarkPreview.title as title, bookmarkPreview.access_level as accessLevel, bookmarkPreview.extraHighlightInfo as extraHighlightInfo, bookmarkPreview.thumbnail as thumbnail, bookmarkPreview.capabilities as capabilities FROM bookmark INNER JOIN bookmarkPreview ON bookmark.remoteTaskId = bookmarkPreview.remoteTaskId");
    }
}
