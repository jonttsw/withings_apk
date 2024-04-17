package com.withings.wiscale2.device.common.feature.spo2;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.device.Device;
import com.withings.wiscale2.device.common.feature.spo2.SpO2SettingsActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class e extends w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SpO2SettingsActivity.e f52527a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SpO2SettingsActivity.e eVar) {
        super(0);
        this.f52527a = eVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        SpO2SettingsActivity.e eVar = this.f52527a;
        eVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = eVar.f52506b;
        if (isAssignableFrom) {
            return (Device) b0.F(activity, "device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) b0.H(activity, "device");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra device of class ", q0.b(Device.class), " is not supported"));
    }
}
