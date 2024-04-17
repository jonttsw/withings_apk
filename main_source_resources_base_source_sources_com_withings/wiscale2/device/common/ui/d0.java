package com.withings.wiscale2.device.common.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.device.common.ui.DeviceInfoActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.w implements ym0.a<nn.i> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DeviceInfoActivity.e f53789a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(DeviceInfoActivity.e eVar) {
        super(0);
        this.f53789a = eVar;
    }

    @Override // ym0.a
    public final nn.i invoke() {
        DeviceInfoActivity.e eVar = this.f53789a;
        eVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(nn.i.class);
        Activity activity = eVar.f53687b;
        if (isAssignableFrom) {
            return (nn.i) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "device_info");
        }
        if (Serializable.class.isAssignableFrom(nn.i.class)) {
            return (nn.i) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "device_info");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra device_info of class ", kotlin.jvm.internal.q0.b(nn.i.class), " is not supported"));
    }
}
