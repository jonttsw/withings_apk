package com.withings.wiscale2.vo2max.view;
/* compiled from: Vo2MaxComparison.kt */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final int f62682a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f62683b;

    public a(int i11, boolean z5) {
        this.f62682a = i11;
        this.f62683b = z5;
    }

    public final int a() {
        return this.f62682a;
    }

    public final boolean b() {
        return this.f62683b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f62682a == aVar.f62682a && this.f62683b == aVar.f62683b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f62683b) + (Integer.hashCode(this.f62682a) * 31);
    }

    public final String toString() {
        return "DescriptionData(vo2MaxPercentage=" + this.f62682a + ", isMale=" + this.f62683b + ")";
    }
}
