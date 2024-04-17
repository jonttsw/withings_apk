package com.withings.location.model;

import androidx.camera.camera2.internal.l0;
import androidx.compose.material.o;
import com.google.android.gms.internal.mlkit_common.a;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: GpsLocation.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003,-.B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003JO\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006/"}, d2 = {"Lcom/withings/location/model/GpsLocation;", "", "id", "", "date", "Lorg/joda/time/DateTime;", "metadata", "Lcom/withings/location/model/GpsLocation$MetaData;", "position", "Lcom/withings/location/model/GpsLocation$Position;", "accuracy", "Lcom/withings/location/model/GpsLocation$Accuracy;", "speed", "", "bearing", "(JLorg/joda/time/DateTime;Lcom/withings/location/model/GpsLocation$MetaData;Lcom/withings/location/model/GpsLocation$Position;Lcom/withings/location/model/GpsLocation$Accuracy;FF)V", "getAccuracy", "()Lcom/withings/location/model/GpsLocation$Accuracy;", "getBearing", "()F", "getDate", "()Lorg/joda/time/DateTime;", "getId", "()J", "getMetadata", "()Lcom/withings/location/model/GpsLocation$MetaData;", "getPosition", "()Lcom/withings/location/model/GpsLocation$Position;", "getSpeed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Accuracy", "MetaData", "Position", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GpsLocation {
    private final Accuracy accuracy;
    private final float bearing;
    private final DateTime date;

    /* renamed from: id  reason: collision with root package name */
    private final long f40654id;
    private final MetaData metadata;
    private final Position position;
    private final float speed;

    /* compiled from: GpsLocation.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/withings/location/model/GpsLocation$Accuracy;", "", "horizontal", "", "vertical", "speed", "bearing", "(FFFF)V", "getBearing", "()F", "getHorizontal", "getSpeed", "getVertical", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Accuracy {
        private final float bearing;
        private final float horizontal;
        private final float speed;
        private final float vertical;

        public Accuracy(float f11, float f12, float f13, float f14) {
            this.horizontal = f11;
            this.vertical = f12;
            this.speed = f13;
            this.bearing = f14;
        }

        public static /* synthetic */ Accuracy copy$default(Accuracy accuracy, float f11, float f12, float f13, float f14, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = accuracy.horizontal;
            }
            if ((i11 & 2) != 0) {
                f12 = accuracy.vertical;
            }
            if ((i11 & 4) != 0) {
                f13 = accuracy.speed;
            }
            if ((i11 & 8) != 0) {
                f14 = accuracy.bearing;
            }
            return accuracy.copy(f11, f12, f13, f14);
        }

        public final float component1() {
            return this.horizontal;
        }

        public final float component2() {
            return this.vertical;
        }

        public final float component3() {
            return this.speed;
        }

        public final float component4() {
            return this.bearing;
        }

        public final Accuracy copy(float f11, float f12, float f13, float f14) {
            return new Accuracy(f11, f12, f13, f14);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Accuracy)) {
                return false;
            }
            Accuracy accuracy = (Accuracy) obj;
            if (Float.compare(this.horizontal, accuracy.horizontal) == 0 && Float.compare(this.vertical, accuracy.vertical) == 0 && Float.compare(this.speed, accuracy.speed) == 0 && Float.compare(this.bearing, accuracy.bearing) == 0) {
                return true;
            }
            return false;
        }

        public final float getBearing() {
            return this.bearing;
        }

        public final float getHorizontal() {
            return this.horizontal;
        }

        public final float getSpeed() {
            return this.speed;
        }

        public final float getVertical() {
            return this.vertical;
        }

        public int hashCode() {
            return Float.hashCode(this.bearing) + o.a(this.speed, o.a(this.vertical, Float.hashCode(this.horizontal) * 31, 31), 31);
        }

        public String toString() {
            float f11 = this.horizontal;
            float f12 = this.vertical;
            float f13 = this.speed;
            float f14 = this.bearing;
            return "Accuracy(horizontal=" + f11 + ", vertical=" + f12 + ", speed=" + f13 + ", bearing=" + f14 + ")";
        }
    }

    /* compiled from: GpsLocation.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withings/location/model/GpsLocation$MetaData;", "", NavigationArguments.USER_ID, "", "isSynced", "", "(JZ)V", "()Z", "getUserId", "()J", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MetaData {
        private final boolean isSynced;
        private final long userId;

        public MetaData(long j5, boolean z5) {
            this.userId = j5;
            this.isSynced = z5;
        }

        public static /* synthetic */ MetaData copy$default(MetaData metaData, long j5, boolean z5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j5 = metaData.userId;
            }
            if ((i11 & 2) != 0) {
                z5 = metaData.isSynced;
            }
            return metaData.copy(j5, z5);
        }

        public final long component1() {
            return this.userId;
        }

        public final boolean component2() {
            return this.isSynced;
        }

        public final MetaData copy(long j5, boolean z5) {
            return new MetaData(j5, z5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MetaData)) {
                return false;
            }
            MetaData metaData = (MetaData) obj;
            if (this.userId == metaData.userId && this.isSynced == metaData.isSynced) {
                return true;
            }
            return false;
        }

        public final long getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSynced) + (Long.hashCode(this.userId) * 31);
        }

        public final boolean isSynced() {
            return this.isSynced;
        }

        public String toString() {
            long j5 = this.userId;
            boolean z5 = this.isSynced;
            return "MetaData(userId=" + j5 + ", isSynced=" + z5 + ")";
        }
    }

    /* compiled from: GpsLocation.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/withings/location/model/GpsLocation$Position;", "", "latitude", "", "longitude", "altitude", "(DDD)V", "getAltitude", "()D", "getLatitude", "getLongitude", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Position {
        private final double altitude;
        private final double latitude;
        private final double longitude;

        public Position(double d11, double d12, double d13) {
            this.latitude = d11;
            this.longitude = d12;
            this.altitude = d13;
        }

        public static /* synthetic */ Position copy$default(Position position, double d11, double d12, double d13, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                d11 = position.latitude;
            }
            double d14 = d11;
            if ((i11 & 2) != 0) {
                d12 = position.longitude;
            }
            double d15 = d12;
            if ((i11 & 4) != 0) {
                d13 = position.altitude;
            }
            return position.copy(d14, d15, d13);
        }

        public final double component1() {
            return this.latitude;
        }

        public final double component2() {
            return this.longitude;
        }

        public final double component3() {
            return this.altitude;
        }

        public final Position copy(double d11, double d12, double d13) {
            return new Position(d11, d12, d13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Position)) {
                return false;
            }
            Position position = (Position) obj;
            if (Double.compare(this.latitude, position.latitude) == 0 && Double.compare(this.longitude, position.longitude) == 0 && Double.compare(this.altitude, position.altitude) == 0) {
                return true;
            }
            return false;
        }

        public final double getAltitude() {
            return this.altitude;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        public int hashCode() {
            return Double.hashCode(this.altitude) + l0.a(this.longitude, Double.hashCode(this.latitude) * 31, 31);
        }

        public String toString() {
            double d11 = this.latitude;
            double d12 = this.longitude;
            double d13 = this.altitude;
            return "Position(latitude=" + d11 + ", longitude=" + d12 + ", altitude=" + d13 + ")";
        }
    }

    public GpsLocation(long j5, DateTime date, MetaData metadata, Position position, Accuracy accuracy, float f11, float f12) {
        u.j(date, "date");
        u.j(metadata, "metadata");
        u.j(position, "position");
        u.j(accuracy, "accuracy");
        this.f40654id = j5;
        this.date = date;
        this.metadata = metadata;
        this.position = position;
        this.accuracy = accuracy;
        this.speed = f11;
        this.bearing = f12;
    }

    public static /* synthetic */ GpsLocation copy$default(GpsLocation gpsLocation, long j5, DateTime dateTime, MetaData metaData, Position position, Accuracy accuracy, float f11, float f12, int i11, Object obj) {
        long j11;
        DateTime dateTime2;
        MetaData metaData2;
        Position position2;
        Accuracy accuracy2;
        float f13;
        float f14;
        if ((i11 & 1) != 0) {
            j11 = gpsLocation.f40654id;
        } else {
            j11 = j5;
        }
        if ((i11 & 2) != 0) {
            dateTime2 = gpsLocation.date;
        } else {
            dateTime2 = dateTime;
        }
        if ((i11 & 4) != 0) {
            metaData2 = gpsLocation.metadata;
        } else {
            metaData2 = metaData;
        }
        if ((i11 & 8) != 0) {
            position2 = gpsLocation.position;
        } else {
            position2 = position;
        }
        if ((i11 & 16) != 0) {
            accuracy2 = gpsLocation.accuracy;
        } else {
            accuracy2 = accuracy;
        }
        if ((i11 & 32) != 0) {
            f13 = gpsLocation.speed;
        } else {
            f13 = f11;
        }
        if ((i11 & 64) != 0) {
            f14 = gpsLocation.bearing;
        } else {
            f14 = f12;
        }
        return gpsLocation.copy(j11, dateTime2, metaData2, position2, accuracy2, f13, f14);
    }

    public final long component1() {
        return this.f40654id;
    }

    public final DateTime component2() {
        return this.date;
    }

    public final MetaData component3() {
        return this.metadata;
    }

    public final Position component4() {
        return this.position;
    }

    public final Accuracy component5() {
        return this.accuracy;
    }

    public final float component6() {
        return this.speed;
    }

    public final float component7() {
        return this.bearing;
    }

    public final GpsLocation copy(long j5, DateTime date, MetaData metadata, Position position, Accuracy accuracy, float f11, float f12) {
        u.j(date, "date");
        u.j(metadata, "metadata");
        u.j(position, "position");
        u.j(accuracy, "accuracy");
        return new GpsLocation(j5, date, metadata, position, accuracy, f11, f12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GpsLocation)) {
            return false;
        }
        GpsLocation gpsLocation = (GpsLocation) obj;
        if (this.f40654id == gpsLocation.f40654id && u.e(this.date, gpsLocation.date) && u.e(this.metadata, gpsLocation.metadata) && u.e(this.position, gpsLocation.position) && u.e(this.accuracy, gpsLocation.accuracy) && Float.compare(this.speed, gpsLocation.speed) == 0 && Float.compare(this.bearing, gpsLocation.bearing) == 0) {
            return true;
        }
        return false;
    }

    public final Accuracy getAccuracy() {
        return this.accuracy;
    }

    public final float getBearing() {
        return this.bearing;
    }

    public final DateTime getDate() {
        return this.date;
    }

    public final long getId() {
        return this.f40654id;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final Position getPosition() {
        return this.position;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public int hashCode() {
        int b10 = a.b(this.date, Long.hashCode(this.f40654id) * 31, 31);
        int hashCode = this.position.hashCode();
        int hashCode2 = this.accuracy.hashCode();
        return Float.hashCode(this.bearing) + o.a(this.speed, (hashCode2 + ((hashCode + ((this.metadata.hashCode() + b10) * 31)) * 31)) * 31, 31);
    }

    public String toString() {
        long j5 = this.f40654id;
        DateTime dateTime = this.date;
        MetaData metaData = this.metadata;
        Position position = this.position;
        Accuracy accuracy = this.accuracy;
        float f11 = this.speed;
        float f12 = this.bearing;
        return "GpsLocation(id=" + j5 + ", date=" + dateTime + ", metadata=" + metaData + ", position=" + position + ", accuracy=" + accuracy + ", speed=" + f11 + ", bearing=" + f12 + ")";
    }
}
