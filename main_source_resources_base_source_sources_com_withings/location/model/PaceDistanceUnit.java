package com.withings.location.model;

import kotlin.Metadata;
/* compiled from: PaceDistanceUnit.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/withings/location/model/PaceDistanceUnit;", "", "distanceWindowInMeter", "", "getDistanceWindowInMeter", "()D", "KM", "MILE", "Lcom/withings/location/model/PaceDistanceUnit$KM;", "Lcom/withings/location/model/PaceDistanceUnit$MILE;", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PaceDistanceUnit {

    /* compiled from: PaceDistanceUnit.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/withings/location/model/PaceDistanceUnit$KM;", "Lcom/withings/location/model/PaceDistanceUnit;", "()V", "distanceWindowInMeter", "", "getDistanceWindowInMeter", "()D", "equals", "", "other", "", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class KM implements PaceDistanceUnit {
        public static final KM INSTANCE = new KM();
        private static final double distanceWindowInMeter = 1000.0d;

        private KM() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KM)) {
                return false;
            }
            KM km2 = (KM) obj;
            return true;
        }

        @Override // com.withings.location.model.PaceDistanceUnit
        public double getDistanceWindowInMeter() {
            return distanceWindowInMeter;
        }

        public int hashCode() {
            return -2100998096;
        }

        public String toString() {
            return "KM";
        }
    }

    /* compiled from: PaceDistanceUnit.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/withings/location/model/PaceDistanceUnit$MILE;", "Lcom/withings/location/model/PaceDistanceUnit;", "()V", "distanceWindowInMeter", "", "getDistanceWindowInMeter", "()D", "equals", "", "other", "", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MILE implements PaceDistanceUnit {
        public static final MILE INSTANCE = new MILE();
        private static final double distanceWindowInMeter = 1609.344d;

        private MILE() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MILE)) {
                return false;
            }
            MILE mile = (MILE) obj;
            return true;
        }

        @Override // com.withings.location.model.PaceDistanceUnit
        public double getDistanceWindowInMeter() {
            return distanceWindowInMeter;
        }

        public int hashCode() {
            return -424482973;
        }

        public String toString() {
            return "MILE";
        }
    }

    double getDistanceWindowInMeter();
}
