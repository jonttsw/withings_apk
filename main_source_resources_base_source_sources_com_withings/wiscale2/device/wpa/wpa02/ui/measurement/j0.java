package com.withings.wiscale2.device.wpa.wpa02.ui.measurement;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.device.Device;
import com.withings.wiscale2.device.wpa.wpa02.ui.measurement.Wpa02LaunchMeasurementActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class j0 extends kotlin.jvm.internal.w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpa02LaunchMeasurementActivity.s f55560a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Wpa02LaunchMeasurementActivity.s sVar) {
        super(0);
        this.f55560a = sVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        Wpa02LaunchMeasurementActivity.s sVar = this.f55560a;
        sVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = sVar.f55517b;
        if (isAssignableFrom) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "extra_device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "extra_device");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_device of class ", q0.b(Device.class), " is not supported"));
    }
}
