package com.withings.wiscale2.device.wam02.conversation;

import android.content.Context;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.conversation.DebugDumpConversation;
import com.withings.common.device.conversation.SafeCheckForUpgradeConversation;
import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.device.SyncReminderNotificationManager;
import com.withings.wiscale2.device.common.conversation.CheckDeviceLinkConversation;
import ie0.e;
import java.io.IOException;
import jl.c;
import jl.d;
import m70.i;
import xb0.l;
/* loaded from: classes5.dex */
public class Wam02SyncConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final b f54868f;

    /* loaded from: classes5.dex */
    public interface b extends l.a {
        void b();

        void c(Context context, cj.b bVar, User user);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Wam02SyncConversation(e eVar) {
        this.f54868f = eVar == null ? new Object() : eVar;
    }

    private void L(long j5, User user) throws IOException, InterruptedException, ConversationException, WaitForInput.CancelException {
        E(new SafeCheckForUpgradeConversation());
        E(new Wam02InitConversation(user));
        E(new DebugDumpConversation(com.withings.comm.trace.e.a(), new jl.b(kn.e.c()), new d(r()), new c(0L)));
        new l(x(), user, Vasistas.Category.MOTION, this.f54868f, j5).g(r());
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        CheckDeviceLinkConversation checkDeviceLinkConversation = new CheckDeviceLinkConversation(ej0.b.e(), kn.e.c(), i.b());
        E(checkDeviceLinkConversation);
        Device device = checkDeviceLinkConversation.f50701j;
        User user = checkDeviceLinkConversation.f50700i;
        if (user != null && device != null) {
            Context r7 = r();
            cj.b x11 = x();
            b bVar = this.f54868f;
            bVar.c(r7, x11, user);
            try {
                L(device.getId(), user);
                SyncReminderNotificationManager.a(r(), device.getId());
                return;
            } finally {
                bVar.b();
                oi0.b.h().n(user, ConstantsWs.CALLCTX_TRACKER_DEVICE_SYNC);
            }
        }
        throw new IOException();
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return null;
    }

    /* loaded from: classes5.dex */
    private static class a implements b {
        @Override // com.withings.wiscale2.device.wam02.conversation.Wam02SyncConversation.b
        public final void b() {
        }

        @Override // xb0.l.a
        public final void a(Vasistas vasistas, int i11) {
        }

        @Override // com.withings.wiscale2.device.wam02.conversation.Wam02SyncConversation.b
        public final void c(Context context, cj.b bVar, User user) {
        }
    }
}
