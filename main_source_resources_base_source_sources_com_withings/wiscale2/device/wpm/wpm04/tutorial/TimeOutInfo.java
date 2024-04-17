package com.withings.wiscale2.device.wpm.wpm04.tutorial;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.c;
import androidx.appcompat.app.h;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: Wpm04TutorialScreensProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm04/tutorial/TimeOutInfo;", "Landroid/os/Parcelable;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TimeOutInfo implements Parcelable {
    public static final Parcelable.Creator<TimeOutInfo> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final int f55824a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55825b;

    /* renamed from: c  reason: collision with root package name */
    private final long f55826c;

    /* compiled from: Wpm04TutorialScreensProvider.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<TimeOutInfo> {
        @Override // android.os.Parcelable.Creator
        public final TimeOutInfo createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new TimeOutInfo(parcel.readInt(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final TimeOutInfo[] newArray(int i11) {
            return new TimeOutInfo[i11];
        }
    }

    public TimeOutInfo(int i11, int i12, long j5) {
        this.f55824a = i11;
        this.f55825b = i12;
        this.f55826c = j5;
    }

    public final int a() {
        return this.f55824a;
    }

    public final long b() {
        return this.f55826c;
    }

    public final int c() {
        return this.f55825b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeOutInfo)) {
            return false;
        }
        TimeOutInfo timeOutInfo = (TimeOutInfo) obj;
        if (this.f55824a == timeOutInfo.f55824a && this.f55825b == timeOutInfo.f55825b && this.f55826c == timeOutInfo.f55826c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f55826c) + h.a(this.f55825b, Integer.hashCode(this.f55824a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimeOutInfo(buttonRes=");
        sb2.append(this.f55824a);
        sb2.append(", urlRes=");
        sb2.append(this.f55825b);
        sb2.append(", timeOutValueMillis=");
        return c.c(sb2, this.f55826c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeInt(this.f55824a);
        out.writeInt(this.f55825b);
        out.writeLong(this.f55826c);
    }
}
