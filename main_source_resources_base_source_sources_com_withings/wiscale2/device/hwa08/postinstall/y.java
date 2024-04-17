package com.withings.wiscale2.device.hwa08.postinstall;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.device.Device;
import com.withings.wiscale2.device.hwa08.postinstall.Hwa08PostInstallActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa08PostInstallActivity.e f54479a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Hwa08PostInstallActivity.e eVar) {
        super(0);
        this.f54479a = eVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        Hwa08PostInstallActivity.e eVar = this.f54479a;
        eVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = eVar.f54421b;
        if (isAssignableFrom) {
            return (Device) b0.F(activity, "extra_device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) b0.H(activity, "extra_device");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_device of class ", q0.b(Device.class), " is not supported"));
    }
}
