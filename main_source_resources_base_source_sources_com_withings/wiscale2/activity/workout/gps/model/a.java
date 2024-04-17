package com.withings.wiscale2.activity.workout.gps.model;

import android.location.Location;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import nm0.y;
import ym0.l;
/* compiled from: GpsTrackingService.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class a extends s implements l<Location, y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(GpsTrackingService gpsTrackingService) {
        super(1, gpsTrackingService, GpsTrackingService.class, "onLocationReceived", "onLocationReceived(Landroid/location/Location;)V", 0);
    }

    @Override // ym0.l
    public final y invoke(Location location) {
        Location p02 = location;
        u.j(p02, "p0");
        GpsTrackingService.g((GpsTrackingService) this.receiver, p02);
        return y.f85009a;
    }
}
