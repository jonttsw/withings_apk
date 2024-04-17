package com.withings.location.domain.uc;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.location.model.GpsLocation;
import com.withings.location.model.PaceDistanceUnit;
import com.withings.location.model.Pause;
import com.withings.location.model.Split;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import om0.b;
import org.joda.time.DateTime;
import org.joda.time.Duration;
/* compiled from: ComputeSplits.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ2\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\nH\u0002J$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002JC\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/withings/location/domain/uc/ComputeSplits;", "", "computeGpsDistance", "Lcom/withings/location/domain/uc/ComputeGpsDistance;", "filterGpsLocationWithPause", "Lcom/withings/location/domain/uc/FilterGpsLocationWithPause;", "gpsLocationFilter", "Lcom/withings/location/domain/uc/GpsLocationFilter;", "(Lcom/withings/location/domain/uc/ComputeGpsDistance;Lcom/withings/location/domain/uc/FilterGpsLocationWithPause;Lcom/withings/location/domain/uc/GpsLocationFilter;)V", "getCumulatedDistance", "", "Lcom/withings/location/domain/uc/ComputeSplits$CumulatedDistance;", "start", "Lorg/joda/time/DateTime;", "end", "gpsLocationsByWindow", "Lcom/withings/location/model/GpsLocation;", "getSplits", "Lcom/withings/location/model/Split;", "cumulatedDistances", HealthConstants.FoodIntake.UNIT, "Lcom/withings/location/model/PaceDistanceUnit;", "invoke", "gpsLocations", "pauses", "Lcom/withings/location/model/Pause;", "CumulatedDistance", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComputeSplits {
    private final ComputeGpsDistance computeGpsDistance;
    private final FilterGpsLocationWithPause filterGpsLocationWithPause;
    private final GpsLocationFilter gpsLocationFilter;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ComputeSplits.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/withings/location/domain/uc/ComputeSplits$CumulatedDistance;", "", "duration", "Lorg/joda/time/Duration;", "distance", "", "(Lorg/joda/time/Duration;D)V", "getDistance", "()D", "getDuration", "()Lorg/joda/time/Duration;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CumulatedDistance {
        private final double distance;
        private final Duration duration;

        public CumulatedDistance(Duration duration, double d11) {
            u.j(duration, "duration");
            this.duration = duration;
            this.distance = d11;
        }

        public static /* synthetic */ CumulatedDistance copy$default(CumulatedDistance cumulatedDistance, Duration duration, double d11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                duration = cumulatedDistance.duration;
            }
            if ((i11 & 2) != 0) {
                d11 = cumulatedDistance.distance;
            }
            return cumulatedDistance.copy(duration, d11);
        }

        public final Duration component1() {
            return this.duration;
        }

        public final double component2() {
            return this.distance;
        }

        public final CumulatedDistance copy(Duration duration, double d11) {
            u.j(duration, "duration");
            return new CumulatedDistance(duration, d11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CumulatedDistance)) {
                return false;
            }
            CumulatedDistance cumulatedDistance = (CumulatedDistance) obj;
            if (u.e(this.duration, cumulatedDistance.duration) && Double.compare(this.distance, cumulatedDistance.distance) == 0) {
                return true;
            }
            return false;
        }

        public final double getDistance() {
            return this.distance;
        }

        public final Duration getDuration() {
            return this.duration;
        }

        public int hashCode() {
            return Double.hashCode(this.distance) + (this.duration.hashCode() * 31);
        }

        public String toString() {
            Duration duration = this.duration;
            double d11 = this.distance;
            return "CumulatedDistance(duration=" + duration + ", distance=" + d11 + ")";
        }
    }

    public ComputeSplits(ComputeGpsDistance computeGpsDistance, FilterGpsLocationWithPause filterGpsLocationWithPause, GpsLocationFilter gpsLocationFilter) {
        u.j(computeGpsDistance, "computeGpsDistance");
        u.j(filterGpsLocationWithPause, "filterGpsLocationWithPause");
        u.j(gpsLocationFilter, "gpsLocationFilter");
        this.computeGpsDistance = computeGpsDistance;
        this.filterGpsLocationWithPause = filterGpsLocationWithPause;
        this.gpsLocationFilter = gpsLocationFilter;
    }

    private final List<CumulatedDistance> getCumulatedDistance(DateTime dateTime, DateTime dateTime2, List<? extends List<GpsLocation>> list) {
        Duration duration = new Duration(dateTime, ((GpsLocation) x.I((List) x.I(list))).getDate());
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        double d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        while (it.hasNext()) {
            List list2 = (List) it.next();
            DateTime date = ((GpsLocation) x.I(list2)).getDate();
            List list3 = list2;
            ArrayList arrayList2 = new ArrayList(x.y(list3, 10));
            int i11 = 0;
            for (Object obj : list3) {
                int i12 = i11 + 1;
                if (i11 >= 0) {
                    Duration plus = duration.plus(new Duration(date, ((GpsLocation) obj).getDate()));
                    u.g(plus);
                    arrayList2.add(new CumulatedDistance(plus, this.computeGpsDistance.computeRaw(list2.subList(0, i11)) + d11));
                    i11 = i12;
                } else {
                    x.K0();
                    throw null;
                }
            }
            d11 = ((CumulatedDistance) x.T(arrayList2)).getDistance();
            duration = ((CumulatedDistance) x.T(arrayList2)).getDuration();
            x.n(arrayList2, arrayList);
        }
        Duration plus2 = duration.plus(new Duration(((GpsLocation) x.T((List) x.T(list))).getDate(), dateTime2));
        u.i(plus2, "plus(...)");
        return x.m0(new CumulatedDistance(plus2, d11), arrayList);
    }

    private final List<Split> getSplits(List<CumulatedDistance> list, PaceDistanceUnit paceDistanceUnit) {
        b bVar = new b();
        Duration duration = Duration.ZERO;
        double d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        for (CumulatedDistance cumulatedDistance : x.D(list)) {
            double distance = cumulatedDistance.getDistance() - d11;
            if (distance >= paceDistanceUnit.getDistanceWindowInMeter()) {
                Duration minus = cumulatedDistance.getDuration().minus(duration);
                u.g(minus);
                bVar.add(new Split(minus, distance));
                duration = cumulatedDistance.getDuration();
                d11 = cumulatedDistance.getDistance();
            }
        }
        CumulatedDistance cumulatedDistance2 = (CumulatedDistance) x.T(list);
        Duration minus2 = cumulatedDistance2.getDuration().minus(duration);
        u.i(minus2, "minus(...)");
        bVar.add(new Split(minus2, cumulatedDistance2.getDistance() - d11));
        return bVar.t();
    }

    public final List<Split> invoke(DateTime start, DateTime end, List<GpsLocation> gpsLocations, List<Pause> pauses, PaceDistanceUnit unit) {
        List<Split> list;
        ArrayList arrayList;
        u.j(start, "start");
        u.j(end, "end");
        u.j(gpsLocations, "gpsLocations");
        u.j(pauses, "pauses");
        u.j(unit, "unit");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : this.filterGpsLocationWithPause.filterByWindow(gpsLocations, pauses)) {
            if (!((List) obj).isEmpty()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                break;
            }
            List<GpsLocation> filter = this.gpsLocationFilter.filter((List) it.next());
            if (!filter.isEmpty()) {
                list = filter;
            }
            if (list != null) {
                arrayList3.add(list);
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            list = getSplits(getCumulatedDistance(start, end, arrayList3), unit);
        }
        if (list == null) {
            return i0.f76187a;
        }
        return list;
    }
}
