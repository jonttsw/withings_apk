package com.withings.location.domain.uc;

import com.withings.location.model.GpsLocation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Duration;
/* compiled from: HasEnoughGpsLocations.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ$\u0010\n\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ&\u0010\u000e\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/withings/location/domain/uc/HasEnoughGpsLocations;", "", "countTotalGapDuration", "Lcom/withings/location/domain/uc/CountTotalGapDuration;", "(Lcom/withings/location/domain/uc/CountTotalGapDuration;)V", "forMap", "", "locations", "", "Lcom/withings/location/model/GpsLocation;", "forPerformance", "start", "Lorg/joda/time/DateTime;", "end", "hasEnoughTrackingPoints", "isTrackLongEnough", "trackDuration", "Lorg/joda/time/Duration;", "Companion", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HasEnoughGpsLocations {
    public static final Companion Companion = new Companion(null);
    private static final long LOCATION_REQUEST_INTERVAL_MS = 7000;
    private static final float MAX_GAP_DURATION_RATIO = 0.5f;
    private static final double MIN_GAP_DISTANCE_METER = 15.0d;
    private static final long MIN_GAP_DURATION_MILLIS = 30000;
    private static final int MIN_TRACKING_DURATION_MINUTES = 5;
    private static final float MIN_TRACKING_DURATION_RATIO = 0.3f;
    private final CountTotalGapDuration countTotalGapDuration;

    /* compiled from: HasEnoughGpsLocations.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/withings/location/domain/uc/HasEnoughGpsLocations$Companion;", "", "()V", "LOCATION_REQUEST_INTERVAL_MS", "", "MAX_GAP_DURATION_RATIO", "", "MIN_GAP_DISTANCE_METER", "", "MIN_GAP_DURATION_MILLIS", "MIN_TRACKING_DURATION_MINUTES", "", "MIN_TRACKING_DURATION_RATIO", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public HasEnoughGpsLocations(CountTotalGapDuration countTotalGapDuration) {
        u.j(countTotalGapDuration, "countTotalGapDuration");
        this.countTotalGapDuration = countTotalGapDuration;
    }

    private final boolean hasEnoughTrackingPoints(List<GpsLocation> list, DateTime dateTime, DateTime dateTime2) {
        Duration duration = new Duration(dateTime, dateTime2);
        if (((float) this.countTotalGapDuration.invoke(list, dateTime, dateTime2, new Duration((long) MIN_GAP_DURATION_MILLIS), MIN_GAP_DISTANCE_METER).getMillis()) < ((float) duration.getMillis()) * 0.5f && list.size() >= (((float) duration.getMillis()) * 0.3f) / ((float) LOCATION_REQUEST_INTERVAL_MS)) {
            return true;
        }
        return false;
    }

    private final boolean isTrackLongEnough(Duration duration) {
        if (duration.getStandardMinutes() >= 5) {
            return true;
        }
        return false;
    }

    public final boolean forMap(List<GpsLocation> locations) {
        u.j(locations, "locations");
        return !locations.isEmpty();
    }

    public final boolean forPerformance(List<GpsLocation> locations, DateTime start, DateTime end) {
        u.j(locations, "locations");
        u.j(start, "start");
        u.j(end, "end");
        if (isTrackLongEnough(new Duration(start, end)) && hasEnoughTrackingPoints(locations, start, end)) {
            return true;
        }
        return false;
    }
}
