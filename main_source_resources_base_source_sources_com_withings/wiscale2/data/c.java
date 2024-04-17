package com.withings.wiscale2.data;
/* compiled from: ProdRoomDb_AutoMigration_80_81_Impl.java */
/* loaded from: classes4.dex */
final class c extends w8.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f50651c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i11) {
        super(80, 81);
        this.f50651c = i11;
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            } else {
                super(88, 89);
                return;
            }
        }
        super(113, 114);
    }

    @Override // w8.b
    public final void a(a9.c cVar) {
        switch (this.f50651c) {
            case 0:
                cVar.l("ALTER TABLE `Target` ADD COLUMN `attrib` INTEGER DEFAULT NULL");
                return;
            case 1:
                androidx.work.impl.g.c(cVar, "DROP VIEW BookmarkPreviewView", "ALTER TABLE `program_task_preview` ADD COLUMN `currentlySwapped` INTEGER NOT NULL DEFAULT false", "ALTER TABLE `mission_task_preview` ADD COLUMN `currentlySwapped` INTEGER NOT NULL DEFAULT false", "CREATE VIEW `BookmarkPreviewView` AS SELECT bookmark.remoteTaskId, bookmark.isSync, bookmark.isSelected, bookmark.updatedDate, bookmark.type, bookmarkPreview.title as title, bookmarkPreview.extraHighlightInfo as extraHighlightInfo, bookmarkPreview.thumbnail as thumbnail, bookmarkPreview.capabilities as capabilities FROM bookmark INNER JOIN bookmarkPreview ON bookmark.remoteTaskId = bookmarkPreview.remoteTaskId");
                return;
            default:
                androidx.work.impl.g.c(cVar, "ALTER TABLE `DeviceScreen` ADD COLUMN `defaultActive` INTEGER DEFAULT NULL", "ALTER TABLE `DeviceScreen` ADD COLUMN `defaultRank` INTEGER DEFAULT NULL", "ALTER TABLE `DeviceScreen` ADD COLUMN `group` INTEGER DEFAULT NULL", "ALTER TABLE `DeviceScreen` ADD COLUMN `requiredFeatureIds` TEXT DEFAULT NULL");
                cVar.l("ALTER TABLE `DeviceScreen` ADD COLUMN `fixedPosition` INTEGER DEFAULT NULL");
                cVar.l("CREATE TABLE IF NOT EXISTS `DeviceScreensGroup` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `modified` INTEGER NOT NULL, `deviceId` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                return;
        }
    }
}
