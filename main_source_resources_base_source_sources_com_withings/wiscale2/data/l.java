package com.withings.wiscale2.data;
/* compiled from: ProdRoomDb_AutoMigration_90_91_Impl.java */
/* loaded from: classes4.dex */
final class l extends w8.b {

    /* renamed from: c  reason: collision with root package name */
    private final f70.a f50662c;

    /* JADX WARN: Type inference failed for: r0v1, types: [f70.a, java.lang.Object] */
    public l() {
        super(90, 91);
        this.f50662c = new Object();
    }

    @Override // w8.b
    public final void a(a9.c cVar) {
        androidx.work.impl.g.c(cVar, "DROP TABLE `wifit_program`", "CREATE TABLE IF NOT EXISTS `program` (`programid` INTEGER NOT NULL, `deployment` TEXT NOT NULL, `target_type` INTEGER NOT NULL, `target_value` TEXT NOT NULL, `created` INTEGER NOT NULL, `modified` INTEGER NOT NULL, `visible` INTEGER NOT NULL, `familyid` INTEGER, `specifics` TEXT, `duration_json` TEXT, `eligibility` TEXT, `country_codes` TEXT, `data` TEXT, `userid` INTEGER NOT NULL, `program_overview` TEXT, PRIMARY KEY(`programid`))", "CREATE TABLE IF NOT EXISTS `program_enrolled` (`programid` INTEGER NOT NULL, `modified` INTEGER NOT NULL, `userid` INTEGER NOT NULL, PRIMARY KEY(`programid`))", "CREATE TABLE IF NOT EXISTS `program_iteration` (`programid` INTEGER NOT NULL, `iteration` INTEGER NOT NULL, `instanceid` INTEGER NOT NULL, `status` INTEGER NOT NULL, `start` INTEGER NOT NULL, `end` INTEGER, `menu` TEXT, `summary` TEXT, `full_summary` TEXT, `progress` INTEGER, `unread` INTEGER, `program_sw_token` TEXT, `id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        this.f50662c.getClass();
    }
}
