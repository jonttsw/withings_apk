package com.withings.ecg.details;

import com.withings.ecg.graph.EcgEntry;
import com.withings.ecg.model.HeartSignalMeasurement;
import java.util.List;
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
public final class o2 {

    /* renamed from: a  reason: collision with root package name */
    private final HeartSignalMeasurement f38282a;

    /* renamed from: b  reason: collision with root package name */
    private final List<EcgEntry> f38283b;

    /* renamed from: c  reason: collision with root package name */
    private final float f38284c;

    public o2(HeartSignalMeasurement heartSignalMeasurement, List<EcgEntry> graphData, float f11) {
        kotlin.jvm.internal.u.j(graphData, "graphData");
        this.f38282a = heartSignalMeasurement;
        this.f38283b = graphData;
        this.f38284c = f11;
    }

    public final float a() {
        return this.f38284c;
    }

    public final List<EcgEntry> b() {
        return this.f38283b;
    }

    public final HeartSignalMeasurement c() {
        return this.f38282a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        if (kotlin.jvm.internal.u.e(this.f38282a, o2Var.f38282a) && kotlin.jvm.internal.u.e(this.f38283b, o2Var.f38283b) && Float.compare(this.f38284c, o2Var.f38284c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f38284c) + defpackage.e.b(this.f38283b, this.f38282a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EcgWithGraphData(heartSignalMeasurement=");
        sb2.append(this.f38282a);
        sb2.append(", graphData=");
        sb2.append(this.f38283b);
        sb2.append(", durationToDisplay=");
        return a0.a.b(sb2, this.f38284c, ")");
    }
}
