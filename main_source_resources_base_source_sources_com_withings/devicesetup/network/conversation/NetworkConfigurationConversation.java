package com.withings.devicesetup.network.conversation;

import cj.b;
import com.google.gson.JsonObject;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.remote.exception.ConversationCanceledException;
import com.withings.comm.trace.Traces;
import com.withings.comm.trace.Traces$Scale$SetupType;
import com.withings.comm.trace.e;
import com.withings.comm.wpp.generated.object.Ifsettings;
import com.withings.comm.wpp.generated.object.WifiEnable;
import com.withings.devicesetup.network.conversation.WifiSetupConversation;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes3.dex */
public class NetworkConfigurationConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private List<Integer> f37715f;

    /* renamed from: g  reason: collision with root package name */
    private a f37716g;

    /* renamed from: h  reason: collision with root package name */
    private int f37717h = -1;

    /* loaded from: classes3.dex */
    public interface a extends WifiSetupConversation.a {
        void C0();

        void N1();

        void h1();
    }

    public NetworkConfigurationConversation(List list, zp.a aVar) {
        this.f37715f = list;
        this.f37716g = aVar;
    }

    private void M() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        a aVar = this.f37716g;
        aVar.C0();
        try {
            E(new WifiSetupConversation(aVar));
            aVar.N1();
        } catch (ConversationCanceledException e11) {
            this.f37717h = -1;
            if (N()) {
                return;
            }
            throw e11;
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        Traces$Scale$SetupType traces$Scale$SetupType;
        boolean N = N();
        List<Integer> list = this.f37715f;
        if (N) {
            B(300000L, true, false);
            while (this.f37717h == -1) {
                a aVar = this.f37716g;
                aVar.h1();
                this.f37717h = ((Integer) K()).intValue();
                e a11 = e.a();
                b x11 = x();
                if (this.f37717h == 1) {
                    traces$Scale$SetupType = Traces$Scale$SetupType.f33182b;
                } else {
                    traces$Scale$SetupType = Traces$Scale$SetupType.f33181a;
                }
                JsonObject a12 = Traces.a("installation");
                a12.addProperty("installation_type", traces$Scale$SetupType.toString());
                a11.d(x11, a12);
                int i11 = this.f37717h;
                if (i11 == 1) {
                    M();
                } else if (i11 == 2) {
                    aVar.N1();
                    Ifsettings ifsettings = new Ifsettings();
                    ifsettings.cmd = (byte) 0;
                    ifsettings.f33253rc = (byte) 0;
                    ifsettings.flags = 0;
                    WifiEnable wifiEnable = new WifiEnable();
                    wifiEnable.enable = (byte) 0;
                    nj.a aVar2 = new nj.a(x());
                    aVar2.c((short) 265, ifsettings, wifiEnable);
                    aVar2.j();
                }
            }
        } else if (list.get(0).intValue() == 1) {
            M();
        } else {
            throw new UnsupportedOperationException("We don't know how to configure : " + Arrays.toString(list.toArray()));
        }
    }

    public final int L() {
        return this.f37717h;
    }

    public final boolean N() {
        if (this.f37715f.size() > 1) {
            return true;
        }
        return false;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return this.f37716g;
    }
}
