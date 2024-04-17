package com.withings.wiscale2.data;
/* compiled from: RoomDb_AutoMigration_101_102_Impl.java */
/* loaded from: classes4.dex */
final class u extends w8.b {

    /* renamed from: c  reason: collision with root package name */
    private final gx.a f50671c;

    /* JADX WARN: Type inference failed for: r0v1, types: [gx.a, java.lang.Object] */
    public u() {
        super(101, 102);
        this.f50671c = new Object();
    }

    @Override // w8.b
    public final void a(a9.c cVar) {
        androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `_new_mission_entity` (`id` INTEGER NOT NULL, `date` INTEGER NOT NULL, `completed` INTEGER NOT NULL, `type` TEXT NOT NULL, `title` TEXT NOT NULL, `extraHighlightInfo` TEXT DEFAULT NULL, `thumbnail` TEXT, `goal` TEXT, `crmid` TEXT, `completionDate` INTEGER, `updatedDate` INTEGER, `is_synced` INTEGER NOT NULL DEFAULT false, `capabilities` TEXT, `remote_program_task_id` TEXT, `remote_task_id` TEXT NOT NULL DEFAULT '', PRIMARY KEY(`id`))", "INSERT INTO `_new_mission_entity` (`id`,`date`,`completed`,`type`,`title`,`extraHighlightInfo`,`thumbnail`,`goal`,`crmid`,`completionDate`,`updatedDate`,`is_synced`,`capabilities`,`remote_task_id`) SELECT `id`,`date`,`completed`,`type`,`title`,`extraHighlightInfo`,`thumbnail`,`goal`,`crmid`,`completionDate`,`updatedDate`,`is_synced`,`capabilities`,`remote_task_id` FROM `mission_entity`", "DROP TABLE `mission_entity`", "ALTER TABLE `_new_mission_entity` RENAME TO `mission_entity`");
        this.f50671c.getClass();
    }
}
