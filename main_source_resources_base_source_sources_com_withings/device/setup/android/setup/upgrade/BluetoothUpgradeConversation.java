package com.withings.device.setup.android.setup.upgrade;

import aj.b;
import androidx.activity.a0;
import cj.c;
import cj.d;
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
import com.withings.device.setup.android.setup.s;
import com.withings.device.ws.DeviceSessionFactory;
import com.withings.device.ws.FirmwareUpgrade;
import com.withings.devicesetup.DeviceSessionConversation;
import com.withings.devicesetup.upgrade.conversation.CheckForUpgradeConversation;
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
import jo.a;
import jo.h0;
import jo.i0;
import jo.j0;
import jo.k0;
import jo.l0;
import jo.m0;
import jo.n0;
import jo.o0;
import jo.p0;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nj.j;
import u70.i;
/* compiled from: BluetoothUpgradeConversation.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/device/setup/android/setup/upgrade/BluetoothUpgradeConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "Lnj/j$a;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class BluetoothUpgradeConversation extends WppDeviceConversation implements j.a {

    /* renamed from: f  reason: collision with root package name */
    private final a f37470f;

    /* renamed from: g  reason: collision with root package name */
    private FirmwareUpgrade f37471g;

    /* renamed from: h  reason: collision with root package name */
    private j f37472h;

    /* renamed from: i  reason: collision with root package name */
    private float f37473i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList f37474j;

    public BluetoothUpgradeConversation(a mutableSetupStateRepository) {
        u.j(mutableSetupStateRepository, "mutableSetupStateRepository");
        this.f37470f = mutableSetupStateRepository;
    }

    public static void L(BluetoothUpgradeConversation this$0, long j5, long j11) {
        u.j(this$0, "this$0");
        s.a(this$0, this$0.f37470f, new h0(((float) j5) / ((float) j11)));
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    protected final void A() {
        boolean z5 = b.a.c(x()).c() instanceof c.d;
        j jVar = this.f37472h;
        if (jVar != null && !z5) {
            jVar.a();
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, InterruptedException, WaitForInput.CancelException, ConversationException {
        if (w() == WppDeviceConversation.State.f33151c) {
            return;
        }
        if (this.f37471g == null) {
            Webservices webservices = Webservices.get();
            u.i(webservices, "get(...)");
            e c11 = e.c();
            u.i(c11, "get(...)");
            com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
            u.i(a11, "get(...)");
            CheckForUpgradeConversation checkForUpgradeConversation = new CheckForUpgradeConversation(webservices, c11, a11, 8);
            E(checkForUpgradeConversation);
            if (checkForUpgradeConversation.M()) {
                this.f37471g = checkForUpgradeConversation.L();
                P();
                return;
            }
            x70.b.s(this, v(), "There is no upgrade for %s", x());
            s.a(this, this.f37470f, k0.f74700a);
            return;
        }
        i v11 = v();
        FirmwareUpgrade firmwareUpgrade = this.f37471g;
        u.g(firmwareUpgrade);
        x70.b.s(this, v11, a0.b("Upgrade to : ", firmwareUpgrade.version), new Object[0]);
        P();
    }

    public final void M(ByteBuffer byteBuffer, FirmwareUpgrade firmwareUpgrade) throws CorruptedFirmwareException {
        String b10 = hq.a.b(byteBuffer);
        String str = firmwareUpgrade.md5;
        if (str != null && !u.e(b10, str)) {
            String url = firmwareUpgrade.url;
            u.i(url, "url");
            String md5 = firmwareUpgrade.md5;
            u.i(md5, "md5");
            throw new CorruptedFirmwareException(url, md5, b10);
        }
    }

    public final ByteBuffer N(FirmwareUpgrade firmwareUpgrade) throws IOException {
        Webservices webservices = Webservices.get();
        u.g(firmwareUpgrade);
        ByteBuffer download = webservices.download(firmwareUpgrade.url, new androidx.camera.lifecycle.b(this, 1));
        u.i(download, "download(...)");
        return download;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [nj.h, nj.a] */
    public final void O(ByteBuffer byteBuffer) throws IOException {
        int i11;
        x().k().l("Logs are disabled for upgrade...", true);
        do {
            ?? aVar = new nj.a(x());
            h[] hVarArr = new h[2];
            try {
                CRC32 crc32 = new CRC32();
                crc32.update(byteBuffer.array());
                FwInfo size = new FwInfo().setSha1(hq.a.d(byteBuffer)).setCrc(crc32.getValue()).setSize(byteBuffer.array().length);
                FirmwareUpgrade firmwareUpgrade = this.f37471g;
                u.g(firmwareUpgrade);
                String version = firmwareUpgrade.version;
                u.i(version, "version");
                FwInfo version2 = size.setVersion(Long.parseLong(version));
                u.g(version2);
                hVarArr[0] = version2;
                hVarArr[1] = new Silent().setValue((short) 0);
                aVar.c((short) 2407, hVarArr);
                aVar.j();
                long j5 = ((ReturnCode) aVar.B(ReturnCode.class)).f33265rc;
                i11 = (j5 > 0L ? 1 : (j5 == 0L ? 0 : -1));
                a aVar2 = this.f37470f;
                if (i11 == 0) {
                    FwChunkRequest fwChunkRequest = (FwChunkRequest) aVar.B(FwChunkRequest.class);
                    ArrayList a11 = hq.a.a(fwChunkRequest.packetMaxSize, hq.a.c((int) fwChunkRequest.offset, (int) fwChunkRequest.size, byteBuffer), fwChunkRequest.offset);
                    nj.a aVar3 = new nj.a(x());
                    aVar3.b(a11, (short) 2408);
                    aVar3.j();
                    s.a(this, aVar2, new j0(fwChunkRequest.percent / 100.0f));
                } else if (j5 == 1) {
                    s.a(this, aVar2, new j0(1.0f));
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

    public final void P() throws IOException, InterruptedException, WaitForInput.CancelException, ConversationException {
        int i11;
        this.f37474j = x().k().h();
        o0 o0Var = o0.f74708a;
        a aVar = this.f37470f;
        s.a(this, aVar, o0Var);
        FirmwareUpgrade firmwareUpgrade = this.f37471g;
        boolean z5 = false;
        ByteBuffer byteBuffer = null;
        try {
            try {
                s.a(this, aVar, n0.f74706a);
                ByteBuffer N = N(firmwareUpgrade);
                try {
                    M(N, firmwareUpgrade);
                    s.a(this, aVar, new i0(firmwareUpgrade));
                    com.withings.comm.trace.e.a().d(x(), Traces.c(N.capacity(), firmwareUpgrade.url, true));
                    if (y() instanceof c.d) {
                        c y11 = y();
                        u.h(y11, "null cannot be cast to non-null type com.withings.comm.remote.device.WppDeviceConfig.WithBootloader");
                        if (!((c.d) y11).c(x())) {
                            x().k().e();
                            x().k().j(new f((byte) 1, (short) 294, new h[0]));
                            s.a(this, aVar, m0.f74704a);
                            int[] iArr = {4, 5};
                            x().z(new gj.h(d.a(x())).d());
                            try {
                                x().p();
                                x().l(z());
                                x().k().a(this.f37474j);
                                if (!androidx.health.connect.client.units.d.f(iArr, x().c())) {
                                    String arrays = Arrays.toString(iArr);
                                    u.i(arrays, "toString(...)");
                                    throw new IOException("Reason code should be ".concat(arrays));
                                }
                            } catch (ConnectionFailException e11) {
                                ArrayList arrayList = this.f37474j;
                                u.g(arrayList);
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((d.b) it.next()).i(x().k());
                                }
                                throw new IOException("Unable to reconnect to firmware", e11);
                            }
                        }
                    }
                    try {
                        O(N);
                    } catch (UnsupportedCommandException unused) {
                        x().k().l("Logs are disabled for upgrade...", true);
                        s.a(this, aVar, new j0(0.0f));
                        this.f37472h = new j(x(), this);
                        if (w() == WppDeviceConversation.State.f33151c) {
                            j jVar = this.f37472h;
                            u.g(jVar);
                            jVar.a();
                        }
                        j jVar2 = this.f37472h;
                        u.g(jVar2);
                        jVar2.d(N);
                        s.a(this, aVar, new j0(1.0f));
                        x().k().l("Upgrade done. Logs are enabled again.", false);
                        com.withings.comm.trace.e.a().d(x(), Traces.a("update_firmware_sent"));
                    }
                    DeviceSessionFactory.get().remove(v());
                    s.a(this, aVar, new l0(this.f37471g));
                    try {
                        cj.b d11 = new k(x().g(), y(), z(), cj.d.a(x())).d();
                        if (d11.c() != 3 && d11.c() != 2) {
                            try {
                                d11.a();
                            } catch (Exception e12) {
                                i g11 = d11.g();
                                int i12 = x70.b.f106693c;
                                x70.b.h(d11, g11, e12, e12.getMessage(), new Object[0]);
                            }
                            throw new IOException("Device didn't reconnect with firm_update connect reason");
                        }
                        x().z(d11.j());
                        com.withings.comm.wpp.d k11 = d11.k();
                        k11.a(this.f37474j);
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
                            String secret = x().i().secret;
                            u.i(secret, "secret");
                            if (secret.length() == 0) {
                                E(new DeviceSessionConversation(null, null, 15));
                            } else {
                                DeviceSessionFactory.get().getNewSession(new xp.b(x().i()).c());
                            }
                            s.a(this, aVar, new p0(this.f37471g));
                            com.withings.comm.trace.e.a().d(x(), Traces.d(com.withings.comm.trace.e.b(x().c()), (int) x().i().softVersion));
                        } catch (WsAuthFailedException e14) {
                            throw new IOException("Unable to open session for device", e14);
                        }
                    } catch (IOException e15) {
                        ArrayList arrayList2 = this.f37474j;
                        u.g(arrayList2);
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((d.b) it2.next()).i(x().k());
                        }
                        throw e15;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    byteBuffer = N;
                    if (byteBuffer != null) {
                        i11 = byteBuffer.capacity();
                    } else {
                        i11 = 0;
                    }
                    com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
                    cj.b x11 = x();
                    u.g(firmwareUpgrade);
                    String str = firmwareUpgrade.url;
                    if (byteBuffer != null) {
                        z5 = true;
                    }
                    a11.d(x11, Traces.c(i11, str, z5));
                    throw th;
                }
            } catch (CorruptedFirmwareException e16) {
                throw e16;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // nj.j.a
    public final void a(float f11) {
        if (f11 - this.f37473i > 0.01f) {
            s.a(this, this.f37470f, new j0(f11));
            this.f37473i = f11;
            x70.b.s(this, v(), "Firmware upload progress : %.0f %%", Float.valueOf(f11 * 100));
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
