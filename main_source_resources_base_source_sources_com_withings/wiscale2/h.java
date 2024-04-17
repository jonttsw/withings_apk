package com.withings.wiscale2;
/* compiled from: ShareWithMyDoctor.kt */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final int f56159a;

    /* renamed from: b  reason: collision with root package name */
    private final int f56160b;

    /* renamed from: c  reason: collision with root package name */
    private final int f56161c;

    /* renamed from: d  reason: collision with root package name */
    private final String f56162d;

    public h(int i11, int i12, int i13, String str) {
        this.f56159a = i11;
        this.f56160b = i12;
        this.f56161c = i13;
        this.f56162d = str;
    }

    public final int a() {
        return this.f56159a;
    }

    public final int b() {
        return this.f56160b;
    }

    public final int c() {
        return this.f56161c;
    }

    public final String d() {
        return this.f56162d;
    }

    public final int e() {
        return this.f56160b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f56159a == hVar.f56159a && this.f56160b == hVar.f56160b && this.f56161c == hVar.f56161c && kotlin.jvm.internal.u.e(this.f56162d, hVar.f56162d)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f56159a;
    }

    public final int hashCode() {
        return this.f56162d.hashCode() + androidx.appcompat.app.h.a(this.f56161c, androidx.appcompat.app.h.a(this.f56160b, Integer.hashCode(this.f56159a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BloodPressureData(systol=");
        sb2.append(this.f56159a);
        sb2.append(", diastol=");
        sb2.append(this.f56160b);
        sb2.append(", hr=");
        sb2.append(this.f56161c);
        sb2.append(", time=");
        return androidx.camera.core.y1.e(sb2, this.f56162d, ")");
    }
}
