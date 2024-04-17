package com.withings.location.domain.uc;

import com.withings.location.model.GpsLocation;
import en0.l;
import en0.n;
import en0.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Duration;
/* compiled from: ComputeSpeed.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0002\u0010\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J7\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0086\u0002¨\u0006\u0012"}, d2 = {"Lcom/withings/location/domain/uc/ComputeAggregatedSpeed;", "", "()V", "getMedianSpeed", "", "speeds", "", "Lcom/withings/location/model/GpsLocation;", "invoke", "Lcom/withings/location/domain/uc/ComputeAggregatedSpeed$AggregatedSpeed;", "start", "Lorg/joda/time/DateTime;", "end", "gpsLocations", "aggregationDuration", "Lorg/joda/time/Duration;", "AggregatedSpeed", "Companion", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComputeAggregatedSpeed {
    public static final Companion Companion = new Companion(null);
    private static final long MERGE_PERIOD_MILLIS = 20000;

    /* compiled from: ComputeSpeed.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withings/location/domain/uc/ComputeAggregatedSpeed$AggregatedSpeed;", "", "date", "Lorg/joda/time/DateTime;", "duration", "Lorg/joda/time/Duration;", "speed", "", "(Lorg/joda/time/DateTime;Lorg/joda/time/Duration;F)V", "getDate", "()Lorg/joda/time/DateTime;", "getDuration", "()Lorg/joda/time/Duration;", "getSpeed", "()F", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class AggregatedSpeed {
        private final DateTime date;
        private final Duration duration;
        private final float speed;

        public AggregatedSpeed(DateTime date, Duration duration, float f11) {
            u.j(date, "date");
            u.j(duration, "duration");
            this.date = date;
            this.duration = duration;
            this.speed = f11;
        }

        public final DateTime getDate() {
            return this.date;
        }

        public final Duration getDuration() {
            return this.duration;
        }

        public final float getSpeed() {
            return this.speed;
        }
    }

    /* compiled from: ComputeSpeed.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/location/domain/uc/ComputeAggregatedSpeed$Companion;", "", "()V", "MERGE_PERIOD_MILLIS", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    private final float getMedianSpeed(List<GpsLocation> list) {
        List<GpsLocation> list2 = list;
        ArrayList arrayList = new ArrayList(x.y(list2, 10));
        for (GpsLocation gpsLocation : list2) {
            arrayList.add(Float.valueOf(gpsLocation.getSpeed()));
        }
        List C0 = x.C0(arrayList);
        if (C0.isEmpty()) {
            return 0.0f;
        }
        if (C0.size() % 2 == 0) {
            return (((Number) C0.get((C0.size() / 2) - 1)).floatValue() + ((Number) C0.get(C0.size() / 2)).floatValue()) / 2;
        }
        return ((Number) C0.get(C0.size() / 2)).floatValue();
    }

    public static /* synthetic */ List invoke$default(ComputeAggregatedSpeed computeAggregatedSpeed, DateTime dateTime, DateTime dateTime2, List list, Duration duration, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            duration = new Duration((long) MERGE_PERIOD_MILLIS);
        }
        return computeAggregatedSpeed.invoke(dateTime, dateTime2, list, duration);
    }

    public final List<AggregatedSpeed> invoke(DateTime start, DateTime end, List<GpsLocation> gpsLocations, Duration aggregationDuration) {
        n nVar;
        u.j(start, "start");
        u.j(end, "end");
        u.j(gpsLocations, "gpsLocations");
        u.j(aggregationDuration, "aggregationDuration");
        long millis = start.getMillis();
        long millis2 = end.getMillis();
        if (millis2 <= Long.MIN_VALUE) {
            nVar = n.f65806d;
        } else {
            nVar = new n(millis, millis2 - 1);
        }
        l v11 = r.v(nVar, aggregationDuration.getMillis());
        ArrayList arrayList = new ArrayList(x.y(v11, 10));
        Iterator<Long> it = v11.iterator();
        while (((en0.m) it).hasNext()) {
            long a11 = ((q0) it).a();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : gpsLocations) {
                GpsLocation gpsLocation = (GpsLocation) obj;
                if (gpsLocation.getDate().getMillis() > a11 && gpsLocation.getDate().getMillis() <= MERGE_PERIOD_MILLIS + a11) {
                    arrayList2.add(obj);
                }
            }
            arrayList.add(new AggregatedSpeed(new DateTime(a11), aggregationDuration, getMedianSpeed(arrayList2)));
        }
        return arrayList;
    }
}
