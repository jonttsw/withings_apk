package com.withings.common.device.conversation;

import al.h;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.Int32;
import com.withings.device.Device;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: WpmParametersInitConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/conversation/WpmParametersInitConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WpmParametersInitConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final kn.e f35162f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f35163g;

    /* renamed from: h  reason: collision with root package name */
    private final h f35164h;

    public WpmParametersInitConversation(kn.e deviceManager, boolean z5, h hVar) {
        u.j(deviceManager, "deviceManager");
        this.f35162f = deviceManager;
        this.f35163g = z5;
        this.f35164h = hVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        Int32 int32;
        String iVar = x().g().toString();
        u.i(iVar, "toString(...)");
        kn.e eVar = this.f35162f;
        Device e11 = eVar.e(iVar);
        h hVar = this.f35164h;
        long a11 = hVar.a(iVar);
        long b10 = hVar.b(iVar);
        if (!this.f35163g && a11 > b10) {
            nj.a aVar = new nj.a(x());
            aVar.c((short) 331, new Int32().setVal(e11.getMeasurementIntervalTime()));
            aVar.j();
        }
        ?? aVar2 = new nj.a(x());
        aVar2.c((short) 330, new com.withings.comm.wpp.h[0]);
        Int32 int322 = (Int32) aVar2.A(Int32.class);
        if (int322 != null) {
            if (int322.val != e11.getMeasurementIntervalTime()) {
                int32 = int322;
            } else {
                int32 = null;
            }
            if (int32 != null) {
                e11.setMeasurementIntervalTime(int322.val);
                eVar.t(e11);
            }
        }
        hVar.d(DateTime.now().getMillis(), iVar);
    }
}
