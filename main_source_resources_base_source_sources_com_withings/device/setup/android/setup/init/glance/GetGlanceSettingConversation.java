package com.withings.device.setup.android.setup.init.glance;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.GlanceStatus;
import com.withings.comm.wpp.h;
import com.withings.device.Device;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nj.a;
import u70.i;
/* compiled from: GetGlanceSettingConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/device/setup/android/setup/init/glance/GetGlanceSettingConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GetGlanceSettingConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final e f37446f;

    public GetGlanceSettingConversation(e deviceManager) {
        u.j(deviceManager, "deviceManager");
        this.f37446f = deviceManager;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        ?? aVar = new a(x());
        boolean z5 = false;
        aVar.c((short) 2427, new h[0]);
        i g11 = x().g();
        e eVar = this.f37446f;
        Device f11 = eVar.f(g11);
        if (((GlanceStatus) aVar.y(GlanceStatus.class)).status == 1) {
            z5 = true;
        }
        f11.setGlanceEnabled(z5);
        eVar.t(f11);
    }
}
