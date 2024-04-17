package com.withings.common.device.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.comm.wpp.generated.object.Boolean;
import kotlin.Metadata;
/* compiled from: WorkoutAlwaysOnConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/conversation/SetWorkoutAlwaysOnStatusConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SetWorkoutAlwaysOnStatusConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final boolean f35159f;

    public SetWorkoutAlwaysOnStatusConversation(boolean z5) {
        this.f35159f = z5;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        try {
            Boolean value = new Boolean().setValue(this.f35159f ? (short) 1 : (short) 0);
            nj.a aVar = new nj.a(x());
            aVar.c((short) 2453, value);
            aVar.j();
        } catch (UnsupportedCommandException unused) {
            x70.b.t(this, "Command CMD_WORKOUT_ALWAYS_ON_SET is not supported by %s with firmware %d", x(), Long.valueOf(x().i().softVersion));
        }
    }
}
