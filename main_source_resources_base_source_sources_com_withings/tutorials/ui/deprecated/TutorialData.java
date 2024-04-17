package com.withings.tutorials.ui.deprecated;

import android.os.Parcel;
import android.os.Parcelable;
@Deprecated
/* loaded from: classes4.dex */
public class TutorialData implements Parcelable {
    public static final Parcelable.Creator<TutorialData> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private int f44736a;

    /* renamed from: b  reason: collision with root package name */
    private String f44737b;

    /* renamed from: c  reason: collision with root package name */
    private String f44738c;

    /* loaded from: classes4.dex */
    final class a implements Parcelable.Creator<TutorialData> {
        @Override // android.os.Parcelable.Creator
        public final TutorialData createFromParcel(Parcel parcel) {
            return new TutorialData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TutorialData[] newArray(int i11) {
            return new TutorialData[i11];
        }
    }

    public TutorialData(int i11, String str, String str2) {
        this.f44736a = i11;
        this.f44737b = str;
        this.f44738c = str2;
    }

    public final int a() {
        return this.f44736a;
    }

    public final String b() {
        return this.f44737b;
    }

    public final String c() {
        return this.f44738c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f44736a);
        parcel.writeString(this.f44737b);
        parcel.writeString(this.f44738c);
    }

    protected TutorialData(Parcel parcel) {
        this.f44736a = parcel.readInt();
        this.f44737b = parcel.readString();
        this.f44738c = parcel.readString();
    }
}
