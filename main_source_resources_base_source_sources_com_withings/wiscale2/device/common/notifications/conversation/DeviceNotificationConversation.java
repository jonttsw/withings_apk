package com.withings.wiscale2.device.common.notifications.conversation;

import cj.b;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.AncsStatus;
import com.withings.common.device.conversation.BondingMigrationConversation;
import com.withings.wiscale2.device.common.conversation.NotificationInitConversation;
import fl.o;
import fl.p;
import gl.i0;
import gl.t;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: DeviceNotificationConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/device/common/notifications/conversation/DeviceNotificationConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class DeviceNotificationConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final a f52802f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f52803g;

    /* compiled from: DeviceNotificationConversation.kt */
    /* loaded from: classes5.dex */
    public interface a extends WppDeviceConversation.b {
        void R(DeviceNotificationConversation deviceNotificationConversation);
    }

    public DeviceNotificationConversation(a delegate) {
        u.j(delegate, "delegate");
        this.f52802f = delegate;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, com.withings.common.device.conversation.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        t tVar;
        B(240000L, false, true);
        this.f52803g = true;
        p a11 = p.f67672b.a();
        b x11 = x();
        u.i(x11, "getWppDevice(...)");
        o f11 = a11.f(x11);
        i0 i0Var = null;
        if (f11 instanceof t) {
            tVar = (t) f11;
        } else {
            tVar = null;
        }
        if (tVar != null) {
            E(new BondingMigrationConversation(tVar, new Object()));
        }
        if (f11 instanceof i0) {
            i0Var = (i0) f11;
        }
        if (i0Var != null) {
            E(new NotificationInitConversation(i0Var));
        }
        this.f52802f.R(this);
        AncsStatus ancsStatus = (AncsStatus) K();
        while (ancsStatus != null) {
            nj.a aVar = new nj.a(x());
            aVar.c((short) 2345, ancsStatus);
            aVar.j();
            ancsStatus = (AncsStatus) K();
        }
    }

    public final void L() {
        if (this.f52803g) {
            G(null);
        }
    }

    public final void M(AncsStatus ancsStatus) {
        if (this.f52803g) {
            G(ancsStatus);
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return this.f52802f;
    }
}
