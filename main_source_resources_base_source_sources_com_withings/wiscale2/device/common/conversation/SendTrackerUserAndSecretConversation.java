package com.withings.wiscale2.device.common.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.TrackerUser;
import com.withings.comm.wpp.generated.object.UserSecret;
import com.withings.device.Device;
import com.withings.user.User;
import kotlin.Metadata;
/* compiled from: SendTrackerUserAndSecretConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/conversation/SendTrackerUserAndSecretConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SendTrackerUserAndSecretConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final User f50743f;

    /* renamed from: g  reason: collision with root package name */
    private final kn.e f50744g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f50745h;

    public SendTrackerUserAndSecretConversation(User user, kn.e deviceManager, boolean z5) {
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        this.f50743f = user;
        this.f50744g = deviceManager;
        this.f50745h = z5;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        TrackerUser g11 = a50.a.g(this.f50743f);
        if (this.f50745h) {
            x().u();
            Device f11 = this.f50744g.f(v());
            kotlin.jvm.internal.u.g(f11);
            UserSecret w11 = ah.t.w(f11);
            x().w(f11.getKlSecret());
            nj.a aVar = new nj.a(x());
            aVar.c((short) 1282, g11, w11);
            aVar.j();
            return;
        }
        nj.a aVar2 = new nj.a(x());
        aVar2.c((short) 1282, g11);
        aVar2.j();
    }
}
