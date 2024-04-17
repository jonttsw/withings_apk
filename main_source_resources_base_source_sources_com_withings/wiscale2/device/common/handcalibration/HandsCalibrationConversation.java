package com.withings.wiscale2.device.common.handcalibration;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.HandsMove;
import com.withings.device.setup.android.setup.init.time.SendTimeConversation;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: HandsCalibrationConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/handcalibration/HandsCalibrationConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HandsCalibrationConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private lc0.i f52677f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f52678g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f52679h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f52680i;

    public HandsCalibrationConversation(lc0.i iVar, boolean z5, boolean z11, String str) {
        this.f52677f = iVar;
        this.f52678g = z5;
        this.f52679h = z11;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        HandsMove handsMove;
        com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
        u.i(a11, "get(...)");
        E(new SendTimeConversation(a11));
        try {
            nj.a aVar = new nj.a(x());
            aVar.u(20000L);
            aVar.c((short) 286, new com.withings.comm.wpp.h[0]);
            aVar.j();
            B(120000L, this.f52678g, this.f52679h);
            this.f52680i = true;
            this.f52677f.D1(this);
            do {
                handsMove = (HandsMove) K();
                if (handsMove != null) {
                    nj.a aVar2 = new nj.a(x());
                    aVar2.c((short) 284, handsMove);
                    aVar2.j();
                    this.f52677f.N(this);
                    continue;
                }
            } while (handsMove != null);
            nj.a aVar3 = new nj.a(x());
            aVar3.c((short) 287, new com.withings.comm.wpp.h[0]);
            aVar3.j();
            this.f52677f.t2(this);
        } catch (Exception e11) {
            if ((e11 instanceof WaitForInput.CancelException) || (e11 instanceof ConversationException)) {
                nj.a aVar4 = new nj.a(x());
                aVar4.c((short) 287, new com.withings.comm.wpp.h[0]);
                aVar4.j();
            }
            throw e11;
        }
    }

    public final boolean L() {
        return this.f52680i;
    }

    public final void M(f fVar) {
        this.f52677f = fVar;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return this.f52677f;
    }
}
