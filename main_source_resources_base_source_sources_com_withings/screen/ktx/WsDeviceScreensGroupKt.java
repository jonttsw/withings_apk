package com.withings.screen.ktx;

import com.withings.screen.model.WsDeviceScreensGroup;
import com.withings.screen.repository.data.model.DeviceScreensGroupEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: WsDeviceScreensGroup.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"toDeviceScreensGroupEntity", "Lcom/withings/screen/repository/data/model/DeviceScreensGroupEntity;", "Lcom/withings/screen/model/WsDeviceScreensGroup;", "deviceId", "", "android_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsDeviceScreensGroupKt {
    public static final DeviceScreensGroupEntity toDeviceScreensGroupEntity(WsDeviceScreensGroup wsDeviceScreensGroup, long j5) {
        u.j(wsDeviceScreensGroup, "<this>");
        return new DeviceScreensGroupEntity(wsDeviceScreensGroup.getId(), wsDeviceScreensGroup.getName(), new DateTime(wsDeviceScreensGroup.getModified() * 1000), j5, wsDeviceScreensGroup.getDeleted(), wsDeviceScreensGroup.getRank());
    }
}
