package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.workout.ui.ProviderMapView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutPreview.kt */
/* loaded from: classes4.dex */
public final class k7 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutPreview f49382a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f49383b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(WorkoutPreview workoutPreview, long j5) {
        super(0);
        this.f49382a = workoutPreview;
        this.f49383b = j5;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.withings.wiscale2.activity.workout.ui.detail.f7] */
    @Override // ym0.a
    public final nm0.y invoke() {
        ProviderMapView mapView;
        Runnable runnable;
        int i11 = WorkoutPreview.f49084x;
        final WorkoutPreview workoutPreview = this.f49382a;
        workoutPreview.getClass();
        final long j5 = this.f49383b;
        workoutPreview.f49088w = new Runnable() { // from class: com.withings.wiscale2.activity.workout.ui.detail.f7
            @Override // java.lang.Runnable
            public final void run() {
                WorkoutPreview.t(WorkoutPreview.this, j5);
            }
        };
        mapView = workoutPreview.getMapView();
        runnable = workoutPreview.f49088w;
        mapView.postDelayed(runnable, 1000L);
        return nm0.y.f85009a;
    }
}
