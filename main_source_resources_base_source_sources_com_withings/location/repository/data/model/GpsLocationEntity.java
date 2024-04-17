package com.withings.location.repository.data.model;

import androidx.activity.result.c;
import androidx.camera.camera2.internal.l0;
import androidx.camera.core.y1;
import androidx.compose.material.o;
import com.google.android.gms.internal.mlkit_common.a;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.t;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: GpsLocationEntity.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b>\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010+J\t\u0010@\u001a\u00020\bHÆ\u0003J\t\u0010A\u001a\u00020\bHÆ\u0003J\t\u0010B\u001a\u00020\bHÆ\u0003J\t\u0010C\u001a\u00020\u0013HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0006HÆ\u0003J\t\u0010G\u001a\u00020\bHÆ\u0003J\t\u0010H\u001a\u00020\bHÆ\u0003J\t\u0010I\u001a\u00020\u000bHÆ\u0003J\t\u0010J\u001a\u00020\bHÆ\u0003J\t\u0010K\u001a\u00020\u000bHÆ\u0003J\t\u0010L\u001a\u00020\u000bHÆ\u0003J\u009c\u0001\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010NJ\u0013\u0010O\u001a\u00020\u00132\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Q\u001a\u00020RHÖ\u0001J\t\u0010S\u001a\u00020THÖ\u0001R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\r\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0017\"\u0004\b0\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0017\"\u0004\b2\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001b\"\u0004\b4\u0010\u001dR\u001e\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001b\"\u0004\b6\u0010\u001dR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010%\"\u0004\b<\u0010'R\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001b\"\u0004\b>\u0010\u001d¨\u0006U"}, d2 = {"Lcom/withings/location/repository/data/model/GpsLocationEntity;", "", "id", "", NavigationArguments.USER_ID, "date", "Lorg/joda/time/DateTime;", "speed", "", "horizontalAccuracy", "altitude", "", FusedLocationProviderClient.KEY_VERTICAL_ACCURACY, "latitude", "longitude", "speedAccuracy", "course", "courseAccuracy", "synced", "", "deviceId", "(Ljava/lang/Long;JLorg/joda/time/DateTime;FFDFDDFFFZJ)V", "getAltitude", "()D", "setAltitude", "(D)V", "getCourse", "()F", "setCourse", "(F)V", "getCourseAccuracy", "setCourseAccuracy", "getDate", "()Lorg/joda/time/DateTime;", "setDate", "(Lorg/joda/time/DateTime;)V", "getDeviceId", "()J", "setDeviceId", "(J)V", "getHorizontalAccuracy", "setHorizontalAccuracy", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getLatitude", "setLatitude", "getLongitude", "setLongitude", "getSpeed", "setSpeed", "getSpeedAccuracy", "setSpeedAccuracy", "getSynced", "()Z", "setSynced", "(Z)V", "getUserId", "setUserId", "getVerticalAccuracy", "setVerticalAccuracy", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;JLorg/joda/time/DateTime;FFDFDDFFFZJ)Lcom/withings/location/repository/data/model/GpsLocationEntity;", "equals", "other", "hashCode", "", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GpsLocationEntity {
    private double altitude;
    private float course;
    private float courseAccuracy;
    private DateTime date;
    private long deviceId;
    private float horizontalAccuracy;

    /* renamed from: id  reason: collision with root package name */
    private Long f40655id;
    private double latitude;
    private double longitude;
    private float speed;
    private float speedAccuracy;
    private boolean synced;
    private long userId;
    private float verticalAccuracy;

    public GpsLocationEntity(Long l5, long j5, DateTime date, float f11, float f12, double d11, float f13, double d12, double d13, float f14, float f15, float f16, boolean z5, long j11) {
        u.j(date, "date");
        this.f40655id = l5;
        this.userId = j5;
        this.date = date;
        this.speed = f11;
        this.horizontalAccuracy = f12;
        this.altitude = d11;
        this.verticalAccuracy = f13;
        this.latitude = d12;
        this.longitude = d13;
        this.speedAccuracy = f14;
        this.course = f15;
        this.courseAccuracy = f16;
        this.synced = z5;
        this.deviceId = j11;
    }

    public static /* synthetic */ GpsLocationEntity copy$default(GpsLocationEntity gpsLocationEntity, Long l5, long j5, DateTime dateTime, float f11, float f12, double d11, float f13, double d12, double d13, float f14, float f15, float f16, boolean z5, long j11, int i11, Object obj) {
        Long l6;
        long j12;
        DateTime dateTime2;
        float f17;
        float f18;
        double d14;
        float f19;
        double d15;
        double d16;
        float f21;
        float f22;
        float f23;
        boolean z11;
        long j13;
        if ((i11 & 1) != 0) {
            l6 = gpsLocationEntity.f40655id;
        } else {
            l6 = l5;
        }
        if ((i11 & 2) != 0) {
            j12 = gpsLocationEntity.userId;
        } else {
            j12 = j5;
        }
        if ((i11 & 4) != 0) {
            dateTime2 = gpsLocationEntity.date;
        } else {
            dateTime2 = dateTime;
        }
        if ((i11 & 8) != 0) {
            f17 = gpsLocationEntity.speed;
        } else {
            f17 = f11;
        }
        if ((i11 & 16) != 0) {
            f18 = gpsLocationEntity.horizontalAccuracy;
        } else {
            f18 = f12;
        }
        if ((i11 & 32) != 0) {
            d14 = gpsLocationEntity.altitude;
        } else {
            d14 = d11;
        }
        if ((i11 & 64) != 0) {
            f19 = gpsLocationEntity.verticalAccuracy;
        } else {
            f19 = f13;
        }
        if ((i11 & 128) != 0) {
            d15 = gpsLocationEntity.latitude;
        } else {
            d15 = d12;
        }
        if ((i11 & 256) != 0) {
            d16 = gpsLocationEntity.longitude;
        } else {
            d16 = d13;
        }
        if ((i11 & 512) != 0) {
            f21 = gpsLocationEntity.speedAccuracy;
        } else {
            f21 = f14;
        }
        float f24 = f21;
        if ((i11 & 1024) != 0) {
            f22 = gpsLocationEntity.course;
        } else {
            f22 = f15;
        }
        float f25 = f22;
        if ((i11 & ModuleCopy.f28574b) != 0) {
            f23 = gpsLocationEntity.courseAccuracy;
        } else {
            f23 = f16;
        }
        float f26 = f23;
        if ((i11 & 4096) != 0) {
            z11 = gpsLocationEntity.synced;
        } else {
            z11 = z5;
        }
        double d17 = d16;
        if ((i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            j13 = gpsLocationEntity.deviceId;
        } else {
            j13 = j11;
        }
        return gpsLocationEntity.copy(l6, j12, dateTime2, f17, f18, d14, f19, d15, d17, f24, f25, f26, z11, j13);
    }

    public final Long component1() {
        return this.f40655id;
    }

    public final float component10() {
        return this.speedAccuracy;
    }

    public final float component11() {
        return this.course;
    }

    public final float component12() {
        return this.courseAccuracy;
    }

    public final boolean component13() {
        return this.synced;
    }

    public final long component14() {
        return this.deviceId;
    }

    public final long component2() {
        return this.userId;
    }

    public final DateTime component3() {
        return this.date;
    }

    public final float component4() {
        return this.speed;
    }

    public final float component5() {
        return this.horizontalAccuracy;
    }

    public final double component6() {
        return this.altitude;
    }

    public final float component7() {
        return this.verticalAccuracy;
    }

    public final double component8() {
        return this.latitude;
    }

    public final double component9() {
        return this.longitude;
    }

    public final GpsLocationEntity copy(Long l5, long j5, DateTime date, float f11, float f12, double d11, float f13, double d12, double d13, float f14, float f15, float f16, boolean z5, long j11) {
        u.j(date, "date");
        return new GpsLocationEntity(l5, j5, date, f11, f12, d11, f13, d12, d13, f14, f15, f16, z5, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GpsLocationEntity)) {
            return false;
        }
        GpsLocationEntity gpsLocationEntity = (GpsLocationEntity) obj;
        if (u.e(this.f40655id, gpsLocationEntity.f40655id) && this.userId == gpsLocationEntity.userId && u.e(this.date, gpsLocationEntity.date) && Float.compare(this.speed, gpsLocationEntity.speed) == 0 && Float.compare(this.horizontalAccuracy, gpsLocationEntity.horizontalAccuracy) == 0 && Double.compare(this.altitude, gpsLocationEntity.altitude) == 0 && Float.compare(this.verticalAccuracy, gpsLocationEntity.verticalAccuracy) == 0 && Double.compare(this.latitude, gpsLocationEntity.latitude) == 0 && Double.compare(this.longitude, gpsLocationEntity.longitude) == 0 && Float.compare(this.speedAccuracy, gpsLocationEntity.speedAccuracy) == 0 && Float.compare(this.course, gpsLocationEntity.course) == 0 && Float.compare(this.courseAccuracy, gpsLocationEntity.courseAccuracy) == 0 && this.synced == gpsLocationEntity.synced && this.deviceId == gpsLocationEntity.deviceId) {
            return true;
        }
        return false;
    }

    public final double getAltitude() {
        return this.altitude;
    }

    public final float getCourse() {
        return this.course;
    }

    public final float getCourseAccuracy() {
        return this.courseAccuracy;
    }

    public final DateTime getDate() {
        return this.date;
    }

    public final long getDeviceId() {
        return this.deviceId;
    }

    public final float getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }

    public final Long getId() {
        return this.f40655id;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final float getSpeedAccuracy() {
        return this.speedAccuracy;
    }

    public final boolean getSynced() {
        return this.synced;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final float getVerticalAccuracy() {
        return this.verticalAccuracy;
    }

    public int hashCode() {
        int hashCode;
        Long l5 = this.f40655id;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        return Long.hashCode(this.deviceId) + y1.a(this.synced, o.a(this.courseAccuracy, o.a(this.course, o.a(this.speedAccuracy, l0.a(this.longitude, l0.a(this.latitude, o.a(this.verticalAccuracy, l0.a(this.altitude, o.a(this.horizontalAccuracy, o.a(this.speed, a.b(this.date, c.a(this.userId, hashCode * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final void setAltitude(double d11) {
        this.altitude = d11;
    }

    public final void setCourse(float f11) {
        this.course = f11;
    }

    public final void setCourseAccuracy(float f11) {
        this.courseAccuracy = f11;
    }

    public final void setDate(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.date = dateTime;
    }

    public final void setDeviceId(long j5) {
        this.deviceId = j5;
    }

    public final void setHorizontalAccuracy(float f11) {
        this.horizontalAccuracy = f11;
    }

    public final void setId(Long l5) {
        this.f40655id = l5;
    }

    public final void setLatitude(double d11) {
        this.latitude = d11;
    }

    public final void setLongitude(double d11) {
        this.longitude = d11;
    }

    public final void setSpeed(float f11) {
        this.speed = f11;
    }

    public final void setSpeedAccuracy(float f11) {
        this.speedAccuracy = f11;
    }

    public final void setSynced(boolean z5) {
        this.synced = z5;
    }

    public final void setUserId(long j5) {
        this.userId = j5;
    }

    public final void setVerticalAccuracy(float f11) {
        this.verticalAccuracy = f11;
    }

    public String toString() {
        Long l5 = this.f40655id;
        long j5 = this.userId;
        DateTime dateTime = this.date;
        float f11 = this.speed;
        float f12 = this.horizontalAccuracy;
        double d11 = this.altitude;
        float f13 = this.verticalAccuracy;
        double d12 = this.latitude;
        double d13 = this.longitude;
        float f14 = this.speedAccuracy;
        float f15 = this.course;
        float f16 = this.courseAccuracy;
        boolean z5 = this.synced;
        long j11 = this.deviceId;
        StringBuilder sb2 = new StringBuilder("GpsLocationEntity(id=");
        sb2.append(l5);
        sb2.append(", userId=");
        sb2.append(j5);
        sb2.append(", date=");
        sb2.append(dateTime);
        sb2.append(", speed=");
        sb2.append(f11);
        sb2.append(", horizontalAccuracy=");
        sb2.append(f12);
        sb2.append(", altitude=");
        sb2.append(d11);
        sb2.append(", verticalAccuracy=");
        sb2.append(f13);
        t.d(sb2, ", latitude=", d12, ", longitude=");
        sb2.append(d13);
        sb2.append(", speedAccuracy=");
        sb2.append(f14);
        sb2.append(", course=");
        sb2.append(f15);
        sb2.append(", courseAccuracy=");
        sb2.append(f16);
        sb2.append(", synced=");
        sb2.append(z5);
        sb2.append(", deviceId=");
        return android.support.v4.media.session.c.c(sb2, j11, ")");
    }

    public /* synthetic */ GpsLocationEntity(Long l5, long j5, DateTime dateTime, float f11, float f12, double d11, float f13, double d12, double d13, float f14, float f15, float f16, boolean z5, long j11, int i11, m mVar) {
        this((i11 & 1) != 0 ? null : l5, j5, dateTime, f11, f12, d11, f13, d12, d13, (i11 & 512) != 0 ? 0.0f : f14, (i11 & 1024) != 0 ? 0.0f : f15, (i11 & ModuleCopy.f28574b) != 0 ? 0.0f : f16, (i11 & 4096) != 0 ? false : z5, (i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 0L : j11);
    }
}
