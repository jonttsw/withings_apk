package com.withings.device.install.wsm.conversion;

import androidx.compose.material.h6;
import com.google.gson.JsonObject;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.Traces;
import com.withings.comm.wpp.generated.object.ProbeReply;
import com.withings.comm.wpp.generated.object.WsdScanWsmResult;
import com.withings.common.device.m;
import com.withings.user.User;
import io.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kn.g;
import m0.t;
import nj.e;
import u70.b;
/* loaded from: classes3.dex */
public class WsmAssignmentConversation extends WppDeviceConversation implements e.a {

    /* renamed from: f  reason: collision with root package name */
    private final a f37369f;

    /* renamed from: h  reason: collision with root package name */
    private List<WsdScanWsmResult> f37371h;

    /* renamed from: j  reason: collision with root package name */
    private Map<WsdScanWsmResult, User> f37373j;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList f37372i = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private ArrayList f37374k = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final boolean f37370g = false;

    /* loaded from: classes3.dex */
    public interface a {
        void a(ArrayList arrayList);

        void b(WsmAssignmentConversation wsmAssignmentConversation);
    }

    public WsmAssignmentConversation(i iVar) {
        this.f37369f = iVar;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        WppDeviceConversation.State state;
        Object obj;
        User i11;
        boolean z5 = this.f37370g;
        B(60000L, z5, false);
        this.f37369f.b(this);
        if (!((Boolean) K()).booleanValue()) {
            return;
        }
        while (true) {
            Map<WsdScanWsmResult, User> map = this.f37373j;
            state = WppDeviceConversation.State.f33151c;
            if (map != null || w() == state) {
                break;
            }
            new e(x().k(), this).b();
        }
        if (w() == state) {
            if (z5) {
                throw new IOException("Wsm setup cancelled");
            }
            throw new Exception("Wsm setup cancelled");
        }
        HashMap hashMap = new HashMap();
        for (WsdScanWsmResult wsdScanWsmResult : this.f37373j.keySet()) {
            if (t.g(this.f37371h, new ej.a(wsdScanWsmResult, 1))) {
                hashMap.put(wsdScanWsmResult, this.f37373j.get(wsdScanWsmResult));
            }
        }
        for (WsdScanWsmResult wsdScanWsmResult2 : this.f37371h) {
            Iterator it = new ArrayList(hashMap.keySet()).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((WsdScanWsmResult) obj).mac.equals(wsdScanWsmResult2.mac)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj == null && (i11 = m70.i.b().i(wsdScanWsmResult2.userid)) != null) {
                hashMap.put(wsdScanWsmResult2, i11);
            }
        }
        this.f37373j = hashMap;
        this.f37374k = new ArrayList();
        for (Map.Entry<WsdScanWsmResult, User> entry : this.f37373j.entrySet()) {
            WsdScanWsmResult key = entry.getKey();
            User value = entry.getValue();
            if (t.g(m70.i.b().c(), new com.withings.device.install.wsm.conversion.a(value))) {
                ProbeReply probeReply = new ProbeReply();
                probeReply.blVersion = key.blVersion;
                probeReply.hardVersion = key.hardVersion;
                probeReply.mfgId = key.mfgId;
                probeReply.mac = key.mac;
                probeReply.name = key.name;
                probeReply.pid = key.pid;
                probeReply.rescueVersion = key.rescueVersion;
                probeReply.secret = key.secret;
                probeReply.softVersion = key.softVersion;
                probeReply.vid = key.vid;
                try {
                    new g(r(), value.q(), new m(probeReply), 32).a(true);
                } catch (Exception e11) {
                    if (z5) {
                        throw new IOException("Unable to link Wsm", e11);
                    }
                    throw new Exception("Unable to link Wsm", e11);
                }
            }
            this.f37374k.add(entry.getKey());
        }
    }

    public final void L(HashMap hashMap) {
        this.f37373j = hashMap;
    }

    public final List<WsdScanWsmResult> M() {
        return this.f37374k;
    }

    public final void N(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final WsdScanWsmResult wsdScanWsmResult = (WsdScanWsmResult) it.next();
            ArrayList arrayList2 = this.f37372i;
            if (!t.g(arrayList2, new b() { // from class: ho.a
                @Override // u70.b
                public final boolean isMatching(Object obj) {
                    return ((WsdScanWsmResult) obj).mac.equals(WsdScanWsmResult.this.mac);
                }
            })) {
                com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
                cj.b x11 = x();
                String str = wsdScanWsmResult.mac;
                String str2 = wsdScanWsmResult.mfgId;
                JsonObject a12 = Traces.a("wsm_scan");
                a12.addProperty("wsm_mac", str);
                a12.addProperty("wsm_mfgid", str2);
                h6.c((int) wsdScanWsmResult.softVersion, a12, "wsm_fw_version", (int) wsdScanWsmResult.userid, "wsm_user_id");
                a11.d(x11, a12);
                arrayList2.add(wsdScanWsmResult);
            }
        }
        if (this.f37373j == null && w() != WppDeviceConversation.State.f33151c) {
            this.f37371h = arrayList;
            this.f37369f.a(arrayList);
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return null;
    }
}
