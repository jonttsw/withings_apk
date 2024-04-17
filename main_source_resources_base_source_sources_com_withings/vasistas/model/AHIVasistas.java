package com.withings.vasistas.model;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.core.v;
import androidx.camera.core.y1;
import androidx.work.impl.g;
import com.google.android.gms.internal.mlkit_common.a;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import v6.b;
/* compiled from: AHIVasistas.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003Jc\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\tHÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0014\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014¨\u00060"}, d2 = {"Lcom/withings/vasistas/model/AHIVasistas;", "", "id", "", NavigationArguments.USER_ID, "startDate", "Lorg/joda/time/DateTime;", "durationMillis", "apneaHypopneaIndex", "", "breathingDisturbanceProbability", "deviceModel", "syncedToWs", "", "deviceId", "(JJLorg/joda/time/DateTime;JIIIZJ)V", "getApneaHypopneaIndex", "()I", "getBreathingDisturbanceProbability", "getDeviceId", "()J", "getDeviceModel", "getDurationMillis", "setDurationMillis", "(J)V", "endDate", "getEndDate", "()Lorg/joda/time/DateTime;", "getId", "getStartDate", "getSyncedToWs", "()Z", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AHIVasistas {
    private final int apneaHypopneaIndex;
    private final int breathingDisturbanceProbability;
    private final long deviceId;
    private final int deviceModel;
    private long durationMillis;

    /* renamed from: id  reason: collision with root package name */
    private final long f46382id;
    private final DateTime startDate;
    private final boolean syncedToWs;
    private final long userId;

    public AHIVasistas(long j5, long j11, DateTime startDate, long j12, int i11, int i12, int i13, boolean z5, long j13) {
        u.j(startDate, "startDate");
        this.f46382id = j5;
        this.userId = j11;
        this.startDate = startDate;
        this.durationMillis = j12;
        this.apneaHypopneaIndex = i11;
        this.breathingDisturbanceProbability = i12;
        this.deviceModel = i13;
        this.syncedToWs = z5;
        this.deviceId = j13;
    }

    public static /* synthetic */ AHIVasistas copy$default(AHIVasistas aHIVasistas, long j5, long j11, DateTime dateTime, long j12, int i11, int i12, int i13, boolean z5, long j13, int i14, Object obj) {
        long j14;
        long j15;
        DateTime dateTime2;
        long j16;
        int i15;
        int i16;
        int i17;
        boolean z11;
        long j17;
        if ((i14 & 1) != 0) {
            j14 = aHIVasistas.f46382id;
        } else {
            j14 = j5;
        }
        if ((i14 & 2) != 0) {
            j15 = aHIVasistas.userId;
        } else {
            j15 = j11;
        }
        if ((i14 & 4) != 0) {
            dateTime2 = aHIVasistas.startDate;
        } else {
            dateTime2 = dateTime;
        }
        if ((i14 & 8) != 0) {
            j16 = aHIVasistas.durationMillis;
        } else {
            j16 = j12;
        }
        if ((i14 & 16) != 0) {
            i15 = aHIVasistas.apneaHypopneaIndex;
        } else {
            i15 = i11;
        }
        if ((i14 & 32) != 0) {
            i16 = aHIVasistas.breathingDisturbanceProbability;
        } else {
            i16 = i12;
        }
        if ((i14 & 64) != 0) {
            i17 = aHIVasistas.deviceModel;
        } else {
            i17 = i13;
        }
        if ((i14 & 128) != 0) {
            z11 = aHIVasistas.syncedToWs;
        } else {
            z11 = z5;
        }
        if ((i14 & 256) != 0) {
            j17 = aHIVasistas.deviceId;
        } else {
            j17 = j13;
        }
        return aHIVasistas.copy(j14, j15, dateTime2, j16, i15, i16, i17, z11, j17);
    }

    public final long component1() {
        return this.f46382id;
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

    public final int component5() {
        return this.apneaHypopneaIndex;
    }

    public final int component6() {
        return this.breathingDisturbanceProbability;
    }

    public final int component7() {
        return this.deviceModel;
    }

    public final boolean component8() {
        return this.syncedToWs;
    }

    public final long component9() {
        return this.deviceId;
    }

    public final AHIVasistas copy(long j5, long j11, DateTime startDate, long j12, int i11, int i12, int i13, boolean z5, long j13) {
        u.j(startDate, "startDate");
        return new AHIVasistas(j5, j11, startDate, j12, i11, i12, i13, z5, j13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AHIVasistas)) {
            return false;
        }
        AHIVasistas aHIVasistas = (AHIVasistas) obj;
        if (this.f46382id == aHIVasistas.f46382id && this.userId == aHIVasistas.userId && u.e(this.startDate, aHIVasistas.startDate) && this.durationMillis == aHIVasistas.durationMillis && this.apneaHypopneaIndex == aHIVasistas.apneaHypopneaIndex && this.breathingDisturbanceProbability == aHIVasistas.breathingDisturbanceProbability && this.deviceModel == aHIVasistas.deviceModel && this.syncedToWs == aHIVasistas.syncedToWs && this.deviceId == aHIVasistas.deviceId) {
            return true;
        }
        return false;
    }

    public final int getApneaHypopneaIndex() {
        return this.apneaHypopneaIndex;
    }

    public final int getBreathingDisturbanceProbability() {
        return this.breathingDisturbanceProbability;
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
        return this.f46382id;
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
        return Long.hashCode(this.deviceId) + y1.a(this.syncedToWs, h.a(this.deviceModel, h.a(this.breathingDisturbanceProbability, h.a(this.apneaHypopneaIndex, c.a(this.durationMillis, a.b(this.startDate, c.a(this.userId, Long.hashCode(this.f46382id) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final void setDurationMillis(long j5) {
        this.durationMillis = j5;
    }

    public String toString() {
        long j5 = this.f46382id;
        long j11 = this.userId;
        DateTime dateTime = this.startDate;
        long j12 = this.durationMillis;
        int i11 = this.apneaHypopneaIndex;
        int i12 = this.breathingDisturbanceProbability;
        int i13 = this.deviceModel;
        boolean z5 = this.syncedToWs;
        long j13 = this.deviceId;
        StringBuilder e11 = v.e("AHIVasistas(id=", j5, ", userId=");
        e11.append(j11);
        e11.append(", startDate=");
        e11.append(dateTime);
        g.d(e11, ", durationMillis=", j12, ", apneaHypopneaIndex=");
        b.a(e11, i11, ", breathingDisturbanceProbability=", i12, ", deviceModel=");
        e11.append(i13);
        e11.append(", syncedToWs=");
        e11.append(z5);
        e11.append(", deviceId=");
        return android.support.v4.media.session.c.c(e11, j13, ")");
    }
}
