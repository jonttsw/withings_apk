package com.withings.tutorials.ui.screens.howtouse;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.device.Device;
import com.withings.tutorials.ui.screens.howtouse.HowToTakeAMeasurementActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HowToTakeAMeasurementActivity.b f45411a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(HowToTakeAMeasurementActivity.b bVar) {
        super(0);
        this.f45411a = bVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        HowToTakeAMeasurementActivity.b bVar = this.f45411a;
        bVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = bVar.f45355b;
        if (isAssignableFrom) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "device");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra device of class ", q0.b(Device.class), " is not supported"));
    }
}
