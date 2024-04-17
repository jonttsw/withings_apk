package com.withings.screen.ktx;

import com.withings.screen.model.DeviceScreen;
import com.withings.screen.repository.data.model.DeviceScreenEntityImage;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: DeviceScreenEntity.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b¨\u0006\t"}, d2 = {"toDeviceScreen", "Lcom/withings/screen/model/DeviceScreen;", "Lcom/withings/screen/repository/data/model/DeviceScreenEntity;", "contents", "", "Lcom/withings/screen/model/DeviceScreen$Content;", "toDeviceScreenImage", "Lcom/withings/screen/model/DeviceScreen$Image;", "Lcom/withings/screen/repository/data/model/DeviceScreenEntityImage;", "android_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceScreenEntityKt {
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.withings.screen.model.DeviceScreen toDeviceScreen(com.withings.screen.repository.data.model.DeviceScreenEntity r32, java.util.List<com.withings.screen.model.DeviceScreen.Content> r33) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.screen.ktx.DeviceScreenEntityKt.toDeviceScreen(com.withings.screen.repository.data.model.DeviceScreenEntity, java.util.List):com.withings.screen.model.DeviceScreen");
    }

    public static final DeviceScreen.Image toDeviceScreenImage(DeviceScreenEntityImage deviceScreenEntityImage) {
        u.j(deviceScreenEntityImage, "<this>");
        Integer imageType = deviceScreenEntityImage.getImageType();
        if (imageType == null) {
            return null;
        }
        int intValue = imageType.intValue();
        Integer imageHeight = deviceScreenEntityImage.getImageHeight();
        if (imageHeight == null) {
            return null;
        }
        int intValue2 = imageHeight.intValue();
        Integer imageWidth = deviceScreenEntityImage.getImageWidth();
        if (imageWidth == null) {
            return null;
        }
        int intValue3 = imageWidth.intValue();
        String imageData = deviceScreenEntityImage.getImageData();
        if (imageData == null) {
            return null;
        }
        return new DeviceScreen.Image(intValue, intValue2, intValue3, imageData);
    }
}
