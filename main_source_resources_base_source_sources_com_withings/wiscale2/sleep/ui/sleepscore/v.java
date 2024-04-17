package com.withings.wiscale2.sleep.ui.sleepscore;
/* compiled from: SleepDayViewModel.kt */
/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final int f61532a;

    /* renamed from: b  reason: collision with root package name */
    private final int f61533b;

    /* renamed from: c  reason: collision with root package name */
    private final int f61534c;

    /* renamed from: d  reason: collision with root package name */
    private final int f61535d;

    public v(int i11, int i12, int i13, int i14) {
        this.f61532a = i11;
        this.f61533b = i12;
        this.f61534c = i13;
        this.f61535d = i14;
    }

    public final int a() {
        return this.f61534c;
    }

    public final int b() {
        return this.f61535d;
    }

    public final int c() {
        return this.f61533b;
    }

    public final int d() {
        return this.f61532a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f61532a == vVar.f61532a && this.f61533b == vVar.f61533b && this.f61534c == vVar.f61534c && this.f61535d == vVar.f61535d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61535d) + androidx.appcompat.app.h.a(this.f61534c, androidx.appcompat.app.h.a(this.f61533b, Integer.hashCode(this.f61532a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SharingInfo(title=");
        sb2.append(this.f61532a);
        sb2.append(", subTitle=");
        sb2.append(this.f61533b);
        sb2.append(", cta=");
        sb2.append(this.f61534c);
        sb2.append(", image=");
        return androidx.camera.camera2.internal.e.c(sb2, this.f61535d, ")");
    }
}
