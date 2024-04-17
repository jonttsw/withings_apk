package com.withings.wiscale2.device.wam02.ui;

import android.app.Activity;
import android.os.Parcelable;
import androidx.work.impl.g;
import com.withings.device.Device;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import com.withings.wiscale2.device.wam02.ui.Wam02AutoSleepActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class a extends w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wam02AutoSleepActivity.c f54901a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Wam02AutoSleepActivity.c cVar) {
        super(0);
        this.f54901a = cVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        Wam02AutoSleepActivity.c cVar = this.f54901a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = cVar.f54885b;
        if (isAssignableFrom) {
            return (Device) b0.F(activity, "EXTRA_DEVICE");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) b0.H(activity, "EXTRA_DEVICE");
        }
        throw new IllegalArgumentException(g.a("extra EXTRA_DEVICE of class ", q0.b(Device.class), " is not supported"));
    }
}
