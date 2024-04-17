package com.withings.location.domain;

import com.withings.location.model.GpsLocation;
import kotlin.Metadata;
/* compiled from: GpsDistanceComputer.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/withings/location/domain/GpsDistanceComputer;", "", "getDistance", "", "gpsPosition", "Lcom/withings/location/model/GpsLocation$Position;", "otherGpsPosition", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface GpsDistanceComputer {
    double getDistance(GpsLocation.Position position, GpsLocation.Position position2);
}
