package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final int f51160a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f51161b = true;

    /* renamed from: c  reason: collision with root package name */
    private final ym0.a<nm0.y> f51162c;

    public a(int i11, ym0.a aVar) {
        this.f51160a = i11;
        this.f51162c = aVar;
    }

    public final boolean a() {
        return this.f51161b;
    }

    public final ym0.a<nm0.y> b() {
        return this.f51162c;
    }

    public final int c() {
        return this.f51160a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f51160a == aVar.f51160a && this.f51161b == aVar.f51161b && kotlin.jvm.internal.u.e(this.f51162c, aVar.f51162c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f51162c.hashCode() + androidx.camera.core.y1.a(this.f51161b, Integer.hashCode(this.f51160a) * 31, 31);
    }

    public final String toString() {
        return "BodyScanEcgButtonState(text=" + this.f51160a + ", enabled=" + this.f51161b + ", onClick=" + this.f51162c + ")";
    }
}
