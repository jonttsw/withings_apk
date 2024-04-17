package com.withings.devicesetup.network.conversation;

import android.text.TextUtils;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.exception.UnexpectedResponseException;
import com.withings.comm.wpp.generated.object.IpSettings;
import com.withings.comm.wpp.generated.object.WifiApConnect;
import com.withings.comm.wpp.generated.object.WifiApScan;
import com.withings.comm.wpp.generated.object.WifiConnectResult;
import com.withings.comm.wpp.h;
import com.withings.devicesetup.network.conversation.NetworkConfigurationConversation;
import com.withings.webservices.legacy.withings.model.session.DeviceSession;
import java.io.IOException;
import java.util.ArrayList;
import nj.c;
/* loaded from: classes3.dex */
public class WifiSetupConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private a f37718f;

    /* renamed from: g  reason: collision with root package name */
    private String f37719g = "";

    /* loaded from: classes3.dex */
    public interface a extends WppDeviceConversation.b {
        void H1();

        void P(WifiSetupConversation wifiSetupConversation);

        void w0(WifiApConnect wifiApConnect, IpSettings ipSettings, WifiConnectResult wifiConnectResult);

        void x0(WifiSetupConversation wifiSetupConversation, WifiApScan wifiApScan, boolean z5);
    }

    /* loaded from: classes3.dex */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f37720a;

        /* renamed from: b  reason: collision with root package name */
        public WifiApConnect f37721b;

        /* renamed from: c  reason: collision with root package name */
        public IpSettings f37722c;
    }

    public WifiSetupConversation(NetworkConfigurationConversation.a aVar) {
        this.f37718f = aVar;
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        b bVar;
        a aVar;
        B(DeviceSession.DEVICE_SESSION_TTL, true, false);
        do {
            bVar = (b) K();
            boolean z5 = bVar.f37720a;
            aVar = this.f37718f;
            if (z5) {
                try {
                    c cVar = new c(x());
                    cVar.C();
                    cVar.c((short) 260, new h[0]);
                    cVar.w("Start getting Wi-Fi connection information", "End getting Wi-Fi connection information");
                    ArrayList A = cVar.A(WifiApConnect.class);
                    if (!A.isEmpty()) {
                        String str = ((WifiApConnect) A.get(0)).ssid;
                        if (!TextUtils.isEmpty(str)) {
                            this.f37719g = str;
                        }
                    }
                } catch (UnexpectedResponseException unused) {
                }
                c cVar2 = new c(x());
                cVar2.u(60000L);
                cVar2.x(new com.withings.devicesetup.network.conversation.a(this));
                cVar2.c((short) 258, new h[0]);
                cVar2.j();
                aVar.P(this);
            }
        } while (bVar.f37720a);
        aVar.H1();
        WifiApConnect wifiApConnect = bVar.f37721b;
        if (wifiApConnect != null && wifiApConnect.ssid != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(wifiApConnect);
            IpSettings ipSettings = bVar.f37722c;
            if (ipSettings != null) {
                arrayList.add(ipSettings);
            }
            ?? aVar2 = new nj.a(x());
            aVar2.u(60000L);
            aVar2.w("Start sending Wi-Fi connection information", "End sending Wi-Fi connection information");
            aVar2.b(arrayList, (short) 259);
            WifiConnectResult wifiConnectResult = (WifiConnectResult) aVar2.y(WifiConnectResult.class);
            if (wifiConnectResult.wifi == 0 && wifiConnectResult.dhcp == 0 && wifiConnectResult.dnsResolv == 0 && wifiConnectResult.http == 0) {
                x70.b.s(this, v(), "Wifi has been set up correctly for %s", x());
                return;
            }
            aVar.w0(wifiApConnect, ipSettings, wifiConnectResult);
            D();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.devicesetup.network.conversation.WifiSetupConversation$b, java.lang.Object] */
    public final void N(WifiApConnect wifiApConnect, IpSettings ipSettings) {
        ?? obj = new Object();
        obj.f37721b = wifiApConnect;
        obj.f37722c = ipSettings;
        G(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.devicesetup.network.conversation.WifiSetupConversation$b, java.lang.Object] */
    public final void O() {
        ?? obj = new Object();
        obj.f37720a = true;
        G(obj);
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return null;
    }
}
