package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.vasistas.v2.model.CoreTemperatureVasistas;
import com.withings.wiscale2.activity.workout.model.temperature.WorkoutTemperatureGraphData;
import com.withings.wiscale2.activity.workout.ui.detail.x1;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
/* compiled from: WorkoutDetailFragment.kt */
/* loaded from: classes4.dex */
final class m2 extends kotlin.jvm.internal.w implements ym0.l<WorkoutTemperatureGraphData, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j3 f49436a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ x1 f49437b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(j3 j3Var, x1 x1Var) {
        super(1);
        this.f49436a = j3Var;
        this.f49437b = x1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(WorkoutTemperatureGraphData workoutTemperatureGraphData) {
        Track track;
        int i11;
        za0.d dVar;
        List<CoreTemperatureVasistas> vasistas;
        WorkoutTemperatureGraphData workoutTemperatureGraphData2 = workoutTemperatureGraphData;
        j3 j3Var = this.f49436a;
        boolean w12 = j3Var.w1();
        x1 x1Var = this.f49437b;
        if ((w12 || (workoutTemperatureGraphData2 != null && (vasistas = workoutTemperatureGraphData2.getVasistas()) != null && vasistas.size() > 1)) && workoutTemperatureGraphData2 != null && (track = workoutTemperatureGraphData2.getTrack()) != null) {
            long duration = track.getDuration();
            Long valueOf = Long.valueOf(duration);
            i11 = x1Var.f49780h;
            if (duration <= i11 || workoutTemperatureGraphData2.getVasistas().size() <= 1) {
                valueOf = null;
            }
            if (valueOf != null) {
                dVar = x1Var.f49794v;
                if (dVar != null) {
                    dVar.f(workoutTemperatureGraphData2);
                    x1.V1(x1Var);
                } else {
                    kotlin.jvm.internal.u.s("temperatureView");
                    throw null;
                }
            }
        }
        j3Var.r1().observe(x1Var.getViewLifecycleOwner(), new x1.e(new l2(x1Var)));
        return nm0.y.f85009a;
    }
}
