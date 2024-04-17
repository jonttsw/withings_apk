package com.withings.wiscale2.data;
/* compiled from: RoomDb_AutoMigration_122_123_Impl.java */
/* loaded from: classes4.dex */
final class x extends w8.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f50674c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(int i11) {
        super(122, 123);
        this.f50674c = i11;
        if (i11 != 1) {
        } else {
            super(97, 98);
        }
    }

    @Override // w8.b
    public final void a(a9.c cVar) {
        switch (this.f50674c) {
            case 0:
                androidx.work.impl.g.c(cVar, "DROP VIEW BookmarkPreviewView", "ALTER TABLE `program` ADD COLUMN `access_level` INTEGER NOT NULL DEFAULT 0", "ALTER TABLE `bookmarkPreview` ADD COLUMN `access_level` INTEGER NOT NULL DEFAULT 0", "ALTER TABLE `libraryPreviewContent` ADD COLUMN `access_level` INTEGER NOT NULL DEFAULT 0");
                cVar.l("CREATE VIEW `BookmarkPreviewView` AS SELECT bookmark.remoteTaskId, bookmark.isSync, bookmark.isSelected, bookmark.updatedDate, bookmark.type, bookmarkPreview.title as title, bookmarkPreview.access_level as accessLevel, bookmarkPreview.extraHighlightInfo as extraHighlightInfo, bookmarkPreview.thumbnail as thumbnail, bookmarkPreview.capabilities as capabilities FROM bookmark INNER JOIN bookmarkPreview ON bookmark.remoteTaskId = bookmarkPreview.remoteTaskId");
                return;
            default:
                cVar.l("ALTER TABLE `PartnerExchangeLastUpdate` ADD COLUMN `changeToken` TEXT DEFAULT NULL");
                return;
        }
    }
}
