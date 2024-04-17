package com.withings.wiscale2.device.common.feature.respiratoryscan;
/* compiled from: RespiratoryScanActivationActivity.kt */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final int f52472a;

    /* renamed from: b  reason: collision with root package name */
    private final int f52473b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f52474c;

    public n(int i11, int i12, boolean z5) {
        this.f52472a = i11;
        this.f52473b = i12;
        this.f52474c = z5;
    }

    public final int a() {
        return this.f52473b;
    }

    public final boolean b() {
        return this.f52474c;
    }

    public final int c() {
        return this.f52472a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f52472a == nVar.f52472a && this.f52473b == nVar.f52473b && this.f52474c == nVar.f52474c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f52474c) + androidx.appcompat.app.h.a(this.f52473b, Integer.hashCode(this.f52472a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScanFrequency(title=");
        sb2.append(this.f52472a);
        sb2.append(", description=");
        sb2.append(this.f52473b);
        sb2.append(", enabled=");
        return androidx.appcompat.app.h.d(sb2, this.f52474c, ")");
    }
}
