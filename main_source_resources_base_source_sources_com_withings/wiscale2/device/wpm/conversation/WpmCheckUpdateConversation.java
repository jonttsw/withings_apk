package com.withings.wiscale2.device.wpm.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.upgrade.conversation.CheckForUpgradeConversation;
import com.withings.wiscale2.device.wpm.WpmUpgradeSetup;
import ej.w;
import fl.p;
import gl.e;
import java.io.IOException;
/* loaded from: classes5.dex */
public class WpmCheckUpdateConversation extends WppDeviceConversation {
    private void L(cj.b bVar) {
        a aVar = new a(r());
        if (p.f67672b.a().f(x()) instanceof e) {
            w.w().O(bVar, new WpmMeasureConversation(aVar), WpmMeasureConversation.class);
        }
    }

    private void M(cj.b bVar) {
        WpmUpgradeSetup wpmUpgradeSetup = new WpmUpgradeSetup(p.f67672b.a().f(bVar).a());
        w.w().O(bVar, new SetupConversation(wpmUpgradeSetup, new com.withings.devicesetup.ui.e(r(), wpmUpgradeSetup)), SetupConversation.class);
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws WaitForInput.CancelException, IOException, ConversationException, InterruptedException {
        try {
            try {
                CheckForUpgradeConversation checkForUpgradeConversation = new CheckForUpgradeConversation();
                E(checkForUpgradeConversation);
                if (checkForUpgradeConversation.M()) {
                    M(x());
                }
            } catch (Exception e11) {
                x70.b.t(this, "Unable to check for upgrade", e11);
            }
        } finally {
            L(x());
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return null;
    }
}
