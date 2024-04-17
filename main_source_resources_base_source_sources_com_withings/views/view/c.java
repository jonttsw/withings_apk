package com.withings.views.view;
/* compiled from: HorizontalSausageView.kt */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final float f46751a;

    /* renamed from: b  reason: collision with root package name */
    private int f46752b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f46753c;

    public c(float f11, int i11, boolean z5) {
        this.f46751a = f11;
        this.f46752b = i11;
        this.f46753c = z5;
    }

    public final int a() {
        return this.f46752b;
    }

    public final float b() {
        return this.f46751a;
    }

    public final boolean c() {
        return this.f46753c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Float.compare(this.f46751a, cVar.f46751a) == 0 && this.f46752b == cVar.f46752b && this.f46753c == cVar.f46753c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46753c) + androidx.appcompat.app.h.a(this.f46752b, Float.hashCode(this.f46751a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HorizontalSausageData(value=");
        sb2.append(this.f46751a);
        sb2.append(", color=");
        sb2.append(this.f46752b);
        sb2.append(", isHashed=");
        return androidx.appcompat.app.h.d(sb2, this.f46753c, ")");
    }
}
