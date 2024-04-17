package com.withings.wiscale2.device.common.ui;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.ShortcutAction;
import kotlin.Metadata;
/* compiled from: DeviceShortcutsFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/ui/DeviceShortcutConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class DeviceShortcutConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final androidx.lifecycle.k0<ShortcutAction> f53704f = xw.d.b(null);

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        B(300000L, false, true);
        K();
    }

    public final androidx.lifecycle.k0<ShortcutAction> L() {
        return this.f53704f;
    }
}
