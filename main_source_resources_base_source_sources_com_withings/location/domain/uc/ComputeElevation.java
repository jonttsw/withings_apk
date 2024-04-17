package com.withings.location.domain.uc;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.location.domain.GpsDistanceComputer;
import com.withings.location.model.GpsLocation;
import cp0.g;
import cp0.i0;
import cp0.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k1.w0;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.j;
/* compiled from: ComputeElevation.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u001d\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100\bH\u0002¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/withings/location/domain/uc/ComputeElevation;", "", "gpsDistanceComputer", "Lcom/withings/location/domain/GpsDistanceComputer;", "(Lcom/withings/location/domain/GpsDistanceComputer;)V", "compute", "", "locations", "", "Lcom/withings/location/model/GpsLocation;", "ascent", "", "(Ljava/util/List;Z)Ljava/lang/Double;", "computeElevation", "findExtrema", "beforeLast", "E", "(Ljava/util/List;)Ljava/lang/Object;", "Companion", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComputeElevation {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_SLOPE_ANGLE_DEGREES = 45;
    private static final int MIN_SLOPE_DISTANCE_METER = 50;
    private final GpsDistanceComputer gpsDistanceComputer;

    /* compiled from: ComputeElevation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/withings/location/domain/uc/ComputeElevation$Companion;", "", "()V", "MAX_SLOPE_ANGLE_DEGREES", "", "MIN_SLOPE_DISTANCE_METER", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public ComputeElevation(GpsDistanceComputer gpsDistanceComputer) {
        u.j(gpsDistanceComputer, "gpsDistanceComputer");
        this.gpsDistanceComputer = gpsDistanceComputer;
    }

    private final <E> E beforeLast(List<? extends E> list) {
        return (E) w0.a(list, 2);
    }

    private final double computeElevation(List<GpsLocation> list, boolean z5) {
        Iterator it = n.h(n.j(new i0(x.t(list), new ComputeElevation$computeElevation$1(list))), new ComputeElevation$computeElevation$2(this, z5)).iterator();
        double d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        while (true) {
            g.a aVar = (g.a) it;
            if (aVar.hasNext()) {
                j jVar = (j) aVar.next();
                d11 += ((GpsLocation) jVar.d()).getPosition().getAltitude() - ((GpsLocation) jVar.c()).getPosition().getAltitude();
            } else {
                return d11;
            }
        }
    }

    private final List<GpsLocation> findExtrema(List<GpsLocation> list) {
        boolean z5;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list.subList(0, 2));
        int size = list.size();
        for (int i11 = 2; i11 < size; i11++) {
            GpsLocation gpsLocation = list.get(i11);
            double altitude = gpsLocation.getPosition().getAltitude() - ((GpsLocation) x.T(arrayList)).getPosition().getAltitude();
            double altitude2 = ((GpsLocation) x.T(arrayList)).getPosition().getAltitude() - ((GpsLocation) beforeLast(arrayList)).getPosition().getAltitude();
            boolean z11 = true;
            if (altitude >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (altitude2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                z11 = false;
            }
            if (z5 == z11) {
                arrayList.set(x.M(arrayList), gpsLocation);
            } else {
                arrayList.add(gpsLocation);
            }
        }
        return arrayList;
    }

    public final Double compute(List<GpsLocation> locations, boolean z5) {
        boolean z11;
        u.j(locations, "locations");
        List<GpsLocation> arrayList = new ArrayList<>();
        for (Object obj : locations) {
            if (((GpsLocation) obj).getPosition().getAltitude() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() < 2) {
            return null;
        }
        return Double.valueOf(computeElevation(findExtrema(arrayList), z5));
    }
}
