package com.withings.wiscale2.data;
/* compiled from: ProdRoomDb_AutoMigration_84_85_Impl.java */
/* loaded from: classes4.dex */
final class g extends w8.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f50657c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i11) {
        super(84, 85);
        this.f50657c = i11;
        if (i11 != 1) {
        } else {
            super(117, 118);
        }
    }

    @Override // w8.b
    public final void a(a9.c cVar) {
        switch (this.f50657c) {
            case 0:
                cVar.l("CREATE TABLE IF NOT EXISTS `wifit_program` (`programid` INTEGER NOT NULL, `target_type` TEXT NOT NULL, `target_value` TEXT NOT NULL, `created` TEXT NOT NULL, `modified` TEXT NOT NULL, `visible` INTEGER NOT NULL, `identifier` TEXT NOT NULL, `title` TEXT NOT NULL, `subtitle` TEXT NOT NULL, `thumbnail` TEXT NOT NULL, `category_identifier` TEXT NOT NULL, `category_title` TEXT NOT NULL, `category_icon_id` TEXT NOT NULL, PRIMARY KEY(`programid`))");
                return;
            default:
                androidx.activity.b.d(cVar, "DROP VIEW BookmarkPreviewView", "ALTER TABLE `program` ADD COLUMN `is_suggested` INTEGER NOT NULL DEFAULT false", "CREATE VIEW `BookmarkPreviewView` AS SELECT bookmark.remoteTaskId, bookmark.isSync, bookmark.isSelected, bookmark.updatedDate, bookmark.type, bookmarkPreview.title as title, bookmarkPreview.extraHighlightInfo as extraHighlightInfo, bookmarkPreview.thumbnail as thumbnail, bookmarkPreview.capabilities as capabilities FROM bookmark INNER JOIN bookmarkPreview ON bookmark.remoteTaskId = bookmarkPreview.remoteTaskId");
                return;
        }
    }
}
