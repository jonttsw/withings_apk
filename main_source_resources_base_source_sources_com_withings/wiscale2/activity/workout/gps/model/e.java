package com.withings.wiscale2.activity.workout.gps.model;

import android.os.Build;
import com.withings.liveworkout.model.LiveWorkout;
import com.withings.wiscale2.activity.workout.gps.model.g;
import ui.d;
/* compiled from: GpsTrackingServiceStarter.kt */
/* loaded from: classes4.dex */
public final class e implements d.InterfaceC1716d {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f48750a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LiveWorkout f48751b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(f fVar, LiveWorkout liveWorkout) {
        this.f48750a = fVar;
        this.f48751b = liveWorkout;
    }

    @Override // ui.d.InterfaceC1716d
    public final void b() {
        ui.d dVar;
        ui.d dVar2;
        u70.a aVar;
        f fVar = this.f48750a;
        dVar = fVar.f48753b;
        if (dVar.h()) {
            dVar2 = fVar.f48753b;
            dVar2.k(this);
            aVar = fVar.f48754c;
            boolean d11 = aVar.d(0L);
            LiveWorkout liveWorkout = this.f48751b;
            if (!d11 || Build.VERSION.SDK_INT < 31) {
                fVar.j(liveWorkout);
            } else {
                fVar.f48755d = new g.c(liveWorkout);
            }
        }
    }
}
