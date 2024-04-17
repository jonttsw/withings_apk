package com.withings.wiscale2.data;
/* compiled from: ProdRoomDb_AutoMigration_92_93_Impl.java */
/* loaded from: classes4.dex */
final class n extends w8.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f50664c;

    /* renamed from: d  reason: collision with root package name */
    private final w8.a f50665d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [w8.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [w8.a, java.lang.Object] */
    public n(int i11) {
        super(92, 93);
        this.f50664c = i11;
        if (i11 != 1) {
            this.f50665d = new Object();
            return;
        }
        super(99, 100);
        this.f50665d = new Object();
    }

    @Override // w8.b
    public final void a(a9.c cVar) {
        int i11 = this.f50664c;
        w8.a aVar = this.f50665d;
        switch (i11) {
            case 0:
                androidx.work.impl.g.c(cVar, "ALTER TABLE `mission_entity` ADD COLUMN `extraHighlightInfo` TEXT DEFAULT NULL", "CREATE TABLE IF NOT EXISTS `_new_mission_entity` (`id` INTEGER NOT NULL, `date` INTEGER NOT NULL, `completed` INTEGER NOT NULL, `type` TEXT NOT NULL, `title` TEXT NOT NULL, `extraHighlightInfo` TEXT DEFAULT NULL, `thumbnail` TEXT, `goal` TEXT, `crmid` TEXT, `completionDate` INTEGER, `updatedDate` INTEGER, `is_synced` INTEGER NOT NULL DEFAULT false, PRIMARY KEY(`id`))", "INSERT INTO `_new_mission_entity` (`id`,`date`,`completed`,`type`,`title`,`thumbnail`,`goal`,`crmid`,`completionDate`,`updatedDate`,`is_synced`) SELECT `id`,`date`,`completed`,`type`,`title`,`thumbnail`,`goal`,`crmid`,`completionDate`,`updatedDate`,`is_synced` FROM `mission_entity`", "DROP TABLE `mission_entity`");
                cVar.l("ALTER TABLE `_new_mission_entity` RENAME TO `mission_entity`");
                aVar.c(cVar);
                return;
            default:
                androidx.activity.b.d(cVar, "DROP TABLE `bookmark`", "CREATE TABLE IF NOT EXISTS `bookmark2` (`remoteTaskId` TEXT NOT NULL, `isSync` INTEGER NOT NULL, `isSelected` INTEGER NOT NULL, `updatedDate` INTEGER NOT NULL, PRIMARY KEY(`remoteTaskId`))", "CREATE TABLE IF NOT EXISTS `bookmarkPreview` (`remoteTaskId` TEXT NOT NULL, `updatedDate` INTEGER NOT NULL, `isSync` INTEGER NOT NULL, `type` TEXT NOT NULL, `title` TEXT NOT NULL, `extraHighlightInfo` TEXT NOT NULL, `thumbnail` TEXT NOT NULL, `capabilities` TEXT NOT NULL, PRIMARY KEY(`remoteTaskId`), FOREIGN KEY(`remoteTaskId`) REFERENCES `bookmark2`(`remoteTaskId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                aVar.c(cVar);
                return;
        }
    }
}
