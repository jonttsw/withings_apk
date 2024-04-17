package com.withings.wiscale2.device.common.conversation;

import java.io.IOException;
import kotlin.Metadata;
/* compiled from: CheckDeviceLinkConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/device/common/conversation/DeviceNotLinkedException;", "Ljava/io/IOException;", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeviceNotLinkedException extends IOException {
    public DeviceNotLinkedException() {
        super("The device is not linked to the account");
    }
}
