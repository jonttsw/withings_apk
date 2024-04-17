package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Intent;
import com.withings.workout.ui.ProviderMapView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutPreview.kt */
/* loaded from: classes4.dex */
public final class i7 extends kotlin.jvm.internal.w implements ym0.l<vj0.a, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutPreview f49243a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Intent f49244b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(WorkoutPreview workoutPreview, Intent intent) {
        super(1);
        this.f49243a = workoutPreview;
        this.f49244b = intent;
    }

    @Override // ym0.l
    public final nm0.y invoke(vj0.a aVar) {
        ProviderMapView mapView;
        mapView = this.f49243a.getMapView();
        mapView.getContext().startActivity(this.f49244b);
        return nm0.y.f85009a;
    }
}
