package com.withings.device.setup.android.setup;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.setup.android.setup.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
/* compiled from: WppConversationKtx.kt */
/* loaded from: classes3.dex */
public final class s {
    public static final void a(WppDeviceConversation wppDeviceConversation, jo.a mutableSetupStateRepository, k setupState) {
        u.j(wppDeviceConversation, "<this>");
        u.j(mutableSetupStateRepository, "mutableSetupStateRepository");
        u.j(setupState, "setupState");
        mutableSetupStateRepository.b().setValue(setupState);
    }

    public static Object b(WppDeviceConversation wppDeviceConversation, jo.a mutableSetupStateRepository, b setupAction, boolean z5) {
        k iVar;
        u.j(wppDeviceConversation, "<this>");
        u.j(mutableSetupStateRepository, "mutableSetupStateRepository");
        u.j(setupAction, "setupAction");
        wppDeviceConversation.B(300000L, true, z5);
        if (u.e(setupAction, b.g.f37406a)) {
            iVar = new j(new l(wppDeviceConversation));
        } else if (u.e(setupAction, b.d.f37403a)) {
            iVar = new g(new m(wppDeviceConversation));
        } else if (u.e(setupAction, b.C0489b.f37401a)) {
            iVar = new e(new n(wppDeviceConversation));
        } else if (u.e(setupAction, b.c.f37402a)) {
            iVar = new f(new o(wppDeviceConversation));
        } else if (u.e(setupAction, b.e.f37404a)) {
            iVar = new h(new p(wppDeviceConversation));
        } else if (u.e(setupAction, b.a.f37400a)) {
            iVar = new d(new q(wppDeviceConversation));
        } else if (u.e(setupAction, b.f.f37405a)) {
            iVar = new i(new r(wppDeviceConversation));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        mutableSetupStateRepository.b().setValue(iVar);
        return wppDeviceConversation.K();
    }
}
