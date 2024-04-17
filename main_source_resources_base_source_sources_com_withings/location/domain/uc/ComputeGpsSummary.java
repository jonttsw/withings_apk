package com.withings.location.domain.uc;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.location.ktx.FilterGpsLocationWithPauseKt;
import com.withings.location.model.GpsLocation;
import com.withings.location.model.GpsLocationsSummary;
import com.withings.location.model.Pause;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: ComputeGpsSummary.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ$\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fJ,\u0010\t\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/withings/location/domain/uc/ComputeGpsSummary;", "", "hasEnoughGpsLocations", "Lcom/withings/location/domain/uc/HasEnoughGpsLocations;", "computeGpsDistance", "Lcom/withings/location/domain/uc/ComputeGpsDistance;", "filterGpsLocationWithPause", "Lcom/withings/location/domain/uc/FilterGpsLocationWithPause;", "(Lcom/withings/location/domain/uc/HasEnoughGpsLocations;Lcom/withings/location/domain/uc/ComputeGpsDistance;Lcom/withings/location/domain/uc/FilterGpsLocationWithPause;)V", "build", "Lcom/withings/location/model/GpsLocationsSummary;", "locations", "", "Lcom/withings/location/model/GpsLocation;", "pauses", "Lcom/withings/location/model/Pause;", "filteredLocations", "gpsRect", "Lcom/withings/location/domain/uc/ComputeGpsSummary$GpsRect;", "computeGpsRect", "gpsLocations", "GpsRect", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComputeGpsSummary {
    private final ComputeGpsDistance computeGpsDistance;
    private final FilterGpsLocationWithPause filterGpsLocationWithPause;
    private final HasEnoughGpsLocations hasEnoughGpsLocations;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ComputeGpsSummary.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/withings/location/domain/uc/ComputeGpsSummary$GpsRect;", "", "minLatitude", "", "maxLatitude", "minLongitude", "maxLongitude", "(DDDD)V", "centerLatitude", "getCenterLatitude", "()D", "centerLongitude", "getCenterLongitude", "getMaxLatitude", "getMaxLongitude", "getMinLatitude", "getMinLongitude", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class GpsRect {
        private final double centerLatitude;
        private final double centerLongitude;
        private final double maxLatitude;
        private final double maxLongitude;
        private final double minLatitude;
        private final double minLongitude;

        public GpsRect(double d11, double d12, double d13, double d14) {
            this.minLatitude = d11;
            this.maxLatitude = d12;
            this.minLongitude = d13;
            this.maxLongitude = d14;
            double d15 = d12 + d11;
            double d16 = 2;
            this.centerLatitude = d15 / d16;
            this.centerLongitude = (d14 + d13) / d16;
        }

        public final double getCenterLatitude() {
            return this.centerLatitude;
        }

        public final double getCenterLongitude() {
            return this.centerLongitude;
        }

        public final double getMaxLatitude() {
            return this.maxLatitude;
        }

        public final double getMaxLongitude() {
            return this.maxLongitude;
        }

        public final double getMinLatitude() {
            return this.minLatitude;
        }

        public final double getMinLongitude() {
            return this.minLongitude;
        }
    }

    public ComputeGpsSummary(HasEnoughGpsLocations hasEnoughGpsLocations, ComputeGpsDistance computeGpsDistance, FilterGpsLocationWithPause filterGpsLocationWithPause) {
        u.j(hasEnoughGpsLocations, "hasEnoughGpsLocations");
        u.j(computeGpsDistance, "computeGpsDistance");
        u.j(filterGpsLocationWithPause, "filterGpsLocationWithPause");
        this.hasEnoughGpsLocations = hasEnoughGpsLocations;
        this.computeGpsDistance = computeGpsDistance;
        this.filterGpsLocationWithPause = filterGpsLocationWithPause;
    }

    private final GpsRect computeGpsRect(List<GpsLocation> list) {
        List<GpsLocation> list2;
        if (!list.isEmpty()) {
            list2 = list;
        } else {
            list2 = null;
        }
        if (list2 == null) {
            return null;
        }
        List<GpsLocation> list3 = list;
        Iterator<T> it = list3.iterator();
        if (it.hasNext()) {
            double latitude = ((GpsLocation) it.next()).getPosition().getLatitude();
            while (it.hasNext()) {
                latitude = Math.min(latitude, ((GpsLocation) it.next()).getPosition().getLatitude());
            }
            Iterator<T> it2 = list3.iterator();
            if (it2.hasNext()) {
                double latitude2 = ((GpsLocation) it2.next()).getPosition().getLatitude();
                while (it2.hasNext()) {
                    latitude2 = Math.max(latitude2, ((GpsLocation) it2.next()).getPosition().getLatitude());
                }
                Iterator<T> it3 = list3.iterator();
                if (it3.hasNext()) {
                    double longitude = ((GpsLocation) it3.next()).getPosition().getLongitude();
                    while (it3.hasNext()) {
                        longitude = Math.min(longitude, ((GpsLocation) it3.next()).getPosition().getLongitude());
                    }
                    Iterator<T> it4 = list3.iterator();
                    if (it4.hasNext()) {
                        double longitude2 = ((GpsLocation) it4.next()).getPosition().getLongitude();
                        while (it4.hasNext()) {
                            longitude2 = Math.max(longitude2, ((GpsLocation) it4.next()).getPosition().getLongitude());
                        }
                        return new GpsRect(latitude, latitude2, longitude, longitude2);
                    }
                    throw new NoSuchElementException();
                }
                throw new NoSuchElementException();
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public final GpsLocationsSummary build(List<GpsLocation> locations, List<Pause> pauses) {
        GpsRect computeGpsRect;
        u.j(locations, "locations");
        u.j(pauses, "pauses");
        List<GpsLocation> filter = FilterGpsLocationWithPauseKt.filter(this.filterGpsLocationWithPause, locations, pauses);
        if ((this.hasEnoughGpsLocations.forMap(filter) ? filter : null) == null || (computeGpsRect = computeGpsRect(filter)) == null) {
            return null;
        }
        return build(filter, pauses, computeGpsRect);
    }

    private final GpsLocationsSummary build(List<GpsLocation> list, List<Pause> list2, GpsRect gpsRect) {
        Double valueOf;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            float speed = ((GpsLocation) it.next()).getSpeed();
            Float valueOf2 = Float.valueOf(speed);
            if (Float.isNaN(speed)) {
                valueOf2 = null;
            }
            valueOf = valueOf2 != null ? Double.valueOf(valueOf2.floatValue()) : null;
            if (valueOf != null) {
                arrayList.add(valueOf);
            }
        }
        double computeFiltered = this.computeGpsDistance.computeFiltered(list, list2);
        double u11 = x.u(arrayList);
        valueOf = Double.isNaN(u11) ? null : Double.valueOf(u11);
        double d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        double doubleValue = valueOf != null ? valueOf.doubleValue() : 0.0d;
        Double e02 = x.e0(arrayList);
        double doubleValue2 = e02 != null ? e02.doubleValue() : 0.0d;
        Double Z = x.Z(arrayList);
        if (Z != null) {
            d11 = Z.doubleValue();
        }
        return new GpsLocationsSummary(computeFiltered, new GpsLocationsSummary.SpeedSummary(doubleValue, doubleValue2, d11), ((GpsLocation) x.I(list)).getPosition(), ((GpsLocation) x.T(list)).getPosition(), new GpsLocation.Position(gpsRect.getCenterLatitude(), gpsRect.getCenterLongitude(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE), new GpsLocationsSummary.SpanDegree(gpsRect.getMaxLatitude() - gpsRect.getMinLatitude(), gpsRect.getMaxLongitude() - gpsRect.getMinLongitude()));
    }
}
