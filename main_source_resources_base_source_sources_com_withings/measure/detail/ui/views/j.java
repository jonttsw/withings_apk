package com.withings.measure.detail.ui.views;
/* compiled from: AddDetailsView.kt */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final int f41847a;

    /* renamed from: b  reason: collision with root package name */
    private final int f41848b;

    /* renamed from: c  reason: collision with root package name */
    private final int f41849c;

    public j(int i11, int i12, int i13) {
        this.f41847a = i11;
        this.f41848b = i12;
        this.f41849c = i13;
    }

    public final int a() {
        return this.f41848b;
    }

    public final int b() {
        return this.f41849c;
    }

    public final int c() {
        return this.f41847a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f41847a == jVar.f41847a && this.f41848b == jVar.f41848b && this.f41849c == jVar.f41849c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41849c) + androidx.appcompat.app.h.a(this.f41848b, Integer.hashCode(this.f41847a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DetailsItem(title=");
        sb2.append(this.f41847a);
        sb2.append(", description=");
        sb2.append(this.f41848b);
        sb2.append(", icon=");
        return androidx.camera.camera2.internal.e.c(sb2, this.f41849c, ")");
    }
}
