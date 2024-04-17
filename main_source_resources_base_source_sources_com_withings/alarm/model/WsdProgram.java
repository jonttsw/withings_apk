package com.withings.alarm.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* loaded from: classes3.dex */
public class WsdProgram extends WsdProgramElement implements Parcelable {
    public static final Parcelable.Creator<WsdProgram> CREATOR = new Object();

    /* renamed from: c  reason: collision with root package name */
    private short f31077c;

    /* renamed from: d  reason: collision with root package name */
    public short f31078d;

    /* renamed from: e  reason: collision with root package name */
    private short f31079e;

    /* renamed from: f  reason: collision with root package name */
    private short f31080f;

    /* renamed from: g  reason: collision with root package name */
    private String f31081g;

    /* renamed from: h  reason: collision with root package name */
    private String f31082h;

    /* renamed from: i  reason: collision with root package name */
    private String f31083i;

    /* renamed from: j  reason: collision with root package name */
    private String f31084j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f31085k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f31086l;

    /* renamed from: m  reason: collision with root package name */
    private short f31087m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f31088n;

    /* loaded from: classes3.dex */
    final class a implements Parcelable.Creator<WsdProgram> {
        @Override // android.os.Parcelable.Creator
        public final WsdProgram createFromParcel(Parcel parcel) {
            return new WsdProgram(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WsdProgram[] newArray(int i11) {
            return new WsdProgram[i11];
        }
    }

    public WsdProgram() {
        super(1);
    }

    public final void A(short s11) {
        this.f31087m = s11;
    }

    public final void B(boolean z5) {
        this.f31085k = z5;
    }

    public final void C(String str) {
        this.f31083i = str;
    }

    public final void D(String str) {
        this.f31082h = str;
    }

    public final void F(short s11) {
        this.f31079e = s11;
    }

    public final void G(String str) {
        this.f31081g = str;
    }

    public final void H(String str) {
        this.f31084j = str;
    }

    public final short c() {
        return this.f31080f;
    }

    public final short d() {
        return this.f31077c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e(Context context) {
        return context.getResources().getIdentifier(String.format("_WSD_PRG_%d_%d_", Short.valueOf(this.f31078d), Short.valueOf(this.f31077c)), "string", context.getPackageName());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsdProgram)) {
            return false;
        }
        WsdProgram wsdProgram = (WsdProgram) obj;
        if (this.f31077c == wsdProgram.f31077c && this.f31078d == wsdProgram.f31078d) {
            return true;
        }
        return false;
    }

    public final String f(Context context) {
        if (p()) {
            return this.f31084j;
        }
        if (o()) {
            return this.f31083i;
        }
        int e11 = e(context);
        if (e11 != 0) {
            return context.getString(e11);
        }
        return String.format("Program %d", Short.valueOf(this.f31077c));
    }

    public final short g() {
        return this.f31087m;
    }

    public final String h() {
        return this.f31083i;
    }

    public final int hashCode() {
        return (this.f31078d * 1000) + this.f31077c;
    }

    public final short i() {
        return this.f31079e;
    }

    public final String j() {
        return this.f31081g;
    }

    public final String k() {
        return this.f31084j;
    }

    public final boolean l() {
        return this.f31086l;
    }

    public final boolean o() {
        if (this.f31077c == 128 && !TextUtils.isEmpty(this.f31083i)) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if (this.f31077c == 129 && !TextUtils.isEmpty(this.f31081g)) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        return this.f31088n;
    }

    public final boolean r() {
        return this.f31085k;
    }

    public final boolean s() {
        if (this.f31077c >= 128) {
            return true;
        }
        return false;
    }

    public final void t(boolean z5) {
        this.f31086l = z5;
    }

    public final void u(short s11) {
        this.f31080f = s11;
    }

    public final void v(short s11) {
        this.f31077c = s11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f31078d);
        parcel.writeInt(this.f31077c);
        parcel.writeInt(this.f31078d);
        parcel.writeInt(this.f31079e);
        parcel.writeInt(this.f31080f);
        parcel.writeInt(this.f31085k ? 1 : 0);
        parcel.writeInt(this.f31086l ? 1 : 0);
        parcel.writeInt(this.f31087m);
        parcel.writeString(this.f31081g);
        parcel.writeString(this.f31082h);
        parcel.writeString(this.f31083i);
        parcel.writeString(this.f31084j);
    }

    public final void y(boolean z5) {
        this.f31088n = z5;
    }

    WsdProgram(Parcel parcel) {
        super(1);
        this.f31078d = (short) parcel.readInt();
        this.f31077c = (short) parcel.readInt();
        this.f31078d = (short) parcel.readInt();
        this.f31079e = (short) parcel.readInt();
        this.f31080f = (short) parcel.readInt();
        this.f31085k = parcel.readInt() == 1;
        this.f31086l = parcel.readInt() == 1;
        this.f31087m = (short) parcel.readInt();
        this.f31081g = parcel.readString();
        this.f31082h = parcel.readString();
        this.f31083i = parcel.readString();
        this.f31084j = parcel.readString();
    }
}
