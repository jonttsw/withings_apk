package com.withings.devicesetup.upgrade.conversation;

import androidx.activity.a0;
import com.google.gson.JsonObject;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.Traces;
import com.withings.comm.wpp.generated.object.ProbeReply;
import com.withings.device.Device;
import com.withings.device.ws.DeviceApi;
import com.withings.device.ws.FirmwareUpgrade;
import com.withings.devicesetup.DeviceSessionConversation;
import com.withings.webservices.legacy.Webservices;
import com.withings.webservices.legacy.WsFailer;
import com.withings.webservices.legacy.common.SessionIdProvider;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.u;
import u70.i;
import xp.c;
/* compiled from: CheckForUpgradeConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/devicesetup/upgrade/conversation/CheckForUpgradeConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "device-setup-legacy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CheckForUpgradeConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final Webservices f37954f;

    /* renamed from: g  reason: collision with root package name */
    private final e f37955g;

    /* renamed from: h  reason: collision with root package name */
    private final com.withings.comm.trace.e f37956h;

    /* renamed from: i  reason: collision with root package name */
    private final eq.a f37957i;

    /* renamed from: j  reason: collision with root package name */
    private FirmwareUpgrade f37958j;

    public CheckForUpgradeConversation() {
        this(null, null, null, 15);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [xp.b, T] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        String str;
        if (x().i().softVersion == 0) {
            x70.b.m(this, v(), "Check for upgrade has been skipped because this is a dev firmware (softVersion == 0)", new Object[0]);
        } else if (this.f37957i.get()) {
            x70.b.m(this, v(), "Check for upgrade has been skipped because this is a fqa account", new Object[0]);
        } else {
            ProbeReply i11 = x().i();
            long j5 = i11.softVersion;
            try {
                p0 p0Var = new p0();
                String secret = i11.secret;
                u.i(secret, "secret");
                String str2 = null;
                if (secret.length() > 0) {
                    p0Var.f76257a = new xp.b(i11);
                } else {
                    E(new DeviceSessionConversation(new b(p0Var), null, 14));
                }
                Object build = this.f37954f.getApiBuilder().setSessionIdProvider((SessionIdProvider) p0Var.f76257a).build(DeviceApi.class);
                u.i(build, "build(...)");
                FirmwareUpgrade firmwareUpgrade$default = DeviceApi.getFirmwareUpgrade$default((DeviceApi) build, j5, null, 2, null);
                this.f37958j = firmwareUpgrade$default;
                if (firmwareUpgrade$default != null) {
                    str = firmwareUpgrade$default.url;
                } else {
                    str = null;
                }
                i c11 = i.c(x().i().mac);
                e eVar = this.f37955g;
                Device f11 = eVar.f(c11);
                if (f11 != null) {
                    f11.setUpgradeUrl(str);
                    eVar.t(f11);
                }
                cj.b x11 = x();
                boolean M = M();
                FirmwareUpgrade firmwareUpgrade = this.f37958j;
                if (firmwareUpgrade != null) {
                    str2 = firmwareUpgrade.url;
                }
                JsonObject a11 = Traces.a("update_firmware_check");
                a11.addProperty("firmware_available", Boolean.valueOf(M));
                a11.addProperty("firmware_url", str2);
                a11.addProperty("no_update_account", Boolean.FALSE);
                this.f37956h.d(x11, a11);
            } catch (Exception e11) {
                if (WsFailer.isNetworkException(e11)) {
                    throw new Exception();
                }
                throw e11;
            }
        }
    }

    public final FirmwareUpgrade L() {
        return this.f37958j;
    }

    public final boolean M() {
        int i11;
        FirmwareUpgrade firmwareUpgrade = this.f37958j;
        if (firmwareUpgrade == null) {
            return false;
        }
        x70.b.s(this, v(), a0.b("New firmware with version : ", firmwareUpgrade.version), new Object[0]);
        String str = firmwareUpgrade.version;
        if (str != null) {
            i11 = Integer.parseInt(str);
        } else {
            i11 = -1;
        }
        String str2 = firmwareUpgrade.url;
        if (str2 == null || str2.length() == 0 || i11 <= 0 || i11 == x().i().softVersion) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CheckForUpgradeConversation(Webservices webservices, e deviceManager, com.withings.comm.trace.e traceManager) {
        this(webservices, deviceManager, traceManager, 8);
        u.j(webservices, "webservices");
        u.j(deviceManager, "deviceManager");
        u.j(traceManager, "traceManager");
    }

    public CheckForUpgradeConversation(Webservices webservices, e deviceManager, com.withings.comm.trace.e traceManager, int i11) {
        if ((i11 & 1) != 0) {
            webservices = Webservices.get();
            u.i(webservices, "get(...)");
        }
        if ((i11 & 2) != 0) {
            deviceManager = e.c();
            u.i(deviceManager, "get(...)");
        }
        if ((i11 & 4) != 0) {
            traceManager = com.withings.comm.trace.e.a();
            u.i(traceManager, "get(...)");
        }
        eq.a isFqaRepository = ((vb0.c) c.a.a()).d();
        u.j(webservices, "webservices");
        u.j(deviceManager, "deviceManager");
        u.j(traceManager, "traceManager");
        u.j(isFqaRepository, "isFqaRepository");
        this.f37954f = webservices;
        this.f37955g = deviceManager;
        this.f37956h = traceManager;
        this.f37957i = isFqaRepository;
    }
}
