package com.withings.wiscale2.device.common.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.device.DeviceModel;
import com.withings.wiscale2.device.common.ui.DeviceSharingActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class o0 extends kotlin.jvm.internal.w implements ym0.a<DeviceModel> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DeviceSharingActivity.d f54034a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(DeviceSharingActivity.d dVar) {
        super(0);
        this.f54034a = dVar;
    }

    @Override // ym0.a
    public final DeviceModel invoke() {
        DeviceSharingActivity.d dVar = this.f54034a;
        dVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DeviceModel.class);
        Activity activity = dVar.f53703b;
        if (isAssignableFrom) {
            return (DeviceModel) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "EXTRA_DEVICE_MODEL");
        }
        if (Serializable.class.isAssignableFrom(DeviceModel.class)) {
            return (DeviceModel) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "EXTRA_DEVICE_MODEL");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_DEVICE_MODEL of class ", kotlin.jvm.internal.q0.b(DeviceModel.class), " is not supported"));
    }
}
