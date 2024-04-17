package com.withings.wiscale2.device.wpa.wpa02.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.remote.exception.ConnectionClosedException;
import com.withings.comm.wpp.d;
import com.withings.comm.wpp.f;
import com.withings.comm.wpp.generated.object.CleansingModeStart;
import com.withings.comm.wpp.generated.object.CleansingModeStatus;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.wpa.wpa02.conversation.a;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.k;
import nm0.l;
/* compiled from: Wpa02CleansingConversation.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/conversation/Wpa02CleansingConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "Lcom/withings/comm/wpp/d$b;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpa02CleansingConversation extends WppDeviceConversation implements d.b {

    /* renamed from: f  reason: collision with root package name */
    private final me0.d f55031f;

    public Wpa02CleansingConversation(me0.d dVar) {
        this.f55031f = dVar;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    protected final void A() {
        d k11;
        cj.b x11 = x();
        if (x11 != null && (k11 = x11.k()) != null) {
            k11.i(this);
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        Object a11;
        a c0727a;
        x().k().b(this);
        try {
            ?? aVar = new nj.a(x());
            aVar.c((short) 2485, new CleansingModeStart().setMode((short) 1));
            a11 = (CleansingModeStatus) aVar.y(CleansingModeStatus.class);
        } catch (Throwable th2) {
            a11 = l.a(th2);
        }
        Throwable b10 = k.b(a11);
        me0.d dVar = this.f55031f;
        if (b10 != null) {
            b10.printStackTrace();
            if (b10 instanceof ConnectionClosedException) {
                dVar.f();
            } else {
                dVar.o(new a.C0727a());
            }
        }
        if (true ^ (a11 instanceof k.a)) {
            CleansingModeStatus cleansingModeStatus = (CleansingModeStatus) a11;
            short s11 = cleansingModeStatus.status;
            if (s11 == 2) {
                dVar.Q();
                return;
            }
            if (s11 == 3) {
                c0727a = new a(C1987R.string.device_error, C1987R.string.wpa_not_installed);
            } else if (s11 == 4) {
                c0727a = new a.c(0);
            } else if (s11 == 5) {
                c0727a = new a(C1987R.string.device_error, C1987R.string.wpa_hood_open);
            } else if (s11 == 6) {
                c0727a = new a(C1987R.string.device_error, C1987R.string.device_low_battery);
            } else if (s11 == 7) {
                c0727a = new a.f(cleansingModeStatus.timeoutCleansingOngoingSec);
            } else {
                c0727a = new a.C0727a();
            }
            dVar.o(c0727a);
        }
    }

    @Override // com.withings.comm.wpp.d.b
    public final void i(d connection) {
        u.j(connection, "connection");
        this.f55031f.f();
    }

    @Override // com.withings.comm.wpp.d.b
    public final void o(d dVar, f fVar) {
    }
}
