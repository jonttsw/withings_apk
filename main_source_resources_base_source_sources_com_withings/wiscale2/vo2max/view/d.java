package com.withings.wiscale2.vo2max.view;
/* compiled from: Vo2MaxComparison.kt */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final int f62723a;

    /* renamed from: b  reason: collision with root package name */
    private final int f62724b;

    /* renamed from: c  reason: collision with root package name */
    private final int f62725c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f62726d;

    /* renamed from: e  reason: collision with root package name */
    private final int f62727e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f62728f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f62729g;

    public d(int i11, int i12, int i13, boolean z5, int i14, boolean z11, boolean z12) {
        this.f62723a = i11;
        this.f62724b = i12;
        this.f62725c = i13;
        this.f62726d = z5;
        this.f62727e = i14;
        this.f62728f = z11;
        this.f62729g = z12;
    }

    public final int a() {
        return this.f62724b;
    }

    public final int b() {
        return this.f62727e;
    }

    public final int c() {
        return this.f62725c;
    }

    public final boolean d() {
        return this.f62729g;
    }

    public final int e() {
        return this.f62723a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f62723a == dVar.f62723a && this.f62724b == dVar.f62724b && this.f62725c == dVar.f62725c && this.f62726d == dVar.f62726d && this.f62727e == dVar.f62727e && this.f62728f == dVar.f62728f && this.f62729g == dVar.f62729g) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f62726d;
    }

    public final boolean g() {
        return this.f62728f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f62729g) + androidx.camera.core.y1.a(this.f62728f, androidx.appcompat.app.h.a(this.f62727e, androidx.camera.core.y1.a(this.f62726d, androidx.appcompat.app.h.a(this.f62725c, androidx.appcompat.app.h.a(this.f62724b, Integer.hashCode(this.f62723a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Vo2MaxComparisonData(vo2MaxScore=");
        sb2.append(this.f62723a);
        sb2.append(", comparisonVo2MaxScore=");
        sb2.append(this.f62724b);
        sb2.append(", previousComparisonVo2MaxScore=");
        sb2.append(this.f62725c);
        sb2.append(", isMale=");
        sb2.append(this.f62726d);
        sb2.append(", index=");
        sb2.append(this.f62727e);
        sb2.append(", isViewVisible=");
        sb2.append(this.f62728f);
        sb2.append(", shouldAnimateFromLeft=");
        return androidx.appcompat.app.h.d(sb2, this.f62729g, ")");
    }
}
