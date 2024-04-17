package com.withings.common.compose.component;
/* compiled from: ScrollableTabRow.kt */
/* loaded from: classes3.dex */
public final class s4 {

    /* renamed from: a  reason: collision with root package name */
    private final float f34717a;

    /* renamed from: b  reason: collision with root package name */
    private final float f34718b;

    public s4(float f11, float f12) {
        this.f34717a = f11;
        this.f34718b = f12;
    }

    public final float a() {
        return this.f34717a;
    }

    public final float b() {
        return this.f34717a + this.f34718b;
    }

    public final float c() {
        return this.f34718b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        if (k3.h.b(this.f34717a, s4Var.f34717a) && k3.h.b(this.f34718b, s4Var.f34718b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34718b) + (Float.hashCode(this.f34717a) * 31);
    }

    public final String toString() {
        String d11 = k3.h.d(this.f34717a);
        String d12 = k3.h.d(b());
        return androidx.camera.core.y1.e(androidx.camera.camera2.internal.l0.b("TabPosition(left=", d11, ", right=", d12, ", width="), k3.h.d(this.f34718b), ")");
    }
}
