package com.withings.wiscale2.data;
/* compiled from: RoomDb_AutoMigration_92_93_Impl.java */
/* loaded from: classes4.dex */
final class d0 extends w8.b {

    /* renamed from: c  reason: collision with root package name */
    private final com.withings.common.device.s f50654c;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.withings.common.device.s, java.lang.Object] */
    public d0() {
        super(92, 93);
        this.f50654c = new Object();
    }

    @Override // w8.b
    public final void a(a9.c cVar) {
        androidx.work.impl.g.c(cVar, "ALTER TABLE `mission_entity` ADD COLUMN `extraHighlightInfo` TEXT DEFAULT NULL", "CREATE TABLE IF NOT EXISTS `_new_mission_entity` (`id` INTEGER NOT NULL, `date` INTEGER NOT NULL, `completed` INTEGER NOT NULL, `type` TEXT NOT NULL, `title` TEXT NOT NULL, `extraHighlightInfo` TEXT DEFAULT NULL, `thumbnail` TEXT, `goal` TEXT, `crmid` TEXT, `completionDate` INTEGER, `updatedDate` INTEGER, `is_synced` INTEGER NOT NULL DEFAULT false, PRIMARY KEY(`id`))", "INSERT INTO `_new_mission_entity` (`id`,`date`,`completed`,`type`,`title`,`thumbnail`,`goal`,`crmid`,`completionDate`,`updatedDate`,`is_synced`) SELECT `id`,`date`,`completed`,`type`,`title`,`thumbnail`,`goal`,`crmid`,`completionDate`,`updatedDate`,`is_synced` FROM `mission_entity`", "DROP TABLE `mission_entity`");
        cVar.l("ALTER TABLE `_new_mission_entity` RENAME TO `mission_entity`");
        this.f50654c.getClass();
    }
}
