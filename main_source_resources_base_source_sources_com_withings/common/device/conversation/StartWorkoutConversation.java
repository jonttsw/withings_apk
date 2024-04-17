package com.withings.common.device.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.ActivitySubcategory;
import com.withings.comm.wpp.generated.object.PauseState;
import com.withings.comm.wpp.generated.object.StartTime;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: StartWorkoutConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/conversation/StartWorkoutConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class StartWorkoutConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final int f35160f;

    /* renamed from: g  reason: collision with root package name */
    private final PauseState f35161g;

    public StartWorkoutConversation(int i11, PauseState pauseState) {
        u.j(pauseState, "pauseState");
        this.f35160f = i11;
        this.f35161g = pauseState;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        StartTime startTime = new StartTime();
        startTime.value = (int) (DateTime.now().getMillis() / 1000);
        ActivitySubcategory activitySubcategory = new ActivitySubcategory();
        activitySubcategory.value = (short) this.f35160f;
        nj.a aVar = new nj.a(x());
        aVar.c((short) 317, startTime, activitySubcategory, this.f35161g);
        aVar.j();
    }
}
