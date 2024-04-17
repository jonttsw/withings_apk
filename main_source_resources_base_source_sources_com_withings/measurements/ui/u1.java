package com.withings.measurements.ui;

import com.withings.measurement.model.MeasurementsVertical;
/* compiled from: MeasurementsAnalytics.kt */
/* loaded from: classes4.dex */
public final class u1 implements ep.a {
    private static void a(long j5, MeasurementsVertical measurementsVertical) {
        String str;
        int i11 = v70.a.f103433b;
        nm0.j[] jVarArr = new nm0.j[2];
        jVarArr[0] = new nm0.j("selected_user", Long.valueOf(j5));
        if (measurementsVertical != null) {
            str = androidx.room.a.d(measurementsVertical);
        } else {
            str = null;
        }
        jVarArr[1] = new nm0.j("health_vertical", str);
        v70.a.c("measure_tab", kotlin.collections.s0.j(jVarArr), 2);
    }

    public static void b(long j5) {
        a(j5, null);
    }

    public static void c(long j5, MeasurementsVertical vertical) {
        kotlin.jvm.internal.u.j(vertical, "vertical");
        a(j5, vertical);
    }
}
