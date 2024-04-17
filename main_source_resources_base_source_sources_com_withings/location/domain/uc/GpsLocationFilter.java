package com.withings.location.domain.uc;

import com.withings.location.domain.GpsDistanceComputer;
import com.withings.location.model.GpsLocation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Duration;
/* compiled from: ComputeGpsDistance.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0018\u0010\t\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/withings/location/domain/uc/GpsLocationFilter;", "", "gpsDistanceComputer", "Lcom/withings/location/domain/GpsDistanceComputer;", "(Lcom/withings/location/domain/GpsDistanceComputer;)V", "filter", "", "Lcom/withings/location/model/GpsLocation;", "gpsLocations", "getBestLocation", "Companion", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GpsLocationFilter {
    public static final Companion Companion = new Companion(null);
    private static final int DISTANCE_WINDOW_IN_METERS = 5;
    private static final int DURATION_WINDOW_IN_MS = 5000;
    private static final int MIN_NB_FOR_FILTERING = 4;
    private final GpsDistanceComputer gpsDistanceComputer;

    /* compiled from: ComputeGpsDistance.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/withings/location/domain/uc/GpsLocationFilter$Companion;", "", "()V", "DISTANCE_WINDOW_IN_METERS", "", "DURATION_WINDOW_IN_MS", "MIN_NB_FOR_FILTERING", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public GpsLocationFilter(GpsDistanceComputer gpsDistanceComputer) {
        u.j(gpsDistanceComputer, "gpsDistanceComputer");
        this.gpsDistanceComputer = gpsDistanceComputer;
    }

    private final GpsLocation getBestLocation(List<GpsLocation> list) {
        Object obj;
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (!it.hasNext()) {
                obj = next;
            } else {
                float horizontal = ((GpsLocation) next).getAccuracy().getHorizontal();
                do {
                    Object next2 = it.next();
                    float horizontal2 = ((GpsLocation) next2).getAccuracy().getHorizontal();
                    if (Float.compare(horizontal, horizontal2) > 0) {
                        next = next2;
                        horizontal = horizontal2;
                    }
                } while (it.hasNext());
                obj = next;
            }
        }
        return (GpsLocation) obj;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object] */
    public final List<GpsLocation> filter(List<GpsLocation> list) {
        List<GpsLocation> list2;
        List<GpsLocation> gpsLocations = list;
        u.j(gpsLocations, "gpsLocations");
        if (list.size() >= 4) {
            list2 = gpsLocations;
        } else {
            list2 = null;
        }
        if (list2 != null) {
            gpsLocations = new ArrayList<>();
            ArrayList arrayList = new ArrayList();
            DateTime date = ((GpsLocation) x.I(list2)).getDate();
            gpsLocations.add(x.I(list2));
            int M = x.M(list2);
            int i11 = 1;
            double d11 = 0.0d;
            long j5 = 0;
            while (i11 < M) {
                arrayList.add(list2.get(i11));
                int i12 = i11 + 1;
                GpsLocation gpsLocation = list2.get(i12);
                long millis = new Duration(date, gpsLocation.getDate()).getMillis() + j5;
                double distance = this.gpsDistanceComputer.getDistance(list2.get(i11).getPosition(), gpsLocation.getPosition()) + d11;
                if (millis < 5000 && distance < 5.0d) {
                    d11 = distance;
                    j5 = millis;
                } else {
                    GpsLocation bestLocation = getBestLocation(arrayList);
                    if (bestLocation != null) {
                        gpsLocations.add(bestLocation);
                    }
                    arrayList.clear();
                    date = gpsLocation.getDate();
                    d11 = 0.0d;
                    j5 = 0;
                }
                i11 = i12;
            }
            gpsLocations.add(x.T(list2));
        }
        return gpsLocations;
    }
}
