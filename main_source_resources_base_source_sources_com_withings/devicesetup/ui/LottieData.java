package com.withings.devicesetup.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.y1;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: SetupFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/devicesetup/ui/LottieData;", "Landroid/os/Parcelable;", "device-setup-legacy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LottieData implements Parcelable {
    public static final Parcelable.Creator<LottieData> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final String f37847a;

    /* renamed from: b  reason: collision with root package name */
    private final String f37848b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f37849c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f37850d;

    /* compiled from: SetupFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<LottieData> {
        @Override // android.os.Parcelable.Creator
        public final LottieData createFromParcel(Parcel parcel) {
            boolean z5;
            u.j(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            }
            return new LottieData(readString, readString2, z5, z11);
        }

        @Override // android.os.Parcelable.Creator
        public final LottieData[] newArray(int i11) {
            return new LottieData[i11];
        }
    }

    public LottieData(String imagesFolderPath, String lottieFilePath, boolean z5, boolean z11) {
        u.j(imagesFolderPath, "imagesFolderPath");
        u.j(lottieFilePath, "lottieFilePath");
        this.f37847a = imagesFolderPath;
        this.f37848b = lottieFilePath;
        this.f37849c = z5;
        this.f37850d = z11;
    }

    public final String a() {
        return this.f37847a;
    }

    public final String b() {
        return this.f37848b;
    }

    public final boolean c() {
        return this.f37849c;
    }

    public final boolean d() {
        return this.f37850d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieData)) {
            return false;
        }
        LottieData lottieData = (LottieData) obj;
        if (u.e(this.f37847a, lottieData.f37847a) && u.e(this.f37848b, lottieData.f37848b) && this.f37849c == lottieData.f37849c && this.f37850d == lottieData.f37850d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37850d) + y1.a(this.f37849c, defpackage.d.c(this.f37848b, this.f37847a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieData(imagesFolderPath=");
        sb2.append(this.f37847a);
        sb2.append(", lottieFilePath=");
        sb2.append(this.f37848b);
        sb2.append(", isLoading=");
        sb2.append(this.f37849c);
        sb2.append(", isRepeating=");
        return androidx.appcompat.app.h.d(sb2, this.f37850d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeString(this.f37847a);
        out.writeString(this.f37848b);
        out.writeInt(this.f37849c ? 1 : 0);
        out.writeInt(this.f37850d ? 1 : 0);
    }

    public /* synthetic */ LottieData(int i11, String str, String str2, boolean z5, boolean z11) {
        this(str, str2, (i11 & 4) != 0 ? false : z5, (i11 & 8) != 0 ? true : z11);
    }
}
