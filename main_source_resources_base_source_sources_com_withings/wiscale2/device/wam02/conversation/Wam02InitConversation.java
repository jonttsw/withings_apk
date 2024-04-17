package com.withings.wiscale2.device.wam02.conversation;

import a50.a;
import ah.t;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.TrackerGoal;
import com.withings.comm.wpp.generated.object.TrackerUser;
import com.withings.comm.wpp.generated.object.UserSecret;
import com.withings.device.Device;
import com.withings.device.setup.android.setup.init.time.SendTimeConversation;
import com.withings.target.data.LocalTargetRepository;
import com.withings.user.User;
import java.io.IOException;
import kn.e;
/* loaded from: classes5.dex */
public class Wam02InitConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private User f54852f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f54853g = false;

    public Wam02InitConversation(User user) {
        this.f54852f = user;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        Device f11 = e.c().f(x().g());
        E(new SendTimeConversation(com.withings.comm.trace.e.a()));
        User user = this.f54852f;
        TrackerUser g11 = a.g(user);
        if (this.f54853g) {
            UserSecret w11 = t.w(f11);
            nj.a aVar = new nj.a(x());
            aVar.c((short) 1282, g11, w11);
            aVar.j();
        } else {
            nj.a aVar2 = new nj.a(x());
            aVar2.c((short) 1282, g11);
            aVar2.j();
        }
        int asInt = LocalTargetRepository.get().getLastActiveStepsTargetOrDefault(user.q()).getAsInt();
        TrackerGoal trackerGoal = new TrackerGoal();
        trackerGoal.goalType = 0;
        trackerGoal.value = asInt;
        nj.a aVar3 = new nj.a(x());
        aVar3.c((short) 1290, trackerGoal);
        aVar3.j();
    }

    public final void L() {
        this.f54853g = true;
    }
}
