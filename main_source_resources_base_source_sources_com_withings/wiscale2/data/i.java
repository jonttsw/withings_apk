package com.withings.wiscale2.data;
/* compiled from: ProdRoomDb_AutoMigration_87_88_Impl.java */
/* loaded from: classes4.dex */
final class i extends w8.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f50659c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i11) {
        super(87, 88);
        this.f50659c = i11;
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            } else {
                super(94, 95);
                return;
            }
        }
        super(119, 120);
    }

    @Override // w8.b
    public final void a(a9.c cVar) {
        switch (this.f50659c) {
            case 0:
                cVar.l("CREATE TABLE IF NOT EXISTS `HealthmateSessionData` (`accountId` INTEGER NOT NULL, `sessionId` TEXT NOT NULL, `providerToken` TEXT NOT NULL, `authToken` TEXT NOT NULL, `isSecured` INTEGER NOT NULL, `requireSecure` INTEGER NOT NULL, `expirationTimestamp` INTEGER NOT NULL, `providerType` TEXT NOT NULL, `serverUrl` TEXT NOT NULL, `inappviewUrl` TEXT NOT NULL, `maintUrl` TEXT NOT NULL, `accountUrl` TEXT NOT NULL, `cookieDomain` TEXT NOT NULL, `cookieName` TEXT NOT NULL, `sessionType` TEXT NOT NULL, PRIMARY KEY(`accountId`))");
                return;
            case 1:
                androidx.activity.b.d(cVar, "DROP VIEW BookmarkPreviewView", "ALTER TABLE `libraryPreviewContent` ADD COLUMN `isSuggested` INTEGER NOT NULL DEFAULT false", "CREATE VIEW `BookmarkPreviewView` AS SELECT bookmark.remoteTaskId, bookmark.isSync, bookmark.isSelected, bookmark.updatedDate, bookmark.type, bookmarkPreview.title as title, bookmarkPreview.extraHighlightInfo as extraHighlightInfo, bookmarkPreview.thumbnail as thumbnail, bookmarkPreview.capabilities as capabilities FROM bookmark INNER JOIN bookmarkPreview ON bookmark.remoteTaskId = bookmarkPreview.remoteTaskId");
                return;
            default:
                cVar.l("ALTER TABLE `wifit_task` ADD COLUMN `program_lastupdate` INTEGER DEFAULT NULL");
                return;
        }
    }
}
