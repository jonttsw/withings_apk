package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.location.model.GpsLocation;
import com.withings.wiscale2.track.data.GpsSummary;
import com.withings.workout.ui.GpsLocationMapView;
import java.util.List;
/* compiled from: WorkoutHeader.kt */
/* loaded from: classes4.dex */
public class v0 extends c4 {

    /* renamed from: b  reason: collision with root package name */
    private final String f49729b;

    /* renamed from: c  reason: collision with root package name */
    private final List<GpsLocation> f49730c;

    /* renamed from: d  reason: collision with root package name */
    private final GpsSummary f49731d;

    /* renamed from: e  reason: collision with root package name */
    private final GpsLocationMapView.b f49732e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(String str, List<GpsLocation> locations, GpsSummary gpsSummary, String str2, GpsLocationMapView.b mapDelegate) {
        super(str2);
        kotlin.jvm.internal.u.j(locations, "locations");
        kotlin.jvm.internal.u.j(mapDelegate, "mapDelegate");
        this.f49729b = str;
        this.f49730c = locations;
        this.f49731d = gpsSummary;
        this.f49732e = mapDelegate;
    }

    public final String c() {
        return this.f49729b;
    }

    public final GpsSummary d() {
        return this.f49731d;
    }

    public final List<GpsLocation> e() {
        return this.f49730c;
    }

    public final GpsLocationMapView.b f() {
        return this.f49732e;
    }
}
