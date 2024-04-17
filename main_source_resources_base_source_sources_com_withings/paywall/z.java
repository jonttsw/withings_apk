package com.withings.paywall;
/* compiled from: SubscriptionDuration.kt */
/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final int f43716a;

    /* renamed from: b  reason: collision with root package name */
    private final SubscriptionPeriod f43717b;

    public z(int i11, SubscriptionPeriod subscriptionPeriod) {
        this.f43716a = i11;
        this.f43717b = subscriptionPeriod;
    }

    public final int a() {
        return this.f43716a;
    }

    public final SubscriptionPeriod b() {
        return this.f43717b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f43716a == zVar.f43716a && this.f43717b == zVar.f43717b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f43717b.hashCode() + (Integer.hashCode(this.f43716a) * 31);
    }

    public final String toString() {
        return "SubscriptionDuration(duration=" + this.f43716a + ", period=" + this.f43717b + ")";
    }
}
