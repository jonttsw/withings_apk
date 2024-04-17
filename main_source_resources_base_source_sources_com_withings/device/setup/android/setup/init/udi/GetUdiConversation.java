package com.withings.device.setup.android.setup.init.udi;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.comm.wpp.generated.object.Udi;
import com.withings.comm.wpp.h;
import com.withings.device.Device;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nj.a;
import u70.i;
import x70.b;
/* compiled from: GetUdiConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/device/setup/android/setup/init/udi/GetUdiConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GetUdiConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final e f37457f;

    public GetUdiConversation(e deviceManager) {
        u.j(deviceManager, "deviceManager");
        this.f37457f = deviceManager;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        try {
            ?? aVar = new a(x());
            aVar.c((short) 2429, new h[0]);
            i g11 = x().g();
            e eVar = this.f37457f;
            Device f11 = eVar.f(g11);
            f11.setUdi(((Udi) aVar.y(Udi.class)).value);
            eVar.t(f11);
        } catch (UnsupportedCommandException unused) {
            b.t(this, "Command WPP_CMD_GET_UDI is not supported by %s with firmware %d", x(), Long.valueOf(x().i().softVersion));
        }
    }
}
