package com.withings.wiscale2.device.common.notifications.ui;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.device.Device;
import com.withings.wiscale2.device.common.notifications.ui.m;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class s0 extends kotlin.jvm.internal.w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m.f f53011a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(m.f fVar) {
        super(0);
        this.f53011a = fVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        m.f fVar = this.f53011a;
        fVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Fragment fragment = fVar.f52964b;
        if (isAssignableFrom) {
            return (Device) yq.b.d(fragment, "device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) yq.b.e(fragment, "device");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra device of class ", kotlin.jvm.internal.q0.b(Device.class), " is not supported"));
    }
}
