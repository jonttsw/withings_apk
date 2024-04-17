package com.withings.wiscale2.device.hwa;

import android.content.Context;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.conversation.DebugDumpConversation;
import com.withings.common.device.conversation.GetAndStoreBatteryConversation;
import com.withings.common.device.conversation.SafeCheckForUpgradeConversation;
import com.withings.device.Device;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.device.SyncReminderNotificationManager;
import com.withings.wiscale2.device.common.conversation.CheckDeviceLinkConversation;
import com.withings.wiscale2.device.hwa.conversation.Hwa0102InitConversation;
import ej.w;
import java.io.IOException;
import jl.c;
import jl.d;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import lj0.h0;
import u70.i;
import xb0.l;
import zh0.j;
/* compiled from: HwaSyncConversation.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/hwa/HwaSyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "Lzh0/j$a;", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HwaSyncConversation extends WppDeviceConversation implements j.a {

    /* renamed from: f  reason: collision with root package name */
    private a f54164f;

    /* renamed from: g  reason: collision with root package name */
    private final e f54165g;

    /* renamed from: h  reason: collision with root package name */
    private final ej0.b f54166h;

    /* renamed from: i  reason: collision with root package name */
    private l f54167i;

    /* compiled from: HwaSyncConversation.kt */
    /* loaded from: classes5.dex */
    public interface a extends l.a {
    }

    public HwaSyncConversation(b bVar) {
        e c11 = e.c();
        u.i(c11, "get(...)");
        ej0.b e11 = ej0.b.e();
        u.i(e11, "get(...)");
        this.f54164f = bVar;
        this.f54165g = c11;
        this.f54166h = e11;
    }

    private final void L(User user) {
        h0 e11 = h0.e();
        long q11 = user.q();
        Vasistas.Category category = Vasistas.Category.MOTION;
        Vasistas h11 = e11.h(q11, category);
        Vasistas j5 = h0.e().j(user.q(), category);
        if (j5 != null) {
            i g11 = x().g();
            x70.b.c(this, g11, "Last not synced motion vasistas = " + j5, new Object[0]);
        }
        if (h11 != null) {
            i g12 = x().g();
            x70.b.c(this, g12, "Last synced motion vasistas = " + h11, new Object[0]);
        }
    }

    private final void M(long j5, User user) throws IOException, InterruptedException, ConversationException, WaitForInput.CancelException {
        E(new Hwa0102InitConversation(user));
        x70.b.c(this, x().g(), "Synchronizing motion vasistas", user);
        l lVar = new l(x(), user, Vasistas.Category.MOTION, this.f54164f, j5);
        this.f54167i = lVar;
        lVar.g(r());
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        Device f11;
        int c11 = x().c();
        e eVar = this.f54165g;
        if (c11 == 5) {
            if (u70.a.b().e() && (f11 = eVar.f(v())) != null) {
                Hwa0102UpgradeSetup hwa0102UpgradeSetup = new Hwa0102UpgradeSetup(f11.getModel(), true);
                SetupConversation setupConversation = (SetupConversation) w.w().O(x(), new SetupConversation(hwa0102UpgradeSetup, new com.withings.devicesetup.ui.e(r(), hwa0102UpgradeSetup)), SetupConversation.class);
                return;
            }
            return;
        }
        m70.i b10 = m70.i.b();
        u.i(b10, "get(...)");
        CheckDeviceLinkConversation checkDeviceLinkConversation = new CheckDeviceLinkConversation(this.f54166h, eVar, b10);
        E(checkDeviceLinkConversation);
        User M = checkDeviceLinkConversation.M();
        Device L = checkDeviceLinkConversation.L();
        e c12 = e.c();
        u.i(c12, "get(...)");
        E(new GetAndStoreBatteryConversation(L, c12));
        a aVar = this.f54164f;
        if (aVar != null) {
            Context r7 = r();
            u.i(r7, "getContext(...)");
            cj.b x11 = x();
            u.i(x11, "getWppDevice(...)");
            ((b) aVar).c(r7, x11, M);
        }
        try {
            x70.b.c(this, x().g(), "Before synchronizing, here are a few stats", M);
            L(M);
        } catch (Exception e11) {
            x70.b.h(this, x().g(), e11, "Could not log last synced and not synced vasistas", new Object[0]);
        }
        try {
            M(L.getId(), M);
            SyncReminderNotificationManager.a(r(), L.getId());
            if (aVar != null) {
                ((b) aVar).b();
            }
            try {
                x70.b.c(this, x().g(), "Synchronisation ended with the device... we now send vasistas to platform...", M);
                L(M);
            } catch (Exception e12) {
                x70.b.h(this, x().g(), e12, "Could not log last synced vasistas and not synced", new Object[0]);
            }
            oi0.b.h().n(M, ConstantsWs.CALLCTX_TRACKER_DEVICE_SYNC);
            Context r11 = r();
            u.i(r11, "getContext(...)");
            d dVar = new d(r11);
            com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
            u.i(a11, "get(...)");
            q().B(new DebugDumpConversation(a11, new jl.b(eVar), dVar, new c(0L)), DebugDumpConversation.class, new Object());
            E(new SafeCheckForUpgradeConversation());
            x70.b.c(this, x().g(), "Synchronisation ended, without error", new Object[0]);
        } catch (Throwable th2) {
            if (aVar != null) {
                ((b) aVar).b();
            }
            try {
                x70.b.c(this, x().g(), "Synchronisation ended with the device... we now send vasistas to platform...", M);
                L(M);
            } catch (Exception e13) {
                x70.b.h(this, x().g(), e13, "Could not log last synced vasistas and not synced", new Object[0]);
            }
            oi0.b.h().n(M, ConstantsWs.CALLCTX_TRACKER_DEVICE_SYNC);
            throw th2;
        }
    }

    @Override // zh0.j.a
    public final boolean b() {
        l lVar = this.f54167i;
        if (lVar != null) {
            return lVar.a();
        }
        return false;
    }

    @Override // zh0.j.a
    public final boolean l() {
        return false;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return null;
    }
}
