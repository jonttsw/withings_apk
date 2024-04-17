package com.withings.wiscale2.activity.workout.gps.model;

import com.withings.liveworkout.model.LiveWorkout;
import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.category.model.WorkoutCategoryManager;
import kotlin.jvm.internal.w;
/* compiled from: GpsTrackingService.kt */
/* loaded from: classes4.dex */
final class b extends w implements ym0.a<WorkoutCategory> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ GpsTrackingService f48743a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LiveWorkout f48744b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(GpsTrackingService gpsTrackingService, LiveWorkout liveWorkout) {
        super(0);
        this.f48743a = gpsTrackingService;
        this.f48744b = liveWorkout;
    }

    @Override // ym0.a
    public final WorkoutCategory invoke() {
        WorkoutCategoryManager workoutCategoryManager;
        workoutCategoryManager = this.f48743a.f48736g;
        return workoutCategoryManager.getWorkoutCategory(this.f48744b.getWorkoutCategoryId());
    }
}
