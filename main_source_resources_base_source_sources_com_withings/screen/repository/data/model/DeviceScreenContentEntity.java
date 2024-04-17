package com.withings.screen.repository.data.model;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.core.v;
import androidx.work.impl.g;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: DeviceScreenContentEntity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u00109\u001a\u00020\u0003HÆ\u0003Jv\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\u000f2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\bHÖ\u0001J\t\u0010?\u001a\u00020\nHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0012\"\u0004\b'\u0010\u0014R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014¨\u0006@"}, d2 = {"Lcom/withings/screen/repository/data/model/DeviceScreenContentEntity;", "", "id", "", "deviceId", NavigationArguments.USER_ID, "screenWsId", "displayStyle", "", "message", "", "startDate", "endDate", "modified", "syncedWithDevice", "", "(JJJJILjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;JZ)V", "getDeviceId", "()J", "setDeviceId", "(J)V", "getDisplayStyle", "()I", "setDisplayStyle", "(I)V", "getEndDate", "()Ljava/lang/Long;", "setEndDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getId", "setId", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getModified", "setModified", "getScreenWsId", "setScreenWsId", "getStartDate", "setStartDate", "getSyncedWithDevice", "()Z", "setSyncedWithDevice", "(Z)V", "getUserId", "setUserId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JJJJILjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;JZ)Lcom/withings/screen/repository/data/model/DeviceScreenContentEntity;", "equals", "other", "hashCode", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceScreenContentEntity {
    private long deviceId;
    private int displayStyle;
    private Long endDate;

    /* renamed from: id  reason: collision with root package name */
    private long f43964id;
    private String message;
    private long modified;
    private long screenWsId;
    private Long startDate;
    private boolean syncedWithDevice;
    private long userId;

    public DeviceScreenContentEntity() {
        this(0L, 0L, 0L, 0L, 0, null, null, null, 0L, false, 1023, null);
    }

    public static /* synthetic */ DeviceScreenContentEntity copy$default(DeviceScreenContentEntity deviceScreenContentEntity, long j5, long j11, long j12, long j13, int i11, String str, Long l5, Long l6, long j14, boolean z5, int i12, Object obj) {
        long j15;
        long j16;
        long j17;
        long j18;
        int i13;
        String str2;
        Long l11;
        Long l12;
        long j19;
        boolean z11;
        if ((i12 & 1) != 0) {
            j15 = deviceScreenContentEntity.f43964id;
        } else {
            j15 = j5;
        }
        if ((i12 & 2) != 0) {
            j16 = deviceScreenContentEntity.deviceId;
        } else {
            j16 = j11;
        }
        if ((i12 & 4) != 0) {
            j17 = deviceScreenContentEntity.userId;
        } else {
            j17 = j12;
        }
        if ((i12 & 8) != 0) {
            j18 = deviceScreenContentEntity.screenWsId;
        } else {
            j18 = j13;
        }
        if ((i12 & 16) != 0) {
            i13 = deviceScreenContentEntity.displayStyle;
        } else {
            i13 = i11;
        }
        if ((i12 & 32) != 0) {
            str2 = deviceScreenContentEntity.message;
        } else {
            str2 = str;
        }
        if ((i12 & 64) != 0) {
            l11 = deviceScreenContentEntity.startDate;
        } else {
            l11 = l5;
        }
        if ((i12 & 128) != 0) {
            l12 = deviceScreenContentEntity.endDate;
        } else {
            l12 = l6;
        }
        if ((i12 & 256) != 0) {
            j19 = deviceScreenContentEntity.modified;
        } else {
            j19 = j14;
        }
        if ((i12 & 512) != 0) {
            z11 = deviceScreenContentEntity.syncedWithDevice;
        } else {
            z11 = z5;
        }
        return deviceScreenContentEntity.copy(j15, j16, j17, j18, i13, str2, l11, l12, j19, z11);
    }

    public final long component1() {
        return this.f43964id;
    }

    public final boolean component10() {
        return this.syncedWithDevice;
    }

    public final long component2() {
        return this.deviceId;
    }

    public final long component3() {
        return this.userId;
    }

    public final long component4() {
        return this.screenWsId;
    }

    public final int component5() {
        return this.displayStyle;
    }

    public final String component6() {
        return this.message;
    }

    public final Long component7() {
        return this.startDate;
    }

    public final Long component8() {
        return this.endDate;
    }

    public final long component9() {
        return this.modified;
    }

    public final DeviceScreenContentEntity copy(long j5, long j11, long j12, long j13, int i11, String message, Long l5, Long l6, long j14, boolean z5) {
        u.j(message, "message");
        return new DeviceScreenContentEntity(j5, j11, j12, j13, i11, message, l5, l6, j14, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceScreenContentEntity)) {
            return false;
        }
        DeviceScreenContentEntity deviceScreenContentEntity = (DeviceScreenContentEntity) obj;
        if (this.f43964id == deviceScreenContentEntity.f43964id && this.deviceId == deviceScreenContentEntity.deviceId && this.userId == deviceScreenContentEntity.userId && this.screenWsId == deviceScreenContentEntity.screenWsId && this.displayStyle == deviceScreenContentEntity.displayStyle && u.e(this.message, deviceScreenContentEntity.message) && u.e(this.startDate, deviceScreenContentEntity.startDate) && u.e(this.endDate, deviceScreenContentEntity.endDate) && this.modified == deviceScreenContentEntity.modified && this.syncedWithDevice == deviceScreenContentEntity.syncedWithDevice) {
            return true;
        }
        return false;
    }

    public final long getDeviceId() {
        return this.deviceId;
    }

    public final int getDisplayStyle() {
        return this.displayStyle;
    }

    public final Long getEndDate() {
        return this.endDate;
    }

    public final long getId() {
        return this.f43964id;
    }

    public final String getMessage() {
        return this.message;
    }

    public final long getModified() {
        return this.modified;
    }

    public final long getScreenWsId() {
        return this.screenWsId;
    }

    public final Long getStartDate() {
        return this.startDate;
    }

    public final boolean getSyncedWithDevice() {
        return this.syncedWithDevice;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode;
        int c11 = d.c(this.message, h.a(this.displayStyle, c.a(this.screenWsId, c.a(this.userId, c.a(this.deviceId, Long.hashCode(this.f43964id) * 31, 31), 31), 31), 31), 31);
        Long l5 = this.startDate;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int i12 = (c11 + hashCode) * 31;
        Long l6 = this.endDate;
        if (l6 != null) {
            i11 = l6.hashCode();
        }
        return Boolean.hashCode(this.syncedWithDevice) + c.a(this.modified, (i12 + i11) * 31, 31);
    }

    public final void setDeviceId(long j5) {
        this.deviceId = j5;
    }

    public final void setDisplayStyle(int i11) {
        this.displayStyle = i11;
    }

    public final void setEndDate(Long l5) {
        this.endDate = l5;
    }

    public final void setId(long j5) {
        this.f43964id = j5;
    }

    public final void setMessage(String str) {
        u.j(str, "<set-?>");
        this.message = str;
    }

    public final void setModified(long j5) {
        this.modified = j5;
    }

    public final void setScreenWsId(long j5) {
        this.screenWsId = j5;
    }

    public final void setStartDate(Long l5) {
        this.startDate = l5;
    }

    public final void setSyncedWithDevice(boolean z5) {
        this.syncedWithDevice = z5;
    }

    public final void setUserId(long j5) {
        this.userId = j5;
    }

    public String toString() {
        long j5 = this.f43964id;
        long j11 = this.deviceId;
        long j12 = this.userId;
        long j13 = this.screenWsId;
        int i11 = this.displayStyle;
        String str = this.message;
        Long l5 = this.startDate;
        Long l6 = this.endDate;
        long j14 = this.modified;
        boolean z5 = this.syncedWithDevice;
        StringBuilder e11 = v.e("DeviceScreenContentEntity(id=", j5, ", deviceId=");
        e11.append(j11);
        g.d(e11, ", userId=", j12, ", screenWsId=");
        e11.append(j13);
        e11.append(", displayStyle=");
        e11.append(i11);
        e11.append(", message=");
        e11.append(str);
        e11.append(", startDate=");
        e11.append(l5);
        e11.append(", endDate=");
        e11.append(l6);
        e11.append(", modified=");
        e11.append(j14);
        e11.append(", syncedWithDevice=");
        e11.append(z5);
        e11.append(")");
        return e11.toString();
    }

    public DeviceScreenContentEntity(long j5, long j11, long j12, long j13, int i11, String message, Long l5, Long l6, long j14, boolean z5) {
        u.j(message, "message");
        this.f43964id = j5;
        this.deviceId = j11;
        this.userId = j12;
        this.screenWsId = j13;
        this.displayStyle = i11;
        this.message = message;
        this.startDate = l5;
        this.endDate = l6;
        this.modified = j14;
        this.syncedWithDevice = z5;
    }

    public /* synthetic */ DeviceScreenContentEntity(long j5, long j11, long j12, long j13, int i11, String str, Long l5, Long l6, long j14, boolean z5, int i12, m mVar) {
        this((i12 & 1) != 0 ? 0L : j5, (i12 & 2) != 0 ? 0L : j11, (i12 & 4) != 0 ? 0L : j12, (i12 & 8) != 0 ? -1L : j13, (i12 & 16) != 0 ? 0 : i11, (i12 & 32) != 0 ? "" : str, (i12 & 64) != 0 ? null : l5, (i12 & 128) == 0 ? l6 : null, (i12 & 256) != 0 ? 0L : j14, (i12 & 512) == 0 ? z5 : false);
    }
}
