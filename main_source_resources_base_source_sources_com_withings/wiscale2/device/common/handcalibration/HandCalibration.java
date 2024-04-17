package com.withings.wiscale2.device.common.handcalibration;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.y1;
import com.withings.devicesetup.ui.LottieData;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import og.y;
/* compiled from: HandCalibration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/handcalibration/HandCalibration;", "Landroid/os/Parcelable;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HandCalibration implements Parcelable {
    public static final Parcelable.Creator<HandCalibration> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final short f52659a;

    /* renamed from: b  reason: collision with root package name */
    private final int f52660b;

    /* renamed from: c  reason: collision with root package name */
    private final int f52661c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f52662d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f52663e;

    /* renamed from: f  reason: collision with root package name */
    private final Integer f52664f;

    /* renamed from: g  reason: collision with root package name */
    private final LottieData f52665g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f52666h;

    /* compiled from: HandCalibration.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<HandCalibration> {
        @Override // android.os.Parcelable.Creator
        public final HandCalibration createFromParcel(Parcel parcel) {
            boolean z5;
            boolean z11;
            Integer valueOf;
            boolean z12;
            u.j(parcel, "parcel");
            short readInt = (short) parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            Integer num = valueOf;
            LottieData lottieData = (LottieData) parcel.readParcelable(HandCalibration.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            return new HandCalibration(readInt, readInt2, readInt3, z5, z11, num, lottieData, z12);
        }

        @Override // android.os.Parcelable.Creator
        public final HandCalibration[] newArray(int i11) {
            return new HandCalibration[i11];
        }
    }

    public HandCalibration(short s11, int i11, boolean z5) {
        this(s11, i11, C1987R.string.setup_calibrate_subtitle, true, z5, null, 224);
    }

    public final Integer a() {
        return this.f52664f;
    }

    public final LottieData b() {
        return this.f52665g;
    }

    public final int c() {
        return this.f52661c;
    }

    public final boolean d() {
        return this.f52666h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f52660b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HandCalibration)) {
            return false;
        }
        HandCalibration handCalibration = (HandCalibration) obj;
        if (this.f52659a == handCalibration.f52659a && this.f52660b == handCalibration.f52660b && this.f52661c == handCalibration.f52661c && this.f52662d == handCalibration.f52662d && this.f52663e == handCalibration.f52663e && u.e(this.f52664f, handCalibration.f52664f) && u.e(this.f52665g, handCalibration.f52665g) && this.f52666h == handCalibration.f52666h) {
            return true;
        }
        return false;
    }

    public final short f() {
        return this.f52659a;
    }

    public final int hashCode() {
        int hashCode;
        int a11 = y1.a(this.f52663e, y1.a(this.f52662d, androidx.appcompat.app.h.a(this.f52661c, androidx.appcompat.app.h.a(this.f52660b, Short.hashCode(this.f52659a) * 31, 31), 31), 31), 31);
        int i11 = 0;
        Integer num = this.f52664f;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = (a11 + hashCode) * 31;
        LottieData lottieData = this.f52665g;
        if (lottieData != null) {
            i11 = lottieData.hashCode();
        }
        return Boolean.hashCode(this.f52666h) + ((i12 + i11) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HandCalibration(wppHand=");
        sb2.append((int) this.f52659a);
        sb2.append(", titleResId=");
        sb2.append(this.f52660b);
        sb2.append(", messageResId=");
        sb2.append(this.f52661c);
        sb2.append(", doesRotateInBothDirection=");
        sb2.append(this.f52662d);
        sb2.append(", isWheelSmall=");
        sb2.append(this.f52663e);
        sb2.append(", errorResId=");
        sb2.append(this.f52664f);
        sb2.append(", lottieDataCalibration=");
        sb2.append(this.f52665g);
        sb2.append(", shouldAnimateKnob=");
        return androidx.appcompat.app.h.d(sb2, this.f52666h, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeInt(this.f52659a);
        out.writeInt(this.f52660b);
        out.writeInt(this.f52661c);
        out.writeInt(this.f52662d ? 1 : 0);
        out.writeInt(this.f52663e ? 1 : 0);
        Integer num = this.f52664f;
        if (num == null) {
            out.writeInt(0);
        } else {
            y.b(out, 1, num);
        }
        out.writeParcelable(this.f52665g, i11);
        out.writeInt(this.f52666h ? 1 : 0);
    }

    public HandCalibration(short s11, int i11, int i12, boolean z5, boolean z11, Integer num, LottieData lottieData, boolean z12) {
        this.f52659a = s11;
        this.f52660b = i11;
        this.f52661c = i12;
        this.f52662d = z5;
        this.f52663e = z11;
        this.f52664f = num;
        this.f52665g = lottieData;
        this.f52666h = z12;
    }

    public /* synthetic */ HandCalibration(short s11, int i11, int i12, boolean z5, boolean z11, LottieData lottieData, int i13) {
        this(s11, i11, i12, z5, z11, null, (i13 & 64) != 0 ? null : lottieData, (i13 & 128) != 0);
    }
}
