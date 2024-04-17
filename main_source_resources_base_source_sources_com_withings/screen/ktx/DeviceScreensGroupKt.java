package com.withings.screen.ktx;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.screen.model.DeviceScreen;
import com.withings.screen.model.DeviceScreensGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: DeviceScreensGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"asSyncedWithWs", "Lcom/withings/screen/model/DeviceScreensGroup;", "modified", "Lorg/joda/time/DateTime;", "core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceScreensGroupKt {
    public static final DeviceScreensGroup asSyncedWithWs(DeviceScreensGroup deviceScreensGroup, DateTime modified) {
        u.j(deviceScreensGroup, "<this>");
        u.j(modified, "modified");
        List<DeviceScreen> screens = deviceScreensGroup.getScreens();
        ArrayList arrayList = new ArrayList(x.y(screens, 10));
        for (DeviceScreen deviceScreen : screens) {
            ArrayList arrayList2 = arrayList;
            arrayList2.add(DeviceScreen.copy$default(deviceScreen, 0L, 0L, null, null, null, false, false, 0, null, DeviceScreen.MetaData.copy$default(deviceScreen.getMetaData(), 0L, 0L, null, null, null, null, 0, null, null, modified, true, false, ConstantsWs.WS_STATUS_NOLONGEREXISTS, null), 511, null));
            arrayList = arrayList2;
        }
        return DeviceScreensGroup.copy$default(deviceScreensGroup, 0L, null, arrayList, null, 0L, 27, null);
    }
}
