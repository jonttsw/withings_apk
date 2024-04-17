package com.withings.wiscale2.device.hwa.conversation;

import a50.a;
import ah.t;
import androidx.appcompat.view.menu.d;
import com.withings.alarm.conversation.GetAlarmSettingsConversation;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.Alarm;
import com.withings.comm.wpp.generated.object.ProgramSetting;
import com.withings.comm.wpp.generated.object.TrackerGoal;
import com.withings.comm.wpp.generated.object.TrackerUser;
import com.withings.comm.wpp.generated.object.UserSecret;
import com.withings.comm.wpp.h;
import com.withings.device.Device;
import com.withings.device.setup.android.setup.init.time.SendTimeConversation;
import com.withings.target.data.LocalTargetRepository;
import com.withings.user.User;
import fl.o;
import fl.p;
import gl.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import kn.e;
import rg.b;
/* loaded from: classes5.dex */
public class Hwa0102InitConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final User f54180f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f54181g;

    public Hwa0102InitConversation(User user) {
        this.f54180f = user;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [nj.h, nj.a] */
    /* JADX WARN: Type inference failed for: r3v17, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        boolean z5;
        int i11 = 0;
        Device f11 = e.c().f(x().g());
        f11.setFirmware((int) x().i().softVersion);
        e.c().t(f11);
        E(new SendTimeConversation(com.withings.comm.trace.e.a()));
        boolean z11 = this.f54181g;
        User user = this.f54180f;
        TrackerUser g11 = a.g(user);
        if ((Arrays.asList(52, 53).contains(Integer.valueOf(f11.getModelId())) && f11.getFirmware() < 680) || z11) {
            UserSecret w11 = t.w(f11);
            nj.a aVar = new nj.a(x());
            aVar.c((short) 1282, g11, w11);
            aVar.j();
        } else {
            nj.a aVar2 = new nj.a(x());
            aVar2.c((short) 1282, g11);
            aVar2.j();
        }
        TrackerGoal trackerGoal = new TrackerGoal();
        trackerGoal.goalType = 0;
        trackerGoal.value = LocalTargetRepository.get().getLastActiveStepsTargetOrDefault(user.q()).getAsInt();
        nj.a aVar3 = new nj.a(x());
        aVar3.c((short) 1290, trackerGoal);
        aVar3.j();
        p.a aVar4 = p.f67672b;
        o g12 = aVar4.a().g(f11);
        if (!(g12 instanceof c) || ((c) g12).m(f11.getFirmware())) {
            E(new GetAlarmSettingsConversation());
        }
        ArrayList arrayList = new ArrayList();
        o g13 = aVar4.a().g(f11);
        if (g13 instanceof c) {
            z5 = ((c) g13).m(f11.getFirmware());
        } else {
            z5 = true;
        }
        if (z5) {
            ?? aVar5 = new nj.a(x());
            aVar5.c((short) 293, new h[0]);
            aVar5.j();
            ArrayList arrayList2 = new ArrayList();
            for (h hVar : aVar5.D().d()) {
                if (hVar instanceof Alarm) {
                    qj.a aVar6 = new qj.a();
                    aVar6.d(new ArrayList());
                    aVar6.c((Alarm) hVar);
                    arrayList2.add(aVar6);
                } else if (hVar instanceof ProgramSetting) {
                    ((qj.a) d.d(arrayList2, 1)).b().add((ProgramSetting) hVar);
                }
            }
            b.b().a(f11.getId());
            while (i11 < arrayList2.size()) {
                i11++;
                arrayList.add(qg.e.d(f11, (qj.a) arrayList2.get(i11), (short) i11));
            }
        } else {
            ?? aVar7 = new nj.a(x());
            aVar7.c((short) 293, new h[0]);
            Alarm alarm = (Alarm) aVar7.A(Alarm.class);
            b.b().a(f11.getId());
            if (alarm != null) {
                arrayList.add(qg.e.c(f11, alarm));
            }
        }
        b.b().h(r(), f11, arrayList);
    }

    public final void L() {
        this.f54181g = true;
    }
}
