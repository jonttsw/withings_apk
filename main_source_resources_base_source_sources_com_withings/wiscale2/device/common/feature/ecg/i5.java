package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: EcgActivationViewModel.kt */
/* loaded from: classes5.dex */
public final class i5 {

    /* renamed from: a  reason: collision with root package name */
    private final int f51420a;

    /* renamed from: b  reason: collision with root package name */
    private final int f51421b;

    public i5(int i11, int i12) {
        this.f51420a = i11;
        this.f51421b = i12;
    }

    public final int a() {
        return this.f51421b;
    }

    public final int b() {
        return this.f51420a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj;
        if (this.f51420a == i5Var.f51420a && this.f51421b == i5Var.f51421b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f51421b) + (Integer.hashCode(this.f51420a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EcgLiveVideoInfo(urlRes=");
        sb2.append(this.f51420a);
        sb2.append(", fallbackImageRes=");
        return androidx.camera.camera2.internal.e.c(sb2, this.f51421b, ")");
    }
}
