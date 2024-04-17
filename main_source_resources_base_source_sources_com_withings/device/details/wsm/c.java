package com.withings.device.details.wsm;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.device.Device;
import com.withings.device.details.wsm.SoundSensorActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class c extends w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SoundSensorActivity.c f37315a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SoundSensorActivity.c cVar) {
        super(0);
        this.f37315a = cVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        SoundSensorActivity.c cVar = this.f37315a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = cVar.f37310b;
        if (isAssignableFrom) {
            return (Device) b0.F(activity, "EXTRA_DEVICE");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) b0.H(activity, "EXTRA_DEVICE");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_DEVICE of class ", q0.b(Device.class), " is not supported"));
    }
}
