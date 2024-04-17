package com.withings.device.details.elabel;

import android.app.Activity;
import android.os.Parcelable;
import androidx.work.impl.g;
import com.withings.device.Device;
import com.withings.device.details.elabel.ElabelDeviceActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class c extends w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ElabelDeviceActivity.c f36812a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ElabelDeviceActivity.c cVar) {
        super(0);
        this.f36812a = cVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        ElabelDeviceActivity.c cVar = this.f36812a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = cVar.f36798b;
        if (isAssignableFrom) {
            return (Device) b0.F(activity, "device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) b0.H(activity, "device");
        }
        throw new IllegalArgumentException(g.a("extra device of class ", q0.b(Device.class), " is not supported"));
    }
}
