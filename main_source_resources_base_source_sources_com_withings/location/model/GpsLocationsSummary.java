package com.withings.location.model;

import androidx.camera.camera2.internal.l0;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.location.model.GpsLocation;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: GpsLocationsSummary.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/withings/location/model/GpsLocationsSummary;", "", "distance", "", "speedSummary", "Lcom/withings/location/model/GpsLocationsSummary$SpeedSummary;", "startPosition", "Lcom/withings/location/model/GpsLocation$Position;", "endPosition", "centerPosition", "spanDegree", "Lcom/withings/location/model/GpsLocationsSummary$SpanDegree;", "(DLcom/withings/location/model/GpsLocationsSummary$SpeedSummary;Lcom/withings/location/model/GpsLocation$Position;Lcom/withings/location/model/GpsLocation$Position;Lcom/withings/location/model/GpsLocation$Position;Lcom/withings/location/model/GpsLocationsSummary$SpanDegree;)V", "getCenterPosition", "()Lcom/withings/location/model/GpsLocation$Position;", "getDistance", "()D", "getEndPosition", "getSpanDegree", "()Lcom/withings/location/model/GpsLocationsSummary$SpanDegree;", "getSpeedSummary", "()Lcom/withings/location/model/GpsLocationsSummary$SpeedSummary;", "getStartPosition", "SpanDegree", "SpeedSummary", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GpsLocationsSummary {
    private final GpsLocation.Position centerPosition;
    private final double distance;
    private final GpsLocation.Position endPosition;
    private final SpanDegree spanDegree;
    private final SpeedSummary speedSummary;
    private final GpsLocation.Position startPosition;

    /* compiled from: GpsLocationsSummary.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/withings/location/model/GpsLocationsSummary$SpanDegree;", "", "latitude", "", "longitude", "(DD)V", "getLatitude", "()D", "getLongitude", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SpanDegree {
        private final double latitude;
        private final double longitude;

        public SpanDegree(double d11, double d12) {
            this.latitude = d11;
            this.longitude = d12;
        }

        public static /* synthetic */ SpanDegree copy$default(SpanDegree spanDegree, double d11, double d12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                d11 = spanDegree.latitude;
            }
            if ((i11 & 2) != 0) {
                d12 = spanDegree.longitude;
            }
            return spanDegree.copy(d11, d12);
        }

        public final double component1() {
            return this.latitude;
        }

        public final double component2() {
            return this.longitude;
        }

        public final SpanDegree copy(double d11, double d12) {
            return new SpanDegree(d11, d12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpanDegree)) {
                return false;
            }
            SpanDegree spanDegree = (SpanDegree) obj;
            if (Double.compare(this.latitude, spanDegree.latitude) == 0 && Double.compare(this.longitude, spanDegree.longitude) == 0) {
                return true;
            }
            return false;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        public int hashCode() {
            return Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
        }

        public String toString() {
            double d11 = this.latitude;
            double d12 = this.longitude;
            return "SpanDegree(latitude=" + d11 + ", longitude=" + d12 + ")";
        }
    }

    /* compiled from: GpsLocationsSummary.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/withings/location/model/GpsLocationsSummary$SpeedSummary;", "", "average", "", HealthConstants.HeartRate.MIN, HealthConstants.HeartRate.MAX, "(DDD)V", "getAverage", "()D", "getMax", "getMin", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SpeedSummary {
        private final double average;
        private final double max;
        private final double min;

        public SpeedSummary(double d11, double d12, double d13) {
            this.average = d11;
            this.min = d12;
            this.max = d13;
        }

        public static /* synthetic */ SpeedSummary copy$default(SpeedSummary speedSummary, double d11, double d12, double d13, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                d11 = speedSummary.average;
            }
            double d14 = d11;
            if ((i11 & 2) != 0) {
                d12 = speedSummary.min;
            }
            double d15 = d12;
            if ((i11 & 4) != 0) {
                d13 = speedSummary.max;
            }
            return speedSummary.copy(d14, d15, d13);
        }

        public final double component1() {
            return this.average;
        }

        public final double component2() {
            return this.min;
        }

        public final double component3() {
            return this.max;
        }

        public final SpeedSummary copy(double d11, double d12, double d13) {
            return new SpeedSummary(d11, d12, d13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpeedSummary)) {
                return false;
            }
            SpeedSummary speedSummary = (SpeedSummary) obj;
            if (Double.compare(this.average, speedSummary.average) == 0 && Double.compare(this.min, speedSummary.min) == 0 && Double.compare(this.max, speedSummary.max) == 0) {
                return true;
            }
            return false;
        }

        public final double getAverage() {
            return this.average;
        }

        public final double getMax() {
            return this.max;
        }

        public final double getMin() {
            return this.min;
        }

        public int hashCode() {
            return Double.hashCode(this.max) + l0.a(this.min, Double.hashCode(this.average) * 31, 31);
        }

        public String toString() {
            double d11 = this.average;
            double d12 = this.min;
            double d13 = this.max;
            return "SpeedSummary(average=" + d11 + ", min=" + d12 + ", max=" + d13 + ")";
        }
    }

    public GpsLocationsSummary(double d11, SpeedSummary speedSummary, GpsLocation.Position startPosition, GpsLocation.Position endPosition, GpsLocation.Position centerPosition, SpanDegree spanDegree) {
        u.j(speedSummary, "speedSummary");
        u.j(startPosition, "startPosition");
        u.j(endPosition, "endPosition");
        u.j(centerPosition, "centerPosition");
        u.j(spanDegree, "spanDegree");
        this.distance = d11;
        this.speedSummary = speedSummary;
        this.startPosition = startPosition;
        this.endPosition = endPosition;
        this.centerPosition = centerPosition;
        this.spanDegree = spanDegree;
    }

    public final GpsLocation.Position getCenterPosition() {
        return this.centerPosition;
    }

    public final double getDistance() {
        return this.distance;
    }

    public final GpsLocation.Position getEndPosition() {
        return this.endPosition;
    }

    public final SpanDegree getSpanDegree() {
        return this.spanDegree;
    }

    public final SpeedSummary getSpeedSummary() {
        return this.speedSummary;
    }

    public final GpsLocation.Position getStartPosition() {
        return this.startPosition;
    }
}
