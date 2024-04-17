package com.withings.common.device.conversation;

import ah.k;
import android.content.Context;
import android.content.Intent;
import com.withings.common.device.conversation.BondingMigrationConversation;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.jvm.internal.u;
/* compiled from: BondingMigrationConversation.kt */
/* loaded from: classes3.dex */
public final class a implements BondingMigrationConversation.a {
    @Override // com.withings.common.device.conversation.BondingMigrationConversation.a
    public final void a(Context context, cj.b bVar) {
        zg.c cVar = zg.c.f110625a;
        String iVar = bVar.g().toString();
        u.i(iVar, "toString(...)");
        cVar.getClass();
        Intent putExtra = k.c(context, "com.withings.wiscale2.device.common.ui.DeviceBondingActivity").putExtra("key_mac_address", iVar);
        u.i(putExtra, "putExtra(...)");
        Intent addFlags = putExtra.addFlags(268435456).addFlags(ConstantsWs.DEBUG_BITMASK_EXTENDED_HWA10_RAWDATA_CBTA);
        u.i(addFlags, "addFlags(...)");
        context.startActivity(addFlags);
    }
}
