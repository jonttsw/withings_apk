package com.withings.device.setup.android.setup.init.workout;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.generated.object.Boolean;
import com.withings.comm.wpp.h;
import com.withings.device.Device;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nj.a;
import x70.b;
/* compiled from: GetWorkoutAlwaysOnStatusConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/device/setup/android/setup/init/workout/GetWorkoutAlwaysOnStatusConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GetWorkoutAlwaysOnStatusConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final e f37459f;

    public GetWorkoutAlwaysOnStatusConversation(e deviceManager) {
        u.j(deviceManager, "deviceManager");
        this.f37459f = deviceManager;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        e eVar = this.f37459f;
        try {
            ?? aVar = new a(x());
            boolean z5 = false;
            aVar.c(Wpp.CMD_WORKOUT_ALWAYS_ON_GET, new h[0]);
            Device f11 = eVar.f(x().g());
            if (((Boolean) aVar.y(Boolean.class)).value == 1) {
                z5 = true;
            }
            f11.setWorkoutAlwaysOnEnabled(z5);
            eVar.t(f11);
        } catch (UnsupportedCommandException unused) {
            b.t(this, "Command CMD_WORKOUT_ALWAYS_ON_GET is not supported by %s with firmware %d", x(), Long.valueOf(x().i().softVersion));
        }
    }
}
