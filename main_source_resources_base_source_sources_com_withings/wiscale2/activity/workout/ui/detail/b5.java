package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.vasistas.body.HRZonesAggregate;
import com.withings.workout.workoutdata.WorkoutData;
import java.util.List;
/* compiled from: WorkoutHeartRate.kt */
/* loaded from: classes4.dex */
public final class b5 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f49127a;

    public b5(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        this.f49127a = context;
    }

    private final com.withings.common.compose.component.u1 b(float f11, float f12, int i11, int i12) {
        Context context = this.f49127a;
        String string = context.getString(i12);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        return new com.withings.common.compose.component.u1(string, a3.g.n(context, f11), null, f12, androidx.core.content.a.getColor(context, i11), null, null, 100);
    }

    public final List<com.withings.common.compose.component.u1> a(WorkoutData workoutData) {
        HRZonesAggregate b10 = androidx.collection.c.b(workoutData);
        float h11 = b10.h();
        float c11 = b10.c();
        float g11 = b10.g();
        float d11 = b10.d();
        float b02 = kotlin.collections.x.b0(kotlin.collections.x.W(Float.valueOf(h11), Float.valueOf(c11), Float.valueOf(g11), Float.valueOf(d11)));
        return kotlin.collections.x.W(b(h11, h11 / b02, C1987R.color.datavizMonochromaticNeutral5, C1987R.string._HR_PEAK_ZONE_), b(c11, c11 / b02, C1987R.color.datavizMonochromaticNeutral4, C1987R.string._HR_INTENSE_ZONE_), b(g11, g11 / b02, C1987R.color.datavizMonochromaticNeutral3, C1987R.string._HR_MODERATE_ZONE_), b(d11, d11 / b02, C1987R.color.datavizMonochromaticNeutral2, C1987R.string._HR_LIGHT_ZONE_));
    }
}
