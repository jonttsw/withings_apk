package com.withings.location.domain.uc;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.location.domain.GpsDistanceComputer;
import com.withings.location.model.GpsLocation;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.j;
import ym0.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ComputeElevation.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnm0/j;", "Lcom/withings/location/model/GpsLocation;", "it", "", "invoke", "(Lnm0/j;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ComputeElevation$computeElevation$2 extends w implements l<j<? extends GpsLocation, ? extends GpsLocation>, Boolean> {
    final /* synthetic */ boolean $ascent;
    final /* synthetic */ ComputeElevation this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComputeElevation$computeElevation$2(ComputeElevation computeElevation, boolean z5) {
        super(1);
        this.this$0 = computeElevation;
        this.$ascent = z5;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2(j<GpsLocation, GpsLocation> it) {
        GpsDistanceComputer gpsDistanceComputer;
        u.j(it, "it");
        double altitude = it.d().getPosition().getAltitude() - it.c().getPosition().getAltitude();
        gpsDistanceComputer = this.this$0.gpsDistanceComputer;
        double distance = gpsDistanceComputer.getDistance(it.c().getPosition(), it.d().getPosition());
        double degrees = Math.toDegrees(Math.asin(Math.abs(altitude) / distance));
        int i11 = (altitude > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1 : (altitude == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 0 : -1));
        boolean z5 = false;
        if ((i11 > 0) == this.$ascent && degrees < 45.0d && distance > 50.0d) {
            z5 = true;
        }
        return Boolean.valueOf(z5);
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ Boolean invoke(j<? extends GpsLocation, ? extends GpsLocation> jVar) {
        return invoke2((j<GpsLocation, GpsLocation>) jVar);
    }
}
