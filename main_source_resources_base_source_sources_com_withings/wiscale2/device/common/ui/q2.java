package com.withings.wiscale2.device.common.ui;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.device.Device;
import com.withings.wiscale2.device.common.ui.p2;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class q2 extends kotlin.jvm.internal.w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p2.c f54063a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(p2.c cVar) {
        super(0);
        this.f54063a = cVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        p2.c cVar = this.f54063a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Fragment fragment = cVar.f54060b;
        if (isAssignableFrom) {
            return (Device) yq.b.d(fragment, "key_device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) yq.b.e(fragment, "key_device");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra key_device of class ", kotlin.jvm.internal.q0.b(Device.class), " is not supported"));
    }
}
