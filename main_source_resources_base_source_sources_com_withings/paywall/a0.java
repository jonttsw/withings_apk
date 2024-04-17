package com.withings.paywall;
/* compiled from: SubscriptionDuration.kt */
/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final double f43588a;

    /* renamed from: b  reason: collision with root package name */
    private final z f43589b;

    public a0(double d11, z zVar) {
        this.f43588a = d11;
        this.f43589b = zVar;
    }

    public final z a() {
        return this.f43589b;
    }

    public final double b() {
        return this.f43588a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (Double.compare(this.f43588a, a0Var.f43588a) == 0 && kotlin.jvm.internal.u.e(this.f43589b, a0Var.f43589b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f43589b.hashCode() + (Double.hashCode(this.f43588a) * 31);
    }

    public final String toString() {
        return "SubscriptionOffer(price=" + this.f43588a + ", duration=" + this.f43589b + ")";
    }
}
