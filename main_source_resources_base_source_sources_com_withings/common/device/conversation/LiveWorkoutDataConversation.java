package com.withings.common.device.conversation;

import al.f;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.Distance;
import com.withings.comm.wpp.generated.object.Pace;
import com.withings.comm.wpp.generated.object.Speed;
import com.withings.comm.wpp.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.internal.u;
/* compiled from: LiveWorkoutDataConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/conversation/LiveWorkoutDataConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LiveWorkoutDataConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final f f35150f;

    public LiveWorkoutDataConversation(f liveWorkoutData) {
        u.j(liveWorkoutData, "liveWorkoutData");
        this.f35150f = liveWorkoutData;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        Speed speed;
        Pace pace;
        h[] hVarArr = new h[3];
        f fVar = this.f35150f;
        Integer c11 = fVar.c();
        Distance distance = null;
        if (c11 != null) {
            int intValue = c11.intValue();
            speed = new Speed();
            speed.value = intValue;
        } else {
            speed = null;
        }
        hVarArr[0] = speed;
        Integer b10 = fVar.b();
        if (b10 != null) {
            int intValue2 = b10.intValue();
            pace = new Pace();
            pace.value = intValue2;
        } else {
            pace = null;
        }
        hVarArr[1] = pace;
        Integer a11 = fVar.a();
        if (a11 != null) {
            int intValue3 = a11.intValue();
            distance = new Distance();
            distance.value = intValue3;
        }
        hVarArr[2] = distance;
        x().t(new com.withings.comm.wpp.f((byte) 1, (short) 320, (List<h>) l.z(hVarArr)));
    }
}
