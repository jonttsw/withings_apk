package com.withings.location.domain.uc;

import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.location.model.GpsLocation;
import com.withings.location.model.PaceDistanceUnit;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Duration;
/* compiled from: ComputePace.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000bJ\u001c\u0010\u000f\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000e\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/withings/location/domain/uc/ComputePace;", "", "computeSpeed", "Lcom/withings/location/domain/uc/ComputeSpeed;", "(Lcom/withings/location/domain/uc/ComputeSpeed;)V", "fromDistance", "Lorg/joda/time/Duration;", "distanceInMeter", "", "duration", "distanceUnit", "Lcom/withings/location/model/PaceDistanceUnit;", "fromSpeed", "speed", HealthConstants.FoodIntake.UNIT, "livePace", "gpsLocations", "", "Lcom/withings/location/model/GpsLocation;", "Companion", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComputePace {
    public static final Companion Companion = new Companion(null);
    private static final int PACE_LIVE_WINDOW_MS = 20000;
    private final ComputeSpeed computeSpeed;

    /* compiled from: ComputePace.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/location/domain/uc/ComputePace$Companion;", "", "()V", "PACE_LIVE_WINDOW_MS", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public ComputePace(ComputeSpeed computeSpeed) {
        u.j(computeSpeed, "computeSpeed");
        this.computeSpeed = computeSpeed;
    }

    public final Duration fromDistance(float f11, Duration duration, PaceDistanceUnit distanceUnit) {
        u.j(duration, "duration");
        u.j(distanceUnit, "distanceUnit");
        return fromSpeed(this.computeSpeed.computeAverageSpeed(f11, duration), distanceUnit);
    }

    public final Duration fromSpeed(float f11, PaceDistanceUnit unit) {
        u.j(unit, "unit");
        if (f11 > 0.0f) {
            return new Duration((long) ((unit.getDistanceWindowInMeter() * 1000) / f11));
        }
        Duration ZERO = Duration.ZERO;
        u.i(ZERO, "ZERO");
        return ZERO;
    }

    public final Duration livePace(List<GpsLocation> gpsLocations, PaceDistanceUnit unit) {
        u.j(gpsLocations, "gpsLocations");
        u.j(unit, "unit");
        ArrayList arrayList = new ArrayList();
        for (Object obj : gpsLocations) {
            if (DateTime.now().getMillis() - ((GpsLocation) obj).getDate().getMillis() <= 20000) {
                arrayList.add(obj);
            }
        }
        return fromSpeed(ComputeSpeed.computeAverageSpeed$default(this.computeSpeed, arrayList, null, 2, null), unit);
    }
}
