package com.withings.common.device;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.common.device.j;
import com.withings.device.Device;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Fragment.kt */
/* loaded from: classes3.dex */
public final class k extends w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j.l f35213a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j.l lVar) {
        super(0);
        this.f35213a = lVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        j.l lVar = this.f35213a;
        lVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Fragment fragment = lVar.f35212b;
        if (isAssignableFrom) {
            return (Device) yq.b.d(fragment, "device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) yq.b.e(fragment, "device");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra device of class ", q0.b(Device.class), " is not supported"));
    }
}
