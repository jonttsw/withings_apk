package com.withings.authentication.mfa.main.components;
/* compiled from: PhoneComponent.kt */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final int f31677a;

    /* renamed from: b  reason: collision with root package name */
    private final int f31678b;

    /* renamed from: c  reason: collision with root package name */
    private final int f31679c;

    public f(int i11, int i12, int i13) {
        this.f31677a = i11;
        this.f31678b = i12;
        this.f31679c = i13;
    }

    public final int a() {
        return this.f31678b;
    }

    public final int b() {
        return this.f31679c;
    }

    public final int c() {
        return this.f31677a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f31677a == fVar.f31677a && this.f31678b == fVar.f31678b && this.f31679c == fVar.f31679c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31679c) + androidx.appcompat.app.h.a(this.f31678b, Integer.hashCode(this.f31677a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneCellContent(title=");
        sb2.append(this.f31677a);
        sb2.append(", description=");
        sb2.append(this.f31678b);
        sb2.append(", icon=");
        return androidx.camera.camera2.internal.e.c(sb2, this.f31679c, ")");
    }
}
