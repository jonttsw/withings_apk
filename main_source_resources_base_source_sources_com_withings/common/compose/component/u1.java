package com.withings.common.compose.component;
/* compiled from: HorizontalBar.kt */
/* loaded from: classes3.dex */
public final class u1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f34788a;

    /* renamed from: b  reason: collision with root package name */
    private final String f34789b;

    /* renamed from: c  reason: collision with root package name */
    private final String f34790c;

    /* renamed from: d  reason: collision with root package name */
    private final float f34791d;

    /* renamed from: e  reason: collision with root package name */
    private final int f34792e;

    /* renamed from: f  reason: collision with root package name */
    private final Integer f34793f;

    /* renamed from: g  reason: collision with root package name */
    private final String f34794g;

    public u1(String label, String valueText, String str, float f11, int i11, Integer num, String str2, int i12) {
        str = (i12 & 4) != 0 ? null : str;
        num = (i12 & 32) != 0 ? null : num;
        str2 = (i12 & 64) != 0 ? null : str2;
        kotlin.jvm.internal.u.j(label, "label");
        kotlin.jvm.internal.u.j(valueText, "valueText");
        this.f34788a = label;
        this.f34789b = valueText;
        this.f34790c = str;
        this.f34791d = f11;
        this.f34792e = i11;
        this.f34793f = num;
        this.f34794g = str2;
    }

    public final int a() {
        return this.f34792e;
    }

    public final Integer b() {
        return this.f34793f;
    }

    public final String c() {
        return this.f34794g;
    }

    public final String d() {
        return this.f34788a;
    }

    public final float e() {
        return this.f34791d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        if (kotlin.jvm.internal.u.e(this.f34788a, u1Var.f34788a) && kotlin.jvm.internal.u.e(this.f34789b, u1Var.f34789b) && kotlin.jvm.internal.u.e(this.f34790c, u1Var.f34790c) && Float.compare(this.f34791d, u1Var.f34791d) == 0 && this.f34792e == u1Var.f34792e && kotlin.jvm.internal.u.e(this.f34793f, u1Var.f34793f) && kotlin.jvm.internal.u.e(this.f34794g, u1Var.f34794g)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f34790c;
    }

    public final String g() {
        return this.f34789b;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int c11 = defpackage.d.c(this.f34789b, this.f34788a.hashCode() * 31, 31);
        int i11 = 0;
        String str = this.f34790c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int a11 = androidx.appcompat.app.h.a(this.f34792e, androidx.compose.material.o.a(this.f34791d, (c11 + hashCode) * 31, 31), 31);
        Integer num = this.f34793f;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i12 = (a11 + hashCode2) * 31;
        String str2 = this.f34794g;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HorizontalBarData(label=");
        sb2.append(this.f34788a);
        sb2.append(", valueText=");
        sb2.append(this.f34789b);
        sb2.append(", subValueText=");
        sb2.append(this.f34790c);
        sb2.append(", ratio=");
        sb2.append(this.f34791d);
        sb2.append(", barColor=");
        sb2.append(this.f34792e);
        sb2.append(", hatchColor=");
        sb2.append(this.f34793f);
        sb2.append(", imageUrl=");
        return androidx.camera.core.y1.e(sb2, this.f34794g, ")");
    }
}
