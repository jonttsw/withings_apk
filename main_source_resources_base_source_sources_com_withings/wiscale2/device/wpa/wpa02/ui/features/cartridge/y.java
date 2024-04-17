package com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.device.Device;
import com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.Wpa02CartridgeActivationActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpa02CartridgeActivationActivity.b f55216a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Wpa02CartridgeActivationActivity.b bVar) {
        super(0);
        this.f55216a = bVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        Wpa02CartridgeActivationActivity.b bVar = this.f55216a;
        bVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = bVar.f55117b;
        if (isAssignableFrom) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "extra_device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "extra_device");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_device of class ", q0.b(Device.class), " is not supported"));
    }
}
