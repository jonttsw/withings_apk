package com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.device.Device;
import com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet.Wpa02ToiletInstallationActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class y0 extends kotlin.jvm.internal.w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpa02ToiletInstallationActivity.b f55466a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(Wpa02ToiletInstallationActivity.b bVar) {
        super(0);
        this.f55466a = bVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        Wpa02ToiletInstallationActivity.b bVar = this.f55466a;
        bVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = bVar.f55343b;
        if (isAssignableFrom) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "extra_device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "extra_device");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_device of class ", kotlin.jvm.internal.q0.b(Device.class), " is not supported"));
    }
}
