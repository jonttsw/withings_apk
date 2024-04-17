package com.withings.wiscale2.data;
/* compiled from: ProdRoomDb_AutoMigration_88_89_Impl.java */
/* loaded from: classes4.dex */
final class j extends w8.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f50660c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i11) {
        super(88, 89);
        this.f50660c = i11;
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            } else {
                super(95, 96);
                return;
            }
        }
        super(120, 121);
    }

    @Override // w8.b
    public final void a(a9.c cVar) {
        switch (this.f50660c) {
            case 0:
                androidx.work.impl.g.c(cVar, "ALTER TABLE `DeviceScreen` ADD COLUMN `defaultActive` INTEGER DEFAULT NULL", "ALTER TABLE `DeviceScreen` ADD COLUMN `defaultRank` INTEGER DEFAULT NULL", "ALTER TABLE `DeviceScreen` ADD COLUMN `group` INTEGER DEFAULT NULL", "ALTER TABLE `DeviceScreen` ADD COLUMN `requiredFeatureIds` TEXT DEFAULT NULL");
                cVar.l("ALTER TABLE `DeviceScreen` ADD COLUMN `fixedPosition` INTEGER DEFAULT NULL");
                cVar.l("CREATE TABLE IF NOT EXISTS `DeviceScreensGroup` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `modified` INTEGER NOT NULL, `deviceId` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                return;
            case 1:
                androidx.work.impl.g.c(cVar, "DROP VIEW BookmarkPreviewView", "ALTER TABLE `HealthAttributes` ADD COLUMN `category` TEXT DEFAULT NULL", "ALTER TABLE `HealthAttributes` ADD COLUMN `subcategory` TEXT DEFAULT NULL", "ALTER TABLE `HealthAttributes` ADD COLUMN `asset` TEXT DEFAULT NULL");
                cVar.l("CREATE VIEW `BookmarkPreviewView` AS SELECT bookmark.remoteTaskId, bookmark.isSync, bookmark.isSelected, bookmark.updatedDate, bookmark.type, bookmarkPreview.title as title, bookmarkPreview.extraHighlightInfo as extraHighlightInfo, bookmarkPreview.thumbnail as thumbnail, bookmarkPreview.capabilities as capabilities FROM bookmark INNER JOIN bookmarkPreview ON bookmark.remoteTaskId = bookmarkPreview.remoteTaskId");
                return;
            default:
                cVar.l("ALTER TABLE `wifit_task` ADD COLUMN `goal` REAL DEFAULT NULL");
                return;
        }
    }
}
