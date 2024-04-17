package com.withings.amazon.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes3.dex */
public class AmazonPictureInfo implements Parcelable {
    public static final Parcelable.Creator<AmazonPictureInfo> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private long f31270a;

    /* renamed from: b  reason: collision with root package name */
    private String f31271b;

    /* renamed from: c  reason: collision with root package name */
    private Pathlist f31272c;

    /* renamed from: d  reason: collision with root package name */
    private Uri f31273d;

    /* renamed from: e  reason: collision with root package name */
    private String f31274e;

    /* loaded from: classes3.dex */
    final class a implements Parcelable.Creator<AmazonPictureInfo> {
        @Override // android.os.Parcelable.Creator
        public final AmazonPictureInfo createFromParcel(Parcel parcel) {
            return new AmazonPictureInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AmazonPictureInfo[] newArray(int i11) {
            return new AmazonPictureInfo[i11];
        }
    }

    public AmazonPictureInfo(long j5, String str, Pathlist pathlist, Uri uri) {
        this.f31270a = j5;
        this.f31271b = str;
        this.f31272c = pathlist;
        this.f31273d = uri;
        this.f31274e = "hm";
    }

    public final String a() {
        return this.f31271b;
    }

    public final Pathlist b() {
        return this.f31272c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f31270a);
        parcel.writeString(this.f31271b);
        parcel.writeParcelable(this.f31272c, i11);
        parcel.writeParcelable(this.f31273d, i11);
        parcel.writeString(this.f31274e);
    }

    protected AmazonPictureInfo(Parcel parcel) {
        this.f31270a = parcel.readLong();
        this.f31271b = parcel.readString();
        this.f31272c = (Pathlist) parcel.readParcelable(Pathlist.class.getClassLoader());
        this.f31273d = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f31274e = parcel.readString();
    }
}
