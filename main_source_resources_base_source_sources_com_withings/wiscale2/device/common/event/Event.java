package com.withings.wiscale2.device.common.event;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.c;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: EventDao.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/event/Event;", "Landroid/os/Parcelable;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Event implements Parcelable {
    public static final Parcelable.Creator<Event> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private Long f50857a;

    /* renamed from: b  reason: collision with root package name */
    private String f50858b;

    /* renamed from: c  reason: collision with root package name */
    private long f50859c;

    /* renamed from: d  reason: collision with root package name */
    private String f50860d;

    /* renamed from: e  reason: collision with root package name */
    private Long f50861e;

    /* renamed from: f  reason: collision with root package name */
    private long f50862f;

    /* compiled from: EventDao.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Event> {
        @Override // android.os.Parcelable.Creator
        public final Event createFromParcel(Parcel parcel) {
            Long valueOf;
            Long valueOf2;
            u.j(parcel, "parcel");
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(parcel.readLong());
            }
            String readString = parcel.readString();
            long readLong = parcel.readLong();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf(parcel.readLong());
            }
            return new Event(valueOf, readString, readLong, readString2, valueOf2, parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Event[] newArray(int i11) {
            return new Event[i11];
        }
    }

    public Event(Long l5, String type, long j5, String data, Long l6, long j11) {
        u.j(type, "type");
        u.j(data, "data");
        this.f50857a = l5;
        this.f50858b = type;
        this.f50859c = j5;
        this.f50860d = data;
        this.f50861e = l6;
        this.f50862f = j11;
    }

    public final String a() {
        return this.f50860d;
    }

    public final long b() {
        return this.f50862f;
    }

    public final long c() {
        return this.f50859c;
    }

    public final Long d() {
        return this.f50857a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f50858b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        if (u.e(this.f50857a, event.f50857a) && u.e(this.f50858b, event.f50858b) && this.f50859c == event.f50859c && u.e(this.f50860d, event.f50860d) && u.e(this.f50861e, event.f50861e) && this.f50862f == event.f50862f) {
            return true;
        }
        return false;
    }

    public final Long f() {
        return this.f50861e;
    }

    public final int hashCode() {
        int hashCode;
        int i11 = 0;
        Long l5 = this.f50857a;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int c11 = d.c(this.f50860d, c.a(this.f50859c, d.c(this.f50858b, hashCode * 31, 31), 31), 31);
        Long l6 = this.f50861e;
        if (l6 != null) {
            i11 = l6.hashCode();
        }
        return Long.hashCode(this.f50862f) + ((c11 + i11) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Event(id=");
        sb2.append(this.f50857a);
        sb2.append(", type=");
        sb2.append(this.f50858b);
        sb2.append(", epoch=");
        sb2.append(this.f50859c);
        sb2.append(", data=");
        sb2.append(this.f50860d);
        sb2.append(", userId=");
        sb2.append(this.f50861e);
        sb2.append(", deviceId=");
        return android.support.v4.media.session.c.c(sb2, this.f50862f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        Long l5 = this.f50857a;
        if (l5 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l5.longValue());
        }
        out.writeString(this.f50858b);
        out.writeLong(this.f50859c);
        out.writeString(this.f50860d);
        Long l6 = this.f50861e;
        if (l6 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l6.longValue());
        }
        out.writeLong(this.f50862f);
    }
}
