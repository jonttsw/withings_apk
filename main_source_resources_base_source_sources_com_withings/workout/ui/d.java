package com.withings.workout.ui;

import android.content.Context;
import com.withings.location.model.GpsLocation;
import com.withings.location.model.GpsLocationsSummary;
import com.withings.wiscale2.C1987R;
import com.withings.workout.ui.GpsLocationMapView;
import java.util.List;
import kotlin.jvm.internal.u;
/* compiled from: WorkoutMapDelegate.kt */
/* loaded from: classes5.dex */
public final class d implements GpsLocationMapView.b {

    /* renamed from: a  reason: collision with root package name */
    private int f62979a;

    @Override // com.withings.workout.ui.GpsLocationMapView.b
    public final void a(Context context) {
        this.f62979a = androidx.core.content.a.getColor(context, C1987R.color.statusInfo);
    }

    @Override // com.withings.workout.ui.GpsLocationMapView.b
    public final int b() {
        return C1987R.raw.workout_map_style_measurement_item;
    }

    @Override // com.withings.workout.ui.GpsLocationMapView.b
    public final void c(ProviderMapView mapView, List<GpsLocation> locations, GpsLocationsSummary gpsLocationsSummary) {
        u.j(mapView, "mapView");
        u.j(locations, "locations");
        mapView.d(locations, this.f62979a, 5.0f);
        mapView.setVisibility(0);
    }
}
