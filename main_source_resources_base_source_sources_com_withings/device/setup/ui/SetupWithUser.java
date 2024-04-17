package com.withings.device.setup.ui;

import com.withings.devicesetup.Setup;
import com.withings.user.User;
import kotlin.Metadata;
/* compiled from: SetupWithUser.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/withings/device/setup/ui/SetupWithUser;", "Lcom/withings/devicesetup/Setup;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface SetupWithUser extends Setup {
    int getDeviceType();

    boolean j2();

    void m0(User user);

    int s1();
}
