package com.withings.webservices.legacy.withings.model.timeline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.Serializable;
/* loaded from: classes4.dex */
public class PathList implements Parcelable, Serializable {
    public static final Parcelable.Creator<PathList> CREATOR = new Parcelable.Creator<PathList>() { // from class: com.withings.webservices.legacy.withings.model.timeline.PathList.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PathList createFromParcel(Parcel parcel) {
            return new PathList(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PathList[] newArray(int i11) {
            return new PathList[i11];
        }
    };
    public long deviceId;
    public int duration;
    public long epoch;
    public int imageCount;
    public boolean parsed;
    public String sign;
    public long timestamp;
    public String url;

    public PathList() {
        this.timestamp = Long.MIN_VALUE;
        this.imageCount = 1;
        this.parsed = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isParsed() {
        if (this.url.endsWith(".jpg") || this.imageCount > 1 || this.parsed) {
            return true;
        }
        return false;
    }

    public boolean isSimpleImage() {
        if (TextUtils.isEmpty(this.url)) {
            return false;
        }
        Uri parse = Uri.parse(this.url);
        if (!parse.getLastPathSegment().endsWith(".jpg") || parse.getLastPathSegment().contains("_")) {
            return false;
        }
        return true;
    }

    public int positionInBin() {
        String lastPathSegment = Uri.parse(this.url).getLastPathSegment();
        if (!lastPathSegment.endsWith(".bin") && lastPathSegment.contains("_")) {
            try {
                return Integer.valueOf(lastPathSegment.replace(".jpg", "").split("_")[1]).intValue() - 1;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public String toBinUrl() {
        String lastPathSegment = Uri.parse(this.url).getLastPathSegment();
        if (!lastPathSegment.endsWith(".bin") && lastPathSegment.contains("_")) {
            int lastIndexOf = this.url.lastIndexOf("_");
            return this.url.substring(0, lastIndexOf) + ".bin";
        }
        return this.url;
    }

    public String toString() {
        return "url = " + this.url + " deviceId= " + this.deviceId + " sign = " + this.sign + " timestamp = " + this.timestamp + " imageCount = " + this.imageCount + " parsed= " + this.parsed;
    }

    public PathList withBinUrl() {
        PathList pathList = new PathList();
        pathList.deviceId = this.deviceId;
        pathList.sign = this.sign;
        pathList.timestamp = this.timestamp;
        pathList.imageCount = this.imageCount;
        pathList.parsed = this.parsed;
        pathList.url = toBinUrl();
        return pathList;
    }

    public PathList withCustomUrl(String str) {
        PathList pathList = new PathList();
        pathList.deviceId = this.deviceId;
        pathList.sign = this.sign;
        pathList.timestamp = this.timestamp;
        pathList.imageCount = this.imageCount;
        pathList.parsed = this.parsed;
        pathList.url = str;
        return pathList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.deviceId);
        parcel.writeString(this.url);
        parcel.writeString(this.sign);
        parcel.writeLong(this.timestamp);
        parcel.writeInt(this.imageCount);
        parcel.writeInt(this.parsed ? 1 : 0);
        parcel.writeInt(this.duration);
        parcel.writeLong(this.epoch);
    }

    protected PathList(Parcel parcel) {
        this.timestamp = Long.MIN_VALUE;
        this.imageCount = 1;
        this.parsed = false;
        this.deviceId = parcel.readLong();
        this.url = parcel.readString();
        this.sign = parcel.readString();
        this.timestamp = parcel.readLong();
        this.imageCount = parcel.readInt();
        this.parsed = parcel.readInt() == 1;
        this.duration = parcel.readInt();
        this.epoch = parcel.readLong();
    }
}
