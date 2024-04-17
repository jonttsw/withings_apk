package com.withings.common.device.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.devicesetup.upgrade.conversation.CheckForUpgradeConversation;
import com.withings.devicesetup.upgrade.conversation.CheckForUpgradeException;
import kotlin.Metadata;
/* compiled from: SafeCheckForUpgradeConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/common/device/conversation/SafeCheckForUpgradeConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "<init>", "()V", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SafeCheckForUpgradeConversation extends WppDeviceConversation {
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        try {
            E(new CheckForUpgradeConversation(null, null, null, 15));
        } catch (CheckForUpgradeException e11) {
            x70.b.u(this, v(), "Unable to check for upgrade : %s", e11.getMessage());
        }
    }
}
