package com.withings.location.domain.uc;

import com.withings.location.domain.GpsDistanceComputer;
import com.withings.location.model.GpsLocation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.j;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.ReadableDuration;
/* compiled from: HasEnoughGpsLocations.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J7\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/withings/location/domain/uc/CountTotalGapDuration;", "", "gpsDistanceComputer", "Lcom/withings/location/domain/GpsDistanceComputer;", "(Lcom/withings/location/domain/GpsDistanceComputer;)V", "invoke", "Lorg/joda/time/Duration;", "locations", "", "Lcom/withings/location/model/GpsLocation;", "start", "Lorg/joda/time/DateTime;", "end", "minGapDuration", "minGapDistance", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CountTotalGapDuration {
    private final GpsDistanceComputer gpsDistanceComputer;

    public CountTotalGapDuration(GpsDistanceComputer gpsDistanceComputer) {
        u.j(gpsDistanceComputer, "gpsDistanceComputer");
        this.gpsDistanceComputer = gpsDistanceComputer;
    }

    public final Duration invoke(List<GpsLocation> locations, DateTime start, DateTime end, Duration minGapDuration, double d11) {
        List<GpsLocation> list;
        long j5;
        long j11;
        u.j(locations, "locations");
        u.j(start, "start");
        u.j(end, "end");
        u.j(minGapDuration, "minGapDuration");
        Duration duration = null;
        if (!locations.isEmpty()) {
            list = locations;
        } else {
            list = null;
        }
        if (list != null) {
            long j12 = 0;
            long j13 = 0;
            for (j jVar : x.Y0(list)) {
                GpsLocation gpsLocation = (GpsLocation) jVar.a();
                GpsLocation gpsLocation2 = (GpsLocation) jVar.b();
                Duration duration2 = new Duration(gpsLocation.getDate(), gpsLocation2.getDate());
                double distance = this.gpsDistanceComputer.getDistance(gpsLocation.getPosition(), gpsLocation2.getPosition());
                if (duration2.compareTo((ReadableDuration) minGapDuration) >= 0 && distance >= d11) {
                    j11 = duration2.getMillis();
                } else {
                    j11 = 0;
                }
                j13 += j11;
            }
            Duration duration3 = new Duration(start, ((GpsLocation) x.I(locations)).getDate());
            if (duration3.compareTo((ReadableDuration) minGapDuration) < 0) {
                duration3 = null;
            }
            if (duration3 != null) {
                j5 = duration3.getMillis();
            } else {
                j5 = 0;
            }
            long j14 = j13 + j5;
            Duration duration4 = new Duration(((GpsLocation) x.T(locations)).getDate(), end);
            if (duration4.compareTo((ReadableDuration) minGapDuration) >= 0) {
                duration = duration4;
            }
            if (duration != null) {
                j12 = duration.getMillis();
            }
            return new Duration(j14 + j12);
        }
        Duration ZERO = Duration.ZERO;
        u.i(ZERO, "ZERO");
        return ZERO;
    }
}
