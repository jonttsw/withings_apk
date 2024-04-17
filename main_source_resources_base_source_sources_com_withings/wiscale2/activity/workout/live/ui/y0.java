package com.withings.wiscale2.activity.workout.live.ui;

import android.app.Application;
import android.location.LocationManager;
/* compiled from: LiveWorkoutViewModel.kt */
/* loaded from: classes4.dex */
final class y0 extends kotlin.jvm.internal.w implements ym0.a<ui.d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Application f48947a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(Application application) {
        super(0);
        this.f48947a = application;
    }

    @Override // ym0.a
    public final ui.d invoke() {
        Application application = this.f48947a;
        Object systemService = application.getSystemService("location");
        kotlin.jvm.internal.u.h(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        return new ui.d(application, (LocationManager) systemService, 0);
    }
}
