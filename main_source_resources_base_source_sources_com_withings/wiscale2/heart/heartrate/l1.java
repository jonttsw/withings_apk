package com.withings.wiscale2.heart.heartrate;
/* compiled from: HeartRateAwakeAverageActivity.kt */
/* loaded from: classes5.dex */
final class l1 {

    /* renamed from: a  reason: collision with root package name */
    private final HrZone f57692a;

    /* renamed from: b  reason: collision with root package name */
    private final float f57693b;

    /* renamed from: c  reason: collision with root package name */
    private final float f57694c;

    public l1(HrZone hrZone, float f11, float f12) {
        this.f57692a = hrZone;
        this.f57693b = f11;
        this.f57694c = f12;
    }

    public final float a() {
        return this.f57693b;
    }

    public final HrZone b() {
        return this.f57692a;
    }

    public final float c() {
        return this.f57694c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        if (this.f57692a == l1Var.f57692a && Float.compare(this.f57693b, l1Var.f57693b) == 0 && Float.compare(this.f57694c, l1Var.f57694c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f57694c) + androidx.compose.material.o.a(this.f57693b, this.f57692a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HrZoneInformation(hrZone=");
        sb2.append(this.f57692a);
        sb2.append(", durationInSeconds=");
        sb2.append(this.f57693b);
        sb2.append(", ratio=");
        return a0.a.b(sb2, this.f57694c, ")");
    }
}
