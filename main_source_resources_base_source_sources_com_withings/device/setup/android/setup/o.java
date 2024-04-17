package com.withings.device.setup.android.setup;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: WppConversationKtx.kt */
/* loaded from: classes3.dex */
final class o extends w implements ym0.l<Boolean, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WppDeviceConversation f37466a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(WppDeviceConversation wppDeviceConversation) {
        super(1);
        this.f37466a = wppDeviceConversation;
    }

    @Override // ym0.l
    public final y invoke(Boolean bool) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        this.f37466a.G(bool2);
        return y.f85009a;
    }
}
