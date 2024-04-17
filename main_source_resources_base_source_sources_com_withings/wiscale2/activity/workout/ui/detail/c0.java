package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.location.model.GpsLocation;
import com.withings.wiscale2.track.data.GpsSummary;
import java.util.List;
/* compiled from: WorkoutHeader.kt */
/* loaded from: classes4.dex */
public final class c0 extends v0 {

    /* renamed from: f  reason: collision with root package name */
    private final Object f49143f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, com.withings.workout.ui.GpsLocationMapView$b] */
    public c0(Object obj, String str, List<GpsLocation> locations, GpsSummary gpsSummary, String str2) {
        super(str, locations, gpsSummary, str2, new Object());
        kotlin.jvm.internal.u.j(locations, "locations");
        this.f49143f = obj;
    }

    public final Object g() {
        return this.f49143f;
    }
}
