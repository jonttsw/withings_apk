package com.withings.wiscale2.device.common.feature.ecg;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.device.Device;
import com.withings.wiscale2.device.common.feature.ecg.EcgSettingsActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class m5 extends kotlin.jvm.internal.w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgSettingsActivity.f f51519a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(EcgSettingsActivity.f fVar) {
        super(0);
        this.f51519a = fVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        EcgSettingsActivity.f fVar = this.f51519a;
        fVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = fVar.f51090b;
        if (isAssignableFrom) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "device");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra device of class ", kotlin.jvm.internal.q0.b(Device.class), " is not supported"));
    }
}
