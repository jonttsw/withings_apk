package com.withings.common.compose.component;
/* compiled from: UserDropDownMenuWithings.kt */
/* loaded from: classes3.dex */
public final class p5 {

    /* renamed from: a  reason: collision with root package name */
    private final String f34537a;

    /* renamed from: b  reason: collision with root package name */
    private final long f34538b;

    /* renamed from: c  reason: collision with root package name */
    private final String f34539c;

    public p5(String name, long j5, String str) {
        kotlin.jvm.internal.u.j(name, "name");
        this.f34537a = name;
        this.f34538b = j5;
        this.f34539c = str;
    }

    public final String a() {
        return this.f34539c;
    }

    public final String b() {
        return this.f34537a;
    }

    public final long c() {
        return this.f34538b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5)) {
            return false;
        }
        p5 p5Var = (p5) obj;
        if (kotlin.jvm.internal.u.e(this.f34537a, p5Var.f34537a) && this.f34538b == p5Var.f34538b && kotlin.jvm.internal.u.e(this.f34539c, p5Var.f34539c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34539c.hashCode() + androidx.activity.result.c.a(this.f34538b, this.f34537a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserUI(name=");
        sb2.append(this.f34537a);
        sb2.append(", userId=");
        sb2.append(this.f34538b);
        sb2.append(", avatarUrl=");
        return androidx.camera.core.y1.e(sb2, this.f34539c, ")");
    }
}
