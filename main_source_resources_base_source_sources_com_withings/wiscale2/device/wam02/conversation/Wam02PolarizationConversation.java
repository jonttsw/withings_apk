package com.withings.wiscale2.device.wam02.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.DispBehavior0;
import com.withings.comm.wpp.generated.object.DispPrefs0;
import com.withings.comm.wpp.h;
import java.io.IOException;
/* loaded from: classes5.dex */
public class Wam02PolarizationConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private a f54854f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f54855g;

    /* renamed from: h  reason: collision with root package name */
    private short f54856h;

    /* loaded from: classes5.dex */
    public interface a extends WppDeviceConversation.b {
        void H0(Wam02PolarizationConversation wam02PolarizationConversation);

        void O2(Wam02PolarizationConversation wam02PolarizationConversation, int i11);
    }

    public Wam02PolarizationConversation(a aVar, boolean z5) {
        this.f54854f = aVar;
        this.f54855g = z5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [nj.h, nj.a] */
    /* JADX WARN: Type inference failed for: r5v1, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        B(60000L, this.f54855g, false);
        ?? aVar = new nj.a(x());
        aVar.c((short) 2340, new h[0]);
        aVar.j();
        DispBehavior0 dispBehavior0 = (DispBehavior0) aVar.C(DispBehavior0.class);
        short s11 = ((DispPrefs0) aVar.B(DispPrefs0.class)).gui;
        this.f54856h = s11;
        a aVar2 = this.f54854f;
        aVar2.O2(this, s11);
        Integer num = (Integer) K();
        while (num != null) {
            this.f54856h = num.shortValue();
            DispPrefs0 dispPrefs0 = new DispPrefs0();
            dispPrefs0.gui = this.f54856h;
            ?? aVar3 = new nj.a(x());
            aVar3.c((short) 2341, dispPrefs0);
            aVar3.j();
            DispPrefs0 dispPrefs02 = (DispPrefs0) aVar3.B(DispPrefs0.class);
            DispBehavior0 dispBehavior02 = (DispBehavior0) aVar3.C(DispBehavior0.class);
            num = (Integer) K();
        }
        aVar2.H0(this);
    }

    public final short L() {
        return this.f54856h;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return this.f54854f;
    }
}
