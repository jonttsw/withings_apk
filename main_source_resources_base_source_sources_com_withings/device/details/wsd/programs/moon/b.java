package com.withings.device.details.wsd.programs.moon;

import android.app.Activity;
import android.os.Parcelable;
import androidx.work.impl.g;
import com.withings.device.Device;
import com.withings.device.details.wsd.programs.moon.WsdMoodLightActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class b extends w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WsdMoodLightActivity.e f37223a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(WsdMoodLightActivity.e eVar) {
        super(0);
        this.f37223a = eVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        WsdMoodLightActivity.e eVar = this.f37223a;
        eVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = eVar.f37221b;
        if (isAssignableFrom) {
            return (Device) b0.F(activity, "device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) b0.H(activity, "device");
        }
        throw new IllegalArgumentException(g.a("extra device of class ", q0.b(Device.class), " is not supported"));
    }
}
