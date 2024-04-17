package com.withings.wiscale2.track.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.l0;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.protobuf.t;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.samsung.android.sdk.internal.healthdata.IpcUtil;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: GpsSummary.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\bK\u0010LJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\t\u0010\u0007J\u0010\u0010\n\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0007J\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0007J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0007J\u0088\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0004J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b*\u0010$J \u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b/\u00100R\"\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u00101\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u00104R\"\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u00101\u001a\u0004\b5\u0010\u0007\"\u0004\b6\u00104R\"\u0010\u0015\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u00101\u001a\u0004\b7\u0010\u0007\"\u0004\b8\u00104R\"\u0010\u0016\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u00101\u001a\u0004\b9\u0010\u0007\"\u0004\b:\u00104R\"\u0010\u0017\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u00101\u001a\u0004\b;\u0010\u0007\"\u0004\b<\u00104R\"\u0010\u0018\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u00101\u001a\u0004\b=\u0010\u0007\"\u0004\b>\u00104R\"\u0010\u0019\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u00101\u001a\u0004\b?\u0010\u0007\"\u0004\b@\u00104R\"\u0010\u001a\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u00101\u001a\u0004\bA\u0010\u0007\"\u0004\bB\u00104R\"\u0010\u001b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u00101\u001a\u0004\bC\u0010\u0007\"\u0004\bD\u00104R\"\u0010\u001c\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u00101\u001a\u0004\bE\u0010\u0007\"\u0004\bF\u00104R\"\u0010\u001d\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u00101\u001a\u0004\bG\u0010\u0007\"\u0004\bH\u00104R\"\u0010\u001e\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u00101\u001a\u0004\bI\u0010\u0007\"\u0004\bJ\u00104¨\u0006M"}, d2 = {"Lcom/withings/wiscale2/track/data/GpsSummary;", "Landroid/os/Parcelable;", "", "toJson", "()Ljava/lang/String;", "", "component1", "()D", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "distance", "averageSpeed", "minSpeed", "maxSpeed", "startLatitude", "startLongitude", "endLatitude", "endLongitude", "centerLatitude", "centerLongitude", "spanLatitudeDelta", "spanLongitudeDelta", "copy", "(DDDDDDDDDDDD)Lcom/withings/wiscale2/track/data/GpsSummary;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", IpcUtil.KEY_PARCEL, "flags", "Lnm0/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "D", "getDistance", "setDistance", "(D)V", "getAverageSpeed", "setAverageSpeed", "getMinSpeed", "setMinSpeed", "getMaxSpeed", "setMaxSpeed", "getStartLatitude", "setStartLatitude", "getStartLongitude", "setStartLongitude", "getEndLatitude", "setEndLatitude", "getEndLongitude", "setEndLongitude", "getCenterLatitude", "setCenterLatitude", "getCenterLongitude", "setCenterLongitude", "getSpanLatitudeDelta", "setSpanLatitudeDelta", "getSpanLongitudeDelta", "setSpanLongitudeDelta", "<init>", "(DDDDDDDDDDDD)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GpsSummary implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<GpsSummary> CREATOR = new Creator();
    @SerializedName(ConstantsWs.ACTIVITY_GPS_AVERAGE_SPEED)
    private double averageSpeed;
    @SerializedName(ConstantsWs.ACTIVITY_GPS_REGION_CENTER_LATITUDE)
    private double centerLatitude;
    @SerializedName(ConstantsWs.ACTIVITY_GPS_REGION_CENTER_LONGITUDE)
    private double centerLongitude;
    @SerializedName("distance")
    private double distance;
    @SerializedName(ConstantsWs.ACTIVITY_GPS_END_COORDINATE_LATITUDE)
    private double endLatitude;
    @SerializedName(ConstantsWs.ACTIVITY_GPS_END_COORDINATE_LONGITUDE)
    private double endLongitude;
    @SerializedName("max_speed")
    private double maxSpeed;
    @SerializedName(ConstantsWs.ACTIVITY_GPS_MIN_SPEED)
    private double minSpeed;
    @SerializedName(ConstantsWs.ACTIVITY_GPS_SPAN_LATITUDE_DELTA)
    private double spanLatitudeDelta;
    @SerializedName(ConstantsWs.ACTIVITY_GPS_SPAN_LONGITUDE_DELTA)
    private double spanLongitudeDelta;
    @SerializedName(ConstantsWs.ACTIVITY_GPS_START_COORDINATE_LATITUDE)
    private double startLatitude;
    @SerializedName(ConstantsWs.ACTIVITY_GPS_START_COORDINATE_LONGITUDE)
    private double startLongitude;

    /* compiled from: GpsSummary.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<GpsSummary> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GpsSummary createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new GpsSummary(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GpsSummary[] newArray(int i11) {
            return new GpsSummary[i11];
        }
    }

    public GpsSummary(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d21, double d22, double d23) {
        this.distance = d11;
        this.averageSpeed = d12;
        this.minSpeed = d13;
        this.maxSpeed = d14;
        this.startLatitude = d15;
        this.startLongitude = d16;
        this.endLatitude = d17;
        this.endLongitude = d18;
        this.centerLatitude = d19;
        this.centerLongitude = d21;
        this.spanLatitudeDelta = d22;
        this.spanLongitudeDelta = d23;
    }

    public static /* synthetic */ GpsSummary copy$default(GpsSummary gpsSummary, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d21, double d22, double d23, int i11, Object obj) {
        double d24;
        double d25;
        double d26;
        double d27;
        double d28;
        double d29;
        double d31;
        double d32;
        double d33;
        double d34;
        double d35;
        double d36;
        if ((i11 & 1) != 0) {
            d24 = gpsSummary.distance;
        } else {
            d24 = d11;
        }
        if ((i11 & 2) != 0) {
            d25 = gpsSummary.averageSpeed;
        } else {
            d25 = d12;
        }
        if ((i11 & 4) != 0) {
            d26 = gpsSummary.minSpeed;
        } else {
            d26 = d13;
        }
        if ((i11 & 8) != 0) {
            d27 = gpsSummary.maxSpeed;
        } else {
            d27 = d14;
        }
        if ((i11 & 16) != 0) {
            d28 = gpsSummary.startLatitude;
        } else {
            d28 = d15;
        }
        if ((i11 & 32) != 0) {
            d29 = gpsSummary.startLongitude;
        } else {
            d29 = d16;
        }
        if ((i11 & 64) != 0) {
            d31 = gpsSummary.endLatitude;
        } else {
            d31 = d17;
        }
        double d37 = d31;
        if ((i11 & 128) != 0) {
            d32 = gpsSummary.endLongitude;
        } else {
            d32 = d18;
        }
        double d38 = d32;
        if ((i11 & 256) != 0) {
            d33 = gpsSummary.centerLatitude;
        } else {
            d33 = d19;
        }
        double d39 = d33;
        if ((i11 & 512) != 0) {
            d34 = gpsSummary.centerLongitude;
        } else {
            d34 = d21;
        }
        double d41 = d34;
        if ((i11 & 1024) != 0) {
            d35 = gpsSummary.spanLatitudeDelta;
        } else {
            d35 = d22;
        }
        double d42 = d35;
        if ((i11 & ModuleCopy.f28574b) != 0) {
            d36 = gpsSummary.spanLongitudeDelta;
        } else {
            d36 = d23;
        }
        return gpsSummary.copy(d24, d25, d26, d27, d28, d29, d37, d38, d39, d41, d42, d36);
    }

    public final double component1() {
        return this.distance;
    }

    public final double component10() {
        return this.centerLongitude;
    }

    public final double component11() {
        return this.spanLatitudeDelta;
    }

    public final double component12() {
        return this.spanLongitudeDelta;
    }

    public final double component2() {
        return this.averageSpeed;
    }

    public final double component3() {
        return this.minSpeed;
    }

    public final double component4() {
        return this.maxSpeed;
    }

    public final double component5() {
        return this.startLatitude;
    }

    public final double component6() {
        return this.startLongitude;
    }

    public final double component7() {
        return this.endLatitude;
    }

    public final double component8() {
        return this.endLongitude;
    }

    public final double component9() {
        return this.centerLatitude;
    }

    public final GpsSummary copy(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d21, double d22, double d23) {
        return new GpsSummary(d11, d12, d13, d14, d15, d16, d17, d18, d19, d21, d22, d23);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GpsSummary)) {
            return false;
        }
        GpsSummary gpsSummary = (GpsSummary) obj;
        if (Double.compare(this.distance, gpsSummary.distance) == 0 && Double.compare(this.averageSpeed, gpsSummary.averageSpeed) == 0 && Double.compare(this.minSpeed, gpsSummary.minSpeed) == 0 && Double.compare(this.maxSpeed, gpsSummary.maxSpeed) == 0 && Double.compare(this.startLatitude, gpsSummary.startLatitude) == 0 && Double.compare(this.startLongitude, gpsSummary.startLongitude) == 0 && Double.compare(this.endLatitude, gpsSummary.endLatitude) == 0 && Double.compare(this.endLongitude, gpsSummary.endLongitude) == 0 && Double.compare(this.centerLatitude, gpsSummary.centerLatitude) == 0 && Double.compare(this.centerLongitude, gpsSummary.centerLongitude) == 0 && Double.compare(this.spanLatitudeDelta, gpsSummary.spanLatitudeDelta) == 0 && Double.compare(this.spanLongitudeDelta, gpsSummary.spanLongitudeDelta) == 0) {
            return true;
        }
        return false;
    }

    public final double getAverageSpeed() {
        return this.averageSpeed;
    }

    public final double getCenterLatitude() {
        return this.centerLatitude;
    }

    public final double getCenterLongitude() {
        return this.centerLongitude;
    }

    public final double getDistance() {
        return this.distance;
    }

    public final double getEndLatitude() {
        return this.endLatitude;
    }

    public final double getEndLongitude() {
        return this.endLongitude;
    }

    public final double getMaxSpeed() {
        return this.maxSpeed;
    }

    public final double getMinSpeed() {
        return this.minSpeed;
    }

    public final double getSpanLatitudeDelta() {
        return this.spanLatitudeDelta;
    }

    public final double getSpanLongitudeDelta() {
        return this.spanLongitudeDelta;
    }

    public final double getStartLatitude() {
        return this.startLatitude;
    }

    public final double getStartLongitude() {
        return this.startLongitude;
    }

    public int hashCode() {
        return Double.hashCode(this.spanLongitudeDelta) + l0.a(this.spanLatitudeDelta, l0.a(this.centerLongitude, l0.a(this.centerLatitude, l0.a(this.endLongitude, l0.a(this.endLatitude, l0.a(this.startLongitude, l0.a(this.startLatitude, l0.a(this.maxSpeed, l0.a(this.minSpeed, l0.a(this.averageSpeed, Double.hashCode(this.distance) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final void setAverageSpeed(double d11) {
        this.averageSpeed = d11;
    }

    public final void setCenterLatitude(double d11) {
        this.centerLatitude = d11;
    }

    public final void setCenterLongitude(double d11) {
        this.centerLongitude = d11;
    }

    public final void setDistance(double d11) {
        this.distance = d11;
    }

    public final void setEndLatitude(double d11) {
        this.endLatitude = d11;
    }

    public final void setEndLongitude(double d11) {
        this.endLongitude = d11;
    }

    public final void setMaxSpeed(double d11) {
        this.maxSpeed = d11;
    }

    public final void setMinSpeed(double d11) {
        this.minSpeed = d11;
    }

    public final void setSpanLatitudeDelta(double d11) {
        this.spanLatitudeDelta = d11;
    }

    public final void setSpanLongitudeDelta(double d11) {
        this.spanLongitudeDelta = d11;
    }

    public final void setStartLatitude(double d11) {
        this.startLatitude = d11;
    }

    public final void setStartLongitude(double d11) {
        this.startLongitude = d11;
    }

    public final String toJson() {
        String json = new Gson().toJson(this);
        u.i(json, "toJson(...)");
        return json;
    }

    public String toString() {
        double d11 = this.distance;
        double d12 = this.averageSpeed;
        double d13 = this.minSpeed;
        double d14 = this.maxSpeed;
        double d15 = this.startLatitude;
        double d16 = this.startLongitude;
        double d17 = this.endLatitude;
        double d18 = this.endLongitude;
        double d19 = this.centerLatitude;
        double d21 = this.centerLongitude;
        double d22 = this.spanLatitudeDelta;
        double d23 = this.spanLongitudeDelta;
        StringBuilder sb2 = new StringBuilder("GpsSummary(distance=");
        sb2.append(d11);
        sb2.append(", averageSpeed=");
        sb2.append(d12);
        t.d(sb2, ", minSpeed=", d13, ", maxSpeed=");
        sb2.append(d14);
        t.d(sb2, ", startLatitude=", d15, ", startLongitude=");
        sb2.append(d16);
        t.d(sb2, ", endLatitude=", d17, ", endLongitude=");
        sb2.append(d18);
        t.d(sb2, ", centerLatitude=", d19, ", centerLongitude=");
        sb2.append(d21);
        t.d(sb2, ", spanLatitudeDelta=", d22, ", spanLongitudeDelta=");
        sb2.append(d23);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeDouble(this.distance);
        out.writeDouble(this.averageSpeed);
        out.writeDouble(this.minSpeed);
        out.writeDouble(this.maxSpeed);
        out.writeDouble(this.startLatitude);
        out.writeDouble(this.startLongitude);
        out.writeDouble(this.endLatitude);
        out.writeDouble(this.endLongitude);
        out.writeDouble(this.centerLatitude);
        out.writeDouble(this.centerLongitude);
        out.writeDouble(this.spanLatitudeDelta);
        out.writeDouble(this.spanLongitudeDelta);
    }
}
