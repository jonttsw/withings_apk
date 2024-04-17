package com.withings.common.compose.component;
/* compiled from: HorizontalSegmentedGauge.kt */
/* loaded from: classes3.dex */
public final class j2 {

    /* renamed from: a  reason: collision with root package name */
    private final long f33922a;

    /* renamed from: b  reason: collision with root package name */
    private final float f33923b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f33924c;

    public j2(long j5, float f11, boolean z5) {
        this.f33922a = j5;
        this.f33923b = f11;
        this.f33924c = z5;
    }

    public final long a() {
        return this.f33922a;
    }

    public final boolean b() {
        return this.f33924c;
    }

    public final float c() {
        return this.f33923b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        if (d2.f0.m(this.f33922a, j2Var.f33922a) && Float.compare(this.f33923b, j2Var.f33923b) == 0 && this.f33924c == j2Var.f33924c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i11 = d2.f0.f63267k;
        return Boolean.hashCode(this.f33924c) + androidx.compose.material.o.a(this.f33923b, Long.hashCode(this.f33922a) * 31, 31);
    }

    public final String toString() {
        StringBuilder d11 = androidx.activity.result.c.d("HorizontalSegmentedGaugeBarUiModel(color=", d2.f0.s(this.f33922a), ", weight=");
        d11.append(this.f33923b);
        d11.append(", hasCursor=");
        return androidx.appcompat.app.h.d(d11, this.f33924c, ")");
    }
}
