package com.withings.devicesetup.upgrade.conversation;

import android.os.SystemClock;
import cj.c;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.remote.exception.ConnectionClosedException;
import com.withings.comm.remote.exception.DeviceNotFoundException;
import com.withings.comm.trace.Traces;
import com.withings.comm.wpp.d;
import com.withings.comm.wpp.f;
import com.withings.comm.wpp.generated.object.ProbeReply;
import com.withings.comm.wpp.h;
import com.withings.device.Device;
import com.withings.webservices.legacy.Webservices;
import gj.k;
import gj.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kn.e;
import nj.d;
/* loaded from: classes3.dex */
public class NetUpgradeConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final int f37959f;

    /* renamed from: g  reason: collision with root package name */
    private eq.c f37960g;

    /* renamed from: h  reason: collision with root package name */
    private long f37961h = 0;

    /* renamed from: i  reason: collision with root package name */
    private float f37962i;

    /* renamed from: j  reason: collision with root package name */
    private short f37963j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f37964k;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList f37965l;

    public NetUpgradeConversation(zp.a aVar, int i11) {
        this.f37959f = i11;
        this.f37960g = aVar;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        this.f37965l = x().k().h();
        CheckForUpgradeConversation checkForUpgradeConversation = new CheckForUpgradeConversation(Webservices.get(), e.c(), com.withings.comm.trace.e.a());
        E(checkForUpgradeConversation);
        boolean M = checkForUpgradeConversation.M();
        eq.c cVar = this.f37960g;
        if (M) {
            cVar.K();
            this.f37961h = SystemClock.uptimeMillis();
            this.f37964k = false;
            x70.b.s(this, v(), "Starting upgrade of %s", x());
            int i11 = this.f37959f;
            if (i11 == 3) {
                try {
                    x().k().e();
                } catch (ConnectionClosedException e11) {
                    if (i11 == 3) {
                        x70.b.h(this, v(), e11, "The device lost bluetooth connection during internet upgrade, launch scan for xmpp reboot event", new Object[0]);
                        this.f37964k = true;
                        long uptimeMillis = (1.0f - this.f37962i) * ((float) (SystemClock.uptimeMillis() - this.f37961h));
                        x70.b.g(this, v(), "Expecting reboot after : ".concat(String.valueOf(uptimeMillis + " ms")), new Object[0]);
                        Thread.sleep(uptimeMillis);
                        try {
                            new m(x()).c();
                            x70.b.g(this, v(), "WaitForXmppDetection passed after expected delay", new Object[0]);
                        } catch (DeviceNotFoundException e12) {
                            x70.b.h(this, v(), e12, "Device not detected on xmpp server after reboot", new Object[0]);
                        }
                    } else {
                        throw e11;
                    }
                }
            }
            new d(x().k(), new c(this)).b();
            x70.b.s(this, v(), "Upgrade of %s finished with result %d", x(), Short.valueOf(this.f37963j));
            if (this.f37963j != 0) {
                short s11 = this.f37963j;
                throw new IOException("Upgrade failed with result : " + ((int) s11));
            }
            if (!this.f37964k) {
                x70.b.s(this, v(), "Asking %s for reboot", x());
                x().k().e();
                x().k().j(new f((byte) 1, (short) 1041, new h[0]));
                cVar.q3();
                if (i11 == 2) {
                    cj.b d11 = new k(x().g(), (c.a) y(), z(), cj.d.a(x())).d();
                    com.withings.comm.wpp.d k11 = d11.k();
                    Iterator it = this.f37965l.iterator();
                    while (it.hasNext()) {
                        k11.b((d.b) it.next());
                    }
                    x().A(k11);
                    x().y(d11.i());
                    x().v(d11.c());
                    ProbeReply i12 = x().i();
                    Device e13 = e.c().e(i12.mac);
                    if (e13 != null) {
                        e13.setFirmware((int) i12.softVersion);
                        e.c().t(e13);
                    }
                } else if (i11 == 3) {
                    try {
                        new m(x()).c();
                    } catch (DeviceNotFoundException e14) {
                        x70.b.h(this, v(), e14, "Device not detected on xmpp server after reboot", new Object[0]);
                    }
                }
            }
            com.withings.comm.trace.e.a().d(x(), Traces.d(com.withings.comm.trace.e.b(x().c()), (int) x().i().softVersion));
            return;
        }
        x70.b.s(this, v(), "There is no upgrade for %s", x());
        cVar.W1(this);
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return this.f37960g;
    }
}
