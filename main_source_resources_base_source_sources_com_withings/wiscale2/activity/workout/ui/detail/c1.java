package com.withings.wiscale2.activity.workout.ui.detail;

import android.app.Application;
import androidx.lifecycle.k1;
import com.withings.wiscale2.activity.workout.model.WorkoutDataBuilder;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.workout.category.model.WorkoutCategoryManager;
/* compiled from: Extensions.kt */
/* loaded from: classes4.dex */
public final class c1 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PostWorkoutActivity f49144a;

    public c1(PostWorkoutActivity postWorkoutActivity) {
        this.f49144a = postWorkoutActivity;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, ka0.c] */
    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        PostWorkoutActivity postWorkoutActivity = this.f49144a;
        Application application = postWorkoutActivity.getApplication();
        kotlin.jvm.internal.u.i(application, "getApplication(...)");
        WorkoutManager workoutManager = WorkoutManager.Companion.get();
        long C3 = PostWorkoutActivity.C3(postWorkoutActivity);
        lj0.h0 e11 = lj0.h0.e();
        kotlin.jvm.internal.u.i(e11, "get(...)");
        lj0.w wVar = lj0.w.f79924c;
        if (wVar != null) {
            m70.i b10 = m70.i.b();
            kotlin.jvm.internal.u.i(b10, "get(...)");
            WorkoutCategoryManager workoutCategoryManager = WorkoutCategoryManager.get();
            kotlin.jvm.internal.u.i(workoutCategoryManager, "get(...)");
            WorkoutDataBuilder workoutDataBuilder = new WorkoutDataBuilder(e11, wVar, b10, workoutCategoryManager, new Object());
            ua0.a aVar = postWorkoutActivity.f49062e;
            if (aVar != null) {
                return new l1(application, workoutManager, C3, workoutDataBuilder, aVar);
            }
            kotlin.jvm.internal.u.s("computeTrackGpsSummary");
            throw null;
        }
        kotlin.jvm.internal.u.s("instance");
        throw null;
    }
}
