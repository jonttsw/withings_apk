package com.withings.wiscale2.device.wpm.wpm04.ui;

import android.app.Activity;
import android.os.Parcelable;
import androidx.work.impl.g;
import com.withings.device.Device;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import com.withings.wiscale2.device.wpm.wpm04.ui.Wpm04PostInstallActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class b extends w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpm04PostInstallActivity.a f55892a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Wpm04PostInstallActivity.a aVar) {
        super(0);
        this.f55892a = aVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        Wpm04PostInstallActivity.a aVar = this.f55892a;
        aVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = aVar.f55890b;
        if (isAssignableFrom) {
            return (Device) b0.F(activity, "extra_device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) b0.H(activity, "extra_device");
        }
        throw new IllegalArgumentException(g.a("extra extra_device of class ", q0.b(Device.class), " is not supported"));
    }
}
