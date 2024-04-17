package com.withings.wiscale2.device.common.ui;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.common.device.conversation.SetTrackerPositionConversation;
import kotlin.Metadata;
/* compiled from: TrackerPositionFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/ui/TrackerPositionConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TrackerPositionConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final kn.e f53755f;

    public TrackerPositionConversation() {
        this(0);
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        B(300000L, false, true);
        Integer num = (Integer) K();
        kotlin.jvm.internal.u.g(num);
        E(new SetTrackerPositionConversation(this.f53755f, num.intValue()));
    }

    public TrackerPositionConversation(int i11) {
        kn.e c11 = kn.e.c();
        kotlin.jvm.internal.u.i(c11, "get(...)");
        this.f53755f = c11;
    }
}
