package com.withings.wiscale2.device.common.ui;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.device.Device;
import com.withings.wiscale2.device.common.ui.y0;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class g1 extends kotlin.jvm.internal.w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y0.b f53814a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(y0.b bVar) {
        super(0);
        this.f53814a = bVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        y0.b bVar = this.f53814a;
        bVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Fragment fragment = bVar.f54130b;
        if (isAssignableFrom) {
            return (Device) yq.b.d(fragment, "arg_device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) yq.b.e(fragment, "arg_device");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra arg_device of class ", kotlin.jvm.internal.q0.b(Device.class), " is not supported"));
    }
}
