package com.withings.devicesetup;

import android.util.Base64;
import cj.b;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.f;
import com.withings.comm.wpp.generated.object.DeviceChallengeReply;
import com.withings.comm.wpp.generated.object.DeviceChallengeRequest;
import com.withings.comm.wpp.generated.object.DeviceChallengeSignature;
import com.withings.comm.wpp.h;
import com.withings.devicesetup.network.conversation.DeviceChallengeApi;
import com.withings.webservices.legacy.Webservices;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kn.e;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nj.c;
import nm0.y;
import xp.d;
import ym0.l;
/* compiled from: DeviceSessionConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/devicesetup/DeviceSessionConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "device-setup-legacy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class DeviceSessionConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final l<xp.a, y> f37692f;

    /* renamed from: g  reason: collision with root package name */
    private final Webservices f37693g;

    /* renamed from: h  reason: collision with root package name */
    private final d f37694h;

    /* renamed from: i  reason: collision with root package name */
    private final Integer f37695i;

    public DeviceSessionConversation() {
        this(null, null, 15);
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        String iVar = x().g().toString();
        u.i(iVar, "toString(...)");
        DeviceChallengeRequest platformRandom = new DeviceChallengeRequest().setPlatformRandom(Base64.decode(((DeviceChallengeApi) this.f37693g.getApiForAccount(DeviceChallengeApi.class)).getRandom(iVar).a(), 1));
        c cVar = new c(x());
        cVar.c((short) 2482, platformRandom);
        cVar.j();
        List<f> B = cVar.B();
        u.i(B, "getResponses(...)");
        ArrayList arrayList = new ArrayList();
        for (f fVar : B) {
            List<h> d11 = fVar.d();
            u.i(d11, "getObjects(...)");
            x.n(d11, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof DeviceChallengeReply) {
                arrayList2.add(next);
            }
        }
        DeviceChallengeReply deviceChallengeReply = (DeviceChallengeReply) x.I(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (next2 instanceof DeviceChallengeSignature) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            byte[] data = ((DeviceChallengeSignature) it3.next()).data;
            u.i(data, "data");
            x.n(kotlin.collections.l.X(data), arrayList4);
        }
        byte[] L0 = x.L0(arrayList4);
        b x11 = x();
        u.i(x11, "getWppDevice(...)");
        byte[] platformRandom2 = deviceChallengeReply.platformRandom;
        u.i(platformRandom2, "platformRandom");
        byte[] deviceRandom = deviceChallengeReply.deviceRandom;
        u.i(deviceRandom, "deviceRandom");
        this.f37692f.invoke(new xp.h(this.f37694h.a(x11, platformRandom2, deviceRandom, L0, deviceChallengeReply.signatureAlgoId, this.f37695i)));
    }

    public DeviceSessionConversation(l onNewDeviceSessionProvider, Integer num, int i11) {
        onNewDeviceSessionProvider = (i11 & 1) != 0 ? a.f37705a : onNewDeviceSessionProvider;
        Webservices webservices = Webservices.get();
        u.i(webservices, "get(...)");
        e c11 = e.c();
        u.i(c11, "get(...)");
        d dVar = new d(c11, webservices);
        num = (i11 & 8) != 0 ? null : num;
        u.j(onNewDeviceSessionProvider, "onNewDeviceSessionProvider");
        this.f37692f = onNewDeviceSessionProvider;
        this.f37693g = webservices;
        this.f37694h = dVar;
        this.f37695i = num;
    }
}
