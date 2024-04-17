package com.withings.device.setup.android.setup;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.user.core.models.User;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: WppConversationKtx.kt */
/* loaded from: classes3.dex */
final class m extends w implements ym0.l<nm0.j<? extends yp.a, ? extends User>, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WppDeviceConversation f37464a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(WppDeviceConversation wppDeviceConversation) {
        super(1);
        this.f37464a = wppDeviceConversation;
    }

    @Override // ym0.l
    public final y invoke(nm0.j<? extends yp.a, ? extends User> jVar) {
        nm0.j<? extends yp.a, ? extends User> it = jVar;
        u.j(it, "it");
        this.f37464a.G(it);
        return y.f85009a;
    }
}
