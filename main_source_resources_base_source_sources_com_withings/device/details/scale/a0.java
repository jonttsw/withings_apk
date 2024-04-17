package com.withings.device.details.scale;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.device.Device;
import com.withings.device.details.scale.ScaleSharingActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class a0 extends kotlin.jvm.internal.w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ScaleSharingActivity.b f36906a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ScaleSharingActivity.b bVar) {
        super(0);
        this.f36906a = bVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        ScaleSharingActivity.b bVar = this.f36906a;
        bVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = bVar.f36898b;
        if (isAssignableFrom) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "EXTRA_DEVICE");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "EXTRA_DEVICE");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_DEVICE of class ", q0.b(Device.class), " is not supported"));
    }
}
