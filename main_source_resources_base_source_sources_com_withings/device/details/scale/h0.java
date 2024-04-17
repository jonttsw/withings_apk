package com.withings.device.details.scale;

import com.withings.device.Device;
/* compiled from: ScaleDetailViewModel.kt */
/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f36943a;

    /* renamed from: b  reason: collision with root package name */
    private final Device f36944b;

    public h0(Device device, boolean z5) {
        kotlin.jvm.internal.u.j(device, "device");
        this.f36943a = z5;
        this.f36944b = device;
    }

    public final Device a() {
        return this.f36944b;
    }

    public final boolean b() {
        return this.f36943a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.f36943a == h0Var.f36943a && kotlin.jvm.internal.u.e(this.f36944b, h0Var.f36944b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f36944b.hashCode() + (Boolean.hashCode(this.f36943a) * 31);
    }

    public final String toString() {
        return "WalkThroughData(shouldSkipGoal=" + this.f36943a + ", device=" + this.f36944b + ")";
    }
}
