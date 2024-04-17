package com.withings.common.device.conversation;

import android.content.Context;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.devicesetup.bonding.SetupBleBondConversation;
import gl.t;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import vi.o;
/* compiled from: BondingMigrationConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/common/device/conversation/BondingMigrationConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class BondingMigrationConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final t f35128f;

    /* renamed from: g  reason: collision with root package name */
    private final a f35129g;

    /* renamed from: h  reason: collision with root package name */
    private b f35130h;

    /* compiled from: BondingMigrationConversation.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a(Context context, cj.b bVar);
    }

    /* compiled from: BondingMigrationConversation.kt */
    /* loaded from: classes3.dex */
    public interface b extends WppDeviceConversation.b {
        void n();
    }

    public BondingMigrationConversation(t deviceModel, com.withings.common.device.conversation.a aVar) {
        u.j(deviceModel, "deviceModel");
        this.f35128f = deviceModel;
        this.f35129g = aVar;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        wi.a aVar;
        xi.b j5 = x().j();
        u.h(j5, "null cannot be cast to non-null type com.withings.comm.network.ble.BleRemoteDevice");
        if (((o) j5).d() != 12 && u70.a.b().e()) {
            if (this.f35128f.o(x().i().softVersion)) {
                Context r7 = r();
                u.i(r7, "getContext(...)");
                aVar = wi.a.f105219d;
                if (aVar == null) {
                    Context applicationContext = r7.getApplicationContext();
                    u.i(applicationContext, "getApplicationContext(...)");
                    aVar = new wi.a(applicationContext);
                    wi.a.f105219d = aVar;
                }
                if (aVar.f()) {
                    B(300000L, false, false);
                    Context r11 = r();
                    u.i(r11, "getContext(...)");
                    cj.b x11 = x();
                    u.i(x11, "getWppDevice(...)");
                    this.f35129g.a(r11, x11);
                    Object K = K();
                    u.i(K, "waitForInput(...)");
                    if (((Boolean) K).booleanValue()) {
                        try {
                            E(new SetupBleBondConversation());
                            b bVar = this.f35130h;
                            if (bVar != null) {
                                bVar.n();
                            }
                        } catch (Exception e11) {
                            b bVar2 = this.f35130h;
                            if (bVar2 != null) {
                                bVar2.e3(this, e11);
                            }
                            throw e11;
                        }
                    }
                }
            }
        }
    }

    public final void L(b bVar) {
        this.f35130h = bVar;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return this.f35130h;
    }
}
