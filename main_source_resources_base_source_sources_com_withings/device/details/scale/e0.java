package com.withings.device.details.scale;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.device.Device;
import com.withings.device.details.scale.c0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Fragment.kt */
/* loaded from: classes3.dex */
public final class e0 extends kotlin.jvm.internal.w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c0.c f36933a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(c0.c cVar) {
        super(0);
        this.f36933a = cVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        c0.c cVar = this.f36933a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Fragment fragment = cVar.f36921b;
        if (isAssignableFrom) {
            return (Device) yq.b.d(fragment, "EXTRA_DEVICE");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) yq.b.e(fragment, "EXTRA_DEVICE");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_DEVICE of class ", q0.b(Device.class), " is not supported"));
    }
}
