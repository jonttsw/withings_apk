package com.withings.wiscale2.device.common.ui;

import com.withings.device.Device;
/* compiled from: TrackerPositionFragment.kt */
/* loaded from: classes5.dex */
public final class r2 extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final TrackerPositionConversation f54071a;

    public r2(ej.w wVar, Device device) {
        kotlin.jvm.internal.u.j(device, "device");
        this.f54071a = (TrackerPositionConversation) wVar.y(device.getMacAddress(), TrackerPositionConversation.class);
    }

    public final void f0(int i11) {
        this.f54071a.G(Integer.valueOf(i11));
    }
}
