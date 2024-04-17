package com.withings.wiscale2.partner.ui;
/* compiled from: PartnerActivity.kt */
/* loaded from: classes5.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final u10.u f58945a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f58946b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f58947c;

    public d0(u10.u partnerExchange, boolean z5, boolean z11) {
        kotlin.jvm.internal.u.j(partnerExchange, "partnerExchange");
        this.f58945a = partnerExchange;
        this.f58946b = z5;
        this.f58947c = z11;
    }

    public final boolean a() {
        return this.f58947c;
    }

    public final u10.u b() {
        return this.f58945a;
    }

    public final boolean c() {
        return this.f58946b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (kotlin.jvm.internal.u.e(this.f58945a, d0Var.f58945a) && this.f58946b == d0Var.f58946b && this.f58947c == d0Var.f58947c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58947c) + androidx.camera.core.y1.a(this.f58946b, this.f58945a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PartnerExchangeData(partnerExchange=");
        sb2.append(this.f58945a);
        sb2.append(", isActivated=");
        sb2.append(this.f58946b);
        sb2.append(", hasPermission=");
        return androidx.appcompat.app.h.d(sb2, this.f58947c, ")");
    }
}
