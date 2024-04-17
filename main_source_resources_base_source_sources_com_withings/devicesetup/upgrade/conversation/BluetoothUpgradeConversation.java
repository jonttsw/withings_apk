package com.withings.devicesetup.upgrade.conversation;

import aj.b;
import cj.c;
import cj.d;
import com.google.gson.JsonObject;
import com.withings.comm.network.common.exception.ConnectionFailException;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.remote.exception.ConnectionClosedException;
import com.withings.comm.trace.Traces;
import com.withings.comm.wpp.d;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.comm.wpp.f;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.generated.object.FwChunkRequest;
import com.withings.comm.wpp.generated.object.FwInfo;
import com.withings.comm.wpp.generated.object.RebootReason;
import com.withings.comm.wpp.generated.object.ReturnCode;
import com.withings.comm.wpp.generated.object.Silent;
import com.withings.comm.wpp.h;
import com.withings.device.Device;
import com.withings.device.ws.DeviceSessionFactory;
import com.withings.device.ws.FirmwareUpgrade;
import com.withings.devicesetup.DeviceSessionConversation;
import com.withings.devicesetup.upgrade.exception.CorruptedFirmwareException;
import com.withings.webservices.legacy.Webservices;
import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import gj.k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.zip.CRC32;
import kn.e;
import nj.j;
import u70.i;
/* loaded from: classes3.dex */
public class BluetoothUpgradeConversation extends WppDeviceConversation implements j.a {

    /* renamed from: f  reason: collision with root package name */
    private final fq.a f37949f;

    /* renamed from: g  reason: collision with root package name */
    private FirmwareUpgrade f37950g;

    /* renamed from: h  reason: collision with root package name */
    private j f37951h;

    /* renamed from: i  reason: collision with root package name */
    private float f37952i = 0.0f;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList f37953j;

    /* JADX WARN: Multi-variable type inference failed */
    public BluetoothUpgradeConversation(zp.a aVar) {
        this.f37949f = aVar == null ? new Object() : aVar;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    protected final void A() {
        boolean z5 = b.a.c(x()).c() instanceof c.d;
        j jVar = this.f37951h;
        if (jVar != null && !z5) {
            jVar.a();
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, InterruptedException, WaitForInput.CancelException, ConversationException {
        if (w() == WppDeviceConversation.State.f33151c) {
            return;
        }
        if (this.f37950g == null) {
            CheckForUpgradeConversation checkForUpgradeConversation = new CheckForUpgradeConversation(Webservices.get(), e.c(), com.withings.comm.trace.e.a());
            E(checkForUpgradeConversation);
            if (checkForUpgradeConversation.M()) {
                this.f37950g = checkForUpgradeConversation.L();
                N();
                return;
            }
            x70.b.s(this, v(), "There is no upgrade for %s", x());
            this.f37949f.X1(this);
            return;
        }
        i v11 = v();
        x70.b.s(this, v11, "Upgrade to : " + this.f37950g.version, new Object[0]);
        N();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [nj.h, nj.a] */
    public final void M(ByteBuffer byteBuffer) throws IOException {
        int i11;
        x().k().l("Logs are disabled for upgrade...", true);
        do {
            ?? aVar = new nj.a(x());
            h[] hVarArr = new h[2];
            try {
                CRC32 crc32 = new CRC32();
                crc32.update(byteBuffer.array());
                hVarArr[0] = new FwInfo().setSha1(hq.a.d(byteBuffer)).setCrc(crc32.getValue()).setSize(byteBuffer.array().length).setVersion(Long.parseLong(this.f37950g.version));
                hVarArr[1] = new Silent().setValue((short) 0);
                aVar.c((short) 2407, hVarArr);
                aVar.j();
                long j5 = ((ReturnCode) aVar.B(ReturnCode.class)).f33265rc;
                i11 = (j5 > 0L ? 1 : (j5 == 0L ? 0 : -1));
                fq.a aVar2 = this.f37949f;
                if (i11 == 0) {
                    FwChunkRequest fwChunkRequest = (FwChunkRequest) aVar.B(FwChunkRequest.class);
                    ArrayList a11 = hq.a.a(fwChunkRequest.packetMaxSize, hq.a.c((int) fwChunkRequest.offset, (int) fwChunkRequest.size, byteBuffer), fwChunkRequest.offset);
                    nj.a aVar3 = new nj.a(x());
                    aVar3.b(a11, (short) 2408);
                    aVar3.j();
                    aVar2.L0(fwChunkRequest.percent / 100.0f);
                } else if (j5 == 1) {
                    aVar2.L0(1.0f);
                }
                if (w() == WppDeviceConversation.State.f33151c) {
                    throw new IOException("Upgrade has been cancelled");
                }
            } catch (Exception unused) {
                throw new IOException();
            }
        } while (i11 == 0);
        x().k().l("Upgrade done. Logs are enabled again.", false);
        j();
        try {
            nj.a aVar4 = new nj.a(x());
            aVar4.c(Wpp.CMD_REBOOT, new RebootReason().setValue(2));
            aVar4.j();
        } catch (ConnectionClosedException unused2) {
            x70.b.r(this, "Connection closed after remote device rebooted", new Object[0]);
        }
        com.withings.comm.trace.e.a().d(x(), Traces.a("update_firmware_sent"));
    }

    public final void N() throws IOException, InterruptedException, WaitForInput.CancelException, ConversationException {
        this.f37953j = x().k().h();
        fq.a aVar = this.f37949f;
        aVar.l0();
        FirmwareUpgrade firmwareUpgrade = this.f37950g;
        try {
            aVar.J1();
            ByteBuffer download = Webservices.get().download(firmwareUpgrade.url, new a(this));
            String b10 = hq.a.b(download);
            String str = firmwareUpgrade.md5;
            if (str != null && !b10.equals(str)) {
                throw new CorruptedFirmwareException(firmwareUpgrade.url, firmwareUpgrade.md5, b10);
            }
            aVar.A2(this, firmwareUpgrade);
            com.withings.comm.trace.e.a().d(x(), Traces.c(download.capacity(), firmwareUpgrade.url, true));
            if ((y() instanceof c.d) && !((c.d) y()).c(x())) {
                x().k().e();
                x().k().j(new f((byte) 1, (short) 294, new h[0]));
                aVar.O1();
                int[] iArr = {4, 5};
                x().z(new gj.h(d.a(x())).d());
                try {
                    x().p();
                    x().l(z());
                    x().k().a(this.f37953j);
                    if (!androidx.health.connect.client.units.d.f(iArr, x().c())) {
                        throw new IOException("Reason code should be " + Arrays.toString(iArr));
                    }
                } catch (ConnectionFailException e11) {
                    Iterator it = this.f37953j.iterator();
                    while (it.hasNext()) {
                        ((d.b) it.next()).i(x().k());
                    }
                    throw new IOException("Unable to reconnect to firmware", e11);
                }
            }
            try {
                M(download);
            } catch (UnsupportedCommandException unused) {
                x().k().l("Logs are disabled for upgrade...", true);
                aVar.L0(0.0f);
                this.f37951h = new j(x(), this);
                if (w() == WppDeviceConversation.State.f33151c) {
                    this.f37951h.a();
                }
                this.f37951h.d(download);
                aVar.L0(1.0f);
                x().k().l("Upgrade done. Logs are enabled again.", false);
                com.withings.comm.trace.e.a().d(x(), Traces.a("update_firmware_sent"));
            }
            DeviceSessionFactory.get().remove(v());
            aVar.p1(this, this.f37950g);
            try {
                cj.b d11 = new k(x().g(), y(), z(), cj.d.a(x())).d();
                if (d11.c() != 3 && d11.c() != 2) {
                    try {
                        d11.a();
                    } catch (Exception e12) {
                        i g11 = d11.g();
                        int i11 = x70.b.f106693c;
                        x70.b.h(d11, g11, e12, e12.getMessage(), new Object[0]);
                    }
                    throw new IOException("Device didn't reconnect with firm_update connect reason");
                }
                x().z(d11.j());
                com.withings.comm.wpp.d k11 = d11.k();
                k11.a(this.f37953j);
                x().A(k11);
                x().y(d11.i());
                x().v(d11.c());
                e c11 = e.c();
                Device e13 = c11.e(x().i().mac);
                if (e13 != null) {
                    e13.setFirmware((int) x().i().softVersion);
                    e13.setUpgradeUrl(null);
                    c11.t(e13);
                }
                try {
                    if (x().i().secret.isEmpty()) {
                        E(new DeviceSessionConversation());
                    } else {
                        DeviceSessionFactory.get().getNewSession(new xp.b(x().i()).c());
                    }
                    aVar.h2(this, this.f37950g);
                    com.withings.comm.trace.e.a().d(x(), Traces.d(com.withings.comm.trace.e.b(x().c()), (int) x().i().softVersion));
                } catch (WsAuthFailedException e14) {
                    throw new IOException("Unable to open session for device", e14);
                }
            } catch (IOException e15) {
                Iterator it2 = this.f37953j.iterator();
                while (it2.hasNext()) {
                    ((d.b) it2.next()).i(x().k());
                }
                throw e15;
            }
        } catch (CorruptedFirmwareException e16) {
            com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
            cj.b x11 = x();
            String str2 = firmwareUpgrade.url;
            String message = e16.getMessage();
            JsonObject a12 = Traces.a("update_firmware_failure");
            a12.addProperty("firmware_url", str2);
            a12.addProperty("server_response_error", message);
            a11.d(x11, a12);
            throw e16;
        }
    }

    @Override // nj.j.a
    public final void a(float f11) {
        if (f11 - this.f37952i > 0.01f) {
            this.f37949f.L0(f11);
            this.f37952i = f11;
            x70.b.s(this, v(), "Firmware upload progress : %.0f %%", Float.valueOf(f11 * 100.0f));
        }
    }

    @Override // nj.j.a
    public final void j() {
        x().k().e();
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return null;
    }
}
