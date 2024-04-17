package com.withings.wiscale2.device.wpm.wpm05.tutorial;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.h;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.j;
import og.y;
/* compiled from: Wpm05TutorialScreensProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm05/tutorial/Wpm05TutorialScreen;", "Landroid/os/Parcelable;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpm05TutorialScreen implements Parcelable {
    public static final Parcelable.Creator<Wpm05TutorialScreen> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final int f55917a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55918b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f55919c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f55920d;

    /* renamed from: e  reason: collision with root package name */
    private final String f55921e;

    /* renamed from: f  reason: collision with root package name */
    private final j<String, String> f55922f;

    /* renamed from: g  reason: collision with root package name */
    private final int f55923g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f55924h;

    /* compiled from: Wpm05TutorialScreensProvider.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<Wpm05TutorialScreen> {
        @Override // android.os.Parcelable.Creator
        public final Wpm05TutorialScreen createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer valueOf2;
            boolean z5;
            u.j(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
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
            String readString = parcel.readString();
            j jVar = (j) parcel.readSerializable();
            int readInt3 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            return new Wpm05TutorialScreen(readInt, readInt2, valueOf, valueOf2, readString, jVar, readInt3, z5);
        }

        @Override // android.os.Parcelable.Creator
        public final Wpm05TutorialScreen[] newArray(int i11) {
            return new Wpm05TutorialScreen[i11];
        }
    }

    public /* synthetic */ Wpm05TutorialScreen(int i11, int i12, Integer num, String str, j jVar, int i13, boolean z5, int i14) {
        this(i11, i12, (Integer) null, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : str, (i14 & 32) != 0 ? null : jVar, (i14 & 64) != 0 ? C1987R.string._NEXT_ : i13, (i14 & 128) != 0 ? true : z5);
    }

    public final boolean a() {
        return this.f55924h;
    }

    public final int b() {
        return this.f55923g;
    }

    public final int c() {
        return this.f55918b;
    }

    public final Integer d() {
        return this.f55920d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final j<String, String> e() {
        return this.f55922f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wpm05TutorialScreen)) {
            return false;
        }
        Wpm05TutorialScreen wpm05TutorialScreen = (Wpm05TutorialScreen) obj;
        if (this.f55917a == wpm05TutorialScreen.f55917a && this.f55918b == wpm05TutorialScreen.f55918b && u.e(this.f55919c, wpm05TutorialScreen.f55919c) && u.e(this.f55920d, wpm05TutorialScreen.f55920d) && u.e(this.f55921e, wpm05TutorialScreen.f55921e) && u.e(this.f55922f, wpm05TutorialScreen.f55922f) && this.f55923g == wpm05TutorialScreen.f55923g && this.f55924h == wpm05TutorialScreen.f55924h) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f55917a;
    }

    public final String g() {
        return this.f55921e;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int a11 = h.a(this.f55918b, Integer.hashCode(this.f55917a) * 31, 31);
        int i11 = 0;
        Integer num = this.f55919c;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = (a11 + hashCode) * 31;
        Integer num2 = this.f55920d;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str = this.f55921e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        j<String, String> jVar = this.f55922f;
        if (jVar != null) {
            i11 = jVar.hashCode();
        }
        return Boolean.hashCode(this.f55924h) + h.a(this.f55923g, (i14 + i11) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Wpm05TutorialScreen(titleRes=");
        sb2.append(this.f55917a);
        sb2.append(", descriptionRes=");
        sb2.append(this.f55918b);
        sb2.append(", infoRes=");
        sb2.append(this.f55919c);
        sb2.append(", imageRes=");
        sb2.append(this.f55920d);
        sb2.append(", videoResName=");
        sb2.append(this.f55921e);
        sb2.append(", lottiePaths=");
        sb2.append(this.f55922f);
        sb2.append(", buttonRes=");
        sb2.append(this.f55923g);
        sb2.append(", backAllowed=");
        return h.d(sb2, this.f55924h, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeInt(this.f55917a);
        out.writeInt(this.f55918b);
        Integer num = this.f55919c;
        if (num == null) {
            out.writeInt(0);
        } else {
            y.b(out, 1, num);
        }
        Integer num2 = this.f55920d;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            y.b(out, 1, num2);
        }
        out.writeString(this.f55921e);
        out.writeSerializable(this.f55922f);
        out.writeInt(this.f55923g);
        out.writeInt(this.f55924h ? 1 : 0);
    }

    public Wpm05TutorialScreen(int i11, int i12, Integer num, Integer num2, String str, j<String, String> jVar, int i13, boolean z5) {
        this.f55917a = i11;
        this.f55918b = i12;
        this.f55919c = num;
        this.f55920d = num2;
        this.f55921e = str;
        this.f55922f = jVar;
        this.f55923g = i13;
        this.f55924h = z5;
    }
}
