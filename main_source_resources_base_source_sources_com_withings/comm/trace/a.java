package com.withings.comm.trace;

import android.os.Build;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonObject;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.remote.conversation.WppDeviceSetupConversation;
import com.withings.comm.trace.Traces;
import com.withings.comm.wpp.generated.object.ProbeReply;
import com.withings.library.authentication.api.ConstantsWs;
import ej.f;
import ej.w;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.TimeZone;
import org.joda.time.DateTime;
import vb0.i;
import vi.o;
import zi.h;
/* compiled from: TraceConnectionManagerListener.java */
/* loaded from: classes3.dex */
public final class a extends f.d {

    /* renamed from: a  reason: collision with root package name */
    private e f33188a;

    /* renamed from: b  reason: collision with root package name */
    private w.d f33189b;

    /* renamed from: c  reason: collision with root package name */
    private com.withings.comm.wpp.e f33190c;

    /* renamed from: d  reason: collision with root package name */
    private com.withings.comm.wpp.b f33191d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f33192e;

    public a(e eVar, w.d dVar) {
        this.f33188a = eVar;
        this.f33189b = dVar;
    }

    private void c(cj.b bVar) {
        if (this.f33190c != null) {
            if (((i) this.f33189b).n(bVar.g())) {
                ArrayList a11 = this.f33190c.a();
                if (!a11.isEmpty()) {
                    e eVar = this.f33188a;
                    eVar.getClass();
                    eVar.g(bVar.i().mac, 2, a11);
                }
            }
        }
    }

    private void h(WppDeviceSetupConversation wppDeviceSetupConversation, cj.b bVar) {
        com.withings.comm.wpp.b bVar2;
        if (wppDeviceSetupConversation.L() && (bVar2 = this.f33191d) != null) {
            ArrayList a11 = bVar2.a();
            this.f33191d.g();
            if (((i) this.f33189b).n(bVar.g()) && !a11.isEmpty()) {
                x70.b.l(this, "Saving " + a11.size() + " setup logs", new Object[0]);
                e eVar = this.f33188a;
                eVar.getClass();
                eVar.g(bVar.i().mac, 8, a11);
            }
        }
    }

    @Override // ej.f.d, ej.f.c
    public final void b(f fVar) {
        com.withings.comm.wpp.e eVar = new com.withings.comm.wpp.e(fVar.v());
        this.f33190c = eVar;
        eVar.d();
        this.f33191d = new com.withings.comm.wpp.b(fVar.v());
    }

    @Override // ej.f.d, ej.f.c
    public final void f(f fVar, WppDeviceConversation wppDeviceConversation, ConversationException conversationException) {
        c(fVar.v());
        if (wppDeviceConversation instanceof WppDeviceSetupConversation) {
            h((WppDeviceSetupConversation) wppDeviceConversation, fVar.v());
        }
    }

    @Override // ej.f.c
    public final void g(f fVar) {
        Traces.DisconnectStatus disconnectStatus;
        cj.b v11 = fVar.v();
        if (v11.i() != null) {
            c(v11);
            if (this.f33192e) {
                disconnectStatus = Traces.DisconnectStatus.f33178a;
            } else {
                disconnectStatus = Traces.DisconnectStatus.f33179b;
            }
            JsonObject a11 = Traces.a("end");
            a11.addProperty("disconnect_status", disconnectStatus.toString());
            this.f33188a.d(v11, a11);
        }
    }

    @Override // ej.f.d, ej.f.c
    public final void j(f fVar, WppDeviceConversation wppDeviceConversation) {
        c(fVar.v());
        if ((wppDeviceConversation instanceof WppDeviceSetupConversation) && ((WppDeviceSetupConversation) wppDeviceConversation).L()) {
            this.f33191d.d();
        }
    }

    @Override // ej.f.d, ej.f.c
    public final void k(f fVar) {
        this.f33192e = true;
    }

    @Override // ej.f.d, ej.f.c
    public final void l(f fVar) {
        Traces.ConnectionSupport connectionSupport;
        Traces.ConnectReason connectReason;
        cj.b v11 = fVar.v();
        String displayName = TimeZone.getDefault().getDisplayName(true, 0);
        xi.b j5 = v11.j();
        if (j5 instanceof o) {
            connectionSupport = Traces.ConnectionSupport.f33175b;
        } else if (j5 instanceof wi.c) {
            connectionSupport = Traces.ConnectionSupport.f33174a;
        } else if (j5 instanceof h) {
            connectionSupport = Traces.ConnectionSupport.f33176c;
        } else {
            throw new IllegalArgumentException("Unknown device type : " + j5.getClass());
        }
        JsonObject a11 = Traces.a("start");
        a11.addProperty("connection_support", connectionSupport.toString());
        e eVar = this.f33188a;
        eVar.d(v11, a11);
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        JsonObject a12 = Traces.a("platform");
        a12.addProperty("os", "android");
        a12.addProperty("os_version", str);
        a12.addProperty("hardware_model", str2);
        a12.addProperty("timezone", displayName);
        eVar.d(v11, a12);
        ProbeReply i11 = v11.i();
        String str3 = i11.mac;
        String str4 = i11.name;
        String str5 = i11.mfgId;
        int i12 = (int) i11.softVersion;
        int i13 = (int) i11.blVersion;
        int c11 = v11.c();
        if (c11 == 1) {
            connectReason = Traces.ConnectReason.f33169a;
        } else if (c11 == 2) {
            connectReason = Traces.ConnectReason.f33170b;
        } else if (c11 == 3) {
            connectReason = Traces.ConnectReason.f33171c;
        } else {
            connectReason = Traces.ConnectReason.f33172d;
        }
        JsonObject a13 = Traces.a("device");
        a13.addProperty("mac", str3);
        a13.addProperty("name", str4);
        a13.addProperty(ConstantsWs.JSON_SESSION_KEY_MFGID, str5);
        a13.addProperty("firmware_version", Integer.valueOf(i12));
        a13.addProperty("bootloader_version", Integer.valueOf(i13));
        a13.addProperty("connect_reason", connectReason.toString());
        eVar.d(v11, a13);
        w.d dVar = this.f33189b;
        dVar.getClass();
        i iVar = (i) dVar;
        DateTime b10 = iVar.b();
        Traces.AppStatus c12 = iVar.c();
        JsonObject a14 = Traces.a("app");
        a14.addProperty("name", "HealthMate");
        a14.addProperty("version", "6.4.0");
        a14.addProperty(FirebaseAnalytics.Param.START_DATE, Traces.b(b10));
        a14.addProperty("status", c12.toString());
        eVar.d(v11, a14);
        int a15 = iVar.a();
        JsonObject a16 = Traces.a("sensitive_data");
        a16.addProperty("account_id", Integer.valueOf(a15));
        eVar.d(v11, a16);
    }

    @Override // ej.f.d, ej.f.c
    public final void m(f fVar, WppDeviceConversation wppDeviceConversation) {
        c(fVar.v());
        if (wppDeviceConversation instanceof WppDeviceSetupConversation) {
            h((WppDeviceSetupConversation) wppDeviceConversation, fVar.v());
        }
    }

    @Override // ej.f.c
    public final void n(f fVar, Exception exc) {
        cj.b v11 = fVar.v();
        if (v11.i() != null) {
            String message = exc.getMessage();
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            JsonObject a11 = Traces.a("error");
            a11.addProperty("message", message);
            a11.addProperty("detail", stringWriter2);
            this.f33188a.d(v11, a11);
        }
    }
}
