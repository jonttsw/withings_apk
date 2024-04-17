package com.withings.wiscale2.data;
/* compiled from: ProdRoomDb_AutoMigration_82_83_Impl.java */
/* loaded from: classes4.dex */
final class e extends w8.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f50655c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i11) {
        super(82, 83);
        this.f50655c = i11;
        if (i11 != 1) {
        } else {
            super(115, 116);
        }
    }

    @Override // w8.b
    public final void a(a9.c cVar) {
        switch (this.f50655c) {
            case 0:
                cVar.l("ALTER TABLE `Mood` ADD COLUMN `is_day_log` INTEGER NOT NULL DEFAULT true");
                return;
            default:
                androidx.work.impl.g.c(cVar, "DROP VIEW BookmarkPreviewView", "ALTER TABLE `Section` ADD COLUMN `minAppVersion` TEXT DEFAULT NULL", "ALTER TABLE `Section` ADD COLUMN `maxAppVersion` TEXT DEFAULT NULL", "ALTER TABLE `HealthScore` ADD COLUMN `valid` INTEGER NOT NULL DEFAULT true");
                cVar.l("CREATE VIEW `BookmarkPreviewView` AS SELECT bookmark.remoteTaskId, bookmark.isSync, bookmark.isSelected, bookmark.updatedDate, bookmark.type, bookmarkPreview.title as title, bookmarkPreview.extraHighlightInfo as extraHighlightInfo, bookmarkPreview.thumbnail as thumbnail, bookmarkPreview.capabilities as capabilities FROM bookmark INNER JOIN bookmarkPreview ON bookmark.remoteTaskId = bookmarkPreview.remoteTaskId");
                return;
        }
    }
}
