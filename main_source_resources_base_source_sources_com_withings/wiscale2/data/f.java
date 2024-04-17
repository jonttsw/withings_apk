package com.withings.wiscale2.data;
/* compiled from: ProdRoomDb_AutoMigration_83_84_Impl.java */
/* loaded from: classes4.dex */
final class f extends w8.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f50656c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i11) {
        super(83, 84);
        this.f50656c = i11;
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            } else {
                super(91, 92);
                return;
            }
        }
        super(116, 117);
    }

    @Override // w8.b
    public final void a(a9.c cVar) {
        switch (this.f50656c) {
            case 0:
                return;
            case 1:
                cVar.l("DROP VIEW BookmarkPreviewView");
                cVar.l("CREATE VIEW `BookmarkPreviewView` AS SELECT bookmark.remoteTaskId, bookmark.isSync, bookmark.isSelected, bookmark.updatedDate, bookmark.type, bookmarkPreview.title as title, bookmarkPreview.extraHighlightInfo as extraHighlightInfo, bookmarkPreview.thumbnail as thumbnail, bookmarkPreview.capabilities as capabilities FROM bookmark INNER JOIN bookmarkPreview ON bookmark.remoteTaskId = bookmarkPreview.remoteTaskId");
                return;
            default:
                cVar.l("ALTER TABLE `mission_entity` ADD COLUMN `is_synced` INTEGER NOT NULL DEFAULT false");
                cVar.l("CREATE TABLE IF NOT EXISTS `mission_progression_task` (`task_identifier` INTEGER NOT NULL, `status` INTEGER, `completion_date` INTEGER, PRIMARY KEY(`task_identifier`), FOREIGN KEY(`task_identifier`) REFERENCES `mission_entity`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                return;
        }
    }
}
