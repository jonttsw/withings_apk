package com.withings.device.details.wsd.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.Color;
import com.withings.comm.wpp.generated.object.ColorRgb;
import com.withings.comm.wpp.generated.object.LampState;
import com.withings.comm.wpp.h;
import com.withings.device.details.wsd.programs.moon.WsdMoodLightActivity;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import qj.j;
/* compiled from: WsdSetColorConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/device/details/wsd/conversation/WsdSetColorConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "a", "device-details-wsd_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WsdSetColorConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private a f37056f;

    /* compiled from: WsdSetColorConversation.kt */
    /* loaded from: classes3.dex */
    public interface a extends WppDeviceConversation.b {
        void X(WsdSetColorConversation wsdSetColorConversation);

        void o0(WsdSetColorConversation wsdSetColorConversation, j jVar);
    }

    public WsdSetColorConversation(WsdMoodLightActivity delegate) {
        u.j(delegate, "delegate");
        this.f37056f = delegate;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        B(60000L, false, false);
        ?? aVar = new nj.a(x());
        aVar.c((short) 2318, new h[0]);
        aVar.j();
        ColorRgb colorRgb = (ColorRgb) aVar.C(ColorRgb.class);
        if (colorRgb == null) {
            Color color = (Color) aVar.C(Color.class);
            if (color != null) {
                ColorRgb colorRgb2 = new ColorRgb();
                colorRgb2.red = color.red;
                colorRgb2.blue = color.blue;
                colorRgb2.green = color.green;
                colorRgb = colorRgb2;
            } else {
                throw new IllegalStateException("Color status does not contain Color nor ColorRGB");
            }
        }
        j jVar = new j(colorRgb, (LampState) aVar.B(LampState.class));
        a aVar2 = this.f37056f;
        aVar2.o0(this, jVar);
        while (true) {
            j jVar2 = (j) K();
            u.g(jVar2);
            nj.a aVar3 = new nj.a(x());
            aVar3.c((short) 2317, jVar2.c(), jVar2.d());
            aVar3.j();
            aVar2.X(this);
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return this.f37056f;
    }
}
