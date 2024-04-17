package com.withings.common.compose.component;
/* compiled from: ItemGoal.kt */
/* loaded from: classes3.dex */
public final class h4 {

    /* renamed from: a  reason: collision with root package name */
    private final float f33843a;

    /* renamed from: b  reason: collision with root package name */
    private final String f33844b;

    /* renamed from: c  reason: collision with root package name */
    private final String f33845c;

    public h4(float f11, String textInside, String title) {
        kotlin.jvm.internal.u.j(textInside, "textInside");
        kotlin.jvm.internal.u.j(title, "title");
        this.f33843a = f11;
        this.f33844b = textInside;
        this.f33845c = title;
    }

    public final float a() {
        return this.f33843a;
    }

    public final String b() {
        return this.f33844b;
    }

    public final String c() {
        return this.f33845c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj;
        if (Float.compare(this.f33843a, h4Var.f33843a) == 0 && kotlin.jvm.internal.u.e(this.f33844b, h4Var.f33844b) && kotlin.jvm.internal.u.e(this.f33845c, h4Var.f33845c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f33845c.hashCode() + defpackage.d.c(this.f33844b, Float.hashCode(this.f33843a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SingleCircleGaugeInformation(progress=");
        sb2.append(this.f33843a);
        sb2.append(", textInside=");
        sb2.append(this.f33844b);
        sb2.append(", title=");
        return androidx.camera.core.y1.e(sb2, this.f33845c, ")");
    }
}
