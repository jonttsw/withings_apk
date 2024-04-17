package com.withings.location.domain.uc;

import com.withings.location.model.GpsLocation;
import com.withings.location.model.Pause;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import pm0.a;
/* compiled from: ComputeSpeed.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ$\u0010\u0005\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bJ4\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bJ$\u0010\u0012\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bJ\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/withings/location/domain/uc/ComputeSpeed;", "", "computeGpsDistance", "Lcom/withings/location/domain/uc/ComputeGpsDistance;", "(Lcom/withings/location/domain/uc/ComputeGpsDistance;)V", "computeAverageSpeed", "", "distanceInMeter", "duration", "Lorg/joda/time/Duration;", "gpsLocations", "", "Lcom/withings/location/model/GpsLocation;", "pauses", "Lcom/withings/location/model/Pause;", "start", "Lorg/joda/time/DateTime;", "end", "computeLiveSpeed", "recomputeGpsLocationSpeed", "Companion", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComputeSpeed {
    public static final Companion Companion = new Companion(null);
    private static final int SPEED_LIVE_WINDOW_MS = 20000;
    private final ComputeGpsDistance computeGpsDistance;

    /* compiled from: ComputeSpeed.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/location/domain/uc/ComputeSpeed$Companion;", "", "()V", "SPEED_LIVE_WINDOW_MS", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public ComputeSpeed(ComputeGpsDistance computeGpsDistance) {
        u.j(computeGpsDistance, "computeGpsDistance");
        this.computeGpsDistance = computeGpsDistance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ float computeAverageSpeed$default(ComputeSpeed computeSpeed, List list, List list2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list2 = i0.f76187a;
        }
        return computeSpeed.computeAverageSpeed(list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ float computeLiveSpeed$default(ComputeSpeed computeSpeed, List list, List list2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list2 = i0.f76187a;
        }
        return computeSpeed.computeLiveSpeed(list, list2);
    }

    public final float computeAverageSpeed(float f11, Duration duration) {
        u.j(duration, "duration");
        if (duration.getStandardSeconds() > 0) {
            return f11 / ((float) duration.getStandardSeconds());
        }
        return 0.0f;
    }

    public final float computeLiveSpeed(List<GpsLocation> gpsLocations, List<Pause> pauses) {
        u.j(gpsLocations, "gpsLocations");
        u.j(pauses, "pauses");
        List<GpsLocation> arrayList = new ArrayList<>();
        for (Object obj : gpsLocations) {
            if (DateTime.now().getMillis() - ((GpsLocation) obj).getDate().getMillis() <= 20000) {
                arrayList.add(obj);
            }
        }
        return computeAverageSpeed(arrayList, pauses);
    }

    public final List<GpsLocation> recomputeGpsLocationSpeed(List<GpsLocation> gpsLocations) {
        GpsLocation copy$default;
        u.j(gpsLocations, "gpsLocations");
        List<GpsLocation> list = gpsLocations;
        ArrayList arrayList = new ArrayList(x.y(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 >= 0) {
                GpsLocation gpsLocation = (GpsLocation) obj;
                GpsLocation gpsLocation2 = (GpsLocation) x.N(i11 - 1, gpsLocations);
                GpsLocation gpsLocation3 = (GpsLocation) x.N(i12, gpsLocations);
                if (gpsLocation2 == null) {
                    copy$default = GpsLocation.copy$default(gpsLocation, 0L, null, null, null, null, 0.0f, 0.0f, 95, null);
                } else if (gpsLocation3 == null) {
                    copy$default = GpsLocation.copy$default(gpsLocation, 0L, null, null, null, null, computeAverageSpeed$default(this, x.W(gpsLocation2, gpsLocation), null, 2, null), 0.0f, 95, null);
                } else {
                    copy$default = GpsLocation.copy$default(gpsLocation, 0L, null, null, null, null, computeAverageSpeed$default(this, x.W(gpsLocation2, gpsLocation, gpsLocation3), null, 2, null), 0.0f, 95, null);
                }
                arrayList.add(copy$default);
                i11 = i12;
            } else {
                x.K0();
                throw null;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ float computeAverageSpeed$default(ComputeSpeed computeSpeed, DateTime dateTime, DateTime dateTime2, List list, List list2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            list2 = i0.f76187a;
        }
        return computeSpeed.computeAverageSpeed(dateTime, dateTime2, list, list2);
    }

    public final float computeAverageSpeed(List<GpsLocation> gpsLocations, List<Pause> pauses) {
        u.j(gpsLocations, "gpsLocations");
        u.j(pauses, "pauses");
        if ((gpsLocations.size() >= 2 ? gpsLocations : null) != null) {
            return computeAverageSpeed(((GpsLocation) x.I(gpsLocations)).getDate(), ((GpsLocation) x.T(gpsLocations)).getDate(), gpsLocations, pauses);
        }
        return 0.0f;
    }

    public final float computeAverageSpeed(DateTime start, DateTime end, List<GpsLocation> gpsLocations, List<Pause> pauses) {
        u.j(start, "start");
        u.j(end, "end");
        u.j(gpsLocations, "gpsLocations");
        u.j(pauses, "pauses");
        if ((gpsLocations.isEmpty() ^ true ? gpsLocations : null) != null) {
            double computeFiltered = this.computeGpsDistance.computeFiltered(gpsLocations, pauses);
            Long valueOf = Long.valueOf(new Duration((DateTime) a.d(((GpsLocation) x.I(gpsLocations)).getDate(), start), (DateTime) a.c(((GpsLocation) x.T(gpsLocations)).getDate(), end)).getStandardSeconds());
            if (valueOf.longValue() <= 0) {
                valueOf = null;
            }
            Float valueOf2 = valueOf != null ? Float.valueOf((float) (computeFiltered / valueOf.longValue())) : null;
            if (valueOf2 != null) {
                return valueOf2.floatValue();
            }
        }
        return 0.0f;
    }
}
