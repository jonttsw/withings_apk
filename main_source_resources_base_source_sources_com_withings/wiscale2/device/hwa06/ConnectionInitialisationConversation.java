package com.withings.wiscale2.device.hwa06;

import ax.h;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.liveworkout.model.LiveWorkout;
import com.withings.wiscale2.device.common.conversation.GetWorkoutStatusConversation;
import fl.p;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: Hwa06Connector.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/hwa06/ConnectionInitialisationConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class ConnectionInitialisationConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final h f54286f;

    /* compiled from: Hwa06Connector.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements l<LiveWorkout, y> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(LiveWorkout liveWorkout) {
            LiveWorkout it = liveWorkout;
            u.j(it, "it");
            ConnectionInitialisationConversation.this.f54286f.m(it);
            return y.f85009a;
        }
    }

    public ConnectionInitialisationConversation() {
        h hVar = h.f19725i;
        if (hVar != null) {
            this.f54286f = hVar;
        } else {
            u.s("instance");
            throw null;
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        E(new GetWorkoutStatusConversation(p.f67672b.a(), new a()));
    }
}
