package com.withings.wiscale2.data;
/* compiled from: RoomDb_AutoMigration_81_82_Impl.java */
/* loaded from: classes4.dex */
final class a0 extends w8.b {
    @Override // w8.b
    public final void a(a9.c cVar) {
        cVar.l("CREATE TABLE IF NOT EXISTS `Mood` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `user_id` INTEGER NOT NULL, `subjected_id` INTEGER, `mood_level` INTEGER NOT NULL, `date` INTEGER NOT NULL, `is_deleted` INTEGER NOT NULL)");
    }
}
