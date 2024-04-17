package com.withings.wiscale2.device.common.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.device.Device;
import com.withings.wiscale2.device.common.ui.DeviceBrightnessActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DeviceBrightnessActivity.d f54132a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(DeviceBrightnessActivity.d dVar) {
        super(0);
        this.f54132a = dVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        DeviceBrightnessActivity.d dVar = this.f54132a;
        dVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = dVar.f53675b;
        if (isAssignableFrom) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "EXTRA_DEVICE");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "EXTRA_DEVICE");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_DEVICE of class ", kotlin.jvm.internal.q0.b(Device.class), " is not supported"));
    }
}
