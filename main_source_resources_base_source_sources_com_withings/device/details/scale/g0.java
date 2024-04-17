package com.withings.device.details.scale;

import com.withings.device.Device;
/* compiled from: ScaleDetailViewModel.kt */
/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f36938a;

    /* renamed from: b  reason: collision with root package name */
    private final Device f36939b;

    public g0(Device device, boolean z5) {
        kotlin.jvm.internal.u.j(device, "device");
        this.f36938a = z5;
        this.f36939b = device;
    }

    public final Device a() {
        return this.f36939b;
    }

    public final boolean b() {
        return this.f36938a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (this.f36938a == g0Var.f36938a && kotlin.jvm.internal.u.e(this.f36939b, g0Var.f36939b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f36939b.hashCode() + (Boolean.hashCode(this.f36938a) * 31);
    }

    public final String toString() {
        return "ShareButtonData(isVisible=" + this.f36938a + ", device=" + this.f36939b + ")";
    }
}
