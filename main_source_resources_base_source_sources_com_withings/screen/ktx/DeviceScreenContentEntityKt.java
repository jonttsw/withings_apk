package com.withings.screen.ktx;

import com.withings.screen.model.DeviceScreen;
import com.withings.screen.repository.data.model.DeviceScreenContentEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: DeviceScreenContentEntity.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toDeviceScreenContent", "Lcom/withings/screen/model/DeviceScreen$Content;", "Lcom/withings/screen/repository/data/model/DeviceScreenContentEntity;", "android_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceScreenContentEntityKt {
    public static final DeviceScreen.Content toDeviceScreenContent(DeviceScreenContentEntity deviceScreenContentEntity) {
        DateTime dateTime;
        u.j(deviceScreenContentEntity, "<this>");
        int displayStyle = deviceScreenContentEntity.getDisplayStyle();
        String message = deviceScreenContentEntity.getMessage();
        Long startDate = deviceScreenContentEntity.getStartDate();
        DateTime dateTime2 = null;
        if (startDate != null) {
            dateTime = new DateTime(startDate.longValue());
        } else {
            dateTime = null;
        }
        Long endDate = deviceScreenContentEntity.getEndDate();
        if (endDate != null) {
            dateTime2 = new DateTime(endDate.longValue());
        }
        return new DeviceScreen.Content(displayStyle, message, new DeviceScreen.Content.MetaData(dateTime, dateTime2, new DateTime(deviceScreenContentEntity.getModified())));
    }
}
