package com.withings.screen.ktx;

import com.withings.screen.model.DeviceScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import ym0.p;
/* compiled from: DeviceScreenEntity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/withings/screen/model/DeviceScreen$DefaultValues;", "defaultActive", "", "defaultRank", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DeviceScreenEntityKt$toDeviceScreen$4 extends w implements p<Boolean, Integer, DeviceScreen.DefaultValues> {
    public static final DeviceScreenEntityKt$toDeviceScreen$4 INSTANCE = new DeviceScreenEntityKt$toDeviceScreen$4();

    DeviceScreenEntityKt$toDeviceScreen$4() {
        super(2);
    }

    public final DeviceScreen.DefaultValues invoke(boolean z5, int i11) {
        return new DeviceScreen.DefaultValues(z5, i11);
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ DeviceScreen.DefaultValues invoke(Boolean bool, Integer num) {
        return invoke(bool.booleanValue(), num.intValue());
    }
}
