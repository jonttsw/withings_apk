package com.withings.screen.ktx;

import com.withings.screen.model.WsDeviceScreenImage;
import com.withings.screen.repository.data.model.DeviceScreenEntityImage;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsDeviceScreenImage.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toDeviceScreenImage", "Lcom/withings/screen/repository/data/model/DeviceScreenEntityImage;", "Lcom/withings/screen/model/WsDeviceScreenImage;", "android_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsDeviceScreenImageKt {
    public static final DeviceScreenEntityImage toDeviceScreenImage(WsDeviceScreenImage wsDeviceScreenImage) {
        u.j(wsDeviceScreenImage, "<this>");
        return new DeviceScreenEntityImage(wsDeviceScreenImage.getImageType(), wsDeviceScreenImage.getImageData(), wsDeviceScreenImage.getImageHeight(), wsDeviceScreenImage.getImageWidth());
    }
}
