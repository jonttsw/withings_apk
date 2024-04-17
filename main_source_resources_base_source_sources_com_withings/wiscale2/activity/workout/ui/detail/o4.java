package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.workout.workoutdata.WorkoutData;
/* compiled from: WorkoutHeartRate.kt */
/* loaded from: classes4.dex */
public final class o4 {

    /* renamed from: a  reason: collision with root package name */
    private final jm.a f49511a;

    public o4(jm.a measureFormatter) {
        kotlin.jvm.internal.u.j(measureFormatter, "measureFormatter");
        this.f49511a = measureFormatter;
    }

    public final String a(WorkoutData workoutData) {
        int b10 = androidx.collection.c.b(workoutData).b();
        Integer valueOf = Integer.valueOf(b10);
        if (b10 <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            String f11 = this.f49511a.f(valueOf.intValue(), 11);
            if (f11 != null) {
                return f11;
            }
        }
        return "-";
    }
}
