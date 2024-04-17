package com.withings.common.device;

import android.content.Context;
import android.os.Parcelable;
import com.withings.device.Device;
import kotlin.Metadata;
/* compiled from: TutorialStateListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/withings/common/device/TutorialStateListener;", "Landroid/os/Parcelable;", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface TutorialStateListener extends Parcelable {
    void N(Context context, Device device);
}
