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
/* compiled from: SwimVasistas.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u000fHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003Jw\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u00101\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\tHÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0015\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u00066"}, d2 = {"Lcom/withings/vasistas/model/SwimVasistas;", "", "id", "", NavigationArguments.USER_ID, "startDate", "Lorg/joda/time/DateTime;", "durationMillis", "swimType", "", "swimLaps", "swimMovements", "algoVersion", "deviceModel", "syncedToWs", "", "deviceId", "(JJLorg/joda/time/DateTime;JIIIIIZJ)V", "getAlgoVersion", "()I", "getDeviceId", "()J", "getDeviceModel", "getDurationMillis", "setDurationMillis", "(J)V", "endDate", "getEndDate", "()Lorg/joda/time/DateTime;", "getId", "getStartDate", "getSwimLaps", "getSwimMovements", "getSwimType", "getSyncedToWs", "()Z", "getUserId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SwimVasistas {
    private final int algoVersion;
    private final long deviceId;
    private final int deviceModel;
    private long durationMillis;

    /* renamed from: id  reason: collision with root package name */
    private final long f46385id;
    private final DateTime startDate;
    private final int swimLaps;
    private final int swimMovements;
    private final int swimType;
    private final boolean syncedToWs;
    private final long userId;

    public SwimVasistas(long j5, long j11, DateTime startDate, long j12, int i11, int i12, int i13, int i14, int i15, boolean z5, long j13) {
        u.j(startDate, "startDate");
        this.f46385id = j5;
        this.userId = j11;
        this.startDate = startDate;
        this.durationMillis = j12;
        this.swimType = i11;
        this.swimLaps = i12;
        this.swimMovements = i13;
        this.algoVersion = i14;
        this.deviceModel = i15;
        this.syncedToWs = z5;
        this.deviceId = j13;
    }

    public static /* synthetic */ SwimVasistas copy$default(SwimVasistas swimVasistas, long j5, long j11, DateTime dateTime, long j12, int i11, int i12, int i13, int i14, int i15, boolean z5, long j13, int i16, Object obj) {
        long j14;
        long j15;
        DateTime dateTime2;
        long j16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        boolean z11;
        long j17;
        if ((i16 & 1) != 0) {
            j14 = swimVasistas.f46385id;
        } else {
            j14 = j5;
        }
        if ((i16 & 2) != 0) {
            j15 = swimVasistas.userId;
        } else {
            j15 = j11;
        }
        if ((i16 & 4) != 0) {
            dateTime2 = swimVasistas.startDate;
        } else {
            dateTime2 = dateTime;
        }
        if ((i16 & 8) != 0) {
            j16 = swimVasistas.durationMillis;
        } else {
            j16 = j12;
        }
        if ((i16 & 16) != 0) {
            i17 = swimVasistas.swimType;
        } else {
            i17 = i11;
        }
        if ((i16 & 32) != 0) {
            i18 = swimVasistas.swimLaps;
        } else {
            i18 = i12;
        }
        if ((i16 & 64) != 0) {
            i19 = swimVasistas.swimMovements;
        } else {
            i19 = i13;
        }
        if ((i16 & 128) != 0) {
            i21 = swimVasistas.algoVersion;
        } else {
            i21 = i14;
        }
        if ((i16 & 256) != 0) {
            i22 = swimVasistas.deviceModel;
        } else {
            i22 = i15;
        }
        if ((i16 & 512) != 0) {
            z11 = swimVasistas.syncedToWs;
        } else {
            z11 = z5;
        }
        boolean z12 = z11;
        if ((i16 & 1024) != 0) {
            j17 = swimVasistas.deviceId;
        } else {
            j17 = j13;
        }
        return swimVasistas.copy(j14, j15, dateTime2, j16, i17, i18, i19, i21, i22, z12, j17);
    }

    public final long component1() {
        return this.f46385id;
    }

    public final boolean component10() {
        return this.syncedToWs;
    }

    public final long component11() {
        return this.deviceId;
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
        return this.swimType;
    }

    public final int component6() {
        return this.swimLaps;
    }

    public final int component7() {
        return this.swimMovements;
    }

    public final int component8() {
        return this.algoVersion;
    }

    public final int component9() {
        return this.deviceModel;
    }

    public final SwimVasistas copy(long j5, long j11, DateTime startDate, long j12, int i11, int i12, int i13, int i14, int i15, boolean z5, long j13) {
        u.j(startDate, "startDate");
        return new SwimVasistas(j5, j11, startDate, j12, i11, i12, i13, i14, i15, z5, j13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwimVasistas)) {
            return false;
        }
        SwimVasistas swimVasistas = (SwimVasistas) obj;
        if (this.f46385id == swimVasistas.f46385id && this.userId == swimVasistas.userId && u.e(this.startDate, swimVasistas.startDate) && this.durationMillis == swimVasistas.durationMillis && this.swimType == swimVasistas.swimType && this.swimLaps == swimVasistas.swimLaps && this.swimMovements == swimVasistas.swimMovements && this.algoVersion == swimVasistas.algoVersion && this.deviceModel == swimVasistas.deviceModel && this.syncedToWs == swimVasistas.syncedToWs && this.deviceId == swimVasistas.deviceId) {
            return true;
        }
        return false;
    }

    public final int getAlgoVersion() {
        return this.algoVersion;
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
        return this.f46385id;
    }

    public final DateTime getStartDate() {
        return this.startDate;
    }

    public final int getSwimLaps() {
        return this.swimLaps;
    }

    public final int getSwimMovements() {
        return this.swimMovements;
    }

    public final int getSwimType() {
        return this.swimType;
    }

    public final boolean getSyncedToWs() {
        return this.syncedToWs;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Long.hashCode(this.deviceId) + y1.a(this.syncedToWs, h.a(this.deviceModel, h.a(this.algoVersion, h.a(this.swimMovements, h.a(this.swimLaps, h.a(this.swimType, c.a(this.durationMillis, a.b(this.startDate, c.a(this.userId, Long.hashCode(this.f46385id) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final void setDurationMillis(long j5) {
        this.durationMillis = j5;
    }

    public String toString() {
        long j5 = this.f46385id;
        long j11 = this.userId;
        DateTime dateTime = this.startDate;
        long j12 = this.durationMillis;
        int i11 = this.swimType;
        int i12 = this.swimLaps;
        int i13 = this.swimMovements;
        int i14 = this.algoVersion;
        int i15 = this.deviceModel;
        boolean z5 = this.syncedToWs;
        long j13 = this.deviceId;
        StringBuilder e11 = v.e("SwimVasistas(id=", j5, ", userId=");
        e11.append(j11);
        e11.append(", startDate=");
        e11.append(dateTime);
        g.d(e11, ", durationMillis=", j12, ", swimType=");
        b.a(e11, i11, ", swimLaps=", i12, ", swimMovements=");
        b.a(e11, i13, ", algoVersion=", i14, ", deviceModel=");
        e11.append(i15);
        e11.append(", syncedToWs=");
        e11.append(z5);
        e11.append(", deviceId=");
        return android.support.v4.media.session.c.c(e11, j13, ")");
    }
}
