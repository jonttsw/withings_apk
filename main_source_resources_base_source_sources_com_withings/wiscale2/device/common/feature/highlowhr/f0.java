package com.withings.wiscale2.device.common.feature.highlowhr;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.device.Device;
import com.withings.wiscale2.device.common.feature.highlowhr.HighLowHRSettingsActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HighLowHRSettingsActivity.e f52270a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(HighLowHRSettingsActivity.e eVar) {
        super(0);
        this.f52270a = eVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        HighLowHRSettingsActivity.e eVar = this.f52270a;
        eVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = eVar.f52208b;
        if (isAssignableFrom) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "EXTRA_DEVICE");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "EXTRA_DEVICE");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_DEVICE of class ", q0.b(Device.class), " is not supported"));
    }
}
