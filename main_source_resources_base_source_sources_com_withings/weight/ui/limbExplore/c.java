package com.withings.weight.ui.limbExplore;

import org.joda.time.DateTime;
/* compiled from: SegmentalLimbExploreGraphModel.kt */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final DateTime f47682a;

    /* renamed from: b  reason: collision with root package name */
    private final float f47683b;

    /* renamed from: c  reason: collision with root package name */
    private final float f47684c;

    public c(DateTime date, float f11, float f12) {
        kotlin.jvm.internal.u.j(date, "date");
        this.f47682a = date;
        this.f47683b = f11;
        this.f47684c = f12;
    }

    public final DateTime a() {
        return this.f47682a;
    }

    public final float b() {
        return this.f47683b;
    }

    public final float c() {
        return this.f47684c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (kotlin.jvm.internal.u.e(this.f47682a, cVar.f47682a) && Float.compare(this.f47683b, cVar.f47683b) == 0 && Float.compare(this.f47684c, cVar.f47684c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f47684c) + androidx.compose.material.o.a(this.f47683b, this.f47682a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LimbExploreUiModel(date=");
        sb2.append(this.f47682a);
        sb2.append(", value=");
        sb2.append(this.f47683b);
        sb2.append(", valueInPercent=");
        return a0.a.b(sb2, this.f47684c, ")");
    }
}
