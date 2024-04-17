package com.withings.wiscale2.activity.workout.ui.performance.splits;

import android.app.Application;
import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import com.withings.location.domain.uc.ComputePace;
import com.withings.location.domain.uc.ComputeSplits;
import com.withings.location.repository.GpsLocationRepository;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import l70.w;
import lj0.h0;
/* compiled from: Extensions.kt */
/* loaded from: classes4.dex */
public final class t implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutSplitsActivity f50039a;

    public t(WorkoutSplitsActivity workoutSplitsActivity) {
        this.f50039a = workoutSplitsActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        WorkoutSplitsActivity workoutSplitsActivity = this.f50039a;
        Application application = workoutSplitsActivity.getApplication();
        kotlin.jvm.internal.u.i(application, "getApplication(...)");
        long F3 = WorkoutSplitsActivity.F3(workoutSplitsActivity);
        w a11 = w.a.a();
        WorkoutManager workoutManager = WorkoutManager.Companion.get();
        h0 e11 = h0.e();
        kotlin.jvm.internal.u.i(e11, "get(...)");
        GpsLocationRepository gpsLocationRepository = workoutSplitsActivity.f49963g;
        if (gpsLocationRepository != null) {
            ComputeSplits computeSplits = workoutSplitsActivity.f49961e;
            if (computeSplits != null) {
                ComputePace computePace = workoutSplitsActivity.f49962f;
                if (computePace != null) {
                    return new d(application, F3, a11, workoutManager, e11, gpsLocationRepository, computeSplits, computePace);
                }
                kotlin.jvm.internal.u.s("computePace");
                throw null;
            }
            kotlin.jvm.internal.u.s("computeSplits");
            throw null;
        }
        kotlin.jvm.internal.u.s("gpsLocationRepository");
        throw null;
    }
}
