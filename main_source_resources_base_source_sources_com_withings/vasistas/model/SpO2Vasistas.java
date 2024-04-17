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
/* compiled from: SpO2Vasistas.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003Jc\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\tHÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0011¨\u00060"}, d2 = {"Lcom/withings/vasistas/model/SpO2Vasistas;", "", "id", "", NavigationArguments.USER_ID, "startDate", "Lorg/joda/time/DateTime;", "durationMillis", "spo2", "", "spo2Quality", "deviceModel", "syncedToWs", "", "deviceId", "(JJLorg/joda/time/DateTime;JIIIZJ)V", "getDeviceId", "()J", "getDeviceModel", "()I", "getDurationMillis", "setDurationMillis", "(J)V", "endDate", "getEndDate", "()Lorg/joda/time/DateTime;", "getId", "getSpo2", "getSpo2Quality", "getStartDate", "getSyncedToWs", "()Z", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SpO2Vasistas {
    private final long deviceId;
    private final int deviceModel;
    private long durationMillis;

    /* renamed from: id  reason: collision with root package name */
    private final long f46384id;
    private final int spo2;
    private final int spo2Quality;
    private final DateTime startDate;
    private final boolean syncedToWs;
    private final long userId;

    public SpO2Vasistas(long j5, long j11, DateTime startDate, long j12, int i11, int i12, int i13, boolean z5, long j13) {
        u.j(startDate, "startDate");
        this.f46384id = j5;
        this.userId = j11;
        this.startDate = startDate;
        this.durationMillis = j12;
        this.spo2 = i11;
        this.spo2Quality = i12;
        this.deviceModel = i13;
        this.syncedToWs = z5;
        this.deviceId = j13;
    }

    public static /* synthetic */ SpO2Vasistas copy$default(SpO2Vasistas spO2Vasistas, long j5, long j11, DateTime dateTime, long j12, int i11, int i12, int i13, boolean z5, long j13, int i14, Object obj) {
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
            j14 = spO2Vasistas.f46384id;
        } else {
            j14 = j5;
        }
        if ((i14 & 2) != 0) {
            j15 = spO2Vasistas.userId;
        } else {
            j15 = j11;
        }
        if ((i14 & 4) != 0) {
            dateTime2 = spO2Vasistas.startDate;
        } else {
            dateTime2 = dateTime;
        }
        if ((i14 & 8) != 0) {
            j16 = spO2Vasistas.durationMillis;
        } else {
            j16 = j12;
        }
        if ((i14 & 16) != 0) {
            i15 = spO2Vasistas.spo2;
        } else {
            i15 = i11;
        }
        if ((i14 & 32) != 0) {
            i16 = spO2Vasistas.spo2Quality;
        } else {
            i16 = i12;
        }
        if ((i14 & 64) != 0) {
            i17 = spO2Vasistas.deviceModel;
        } else {
            i17 = i13;
        }
        if ((i14 & 128) != 0) {
            z11 = spO2Vasistas.syncedToWs;
        } else {
            z11 = z5;
        }
        if ((i14 & 256) != 0) {
            j17 = spO2Vasistas.deviceId;
        } else {
            j17 = j13;
        }
        return spO2Vasistas.copy(j14, j15, dateTime2, j16, i15, i16, i17, z11, j17);
    }

    public final long component1() {
        return this.f46384id;
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
        return this.spo2;
    }

    public final int component6() {
        return this.spo2Quality;
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

    public final SpO2Vasistas copy(long j5, long j11, DateTime startDate, long j12, int i11, int i12, int i13, boolean z5, long j13) {
        u.j(startDate, "startDate");
        return new SpO2Vasistas(j5, j11, startDate, j12, i11, i12, i13, z5, j13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpO2Vasistas)) {
            return false;
        }
        SpO2Vasistas spO2Vasistas = (SpO2Vasistas) obj;
        if (this.f46384id == spO2Vasistas.f46384id && this.userId == spO2Vasistas.userId && u.e(this.startDate, spO2Vasistas.startDate) && this.durationMillis == spO2Vasistas.durationMillis && this.spo2 == spO2Vasistas.spo2 && this.spo2Quality == spO2Vasistas.spo2Quality && this.deviceModel == spO2Vasistas.deviceModel && this.syncedToWs == spO2Vasistas.syncedToWs && this.deviceId == spO2Vasistas.deviceId) {
            return true;
        }
        return false;
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
        return this.f46384id;
    }

    public final int getSpo2() {
        return this.spo2;
    }

    public final int getSpo2Quality() {
        return this.spo2Quality;
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
        return Long.hashCode(this.deviceId) + y1.a(this.syncedToWs, h.a(this.deviceModel, h.a(this.spo2Quality, h.a(this.spo2, c.a(this.durationMillis, a.b(this.startDate, c.a(this.userId, Long.hashCode(this.f46384id) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final void setDurationMillis(long j5) {
        this.durationMillis = j5;
    }

    public String toString() {
        long j5 = this.f46384id;
        long j11 = this.userId;
        DateTime dateTime = this.startDate;
        long j12 = this.durationMillis;
        int i11 = this.spo2;
        int i12 = this.spo2Quality;
        int i13 = this.deviceModel;
        boolean z5 = this.syncedToWs;
        long j13 = this.deviceId;
        StringBuilder e11 = v.e("SpO2Vasistas(id=", j5, ", userId=");
        e11.append(j11);
        e11.append(", startDate=");
        e11.append(dateTime);
        g.d(e11, ", durationMillis=", j12, ", spo2=");
        b.a(e11, i11, ", spo2Quality=", i12, ", deviceModel=");
        e11.append(i13);
        e11.append(", syncedToWs=");
        e11.append(z5);
        e11.append(", deviceId=");
        return android.support.v4.media.session.c.c(e11, j13, ")");
    }
}
