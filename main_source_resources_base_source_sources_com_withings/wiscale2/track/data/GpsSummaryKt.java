package com.withings.wiscale2.track.data;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.location.model.GpsLocation;
import com.withings.location.model.GpsLocationsSummary;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: GpsSummary.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, d2 = {"toGpsLocationsSummary", "Lcom/withings/location/model/GpsLocationsSummary;", "Lcom/withings/wiscale2/track/data/GpsSummary;", "toTrackGpsSummary", "HealthMate_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GpsSummaryKt {
    public static final GpsLocationsSummary toGpsLocationsSummary(GpsSummary gpsSummary) {
        u.j(gpsSummary, "<this>");
        return new GpsLocationsSummary(gpsSummary.getDistance(), new GpsLocationsSummary.SpeedSummary(gpsSummary.getAverageSpeed(), gpsSummary.getMinSpeed(), gpsSummary.getMaxSpeed()), new GpsLocation.Position(gpsSummary.getStartLatitude(), gpsSummary.getStartLongitude(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE), new GpsLocation.Position(gpsSummary.getEndLatitude(), gpsSummary.getEndLongitude(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE), new GpsLocation.Position(gpsSummary.getCenterLatitude(), gpsSummary.getCenterLongitude(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE), new GpsLocationsSummary.SpanDegree(gpsSummary.getSpanLatitudeDelta(), gpsSummary.getSpanLongitudeDelta()));
    }

    public static final GpsSummary toTrackGpsSummary(GpsLocationsSummary gpsLocationsSummary) {
        u.j(gpsLocationsSummary, "<this>");
        return new GpsSummary(gpsLocationsSummary.getDistance(), gpsLocationsSummary.getSpeedSummary().getAverage(), gpsLocationsSummary.getSpeedSummary().getMin(), gpsLocationsSummary.getSpeedSummary().getMax(), gpsLocationsSummary.getStartPosition().getLatitude(), gpsLocationsSummary.getStartPosition().getLongitude(), gpsLocationsSummary.getEndPosition().getLatitude(), gpsLocationsSummary.getEndPosition().getLongitude(), gpsLocationsSummary.getCenterPosition().getLatitude(), gpsLocationsSummary.getCenterPosition().getLongitude(), gpsLocationsSummary.getSpanDegree().getLatitude(), gpsLocationsSummary.getSpanDegree().getLongitude());
    }
}
