package com.withings.device.details.scale;

import androidx.camera.core.y1;
/* compiled from: ScaleDetailViewModel.kt */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f36934a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f36935b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f36936c;

    public f(boolean z5, boolean z11, boolean z12) {
        this.f36934a = z5;
        this.f36935b = z11;
        this.f36936c = z12;
    }

    public final boolean a() {
        return this.f36935b;
    }

    public final boolean b() {
        return this.f36936c;
    }

    public final boolean c() {
        return this.f36934a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f36934a == fVar.f36934a && this.f36935b == fVar.f36935b && this.f36936c == fVar.f36936c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36936c) + y1.a(this.f36935b, Boolean.hashCode(this.f36934a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImpedanceToggleData(isVisible=");
        sb2.append(this.f36934a);
        sb2.append(", isChecked=");
        sb2.append(this.f36935b);
        sb2.append(", isHeartRateImpedance=");
        return androidx.appcompat.app.h.d(sb2, this.f36936c, ")");
    }
}
