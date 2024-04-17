package com.withings.screen.ktx;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.screen.model.WsDeviceScreen;
import com.withings.screen.model.WsDeviceScreenImage;
import com.withings.screen.repository.data.model.DeviceScreenEntity;
import com.withings.screen.repository.data.model.DeviceScreenEntityImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsDeviceScreen.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"toDeviceScreenEntity", "Lcom/withings/screen/repository/data/model/DeviceScreenEntity;", "Lcom/withings/screen/model/WsDeviceScreen;", NavigationArguments.USER_ID, "", "deviceId", "android_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsDeviceScreenKt {
    public static final DeviceScreenEntity toDeviceScreenEntity(WsDeviceScreen wsDeviceScreen, long j5, long j11) {
        DeviceScreenEntityImage deviceScreenEntityImage;
        ArrayList arrayList;
        DeviceScreenEntityImage deviceScreenEntityImage2;
        u.j(wsDeviceScreen, "<this>");
        long wsId = wsDeviceScreen.getWsId();
        String name = wsDeviceScreen.getName();
        if (name == null) {
            name = "";
        }
        String str = name;
        int source = wsDeviceScreen.getSource();
        WsDeviceScreenImage image = wsDeviceScreen.getImage();
        if (image != null) {
            deviceScreenEntityImage = WsDeviceScreenImageKt.toDeviceScreenImage(image);
        } else {
            deviceScreenEntityImage = null;
        }
        List<WsDeviceScreenImage> images = wsDeviceScreen.getImages();
        if (images != null) {
            ArrayList arrayList2 = new ArrayList();
            for (WsDeviceScreenImage wsDeviceScreenImage : images) {
                if (wsDeviceScreenImage != null) {
                    deviceScreenEntityImage2 = WsDeviceScreenImageKt.toDeviceScreenImage(wsDeviceScreenImage);
                } else {
                    deviceScreenEntityImage2 = null;
                }
                if (deviceScreenEntityImage2 != null) {
                    arrayList2.add(deviceScreenEntityImage2);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new DeviceScreenEntity(0L, wsId, str, j11, j5, source, deviceScreenEntityImage, arrayList, wsDeviceScreen.getEmbeddedId(), wsDeviceScreen.getRank(), wsDeviceScreen.getActive(), wsDeviceScreen.getDeactivableStatus(), wsDeviceScreen.getParentId(), ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_DEVICE_SCREENS, true, false, wsDeviceScreen.getModified() * 1000, wsDeviceScreen.getStartDate(), wsDeviceScreen.getEndDate(), wsDeviceScreen.getAppDependencies(), wsDeviceScreen.getDefaultActive(), wsDeviceScreen.getDefaultRank(), wsDeviceScreen.getGroup(), wsDeviceScreen.getRequiredActivatedFeatureIds(), wsDeviceScreen.getFixedPosition());
    }
}
