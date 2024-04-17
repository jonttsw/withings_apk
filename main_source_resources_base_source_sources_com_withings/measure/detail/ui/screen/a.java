package com.withings.measure.detail.ui.screen;
/* compiled from: MeasureDetailScreen.kt */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final int f41757a;

    /* renamed from: b  reason: collision with root package name */
    private final int f41758b;

    public a(int i11, int i12) {
        this.f41757a = i11;
        this.f41758b = i12;
    }

    public final int a() {
        return this.f41758b;
    }

    public final int b() {
        return this.f41757a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f41757a == aVar.f41757a && this.f41758b == aVar.f41758b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41758b) + (Integer.hashCode(this.f41757a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AboutSectionInfo(title=");
        sb2.append(this.f41757a);
        sb2.append(", description=");
        return androidx.camera.camera2.internal.e.c(sb2, this.f41758b, ")");
    }
}
