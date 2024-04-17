package com.withings.device.details.automatic.activity.detection;
/* compiled from: ActirecCategoryDetectionRepository.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final long f36680a;

    /* renamed from: b  reason: collision with root package name */
    private final long f36681b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f36682c;

    public a(long j5, long j11, boolean z5) {
        this.f36680a = j5;
        this.f36681b = j11;
        this.f36682c = z5;
    }

    public final boolean a() {
        return this.f36682c;
    }

    public final long b() {
        return this.f36680a;
    }

    public final long c() {
        return this.f36681b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f36680a == aVar.f36680a && this.f36681b == aVar.f36681b && this.f36682c == aVar.f36682c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36682c) + androidx.activity.result.c.a(this.f36681b, Long.hashCode(this.f36680a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActirecCategoryDetection(userId=");
        sb2.append(this.f36680a);
        sb2.append(", workoutCategory=");
        sb2.append(this.f36681b);
        sb2.append(", enabled=");
        return androidx.appcompat.app.h.d(sb2, this.f36682c, ")");
    }
}
