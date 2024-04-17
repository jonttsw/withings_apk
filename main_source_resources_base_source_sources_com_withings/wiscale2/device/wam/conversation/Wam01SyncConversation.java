package com.withings.wiscale2.device.wam.conversation;

import android.content.Context;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.conversation.DebugDumpConversation;
import com.withings.common.device.conversation.GetAndStoreBatteryConversation;
import com.withings.device.Device;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.upgrade.conversation.BluetoothUpgradeConversation;
import com.withings.devicesetup.upgrade.conversation.CheckForUpgradeConversation;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.device.common.conversation.CheckDeviceLinkConversation;
import com.withings.wiscale2.device.common.conversation.DeviceNotLinkedException;
import com.withings.wiscale2.device.wam.Wam01InstallSetup;
import ej.w;
import ej0.b;
import ge0.g;
import java.io.IOException;
import jl.c;
import jl.d;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import m70.i;
import nm0.k;
import nm0.y;
import xb0.h;
import xb0.l;
/* compiled from: Wam01SyncConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/device/wam/conversation/Wam01SyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wam01SyncConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final a f54837f;

    /* renamed from: g  reason: collision with root package name */
    private final e f54838g;

    /* renamed from: h  reason: collision with root package name */
    private final b f54839h;

    /* renamed from: i  reason: collision with root package name */
    private final i f54840i;

    /* compiled from: Wam01SyncConversation.kt */
    /* loaded from: classes5.dex */
    public interface a extends l.a {
    }

    public Wam01SyncConversation(g gVar) {
        e c11 = e.c();
        u.i(c11, "get(...)");
        b e11 = b.e();
        u.i(e11, "get(...)");
        i b10 = i.b();
        u.i(b10, "get(...)");
        this.f54837f = gVar;
        this.f54838g = c11;
        this.f54839h = e11;
        this.f54840i = b10;
    }

    private final void L(Device device, User user) throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        E(new Wam01SetUserInfoConversation(device, user));
        Context r7 = r();
        u.i(r7, "getContext(...)");
        d dVar = new d(r7);
        e eVar = this.f54838g;
        jl.b bVar = new jl.b(eVar);
        c cVar = new c(0L);
        com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
        u.i(a11, "get(...)");
        E(new DebugDumpConversation(a11, bVar, dVar, cVar));
        new l(x(), user, Vasistas.Category.MOTION, this.f54837f, device.getId()).g(r());
        new h(x(), eVar).a();
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        Object a11;
        b bVar = this.f54839h;
        e eVar = this.f54838g;
        CheckDeviceLinkConversation checkDeviceLinkConversation = new CheckDeviceLinkConversation(bVar, eVar, this.f54840i);
        try {
            E(checkDeviceLinkConversation);
            a11 = y.f85009a;
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        Throwable b10 = k.b(a11);
        if (b10 != null) {
            b10.printStackTrace();
            if (b10 instanceof DeviceNotLinkedException) {
                Wam01InstallSetup wam01InstallSetup = new Wam01InstallSetup();
                w.w().O(x(), new SetupConversation(wam01InstallSetup, new com.withings.devicesetup.ui.e(r(), wam01InstallSetup)), SetupConversation.class);
                return;
            }
            return;
        }
        User M = checkDeviceLinkConversation.M();
        Device L = checkDeviceLinkConversation.L();
        E(new GetAndStoreBatteryConversation(L, eVar));
        if (L.getBatteryLevel() < 25 && L.getBatteryState() != 0) {
            com.withings.wiscale2.notification.i.g(L.getBatteryLevel(), r());
        }
        Context r7 = r();
        u.i(r7, "getContext(...)");
        cj.b x11 = x();
        u.i(x11, "getWppDevice(...)");
        g gVar = (g) this.f54837f;
        gVar.c(r7, x11, M);
        CheckForUpgradeConversation checkForUpgradeConversation = new CheckForUpgradeConversation(null, null, null, 15);
        try {
            L(L, M);
            E(checkForUpgradeConversation);
            Throwable b11 = k.b(y.f85009a);
            if (b11 != null) {
                x70.b.t(this, "Unable to check for upgrade", b11);
            }
            gVar.d();
            oi0.b.h().n(M, ConstantsWs.CALLCTX_TRACKER_DEVICE_SYNC);
            if (checkForUpgradeConversation.M()) {
                long j5 = x().i().softVersion;
                if (x().c() == 2 && (j5 == 881 || j5 == 0)) {
                    try {
                        E(new BluetoothUpgradeConversation(null));
                        return;
                    } catch (IOException e11) {
                        throw e11;
                    } catch (Exception e12) {
                        throw new Exception("Unable to upgrade the wam", e12);
                    }
                }
                Context r11 = r();
                u.i(r11, "getContext(...)");
                gVar.getClass();
                com.withings.wiscale2.notification.i.f(r11, L);
            }
        } catch (Throwable th3) {
            gVar.d();
            oi0.b.h().n(M, ConstantsWs.CALLCTX_TRACKER_DEVICE_SYNC);
            throw th3;
        }
    }
}
