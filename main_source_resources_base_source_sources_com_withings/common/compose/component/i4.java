package com.withings.common.compose.component;
/* compiled from: SliderWithImage.kt */
/* loaded from: classes3.dex */
public final class i4 {

    /* renamed from: a  reason: collision with root package name */
    private final int f33860a;

    /* renamed from: b  reason: collision with root package name */
    private final String f33861b;

    /* renamed from: c  reason: collision with root package name */
    private final String f33862c = "";

    public i4(int i11, String str) {
        this.f33860a = i11;
        this.f33861b = str;
    }

    public final int a() {
        return this.f33860a;
    }

    public final String b() {
        return this.f33862c;
    }

    public final String c() {
        return this.f33861b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4)) {
            return false;
        }
        i4 i4Var = (i4) obj;
        if (this.f33860a == i4Var.f33860a && kotlin.jvm.internal.u.e(this.f33861b, i4Var.f33861b) && kotlin.jvm.internal.u.e(this.f33862c, i4Var.f33862c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.f33860a) * 31;
        int i11 = 0;
        String str = this.f33861b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode2 + hashCode) * 31;
        String str2 = this.f33862c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SliderWithImageItem(id=");
        sb2.append(this.f33860a);
        sb2.append(", value=");
        sb2.append(this.f33861b);
        sb2.append(", image=");
        return androidx.camera.core.y1.e(sb2, this.f33862c, ")");
    }
}
