package com.withings.wiscale2.device.common.notifications.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.device.Device;
import com.withings.wiscale2.device.common.notifications.ui.DeviceNotificationSettingsActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DeviceNotificationSettingsActivity.e f52854a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DeviceNotificationSettingsActivity.e eVar) {
        super(0);
        this.f52854a = eVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        DeviceNotificationSettingsActivity.e eVar = this.f52854a;
        eVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = eVar.f52818b;
        if (isAssignableFrom) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "device");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra device of class ", kotlin.jvm.internal.q0.b(Device.class), " is not supported"));
    }
}
