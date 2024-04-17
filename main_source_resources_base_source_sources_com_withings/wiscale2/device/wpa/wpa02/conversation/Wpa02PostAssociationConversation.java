package com.withings.wiscale2.device.wpa.wpa02.conversation;

import ah.t;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.TrackerUser;
import com.withings.comm.wpp.generated.object.UserSecret;
import com.withings.common.device.conversation.GetAndStoreBatteryStateConversation;
import com.withings.device.Device;
import com.withings.device.setup.android.setup.init.association.SendAssociationKeysConversation;
import com.withings.device.setup.android.setup.init.time.SendTimeConversation;
import com.withings.user.User;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: Wpa02PostAssociationConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/conversation/Wpa02PostAssociationConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpa02PostAssociationConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final User f55045f;

    /* renamed from: g  reason: collision with root package name */
    private final e f55046g;

    /* renamed from: h  reason: collision with root package name */
    private final vf.c f55047h;

    public Wpa02PostAssociationConversation(User user, e eVar, vf.c cVar) {
        this.f55045f = user;
        this.f55046g = eVar;
        this.f55047h = cVar;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        e eVar = this.f55046g;
        E(new GetAndStoreBatteryStateConversation(eVar));
        com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
        u.i(a11, "get(...)");
        E(new SendTimeConversation(a11));
        Device f11 = eVar.f(x().g());
        if (f11 != null) {
            TrackerUser g11 = a50.a.g(this.f55045f);
            UserSecret w11 = t.w(f11);
            nj.a aVar = new nj.a(x());
            aVar.c((short) 1282, g11, w11);
            aVar.j();
        }
        E(new SendAssociationKeysConversation(eVar, this.f55047h));
    }
}
