package com.withings.screen.repository.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: DeviceScreenEntity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ>\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010¨\u0006!"}, d2 = {"Lcom/withings/screen/repository/data/model/DeviceScreenEntityImage;", "", "imageType", "", "imageData", "", "imageHeight", "imageWidth", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getImageData", "()Ljava/lang/String;", "setImageData", "(Ljava/lang/String;)V", "getImageHeight", "()Ljava/lang/Integer;", "setImageHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getImageType", "setImageType", "getImageWidth", "setImageWidth", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/withings/screen/repository/data/model/DeviceScreenEntityImage;", "equals", "", "other", "hashCode", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceScreenEntityImage {
    private String imageData;
    private Integer imageHeight;
    private Integer imageType;
    private Integer imageWidth;

    public DeviceScreenEntityImage() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ DeviceScreenEntityImage copy$default(DeviceScreenEntityImage deviceScreenEntityImage, Integer num, String str, Integer num2, Integer num3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = deviceScreenEntityImage.imageType;
        }
        if ((i11 & 2) != 0) {
            str = deviceScreenEntityImage.imageData;
        }
        if ((i11 & 4) != 0) {
            num2 = deviceScreenEntityImage.imageHeight;
        }
        if ((i11 & 8) != 0) {
            num3 = deviceScreenEntityImage.imageWidth;
        }
        return deviceScreenEntityImage.copy(num, str, num2, num3);
    }

    public final Integer component1() {
        return this.imageType;
    }

    public final String component2() {
        return this.imageData;
    }

    public final Integer component3() {
        return this.imageHeight;
    }

    public final Integer component4() {
        return this.imageWidth;
    }

    public final DeviceScreenEntityImage copy(Integer num, String str, Integer num2, Integer num3) {
        return new DeviceScreenEntityImage(num, str, num2, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceScreenEntityImage)) {
            return false;
        }
        DeviceScreenEntityImage deviceScreenEntityImage = (DeviceScreenEntityImage) obj;
        if (u.e(this.imageType, deviceScreenEntityImage.imageType) && u.e(this.imageData, deviceScreenEntityImage.imageData) && u.e(this.imageHeight, deviceScreenEntityImage.imageHeight) && u.e(this.imageWidth, deviceScreenEntityImage.imageWidth)) {
            return true;
        }
        return false;
    }

    public final String getImageData() {
        return this.imageData;
    }

    public final Integer getImageHeight() {
        return this.imageHeight;
    }

    public final Integer getImageType() {
        return this.imageType;
    }

    public final Integer getImageWidth() {
        return this.imageWidth;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Integer num = this.imageType;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = hashCode * 31;
        String str = this.imageData;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Integer num2 = this.imageHeight;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        Integer num3 = this.imageWidth;
        if (num3 != null) {
            i11 = num3.hashCode();
        }
        return i14 + i11;
    }

    public final void setImageData(String str) {
        this.imageData = str;
    }

    public final void setImageHeight(Integer num) {
        this.imageHeight = num;
    }

    public final void setImageType(Integer num) {
        this.imageType = num;
    }

    public final void setImageWidth(Integer num) {
        this.imageWidth = num;
    }

    public String toString() {
        Integer num = this.imageType;
        String str = this.imageData;
        Integer num2 = this.imageHeight;
        Integer num3 = this.imageWidth;
        return "DeviceScreenEntityImage(imageType=" + num + ", imageData=" + str + ", imageHeight=" + num2 + ", imageWidth=" + num3 + ")";
    }

    public DeviceScreenEntityImage(Integer num, String str, Integer num2, Integer num3) {
        this.imageType = num;
        this.imageData = str;
        this.imageHeight = num2;
        this.imageWidth = num3;
    }

    public /* synthetic */ DeviceScreenEntityImage(Integer num, String str, Integer num2, Integer num3, int i11, m mVar) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : num2, (i11 & 8) != 0 ? null : num3);
    }
}
