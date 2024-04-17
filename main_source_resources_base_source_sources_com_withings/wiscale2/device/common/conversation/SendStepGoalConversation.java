package com.withings.wiscale2.device.common.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.TrackerGoal;
import com.withings.target.data.LocalTargetRepository;
import com.withings.user.User;
import kotlin.Metadata;
/* compiled from: SendStepGoalConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/conversation/SendStepGoalConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SendStepGoalConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final User f50742f;

    public SendStepGoalConversation(User user) {
        kotlin.jvm.internal.u.j(user, "user");
        this.f50742f = user;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        int asInt = LocalTargetRepository.Companion.get().getLastActiveStepsTargetOrDefault(this.f50742f.q()).getAsInt();
        TrackerGoal trackerGoal = new TrackerGoal();
        trackerGoal.goalType = 0;
        trackerGoal.value = asInt;
        nj.a aVar = new nj.a(x());
        aVar.c((short) 1290, trackerGoal);
        aVar.j();
    }
}
