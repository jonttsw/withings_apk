package com.withings.ecg.graph;

import com.github.mikephil.charting.data.Entry;
import kotlin.Metadata;
/* compiled from: EcgLineChart.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/ecg/graph/EcgEntry;", "Lcom/github/mikephil/charting/data/Entry;", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class EcgEntry extends Entry {

    /* renamed from: d  reason: collision with root package name */
    private final float f38385d;

    /* renamed from: e  reason: collision with root package name */
    private final float f38386e;

    public EcgEntry(float f11, float f12) {
        super(f11, f12);
        this.f38385d = f11;
        this.f38386e = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcgEntry)) {
            return false;
        }
        EcgEntry ecgEntry = (EcgEntry) obj;
        if (Float.compare(this.f38385d, ecgEntry.f38385d) == 0 && Float.compare(this.f38386e, ecgEntry.f38386e) == 0) {
            return true;
        }
        return false;
    }

    public final float f() {
        return this.f38385d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f38386e) + (Float.hashCode(this.f38385d) * 31);
    }

    @Override // com.github.mikephil.charting.data.Entry
    public final String toString() {
        return "EcgEntry(time=" + this.f38385d + ", ecg=" + this.f38386e + ")";
    }
}
