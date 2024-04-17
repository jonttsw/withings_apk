package com.withings.wiscale2.activity.workout.ui.performance.splits;
/* compiled from: WorkoutSplits.kt */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final double f49973a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f49974b;

    /* renamed from: c  reason: collision with root package name */
    private final Double f49975c;

    public b(double d11, Integer num, Double d12) {
        this.f49973a = d11;
        this.f49974b = num;
        this.f49975c = d12;
    }

    public final Integer a() {
        return this.f49974b;
    }

    public final double b() {
        return this.f49973a;
    }

    public final Double c() {
        return this.f49975c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Double.compare(this.f49973a, bVar.f49973a) == 0 && kotlin.jvm.internal.u.e(this.f49974b, bVar.f49974b) && kotlin.jvm.internal.u.e(this.f49975c, bVar.f49975c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Double.hashCode(this.f49973a) * 31;
        int i11 = 0;
        Integer num = this.f49974b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = (hashCode2 + hashCode) * 31;
        Double d11 = this.f49975c;
        if (d11 != null) {
            i11 = d11.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "Split(pace=" + this.f49973a + ", color=" + this.f49974b + ", variation=" + this.f49975c + ")";
    }
}
