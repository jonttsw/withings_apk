package com.withings.wiscale2.activity.workout.gps.model;

import com.withings.liveworkout.model.LiveWorkout;
import com.withings.workout.category.model.WorkoutCategory;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: GpsTrackingService.kt */
/* loaded from: classes4.dex */
final class c extends w implements l<WorkoutCategory, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ GpsTrackingService f48745a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LiveWorkout f48746b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GpsTrackingService gpsTrackingService, LiveWorkout liveWorkout) {
        super(1);
        this.f48745a = gpsTrackingService;
        this.f48746b = liveWorkout;
    }

    @Override // ym0.l
    public final y invoke(WorkoutCategory workoutCategory) {
        boolean z5;
        WorkoutCategory workoutCategory2 = workoutCategory;
        GpsTrackingService gpsTrackingService = this.f48745a;
        if (workoutCategory2 != null) {
            GpsTrackingService.i(gpsTrackingService, this.f48746b, workoutCategory2);
            gpsTrackingService.f48734e = workoutCategory2.isGpsRelevant();
            z5 = gpsTrackingService.f48734e;
            if (z5) {
                GpsTrackingService.f(gpsTrackingService);
            }
        } else {
            gpsTrackingService.stopSelf();
        }
        return y.f85009a;
    }
}
