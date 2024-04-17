package com.withings.wiscale2.device.wpa.wpa02.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.remote.exception.ConnectionClosedException;
import com.withings.comm.wpp.d;
import com.withings.comm.wpp.f;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.generated.object.CartridgeState;
import com.withings.comm.wpp.generated.object.StripCount;
import com.withings.comm.wpp.h;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import me0.e;
import nm0.k;
import nm0.l;
/* compiled from: Wpa02CartridgeConversation.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/conversation/Wpa02CartridgeConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "Lcom/withings/comm/wpp/d$b;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpa02CartridgeConversation extends WppDeviceConversation implements d.b {

    /* renamed from: f  reason: collision with root package name */
    private final me0.c f55030f;

    public Wpa02CartridgeConversation(me0.c cVar) {
        this.f55030f = cVar;
        e.b(cVar);
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    protected final void A() {
        d k11;
        int i11 = e.f81986b;
        e.c(this.f55030f);
        cj.b x11 = x();
        if (x11 != null && (k11 = x11.k()) != null) {
            k11.i(this);
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        x().k().b(this);
        L();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [nj.h, nj.a] */
    public final void L() throws IOException, ConnectionClosedException {
        Object a11;
        try {
            x70.b.b(this, "Cartridge ".concat("getting info"), new Object[0]);
            ?? aVar = new nj.a(x());
            aVar.u(30000L);
            aVar.c(Wpp.CMD_GET_CARTRIDGE_DEVICE_INFO_FROM_DEVICE, new h[0]);
            a11 = (CartridgeState) aVar.y(CartridgeState.class);
        } catch (Throwable th2) {
            a11 = l.a(th2);
        }
        Throwable b10 = k.b(a11);
        if (b10 != null) {
            b10.printStackTrace();
            if (!(b10 instanceof NullPointerException)) {
                boolean z5 = b10 instanceof ConnectionClosedException;
                me0.c cVar = this.f55030f;
                if (z5) {
                    cVar.f();
                } else {
                    cVar.q(b10);
                }
            }
        }
        if (a11 instanceof k.a) {
            a11 = null;
        }
        CartridgeState cartridgeState = (CartridgeState) a11;
    }

    public final void M() {
        me0.c cVar = this.f55030f;
        if (cVar instanceof me0.a) {
            try {
                x70.b.b(this, "Cartridge get strip count", new Object[0]);
                nj.c cVar2 = new nj.c(x());
                cVar2.c((short) 2463, new h[0]);
                ((me0.a) cVar).e(cVar2.A(StripCount.class));
            } catch (Exception e11) {
                cVar.q(e11);
            }
        }
    }

    @Override // com.withings.comm.wpp.d.b
    public final void i(d connection) {
        u.j(connection, "connection");
        this.f55030f.f();
    }

    @Override // com.withings.comm.wpp.d.b
    public final void o(d wppConnection, f fVar) {
        u.j(wppConnection, "wppConnection");
        new ve0.a(this.f55030f, null, 2).a(x().m(), fVar);
    }
}
