package com.withings.alarm.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateFormat;
import android.widget.TextView;
import com.withings.wiscale2.C1987R;
import org.joda.time.DateTime;
/* loaded from: classes3.dex */
public class DeviceAlarm implements Parcelable {
    public static final Parcelable.Creator<DeviceAlarm> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private Long f31055a;

    /* renamed from: b  reason: collision with root package name */
    private int f31056b;

    /* renamed from: c  reason: collision with root package name */
    private int f31057c;

    /* renamed from: d  reason: collision with root package name */
    private short f31058d;

    /* renamed from: e  reason: collision with root package name */
    private long f31059e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f31060f;

    /* renamed from: g  reason: collision with root package name */
    private int f31061g;

    /* renamed from: h  reason: collision with root package name */
    private short f31062h;

    /* renamed from: i  reason: collision with root package name */
    private short f31063i;

    /* renamed from: j  reason: collision with root package name */
    private short f31064j;

    /* renamed from: k  reason: collision with root package name */
    private String f31065k;

    /* renamed from: l  reason: collision with root package name */
    private String f31066l;

    /* renamed from: m  reason: collision with root package name */
    private String f31067m;

    /* renamed from: n  reason: collision with root package name */
    private String f31068n;

    /* renamed from: o  reason: collision with root package name */
    public short f31069o;

    /* renamed from: p  reason: collision with root package name */
    public short f31070p;

    /* renamed from: q  reason: collision with root package name */
    public short f31071q;

    /* renamed from: r  reason: collision with root package name */
    private String f31072r;

    /* renamed from: s  reason: collision with root package name */
    private DateTime f31073s;

    /* renamed from: t  reason: collision with root package name */
    private DateTime f31074t;

    /* renamed from: u  reason: collision with root package name */
    private short f31075u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f31076v;

    /* loaded from: classes3.dex */
    final class a implements Parcelable.Creator<DeviceAlarm> {
        @Override // android.os.Parcelable.Creator
        public final DeviceAlarm createFromParcel(Parcel parcel) {
            return new DeviceAlarm(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DeviceAlarm[] newArray(int i11) {
            return new DeviceAlarm[i11];
        }
    }

    public DeviceAlarm() {
        this.f31058d = (short) 127;
        this.f31072r = "";
        this.f31075u = (short) -1;
        this.f31076v = false;
    }

    public final void A(long j5) {
        DateTime now = DateTime.now();
        this.f31056b = now.getHourOfDay();
        this.f31057c = Math.round(now.getMinuteOfHour() / 5) * 5;
        this.f31058d = (short) 255;
        this.f31059e = j5;
        this.f31060f = true;
        this.f31061g = 0;
        this.f31062h = (short) 1;
        this.f31063i = (short) 20;
        this.f31064j = (short) 20;
        this.f31075u = (short) -1;
        this.f31076v = false;
        this.f31072r = "";
        this.f31073s = null;
        this.f31074t = null;
    }

    public final boolean B() {
        return this.f31060f;
    }

    public final boolean C(int i11) {
        if (((1 << i11) & this.f31058d) != 0) {
            return true;
        }
        return false;
    }

    public final boolean D() {
        return this.f31076v;
    }

    public final void D0(DateTime dateTime) {
        this.f31073s = dateTime;
    }

    public final void F(TextView textView, TextView textView2) {
        String str;
        if (DateFormat.is24HourFormat(textView2.getContext())) {
            textView2.setVisibility(8);
            textView.setText(String.format("%02d:%02d", Integer.valueOf(this.f31056b), Integer.valueOf(this.f31057c)));
            return;
        }
        textView2.setVisibility(0);
        int i11 = this.f31056b;
        int i12 = 12;
        if (i11 != 24 && i11 >= 12) {
            str = "PM";
        } else {
            str = "AM";
        }
        textView2.setText(str);
        Object[] objArr = new Object[2];
        int i13 = this.f31056b % 12;
        if (i13 != 0) {
            i12 = i13;
        }
        objArr[0] = Integer.valueOf(i12);
        objArr[1] = Integer.valueOf(this.f31057c);
        textView.setText(String.format("%02d:%02d", objArr));
    }

    public final void G(short s11) {
        this.f31064j = s11;
    }

    public final void H(short s11) {
        this.f31058d = s11;
    }

    public final void H0(short s11) {
        this.f31063i = s11;
    }

    public final void I(long j5) {
        this.f31059e = j5;
    }

    public final void K(boolean z5) {
        this.f31060f = z5;
    }

    public final void L0(String str) {
        this.f31068n = str;
    }

    public final void M0(String str) {
        this.f31065k = str;
    }

    public final void Q(int i11, boolean z5) {
        if (z5) {
            this.f31058d = (short) ((1 << i11) | this.f31058d);
            return;
        }
        this.f31058d = (short) ((~(1 << i11)) & this.f31058d);
    }

    public final void V(DateTime dateTime) {
        this.f31074t = dateTime;
    }

    public final void W(int i11) {
        this.f31056b = i11;
    }

    public final void X(Long l5) {
        this.f31055a = l5;
    }

    public final void Y(short s11) {
        this.f31075u = s11;
    }

    public final DeviceAlarm a() {
        DeviceAlarm deviceAlarm = new DeviceAlarm();
        deviceAlarm.f31056b = this.f31056b;
        deviceAlarm.f31055a = this.f31055a;
        deviceAlarm.f31057c = this.f31057c;
        deviceAlarm.f31058d = this.f31058d;
        deviceAlarm.f31059e = this.f31059e;
        deviceAlarm.f31060f = this.f31060f;
        deviceAlarm.f31061g = this.f31061g;
        deviceAlarm.f31062h = this.f31062h;
        deviceAlarm.f31064j = this.f31064j;
        deviceAlarm.f31063i = this.f31063i;
        deviceAlarm.f31065k = this.f31065k;
        deviceAlarm.f31075u = this.f31075u;
        deviceAlarm.f31076v = this.f31076v;
        deviceAlarm.f31068n = this.f31068n;
        deviceAlarm.f31072r = this.f31072r;
        deviceAlarm.f31073s = this.f31073s;
        deviceAlarm.f31074t = this.f31074t;
        return deviceAlarm;
    }

    public final void a0(int i11) {
        this.f31057c = i11;
    }

    public final int b() {
        return (this.f31056b * 60) + this.f31057c;
    }

    public final short c() {
        return this.f31064j;
    }

    public final void c0(String str) {
        this.f31072r = str;
    }

    public final short d() {
        return this.f31058d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.f31059e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeviceAlarm deviceAlarm = (DeviceAlarm) obj;
        if (this.f31058d == deviceAlarm.f31058d && this.f31059e == deviceAlarm.f31059e && this.f31060f == deviceAlarm.f31060f && this.f31056b == deviceAlarm.f31056b && this.f31057c == deviceAlarm.f31057c && this.f31062h == deviceAlarm.f31062h && this.f31061g == deviceAlarm.f31061g && this.f31063i == deviceAlarm.f31063i && this.f31064j == deviceAlarm.f31064j && this.f31065k == deviceAlarm.f31065k && this.f31068n == deviceAlarm.f31068n && this.f31073s == deviceAlarm.f31073s && this.f31074t == deviceAlarm.f31074t) {
            return true;
        }
        return false;
    }

    public final String f(Context context) {
        WsdProgram wsdProgram = new WsdProgram();
        wsdProgram.f31078d = (short) 4;
        wsdProgram.v(this.f31062h);
        wsdProgram.H(this.f31068n);
        wsdProgram.G(this.f31065k);
        wsdProgram.C(this.f31067m);
        wsdProgram.D(this.f31066l);
        return wsdProgram.f(context);
    }

    public final void f0(boolean z5) {
        this.f31076v = z5;
    }

    public final DateTime g() {
        return this.f31074t;
    }

    public final int h() {
        return this.f31056b;
    }

    public final int hashCode() {
        int i11;
        int i12;
        int i13;
        int i14;
        long j5 = this.f31059e;
        int longValue = ((((((((((((((((((((int) (this.f31055a.longValue() ^ (this.f31055a.longValue() >>> 32))) * 31) + this.f31056b) * 31) + this.f31057c) * 31) + this.f31058d) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + (this.f31060f ? 1 : 0)) * 31) + this.f31061g) * 31) + this.f31062h) * 31) + this.f31063i) * 31) + this.f31064j) * 31;
        String str = this.f31065k;
        int i15 = 0;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (longValue + i11) * 31;
        String str2 = this.f31066l;
        if (str2 != null) {
            i12 = str2.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        String str3 = this.f31067m;
        if (str3 != null) {
            i13 = str3.hashCode();
        } else {
            i13 = 0;
        }
        int i18 = (i17 + i13) * 31;
        String str4 = this.f31068n;
        if (str4 != null) {
            i14 = str4.hashCode();
        } else {
            i14 = 0;
        }
        int i19 = (((((((((((i18 + i14) * 31) + this.f31069o) * 31) + this.f31070p) * 31) + this.f31071q) * 31) + this.f31075u) * 31) + (this.f31076v ? 1 : 0)) * 31;
        String str5 = this.f31072r;
        if (str5 != null) {
            i15 = str5.hashCode();
        }
        int i21 = i19 + i15;
        DateTime dateTime = this.f31073s;
        if (dateTime != null) {
            i21 = (i21 * 31) + dateTime.hashCode();
        }
        DateTime dateTime2 = this.f31074t;
        if (dateTime2 != null) {
            return (i21 * 31) + dateTime2.hashCode();
        }
        return i21;
    }

    public final Long i() {
        return this.f31055a;
    }

    public final short j() {
        return this.f31075u;
    }

    public final int k() {
        return this.f31057c;
    }

    public final String l() {
        return this.f31072r;
    }

    public final void l0(short s11) {
        this.f31062h = s11;
    }

    public final int o() {
        int b10 = b();
        DateTime now = DateTime.now();
        int minuteOfDay = now.getMinuteOfDay();
        if (!this.f31076v && this.f31071q + this.f31070p + this.f31069o <= 0) {
            for (int i11 = 0; i11 < 7; i11++) {
                if (C(i11)) {
                    int dayOfWeek = now.getDayOfWeek();
                    if (C(dayOfWeek) && b10 > minuteOfDay) {
                        return 0;
                    }
                    int i12 = dayOfWeek + 1;
                    if (C(i12 % 7)) {
                        return C1987R.string._TOMORROW_;
                    }
                    int[] iArr = {C1987R.string._SUNDAY_, C1987R.string._MONDAY_, C1987R.string._TUESDAY_, C1987R.string._WEDNESDAY_, C1987R.string._TURSDAY_, C1987R.string._FRIDAY_, C1987R.string._SATURDAY_};
                    while (i12 < dayOfWeek + 8) {
                        int i13 = i12 % 7;
                        if (C(i13)) {
                            return iArr[i13];
                        }
                        i12++;
                    }
                    return 0;
                }
            }
            if (minuteOfDay <= b10) {
                return 0;
            }
            return C1987R.string._TOMORROW_;
        } else if (!new DateTime(this.f31071q, this.f31070p, this.f31069o, this.f31056b, this.f31057c).isAfterNow()) {
            return 0;
        } else {
            return C1987R.string._TOMORROW_;
        }
    }

    public final short p() {
        return this.f31062h;
    }

    public final void p0(int i11) {
        this.f31061g = i11;
    }

    public final int q() {
        return this.f31061g;
    }

    public final String r() {
        return this.f31067m;
    }

    public final String s() {
        return this.f31066l;
    }

    public final DateTime t() {
        return this.f31073s;
    }

    public final short u() {
        return this.f31063i;
    }

    public final void u0(String str) {
        this.f31067m = str;
    }

    public final String v() {
        return this.f31068n;
    }

    public final void w0(String str) {
        this.f31066l = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        if (this.f31055a == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.f31055a.longValue());
        }
        parcel.writeInt(this.f31056b);
        parcel.writeInt(this.f31057c);
        parcel.writeInt(this.f31058d);
        parcel.writeLong(this.f31059e);
        parcel.writeInt(this.f31060f ? 1 : 0);
        parcel.writeInt(this.f31061g);
        parcel.writeInt(this.f31062h);
        parcel.writeInt(this.f31063i);
        parcel.writeInt(this.f31064j);
        parcel.writeString(this.f31065k);
        parcel.writeInt(this.f31075u);
        parcel.writeInt(this.f31076v ? 1 : 0);
        parcel.writeString(this.f31066l);
        parcel.writeString(this.f31067m);
        parcel.writeString(this.f31068n);
        parcel.writeString(this.f31072r);
        if (this.f31073s == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.f31073s.getMillis());
        }
        if (this.f31074t == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeLong(this.f31074t.getMillis());
    }

    public final String y() {
        return this.f31065k;
    }

    DeviceAlarm(Parcel parcel) {
        this.f31058d = (short) 127;
        this.f31072r = "";
        this.f31075u = (short) -1;
        this.f31076v = false;
        this.f31055a = parcel.readByte() == 0 ? null : Long.valueOf(parcel.readLong());
        this.f31056b = parcel.readInt();
        this.f31057c = parcel.readInt();
        this.f31058d = (short) parcel.readInt();
        this.f31059e = parcel.readLong();
        this.f31060f = parcel.readInt() == 1;
        this.f31061g = parcel.readInt();
        this.f31062h = (short) parcel.readInt();
        this.f31063i = (short) parcel.readInt();
        this.f31064j = (short) parcel.readInt();
        this.f31065k = parcel.readString();
        this.f31075u = (short) parcel.readInt();
        this.f31076v = parcel.readInt() == 1;
        this.f31066l = parcel.readString();
        this.f31067m = parcel.readString();
        this.f31068n = parcel.readString();
        this.f31072r = parcel.readString();
        this.f31073s = parcel.readByte() == 0 ? null : new DateTime(parcel.readLong());
        this.f31074t = parcel.readByte() != 0 ? new DateTime(parcel.readLong()) : null;
    }
}
