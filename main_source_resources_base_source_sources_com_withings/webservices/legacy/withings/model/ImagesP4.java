package com.withings.webservices.legacy.withings.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class ImagesP4 implements Serializable, Parcelable {
    public static final String BASE_URL = "https://p4.withings.com/";
    public static final Parcelable.Creator<ImagesP4> CREATOR = new Parcelable.Creator<ImagesP4>() { // from class: com.withings.webservices.legacy.withings.model.ImagesP4.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ImagesP4 createFromParcel(Parcel parcel) {
            return new ImagesP4(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ImagesP4[] newArray(int i11) {
            return new ImagesP4[i11];
        }
    };
    @SerializedName("128x128")
    public String image128;
    @SerializedName("256x256")
    public String image256;
    @SerializedName("32x32")
    public String image32;
    @SerializedName("512x512")
    public String image512;
    @SerializedName("64x64")
    public String image64;

    public ImagesP4() {
    }

    private String getUrlFor(String str) {
        if (str != null) {
            return BASE_URL.concat(str);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<String> getAllNonNullUrls() {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {this.image512, this.image256, this.image128, this.image64, this.image32};
        for (int i11 = 0; i11 < 5; i11++) {
            String urlFor = getUrlFor(strArr[i11]);
            if (urlFor != null) {
                arrayList.add(urlFor);
            }
        }
        return arrayList;
    }

    public String getUrlFor128() {
        return getUrlFor(this.image128);
    }

    public String getUrlFor256() {
        return getUrlFor(this.image256);
    }

    public String getUrlFor32() {
        return getUrlFor(this.image32);
    }

    public String getUrlFor512() {
        return getUrlFor(this.image512);
    }

    public String getUrlFor64() {
        return getUrlFor(this.image64);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.image32);
        parcel.writeString(this.image64);
        parcel.writeString(this.image128);
        parcel.writeString(this.image256);
        parcel.writeString(this.image512);
    }

    protected ImagesP4(Parcel parcel) {
        this.image32 = parcel.readString();
        this.image64 = parcel.readString();
        this.image128 = parcel.readString();
        this.image256 = parcel.readString();
        this.image512 = parcel.readString();
    }
}
