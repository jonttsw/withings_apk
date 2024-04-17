package com.withings.common.device;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.common.device.DeviceSettingsActivity;
import com.withings.device.Device;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class o extends w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DeviceSettingsActivity.j f35231a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(DeviceSettingsActivity.j jVar) {
        super(0);
        this.f35231a = jVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        DeviceSettingsActivity.j jVar = this.f35231a;
        jVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = jVar.f35029b;
        if (isAssignableFrom) {
            return (Device) b0.F(activity, "device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) b0.H(activity, "device");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra device of class ", q0.b(Device.class), " is not supported"));
    }
}
