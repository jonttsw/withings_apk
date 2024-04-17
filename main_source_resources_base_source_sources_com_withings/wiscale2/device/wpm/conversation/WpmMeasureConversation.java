package com.withings.wiscale2.device.wpm.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.BatteryPercent;
import com.withings.comm.wpp.generated.object.WpmEvent;
import com.withings.comm.wpp.h;
import com.withings.device.Device;
import com.withings.wiscale2.device.wpm.conversation.b;
import com.withings.wiscale2.notification.i;
import java.io.IOException;
import jk0.c;
import kn.e;
import we0.l;
import xe0.d;
/* loaded from: classes5.dex */
public class WpmMeasureConversation extends WppDeviceConversation implements b.a {

    /* renamed from: g  reason: collision with root package name */
    private a f55596g;

    /* renamed from: i  reason: collision with root package name */
    private boolean f55598i;

    /* renamed from: j  reason: collision with root package name */
    private b f55599j;

    /* renamed from: k  reason: collision with root package name */
    private BatteryPercent f55600k;

    /* renamed from: f  reason: collision with root package name */
    private int f55595f = 2;

    /* renamed from: h  reason: collision with root package name */
    private boolean f55597h = false;

    /* loaded from: classes5.dex */
    public interface a extends WppDeviceConversation.b {
    }

    public WpmMeasureConversation(com.withings.wiscale2.device.wpm.conversation.a aVar) {
        this.f55596g = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nj.h, nj.a] */
    private void L() throws IOException {
        ?? aVar = new nj.a(x());
        aVar.c((short) 261, new h[0]);
        this.f55600k = (BatteryPercent) aVar.y(BatteryPercent.class);
        x70.b.r(this, "Wpm02StatusEnd() battery_percent level = " + this.f55600k.percent, new Object[0]);
        this.f55596g.getClass();
        if (this.f55600k.percent <= 10) {
            this.f55598i = true;
        }
        e c11 = e.c();
        Device e11 = c11.e(x().i().mac);
        if (e11 != null) {
            e11.setBatteryLevel(this.f55600k.percent);
            c11.t(e11);
        }
    }

    private void T() {
        if (this.f55598i) {
            BatteryPercent batteryPercent = this.f55600k;
            ((com.withings.wiscale2.device.wpm.conversation.a) this.f55596g).getClass();
            c b10 = c.b();
            int i11 = batteryPercent.percent;
            b10.d(new Object());
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws WaitForInput.CancelException, IOException, ConversationException, InterruptedException {
        a aVar = this.f55596g;
        try {
            try {
                ((com.withings.wiscale2.device.wpm.conversation.a) aVar).a(this);
                L();
                this.f55597h = true;
                ((com.withings.wiscale2.device.wpm.conversation.a) aVar).getClass();
                c.b().d(new Object());
                T();
                B(120000L, false, true);
                while (!((Boolean) K()).booleanValue()) {
                    b bVar = new b(this);
                    this.f55599j = bVar;
                    bVar.a(this);
                }
            } catch (Exception e11) {
                throw e11;
            }
        } finally {
            ((com.withings.wiscale2.device.wpm.conversation.a) aVar).getClass();
            i.a();
        }
    }

    public final boolean M() {
        return this.f55597h;
    }

    public final boolean N() {
        if (this.f55597h && this.f55595f == 2) {
            return true;
        }
        return false;
    }

    public final void O(WpmEvent wpmEvent) {
        com.withings.wiscale2.device.wpm.conversation.a aVar = (com.withings.wiscale2.device.wpm.conversation.a) this.f55596g;
        aVar.getClass();
        if (wpmEvent.event == 1) {
            x70.b.r(aVar, "deflating", new Object[0]);
            c.b().d(new d(0.6f));
        }
    }

    public final void P() {
        b bVar = this.f55599j;
        if (bVar != null) {
            bVar.b();
        }
        this.f55595f = 2;
        ((com.withings.wiscale2.device.wpm.conversation.a) this.f55596g).b();
    }

    public final void Q(l lVar) {
        this.f55595f = 2;
        ((com.withings.wiscale2.device.wpm.conversation.a) this.f55596g).c(x().i(), lVar);
    }

    public final void R(int i11) {
        ((com.withings.wiscale2.device.wpm.conversation.a) this.f55596g).getClass();
        c.b().d(new xe0.c(i11));
    }

    public final void S(float f11) {
        ((com.withings.wiscale2.device.wpm.conversation.a) this.f55596g).getClass();
        c.b().d(new d(f11));
    }

    public final void U() {
        b bVar = this.f55599j;
        if (bVar != null) {
            try {
                bVar.c();
            } catch (IOException unused) {
                this.f55599j.b();
            }
        }
    }

    public final void V() {
        x70.b.r(this, "takeAMeasure()", new Object[0]);
        ((com.withings.wiscale2.device.wpm.conversation.a) this.f55596g).d();
        if (this.f55595f != 1) {
            this.f55595f = 0;
        }
        G(Boolean.FALSE);
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return this.f55596g;
    }
}
