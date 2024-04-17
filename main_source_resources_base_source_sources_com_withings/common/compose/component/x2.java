package com.withings.common.compose.component;
/* compiled from: ColorLegendBar.kt */
/* loaded from: classes3.dex */
public final class x2 {

    /* renamed from: a  reason: collision with root package name */
    private final long f34916a;

    /* renamed from: b  reason: collision with root package name */
    private final String f34917b;

    public x2(long j5, String legend) {
        kotlin.jvm.internal.u.j(legend, "legend");
        this.f34916a = j5;
        this.f34917b = legend;
    }

    public final long a() {
        return this.f34916a;
    }

    public final String b() {
        return this.f34917b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        if (d2.f0.m(this.f34916a, x2Var.f34916a) && kotlin.jvm.internal.u.e(this.f34917b, x2Var.f34917b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i11 = d2.f0.f63267k;
        return this.f34917b.hashCode() + (Long.hashCode(this.f34916a) * 31);
    }

    public final String toString() {
        return androidx.camera.core.y1.e(androidx.activity.result.c.d("LegendData(color=", d2.f0.s(this.f34916a), ", legend="), this.f34917b, ")");
    }
}
