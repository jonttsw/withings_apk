package com.withings.design.tutorial;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes3.dex */
public class TutorialData implements Parcelable {
    public static final Parcelable.Creator<TutorialData> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private int f36148a;

    /* renamed from: b  reason: collision with root package name */
    private String f36149b;

    /* renamed from: c  reason: collision with root package name */
    private String f36150c;

    /* loaded from: classes3.dex */
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

    protected TutorialData(Parcel parcel) {
        this.f36148a = parcel.readInt();
        this.f36149b = parcel.readString();
        this.f36150c = parcel.readString();
    }

    public final int a() {
        return this.f36148a;
    }

    public final String b() {
        return this.f36149b;
    }

    public final String c() {
        return this.f36150c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f36148a);
        parcel.writeString(this.f36149b);
        parcel.writeString(this.f36150c);
    }
}
