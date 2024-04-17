package com.withings.library.timeline.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import org.joda.time.DateTime;
/* loaded from: classes4.dex */
public class TimelineItem<D> implements Parcelable, Serializable {
    public static final Parcelable.Creator<TimelineItem> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private long f40642a;

    /* renamed from: b  reason: collision with root package name */
    private String f40643b;

    /* renamed from: c  reason: collision with root package name */
    private DateTime f40644c;

    /* renamed from: d  reason: collision with root package name */
    private String f40645d;

    /* renamed from: e  reason: collision with root package name */
    private D f40646e;

    /* renamed from: f  reason: collision with root package name */
    private DateTime f40647f;

    /* renamed from: g  reason: collision with root package name */
    private String[] f40648g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f40649h;

    /* renamed from: i  reason: collision with root package name */
    private long f40650i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f40651j;

    /* renamed from: k  reason: collision with root package name */
    private Long f40652k;

    /* loaded from: classes4.dex */
    final class a implements Parcelable.Creator<TimelineItem> {
        @Override // android.os.Parcelable.Creator
        public final TimelineItem createFromParcel(Parcel parcel) {
            return new TimelineItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TimelineItem[] newArray(int i11) {
            return new TimelineItem[i11];
        }
    }

    public TimelineItem(String str, String str2, DateTime dateTime) {
        this.f40642a = -1L;
        this.f40645d = str;
        this.f40643b = str2;
        this.f40644c = dateTime;
    }

    public final String a() {
        return this.f40643b;
    }

    public final D b() {
        return this.f40646e;
    }

    public final DateTime c() {
        return new DateTime(this.f40644c);
    }

    public final DateTime d() {
        return this.f40647f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long e() {
        return this.f40642a;
    }

    public final String[] f() {
        String[] strArr = this.f40648g;
        if (strArr != null) {
            return strArr;
        }
        return new String[0];
    }

    public final DateTime g() {
        return this.f40644c;
    }

    public final long h() {
        return this.f40650i;
    }

    public final String i() {
        return this.f40645d;
    }

    public final Long j() {
        return this.f40652k;
    }

    public final boolean k() {
        return this.f40649h;
    }

    public final boolean l() {
        return this.f40651j;
    }

    public final void o() {
        this.f40649h = true;
    }

    public final void q(D d11) {
        this.f40646e = d11;
    }

    public final void r(DateTime dateTime) {
        this.f40647f = dateTime;
    }

    public final void s(long j5) {
        this.f40642a = j5;
    }

    public final void t(boolean z5) {
        this.f40651j = z5;
    }

    public final void u(String[] strArr) {
        this.f40648g = strArr;
    }

    public final void v(long j5) {
        this.f40650i = j5;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        long millis;
        int i12;
        parcel.writeLong(this.f40642a);
        DateTime dateTime = this.f40644c;
        parcel.writeLong(dateTime.getMillis());
        parcel.writeString(this.f40643b);
        parcel.writeString(this.f40645d);
        parcel.writeSerializable((Serializable) this.f40646e);
        parcel.writeLong(this.f40650i);
        DateTime dateTime2 = this.f40647f;
        if (dateTime2 == null) {
            millis = dateTime.getMillis() + this.f40650i;
        } else {
            millis = dateTime2.getMillis();
        }
        parcel.writeLong(millis);
        int length = f().length;
        parcel.writeInt(length);
        if (length > 0) {
            parcel.writeStringArray(f());
        }
        parcel.writeInt(this.f40649h ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f40651j ? 1 : 0);
        if (this.f40652k != null) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        parcel.writeInt(i12);
        Long l5 = this.f40652k;
        if (l5 != null) {
            parcel.writeLong(l5.longValue());
        }
    }

    public final void y(Long l5) {
        this.f40652k = l5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TimelineItem(Parcel parcel) {
        this.f40642a = -1L;
        this.f40642a = parcel.readLong();
        DateTime dateTime = new DateTime(parcel.readLong());
        this.f40644c = dateTime;
        this.f40643b = parcel.readString();
        this.f40645d = parcel.readString();
        this.f40646e = (D) parcel.readSerializable();
        this.f40650i = parcel.readLong();
        this.f40647f = new DateTime(parcel.readLong() > 0 ? parcel.readLong() : dateTime.getMillis() + this.f40650i);
        int readInt = parcel.readInt();
        if (readInt > 0) {
            String[] strArr = new String[readInt];
            this.f40648g = strArr;
            parcel.readStringArray(strArr);
        } else {
            this.f40648g = new String[0];
        }
        this.f40649h = parcel.readInt() == 1;
        this.f40651j = parcel.readInt() == 1;
        if (parcel.readInt() == 1) {
            this.f40652k = Long.valueOf(parcel.readLong());
        }
    }
}
