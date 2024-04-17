package com.withings.wiscale2.device.wpm.wpm04.tutorial;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.h;
import androidx.camera.core.y1;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.j;
import og.y;
/* compiled from: Wpm04TutorialScreensProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm04/tutorial/Wpm04TutorialScreen;", "Landroid/os/Parcelable;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpm04TutorialScreen implements Parcelable {
    public static final Parcelable.Creator<Wpm04TutorialScreen> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final int f55827a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55828b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f55829c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f55830d;

    /* renamed from: e  reason: collision with root package name */
    private final j<String, String> f55831e;

    /* renamed from: f  reason: collision with root package name */
    private final Integer f55832f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f55833g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f55834h;

    /* renamed from: i  reason: collision with root package name */
    private final TimeOutInfo f55835i;

    /* compiled from: Wpm04TutorialScreensProvider.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Wpm04TutorialScreen> {
        @Override // android.os.Parcelable.Creator
        public final Wpm04TutorialScreen createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer valueOf2;
            Integer valueOf3;
            boolean z5;
            u.j(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            TimeOutInfo timeOutInfo = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Integer.valueOf(parcel.readInt());
            }
            j jVar = (j) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Integer.valueOf(parcel.readInt());
            }
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            }
            if (parcel.readInt() != 0) {
                timeOutInfo = TimeOutInfo.CREATOR.createFromParcel(parcel);
            }
            return new Wpm04TutorialScreen(readInt, readInt2, valueOf, valueOf2, jVar, valueOf3, z5, z11, timeOutInfo);
        }

        @Override // android.os.Parcelable.Creator
        public final Wpm04TutorialScreen[] newArray(int i11) {
            return new Wpm04TutorialScreen[i11];
        }
    }

    public /* synthetic */ Wpm04TutorialScreen(int i11, int i12, Integer num, Integer num2, j jVar, Integer num3, boolean z5, TimeOutInfo timeOutInfo, int i13) {
        this(i11, i12, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? null : num2, (i13 & 16) != 0 ? null : jVar, (i13 & 32) != 0 ? null : num3, z5, (i13 & 128) != 0, (i13 & 256) != 0 ? null : timeOutInfo);
    }

    public final boolean a() {
        return this.f55833g;
    }

    public final Integer b() {
        return this.f55832f;
    }

    public final int c() {
        return this.f55828b;
    }

    public final Integer d() {
        return this.f55830d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.f55829c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wpm04TutorialScreen)) {
            return false;
        }
        Wpm04TutorialScreen wpm04TutorialScreen = (Wpm04TutorialScreen) obj;
        if (this.f55827a == wpm04TutorialScreen.f55827a && this.f55828b == wpm04TutorialScreen.f55828b && u.e(this.f55829c, wpm04TutorialScreen.f55829c) && u.e(this.f55830d, wpm04TutorialScreen.f55830d) && u.e(this.f55831e, wpm04TutorialScreen.f55831e) && u.e(this.f55832f, wpm04TutorialScreen.f55832f) && this.f55833g == wpm04TutorialScreen.f55833g && this.f55834h == wpm04TutorialScreen.f55834h && u.e(this.f55835i, wpm04TutorialScreen.f55835i)) {
            return true;
        }
        return false;
    }

    public final j<String, String> f() {
        return this.f55831e;
    }

    public final boolean g() {
        return this.f55834h;
    }

    public final TimeOutInfo h() {
        return this.f55835i;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int a11 = h.a(this.f55828b, Integer.hashCode(this.f55827a) * 31, 31);
        int i11 = 0;
        Integer num = this.f55829c;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = (a11 + hashCode) * 31;
        Integer num2 = this.f55830d;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        j<String, String> jVar = this.f55831e;
        if (jVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = jVar.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        Integer num3 = this.f55832f;
        if (num3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num3.hashCode();
        }
        int a12 = y1.a(this.f55834h, y1.a(this.f55833g, (i14 + hashCode4) * 31, 31), 31);
        TimeOutInfo timeOutInfo = this.f55835i;
        if (timeOutInfo != null) {
            i11 = timeOutInfo.hashCode();
        }
        return a12 + i11;
    }

    public final int i() {
        return this.f55827a;
    }

    public final String toString() {
        return "Wpm04TutorialScreen(titleRes=" + this.f55827a + ", descriptionRes=" + this.f55828b + ", infoRes=" + this.f55829c + ", imageRes=" + this.f55830d + ", lottiePaths=" + this.f55831e + ", buttonRes=" + this.f55832f + ", backAllowed=" + this.f55833g + ", repeatLottie=" + this.f55834h + ", timeOutInfo=" + this.f55835i + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeInt(this.f55827a);
        out.writeInt(this.f55828b);
        Integer num = this.f55829c;
        if (num == null) {
            out.writeInt(0);
        } else {
            y.b(out, 1, num);
        }
        Integer num2 = this.f55830d;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            y.b(out, 1, num2);
        }
        out.writeSerializable(this.f55831e);
        Integer num3 = this.f55832f;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            y.b(out, 1, num3);
        }
        out.writeInt(this.f55833g ? 1 : 0);
        out.writeInt(this.f55834h ? 1 : 0);
        TimeOutInfo timeOutInfo = this.f55835i;
        if (timeOutInfo == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        timeOutInfo.writeToParcel(out, i11);
    }

    public Wpm04TutorialScreen(int i11, int i12, Integer num, Integer num2, j<String, String> jVar, Integer num3, boolean z5, boolean z11, TimeOutInfo timeOutInfo) {
        this.f55827a = i11;
        this.f55828b = i12;
        this.f55829c = num;
        this.f55830d = num2;
        this.f55831e = jVar;
        this.f55832f = num3;
        this.f55833g = z5;
        this.f55834h = z11;
        this.f55835i = timeOutInfo;
    }
}
