package com.withings.device.setup.android.setup;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: WppConversationKtx.kt */
/* loaded from: classes3.dex */
final class n extends w implements ym0.l<y, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WppDeviceConversation f37465a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(WppDeviceConversation wppDeviceConversation) {
        super(1);
        this.f37465a = wppDeviceConversation;
    }

    @Override // ym0.l
    public final y invoke(y yVar) {
        y it = yVar;
        u.j(it, "it");
        y yVar2 = y.f85009a;
        this.f37465a.G(yVar2);
        return yVar2;
    }
}
