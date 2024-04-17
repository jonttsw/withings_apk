package com.withings.device;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes3.dex */
public class DeviceModel implements Parcelable {
    public static final Parcelable.Creator<DeviceModel> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private int f36651a;

    /* renamed from: b  reason: collision with root package name */
    private String f36652b;

    /* loaded from: classes3.dex */
    final class a implements Parcelable.Creator<DeviceModel> {
        @Override // android.os.Parcelable.Creator
        public final DeviceModel createFromParcel(Parcel parcel) {
            return new DeviceModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DeviceModel[] newArray(int i11) {
            return new DeviceModel[i11];
        }
    }

    public DeviceModel(int i11, String str) {
        this.f36651a = i11;
        this.f36652b = str;
    }

    public final String a() {
        return this.f36652b;
    }

    public final int b() {
        return this.f36651a;
    }

    public final void c(String str) {
        this.f36652b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f36651a);
        parcel.writeString(this.f36652b);
    }

    protected DeviceModel(Parcel parcel) {
        this.f36651a = parcel.readInt();
        this.f36652b = parcel.readString();
    }
}
