package com.withings.healthplus.contentscreens.ui.model;

import androidx.appcompat.app.h;
import androidx.camera.core.y1;
import androidx.compose.material.v;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.common.device.model.capabilities.DeviceWithVideoMedia;
import com.withings.device.DevicePictures;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: RecommendedDeviceUi.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b1\u00102J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u0004J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014Jp\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0015\u001a\u00020\u00022\b\b\u0003\u0010\u0016\u001a\u00020\u00022\b\b\u0003\u0010\u0017\u001a\u00020\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b \u0010\rJ\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0004J\u001a\u0010#\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b&\u0010\u0004R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b'\u0010\u0004R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010%\u001a\u0004\b(\u0010\u0004R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b*\u0010\tR\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010%\u001a\u0004\b+\u0010\u0004R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010,\u001a\u0004\b-\u0010\rR\u0017\u0010\u001b\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001b\u0010.\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u001c\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001c\u0010.\u001a\u0004\b\u001c\u0010\u0010R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u001d\u0010/\u001a\u0004\b0\u0010\u0014¨\u00063"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/RecommendedDeviceUi;", "", "", "component1", "()I", "component2", "component3", "Lcom/withings/common/device/model/capabilities/DeviceWithVideoMedia$a;", "component4", "()Lcom/withings/common/device/model/capabilities/DeviceWithVideoMedia$a;", "component5", "", "component6", "()Ljava/lang/String;", "", "component7", "()Z", "component8", "Lcom/withings/device/DevicePictures;", "component9", "()Lcom/withings/device/DevicePictures;", HealthUserProfile.USER_PROFILE_KEY_IMAGE, "name", "deeplinkURL", "deviceMedia", "modelId", RemoteMessageConst.Notification.COLOR, "isOwned", "isRequired", "pictures", "copy", "(IIILcom/withings/common/device/model/capabilities/DeviceWithVideoMedia$a;ILjava/lang/String;ZZLcom/withings/device/DevicePictures;)Lcom/withings/healthplus/contentscreens/ui/model/RecommendedDeviceUi;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getImage", "getName", "getDeeplinkURL", "Lcom/withings/common/device/model/capabilities/DeviceWithVideoMedia$a;", "getDeviceMedia", "getModelId", "Ljava/lang/String;", "getColor", "Z", "Lcom/withings/device/DevicePictures;", "getPictures", "<init>", "(IIILcom/withings/common/device/model/capabilities/DeviceWithVideoMedia$a;ILjava/lang/String;ZZLcom/withings/device/DevicePictures;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RecommendedDeviceUi {
    public static final int $stable = 8;
    private final String color;
    private final int deeplinkURL;
    private final DeviceWithVideoMedia.a deviceMedia;
    private final int image;
    private final boolean isOwned;
    private final boolean isRequired;
    private final int modelId;
    private final int name;
    private final DevicePictures pictures;

    public RecommendedDeviceUi(int i11, int i12, int i13, DeviceWithVideoMedia.a aVar, int i14, String str, boolean z5, boolean z11, DevicePictures devicePictures) {
        this.image = i11;
        this.name = i12;
        this.deeplinkURL = i13;
        this.deviceMedia = aVar;
        this.modelId = i14;
        this.color = str;
        this.isOwned = z5;
        this.isRequired = z11;
        this.pictures = devicePictures;
    }

    public static /* synthetic */ RecommendedDeviceUi copy$default(RecommendedDeviceUi recommendedDeviceUi, int i11, int i12, int i13, DeviceWithVideoMedia.a aVar, int i14, String str, boolean z5, boolean z11, DevicePictures devicePictures, int i15, Object obj) {
        int i16;
        int i17;
        int i18;
        DeviceWithVideoMedia.a aVar2;
        int i19;
        String str2;
        boolean z12;
        boolean z13;
        DevicePictures devicePictures2;
        if ((i15 & 1) != 0) {
            i16 = recommendedDeviceUi.image;
        } else {
            i16 = i11;
        }
        if ((i15 & 2) != 0) {
            i17 = recommendedDeviceUi.name;
        } else {
            i17 = i12;
        }
        if ((i15 & 4) != 0) {
            i18 = recommendedDeviceUi.deeplinkURL;
        } else {
            i18 = i13;
        }
        if ((i15 & 8) != 0) {
            aVar2 = recommendedDeviceUi.deviceMedia;
        } else {
            aVar2 = aVar;
        }
        if ((i15 & 16) != 0) {
            i19 = recommendedDeviceUi.modelId;
        } else {
            i19 = i14;
        }
        if ((i15 & 32) != 0) {
            str2 = recommendedDeviceUi.color;
        } else {
            str2 = str;
        }
        if ((i15 & 64) != 0) {
            z12 = recommendedDeviceUi.isOwned;
        } else {
            z12 = z5;
        }
        if ((i15 & 128) != 0) {
            z13 = recommendedDeviceUi.isRequired;
        } else {
            z13 = z11;
        }
        if ((i15 & 256) != 0) {
            devicePictures2 = recommendedDeviceUi.pictures;
        } else {
            devicePictures2 = devicePictures;
        }
        return recommendedDeviceUi.copy(i16, i17, i18, aVar2, i19, str2, z12, z13, devicePictures2);
    }

    public final int component1() {
        return this.image;
    }

    public final int component2() {
        return this.name;
    }

    public final int component3() {
        return this.deeplinkURL;
    }

    public final DeviceWithVideoMedia.a component4() {
        return this.deviceMedia;
    }

    public final int component5() {
        return this.modelId;
    }

    public final String component6() {
        return this.color;
    }

    public final boolean component7() {
        return this.isOwned;
    }

    public final boolean component8() {
        return this.isRequired;
    }

    public final DevicePictures component9() {
        return this.pictures;
    }

    public final RecommendedDeviceUi copy(int i11, int i12, int i13, DeviceWithVideoMedia.a aVar, int i14, String str, boolean z5, boolean z11, DevicePictures devicePictures) {
        return new RecommendedDeviceUi(i11, i12, i13, aVar, i14, str, z5, z11, devicePictures);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendedDeviceUi)) {
            return false;
        }
        RecommendedDeviceUi recommendedDeviceUi = (RecommendedDeviceUi) obj;
        if (this.image == recommendedDeviceUi.image && this.name == recommendedDeviceUi.name && this.deeplinkURL == recommendedDeviceUi.deeplinkURL && u.e(this.deviceMedia, recommendedDeviceUi.deviceMedia) && this.modelId == recommendedDeviceUi.modelId && u.e(this.color, recommendedDeviceUi.color) && this.isOwned == recommendedDeviceUi.isOwned && this.isRequired == recommendedDeviceUi.isRequired && u.e(this.pictures, recommendedDeviceUi.pictures)) {
            return true;
        }
        return false;
    }

    public final String getColor() {
        return this.color;
    }

    public final int getDeeplinkURL() {
        return this.deeplinkURL;
    }

    public final DeviceWithVideoMedia.a getDeviceMedia() {
        return this.deviceMedia;
    }

    public final int getImage() {
        return this.image;
    }

    public final int getModelId() {
        return this.modelId;
    }

    public final int getName() {
        return this.name;
    }

    public final DevicePictures getPictures() {
        return this.pictures;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int a11 = h.a(this.deeplinkURL, h.a(this.name, Integer.hashCode(this.image) * 31, 31), 31);
        DeviceWithVideoMedia.a aVar = this.deviceMedia;
        int i11 = 0;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        int a12 = h.a(this.modelId, (a11 + hashCode) * 31, 31);
        String str = this.color;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int a13 = y1.a(this.isRequired, y1.a(this.isOwned, (a12 + hashCode2) * 31, 31), 31);
        DevicePictures devicePictures = this.pictures;
        if (devicePictures != null) {
            i11 = devicePictures.hashCode();
        }
        return a13 + i11;
    }

    public final boolean isOwned() {
        return this.isOwned;
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public String toString() {
        int i11 = this.image;
        int i12 = this.name;
        int i13 = this.deeplinkURL;
        DeviceWithVideoMedia.a aVar = this.deviceMedia;
        int i14 = this.modelId;
        String str = this.color;
        boolean z5 = this.isOwned;
        boolean z11 = this.isRequired;
        DevicePictures devicePictures = this.pictures;
        StringBuilder e11 = h.e("RecommendedDeviceUi(image=", i11, ", name=", i12, ", deeplinkURL=");
        e11.append(i13);
        e11.append(", deviceMedia=");
        e11.append(aVar);
        e11.append(", modelId=");
        v.c(e11, i14, ", color=", str, ", isOwned=");
        e11.append(z5);
        e11.append(", isRequired=");
        e11.append(z11);
        e11.append(", pictures=");
        e11.append(devicePictures);
        e11.append(")");
        return e11.toString();
    }
}
