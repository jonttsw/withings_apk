package com.withings.devicesetup.ui;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.camera.core.y1;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import og.y;
/* compiled from: SetupFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/devicesetup/ui/SetupScreen;", "Landroid/os/Parcelable;", "device-setup-legacy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SetupScreen implements Parcelable {
    public static final Parcelable.Creator<SetupScreen> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private CharSequence f37873a;

    /* renamed from: b  reason: collision with root package name */
    private CharSequence f37874b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f37875c;

    /* renamed from: d  reason: collision with root package name */
    private String f37876d;

    /* renamed from: e  reason: collision with root package name */
    private LottieData f37877e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f37878f;

    /* renamed from: g  reason: collision with root package name */
    private CharSequence f37879g;

    /* renamed from: h  reason: collision with root package name */
    private CharSequence f37880h;

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f37881i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f37882j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f37883k;

    /* renamed from: l  reason: collision with root package name */
    private Integer f37884l;

    /* renamed from: m  reason: collision with root package name */
    private Integer f37885m;

    /* renamed from: n  reason: collision with root package name */
    private int f37886n;

    /* renamed from: o  reason: collision with root package name */
    private Integer f37887o;

    /* compiled from: SetupFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<SetupScreen> {
        @Override // android.os.Parcelable.Creator
        public final SetupScreen createFromParcel(Parcel parcel) {
            Integer valueOf;
            LottieData createFromParcel;
            boolean z5;
            Integer valueOf2;
            Integer valueOf3;
            Integer valueOf4;
            u.j(parcel, "parcel");
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            CharSequence charSequence = (CharSequence) creator.createFromParcel(parcel);
            CharSequence charSequence2 = (CharSequence) creator.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = LottieData.CREATOR.createFromParcel(parcel);
            }
            LottieData lottieData = createFromParcel;
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            CharSequence charSequence3 = (CharSequence) creator.createFromParcel(parcel);
            CharSequence charSequence4 = (CharSequence) creator.createFromParcel(parcel);
            CharSequence charSequence5 = (CharSequence) creator.createFromParcel(parcel);
            CharSequence charSequence6 = (CharSequence) creator.createFromParcel(parcel);
            CharSequence charSequence7 = (CharSequence) creator.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Integer.valueOf(parcel.readInt());
            }
            int readInt = parcel.readInt();
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Integer.valueOf(parcel.readInt());
            }
            return new SetupScreen(charSequence, charSequence2, valueOf, readString, lottieData, z5, charSequence3, charSequence4, charSequence5, charSequence6, charSequence7, valueOf2, valueOf3, readInt, valueOf4);
        }

        @Override // android.os.Parcelable.Creator
        public final SetupScreen[] newArray(int i11) {
            return new SetupScreen[i11];
        }
    }

    public SetupScreen(CharSequence mainText, CharSequence charSequence, Integer num, String str, LottieData lottieData, boolean z5, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, CharSequence charSequence6, Integer num2, Integer num3, int i11, Integer num4) {
        u.j(mainText, "mainText");
        this.f37873a = mainText;
        this.f37874b = charSequence;
        this.f37875c = num;
        this.f37876d = str;
        this.f37877e = lottieData;
        this.f37878f = z5;
        this.f37879g = charSequence2;
        this.f37880h = charSequence3;
        this.f37881i = charSequence4;
        this.f37882j = charSequence5;
        this.f37883k = charSequence6;
        this.f37884l = num2;
        this.f37885m = num3;
        this.f37886n = i11;
        this.f37887o = num4;
    }

    public final void A() {
        this.f37878f = true;
    }

    public final void B(String str) {
        this.f37879g = str;
    }

    public final void C(LottieData lottieData) {
        this.f37877e = lottieData;
    }

    public final void D(String str) {
        this.f37880h = str;
    }

    public final void F(String str) {
        this.f37881i = str;
    }

    public final void G(CharSequence charSequence) {
        this.f37874b = charSequence;
    }

    public final void H(Integer num) {
        this.f37885m = num;
    }

    public final int a() {
        return this.f37886n;
    }

    public final CharSequence b() {
        return this.f37882j;
    }

    public final Integer c() {
        return this.f37887o;
    }

    public final CharSequence d() {
        return this.f37883k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.f37875c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetupScreen)) {
            return false;
        }
        SetupScreen setupScreen = (SetupScreen) obj;
        if (u.e(this.f37873a, setupScreen.f37873a) && u.e(this.f37874b, setupScreen.f37874b) && u.e(this.f37875c, setupScreen.f37875c) && u.e(this.f37876d, setupScreen.f37876d) && u.e(this.f37877e, setupScreen.f37877e) && this.f37878f == setupScreen.f37878f && u.e(this.f37879g, setupScreen.f37879g) && u.e(this.f37880h, setupScreen.f37880h) && u.e(this.f37881i, setupScreen.f37881i) && u.e(this.f37882j, setupScreen.f37882j) && u.e(this.f37883k, setupScreen.f37883k) && u.e(this.f37884l, setupScreen.f37884l) && u.e(this.f37885m, setupScreen.f37885m) && this.f37886n == setupScreen.f37886n && u.e(this.f37887o, setupScreen.f37887o)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f37876d;
    }

    public final boolean g() {
        return this.f37878f;
    }

    public final CharSequence h() {
        return this.f37879g;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12 = this.f37873a.hashCode() * 31;
        CharSequence charSequence = this.f37874b;
        int i11 = 0;
        if (charSequence == null) {
            hashCode = 0;
        } else {
            hashCode = charSequence.hashCode();
        }
        int i12 = (hashCode12 + hashCode) * 31;
        Integer num = this.f37875c;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str = this.f37876d;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        LottieData lottieData = this.f37877e;
        if (lottieData == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = lottieData.hashCode();
        }
        int a11 = y1.a(this.f37878f, (i14 + hashCode4) * 31, 31);
        CharSequence charSequence2 = this.f37879g;
        if (charSequence2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = charSequence2.hashCode();
        }
        int i15 = (a11 + hashCode5) * 31;
        CharSequence charSequence3 = this.f37880h;
        if (charSequence3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = charSequence3.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        CharSequence charSequence4 = this.f37881i;
        if (charSequence4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = charSequence4.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        CharSequence charSequence5 = this.f37882j;
        if (charSequence5 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = charSequence5.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        CharSequence charSequence6 = this.f37883k;
        if (charSequence6 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = charSequence6.hashCode();
        }
        int i19 = (i18 + hashCode9) * 31;
        Integer num2 = this.f37884l;
        if (num2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num2.hashCode();
        }
        int i21 = (i19 + hashCode10) * 31;
        Integer num3 = this.f37885m;
        if (num3 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = num3.hashCode();
        }
        int a12 = androidx.appcompat.app.h.a(this.f37886n, (i21 + hashCode11) * 31, 31);
        Integer num4 = this.f37887o;
        if (num4 != null) {
            i11 = num4.hashCode();
        }
        return a12 + i11;
    }

    public final LottieData i() {
        return this.f37877e;
    }

    public final CharSequence j() {
        return this.f37880h;
    }

    public final CharSequence k() {
        return this.f37873a;
    }

    public final CharSequence l() {
        return this.f37881i;
    }

    public final CharSequence o() {
        return this.f37874b;
    }

    public final Integer p() {
        return this.f37884l;
    }

    public final Integer q() {
        return this.f37885m;
    }

    public final void r() {
        this.f37886n = 1;
    }

    public final void s(String str) {
        this.f37882j = str;
    }

    public final void t(Integer num) {
        this.f37887o = num;
    }

    public final String toString() {
        CharSequence charSequence = this.f37874b;
        Integer num = this.f37875c;
        String str = this.f37876d;
        LottieData lottieData = this.f37877e;
        boolean z5 = this.f37878f;
        CharSequence charSequence2 = this.f37879g;
        CharSequence charSequence3 = this.f37880h;
        CharSequence charSequence4 = this.f37881i;
        CharSequence charSequence5 = this.f37882j;
        CharSequence charSequence6 = this.f37883k;
        Integer num2 = this.f37885m;
        int i11 = this.f37886n;
        Integer num3 = this.f37887o;
        return "SetupScreen(mainText=" + ((Object) this.f37873a) + ", secondaryText=" + ((Object) charSequence) + ", imageRes=" + num + ", imageUrl=" + str + ", lottie=" + lottieData + ", indeterminateProgress=" + z5 + ", infoLink=" + ((Object) charSequence2) + ", mainAction=" + ((Object) charSequence3) + ", secondaryAction=" + ((Object) charSequence4) + ", cancelAction=" + ((Object) charSequence5) + ", errorAction=" + ((Object) charSequence6) + ", showButtonsDelayInSeconds=" + this.f37884l + ", showSecondaryTextDelayInSeconds=" + num2 + ", buttonsOrientation=" + i11 + ", customSetupImage=" + num3 + ")";
    }

    public final void u(CharSequence charSequence) {
        this.f37883k = charSequence;
    }

    public final void v(Integer num) {
        this.f37875c = num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        TextUtils.writeToParcel(this.f37873a, out, i11);
        TextUtils.writeToParcel(this.f37874b, out, i11);
        Integer num = this.f37875c;
        if (num == null) {
            out.writeInt(0);
        } else {
            y.b(out, 1, num);
        }
        out.writeString(this.f37876d);
        LottieData lottieData = this.f37877e;
        if (lottieData == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            lottieData.writeToParcel(out, i11);
        }
        out.writeInt(this.f37878f ? 1 : 0);
        TextUtils.writeToParcel(this.f37879g, out, i11);
        TextUtils.writeToParcel(this.f37880h, out, i11);
        TextUtils.writeToParcel(this.f37881i, out, i11);
        TextUtils.writeToParcel(this.f37882j, out, i11);
        TextUtils.writeToParcel(this.f37883k, out, i11);
        Integer num2 = this.f37884l;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            y.b(out, 1, num2);
        }
        Integer num3 = this.f37885m;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            y.b(out, 1, num3);
        }
        out.writeInt(this.f37886n);
        Integer num4 = this.f37887o;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            y.b(out, 1, num4);
        }
    }

    public final void y(String str) {
        this.f37876d = str;
    }

    public /* synthetic */ SetupScreen(String str, String str2, Integer num, LottieData lottieData, String str3, String str4, Integer num2, int i11) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : num, null, (i11 & 16) != 0 ? null : lottieData, false, null, (i11 & 128) != 0 ? null : str3, (i11 & 256) != 0 ? null : str4, null, null, null, (i11 & 4096) != 0 ? null : num2, 0, null);
    }
}
