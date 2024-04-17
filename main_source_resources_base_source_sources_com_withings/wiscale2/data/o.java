package com.withings.wiscale2.data;
/* compiled from: ProdRoomDb_AutoMigration_93_94_Impl.java */
/* loaded from: classes4.dex */
final class o extends w8.b {
    @Override // w8.b
    public final void a(a9.c cVar) {
        cVar.l("ALTER TABLE `mission_entity` ADD COLUMN `capabilities` TEXT DEFAULT NULL");
    }
}
