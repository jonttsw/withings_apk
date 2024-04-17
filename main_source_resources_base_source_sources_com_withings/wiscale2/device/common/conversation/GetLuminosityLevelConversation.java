package com.withings.wiscale2.device.common.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.LuminosityLevel;
import kotlin.Metadata;
/* compiled from: GetLuminosityLevelConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/conversation/GetLuminosityLevelConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GetLuminosityLevelConversation extends WppDeviceConversation {
    /* JADX WARN: Type inference failed for: r0v3, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        Object e11 = x().e();
        kotlin.jvm.internal.u.h(e11, "null cannot be cast to non-null type com.withings.wiscale2.device.common.InfoHolderWithBrightness");
        wb0.o oVar = (wb0.o) e11;
        ?? aVar = new nj.a(x());
        aVar.c((short) 2370, new com.withings.comm.wpp.h[0]);
        LuminosityLevel luminosityLevel = (LuminosityLevel) aVar.y(LuminosityLevel.class);
    }
}
