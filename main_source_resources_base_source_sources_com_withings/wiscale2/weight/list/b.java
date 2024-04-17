package com.withings.wiscale2.weight.list;

import androidx.camera.core.y1;
import kotlin.jvm.internal.u;
/* compiled from: WeightListActivityMeasurementsViewModel.kt */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f62916a;

    /* renamed from: b  reason: collision with root package name */
    private final String f62917b;

    public b(String dateSection, String str) {
        u.j(dateSection, "dateSection");
        this.f62916a = dateSection;
        this.f62917b = str;
    }

    public final String a() {
        return this.f62916a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (u.e(this.f62916a, bVar.f62916a) && u.e(this.f62917b, bVar.f62917b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f62916a.hashCode() * 31;
        String str = this.f62917b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SectionData(dateSection=");
        sb2.append(this.f62916a);
        sb2.append(", weightDiff=");
        return y1.e(sb2, this.f62917b, ")");
    }
}
