package com.withings.wiscale2.device.common.ui;
/* compiled from: RespiratoryScanSettingsActivity.kt */
/* loaded from: classes5.dex */
public final class a2 {

    /* renamed from: a  reason: collision with root package name */
    private final NextScanStatus f53775a;

    /* renamed from: b  reason: collision with root package name */
    private final String f53776b;

    /* renamed from: c  reason: collision with root package name */
    private final int f53777c;

    public a2(NextScanStatus nextScanStatus, String str, int i11) {
        this.f53775a = nextScanStatus;
        this.f53776b = str;
        this.f53777c = i11;
    }

    public final int a() {
        return this.f53777c;
    }

    public final NextScanStatus b() {
        return this.f53775a;
    }

    public final String c() {
        return this.f53776b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        if (this.f53775a == a2Var.f53775a && kotlin.jvm.internal.u.e(this.f53776b, a2Var.f53776b) && this.f53777c == a2Var.f53777c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f53777c) + defpackage.d.c(this.f53776b, this.f53775a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NextScanInfo(nextScanStatus=");
        sb2.append(this.f53775a);
        sb2.append(", title=");
        sb2.append(this.f53776b);
        sb2.append(", descriptionResId=");
        return androidx.camera.camera2.internal.e.c(sb2, this.f53777c, ")");
    }
}
