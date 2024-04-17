package com.withings.wiscale2.device.common.onboarding;

import kotlin.jvm.internal.u;
/* compiled from: SleepApneaOnboardingActivity.kt */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f53087a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f53088b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f53089c;

    public a() {
        this(null, null, null, 7);
    }

    public final Boolean a() {
        return this.f53089c;
    }

    public final Integer b() {
        return this.f53087a;
    }

    public final Integer c() {
        return this.f53088b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (u.e(this.f53087a, aVar.f53087a) && u.e(this.f53088b, aVar.f53088b) && u.e(this.f53089c, aVar.f53089c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i11 = 0;
        Integer num = this.f53087a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = hashCode * 31;
        Integer num2 = this.f53088b;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Boolean bool = this.f53089c;
        if (bool != null) {
            i11 = bool.hashCode();
        }
        return i13 + i11;
    }

    public final String toString() {
        return "ButtonInfo(primaryButtonText=" + this.f53087a + ", secondaryButtonText=" + this.f53088b + ", primaryButtonEnabled=" + this.f53089c + ")";
    }

    public a(Integer num, Integer num2, Boolean bool) {
        this.f53087a = num;
        this.f53088b = num2;
        this.f53089c = bool;
    }

    public /* synthetic */ a(Integer num, Integer num2, Boolean bool, int i11) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? Boolean.TRUE : bool);
    }
}
