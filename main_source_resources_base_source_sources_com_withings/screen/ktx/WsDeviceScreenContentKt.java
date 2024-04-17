package com.withings.screen.ktx;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.screen.model.WsDeviceScreenContent;
import com.withings.screen.repository.data.model.DeviceScreenContentEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsDeviceScreenContent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"toDeviceScreenContentEntity", "Lcom/withings/screen/repository/data/model/DeviceScreenContentEntity;", "Lcom/withings/screen/model/WsDeviceScreenContent;", "screenId", "", NavigationArguments.USER_ID, "deviceId", "android_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsDeviceScreenContentKt {
    public static final DeviceScreenContentEntity toDeviceScreenContentEntity(WsDeviceScreenContent wsDeviceScreenContent, long j5, long j11, long j12) {
        Long l5;
        Long l6;
        u.j(wsDeviceScreenContent, "<this>");
        int style = wsDeviceScreenContent.getStyle();
        String message = wsDeviceScreenContent.getMessage();
        Long startDate = wsDeviceScreenContent.getStartDate();
        if (startDate != null) {
            l5 = Long.valueOf(startDate.longValue() * 1000);
        } else {
            l5 = null;
        }
        Long endDate = wsDeviceScreenContent.getEndDate();
        if (endDate != null) {
            l6 = Long.valueOf(endDate.longValue() * 1000);
        } else {
            l6 = null;
        }
        return new DeviceScreenContentEntity(0L, j12, j11, j5, style, message, l5, l6, wsDeviceScreenContent.getModified() * 1000, false);
    }
}
