package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class g5 {

    /* renamed from: a  reason: collision with root package name */
    private final int f51365a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f51366b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f51367c;

    /* renamed from: d  reason: collision with root package name */
    private final String f51368d;

    public g5() {
        this(0, 15, false);
    }

    public static g5 a(g5 g5Var, boolean z5) {
        return new g5(g5Var.f51365a, g5Var.f51368d, g5Var.f51366b, z5);
    }

    public final boolean b() {
        return this.f51366b;
    }

    public final boolean c() {
        return this.f51367c;
    }

    public final int d() {
        return this.f51365a;
    }

    public final String e() {
        return this.f51368d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj;
        if (this.f51365a == g5Var.f51365a && this.f51366b == g5Var.f51366b && this.f51367c == g5Var.f51367c && kotlin.jvm.internal.u.e(this.f51368d, g5Var.f51368d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a11 = androidx.camera.core.y1.a(this.f51367c, androidx.camera.core.y1.a(this.f51366b, Integer.hashCode(this.f51365a) * 31, 31), 31);
        String str = this.f51368d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return a11 + hashCode;
    }

    public final String toString() {
        return "EcgButtonState(text=" + this.f51365a + ", enabled=" + this.f51366b + ", loading=" + this.f51367c + ", textStringForTest=" + this.f51368d + ")";
    }

    public /* synthetic */ g5(int i11, int i12, boolean z5) {
        this((i12 & 1) != 0 ? 0 : i11, null, (i12 & 2) != 0 ? true : z5, false);
    }

    public g5(int i11, String str, boolean z5, boolean z11) {
        this.f51365a = i11;
        this.f51366b = z5;
        this.f51367c = z11;
        this.f51368d = str;
    }
}
