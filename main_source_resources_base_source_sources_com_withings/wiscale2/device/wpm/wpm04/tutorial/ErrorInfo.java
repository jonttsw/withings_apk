package com.withings.wiscale2.device.wpm.wpm04.tutorial;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.h;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import og.y;
/* compiled from: Wpm04TutorialErrorInfoProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm04/tutorial/ErrorInfo;", "Landroid/os/Parcelable;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ErrorInfo implements Parcelable {
    public static final Parcelable.Creator<ErrorInfo> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f55818a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55819b;

    /* renamed from: c  reason: collision with root package name */
    private final int f55820c;

    /* renamed from: d  reason: collision with root package name */
    private final int f55821d;

    /* renamed from: e  reason: collision with root package name */
    private final int f55822e;

    /* renamed from: f  reason: collision with root package name */
    private final Integer f55823f;

    /* compiled from: Wpm04TutorialErrorInfoProvider.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<ErrorInfo> {
        @Override // android.os.Parcelable.Creator
        public final ErrorInfo createFromParcel(Parcel parcel) {
            boolean z5;
            Integer valueOf;
            u.j(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z11 = z5;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            return new ErrorInfo(readInt, readInt2, readInt3, readInt4, valueOf, z11);
        }

        @Override // android.os.Parcelable.Creator
        public final ErrorInfo[] newArray(int i11) {
            return new ErrorInfo[i11];
        }
    }

    public ErrorInfo(int i11, int i12, int i13, int i14, Integer num, boolean z5) {
        this.f55818a = z5;
        this.f55819b = i11;
        this.f55820c = i12;
        this.f55821d = i13;
        this.f55822e = i14;
        this.f55823f = num;
    }

    public static ErrorInfo a(ErrorInfo errorInfo) {
        return new ErrorInfo(errorInfo.f55819b, errorInfo.f55820c, errorInfo.f55821d, errorInfo.f55822e, errorInfo.f55823f, false);
    }

    public final Integer b() {
        return this.f55823f;
    }

    public final int c() {
        return this.f55820c;
    }

    public final int d() {
        return this.f55821d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f55822e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorInfo)) {
            return false;
        }
        ErrorInfo errorInfo = (ErrorInfo) obj;
        if (this.f55818a == errorInfo.f55818a && this.f55819b == errorInfo.f55819b && this.f55820c == errorInfo.f55820c && this.f55821d == errorInfo.f55821d && this.f55822e == errorInfo.f55822e && u.e(this.f55823f, errorInfo.f55823f)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f55819b;
    }

    public final boolean g() {
        return this.f55818a;
    }

    public final int hashCode() {
        int hashCode;
        int a11 = h.a(this.f55822e, h.a(this.f55821d, h.a(this.f55820c, h.a(this.f55819b, Boolean.hashCode(this.f55818a) * 31, 31), 31), 31), 31);
        Integer num = this.f55823f;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return a11 + hashCode;
    }

    public final String toString() {
        return "ErrorInfo(isMinor=" + this.f55818a + ", titleRes=" + this.f55819b + ", descRes=" + this.f55820c + ", imageRes=" + this.f55821d + ", mainButtonRes=" + this.f55822e + ", cancelButtonRes=" + this.f55823f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeInt(this.f55818a ? 1 : 0);
        out.writeInt(this.f55819b);
        out.writeInt(this.f55820c);
        out.writeInt(this.f55821d);
        out.writeInt(this.f55822e);
        Integer num = this.f55823f;
        if (num == null) {
            out.writeInt(0);
        } else {
            y.b(out, 1, num);
        }
    }

    public /* synthetic */ ErrorInfo(boolean z5, int i11, int i12, int i13, Integer num, int i14) {
        this(i11, i12, 2131232398, i13, (i14 & 32) != 0 ? null : num, z5);
    }
}
