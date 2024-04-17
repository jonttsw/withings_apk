package com.withings.device.details;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import kotlin.Metadata;
/* compiled from: DissociateDeviceUseCase.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/device/details/SendFactoryResetConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "<init>", "()V", "device-details-common_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SendFactoryResetConversation extends WppDeviceConversation {
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        x().k().j(new com.withings.comm.wpp.f((byte) 1, (short) 291, new com.withings.comm.wpp.h[0]));
    }
}
