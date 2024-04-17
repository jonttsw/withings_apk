package com.withings.common.compose.component;
/* compiled from: StatusHeader.kt */
/* loaded from: classes3.dex */
public final class t1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f34724a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f34725b;

    public t1(String str) {
        this.f34724a = str;
        this.f34725b = null;
    }

    public final String a() {
        return this.f34724a;
    }

    public final Integer b() {
        return this.f34725b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        if (kotlin.jvm.internal.u.e(this.f34724a, t1Var.f34724a) && kotlin.jvm.internal.u.e(this.f34725b, t1Var.f34725b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f34724a.hashCode() * 31;
        Integer num = this.f34725b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "HeaderLabelData(label=" + this.f34724a + ", labelIconRes=" + this.f34725b + ")";
    }

    public t1(String str, Integer num) {
        this.f34724a = str;
        this.f34725b = num;
    }
}
