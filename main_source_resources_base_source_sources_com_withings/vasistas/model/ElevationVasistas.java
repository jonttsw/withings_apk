package com.withings.vasistas.model;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.core.v;
import androidx.camera.core.y1;
import androidx.compose.material.o;
import androidx.work.impl.g;
import com.google.android.gms.internal.mlkit_common.a;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: ElevationVasistas.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003JY\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u000bHÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u0006/"}, d2 = {"Lcom/withings/vasistas/model/ElevationVasistas;", "", "id", "", NavigationArguments.USER_ID, "startDate", "Lorg/joda/time/DateTime;", "durationMillis", "ascent", "", "deviceModel", "", "syncedToWs", "", "deviceId", "(JJLorg/joda/time/DateTime;JFIZJ)V", "getAscent", "()F", "getDeviceId", "()J", "getDeviceModel", "()I", "getDurationMillis", "setDurationMillis", "(J)V", "endDate", "getEndDate", "()Lorg/joda/time/DateTime;", "getId", "getStartDate", "getSyncedToWs", "()Z", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ElevationVasistas {
    private final float ascent;
    private final long deviceId;
    private final int deviceModel;
    private long durationMillis;

    /* renamed from: id  reason: collision with root package name */
    private final long f46383id;
    private final DateTime startDate;
    private final boolean syncedToWs;
    private final long userId;

    public ElevationVasistas(long j5, long j11, DateTime startDate, long j12, float f11, int i11, boolean z5, long j13) {
        u.j(startDate, "startDate");
        this.f46383id = j5;
        this.userId = j11;
        this.startDate = startDate;
        this.durationMillis = j12;
        this.ascent = f11;
        this.deviceModel = i11;
        this.syncedToWs = z5;
        this.deviceId = j13;
    }

    public static /* synthetic */ ElevationVasistas copy$default(ElevationVasistas elevationVasistas, long j5, long j11, DateTime dateTime, long j12, float f11, int i11, boolean z5, long j13, int i12, Object obj) {
        long j14;
        long j15;
        DateTime dateTime2;
        long j16;
        float f12;
        int i13;
        boolean z11;
        long j17;
        if ((i12 & 1) != 0) {
            j14 = elevationVasistas.f46383id;
        } else {
            j14 = j5;
        }
        if ((i12 & 2) != 0) {
            j15 = elevationVasistas.userId;
        } else {
            j15 = j11;
        }
        if ((i12 & 4) != 0) {
            dateTime2 = elevationVasistas.startDate;
        } else {
            dateTime2 = dateTime;
        }
        if ((i12 & 8) != 0) {
            j16 = elevationVasistas.durationMillis;
        } else {
            j16 = j12;
        }
        if ((i12 & 16) != 0) {
            f12 = elevationVasistas.ascent;
        } else {
            f12 = f11;
        }
        if ((i12 & 32) != 0) {
            i13 = elevationVasistas.deviceModel;
        } else {
            i13 = i11;
        }
        if ((i12 & 64) != 0) {
            z11 = elevationVasistas.syncedToWs;
        } else {
            z11 = z5;
        }
        if ((i12 & 128) != 0) {
            j17 = elevationVasistas.deviceId;
        } else {
            j17 = j13;
        }
        return elevationVasistas.copy(j14, j15, dateTime2, j16, f12, i13, z11, j17);
    }

    public final long component1() {
        return this.f46383id;
    }

    public final long component2() {
        return this.userId;
    }

    public final DateTime component3() {
        return this.startDate;
    }

    public final long component4() {
        return this.durationMillis;
    }

    public final float component5() {
        return this.ascent;
    }

    public final int component6() {
        return this.deviceModel;
    }

    public final boolean component7() {
        return this.syncedToWs;
    }

    public final long component8() {
        return this.deviceId;
    }

    public final ElevationVasistas copy(long j5, long j11, DateTime startDate, long j12, float f11, int i11, boolean z5, long j13) {
        u.j(startDate, "startDate");
        return new ElevationVasistas(j5, j11, startDate, j12, f11, i11, z5, j13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ElevationVasistas)) {
            return false;
        }
        ElevationVasistas elevationVasistas = (ElevationVasistas) obj;
        if (this.f46383id == elevationVasistas.f46383id && this.userId == elevationVasistas.userId && u.e(this.startDate, elevationVasistas.startDate) && this.durationMillis == elevationVasistas.durationMillis && Float.compare(this.ascent, elevationVasistas.ascent) == 0 && this.deviceModel == elevationVasistas.deviceModel && this.syncedToWs == elevationVasistas.syncedToWs && this.deviceId == elevationVasistas.deviceId) {
            return true;
        }
        return false;
    }

    public final float getAscent() {
        return this.ascent;
    }

    public final long getDeviceId() {
        return this.deviceId;
    }

    public final int getDeviceModel() {
        return this.deviceModel;
    }

    public final long getDurationMillis() {
        return this.durationMillis;
    }

    public final DateTime getEndDate() {
        DateTime plusMillis = this.startDate.plusMillis((int) this.durationMillis);
        u.i(plusMillis, "plusMillis(...)");
        return plusMillis;
    }

    public final long getId() {
        return this.f46383id;
    }

    public final DateTime getStartDate() {
        return this.startDate;
    }

    public final boolean getSyncedToWs() {
        return this.syncedToWs;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Long.hashCode(this.deviceId) + y1.a(this.syncedToWs, h.a(this.deviceModel, o.a(this.ascent, c.a(this.durationMillis, a.b(this.startDate, c.a(this.userId, Long.hashCode(this.f46383id) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final void setDurationMillis(long j5) {
        this.durationMillis = j5;
    }

    public String toString() {
        long j5 = this.f46383id;
        long j11 = this.userId;
        DateTime dateTime = this.startDate;
        long j12 = this.durationMillis;
        float f11 = this.ascent;
        int i11 = this.deviceModel;
        boolean z5 = this.syncedToWs;
        long j13 = this.deviceId;
        StringBuilder e11 = v.e("ElevationVasistas(id=", j5, ", userId=");
        e11.append(j11);
        e11.append(", startDate=");
        e11.append(dateTime);
        g.d(e11, ", durationMillis=", j12, ", ascent=");
        e11.append(f11);
        e11.append(", deviceModel=");
        e11.append(i11);
        e11.append(", syncedToWs=");
        e11.append(z5);
        e11.append(", deviceId=");
        e11.append(j13);
        e11.append(")");
        return e11.toString();
    }
}
