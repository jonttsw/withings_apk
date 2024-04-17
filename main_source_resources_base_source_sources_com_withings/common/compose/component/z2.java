package com.withings.common.compose.component;
/* compiled from: Buttons.kt */
/* loaded from: classes3.dex */
public final class z2 {

    /* renamed from: a  reason: collision with root package name */
    private final long f34983a;

    /* renamed from: b  reason: collision with root package name */
    private final long f34984b;

    /* renamed from: c  reason: collision with root package name */
    private final long f34985c;

    /* renamed from: d  reason: collision with root package name */
    private final long f34986d;

    public z2(long j5, long j11, long j12, long j13) {
        this.f34983a = j5;
        this.f34984b = j11;
        this.f34985c = j12;
        this.f34986d = j13;
    }

    public final k1.r0 a(boolean z5, androidx.compose.runtime.a aVar) {
        long j5;
        aVar.s(647000985);
        if (z5) {
            j5 = this.f34984b;
        } else {
            j5 = this.f34986d;
        }
        k1.r0 m11 = androidx.compose.runtime.l0.m(d2.f0.j(j5), aVar);
        aVar.J();
        return m11;
    }

    public final androidx.compose.material3.m0 b(androidx.compose.runtime.a aVar) {
        aVar.s(66895937);
        int i11 = androidx.compose.material3.n0.f7355f;
        androidx.compose.material3.m0 c11 = androidx.compose.material3.n0.b((androidx.compose.material3.i1) androidx.camera.core.y1.c(aVar, -339300779)).c(this.f34983a, this.f34984b, this.f34985c, this.f34986d);
        aVar.J();
        aVar.J();
        return c11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj;
        if (d2.f0.m(this.f34983a, z2Var.f34983a) && d2.f0.m(this.f34984b, z2Var.f34984b) && d2.f0.m(this.f34985c, z2Var.f34985c) && d2.f0.m(this.f34986d, z2Var.f34986d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i11 = d2.f0.f63267k;
        return Long.hashCode(this.f34986d) + androidx.activity.result.c.a(this.f34985c, androidx.activity.result.c.a(this.f34984b, Long.hashCode(this.f34983a) * 31, 31), 31);
    }
}
