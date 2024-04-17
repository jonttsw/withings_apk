package com.withings.device.setup.android.setup.init.screen.settings;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.Uint32;
import com.withings.comm.wpp.generated.object.Version;
import com.withings.comm.wpp.h;
import com.withings.device.Device;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kn.e;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nj.a;
import u70.i;
import x70.b;
/* compiled from: GetScreenSettingsConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/device/setup/android/setup/init/screen/settings/GetScreenSettingsConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GetScreenSettingsConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final e f37452f;

    public GetScreenSettingsConversation(e deviceManager) {
        u.j(deviceManager, "deviceManager");
        this.f37452f = deviceManager;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        List<h> d11;
        Version version;
        int i11;
        i v11 = v();
        e eVar = this.f37452f;
        Device f11 = eVar.f(v11);
        try {
            try {
                ?? aVar = new a(x());
                aVar.c((short) 1293, new h[0]);
                aVar.j();
                d11 = aVar.D().d();
                u.g(d11);
                ArrayList arrayList = new ArrayList();
                for (Object obj : d11) {
                    if (obj instanceof Version) {
                        arrayList.add(obj);
                    }
                }
                version = (Version) x.K(arrayList);
            } catch (IOException unused) {
                b.t(this, "The device " + x().j().getName() + " does not handle the command WPP_CMD_MAX_SCREEN_GET", new Object[0]);
                f11.setMaxScreenCount(0);
            }
            if (version != null && version.value == 1) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : d11) {
                    if (obj2 instanceof Uint32) {
                        arrayList2.add(obj2);
                    }
                }
                Uint32 uint32 = (Uint32) x.K(arrayList2);
                if (uint32 != null) {
                    i11 = (int) uint32.val;
                    f11.setMaxScreenCount(i11);
                    eVar.t(f11);
                }
            }
            i11 = 0;
            f11.setMaxScreenCount(i11);
            eVar.t(f11);
        } catch (Throwable th2) {
            eVar.t(f11);
            throw th2;
        }
    }
}
