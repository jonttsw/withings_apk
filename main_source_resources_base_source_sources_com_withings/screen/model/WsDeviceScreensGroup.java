package com.withings.screen.model;

import androidx.activity.result.c;
import androidx.work.impl.g;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsModels.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/withings/screen/model/WsDeviceScreensGroup;", "", "id", "", "name", "", "rank", "modified", "deleted", "", "(JLjava/lang/String;JJZ)V", "getDeleted", "()Z", "getId", "()J", "getModified", "getName", "()Ljava/lang/String;", "getRank", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsDeviceScreensGroup {
    private final boolean deleted;

    /* renamed from: id  reason: collision with root package name */
    private final long f43963id;
    private final long modified;
    private final String name;
    private final long rank;

    public WsDeviceScreensGroup(long j5, String name, long j11, long j12, boolean z5) {
        u.j(name, "name");
        this.f43963id = j5;
        this.name = name;
        this.rank = j11;
        this.modified = j12;
        this.deleted = z5;
    }

    public static /* synthetic */ WsDeviceScreensGroup copy$default(WsDeviceScreensGroup wsDeviceScreensGroup, long j5, String str, long j11, long j12, boolean z5, int i11, Object obj) {
        long j13;
        String str2;
        long j14;
        long j15;
        boolean z11;
        if ((i11 & 1) != 0) {
            j13 = wsDeviceScreensGroup.f43963id;
        } else {
            j13 = j5;
        }
        if ((i11 & 2) != 0) {
            str2 = wsDeviceScreensGroup.name;
        } else {
            str2 = str;
        }
        if ((i11 & 4) != 0) {
            j14 = wsDeviceScreensGroup.rank;
        } else {
            j14 = j11;
        }
        if ((i11 & 8) != 0) {
            j15 = wsDeviceScreensGroup.modified;
        } else {
            j15 = j12;
        }
        if ((i11 & 16) != 0) {
            z11 = wsDeviceScreensGroup.deleted;
        } else {
            z11 = z5;
        }
        return wsDeviceScreensGroup.copy(j13, str2, j14, j15, z11);
    }

    public final long component1() {
        return this.f43963id;
    }

    public final String component2() {
        return this.name;
    }

    public final long component3() {
        return this.rank;
    }

    public final long component4() {
        return this.modified;
    }

    public final boolean component5() {
        return this.deleted;
    }

    public final WsDeviceScreensGroup copy(long j5, String name, long j11, long j12, boolean z5) {
        u.j(name, "name");
        return new WsDeviceScreensGroup(j5, name, j11, j12, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsDeviceScreensGroup)) {
            return false;
        }
        WsDeviceScreensGroup wsDeviceScreensGroup = (WsDeviceScreensGroup) obj;
        if (this.f43963id == wsDeviceScreensGroup.f43963id && u.e(this.name, wsDeviceScreensGroup.name) && this.rank == wsDeviceScreensGroup.rank && this.modified == wsDeviceScreensGroup.modified && this.deleted == wsDeviceScreensGroup.deleted) {
            return true;
        }
        return false;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final long getId() {
        return this.f43963id;
    }

    public final long getModified() {
        return this.modified;
    }

    public final String getName() {
        return this.name;
    }

    public final long getRank() {
        return this.rank;
    }

    public int hashCode() {
        return Boolean.hashCode(this.deleted) + c.a(this.modified, c.a(this.rank, d.c(this.name, Long.hashCode(this.f43963id) * 31, 31), 31), 31);
    }

    public String toString() {
        long j5 = this.f43963id;
        String str = this.name;
        long j11 = this.rank;
        long j12 = this.modified;
        boolean z5 = this.deleted;
        StringBuilder sb2 = new StringBuilder("WsDeviceScreensGroup(id=");
        sb2.append(j5);
        sb2.append(", name=");
        sb2.append(str);
        g.d(sb2, ", rank=", j11, ", modified=");
        sb2.append(j12);
        sb2.append(", deleted=");
        sb2.append(z5);
        sb2.append(")");
        return sb2.toString();
    }
}
