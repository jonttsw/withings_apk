package com.withings.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.filament.utils.b;
import com.withings.webservices.legacy.withings.model.ImagesP4;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
@Deprecated
/* loaded from: classes4.dex */
public class User implements Parcelable, Cloneable {
    public static final Parcelable.Creator<User> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private long f46320a;

    /* renamed from: b  reason: collision with root package name */
    private int f46321b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f46322c;

    /* renamed from: d  reason: collision with root package name */
    private DateTime f46323d;

    /* renamed from: e  reason: collision with root package name */
    private String f46324e;

    /* renamed from: f  reason: collision with root package name */
    private String f46325f;

    /* renamed from: g  reason: collision with root package name */
    private String f46326g;

    /* renamed from: h  reason: collision with root package name */
    private int f46327h;

    /* renamed from: i  reason: collision with root package name */
    private String f46328i;

    /* renamed from: j  reason: collision with root package name */
    private String f46329j;

    /* renamed from: k  reason: collision with root package name */
    private DateTime f46330k;

    /* renamed from: l  reason: collision with root package name */
    private int f46331l;

    /* renamed from: m  reason: collision with root package name */
    private String f46332m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f46333n;

    /* renamed from: o  reason: collision with root package name */
    private String f46334o;

    /* renamed from: p  reason: collision with root package name */
    private ImagesP4 f46335p;

    /* renamed from: q  reason: collision with root package name */
    private DateTime f46336q;

    /* renamed from: r  reason: collision with root package name */
    private DateTime f46337r;

    /* renamed from: s  reason: collision with root package name */
    private Integer f46338s;

    /* loaded from: classes4.dex */
    final class a implements Parcelable.Creator<User> {
        @Override // android.os.Parcelable.Creator
        public final User createFromParcel(Parcel parcel) {
            return new User(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final User[] newArray(int i11) {
            return new User[i11];
        }
    }

    public User() {
        this.f46321b = 1;
        this.f46322c = false;
        this.f46335p = new ImagesP4();
        this.f46336q = new DateTime();
        this.f46320a = -1L;
        this.f46323d = new DateTime(0L);
        this.f46327h = -1;
        this.f46331l = 3;
    }

    public final int A() {
        return this.f46321b;
    }

    public final String B() {
        return this.f46334o;
    }

    public final boolean C() {
        if ((this.f46331l & 128) == 128) {
            return true;
        }
        return false;
    }

    public final boolean D() {
        return this.f46322c;
    }

    public final void D0(String str) {
        this.f46329j = str;
    }

    public final boolean F() {
        return this.f46333n;
    }

    public final void G(String str) {
        this.f46328i = str;
    }

    public final void H(DateTime dateTime) {
        this.f46330k = dateTime;
    }

    public final void H0(boolean z5) {
        this.f46322c = z5;
    }

    public final void I(Integer num) {
        this.f46338s = num;
    }

    public final void K(DateTime dateTime) {
        this.f46336q = dateTime;
    }

    public final void L0(String str) {
        this.f46326g = str;
    }

    public final void M0(int i11) {
        this.f46321b = i11;
    }

    public final void O0(boolean z5) {
        this.f46333n = z5;
    }

    public final void Q(String str) {
        this.f46332m = str;
    }

    public final void Q0(String str) {
        this.f46334o = str;
    }

    public final void W(boolean z5) {
        int i11;
        int j5 = j();
        if (z5) {
            i11 = 128;
        } else {
            i11 = 0;
        }
        this.f46331l = j5 + i11;
    }

    public final void X(int i11) {
        this.f46331l = (i11 & 7) | (this.f46331l & (-8));
    }

    public final void Y(int i11) {
        this.f46331l = i11;
    }

    public final String a() {
        String str;
        List<String> allNonNullUrls = this.f46335p.getAllNonNullUrls();
        if (allNonNullUrls.size() > 0) {
            str = allNonNullUrls.get(0);
        } else {
            str = null;
        }
        if (str != null) {
            StringBuilder b10 = b.b(str, "?modified=");
            b10.append(u().getMillis());
            return b10.toString();
        }
        return str;
    }

    public final void a0(String str) {
        this.f46324e = str;
    }

    /* renamed from: b */
    public final User clone() {
        DateTime dateTime;
        User user = new User();
        user.f46320a = this.f46320a;
        user.f46321b = this.f46321b;
        user.f46322c = this.f46322c;
        user.f46323d = this.f46323d;
        user.f46324e = this.f46324e;
        user.f46325f = this.f46325f;
        user.f46326g = this.f46326g;
        user.f46327h = this.f46327h;
        user.f46328i = this.f46328i;
        user.f46329j = this.f46329j;
        user.f46330k = this.f46330k;
        user.f46331l = this.f46331l;
        user.f46332m = this.f46332m;
        user.f46333n = this.f46333n;
        user.f46334o = this.f46334o;
        user.f46335p = this.f46335p;
        DateTime dateTime2 = this.f46336q;
        DateTime dateTime3 = null;
        if (dateTime2 != null) {
            dateTime = new DateTime(dateTime2);
        } else {
            dateTime = null;
        }
        user.f46336q = dateTime;
        DateTime dateTime4 = this.f46337r;
        if (dateTime4 != null) {
            dateTime3 = new DateTime(dateTime4);
        }
        user.f46337r = dateTime3;
        user.f46338s = this.f46338s;
        return user;
    }

    public final String c() {
        return this.f46328i;
    }

    public final void c0(int i11) {
        this.f46327h = i11;
    }

    public final int d() {
        return (int) e(DateTime.now());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Deprecated
    public final double e(DateTime dateTime) {
        return ((float) (dateTime.getMillis() - this.f46330k.getMillis())) / 3.15575992E10f;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof User) && this.f46320a == ((User) obj).f46320a) {
            return true;
        }
        return false;
    }

    public final DateTime f() {
        return this.f46330k.withZone(DateTimeZone.UTC);
    }

    public final void f0(long j5) {
        this.f46320a = j5;
    }

    public final Integer g() {
        return this.f46338s;
    }

    public final DateTime h() {
        return this.f46336q;
    }

    public final int hashCode() {
        return (int) this.f46320a;
    }

    public final String i() {
        return this.f46332m;
    }

    public final int j() {
        return this.f46331l & 7;
    }

    public final int k() {
        return this.f46331l;
    }

    public final String l() {
        return this.f46324e;
    }

    public final void l0(ImagesP4 imagesP4) {
        if (imagesP4 == null) {
            imagesP4 = new ImagesP4();
        }
        this.f46335p = imagesP4;
    }

    public final String o() {
        String str = this.f46324e;
        String str2 = this.f46325f;
        return (str + " " + str2).trim();
    }

    public final int p() {
        return this.f46327h;
    }

    public final void p0(String str) {
        this.f46325f = str;
    }

    public final long q() {
        return this.f46320a;
    }

    public final ImagesP4 r() {
        return this.f46335p;
    }

    public final String s() {
        return this.f46325f;
    }

    public final DateTime t() {
        return this.f46323d;
    }

    public final String toString() {
        return this.f46324e;
    }

    public final DateTime u() {
        DateTime dateTime = this.f46337r;
        if (dateTime == null) {
            return this.f46336q;
        }
        return dateTime;
    }

    public final void u0(DateTime dateTime) {
        this.f46323d = dateTime;
    }

    public final String v() {
        return this.f46329j;
    }

    public final void w0(DateTime dateTime) {
        this.f46337r = dateTime;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f46320a);
        parcel.writeInt(this.f46321b);
        parcel.writeByte(this.f46322c ? (byte) 1 : (byte) 0);
        if (this.f46323d == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.f46323d.getMillis());
        }
        parcel.writeString(this.f46324e);
        parcel.writeString(this.f46325f);
        parcel.writeString(this.f46326g);
        parcel.writeInt(this.f46327h);
        parcel.writeString(this.f46328i);
        parcel.writeString(this.f46329j);
        if (this.f46330k == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.f46330k.getMillis());
        }
        parcel.writeInt(this.f46331l);
        parcel.writeString(this.f46332m);
        parcel.writeByte(this.f46333n ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f46335p, i11);
        if (this.f46336q == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.f46336q.getMillis());
        }
        if (this.f46337r == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.f46337r.getMillis());
        }
        parcel.writeString(this.f46334o);
        if (this.f46338s == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeInt(this.f46338s.intValue());
    }

    public final String y() {
        return this.f46326g;
    }

    protected User(Parcel parcel) {
        this.f46321b = 1;
        this.f46322c = false;
        this.f46335p = new ImagesP4();
        this.f46336q = new DateTime();
        this.f46320a = parcel.readLong();
        this.f46321b = parcel.readInt();
        this.f46322c = parcel.readByte() != 0;
        this.f46323d = parcel.readByte() == 0 ? null : new DateTime(parcel.readLong());
        this.f46324e = parcel.readString();
        this.f46325f = parcel.readString();
        this.f46326g = parcel.readString();
        this.f46327h = parcel.readInt();
        this.f46328i = parcel.readString();
        this.f46329j = parcel.readString();
        this.f46330k = parcel.readByte() == 0 ? null : new DateTime(parcel.readLong());
        this.f46331l = parcel.readInt();
        this.f46332m = parcel.readString();
        this.f46333n = parcel.readByte() != 0;
        this.f46335p = (ImagesP4) parcel.readParcelable(ImagesP4.class.getClassLoader());
        this.f46336q = parcel.readByte() == 0 ? null : new DateTime(parcel.readLong());
        this.f46337r = parcel.readByte() == 0 ? null : new DateTime(parcel.readLong());
        this.f46334o = parcel.readString();
        this.f46338s = parcel.readByte() != 0 ? Integer.valueOf(parcel.readInt()) : null;
    }
}
