package com.withings.wiscale2.vascularage;

import org.joda.time.DateTime;
/* compiled from: VascularAgeDataPoint.kt */
/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private final DateTime f62500a;

    /* renamed from: b  reason: collision with root package name */
    private final float f62501b;

    /* renamed from: c  reason: collision with root package name */
    private final jj0.a f62502c;

    /* renamed from: d  reason: collision with root package name */
    private final jj0.c f62503d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f62504e;

    public x(DateTime dateTime, float f11, jj0.a aVar, jj0.c cVar, boolean z5) {
        this.f62500a = dateTime;
        this.f62501b = f11;
        this.f62502c = aVar;
        this.f62503d = cVar;
        this.f62504e = z5;
    }

    public final float a() {
        return this.f62501b;
    }

    public final DateTime b() {
        return this.f62500a;
    }

    public final jj0.a c() {
        return this.f62502c;
    }

    public final jj0.c d() {
        return this.f62503d;
    }

    public final boolean e() {
        return this.f62504e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (kotlin.jvm.internal.u.e(this.f62500a, xVar.f62500a) && Float.compare(this.f62501b, xVar.f62501b) == 0 && kotlin.jvm.internal.u.e(this.f62502c, xVar.f62502c) && kotlin.jvm.internal.u.e(this.f62503d, xVar.f62503d) && this.f62504e == xVar.f62504e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int a11 = androidx.compose.material.o.a(this.f62501b, this.f62500a.hashCode() * 31, 31);
        int hashCode = this.f62503d.hashCode();
        return Boolean.hashCode(this.f62504e) + ((hashCode + ((this.f62502c.hashCode() + a11) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VascularAgeDataPoint(dateTime=");
        sb2.append(this.f62500a);
        sb2.append(", age=");
        sb2.append(this.f62501b);
        sb2.append(", diagnostic=");
        sb2.append(this.f62502c);
        sb2.append(", range=");
        sb2.append(this.f62503d);
        sb2.append(", isVisible=");
        return androidx.appcompat.app.h.d(sb2, this.f62504e, ")");
    }
}
