package com.withings.wiscale2.device.common.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.AncsStatus;
import com.withings.comm.wpp.generated.object.NotificationsDisplayState;
import com.withings.device.Device;
import gl.i0;
import java.io.IOException;
import kotlin.Metadata;
/* compiled from: NotificationInitConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/conversation/NotificationInitConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class NotificationInitConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final i0 f50737f;

    /* renamed from: g  reason: collision with root package name */
    private final kn.e f50738g;

    public NotificationInitConversation(i0 deviceModel, kn.e deviceManager) {
        kotlin.jvm.internal.u.j(deviceModel, "deviceModel");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        this.f50737f = deviceModel;
        this.f50738g = deviceManager;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        fb0.b bVar;
        if (this.f50737f.D(x().i().softVersion)) {
            ?? aVar = new nj.a(x());
            boolean z5 = false;
            aVar.c((short) 2353, new com.withings.comm.wpp.h[0]);
            aVar.j();
            AncsStatus ancsStatus = (AncsStatus) aVar.B(AncsStatus.class);
            NotificationsDisplayState notificationsDisplayState = (NotificationsDisplayState) aVar.C(NotificationsDisplayState.class);
            u70.i v11 = v();
            kn.e eVar = this.f50738g;
            Device f11 = eVar.f(v11);
            if (f11 != null) {
                if (notificationsDisplayState != null) {
                    if (notificationsDisplayState.status == 1) {
                        z5 = true;
                    }
                    f11.setNotificationsDisplayEnabled(Boolean.valueOf(z5));
                }
                bVar = fb0.b.f66904h;
                if (bVar != null) {
                    bVar.k(f11, ancsStatus);
                    eVar.t(f11);
                    return;
                }
                kotlin.jvm.internal.u.s("instance");
                throw null;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ NotificationInitConversation(gl.i0 r3) {
        /*
            r2 = this;
            kn.e r0 = kn.e.c()
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.u.i(r0, r1)
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.conversation.NotificationInitConversation.<init>(gl.i0):void");
    }
}
