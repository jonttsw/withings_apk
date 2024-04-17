package com.withings.wiscale2.device.scale.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.setup.android.setup.init.association.SendAssociationKeysConversation;
import com.withings.wiscale2.device.common.conversation.SetWifiCountryConversation;
import java.io.IOException;
import kn.e;
import vf.c;
/* loaded from: classes5.dex */
public class ScaleSetupInitConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final boolean f54644f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f54645g;

    public ScaleSetupInitConversation(boolean z5, boolean z11) {
        this.f54644f = z5;
        this.f54645g = z11;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        c cVar;
        E(new SetWifiCountryConversation());
        try {
            oi0.b.h().k(e.c().f(x().g()), "Scale_setup_init");
        } catch (Exception e11) {
            x70.b.p(e11);
        }
        E(new ScaleInitConversation(this.f54645g));
        if (this.f54644f) {
            e c11 = e.c();
            cVar = c.f103617d;
            if (cVar != null) {
                E(new SendAssociationKeysConversation(c11, cVar));
                return;
            }
            throw new IllegalArgumentException("You must call init before".toString());
        }
    }
}
