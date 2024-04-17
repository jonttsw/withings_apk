package com.withings.wiscale2.device.common.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.TrackerUser;
import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import java.io.IOException;
import kotlin.Metadata;
/* compiled from: CheckDeviceLinkConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/conversation/CheckDeviceLinkConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CheckDeviceLinkConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final ej0.b f50697f;

    /* renamed from: g  reason: collision with root package name */
    private final kn.e f50698g;

    /* renamed from: h  reason: collision with root package name */
    private final m70.i f50699h;

    /* renamed from: i  reason: collision with root package name */
    public User f50700i;

    /* renamed from: j  reason: collision with root package name */
    public Device f50701j;

    public CheckDeviceLinkConversation(ej0.b incorrectUserManager, kn.e deviceManager, m70.i userManager) {
        kotlin.jvm.internal.u.j(incorrectUserManager, "incorrectUserManager");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        this.f50697f = incorrectUserManager;
        this.f50698g = deviceManager;
        this.f50699h = userManager;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        Device device;
        ?? aVar = new nj.a(x());
        aVar.c((short) 1283, new com.withings.comm.wpp.h[0]);
        TrackerUser trackerUser = (TrackerUser) aVar.y(TrackerUser.class);
        Device f11 = this.f50698g.f(u70.i.c(x().i().mac));
        if (f11 != null) {
            Long userId = f11.getUserId();
            long j5 = trackerUser.f33276id;
            if (userId != null && userId.longValue() == j5) {
                device = f11;
            } else {
                device = null;
            }
            if (device != null) {
                this.f50701j = device;
                User i11 = this.f50699h.i(trackerUser.f33276id);
                if (i11 != null) {
                    this.f50700i = i11;
                    if (!this.f50697f.j(Long.valueOf(M().q()))) {
                        if (!M().D()) {
                            return;
                        }
                        throw new IOException("User is shared, we don't sync the device");
                    }
                    throw new IOException("User has no weight or no height, we don't sync the device");
                }
                throw new IOException(ah.a.c("The user of the tracker (", trackerUser.f33276id, ") is not in the account"));
            }
            Long userId2 = f11.getUserId();
            long j11 = trackerUser.f33276id;
            throw new IOException("The user of the link (" + userId2 + ") does not match the user of the tracker (" + j11 + ")");
        }
        throw new DeviceNotLinkedException();
    }

    public final Device L() {
        Device device = this.f50701j;
        if (device != null) {
            return device;
        }
        kotlin.jvm.internal.u.s("device");
        throw null;
    }

    public final User M() {
        User user = this.f50700i;
        if (user != null) {
            return user;
        }
        kotlin.jvm.internal.u.s(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        throw null;
    }
}
