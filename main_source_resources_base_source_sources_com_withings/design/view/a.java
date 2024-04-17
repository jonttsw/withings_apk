package com.withings.design.view;
/* compiled from: HorizontalSausageView.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final float f36456a;

    /* renamed from: b  reason: collision with root package name */
    private int f36457b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f36458c = false;

    public a(float f11, int i11) {
        this.f36456a = f11;
        this.f36457b = i11;
    }

    public final int a() {
        return this.f36457b;
    }

    public final float b() {
        return this.f36456a;
    }

    public final boolean c() {
        return this.f36458c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (Float.compare(this.f36456a, aVar.f36456a) != 0 || this.f36457b != aVar.f36457b || this.f36458c != aVar.f36458c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int a11 = androidx.appcompat.app.h.a(this.f36457b, Float.hashCode(this.f36456a) * 31, 31);
        boolean z5 = this.f36458c;
        int i11 = z5;
        if (z5 != 0) {
            i11 = 1;
        }
        return a11 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HorizontalSausageData(value=");
        sb2.append(this.f36456a);
        sb2.append(", color=");
        sb2.append(this.f36457b);
        sb2.append(", isHashed=");
        return androidx.appcompat.app.h.d(sb2, this.f36458c, ")");
    }
}
