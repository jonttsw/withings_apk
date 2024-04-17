package com.withings.wiscale2.device.hwa09.conversation;

import kotlin.jvm.internal.s;
import nm0.y;
import ym0.l;
/* compiled from: Hwa0910SyncConversation.kt */
/* loaded from: classes5.dex */
final /* synthetic */ class a extends s implements l<Double, y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Object obj) {
        super(1, obj, Hwa0910SyncConversation.class, "onSignalSyncProgressChanged", "onSignalSyncProgressChanged(D)V", 0);
    }

    @Override // ym0.l
    public final y invoke(Double d11) {
        Hwa0910SyncConversation.L((Hwa0910SyncConversation) this.receiver, d11.doubleValue());
        return y.f85009a;
    }
}
