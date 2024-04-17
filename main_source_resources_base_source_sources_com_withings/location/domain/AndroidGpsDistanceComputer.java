package com.withings.location.domain;

import android.location.Location;
import com.withings.location.model.GpsLocation;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: AndroidGpsDistanceComputer.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/withings/location/domain/AndroidGpsDistanceComputer;", "Lcom/withings/location/domain/GpsDistanceComputer;", "()V", "getDistance", "", "gpsPosition", "Lcom/withings/location/model/GpsLocation$Position;", "otherGpsPosition", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidGpsDistanceComputer implements GpsDistanceComputer {
    @Override // com.withings.location.domain.GpsDistanceComputer
    public double getDistance(GpsLocation.Position gpsPosition, GpsLocation.Position otherGpsPosition) {
        u.j(gpsPosition, "gpsPosition");
        u.j(otherGpsPosition, "otherGpsPosition");
        float[] fArr = {0.0f};
        Location.distanceBetween(gpsPosition.getLatitude(), gpsPosition.getLongitude(), otherGpsPosition.getLatitude(), otherGpsPosition.getLongitude(), fArr);
        return fArr[0];
    }
}
