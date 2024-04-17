package com.withings.screen.model;

import com.google.android.gms.internal.mlkit_common.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: DeviceScreensGroup.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/withings/screen/model/DeviceScreensGroup;", "", "id", "", "name", "", "screens", "", "Lcom/withings/screen/model/DeviceScreen;", "modified", "Lorg/joda/time/DateTime;", "rank", "(JLjava/lang/String;Ljava/util/List;Lorg/joda/time/DateTime;J)V", "getId", "()J", "getModified", "()Lorg/joda/time/DateTime;", "getName", "()Ljava/lang/String;", "getRank", "getScreens", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceScreensGroup {

    /* renamed from: id  reason: collision with root package name */
    private final long f43962id;
    private final DateTime modified;
    private final String name;
    private final long rank;
    private final List<DeviceScreen> screens;

    public DeviceScreensGroup(long j5, String str, List<DeviceScreen> screens, DateTime modified, long j11) {
        u.j(screens, "screens");
        u.j(modified, "modified");
        this.f43962id = j5;
        this.name = str;
        this.screens = screens;
        this.modified = modified;
        this.rank = j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceScreensGroup copy$default(DeviceScreensGroup deviceScreensGroup, long j5, String str, List list, DateTime dateTime, long j11, int i11, Object obj) {
        long j12;
        String str2;
        List<DeviceScreen> list2;
        DateTime dateTime2;
        long j13;
        if ((i11 & 1) != 0) {
            j12 = deviceScreensGroup.f43962id;
        } else {
            j12 = j5;
        }
        if ((i11 & 2) != 0) {
            str2 = deviceScreensGroup.name;
        } else {
            str2 = str;
        }
        if ((i11 & 4) != 0) {
            list2 = deviceScreensGroup.screens;
        } else {
            list2 = list;
        }
        if ((i11 & 8) != 0) {
            dateTime2 = deviceScreensGroup.modified;
        } else {
            dateTime2 = dateTime;
        }
        if ((i11 & 16) != 0) {
            j13 = deviceScreensGroup.rank;
        } else {
            j13 = j11;
        }
        return deviceScreensGroup.copy(j12, str2, list2, dateTime2, j13);
    }

    public final long component1() {
        return this.f43962id;
    }

    public final String component2() {
        return this.name;
    }

    public final List<DeviceScreen> component3() {
        return this.screens;
    }

    public final DateTime component4() {
        return this.modified;
    }

    public final long component5() {
        return this.rank;
    }

    public final DeviceScreensGroup copy(long j5, String str, List<DeviceScreen> screens, DateTime modified, long j11) {
        u.j(screens, "screens");
        u.j(modified, "modified");
        return new DeviceScreensGroup(j5, str, screens, modified, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceScreensGroup)) {
            return false;
        }
        DeviceScreensGroup deviceScreensGroup = (DeviceScreensGroup) obj;
        if (this.f43962id == deviceScreensGroup.f43962id && u.e(this.name, deviceScreensGroup.name) && u.e(this.screens, deviceScreensGroup.screens) && u.e(this.modified, deviceScreensGroup.modified) && this.rank == deviceScreensGroup.rank) {
            return true;
        }
        return false;
    }

    public final long getId() {
        return this.f43962id;
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

    public final List<DeviceScreen> getScreens() {
        return this.screens;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.f43962id) * 31;
        String str = this.name;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Long.hashCode(this.rank) + a.b(this.modified, e.b(this.screens, (hashCode2 + hashCode) * 31, 31), 31);
    }

    public String toString() {
        long j5 = this.f43962id;
        String str = this.name;
        List<DeviceScreen> list = this.screens;
        DateTime dateTime = this.modified;
        long j11 = this.rank;
        return "DeviceScreensGroup(id=" + j5 + ", name=" + str + ", screens=" + list + ", modified=" + dateTime + ", rank=" + j11 + ")";
    }
}
