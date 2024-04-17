package com.withings.wiscale2.device.hwa06.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.device.Device;
import com.withings.wiscale2.device.hwa06.ui.Hwa06PostInstallActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa06PostInstallActivity.c f54368a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Hwa06PostInstallActivity.c cVar) {
        super(0);
        this.f54368a = cVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        Hwa06PostInstallActivity.c cVar = this.f54368a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = cVar.f54329b;
        if (isAssignableFrom) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "extra_device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "extra_device");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_device of class ", q0.b(Device.class), " is not supported"));
    }
}
