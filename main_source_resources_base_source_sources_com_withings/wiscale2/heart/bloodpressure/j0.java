package com.withings.wiscale2.heart.bloodpressure;

import com.withings.bloodpressure.core.BloodPressureCategory;
import com.withings.library.measure.MeasuresGroup;
/* compiled from: BloodPressureUtils.kt */
/* loaded from: classes5.dex */
public final class j0 {
    public static final BloodPressureCategory a(MeasuresGroup measuresGroup, String country) {
        kotlin.jvm.internal.u.j(measuresGroup, "measuresGroup");
        kotlin.jvm.internal.u.j(country, "country");
        double d11 = measuresGroup.getMeasureForType(10).f95794y;
        double d12 = measuresGroup.getMeasureForType(9).f95794y;
        int i11 = BloodPressureCategory.f32883e;
        return BloodPressureCategory.a.a(country, d11, d12);
    }
}
