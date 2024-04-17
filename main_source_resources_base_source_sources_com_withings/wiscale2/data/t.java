package com.withings.wiscale2.data;
/* compiled from: RoomDb_AutoMigration_100_101_Impl.java */
/* loaded from: classes4.dex */
final class t extends w8.b {

    /* renamed from: c  reason: collision with root package name */
    private final rb0.b f50670c;

    /* JADX WARN: Type inference failed for: r0v1, types: [rb0.b, java.lang.Object] */
    public t() {
        super(100, 101);
        this.f50670c = new Object();
    }

    @Override // w8.b
    public final void a(a9.c cVar) {
        androidx.work.impl.g.c(cVar, "ALTER TABLE `bookmark2` RENAME TO `bookmark`", "CREATE TABLE IF NOT EXISTS `_new_bookmarkPreview` (`remoteTaskId` TEXT NOT NULL, `updatedDate` INTEGER NOT NULL, `isSync` INTEGER NOT NULL, `type` TEXT NOT NULL, `title` TEXT NOT NULL, `extraHighlightInfo` TEXT NOT NULL, `thumbnail` TEXT NOT NULL, `capabilities` TEXT NOT NULL, PRIMARY KEY(`remoteTaskId`), FOREIGN KEY(`remoteTaskId`) REFERENCES `bookmark`(`remoteTaskId`) ON UPDATE NO ACTION ON DELETE CASCADE )", "INSERT INTO `_new_bookmarkPreview` (`remoteTaskId`,`updatedDate`,`isSync`,`type`,`title`,`extraHighlightInfo`,`thumbnail`,`capabilities`) SELECT `remoteTaskId`,`updatedDate`,`isSync`,`type`,`title`,`extraHighlightInfo`,`thumbnail`,`capabilities` FROM `bookmarkPreview`", "DROP TABLE `bookmarkPreview`");
        cVar.l("ALTER TABLE `_new_bookmarkPreview` RENAME TO `bookmarkPreview`");
        x8.b.b(cVar);
        this.f50670c.getClass();
    }
}
