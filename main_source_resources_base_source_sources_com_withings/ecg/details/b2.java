package com.withings.ecg.details;

import com.withings.ecg.graph.EcgEntry;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.library.ecg.EcgLeadType;
import java.util.List;
import java.util.Map;
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
public final class b2 {

    /* renamed from: a  reason: collision with root package name */
    private final HeartSignalMeasurement f38145a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<EcgLeadType, List<EcgEntry>> f38146b;

    /* renamed from: c  reason: collision with root package name */
    private final float f38147c;

    public b2() {
        throw null;
    }

    public b2(HeartSignalMeasurement heartSignalMeasurement, Map map) {
        this.f38145a = heartSignalMeasurement;
        this.f38146b = map;
        this.f38147c = 0.0f;
    }

    public final Map<EcgLeadType, List<EcgEntry>> a() {
        return this.f38146b;
    }

    public final HeartSignalMeasurement b() {
        return this.f38145a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        if (kotlin.jvm.internal.u.e(this.f38145a, b2Var.f38145a) && kotlin.jvm.internal.u.e(this.f38146b, b2Var.f38146b) && Float.compare(this.f38147c, b2Var.f38147c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f38146b.hashCode();
        return Float.hashCode(this.f38147c) + ((hashCode + (this.f38145a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EcgMultipleLeadsWithGraphData(heartSignalMeasurement=");
        sb2.append(this.f38145a);
        sb2.append(", graphData=");
        sb2.append(this.f38146b);
        sb2.append(", durationToDisplay=");
        return a0.a.b(sb2, this.f38147c, ")");
    }
}
