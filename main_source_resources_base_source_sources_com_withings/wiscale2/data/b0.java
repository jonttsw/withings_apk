package com.withings.wiscale2.data;
/* compiled from: RoomDb_AutoMigration_82_83_Impl.java */
/* loaded from: classes4.dex */
final class b0 extends w8.b {
    @Override // w8.b
    public final void a(a9.c cVar) {
        cVar.l("ALTER TABLE `Mood` ADD COLUMN `is_day_log` INTEGER NOT NULL DEFAULT true");
    }
}
