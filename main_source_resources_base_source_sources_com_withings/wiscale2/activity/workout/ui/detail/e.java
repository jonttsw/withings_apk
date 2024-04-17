package com.withings.wiscale2.activity.workout.ui.detail;

import android.app.Application;
import androidx.lifecycle.k1;
import com.withings.location.domain.uc.ComputePace;
import com.withings.location.domain.uc.ComputeSpeed;
import com.withings.location.domain.uc.HasEnoughGpsLocations;
import com.withings.location.repository.GpsLocationRepository;
import com.withings.user.User;
import com.withings.wiscale2.activity.workout.model.DistanceSelector;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.workout.category.model.WorkoutCategoryManager;
import jm.a;
import pm.e;
/* compiled from: Extensions.kt */
/* loaded from: classes4.dex */
public final class e implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AllWorkoutsActivity f49166a;

    public e(AllWorkoutsActivity allWorkoutsActivity) {
        this.f49166a = allWorkoutsActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        AllWorkoutsActivity allWorkoutsActivity = this.f49166a;
        Application application = allWorkoutsActivity.getApplication();
        kotlin.jvm.internal.u.i(application, "getApplication(...)");
        User z32 = AllWorkoutsActivity.z3(allWorkoutsActivity);
        jm.a a11 = a.d.a(allWorkoutsActivity);
        DistanceSelector distanceSelector = new DistanceSelector();
        e.a aVar = new e.a(allWorkoutsActivity, 0);
        WorkoutManager workoutManager = WorkoutManager.Companion.get();
        WorkoutCategoryManager workoutCategoryManager = WorkoutCategoryManager.get();
        kotlin.jvm.internal.u.i(workoutCategoryManager, "get(...)");
        HasEnoughGpsLocations hasEnoughGpsLocations = allWorkoutsActivity.f49014f;
        if (hasEnoughGpsLocations != null) {
            ComputePace computePace = allWorkoutsActivity.f49015g;
            if (computePace != null) {
                ComputeSpeed computeSpeed = allWorkoutsActivity.f49016h;
                if (computeSpeed != null) {
                    GpsLocationRepository gpsLocationRepository = allWorkoutsActivity.f49013e;
                    if (gpsLocationRepository != null) {
                        return new o7(application, z32, a11, distanceSelector, aVar, workoutManager, workoutCategoryManager, hasEnoughGpsLocations, computePace, computeSpeed, gpsLocationRepository);
                    }
                    kotlin.jvm.internal.u.s("gpsLocationRepository");
                    throw null;
                }
                kotlin.jvm.internal.u.s("computeSpeed");
                throw null;
            }
            kotlin.jvm.internal.u.s("computePace");
            throw null;
        }
        kotlin.jvm.internal.u.s("hasEnoughGpsLocations");
        throw null;
    }
}
