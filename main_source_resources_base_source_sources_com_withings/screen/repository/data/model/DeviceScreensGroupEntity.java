package com.withings.screen.repository.data.model;

import androidx.activity.result.c;
import androidx.camera.core.y1;
import com.google.android.gms.internal.mlkit_common.a;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: DeviceScreensGroupEntity.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006#"}, d2 = {"Lcom/withings/screen/repository/data/model/DeviceScreensGroupEntity;", "", "id", "", "name", "", "modified", "Lorg/joda/time/DateTime;", "deviceId", "deleted", "", "rank", "(JLjava/lang/String;Lorg/joda/time/DateTime;JZJ)V", "getDeleted", "()Z", "getDeviceId", "()J", "getId", "getModified", "()Lorg/joda/time/DateTime;", "getName", "()Ljava/lang/String;", "getRank", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceScreensGroupEntity {
    private final boolean deleted;
    private final long deviceId;

    /* renamed from: id  reason: collision with root package name */
    private final long f43966id;
    private final DateTime modified;
    private final String name;
    private final long rank;

    public DeviceScreensGroupEntity(long j5, String name, DateTime modified, long j11, boolean z5, long j12) {
        u.j(name, "name");
        u.j(modified, "modified");
        this.f43966id = j5;
        this.name = name;
        this.modified = modified;
        this.deviceId = j11;
        this.deleted = z5;
        this.rank = j12;
    }

    public static /* synthetic */ DeviceScreensGroupEntity copy$default(DeviceScreensGroupEntity deviceScreensGroupEntity, long j5, String str, DateTime dateTime, long j11, boolean z5, long j12, int i11, Object obj) {
        long j13;
        String str2;
        DateTime dateTime2;
        long j14;
        boolean z11;
        long j15;
        if ((i11 & 1) != 0) {
            j13 = deviceScreensGroupEntity.f43966id;
        } else {
            j13 = j5;
        }
        if ((i11 & 2) != 0) {
            str2 = deviceScreensGroupEntity.name;
        } else {
            str2 = str;
        }
        if ((i11 & 4) != 0) {
            dateTime2 = deviceScreensGroupEntity.modified;
        } else {
            dateTime2 = dateTime;
        }
        if ((i11 & 8) != 0) {
            j14 = deviceScreensGroupEntity.deviceId;
        } else {
            j14 = j11;
        }
        if ((i11 & 16) != 0) {
            z11 = deviceScreensGroupEntity.deleted;
        } else {
            z11 = z5;
        }
        if ((i11 & 32) != 0) {
            j15 = deviceScreensGroupEntity.rank;
        } else {
            j15 = j12;
        }
        return deviceScreensGroupEntity.copy(j13, str2, dateTime2, j14, z11, j15);
    }

    public final long component1() {
        return this.f43966id;
    }

    public final String component2() {
        return this.name;
    }

    public final DateTime component3() {
        return this.modified;
    }

    public final long component4() {
        return this.deviceId;
    }

    public final boolean component5() {
        return this.deleted;
    }

    public final long component6() {
        return this.rank;
    }

    public final DeviceScreensGroupEntity copy(long j5, String name, DateTime modified, long j11, boolean z5, long j12) {
        u.j(name, "name");
        u.j(modified, "modified");
        return new DeviceScreensGroupEntity(j5, name, modified, j11, z5, j12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceScreensGroupEntity)) {
            return false;
        }
        DeviceScreensGroupEntity deviceScreensGroupEntity = (DeviceScreensGroupEntity) obj;
        if (this.f43966id == deviceScreensGroupEntity.f43966id && u.e(this.name, deviceScreensGroupEntity.name) && u.e(this.modified, deviceScreensGroupEntity.modified) && this.deviceId == deviceScreensGroupEntity.deviceId && this.deleted == deviceScreensGroupEntity.deleted && this.rank == deviceScreensGroupEntity.rank) {
            return true;
        }
        return false;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final long getDeviceId() {
        return this.deviceId;
    }

    public final long getId() {
        return this.f43966id;
    }

    public final DateTime getModified() {
        return this.modified;
    }

    public final String getName() {
        return this.name;
    }

    public final long getRank() {
        return this.rank;
    }

    public int hashCode() {
        return Long.hashCode(this.rank) + y1.a(this.deleted, c.a(this.deviceId, a.b(this.modified, d.c(this.name, Long.hashCode(this.f43966id) * 31, 31), 31), 31), 31);
    }

    public String toString() {
        long j5 = this.f43966id;
        String str = this.name;
        DateTime dateTime = this.modified;
        long j11 = this.deviceId;
        boolean z5 = this.deleted;
        long j12 = this.rank;
        return "DeviceScreensGroupEntity(id=" + j5 + ", name=" + str + ", modified=" + dateTime + ", deviceId=" + j11 + ", deleted=" + z5 + ", rank=" + j12 + ")";
    }
}
