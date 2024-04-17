package com.withings.wiscale2.device.common.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.liveworkout.model.LiveWorkout;
import kotlin.Metadata;
/* compiled from: ThrowIfOngoingWorkoutConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/conversation/ThrowIfOngoingWorkoutConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ThrowIfOngoingWorkoutConversation extends WppDeviceConversation {
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        ax.h hVar = ax.h.f19725i;
        if (hVar != null) {
            String mac = x().i().mac;
            kotlin.jvm.internal.u.i(mac, "mac");
            LiveWorkout e11 = hVar.e(mac);
            if (e11 != null && e11.isActive()) {
                throw new Exception("Workout is ongoing");
            }
            return;
        }
        kotlin.jvm.internal.u.s("instance");
        throw null;
    }
}
