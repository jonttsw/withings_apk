package com.withings.wiscale2.activity.workout.ui.detail;

import android.app.Application;
import androidx.lifecycle.k1;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.workout.category.model.WorkoutCategoryManager;
/* compiled from: Extensions.kt */
/* loaded from: classes4.dex */
public final class n5 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutListActivity f49489a;

    public n5(WorkoutListActivity workoutListActivity) {
        this.f49489a = workoutListActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        WorkoutListActivity workoutListActivity = this.f49489a;
        Application application = workoutListActivity.getApplication();
        kotlin.jvm.internal.u.i(application, "getApplication(...)");
        WorkoutManager workoutManager = WorkoutManager.Companion.get();
        WorkoutCategoryManager workoutCategoryManager = WorkoutCategoryManager.get();
        kotlin.jvm.internal.u.i(workoutCategoryManager, "get(...)");
        return new v5(application, workoutManager, workoutCategoryManager, WorkoutListActivity.C3(workoutListActivity), WorkoutListActivity.z3(workoutListActivity), WorkoutListActivity.A3(workoutListActivity));
    }
}
