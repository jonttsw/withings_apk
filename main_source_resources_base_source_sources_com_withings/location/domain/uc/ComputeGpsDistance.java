package com.withings.location.domain.uc;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.location.domain.GpsDistanceComputer;
import com.withings.location.model.GpsLocation;
import com.withings.location.model.Pause;
import en0.r;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.p0;
import kotlin.jvm.internal.u;
/* compiled from: ComputeGpsDistance.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ$\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fJ\u0014\u0010\u0010\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/withings/location/domain/uc/ComputeGpsDistance;", "", "gpsDistanceComputer", "Lcom/withings/location/domain/GpsDistanceComputer;", "gpsLocationFilter", "Lcom/withings/location/domain/uc/GpsLocationFilter;", "filterGpsLocationWithPause", "Lcom/withings/location/domain/uc/FilterGpsLocationWithPause;", "(Lcom/withings/location/domain/GpsDistanceComputer;Lcom/withings/location/domain/uc/GpsLocationFilter;Lcom/withings/location/domain/uc/FilterGpsLocationWithPause;)V", "computeFiltered", "", "gpsLocations", "", "Lcom/withings/location/model/GpsLocation;", "pauses", "Lcom/withings/location/model/Pause;", "computeRaw", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComputeGpsDistance {
    private final FilterGpsLocationWithPause filterGpsLocationWithPause;
    private final GpsDistanceComputer gpsDistanceComputer;
    private final GpsLocationFilter gpsLocationFilter;

    public ComputeGpsDistance(GpsDistanceComputer gpsDistanceComputer, GpsLocationFilter gpsLocationFilter, FilterGpsLocationWithPause filterGpsLocationWithPause) {
        u.j(gpsDistanceComputer, "gpsDistanceComputer");
        u.j(gpsLocationFilter, "gpsLocationFilter");
        u.j(filterGpsLocationWithPause, "filterGpsLocationWithPause");
        this.gpsDistanceComputer = gpsDistanceComputer;
        this.gpsLocationFilter = gpsLocationFilter;
        this.filterGpsLocationWithPause = filterGpsLocationWithPause;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ double computeFiltered$default(ComputeGpsDistance computeGpsDistance, List list, List list2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list2 = i0.f76187a;
        }
        return computeGpsDistance.computeFiltered(list, list2);
    }

    public final double computeFiltered(List<GpsLocation> gpsLocations, List<Pause> pauses) {
        double d11;
        u.j(gpsLocations, "gpsLocations");
        u.j(pauses, "pauses");
        double d12 = 0.0d;
        for (List<GpsLocation> list : this.filterGpsLocationWithPause.filterByWindow(gpsLocations, pauses)) {
            List<GpsLocation> filter = this.gpsLocationFilter.filter(list);
            if (!(!filter.isEmpty())) {
                filter = null;
            }
            if (filter != null) {
                d11 = computeRaw(filter);
            } else {
                d11 = 0.0d;
            }
            d12 += d11;
        }
        return d12;
    }

    public final double computeRaw(List<GpsLocation> gpsLocations) {
        u.j(gpsLocations, "gpsLocations");
        Iterator<Integer> it = r.w(1, gpsLocations.size()).iterator();
        double d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        while (it.hasNext()) {
            int a11 = ((p0) it).a();
            d11 += this.gpsDistanceComputer.getDistance(gpsLocations.get(a11 - 1).getPosition(), gpsLocations.get(a11).getPosition());
        }
        return d11;
    }
}
